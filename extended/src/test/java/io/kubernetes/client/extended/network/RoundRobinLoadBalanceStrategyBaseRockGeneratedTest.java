package io.kubernetes.client.extended.network;

import org.junit.jupiter.api.Timeout;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.Arguments;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class RoundRobinLoadBalanceStrategyBaseRockGeneratedTest {

    private RoundRobinLoadBalanceStrategy strategy;

    @BeforeEach
    void setUp() {
        strategy = new RoundRobinLoadBalanceStrategy();
    }

    //BaseRock generated method id: ${testChooseIP_withSingleIP}, hash: 181626010AEFA03EF0B9F4C9D14C81F0
    @Test
    void testChooseIP_withSingleIP() {
        List<String> ips = Collections.singletonList("192.168.0.1");
        String result = strategy.chooseIP(ips);
        assertEquals("192.168.0.1", result);
    }

    //BaseRock generated method id: ${testChooseIP_withMultipleIPs}, hash: 0FCF9F545432BB181EBB92C423C8FACD
    @ParameterizedTest
    @MethodSource("provideMultipleIPs")
    void testChooseIP_withMultipleIPs(List<String> ips) {
        String firstResult = strategy.chooseIP(ips);
        assertTrue(ips.contains(firstResult));
        String secondResult = strategy.chooseIP(ips);
        assertTrue(ips.contains(secondResult));
        assertNotEquals(firstResult, secondResult, "Expected different IPs to be chosen in consecutive calls");
    }

    private static Stream<Arguments> provideMultipleIPs() {
        return Stream.of(Arguments.of(Arrays.asList("192.168.0.1", "192.168.0.2")), Arguments.of(Arrays.asList("10.0.0.1", "10.0.0.2", "10.0.0.3")));
    }

    //BaseRock generated method id: ${testChooseIP_roundRobinBehavior}, hash: 4D19ADA2504592F1FDC6911AECD5E6CD
    @Test
    void testChooseIP_roundRobinBehavior() {
        List<String> ips = Arrays.asList("192.168.0.1", "192.168.0.2", "192.168.0.3");
        assertEquals("192.168.0.1", strategy.chooseIP(ips));
        assertEquals("192.168.0.2", strategy.chooseIP(ips));
        assertEquals("192.168.0.3", strategy.chooseIP(ips));
        assertEquals("192.168.0.1", strategy.chooseIP(ips));
    }

    //BaseRock generated method id: ${testChooseIP_withEmptyList}, hash: 48484A6C45C75AFABB8216C05D1AC491
    @Test
    void testChooseIP_withEmptyList() {
        List<String> emptyList = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> strategy.chooseIP(emptyList));
    }

    //BaseRock generated method id: ${testChooseIP_withNullList}, hash: 0490C732500B248DFA0304C5E9A07C39
    @Test
    void testChooseIP_withNullList() {
        assertThrows(IllegalArgumentException.class, () -> strategy.chooseIP(null));
    }

    //BaseRock generated method id: ${testChooseIP_concurrency}, hash: 00A8711125D030BC1A651C776C6BA304
    @Test
    void testChooseIP_concurrency() throws InterruptedException {
        List<String> ips = Arrays.asList("192.168.0.1", "192.168.0.2", "192.168.0.3");
        int numberOfThreads = 1000;
        List<String> results = Collections.synchronizedList(new ArrayList<>());
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < numberOfThreads; i++) {
            Thread thread = new Thread(() -> results.add(strategy.chooseIP(ips)));
            threads.add(thread);
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        assertEquals(numberOfThreads, results.size());
        assertTrue(results.containsAll(ips));
    }
}

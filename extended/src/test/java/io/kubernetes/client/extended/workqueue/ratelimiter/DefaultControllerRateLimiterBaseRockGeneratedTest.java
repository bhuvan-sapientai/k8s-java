package io.kubernetes.client.extended.workqueue.ratelimiter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import java.time.Duration;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class DefaultControllerRateLimiterBaseRockGeneratedTest {

    @Mock
    private RateLimiter<String> mockInternalRateLimiter;

    private DefaultControllerRateLimiter<String> rateLimiter;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        rateLimiter = new DefaultControllerRateLimiter<>();
    }

    //BaseRock generated method id: ${testWhen}, hash: F17AA67E298D5252FEF6E37CAEE15361
    @Test
    void testWhen() {
        String item = "testItem";
        Duration expectedDuration = Duration.ofSeconds(5);
        when(mockInternalRateLimiter.when(item)).thenReturn(expectedDuration);
        rateLimiter = new DefaultControllerRateLimiter<String>() {

            @Override
            public Duration when(String item) {
                return mockInternalRateLimiter.when(item);
            }
        };
        Duration result = rateLimiter.when(item);
        assertThat(result, is(equalTo(expectedDuration)));
        verify(mockInternalRateLimiter, times(1)).when(item);
    }

    //BaseRock generated method id: ${testForget}, hash: 6B01AC616C25E1F278A2C7511AB1863D
    @Test
    void testForget() {
        String item = "testItem";
        rateLimiter = new DefaultControllerRateLimiter<String>() {

            @Override
            public void forget(String item) {
                mockInternalRateLimiter.forget(item);
            }
        };
        rateLimiter.forget(item);
        verify(mockInternalRateLimiter, times(1)).forget(item);
    }

    //BaseRock generated method id: ${testNumRequeues}, hash: 8B2A568497700F81A9C816380108B712
    @Test
    void testNumRequeues() {
        String item = "testItem";
        int expectedRequeues = 3;
        when(mockInternalRateLimiter.numRequeues(item)).thenReturn(expectedRequeues);
        rateLimiter = new DefaultControllerRateLimiter<String>() {

            @Override
            public int numRequeues(String item) {
                return mockInternalRateLimiter.numRequeues(item);
            }
        };
        int result = rateLimiter.numRequeues(item);
        assertThat(result, is(equalTo(expectedRequeues)));
        verify(mockInternalRateLimiter, times(1)).numRequeues(item);
    }

    //BaseRock generated method id: ${testDefaultConstructor}, hash: 88FC050A97F29452DA35E7F1582C793F
    @Test
    void testDefaultConstructor() {
        DefaultControllerRateLimiter<String> defaultRateLimiter = new DefaultControllerRateLimiter<>();
        assertThat(defaultRateLimiter, is(notNullValue()));
    }

    //BaseRock generated method id: ${testInternalRateLimiterConfiguration}, hash: D2A52078F55B9C80BC244D3641F5D86E
    @Test
    void testInternalRateLimiterConfiguration() {
        DefaultControllerRateLimiter<String> defaultRateLimiter = new DefaultControllerRateLimiter<>();
        assertThat(defaultRateLimiter, is(notNullValue()));
    }
}

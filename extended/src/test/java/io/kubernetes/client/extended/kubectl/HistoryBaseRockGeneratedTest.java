package io.kubernetes.client.extended.kubectl;

import org.junit.jupiter.api.Timeout;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.MethodSource;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.Arguments;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class HistoryBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructorAndGetters}, hash: 56BEB13808077A2EF305D4028C0432A9
    @Test
    void testConstructorAndGetters() {
        long revision = 1L;
        String changeCause = "Initial deployment";
        History history = new History(revision, changeCause);
        assertEquals(revision, history.getRevision());
        assertEquals(changeCause, history.getChangeCause());
    }

    //BaseRock generated method id: ${testConstructorAndGettersWithDifferentValues}, hash: 0DC2A8531CA0E6697073CADB64EC6040
    @ParameterizedTest
    @MethodSource("provideHistoryData")
    void testConstructorAndGettersWithDifferentValues(long revision, String changeCause) {
        History history = new History(revision, changeCause);
        assertEquals(revision, history.getRevision());
        assertEquals(changeCause, history.getChangeCause());
    }

    private static Stream<Arguments> provideHistoryData() {
        return Stream.of(Arguments.of(0L, ""), Arguments.of(Long.MAX_VALUE, "Maximum revision"), Arguments.of(Long.MIN_VALUE, "Minimum revision"), Arguments.of(100L, null));
    }

    //BaseRock generated method id: ${testToString}, hash: 968FD91C0F69B35A237A0EA9F33E7D60
    @Test
    void testToString() {
        History history = new History(5L, "Update configuration");
        String expected = "{revision :5, changeCause :Update configuration}";
        assertEquals(expected, history.toString());
    }

    //BaseRock generated method id: ${testToStringWithDifferentRevisions}, hash: 3AFCF260512E2449DF0A8B444BD6B0FA
    @ParameterizedTest
    @ValueSource(longs = { 0L, 1L, Long.MAX_VALUE, Long.MIN_VALUE })
    void testToStringWithDifferentRevisions(long revision) {
        String changeCause = "Test change";
        History history = new History(revision, changeCause);
        String expected = "{revision :" + revision + ", changeCause :" + changeCause + "}";
        assertEquals(expected, history.toString());
    }

    //BaseRock generated method id: ${testToStringWithNullChangeCause}, hash: 0C23E5270C7536433BB43BBF8A7E96B7
    @Test
    void testToStringWithNullChangeCause() {
        History history = new History(10L, null);
        String expected = "{revision :10, changeCause :null}";
        assertEquals(expected, history.toString());
    }

    //BaseRock generated method id: ${testHistoryCreation}, hash: 76D9FF3A709F06F0A4CB21B5772DAC11
    @Test
    void testHistoryCreation() {
        History history = new History(1L, "Test");
        assertNotNull(history);
    }
}

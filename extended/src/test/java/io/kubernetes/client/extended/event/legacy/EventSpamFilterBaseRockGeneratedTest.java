package io.kubernetes.client.extended.event.legacy;

// import io.github.bucket4j.Bucket;
// import org.junit.jupiter.api.BeforeEach;
// import io.github.bucket4j.local.LocalBucket;
// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.params.ParameterizedTest;
// import org.junit.jupiter.api.Timeout;
// import io.kubernetes.client.openapi.models.CoreV1Event;
// import com.github.benmanes.caffeine.cache.Caffeine;
// import static org.hamcrest.MatcherAssert.assertThat;
// import java.util.function.Function;
// import static org.hamcrest.Matchers.*;
// import org.junit.jupiter.params.provider.ValueSource;
// import java.time.Duration;
// import static org.mockito.Mockito.*;
// import org.mockito.MockedStatic;
// import com.github.benmanes.caffeine.cache.Cache;
// import static org.hamcrest.Matchers.startsWith;
// import static org.hamcrest.Matchers.endsWith;
// import static org.mockito.ArgumentMatchers.any;
// import static org.mockito.ArgumentMatchers.eq;

// @Timeout(10)
class EventSpamFilterBaseRockGeneratedTest {

//     private EventSpamFilter eventSpamFilter;

//     private Function<CoreV1Event, String> spamKeyFunc;

//     private Cache<String, EventSpamFilter.SpamRecord> spamRecordCache;

//     @BeforeEach
//     void setUp() {
//         spamKeyFunc = mock(Function.class);
//         spamRecordCache = mock(Cache.class);
//         try (MockedStatic<Caffeine> mockedCaffeine = mockStatic(Caffeine.class)) {
//             Caffeine caffeine = mock(Caffeine.class);
//             mockedCaffeine.when(Caffeine::newBuilder).thenReturn(caffeine);
//             when(caffeine.maximumSize(anyLong())).thenReturn(caffeine);
//             when(caffeine.build()).thenReturn(spamRecordCache);
//             eventSpamFilter = new EventSpamFilter(100, spamKeyFunc);
//         }
//     }

//     //BaseRock generated method id: ${testFilterWithNewSpamKey}, hash: 858D742B562C6675AAAFC2A0921F52EB
//     @Test
//     void testFilterWithNewSpamKey() {
//         CoreV1Event event = mock(CoreV1Event.class);
//         String spamKey = "testSpamKey";
//         when(spamKeyFunc.apply(event)).thenReturn(spamKey);
//         EventSpamFilter.SpamRecord spamRecord = new EventSpamFilter.SpamRecord();
//         LocalBucket mockedBucket = mock(LocalBucket.class);
//         spamRecord.tokenBucket = mockedBucket;
//         when(spamRecordCache.get(eq(spamKey), any())).thenReturn(spamRecord);
//         when(mockedBucket.tryConsume(1)).thenReturn(true);
//         assertThat(eventSpamFilter.filter(event), is(true));
//     }

//     //BaseRock generated method id: ${testFilterWithExistingSpamKey}, hash: 0595E35B6E57FCEA4B9A9D4C36531A9C
//     @Test
//     void testFilterWithExistingSpamKey() {
//         CoreV1Event event = mock(CoreV1Event.class);
//         String spamKey = "existingSpamKey";
//         when(spamKeyFunc.apply(event)).thenReturn(spamKey);
//         EventSpamFilter.SpamRecord spamRecord = new EventSpamFilter.SpamRecord();
//         LocalBucket mockedBucket = mock(LocalBucket.class);
//         spamRecord.tokenBucket = mockedBucket;
//         when(spamRecordCache.get(eq(spamKey), any())).thenReturn(spamRecord);
//         when(mockedBucket.tryConsume(1)).thenReturn(false);
//         assertThat(eventSpamFilter.filter(event), is(false));
//     }

//     //BaseRock generated method id: ${testEventSpamFilterConstructorWithDifferentMaxLRUCacheEntries}, hash: B1B381DAF8D7651EEC1395B4AFCD29B6
//     @ParameterizedTest
//     @ValueSource(ints = { 1, 10, 100 })
//     void testEventSpamFilterConstructorWithDifferentMaxLRUCacheEntries(int maxLRUCacheEntries) {
//         try (MockedStatic<Caffeine> mockedCaffeine = mockStatic(Caffeine.class)) {
//             Caffeine caffeine = mock(Caffeine.class);
//             mockedCaffeine.when(Caffeine::newBuilder).thenReturn(caffeine);
//             when(caffeine.maximumSize(maxLRUCacheEntries)).thenReturn(caffeine);
//             when(caffeine.build()).thenReturn(mock(Cache.class));
//             EventSpamFilter filter = new EventSpamFilter(maxLRUCacheEntries, spamKeyFunc);
//             assertThat(filter, is(notNullValue()));
//         }
//     }

//     //BaseRock generated method id: ${testEventSpamFilterConstructorWithCustomParameters}, hash: 927207683F9934BFE9537F214669FB6C
//     @Test
//     void testEventSpamFilterConstructorWithCustomParameters() {
//         try (MockedStatic<Caffeine> mockedCaffeine = mockStatic(Caffeine.class)) {
//             Caffeine caffeine = mock(Caffeine.class);
//             mockedCaffeine.when(Caffeine::newBuilder).thenReturn(caffeine);
//             when(caffeine.maximumSize(anyLong())).thenReturn(caffeine);
//             when(caffeine.build()).thenReturn(mock(Cache.class));
//             int maxLRUCacheEntries = 200;
//             long tokenBucketCapacity = 50;
//             Duration refillingPeriod = Duration.ofMinutes(10);
//             long refillingTokensPerPeriod = 2;
//             EventSpamFilter filter = new EventSpamFilter(maxLRUCacheEntries, spamKeyFunc, tokenBucketCapacity, refillingPeriod, refillingTokensPerPeriod);
//             assertThat(filter, is(notNullValue()));
//         }
//     }
}
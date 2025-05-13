package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1SleepAction;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1SleepActionBaseRockGeneratedTest {

    private V1SleepAction v1SleepAction;

    @BeforeEach
    void setUp() {
        v1SleepAction = new V1SleepAction();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 452B283B9FB156D3AB71E175DEAF8900
    @Test
    void testConstructor() {
        assertThat(v1SleepAction, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetSeconds}, hash: 6208B1EF3460C3D109D39E4C1D9DB49F
    @Test
    void testSetAndGetSeconds() {
        Long seconds = 5L;
        v1SleepAction.setSeconds(seconds);
        assertThat(v1SleepAction.getSeconds(), is(equalTo(seconds)));
    }

    //BaseRock generated method id: ${testSetAndGetSecondsWithVariousValues}, hash: 44EA7005E1442F1407AA7693139D42B7
    @ParameterizedTest
    @ValueSource(longs = { 0L, 1L, 100L, Long.MAX_VALUE })
    void testSetAndGetSecondsWithVariousValues(Long seconds) {
        v1SleepAction.setSeconds(seconds);
        assertThat(v1SleepAction.getSeconds(), is(equalTo(seconds)));
    }

    //BaseRock generated method id: ${testSetSecondsWithNull}, hash: E8217B06B7DE3A198E6EC5CFE6CA44A5
    @Disabled
    @Test
    void testSetSecondsWithNull() {
        //assertThat(v1SleepAction.setSeconds(null), is(notNullValue()));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 9F64B6586A2E93CD2DB4C61133CBDEB8
    @Test
    void testEqualsWithSameObject() {
        assertThat(v1SleepAction.equals(v1SleepAction), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: FAA480A0342568412D59DD639AB12219
    @Test
    void testEqualsWithDifferentObject() {
        V1SleepAction anotherV1SleepAction = new V1SleepAction();
        assertThat(v1SleepAction.equals(anotherV1SleepAction), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: A9C3C9D966B927D198BF086031231923
    @Test
    void testEqualsWithDifferentClass() {
        Object differentObject = new Object();
        assertThat(v1SleepAction.equals(differentObject), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: B97A1C0082B41BD07BA264BE76F4BCE9
    @Test
    void testEqualsWithNull() {
        assertThat(v1SleepAction.equals(null), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 1BF53C90C0F30A4C3BA84628975BD9B8
    @Test
    void testHashCode() {
        v1SleepAction.setSeconds(10L);
        V1SleepAction anotherV1SleepAction = new V1SleepAction().seconds(10L);
        assertThat(v1SleepAction.hashCode(), is(equalTo(anotherV1SleepAction.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: C10BBC860F28DD62F45C912BA6EE3EBB
    @Test
    void testToString() {
        v1SleepAction.setSeconds(15L);
        String expectedString = "class V1SleepAction {\n    seconds: 15\n}";
        assertThat(v1SleepAction.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testSecondsMethod}, hash: 315A5482F345895796C92543AB3D8F97
    @Test
    void testSecondsMethod() {
        Long seconds = 20L;
        V1SleepAction result = v1SleepAction.seconds(seconds);
        assertThat(result, is(equalTo(v1SleepAction)));
        assertThat(result.getSeconds(), is(equalTo(seconds)));
    }
}
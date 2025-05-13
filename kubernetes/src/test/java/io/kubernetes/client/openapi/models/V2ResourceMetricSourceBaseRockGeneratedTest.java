package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import io.kubernetes.client.openapi.models.V2MetricTarget;
import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.params.provider.ValueSource;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V2ResourceMetricSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: CDC8C2995B6A8CB06212E80E79A0B3C8
    @Test
    void testConstructor() {
        V2ResourceMetricSource source = new V2ResourceMetricSource();
        assertThat(source, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetName}, hash: EF9663A0B922776B164F72F3B3FD7790
    @Test
    void testSetAndGetName() {
        V2ResourceMetricSource source = new V2ResourceMetricSource();
        String name = "cpu";
        source.setName(name);
        assertThat(source.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testSetAndGetTarget}, hash: 0BAA0F61C6A7BDD9D8B28AADEC7020E8
    @Test
    void testSetAndGetTarget() {
        V2ResourceMetricSource source = new V2ResourceMetricSource();
        V2MetricTarget target = mock(V2MetricTarget.class);
        source.setTarget(target);
        assertThat(source.getTarget(), is(equalTo(target)));
    }

    //BaseRock generated method id: ${testNameWithDifferentValues}, hash: 3CBA63BA426FDCE78AB883C798BB2E1C
    @ParameterizedTest
    @ValueSource(strings = { "cpu", "memory", "storage" })
    void testNameWithDifferentValues(String name) {
        V2ResourceMetricSource source = new V2ResourceMetricSource();
        source.setName(name);
        assertThat(source.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testNameWithNullAndEmptyValues}, hash: E7AE2AA311FC1BA1BFAD7BA79922D212
    @ParameterizedTest
    @NullAndEmptySource
    void testNameWithNullAndEmptyValues(String name) {
        V2ResourceMetricSource source = new V2ResourceMetricSource();
        source.setName(name);
        assertThat(source.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 5AAFAAE942DC0010D29AF4BF58C36242
    @Test
    void testEquals() {
        V2ResourceMetricSource source1 = new V2ResourceMetricSource().name("cpu");
        V2ResourceMetricSource source2 = new V2ResourceMetricSource().name("cpu");
        V2ResourceMetricSource source3 = new V2ResourceMetricSource().name("memory");
        assertThat(source1.equals(source2), is(true));
        assertThat(source1.equals(source3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 36F0742FA0E2BE9534F455455529E5F7
    @Test
    void testHashCode() {
        V2ResourceMetricSource source1 = new V2ResourceMetricSource().name("cpu");
        V2ResourceMetricSource source2 = new V2ResourceMetricSource().name("cpu");
        assertThat(source1.hashCode(), is(equalTo(source2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 32ED209F22D1CE8B2480DBBED35DCF84
    @Test
    void testToString() {
        V2ResourceMetricSource source = new V2ResourceMetricSource().name("cpu").target(mock(V2MetricTarget.class));
        String result = source.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result, containsString("name"));
        assertThat(result, containsString("target"));
    }

    //BaseRock generated method id: ${testNameThrowsNullPointerException}, hash: 8060FA3D8F992D17757803CBCBCEB304
    @Test
    void testNameThrowsNullPointerException() {
        V2ResourceMetricSource source = new V2ResourceMetricSource();
        assertThat(source.name(null), is(notNullValue()));
    }

    //BaseRock generated method id: ${testTargetThrowsNullPointerException}, hash: 0BE01164221D6B5091698312C80F29BA
    @Test
    void testTargetThrowsNullPointerException() {
        V2ResourceMetricSource source = new V2ResourceMetricSource();
        assertThat(source.target(null), is(notNullValue()));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 5942EF6436FD9252E0E4E523F40B6BB9
    @Test
    void testFromJson() throws IOException {
        String json = "{\"name\":\"cpu\",\"target\":{\"type\":\"Utilization\",\"averageUtilization\":50}}";
        V2ResourceMetricSource source = V2ResourceMetricSource.fromJson(json);
        assertThat(source, is(notNullValue()));
        assertThat(source.getName(), is(equalTo("cpu")));
        assertThat(source.getTarget(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToJson}, hash: 09160EFA425D62A75993D289FA8A1C01
    @Test
    void testToJson() {
        V2ResourceMetricSource source = new V2ResourceMetricSource().name("cpu").target(new V2MetricTarget().type("Utilization").averageUtilization(50));
        String json = source.toJson();
        assertThat(json, is(notNullValue()));
        assertThat(json, containsString("\"name\":\"cpu\""));
        assertThat(json, containsString("\"target\":{"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 1F35859CF19E265BCCD3C40060787A3B
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "cpu");
        JsonObject targetObject = new JsonObject();
        targetObject.addProperty("type", "Utilization");
        targetObject.addProperty("averageUtilization", 50);
        jsonObject.add("target", targetObject);
        V2ResourceMetricSource.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testValidateJsonElementThrowsException}, hash: 8926C21901BE3B4A45917E8BAE493719
    @Test
    void testValidateJsonElementThrowsException() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("invalidField", "value");
        assertThrows(IllegalArgumentException.class, () -> V2ResourceMetricSource.validateJsonElement(jsonObject));
    }
}

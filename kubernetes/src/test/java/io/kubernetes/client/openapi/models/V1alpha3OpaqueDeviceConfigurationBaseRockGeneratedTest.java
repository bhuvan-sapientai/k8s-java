package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3OpaqueDeviceConfigurationBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 9E563FDF899CB010571F688747050307
    @Test
    void testConstructor() {
        V1alpha3OpaqueDeviceConfiguration configuration = new V1alpha3OpaqueDeviceConfiguration();
        assertThat(configuration, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetDriver}, hash: 7AD1F132777781DF9BF5F5A690BDF873
    @Test
    void testSetAndGetDriver() {
        V1alpha3OpaqueDeviceConfiguration configuration = new V1alpha3OpaqueDeviceConfiguration();
        String driver = "test.driver";
        configuration.setDriver(driver);
        assertThat(configuration.getDriver(), is(equalTo(driver)));
    }

    //BaseRock generated method id: ${testSetAndGetDriverWithVariousInputs}, hash: FD907362AC7389504C9D997432D70650
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "test.driver", "another.driver" })
    void testSetAndGetDriverWithVariousInputs(String driver) {
        V1alpha3OpaqueDeviceConfiguration configuration = new V1alpha3OpaqueDeviceConfiguration();
        configuration.setDriver(driver);
        assertThat(configuration.getDriver(), is(equalTo(driver)));
    }

    //BaseRock generated method id: ${testSetAndGetParameters}, hash: 6D7498598BE1800CF675F634FA7E5D7A
    @Test
    void testSetAndGetParameters() {
        V1alpha3OpaqueDeviceConfiguration configuration = new V1alpha3OpaqueDeviceConfiguration();
        Object parameters = new Object();
        configuration.setParameters(parameters);
        assertThat(configuration.getParameters(), is(equalTo(parameters)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 9B842A6D97ABF71588B04447ADD583EF
    @Test
    void testEqualsAndHashCode() {
        V1alpha3OpaqueDeviceConfiguration config1 = new V1alpha3OpaqueDeviceConfiguration().driver("test.driver").parameters(new JsonObject());
        V1alpha3OpaqueDeviceConfiguration config2 = new V1alpha3OpaqueDeviceConfiguration().driver("test.driver").parameters(new JsonObject());
        V1alpha3OpaqueDeviceConfiguration config3 = new V1alpha3OpaqueDeviceConfiguration().driver("another.driver").parameters(new JsonObject());
        assertThat(config1, is(equalTo(config2)));
        assertThat(config1, is(not(equalTo(config3))));
        assertThat(config1.hashCode(), is(equalTo(config2.hashCode())));
        assertThat(config1.hashCode(), is(not(equalTo(config3.hashCode()))));
    }

    //BaseRock generated method id: ${testToString}, hash: 77E13A291BD2CA23A96F4AB543CD710F
    @Test
    void testToString() {
        V1alpha3OpaqueDeviceConfiguration configuration = new V1alpha3OpaqueDeviceConfiguration().driver("test.driver").parameters(new JsonObject());
        String toString = configuration.toString();
        assertThat(toString, containsString("driver: test.driver"));
        assertThat(toString, containsString("parameters: {}"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 920B9451E93548FAC4ADF071EF7DD09B
    @Test
    void testValidateJsonElement() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("driver", "test.driver");
        jsonObject.add("parameters", new JsonObject());
        assertDoesNotThrow(() -> V1alpha3OpaqueDeviceConfiguration.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementMissingRequiredField}, hash: D9E4DE43ECA12313772088BC27B807FA
    @Test
    void testValidateJsonElementMissingRequiredField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("driver", "test.driver");
        assertThrows(IllegalArgumentException.class, () -> V1alpha3OpaqueDeviceConfiguration.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 0909AF027FFAA5877D6CF4A6A0E56AD9
    @Test
    void testFromJson() throws IOException {
        String json = "{\"driver\":\"test.driver\",\"parameters\":{}}";
        V1alpha3OpaqueDeviceConfiguration configuration = V1alpha3OpaqueDeviceConfiguration.fromJson(json);
        assertThat(configuration, is(notNullValue()));
        assertThat(configuration.getDriver(), is(equalTo("test.driver")));
        assertThat(configuration.getParameters(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToJson}, hash: 97128BCA2D117A42178B447A383FD01B
    @Test
    void testToJson() {
        V1alpha3OpaqueDeviceConfiguration configuration = new V1alpha3OpaqueDeviceConfiguration().driver("test.driver").parameters(new JsonObject());
        String json = configuration.toJson();
        assertThat(json, containsString("\"driver\":\"test.driver\""));
        assertThat(json, containsString("\"parameters\":{}"));
    }
}

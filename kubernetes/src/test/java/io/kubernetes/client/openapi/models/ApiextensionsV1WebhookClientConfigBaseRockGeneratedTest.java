package io.kubernetes.client.openapi.models;

import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayWithSize;
import static org.mockito.Mockito.when;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.io.IOException;
import java.util.Arrays;
import io.kubernetes.client.openapi.models.ApiextensionsV1ServiceReference;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class ApiextensionsV1WebhookClientConfigBaseRockGeneratedTest {

    private ApiextensionsV1WebhookClientConfig config;

    @BeforeEach
    void setUp() {
        config = new ApiextensionsV1WebhookClientConfig();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 31F071F9F88DDABEC9AFCE1B9BF2A1A4
    @Test
    void testConstructor() {
        assertThat(config, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetCaBundle}, hash: E4833A33DF24FAA0E11BEAF4F92A3AEB
    @ParameterizedTest
    @ValueSource(strings = { "test", "another test" })
    void testSetAndGetCaBundle(String value) {
        byte[] caBundle = value.getBytes();
        config.setCaBundle(caBundle);
        assertArrayEquals(caBundle, config.getCaBundle());
    }

    //BaseRock generated method id: ${testSetAndGetCaBundleNull}, hash: 3947AECEB698E59D92DB63398CADE9D5
    @Test
    void testSetAndGetCaBundleNull() {
        config.setCaBundle(null);
        assertThat(config.getCaBundle(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetService}, hash: 244F35D89BD5E0EC252D22F166560B20
    @Test
    void testSetAndGetService() {
        ApiextensionsV1ServiceReference service = mock(ApiextensionsV1ServiceReference.class);
        config.setService(service);
        assertEquals(service, config.getService());
    }

    //BaseRock generated method id: ${testSetAndGetUrl}, hash: B53E3D694C8F85AAD67C7E0ED92BF101
    @ParameterizedTest
    @ValueSource(strings = { "https://example.com", "https://test.org" })
    void testSetAndGetUrl(String url) {
        config.setUrl(url);
        assertEquals(url, config.getUrl());
    }

    //BaseRock generated method id: ${testSetAndGetUrlNullOrEmpty}, hash: 5BFF0ADD397F988805445B32558E3CDC
    @ParameterizedTest
    @NullAndEmptySource
    void testSetAndGetUrlNullOrEmpty(String url) {
        config.setUrl(url);
        assertEquals(url, config.getUrl());
    }

    //BaseRock generated method id: ${testEquals}, hash: 9B1E62063B1644AA70EC861928B92F1C
    @Test
    void testEquals() {
        ApiextensionsV1ServiceReference mockService1 = mock(ApiextensionsV1ServiceReference.class);
        ApiextensionsV1ServiceReference mockService2 = mock(ApiextensionsV1ServiceReference.class);
        ApiextensionsV1WebhookClientConfig config1 = new ApiextensionsV1WebhookClientConfig().caBundle("test".getBytes()).service(mockService1).url("https://example.com");
        ApiextensionsV1WebhookClientConfig config2 = // Use the same mock for both configs
        new ApiextensionsV1WebhookClientConfig().caBundle("test".getBytes()).// Use the same mock for both configs
        service(mockService1).url("https://example.com");
        ApiextensionsV1WebhookClientConfig config3 = new ApiextensionsV1WebhookClientConfig().caBundle("different".getBytes()).service(mockService2).url("https://different.com");
        assertThat(config1.equals(config2), is(true));
        assertThat(config1.equals(config3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: D0B2DCF61C7C9691E45F1F233BDFC1F2
    @Test
    void testHashCode() {
        ApiextensionsV1ServiceReference mockService = mock(ApiextensionsV1ServiceReference.class);
        ApiextensionsV1WebhookClientConfig config1 = new ApiextensionsV1WebhookClientConfig().caBundle("test".getBytes()).service(mockService).url("https://example.com");
        ApiextensionsV1WebhookClientConfig config2 = new ApiextensionsV1WebhookClientConfig().caBundle("test".getBytes()).service(mockService).url("https://example.com");
        assertThat(config1.hashCode(), equalTo(config2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 7D4A46FEE11CBAE399D3328202790C02
    @Test
    void testToString() {
        config.setCaBundle("test".getBytes());
        config.setService(mock(ApiextensionsV1ServiceReference.class));
        config.setUrl("https://example.com");
        String result = config.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("caBundle"), is(true));
        assertThat(result.contains("service"), is(true));
        assertThat(result.contains("url"), is(true));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: BAB9654200A3606E5C1E232C6E9751D2
    @Disabled()
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("caBundle", "dGVzdA==");
        JsonObject serviceObject = new JsonObject();
        serviceObject.addProperty("name", "test-service");
        serviceObject.addProperty("namespace", "test-namespace");
        jsonObject.add("service", serviceObject);
        jsonObject.addProperty("url", "https://example.com");
        ApiextensionsV1WebhookClientConfig.validateJsonElement(jsonObject);
        assertThrows(IllegalArgumentException.class, () -> ApiextensionsV1WebhookClientConfig.validateJsonElement(null));
    }

    //BaseRock generated method id: ${testCustomTypeAdapterFactory}, hash: 3C3C4D7ED2BC225C3274486F4423AC12
    @Test
    void testCustomTypeAdapterFactory() {
        ApiextensionsV1WebhookClientConfig.CustomTypeAdapterFactory factory = new ApiextensionsV1WebhookClientConfig.CustomTypeAdapterFactory();
        assertThat(factory, is(notNullValue()));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 06D8FFF8CC177CD82F6DDA0DD4C7F2B3
    @Test
    void testFromJson() throws IOException {
        String json = "{\"caBundle\":\"dGVzdA==\",\"url\":\"https://example.com\"}";
        ApiextensionsV1WebhookClientConfig result = ApiextensionsV1WebhookClientConfig.fromJson(json);
        assertThat(result, is(notNullValue()));
        assertArrayEquals("test".getBytes(), result.getCaBundle());
        assertEquals("https://example.com", result.getUrl());
    }

    //BaseRock generated method id: ${testToJson}, hash: 1381C0A75781E8DFC42F0CEFFCABE0AF
    @Disabled()
    @Test
    void testToJson() {
        config.setCaBundle("test".getBytes());
        config.setUrl("https://example.com");
        String json = config.toJson();
        assertThat(json, is(notNullValue()));
        assertThat(json, startsWith("{"));
        assertThat(json, endsWith("}"));
        assertThat(json.contains("\"caBundle\":\"dGVzdA==\""), is(true));
        assertThat(json.contains("\"url\":\"https://example.com\""), is(true));
    }
}

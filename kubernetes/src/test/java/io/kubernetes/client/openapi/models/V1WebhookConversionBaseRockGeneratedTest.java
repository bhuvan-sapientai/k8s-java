package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1WebhookConversion;
import io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfig;
import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1WebhookConversionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: F8F4F4DB86636B1465839926E3726F53
    @Test
    void testConstructor() {
        V1WebhookConversion conversion = new V1WebhookConversion();
        assertThat(conversion, is(notNullValue()));
        assertThat(conversion.getClientConfig(), is(nullValue()));
        assertThat(conversion.getConversionReviewVersions(), is(notNullValue()));
        assertThat(conversion.getConversionReviewVersions(), hasSize(0));
    }

    //BaseRock generated method id: ${testClientConfig}, hash: 738A97DA18EEBB022064B541080ED19C
    @Test
    void testClientConfig() {
        V1WebhookConversion conversion = new V1WebhookConversion();
        ApiextensionsV1WebhookClientConfig clientConfig = mock(ApiextensionsV1WebhookClientConfig.class);
        conversion.setClientConfig(clientConfig);
        assertThat(conversion.getClientConfig(), is(equalTo(clientConfig)));
    }

    //BaseRock generated method id: ${testClientConfigBuilder}, hash: 3DF57DD7192153C8C1A54B59CB8DDC53
    @Test
    void testClientConfigBuilder() {
        ApiextensionsV1WebhookClientConfig clientConfig = mock(ApiextensionsV1WebhookClientConfig.class);
        V1WebhookConversion conversion = new V1WebhookConversion().clientConfig(clientConfig);
        assertThat(conversion.getClientConfig(), is(equalTo(clientConfig)));
    }

    //BaseRock generated method id: ${testConversionReviewVersions}, hash: 3D7F9F93BDEC7FD8EDBD484C27269810
    @Test
    void testConversionReviewVersions() {
        V1WebhookConversion conversion = new V1WebhookConversion();
        List<String> versions = Arrays.asList("v1", "v2");
        conversion.setConversionReviewVersions(versions);
        assertThat(conversion.getConversionReviewVersions(), is(equalTo(versions)));
    }

    //BaseRock generated method id: ${testConversionReviewVersionsBuilder}, hash: 0A8A1039D44C01B2C0873D4617147727
    @Test
    void testConversionReviewVersionsBuilder() {
        List<String> versions = Arrays.asList("v1", "v2");
        V1WebhookConversion conversion = new V1WebhookConversion().conversionReviewVersions(versions);
        assertThat(conversion.getConversionReviewVersions(), is(equalTo(versions)));
    }

    //BaseRock generated method id: ${testAddConversionReviewVersionsItem}, hash: 9C6F4A20424C2A426F5BC55E805D742E
    @Test
    void testAddConversionReviewVersionsItem() {
        V1WebhookConversion conversion = new V1WebhookConversion();
        conversion.addConversionReviewVersionsItem("v1");
        assertThat(conversion.getConversionReviewVersions(), hasSize(1));
        assertThat(conversion.getConversionReviewVersions().get(0), is(equalTo("v1")));
        conversion.addConversionReviewVersionsItem("v2");
        assertThat(conversion.getConversionReviewVersions(), hasSize(2));
        assertThat(conversion.getConversionReviewVersions().get(1), is(equalTo("v2")));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 01FDB4993DE784C93497391DA6CA0829
    @Test
    void testEqualsAndHashCode() {
        ApiextensionsV1WebhookClientConfig clientConfig1 = mock(ApiextensionsV1WebhookClientConfig.class);
        ApiextensionsV1WebhookClientConfig clientConfig2 = mock(ApiextensionsV1WebhookClientConfig.class);
        List<String> versions = Arrays.asList("v1", "v2");
        V1WebhookConversion conversion1 = new V1WebhookConversion().clientConfig(clientConfig1).conversionReviewVersions(new ArrayList<>(versions));
        V1WebhookConversion conversion2 = new V1WebhookConversion().clientConfig(clientConfig1).conversionReviewVersions(new ArrayList<>(versions));
        V1WebhookConversion conversion3 = new V1WebhookConversion().clientConfig(clientConfig2).conversionReviewVersions(Arrays.asList("v3"));
        assertThat(conversion1, is(equalTo(conversion2)));
        assertThat(conversion1.hashCode(), is(equalTo(conversion2.hashCode())));
        assertThat(conversion1, is(not(equalTo(conversion3))));
        assertThat(conversion1.hashCode(), is(not(equalTo(conversion3.hashCode()))));
    }

    //BaseRock generated method id: ${testToString}, hash: 4C355A47CB29C3911DF280681D295D91
    @Test
    void testToString() {
        V1WebhookConversion conversion = new V1WebhookConversion().clientConfig(mock(ApiextensionsV1WebhookClientConfig.class)).conversionReviewVersions(Arrays.asList("v1", "v2"));
        String result = conversion.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result, containsString("clientConfig"));
        assertThat(result, containsString("conversionReviewVersions"));
    }

    //BaseRock generated method id: ${testAddConversionReviewVersionsItemParameterized}, hash: F1AB8CD2A1718E8FB422EF2DD3F35C1E
    @ParameterizedTest
    @ValueSource(strings = { "v1", "v2", "v3" })
    void testAddConversionReviewVersionsItemParameterized(String version) {
        V1WebhookConversion conversion = new V1WebhookConversion();
        conversion.addConversionReviewVersionsItem(version);
        assertThat(conversion.getConversionReviewVersions(), hasSize(1));
        assertThat(conversion.getConversionReviewVersions().get(0), is(equalTo(version)));
    }

    //BaseRock generated method id: ${testSetNullConversionReviewVersions}, hash: 56147AF50C9D836693B751E2BF6E1597
    @Test
    void testSetNullConversionReviewVersions() {
        V1WebhookConversion conversion = new V1WebhookConversion();
        assertThat(conversion.getConversionReviewVersions(), is(notNullValue()));
        conversion.setConversionReviewVersions(null);
        assertThat(conversion.getConversionReviewVersions(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAddNullConversionReviewVersionsItem}, hash: 89E3A9DABF8A7125581122415B56A79D
    @Test
    void testAddNullConversionReviewVersionsItem() {
        V1WebhookConversion conversion = new V1WebhookConversion();
        conversion.addConversionReviewVersionsItem(null);
        assertThat(conversion.getConversionReviewVersions(), hasSize(1));
        assertThat(conversion.getConversionReviewVersions().get(0), is(nullValue()));
    }

    //BaseRock generated method id: ${testEmptyConversionReviewVersions}, hash: 1706FC83BF2E94D4D324473D544F6ADB
    @Test
    void testEmptyConversionReviewVersions() {
        V1WebhookConversion conversion = new V1WebhookConversion().conversionReviewVersions(new ArrayList<>());
        assertThat(conversion.getConversionReviewVersions(), is(notNullValue()));
        assertThat(conversion.getConversionReviewVersions(), hasSize(0));
    }
}

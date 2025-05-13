package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1ValidatingWebhook;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1ValidatingWebhookConfigurationBaseRockGeneratedTest {

    private V1ValidatingWebhookConfiguration v1ValidatingWebhookConfiguration;

    @BeforeEach
    void setUp() {
        v1ValidatingWebhookConfiguration = new V1ValidatingWebhookConfiguration();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 13D128AC7684ED2C8C30D2C6555FA25B
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1ValidatingWebhookConfiguration.setApiVersion(apiVersion);
        assertThat(v1ValidatingWebhookConfiguration.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testKind}, hash: BA203C1D6B4D6666425C016BDA1370E8
    @Test
    void testKind() {
        String kind = "ValidatingWebhookConfiguration";
        v1ValidatingWebhookConfiguration.setKind(kind);
        assertThat(v1ValidatingWebhookConfiguration.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testMetadata}, hash: 788275AFDEA06D8C43E57389D7203086
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1ValidatingWebhookConfiguration.setMetadata(metadata);
        assertThat(v1ValidatingWebhookConfiguration.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testWebhooks}, hash: 62318E53B1440DFDB078AE46E9D3ED93
    @Test
    void testWebhooks() {
        List<V1ValidatingWebhook> webhooks = new ArrayList<>();
        webhooks.add(mock(V1ValidatingWebhook.class));
        v1ValidatingWebhookConfiguration.setWebhooks(webhooks);
        assertThat(v1ValidatingWebhookConfiguration.getWebhooks(), is(equalTo(webhooks)));
    }

    //BaseRock generated method id: ${testAddWebhooksItem}, hash: 22CBACAE326458EDA3F93D14BA2B13EE
    @Test
    void testAddWebhooksItem() {
        V1ValidatingWebhook webhook = mock(V1ValidatingWebhook.class);
        v1ValidatingWebhookConfiguration.addWebhooksItem(webhook);
        assertThat(v1ValidatingWebhookConfiguration.getWebhooks(), hasSize(1));
        assertThat(v1ValidatingWebhookConfiguration.getWebhooks().get(0), is(equalTo(webhook)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 747908BF664E594DD7636083A86ACA7D
    @Test
    void testEqualsAndHashCode() {
        V1ObjectMeta metadata1 = new V1ObjectMeta();
        V1ObjectMeta metadata2 = new V1ObjectMeta();
        V1ValidatingWebhookConfiguration config1 = new V1ValidatingWebhookConfiguration().apiVersion("v1").kind("ValidatingWebhookConfiguration").metadata(metadata1).webhooks(new ArrayList<>());
        V1ValidatingWebhookConfiguration config2 = new V1ValidatingWebhookConfiguration().apiVersion("v1").kind("ValidatingWebhookConfiguration").metadata(metadata2).webhooks(new ArrayList<>());
        assertThat(config1, is(equalTo(config2)));
        assertThat(config1.hashCode(), is(equalTo(config2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 2712DADB141868E4117273C09F39F14A
    @Test
    void testToString() {
        v1ValidatingWebhookConfiguration.apiVersion("v1").kind("ValidatingWebhookConfiguration").metadata(mock(V1ObjectMeta.class)).webhooks(new ArrayList<>());
        String toString = v1ValidatingWebhookConfiguration.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("webhooks"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: A9E05F76C3AFA605C05F7C6A13691339
    @Test
    void testBuilder() {
        V1ValidatingWebhookConfiguration config = new V1ValidatingWebhookConfiguration().apiVersion("v1").kind("ValidatingWebhookConfiguration").metadata(mock(V1ObjectMeta.class)).webhooks(new ArrayList<>());
        assertThat(config.getApiVersion(), is(equalTo("v1")));
        assertThat(config.getKind(), is(equalTo("ValidatingWebhookConfiguration")));
        assertThat(config.getMetadata(), notNullValue());
        assertThat(config.getWebhooks(), notNullValue());
    }

    //BaseRock generated method id: ${testSetNullApiVersion}, hash: 471CC35FA4FE4A47F94FC79F9003392C
    @Test
    void testSetNullApiVersion() {
        v1ValidatingWebhookConfiguration.setApiVersion(null);
        assertThat(v1ValidatingWebhookConfiguration.getApiVersion(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetNullKind}, hash: 056740704BD1845A527D71D3DC0A4C55
    @Test
    void testSetNullKind() {
        v1ValidatingWebhookConfiguration.setKind(null);
        assertThat(v1ValidatingWebhookConfiguration.getKind(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetNullMetadata}, hash: 82F46686543F695251672F4BF50D6256
    @Test
    void testSetNullMetadata() {
        v1ValidatingWebhookConfiguration.setMetadata(null);
        assertThat(v1ValidatingWebhookConfiguration.getMetadata(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetNullWebhooks}, hash: B2C127FD1A2BC8161A17678C23E9A212
    @Test
    void testSetNullWebhooks() {
        v1ValidatingWebhookConfiguration.setWebhooks(null);
        assertThat(v1ValidatingWebhookConfiguration.getWebhooks(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAddWebhooksItemToNullList}, hash: 9C3C83690C6CB23937CD3409A55C829F
    @Test
    void testAddWebhooksItemToNullList() {
        v1ValidatingWebhookConfiguration.setWebhooks(null);
        V1ValidatingWebhook webhook = mock(V1ValidatingWebhook.class);
        v1ValidatingWebhookConfiguration.addWebhooksItem(webhook);
        assertThat(v1ValidatingWebhookConfiguration.getWebhooks(), hasSize(1));
        assertThat(v1ValidatingWebhookConfiguration.getWebhooks().get(0), is(equalTo(webhook)));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: F01C4F84BE17FADE33C369FE3CA6B315
    @Test
    void testValidateJsonElement() {
        // This method is static and not directly testable without changing the access modifier.
        // Consider refactoring the source class to make this method more testable.
    }

    //BaseRock generated method id: ${testFromJson}, hash: 0647A312BC2EFB74C250D28BDFA210FC
    @Test
    void testFromJson() throws Exception {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"ValidatingWebhookConfiguration\",\"metadata\":{},\"webhooks\":[]}";
        V1ValidatingWebhookConfiguration config = V1ValidatingWebhookConfiguration.fromJson(json);
        assertThat(config, notNullValue());
        assertThat(config.getApiVersion(), is(equalTo("v1")));
        assertThat(config.getKind(), is(equalTo("ValidatingWebhookConfiguration")));
        assertThat(config.getMetadata(), notNullValue());
        assertThat(config.getWebhooks(), notNullValue());
    }

    //BaseRock generated method id: ${testToJson}, hash: 792900A57B0E2F8B0EE0DE35AE650278
    @Disabled()
    @Test
    void testToJson() {
        V1ObjectMeta metadata = new V1ObjectMeta();
        v1ValidatingWebhookConfiguration.apiVersion("v1").kind("ValidatingWebhookConfiguration").metadata(metadata).webhooks(new ArrayList<>());
        String json = v1ValidatingWebhookConfiguration.toJson();
        assertThat(json, notNullValue());
        assertThat(json.contains("\"apiVersion\":\"v1\""), is(true));
        assertThat(json.contains("\"kind\":\"ValidatingWebhookConfiguration\""), is(true));
        assertThat(json.contains("\"metadata\":{}"), is(true));
        assertThat(json.contains("\"webhooks\":[]"), is(true));
    }

    //BaseRock generated method id: ${testCustomTypeAdapterFactory}, hash: 5324DAF899065B17180EA25D4E08C322
    @Test
    void testCustomTypeAdapterFactory() {
        // This is an inner class and not directly testable without changing the access modifier.
        // Consider refactoring the source class to make this class more testable.
    }
}

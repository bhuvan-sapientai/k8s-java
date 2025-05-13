package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1MutatingWebhook;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1MutatingWebhookConfigurationBaseRockGeneratedTest {

    private V1MutatingWebhookConfiguration v1MutatingWebhookConfiguration;

    @BeforeEach
    void setUp() {
        v1MutatingWebhookConfiguration = new V1MutatingWebhookConfiguration();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 5DD54E7E21F66FBB443D545126F14142
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1MutatingWebhookConfiguration.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1MutatingWebhookConfiguration.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: B7A08D96399E13D11453CA2724D8B097
    @Test
    void testKind() {
        String kind = "MutatingWebhookConfiguration";
        v1MutatingWebhookConfiguration.setKind(kind);
        assertEquals(kind, v1MutatingWebhookConfiguration.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: A62E7C25D935DD1FBA956D099ACC4EA6
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1MutatingWebhookConfiguration.setMetadata(metadata);
        assertEquals(metadata, v1MutatingWebhookConfiguration.getMetadata());
    }

    //BaseRock generated method id: ${testWebhooks}, hash: AA2EE154C84298C9D084F25D01A97CA1
    @Test
    void testWebhooks() {
        List<V1MutatingWebhook> webhooks = new ArrayList<>();
        V1MutatingWebhook webhook = mock(V1MutatingWebhook.class);
        webhooks.add(webhook);
        v1MutatingWebhookConfiguration.setWebhooks(webhooks);
        assertEquals(webhooks, v1MutatingWebhookConfiguration.getWebhooks());
    }

    //BaseRock generated method id: ${testAddWebhooksItem}, hash: 0644A49A9CF76F1FD22ACD1299BE4480
    @Test
    void testAddWebhooksItem() {
        V1MutatingWebhook webhook = mock(V1MutatingWebhook.class);
        v1MutatingWebhookConfiguration.addWebhooksItem(webhook);
        assertThat(v1MutatingWebhookConfiguration.getWebhooks(), hasSize(1));
        assertThat(v1MutatingWebhookConfiguration.getWebhooks().get(0), is(webhook));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 8E62CB543B84D6ADB06F2DCAF9D0C8CF
    @Test
    void testEqualsAndHashCode() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1MutatingWebhookConfiguration config1 = new V1MutatingWebhookConfiguration().apiVersion("v1").kind("MutatingWebhookConfiguration").metadata(metadata).webhooks(new ArrayList<>());
        V1MutatingWebhookConfiguration config2 = new V1MutatingWebhookConfiguration().apiVersion("v1").kind("MutatingWebhookConfiguration").metadata(metadata).webhooks(new ArrayList<>());
        assertThat(config1, equalTo(config2));
        assertThat(config1.hashCode(), equalTo(config2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 700CCBD1F9FC2E1DE12ABABBE688E15A
    @Test
    void testToString() {
        v1MutatingWebhookConfiguration.apiVersion("v1").kind("MutatingWebhookConfiguration").metadata(mock(V1ObjectMeta.class)).webhooks(new ArrayList<>());
        String toString = v1MutatingWebhookConfiguration.toString();
        assertNotNull(toString);
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("webhooks"), is(true));
    }

    //BaseRock generated method id: ${testConstructor}, hash: 6CF4C12F6013FD64E76B05162943D1FC
    @Test
    void testConstructor() {
        assertThat(v1MutatingWebhookConfiguration, is(notNullValue()));
        assertThat(v1MutatingWebhookConfiguration.getWebhooks(), is(notNullValue()));
        assertThat(v1MutatingWebhookConfiguration.getWebhooks(), hasSize(0));
    }
}

package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1NetworkPolicySpec;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1NetworkPolicyBaseRockGeneratedTest {

    private V1NetworkPolicy v1NetworkPolicy;

    @BeforeEach
    void setUp() {
        v1NetworkPolicy = new V1NetworkPolicy();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: FC1161D1B162A172E157BD53F12F7947
    @Test
    void testGetApiVersion() {
        assertNull(v1NetworkPolicy.getApiVersion());
        v1NetworkPolicy.setApiVersion("networking.k8s.io/v1");
        assertEquals("networking.k8s.io/v1", v1NetworkPolicy.getApiVersion());
    }

    //BaseRock generated method id: ${testGetKind}, hash: F5D0D10675493CB2A0D42314AAF3C44E
    @Test
    void testGetKind() {
        assertNull(v1NetworkPolicy.getKind());
        v1NetworkPolicy.setKind("NetworkPolicy");
        assertEquals("NetworkPolicy", v1NetworkPolicy.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 26C04B44196085691F37876AE6C1D1D7
    @Test
    void testGetMetadata() {
        assertNull(v1NetworkPolicy.getMetadata());
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1NetworkPolicy.setMetadata(metadata);
        assertThat(v1NetworkPolicy.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testGetSpec}, hash: A2DAAE3CE67FAF74B7EE04933383D5FC
    @Test
    void testGetSpec() {
        assertNull(v1NetworkPolicy.getSpec());
        V1NetworkPolicySpec spec = mock(V1NetworkPolicySpec.class);
        v1NetworkPolicy.setSpec(spec);
        assertThat(v1NetworkPolicy.getSpec(), is(spec));
    }

    //BaseRock generated method id: ${testEquals}, hash: BD62CAA7CBA16BB2D9C1090CAA6B2F6C
    @Test
    void testEquals() {
        V1NetworkPolicy policy1 = new V1NetworkPolicy().apiVersion("networking.k8s.io/v1").kind("NetworkPolicy").metadata(new V1ObjectMeta().name("test-policy")).spec(new V1NetworkPolicySpec());
        V1NetworkPolicy policy2 = new V1NetworkPolicy().apiVersion("networking.k8s.io/v1").kind("NetworkPolicy").metadata(new V1ObjectMeta().name("test-policy")).spec(new V1NetworkPolicySpec());
        assertThat(policy1, equalTo(policy2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 4CB34DE95686F731AE7E811CC99756B1
    @Test
    void testHashCode() {
        V1NetworkPolicy policy1 = new V1NetworkPolicy().apiVersion("networking.k8s.io/v1").kind("NetworkPolicy").metadata(new V1ObjectMeta().name("test-policy")).spec(new V1NetworkPolicySpec());
        V1NetworkPolicy policy2 = new V1NetworkPolicy().apiVersion("networking.k8s.io/v1").kind("NetworkPolicy").metadata(new V1ObjectMeta().name("test-policy")).spec(new V1NetworkPolicySpec());
        assertThat(policy1.hashCode(), equalTo(policy2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: C56CE6C54057B01435D2D57A3E2C62A1
    @Test
    void testToString() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        when(metadata.toString()).thenReturn("mockedMetadata");
        V1NetworkPolicySpec spec = mock(V1NetworkPolicySpec.class);
        when(spec.toString()).thenReturn("mockedSpec");
        v1NetworkPolicy.setApiVersion("networking.k8s.io/v1");
        v1NetworkPolicy.setKind("NetworkPolicy");
        v1NetworkPolicy.setMetadata(metadata);
        v1NetworkPolicy.setSpec(spec);
        String expected = "class V1NetworkPolicy {\n    apiVersion: networking.k8s.io/v1\n    kind: NetworkPolicy\n    metadata: mockedMetadata\n    spec: mockedSpec\n}";
        assertThat(v1NetworkPolicy.toString(), is(expected));
    }

    //BaseRock generated method id: ${testBuilder}, hash: AB2632CB925C61368D4670AD6E2D3159
    @Test
    void testBuilder() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1NetworkPolicySpec spec = mock(V1NetworkPolicySpec.class);
        V1NetworkPolicy policy = new V1NetworkPolicy().apiVersion("networking.k8s.io/v1").kind("NetworkPolicy").metadata(metadata).spec(spec);
        assertThat(policy, notNullValue());
        assertThat(policy.getApiVersion(), is("networking.k8s.io/v1"));
        assertThat(policy.getKind(), is("NetworkPolicy"));
        assertThat(policy.getMetadata(), is(metadata));
        assertThat(policy.getSpec(), is(spec));
    }
}

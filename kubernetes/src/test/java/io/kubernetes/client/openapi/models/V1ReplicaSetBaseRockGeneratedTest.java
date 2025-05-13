package io.kubernetes.client.openapi.models;

import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1ReplicaSetBaseRockGeneratedTest {

    private V1ReplicaSet v1ReplicaSet;

    @BeforeEach
    void setUp() {
        v1ReplicaSet = new V1ReplicaSet();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 014DB1F575787EECC97D6F2FE6FAD3C3
    @Test
    void testApiVersion() {
        String apiVersion = "apps/v1";
        v1ReplicaSet.setApiVersion(apiVersion);
        assertThat(v1ReplicaSet.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testKind}, hash: 374F2A04D7707974148A2D3C065B736C
    @Test
    void testKind() {
        String kind = "ReplicaSet";
        v1ReplicaSet.setKind(kind);
        assertThat(v1ReplicaSet.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testMetadata}, hash: B5A90E0B57D3C5BA2E6FC5BF1C8FA478
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1ReplicaSet.setMetadata(metadata);
        assertThat(v1ReplicaSet.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testSpec}, hash: 0CF3A5018B80F972F170C24894F309FC
    @Test
    void testSpec() {
        V1ReplicaSetSpec spec = mock(V1ReplicaSetSpec.class);
        v1ReplicaSet.setSpec(spec);
        assertThat(v1ReplicaSet.getSpec(), is(equalTo(spec)));
    }

    //BaseRock generated method id: ${testStatus}, hash: D6E3602ADB7A54371492DF982057EF0C
    @Test
    void testStatus() {
        V1ReplicaSetStatus status = mock(V1ReplicaSetStatus.class);
        v1ReplicaSet.setStatus(status);
        assertThat(v1ReplicaSet.getStatus(), is(equalTo(status)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: E00B347BAE743C086794958ED27DDF16
    @Disabled()
    @Test
    void testEqualsAndHashCode() {
        V1ObjectMeta metadata1 = mock(V1ObjectMeta.class);
        V1ReplicaSetSpec spec1 = mock(V1ReplicaSetSpec.class);
        V1ReplicaSetStatus status1 = mock(V1ReplicaSetStatus.class);
        V1ObjectMeta metadata2 = mock(V1ObjectMeta.class);
        V1ReplicaSetSpec spec2 = mock(V1ReplicaSetSpec.class);
        V1ReplicaSetStatus status2 = mock(V1ReplicaSetStatus.class);
        when(metadata1.equals(metadata2)).thenReturn(true);
        when(spec1.equals(spec2)).thenReturn(true);
        when(status1.equals(status2)).thenReturn(true);
        when(metadata1.hashCode()).thenReturn(1);
        when(spec1.hashCode()).thenReturn(2);
        when(status1.hashCode()).thenReturn(3);
        when(metadata2.hashCode()).thenReturn(1);
        when(spec2.hashCode()).thenReturn(2);
        when(status2.hashCode()).thenReturn(3);
        V1ReplicaSet v1ReplicaSet1 = new V1ReplicaSet().apiVersion("apps/v1").kind("ReplicaSet").metadata(metadata1).spec(spec1).status(status1);
        V1ReplicaSet v1ReplicaSet2 = new V1ReplicaSet().apiVersion("apps/v1").kind("ReplicaSet").metadata(metadata2).spec(spec2).status(status2);
        assertAll(() -> assertEquals(v1ReplicaSet1, v1ReplicaSet2), () -> assertEquals(v1ReplicaSet1.hashCode(), v1ReplicaSet2.hashCode()));
        v1ReplicaSet2.setApiVersion("different");
        assertAll(() -> assertNotEquals(v1ReplicaSet1, v1ReplicaSet2), () -> assertNotEquals(v1ReplicaSet1.hashCode(), v1ReplicaSet2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 5BCA6F54C392CDD16F1E18A6E6936577
    @Test
    void testToString() {
        v1ReplicaSet.setApiVersion("apps/v1");
        v1ReplicaSet.setKind("ReplicaSet");
        v1ReplicaSet.setMetadata(mock(V1ObjectMeta.class));
        v1ReplicaSet.setSpec(mock(V1ReplicaSetSpec.class));
        v1ReplicaSet.setStatus(mock(V1ReplicaSetStatus.class));
        String toString = v1ReplicaSet.toString();
        assertThat(toString, notNullValue());
        assertThat(toString, containsString("apiVersion"));
        assertThat(toString, containsString("kind"));
        assertThat(toString, containsString("metadata"));
        assertThat(toString, containsString("spec"));
        assertThat(toString, containsString("status"));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 5A7D0429A7C97B28723B4D4E70713832
    @Test
    void testBuilder() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1ReplicaSetSpec spec = mock(V1ReplicaSetSpec.class);
        V1ReplicaSetStatus status = mock(V1ReplicaSetStatus.class);
        V1ReplicaSet builtReplicaSet = new V1ReplicaSet().apiVersion("apps/v1").kind("ReplicaSet").metadata(metadata).spec(spec).status(status);
        assertAll(() -> assertThat(builtReplicaSet.getApiVersion(), is(equalTo("apps/v1"))), () -> assertThat(builtReplicaSet.getKind(), is(equalTo("ReplicaSet"))), () -> assertThat(builtReplicaSet.getMetadata(), is(equalTo(metadata))), () -> assertThat(builtReplicaSet.getSpec(), is(equalTo(spec))), () -> assertThat(builtReplicaSet.getStatus(), is(equalTo(status))));
    }
}

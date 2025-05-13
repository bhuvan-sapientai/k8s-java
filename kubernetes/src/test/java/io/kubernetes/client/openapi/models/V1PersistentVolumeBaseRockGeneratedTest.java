package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1PersistentVolumeStatus;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1PersistentVolumeSpec;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PersistentVolumeBaseRockGeneratedTest {

    private V1PersistentVolume persistentVolume;

    @BeforeEach
    void setUp() {
        persistentVolume = new V1PersistentVolume();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: A5A67CF739086F18036F82E136B85A96
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        persistentVolume.setApiVersion(apiVersion);
        assertEquals(apiVersion, persistentVolume.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 2A20424D98B62389F9DE7EBEDB97759E
    @Test
    void testKind() {
        String kind = "PersistentVolume";
        persistentVolume.setKind(kind);
        assertEquals(kind, persistentVolume.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: AD80BD49C25BBF6F1009FCB5F0959A76
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        persistentVolume.setMetadata(metadata);
        assertEquals(metadata, persistentVolume.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: 5027688CC91F225DFD640FA53CE72268
    @Test
    void testSpec() {
        V1PersistentVolumeSpec spec = mock(V1PersistentVolumeSpec.class);
        persistentVolume.setSpec(spec);
        assertEquals(spec, persistentVolume.getSpec());
    }

    //BaseRock generated method id: ${testStatus}, hash: 83170E71801D7873FCD27E894CD4C845
    @Test
    void testStatus() {
        V1PersistentVolumeStatus status = mock(V1PersistentVolumeStatus.class);
        persistentVolume.setStatus(status);
        assertEquals(status, persistentVolume.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: EE517972DFEE8AE6DD91765C6CB58691
    @Test
    void testEquals() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1PersistentVolumeSpec spec = mock(V1PersistentVolumeSpec.class);
        V1PersistentVolumeStatus status = mock(V1PersistentVolumeStatus.class);
        V1PersistentVolume volume1 = new V1PersistentVolume().apiVersion("v1").kind("PersistentVolume").metadata(metadata).spec(spec).status(status);
        V1PersistentVolume volume2 = new V1PersistentVolume().apiVersion("v1").kind("PersistentVolume").metadata(metadata).spec(spec).status(status);
        assertThat(volume1, is(equalTo(volume2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 14A33BFA80642D779C601A1BD2D10068
    @Test
    void testHashCode() {
        V1PersistentVolume volume = new V1PersistentVolume().apiVersion("v1").kind("PersistentVolume").metadata(mock(V1ObjectMeta.class)).spec(mock(V1PersistentVolumeSpec.class)).status(mock(V1PersistentVolumeStatus.class));
        assertThat(volume.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 1FC0673C7FA0A73B5371605D54F122E0
    @Test
    void testToString() {
        V1PersistentVolume volume = new V1PersistentVolume().apiVersion("v1").kind("PersistentVolume").metadata(mock(V1ObjectMeta.class)).spec(mock(V1PersistentVolumeSpec.class)).status(mock(V1PersistentVolumeStatus.class));
        String result = volume.toString();
        assertNotNull(result);
        assertThat(result.contains("apiVersion"), is(true));
        assertThat(result.contains("kind"), is(true));
        assertThat(result.contains("metadata"), is(true));
        assertThat(result.contains("spec"), is(true));
        assertThat(result.contains("status"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: CED4E7521EDB41DF145BCDD312F5779B
    @Test
    void testBuilder() {
        V1PersistentVolume volume = new V1PersistentVolume().apiVersion("v1").kind("PersistentVolume").metadata(mock(V1ObjectMeta.class)).spec(mock(V1PersistentVolumeSpec.class)).status(mock(V1PersistentVolumeStatus.class));
        assertNotNull(volume);
        assertEquals("v1", volume.getApiVersion());
        assertEquals("PersistentVolume", volume.getKind());
        assertNotNull(volume.getMetadata());
        assertNotNull(volume.getSpec());
        assertNotNull(volume.getStatus());
    }
}

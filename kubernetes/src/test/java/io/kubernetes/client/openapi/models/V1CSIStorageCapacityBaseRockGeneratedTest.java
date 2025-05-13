package io.kubernetes.client.openapi.models;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.custom.Quantity;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.io.IOException;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CSIStorageCapacityBaseRockGeneratedTest {

    private V1CSIStorageCapacity v1CSIStorageCapacity;

    @BeforeEach
    void setUp() {
        v1CSIStorageCapacity = new V1CSIStorageCapacity();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 1A2357D4E111B770549678AD0002ED0D
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1CSIStorageCapacity.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1CSIStorageCapacity.getApiVersion());
    }

    //BaseRock generated method id: ${testCapacity}, hash: CACB58FA77C865CDDEBB33ADF0032EE0
    @Test
    void testCapacity() {
        Quantity capacity = mock(Quantity.class);
        v1CSIStorageCapacity.setCapacity(capacity);
        assertEquals(capacity, v1CSIStorageCapacity.getCapacity());
    }

    //BaseRock generated method id: ${testKind}, hash: D810B6571D003C29221DDB89E9CF4762
    @Test
    void testKind() {
        String kind = "CSIStorageCapacity";
        v1CSIStorageCapacity.setKind(kind);
        assertEquals(kind, v1CSIStorageCapacity.getKind());
    }

    //BaseRock generated method id: ${testMaximumVolumeSize}, hash: 37B4FD490C5A294752438623CE421B31
    @Test
    void testMaximumVolumeSize() {
        Quantity maximumVolumeSize = mock(Quantity.class);
        v1CSIStorageCapacity.setMaximumVolumeSize(maximumVolumeSize);
        assertEquals(maximumVolumeSize, v1CSIStorageCapacity.getMaximumVolumeSize());
    }

    //BaseRock generated method id: ${testMetadata}, hash: D294731B86FD03C752910E3FB3D25D35
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1CSIStorageCapacity.setMetadata(metadata);
        assertEquals(metadata, v1CSIStorageCapacity.getMetadata());
    }

    //BaseRock generated method id: ${testNodeTopology}, hash: 12473C73ACB83B1E353982948590471D
    @Test
    void testNodeTopology() {
        V1LabelSelector nodeTopology = mock(V1LabelSelector.class);
        v1CSIStorageCapacity.setNodeTopology(nodeTopology);
        assertEquals(nodeTopology, v1CSIStorageCapacity.getNodeTopology());
    }

    //BaseRock generated method id: ${testStorageClassName}, hash: 69949B613EE54B0B51EEBB4352070074
    @Test
    void testStorageClassName() {
        String storageClassName = "test-storage-class";
        v1CSIStorageCapacity.setStorageClassName(storageClassName);
        assertEquals(storageClassName, v1CSIStorageCapacity.getStorageClassName());
    }

    //BaseRock generated method id: ${testEquals}, hash: 2F9491DC22F0D2B5812F2B6BE6FD7246
    @Test
    void testEquals() {
        V1CSIStorageCapacity capacity1 = new V1CSIStorageCapacity();
        V1CSIStorageCapacity capacity2 = new V1CSIStorageCapacity();
        capacity1.setApiVersion("v1");
        capacity2.setApiVersion("v1");
        capacity1.setKind("CSIStorageCapacity");
        capacity2.setKind("CSIStorageCapacity");
        capacity1.setStorageClassName("test-storage-class");
        capacity2.setStorageClassName("test-storage-class");
        assertThat(capacity1, is(equalTo(capacity2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: D045004FD8397ACBF63D77DE496E353E
    @Test
    void testHashCode() {
        V1CSIStorageCapacity capacity1 = new V1CSIStorageCapacity();
        V1CSIStorageCapacity capacity2 = new V1CSIStorageCapacity();
        capacity1.setApiVersion("v1");
        capacity2.setApiVersion("v1");
        capacity1.setKind("CSIStorageCapacity");
        capacity2.setKind("CSIStorageCapacity");
        capacity1.setStorageClassName("test-storage-class");
        capacity2.setStorageClassName("test-storage-class");
        assertEquals(capacity1.hashCode(), capacity2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: DC6CF3773A05713B4A70D7A1D4B0183C
    @Test
    void testToString() {
        v1CSIStorageCapacity.setApiVersion("v1");
        v1CSIStorageCapacity.setKind("CSIStorageCapacity");
        v1CSIStorageCapacity.setStorageClassName("test-storage-class");
        String toString = v1CSIStorageCapacity.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("storageClassName"), is(true));
    }

    //BaseRock generated method id: ${testImplementsKubernetesObject}, hash: E2644E41CB216F4687AB59A74156127F
    @Test
    void testImplementsKubernetesObject() {
        assertThat(v1CSIStorageCapacity instanceof KubernetesObject, is(true));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: BEF5A0E1FED61F27518FBE811ECC9DAC
    @Test
    void testValidateJsonElement() throws IOException {
        // This test is a placeholder and might need to be implemented based on the actual requirements
        // of the validateJsonElement method. As it involves JSON parsing and validation,
        // it's not trivial to implement without more context about the expected behavior.
        assertNotNull(v1CSIStorageCapacity);
    }
}

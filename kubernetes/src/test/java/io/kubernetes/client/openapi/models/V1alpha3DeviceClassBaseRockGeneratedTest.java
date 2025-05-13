package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1alpha3DeviceClassSpec;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3DeviceClassBaseRockGeneratedTest {

    private V1alpha3DeviceClass deviceClass;

    private V1ObjectMeta metadata;

    private V1alpha3DeviceClassSpec spec;

    @BeforeEach
    void setUp() {
        metadata = mock(V1ObjectMeta.class);
        spec = mock(V1alpha3DeviceClassSpec.class);
        deviceClass = new V1alpha3DeviceClass();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: C11D19EC1D1A454D84C16C1A2671E6DF
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1alpha3";
        deviceClass.setApiVersion(apiVersion);
        assertEquals(apiVersion, deviceClass.getApiVersion());
    }

    //BaseRock generated method id: ${testGetKind}, hash: 1418A558AC1B92009ADA47B0104785B7
    @Test
    void testGetKind() {
        String kind = "DeviceClass";
        deviceClass.setKind(kind);
        assertEquals(kind, deviceClass.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 6EC2F22E208212D29E7F565E8E9D3C48
    @Test
    void testGetMetadata() {
        deviceClass.setMetadata(metadata);
        assertEquals(metadata, deviceClass.getMetadata());
    }

    //BaseRock generated method id: ${testGetSpec}, hash: 04D60B91709C9D85EFF7579600087360
    @Test
    void testGetSpec() {
        deviceClass.setSpec(spec);
        assertEquals(spec, deviceClass.getSpec());
    }

    //BaseRock generated method id: ${testEquals}, hash: CC7A1440048BDFB8D75012F09488BCA8
    @Test
    void testEquals() {
        V1alpha3DeviceClass deviceClass1 = new V1alpha3DeviceClass().apiVersion("v1alpha3").kind("DeviceClass").metadata(metadata).spec(spec);
        V1alpha3DeviceClass deviceClass2 = new V1alpha3DeviceClass().apiVersion("v1alpha3").kind("DeviceClass").metadata(metadata).spec(spec);
        assertThat(deviceClass1.equals(deviceClass2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 1CCC491477141F28D3CEEFC4837AD3D4
    @Test
    void testHashCode() {
        V1alpha3DeviceClass deviceClass1 = new V1alpha3DeviceClass().apiVersion("v1alpha3").kind("DeviceClass").metadata(metadata).spec(spec);
        V1alpha3DeviceClass deviceClass2 = new V1alpha3DeviceClass().apiVersion("v1alpha3").kind("DeviceClass").metadata(metadata).spec(spec);
        assertThat(deviceClass1.hashCode(), is(deviceClass2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 126FAD480F5D80167367B414BBBF8206
    @Test
    void testToString() {
        when(metadata.toString()).thenReturn("metadata");
        when(spec.toString()).thenReturn("spec");
        V1alpha3DeviceClass deviceClass = new V1alpha3DeviceClass().apiVersion("v1alpha3").kind("DeviceClass").metadata(metadata).spec(spec);
        String expected = "class V1alpha3DeviceClass {\n" + "    apiVersion: v1alpha3\n" + "    kind: DeviceClass\n" + "    metadata: metadata\n" + "    spec: spec\n" + "}";
        assertEquals(expected, deviceClass.toString());
    }

    //BaseRock generated method id: ${testConstructor}, hash: 09F61395B7366C1F808B2ABF4DB2AA58
    @Test
    void testConstructor() {
        assertThat(new V1alpha3DeviceClass(), is(notNullValue()));
    }
}

package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1TypedObjectReference;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpec;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1VolumeResourceRequirements;
import static org.junit.jupiter.api.Assertions.assertNull;
import io.kubernetes.client.openapi.models.V1TypedLocalObjectReference;
import java.util.ArrayList;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PersistentVolumeClaimSpecBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1PersistentVolumeClaimSpec}, hash: C206BCCD8C45DD1C67C56F8B6AF65FCD
    @Test
    void testV1PersistentVolumeClaimSpec() {
        V1PersistentVolumeClaimSpec spec = new V1PersistentVolumeClaimSpec();
        assertThat(spec, is(notNullValue()));
    }

    //BaseRock generated method id: ${testAccessModes}, hash: E8238C9DAF8B04C1D18323E2CFE64A3A
    @Test
    void testAccessModes() {
        V1PersistentVolumeClaimSpec spec = new V1PersistentVolumeClaimSpec();
        List<String> accessModes = Arrays.asList("ReadWriteOnce", "ReadOnlyMany");
        spec.setAccessModes(accessModes);
        assertEquals(accessModes, spec.getAccessModes());
    }

    //BaseRock generated method id: ${testAddAccessModesItem}, hash: CD9ADB74944EE067F85862A8DAB0CA9D
    @Test
    void testAddAccessModesItem() {
        V1PersistentVolumeClaimSpec spec = new V1PersistentVolumeClaimSpec();
        spec.addAccessModesItem("ReadWriteMany");
        assertThat(spec.getAccessModes(), containsInAnyOrder("ReadWriteMany"));
    }

    //BaseRock generated method id: ${testDataSource}, hash: 0BF13F42EAC13989512B3120759CAC3E
    @Test
    void testDataSource() {
        V1PersistentVolumeClaimSpec spec = new V1PersistentVolumeClaimSpec();
        V1TypedLocalObjectReference dataSource = new V1TypedLocalObjectReference();
        spec.setDataSource(dataSource);
        assertEquals(dataSource, spec.getDataSource());
    }

    //BaseRock generated method id: ${testDataSourceRef}, hash: 2099EE23FEDD8F1602087918D1DF9AF1
    @Test
    void testDataSourceRef() {
        V1PersistentVolumeClaimSpec spec = new V1PersistentVolumeClaimSpec();
        V1TypedObjectReference dataSourceRef = new V1TypedObjectReference();
        spec.setDataSourceRef(dataSourceRef);
        assertEquals(dataSourceRef, spec.getDataSourceRef());
    }

    //BaseRock generated method id: ${testResources}, hash: 1CEEB71BC2D115CB8085331E9198E363
    @Test
    void testResources() {
        V1PersistentVolumeClaimSpec spec = new V1PersistentVolumeClaimSpec();
        V1VolumeResourceRequirements resources = new V1VolumeResourceRequirements();
        spec.setResources(resources);
        assertEquals(resources, spec.getResources());
    }

    //BaseRock generated method id: ${testSelector}, hash: 461F84A72A926905121CEBAE4BD7BBBF
    @Test
    void testSelector() {
        V1PersistentVolumeClaimSpec spec = new V1PersistentVolumeClaimSpec();
        V1LabelSelector selector = new V1LabelSelector();
        spec.setSelector(selector);
        assertEquals(selector, spec.getSelector());
    }

    //BaseRock generated method id: ${testStorageClassName}, hash: 457E0EE85476D7649EF36B96C813FB91
    @Test
    void testStorageClassName() {
        V1PersistentVolumeClaimSpec spec = new V1PersistentVolumeClaimSpec();
        String storageClassName = "fast-storage";
        spec.setStorageClassName(storageClassName);
        assertEquals(storageClassName, spec.getStorageClassName());
    }

    //BaseRock generated method id: ${testVolumeAttributesClassName}, hash: 8966722B5400C25628376BA8A2E9588F
    @Test
    void testVolumeAttributesClassName() {
        V1PersistentVolumeClaimSpec spec = new V1PersistentVolumeClaimSpec();
        String volumeAttributesClassName = "high-performance";
        spec.setVolumeAttributesClassName(volumeAttributesClassName);
        assertEquals(volumeAttributesClassName, spec.getVolumeAttributesClassName());
    }

    //BaseRock generated method id: ${testVolumeMode}, hash: 6B6141E652CBC8EDDA78A2A1978ADEA1
    @Test
    void testVolumeMode() {
        V1PersistentVolumeClaimSpec spec = new V1PersistentVolumeClaimSpec();
        String volumeMode = "Filesystem";
        spec.setVolumeMode(volumeMode);
        assertEquals(volumeMode, spec.getVolumeMode());
    }

    //BaseRock generated method id: ${testVolumeName}, hash: 1151319E870B621DA90E5C984D6FE32A
    @Test
    void testVolumeName() {
        V1PersistentVolumeClaimSpec spec = new V1PersistentVolumeClaimSpec();
        String volumeName = "my-volume";
        spec.setVolumeName(volumeName);
        assertEquals(volumeName, spec.getVolumeName());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: DFDAF77FAFE7248AB9706D25D900BA5C
    @Test
    void testEqualsAndHashCode() {
        V1PersistentVolumeClaimSpec spec1 = new V1PersistentVolumeClaimSpec().accessModes(Arrays.asList("ReadWriteOnce")).storageClassName("fast-storage").volumeMode("Filesystem");
        V1PersistentVolumeClaimSpec spec2 = new V1PersistentVolumeClaimSpec().accessModes(Arrays.asList("ReadWriteOnce")).storageClassName("fast-storage").volumeMode("Filesystem");
        V1PersistentVolumeClaimSpec spec3 = new V1PersistentVolumeClaimSpec().accessModes(Arrays.asList("ReadOnlyMany")).storageClassName("slow-storage").volumeMode("Block");
        assertThat(spec1, is(equalTo(spec2)));
        assertThat(spec1.hashCode(), is(equalTo(spec2.hashCode())));
        assertThat(spec1, is(not(equalTo(spec3))));
    }

    //BaseRock generated method id: ${testToString}, hash: 4C0D032449409D7E8D0A2FE3F32721E2
    @Test
    void testToString() {
        V1PersistentVolumeClaimSpec spec = new V1PersistentVolumeClaimSpec().accessModes(Arrays.asList("ReadWriteOnce")).storageClassName("fast-storage").volumeMode("Filesystem");
        String expectedString = "class V1PersistentVolumeClaimSpec {\n" + "    accessModes: [ReadWriteOnce]\n" + "    dataSource: null\n" + "    dataSourceRef: null\n" + "    resources: null\n" + "    selector: null\n" + "    storageClassName: fast-storage\n" + "    volumeAttributesClassName: null\n" + "    volumeMode: Filesystem\n" + "    volumeName: null\n" + "}";
        assertThat(spec.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testNullValues}, hash: 1B14A12FD806FD2808F4BF74C2593589
    @Test
    void testNullValues() {
        V1PersistentVolumeClaimSpec spec = new V1PersistentVolumeClaimSpec();
        assertThat(spec.getAccessModes(), is(equalTo(new ArrayList<>())));
        assertNull(spec.getDataSource());
        assertNull(spec.getDataSourceRef());
        assertNull(spec.getResources());
        assertNull(spec.getSelector());
        assertNull(spec.getStorageClassName());
        assertNull(spec.getVolumeAttributesClassName());
        assertNull(spec.getVolumeMode());
        assertNull(spec.getVolumeName());
    }

    //BaseRock generated method id: ${testEmptyAccessModes}, hash: 91B42BA9B54BB93C0A580C7283B4EA72
    @Test
    void testEmptyAccessModes() {
        V1PersistentVolumeClaimSpec spec = new V1PersistentVolumeClaimSpec();
        spec.setAccessModes(new ArrayList<>());
        assertThat(spec.getAccessModes(), is(notNullValue()));
        assertThat(spec.getAccessModes().size(), is(0));
    }
}

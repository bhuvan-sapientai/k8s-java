package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.io.IOException;
import java.util.HashMap;
import io.kubernetes.client.common.KubernetesObject;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.openapi.models.V1TopologySelectorTerm;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1StorageClassBaseRockGeneratedTest {

    private V1StorageClass storageClass;

    @BeforeEach
    void setUp() {
        storageClass = new V1StorageClass();
    }

    //BaseRock generated method id: ${testAllowVolumeExpansion}, hash: 26565EF0CCD666B6C25C2D752856916D
    @Test
    void testAllowVolumeExpansion() {
        storageClass.setAllowVolumeExpansion(true);
        assertTrue(storageClass.getAllowVolumeExpansion());
        storageClass.setAllowVolumeExpansion(false);
        assertFalse(storageClass.getAllowVolumeExpansion());
    }

    //BaseRock generated method id: ${testAllowedTopologies}, hash: E609F5D6291A788342814192962CF059
    @Test
    void testAllowedTopologies() {
        List<V1TopologySelectorTerm> topologies = new ArrayList<>();
        V1TopologySelectorTerm term = new V1TopologySelectorTerm();
        topologies.add(term);
        storageClass.setAllowedTopologies(topologies);
        assertEquals(topologies, storageClass.getAllowedTopologies());
        storageClass.addAllowedTopologiesItem(new V1TopologySelectorTerm());
        assertEquals(2, storageClass.getAllowedTopologies().size());
    }

    //BaseRock generated method id: ${testApiVersion}, hash: FEE4C3A87A0E75A0D4F8B59833506DB0
    @Test
    void testApiVersion() {
        String apiVersion = "storage.k8s.io/v1";
        storageClass.setApiVersion(apiVersion);
        assertEquals(apiVersion, storageClass.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: F60F57F6C3E25939B5276A375ED1D97C
    @Test
    void testKind() {
        String kind = "StorageClass";
        storageClass.setKind(kind);
        assertEquals(kind, storageClass.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 2FDFE0EA2F8B17F86FEAAF981189B071
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = new V1ObjectMeta();
        storageClass.setMetadata(metadata);
        assertEquals(metadata, storageClass.getMetadata());
    }

    //BaseRock generated method id: ${testMountOptions}, hash: FE9A617BDA862F88376EA9CFB6724E66
    @Test
    void testMountOptions() {
        List<String> mountOptions = new ArrayList<>();
        mountOptions.add("ro");
        mountOptions.add("soft");
        storageClass.setMountOptions(mountOptions);
        assertEquals(mountOptions, storageClass.getMountOptions());
        storageClass.addMountOptionsItem("noatime");
        assertEquals(3, storageClass.getMountOptions().size());
    }

    //BaseRock generated method id: ${testParameters}, hash: 78C87A06BB4CC4880B6A5DD9FEE20896
    @Test
    void testParameters() {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("type", "gp2");
        parameters.put("iopsPerGB", "10");
        storageClass.setParameters(parameters);
        assertEquals(parameters, storageClass.getParameters());
        storageClass.putParametersItem("encrypted", "true");
        assertEquals(3, storageClass.getParameters().size());
    }

    //BaseRock generated method id: ${testProvisioner}, hash: 20C7C7143D22FC434FA546EE6C9B61A3
    @Test
    void testProvisioner() {
        String provisioner = "kubernetes.io/aws-ebs";
        storageClass.setProvisioner(provisioner);
        assertEquals(provisioner, storageClass.getProvisioner());
    }

    //BaseRock generated method id: ${testReclaimPolicy}, hash: 9245F908AFBDAD5EA8E76878BFD69445
    @Test
    void testReclaimPolicy() {
        String reclaimPolicy = "Delete";
        storageClass.setReclaimPolicy(reclaimPolicy);
        assertEquals(reclaimPolicy, storageClass.getReclaimPolicy());
    }

    //BaseRock generated method id: ${testVolumeBindingMode}, hash: 496DE2A94088EAA28DF0EE2D184334F6
    @Test
    void testVolumeBindingMode() {
        String volumeBindingMode = "Immediate";
        storageClass.setVolumeBindingMode(volumeBindingMode);
        assertEquals(volumeBindingMode, storageClass.getVolumeBindingMode());
    }

    //BaseRock generated method id: ${testEquals}, hash: 82F48D8807E07642B1383C730B12073D
    @Test
    void testEquals() {
        V1StorageClass storageClass1 = new V1StorageClass().allowVolumeExpansion(true).provisioner("kubernetes.io/aws-ebs").reclaimPolicy("Delete");
        V1StorageClass storageClass2 = new V1StorageClass().allowVolumeExpansion(true).provisioner("kubernetes.io/aws-ebs").reclaimPolicy("Delete");
        assertTrue(storageClass1.equals(storageClass2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 5F5F9903F6922990920F9FADECDCE8C2
    @Test
    void testHashCode() {
        V1StorageClass storageClass1 = new V1StorageClass().allowVolumeExpansion(true).provisioner("kubernetes.io/aws-ebs").reclaimPolicy("Delete");
        V1StorageClass storageClass2 = new V1StorageClass().allowVolumeExpansion(true).provisioner("kubernetes.io/aws-ebs").reclaimPolicy("Delete");
        assertEquals(storageClass1.hashCode(), storageClass2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: E61BA3808A9A49396F9CF4E070F11DCC
    @Test
    void testToString() {
        V1StorageClass storageClass = new V1StorageClass().allowVolumeExpansion(true).provisioner("kubernetes.io/aws-ebs").reclaimPolicy("Delete");
        String expectedString = "class V1StorageClass {\n" + "    allowVolumeExpansion: true\n" + "    allowedTopologies: []\n" + "    apiVersion: null\n" + "    kind: null\n" + "    metadata: null\n" + "    mountOptions: []\n" + "    parameters: {}\n" + "    provisioner: kubernetes.io/aws-ebs\n" + "    reclaimPolicy: Delete\n" + "    volumeBindingMode: null\n" + "}";
        assertEquals(expectedString, storageClass.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 7533D9800B1131985CC39DDFD614638B
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("provisioner", "kubernetes.io/aws-ebs");
        V1StorageClass.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testImplementsKubernetesObject}, hash: 2CA0EE83A888AE6CCB85930AD0748F36
    @Test
    void testImplementsKubernetesObject() {
        assertTrue(storageClass instanceof KubernetesObject);
    }

    //BaseRock generated method id: ${testReclaimPolicyValues}, hash: 674904979C0676E3763AE3448167DFE5
    @ParameterizedTest
    @ValueSource(strings = { "Retain", "Delete", "Recycle" })
    void testReclaimPolicyValues(String reclaimPolicy) {
        storageClass.setReclaimPolicy(reclaimPolicy);
        assertEquals(reclaimPolicy, storageClass.getReclaimPolicy());
    }

    //BaseRock generated method id: ${testVolumeBindingModeValues}, hash: 13FEA2CD6F22EA4BB6EB57524041F21F
    @ParameterizedTest
    @ValueSource(strings = { "Immediate", "WaitForFirstConsumer" })
    void testVolumeBindingModeValues(String volumeBindingMode) {
        storageClass.setVolumeBindingMode(volumeBindingMode);
        assertEquals(volumeBindingMode, storageClass.getVolumeBindingMode());
    }

    //BaseRock generated method id: ${testNullValues}, hash: B8E5BEA9EB65E8BF334CB9527F6A8EDA
    @Test
    void testNullValues() {
        V1StorageClass nullStorageClass = new V1StorageClass();
        assertNotNull(nullStorageClass);
        assertThat(nullStorageClass.getAllowVolumeExpansion(), is(equalTo(null)));
        assertThat(nullStorageClass.getAllowedTopologies(), is(equalTo(new ArrayList<>())));
        assertThat(nullStorageClass.getApiVersion(), is(equalTo(null)));
        assertThat(nullStorageClass.getKind(), is(equalTo(null)));
        assertThat(nullStorageClass.getMetadata(), is(equalTo(null)));
        assertThat(nullStorageClass.getMountOptions(), is(equalTo(new ArrayList<>())));
        assertThat(nullStorageClass.getParameters(), is(equalTo(new HashMap<>())));
        assertThat(nullStorageClass.getProvisioner(), is(equalTo(null)));
        assertThat(nullStorageClass.getReclaimPolicy(), is(equalTo(null)));
        assertThat(nullStorageClass.getVolumeBindingMode(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testJsonElementValidation}, hash: 59BBD590C5BEE23EDBAFD975CFBB39E5
    @Test
    void testJsonElementValidation() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("provisioner", "kubernetes.io/aws-ebs");
        jsonObject.addProperty("allowVolumeExpansion", true);
        jsonObject.addProperty("reclaimPolicy", "Delete");
        try {
            V1StorageClass.validateJsonElement(jsonObject);
        } catch (IOException e) {
            throw new AssertionError("Unexpected IOException", e);
        }
    }

    //BaseRock generated method id: ${testFromJson}, hash: C3D6BD36C6F30BC577AD58CF940CFF1F
    @Test
    void testFromJson() throws IOException {
        String json = "{\"provisioner\":\"kubernetes.io/aws-ebs\",\"allowVolumeExpansion\":true,\"reclaimPolicy\":\"Delete\"}";
        V1StorageClass fromJson = V1StorageClass.fromJson(json);
        assertNotNull(fromJson);
        assertEquals("kubernetes.io/aws-ebs", fromJson.getProvisioner());
        assertTrue(fromJson.getAllowVolumeExpansion());
        assertEquals("Delete", fromJson.getReclaimPolicy());
    }

    //BaseRock generated method id: ${testToJson}, hash: FA9EFAA3DB05DE03AC462D30D09F9E01
    @Test
    void testToJson() {
        V1StorageClass storageClass = new V1StorageClass().provisioner("kubernetes.io/aws-ebs").allowVolumeExpansion(true).reclaimPolicy("Delete");
        String json = storageClass.toJson();
        assertNotNull(json);
        assertTrue(json.contains("\"provisioner\":\"kubernetes.io/aws-ebs\""));
        assertTrue(json.contains("\"allowVolumeExpansion\":true"));
        assertTrue(json.contains("\"reclaimPolicy\":\"Delete\""));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 447AF93292134D00667CC6B632AB79B2
    @Test
    void testBuilder() {
        V1StorageClass built = new V1StorageClass().allowVolumeExpansion(true).provisioner("kubernetes.io/aws-ebs").reclaimPolicy("Delete").volumeBindingMode("Immediate");
        assertNotNull(built);
        assertTrue(built.getAllowVolumeExpansion());
        assertEquals("kubernetes.io/aws-ebs", built.getProvisioner());
        assertEquals("Delete", built.getReclaimPolicy());
        assertEquals("Immediate", built.getVolumeBindingMode());
    }
}

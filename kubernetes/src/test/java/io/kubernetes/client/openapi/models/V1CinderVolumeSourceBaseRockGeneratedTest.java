package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1CinderVolumeSource;
import io.kubernetes.client.openapi.models.V1LocalObjectReference;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CinderVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 7672CB605365B1AED61EBC23BA5C62D2
    @Test
    void testConstructor() {
        V1CinderVolumeSource cinderVolumeSource = new V1CinderVolumeSource();
        assertThat(cinderVolumeSource, is(notNullValue()));
    }

    //BaseRock generated method id: ${testFsType}, hash: 334E179C8879D57AC4EFE07D8D960069
    @Test
    void testFsType() {
        V1CinderVolumeSource cinderVolumeSource = new V1CinderVolumeSource();
        String fsType = "ext4";
        cinderVolumeSource.setFsType(fsType);
        assertThat(cinderVolumeSource.getFsType(), is(equalTo(fsType)));
    }

    //BaseRock generated method id: ${testReadOnly}, hash: BF498022ECF83759DA0A169CDF96104B
    @Test
    void testReadOnly() {
        V1CinderVolumeSource cinderVolumeSource = new V1CinderVolumeSource();
        boolean readOnly = true;
        cinderVolumeSource.setReadOnly(readOnly);
        assertThat(cinderVolumeSource.getReadOnly(), is(equalTo(readOnly)));
    }

    //BaseRock generated method id: ${testSecretRef}, hash: 05CEF5E8867C98256ECF8AEC8FAD3B5D
    @Test
    void testSecretRef() {
        V1CinderVolumeSource cinderVolumeSource = new V1CinderVolumeSource();
        V1LocalObjectReference secretRef = new V1LocalObjectReference();
        cinderVolumeSource.setSecretRef(secretRef);
        assertThat(cinderVolumeSource.getSecretRef(), is(equalTo(secretRef)));
    }

    //BaseRock generated method id: ${testVolumeID}, hash: 0420073AAB8134A6410BAD04F9BEF2BE
    @Test
    void testVolumeID() {
        V1CinderVolumeSource cinderVolumeSource = new V1CinderVolumeSource();
        String volumeID = "volume-123";
        cinderVolumeSource.setVolumeID(volumeID);
        assertThat(cinderVolumeSource.getVolumeID(), is(equalTo(volumeID)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 3C91DEFE17DCC0985C7E2648F56CC652
    @Test
    void testEquals() {
        V1CinderVolumeSource cinderVolumeSource1 = new V1CinderVolumeSource().fsType("ext4").readOnly(true).secretRef(new V1LocalObjectReference()).volumeID("volume-123");
        V1CinderVolumeSource cinderVolumeSource2 = new V1CinderVolumeSource().fsType("ext4").readOnly(true).secretRef(new V1LocalObjectReference()).volumeID("volume-123");
        assertThat(cinderVolumeSource1.equals(cinderVolumeSource2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 5A004B0FBD6AF939BBF338A6C2B2E5F1
    @Test
    void testHashCode() {
        V1CinderVolumeSource cinderVolumeSource1 = new V1CinderVolumeSource().fsType("ext4").readOnly(true).secretRef(new V1LocalObjectReference()).volumeID("volume-123");
        V1CinderVolumeSource cinderVolumeSource2 = new V1CinderVolumeSource().fsType("ext4").readOnly(true).secretRef(new V1LocalObjectReference()).volumeID("volume-123");
        assertThat(cinderVolumeSource1.hashCode(), is(equalTo(cinderVolumeSource2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: D54A207FF46DD9CEBFB9C3AC6BA30592
    @Test
    void testToString() {
        V1CinderVolumeSource cinderVolumeSource = new V1CinderVolumeSource().fsType("ext4").readOnly(true).secretRef(new V1LocalObjectReference()).volumeID("volume-123");
        String expectedString = "class V1CinderVolumeSource {\n    fsType: ext4\n    readOnly: true\n    secretRef: class V1LocalObjectReference {\n        name: null\n    }\n    volumeID: volume-123\n}";
        assertThat(cinderVolumeSource.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 515D162658A6317AE78E23D5AE936379
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("fsType", "ext4");
        jsonObject.addProperty("readOnly", true);
        jsonObject.add("secretRef", new JsonObject());
        jsonObject.addProperty("volumeID", "volume-123");
        V1CinderVolumeSource.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidField}, hash: B9E66924982270B7E5900CB491076FBB
    @Test
    void testValidateJsonElementWithInvalidField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("invalidField", "value");
        assertThrows(IllegalArgumentException.class, () -> V1CinderVolumeSource.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithMissingRequiredField}, hash: 36EB4C1EC956498BADAD07900EC26C5E
    @Test
    void testValidateJsonElementWithMissingRequiredField() {
        JsonObject jsonObject = new JsonObject();
        assertThrows(IllegalArgumentException.class, () -> V1CinderVolumeSource.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testFromJson}, hash: D4A18572D50043D696348BDB120ACD79
    @Test
    void testFromJson() throws IOException {
        String json = "{\"fsType\":\"ext4\",\"readOnly\":true,\"secretRef\":{},\"volumeID\":\"volume-123\"}";
        V1CinderVolumeSource cinderVolumeSource = V1CinderVolumeSource.fromJson(json);
        assertThat(cinderVolumeSource.getFsType(), is(equalTo("ext4")));
        assertThat(cinderVolumeSource.getReadOnly(), is(equalTo(true)));
        assertThat(cinderVolumeSource.getSecretRef(), is(notNullValue()));
        assertThat(cinderVolumeSource.getVolumeID(), is(equalTo("volume-123")));
    }

    //BaseRock generated method id: ${testToJson}, hash: 0299AE803857F847DE29A53AC2922579
    @Test
    void testToJson() {
        V1CinderVolumeSource cinderVolumeSource = new V1CinderVolumeSource().fsType("ext4").readOnly(true).secretRef(new V1LocalObjectReference()).volumeID("volume-123");
        String expectedJson = "{\"fsType\":\"ext4\",\"readOnly\":true,\"secretRef\":{},\"volumeID\":\"volume-123\"}";
        assertThat(cinderVolumeSource.toJson(), is(equalTo(expectedJson)));
    }
}

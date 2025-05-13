package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1ObjectReference;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import com.google.gson.JsonObject;
import io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1StorageOSPersistentVolumeSourceBaseRockGeneratedTest {

    @Mock
    private V1ObjectReference mockSecretRef;

    private V1StorageOSPersistentVolumeSource volumeSource;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        volumeSource = new V1StorageOSPersistentVolumeSource();
    }

    //BaseRock generated method id: ${testConstructor}, hash: A58447994BB135D14229312E7150C97A
    @Test
    void testConstructor() {
        assertNotNull(volumeSource);
    }

    //BaseRock generated method id: ${testSetAndGetFsType}, hash: 43D31284626F4336A153C8BA377C5BD1
    @ParameterizedTest
    @ValueSource(strings = { "ext4", "xfs", "ntfs" })
    void testSetAndGetFsType(String fsType) {
        volumeSource.setFsType(fsType);
        assertEquals(fsType, volumeSource.getFsType());
    }

    //BaseRock generated method id: ${testSetAndGetReadOnly}, hash: 78714B2B899378150307C8F3DFC7155B
    @Test
    void testSetAndGetReadOnly() {
        volumeSource.setReadOnly(true);
        assertTrue(volumeSource.getReadOnly());
        volumeSource.setReadOnly(false);
        assertFalse(volumeSource.getReadOnly());
    }

    //BaseRock generated method id: ${testSetAndGetSecretRef}, hash: 1B6E041D894150DCCDB363E5D106B7D2
    @Test
    void testSetAndGetSecretRef() {
        volumeSource.setSecretRef(mockSecretRef);
        assertEquals(mockSecretRef, volumeSource.getSecretRef());
    }

    //BaseRock generated method id: ${testSetAndGetVolumeName}, hash: 4173CF6ED113A945D58CCF622C646ABC
    @ParameterizedTest
    @ValueSource(strings = { "volume1", "volume2" })
    void testSetAndGetVolumeName(String volumeName) {
        volumeSource.setVolumeName(volumeName);
        assertEquals(volumeName, volumeSource.getVolumeName());
    }

    //BaseRock generated method id: ${testSetAndGetVolumeNamespace}, hash: 56B3B12BB654A491E02CE5AC1DAFD561
    @ParameterizedTest
    @ValueSource(strings = { "namespace1", "namespace2", "default" })
    void testSetAndGetVolumeNamespace(String volumeNamespace) {
        volumeSource.setVolumeNamespace(volumeNamespace);
        assertEquals(volumeNamespace, volumeSource.getVolumeNamespace());
    }

    //BaseRock generated method id: ${testEquals}, hash: 14F96CD3798AA5577A1E96E07D2E8366
    @Test
    void testEquals() {
        V1StorageOSPersistentVolumeSource source1 = new V1StorageOSPersistentVolumeSource().fsType("ext4").readOnly(true).secretRef(mockSecretRef).volumeName("vol1").volumeNamespace("ns1");
        V1StorageOSPersistentVolumeSource source2 = new V1StorageOSPersistentVolumeSource().fsType("ext4").readOnly(true).secretRef(mockSecretRef).volumeName("vol1").volumeNamespace("ns1");
        assertEquals(source1, source2);
        source2.setFsType("xfs");
        assertNotEquals(source1, source2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 8509C578AE4B045566DC0E917AEBF430
    @Test
    void testHashCode() {
        V1StorageOSPersistentVolumeSource source1 = new V1StorageOSPersistentVolumeSource().fsType("ext4").readOnly(true).secretRef(mockSecretRef).volumeName("vol1").volumeNamespace("ns1");
        V1StorageOSPersistentVolumeSource source2 = new V1StorageOSPersistentVolumeSource().fsType("ext4").readOnly(true).secretRef(mockSecretRef).volumeName("vol1").volumeNamespace("ns1");
        assertEquals(source1.hashCode(), source2.hashCode());
        source2.setFsType("xfs");
        assertNotEquals(source1.hashCode(), source2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 8FD75C4B7B8150FF83F63CCBD5FC233C
    @Test
    void testToString() {
        V1StorageOSPersistentVolumeSource source = new V1StorageOSPersistentVolumeSource().fsType("ext4").readOnly(true).secretRef(mockSecretRef).volumeName("vol1").volumeNamespace("ns1");
        String toString = source.toString();
        assertTrue(toString.contains("fsType"));
        assertTrue(toString.contains("readOnly"));
        assertTrue(toString.contains("secretRef"));
        assertTrue(toString.contains("volumeName"));
        assertTrue(toString.contains("volumeNamespace"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: A41030C56B1421872013F04805400C7C
    @Test
    void testValidateJsonElement() {
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty("fsType", "ext4");
        jsonObj.addProperty("readOnly", true);
        jsonObj.add("secretRef", new JsonObject());
        jsonObj.addProperty("volumeName", "vol1");
        jsonObj.addProperty("volumeNamespace", "ns1");
        assertDoesNotThrow(() -> V1StorageOSPersistentVolumeSource.validateJsonElement(jsonObj));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidType}, hash: 50072EA2B0D6313BE79ABC908DF6C194
    @Test
    void testValidateJsonElementWithInvalidType() {
        JsonObject jsonObj = new JsonObject();
        jsonObj.add("fsType", new JsonObject());
        assertThrows(IllegalArgumentException.class, () -> V1StorageOSPersistentVolumeSource.validateJsonElement(jsonObj));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithNullAndEmptyJson}, hash: 506634EC613C32B8A36DBD9773798A7E
    @Disabled()
    @ParameterizedTest
    @NullAndEmptySource
    void testValidateJsonElementWithNullAndEmptyJson(JsonElement jsonElement) {
        assertDoesNotThrow(() -> V1StorageOSPersistentVolumeSource.validateJsonElement(jsonElement));
    }

    //BaseRock generated method id: ${testFromJson}, hash: E5B9D60C239C9D4E3F8273500140BA66
    @Test
    void testFromJson() throws IOException {
        String json = "{\"fsType\":\"ext4\",\"readOnly\":true,\"volumeName\":\"vol1\",\"volumeNamespace\":\"ns1\"}";
        V1StorageOSPersistentVolumeSource result = V1StorageOSPersistentVolumeSource.fromJson(json);
        assertEquals("ext4", result.getFsType());
        assertTrue(result.getReadOnly());
        assertEquals("vol1", result.getVolumeName());
        assertEquals("ns1", result.getVolumeNamespace());
    }

    //BaseRock generated method id: ${testToJson}, hash: 0F3D21DE1D1E9D83052A3BFD2BEA5F9C
    @Test
    void testToJson() {
        V1StorageOSPersistentVolumeSource source = new V1StorageOSPersistentVolumeSource().fsType("ext4").readOnly(true).volumeName("vol1").volumeNamespace("ns1");
        String json = source.toJson();
        assertTrue(json.contains("\"fsType\":\"ext4\""));
        assertTrue(json.contains("\"readOnly\":true"));
        assertTrue(json.contains("\"volumeName\":\"vol1\""));
        assertTrue(json.contains("\"volumeNamespace\":\"ns1\""));
    }
}

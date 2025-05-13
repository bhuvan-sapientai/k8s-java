package io.kubernetes.client.openapi.models;

import com.google.gson.Gson;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import com.google.gson.JsonObject;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import io.kubernetes.client.openapi.JSON;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1PortworxVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1PortworxVolumeSource}, hash: 58E9BBE5E5E6474D68D5074526C46909
    @Test
    void testV1PortworxVolumeSource() {
        V1PortworxVolumeSource volumeSource = new V1PortworxVolumeSource();
        assertNotNull(volumeSource);
    }

    //BaseRock generated method id: ${testFsType}, hash: DB685CAB43725FDFDC0FECDEFAE360B8
    @Test
    void testFsType() {
        V1PortworxVolumeSource volumeSource = new V1PortworxVolumeSource();
        String fsType = "ext4";
        volumeSource.setFsType(fsType);
        assertEquals(fsType, volumeSource.getFsType());
    }

    //BaseRock generated method id: ${testReadOnly}, hash: 5DF102939447ADE7C6E1F0F8D963F65E
    @Test
    void testReadOnly() {
        V1PortworxVolumeSource volumeSource = new V1PortworxVolumeSource();
        volumeSource.setReadOnly(true);
        assertTrue(volumeSource.getReadOnly());
    }

    //BaseRock generated method id: ${testVolumeID}, hash: 106DFB1BD22B11ADE23EB0CC563A4BCB
    @Test
    void testVolumeID() {
        V1PortworxVolumeSource volumeSource = new V1PortworxVolumeSource();
        String volumeID = "pxvol";
        volumeSource.setVolumeID(volumeID);
        assertEquals(volumeID, volumeSource.getVolumeID());
    }

    //BaseRock generated method id: ${testEquals}, hash: 4D089BADE884656123A75951E52DC5E8
    @Test
    void testEquals() {
        V1PortworxVolumeSource source1 = new V1PortworxVolumeSource().fsType("ext4").readOnly(true).volumeID("pxvol1");
        V1PortworxVolumeSource source2 = new V1PortworxVolumeSource().fsType("ext4").readOnly(true).volumeID("pxvol1");
        V1PortworxVolumeSource source3 = new V1PortworxVolumeSource().fsType("xfs").readOnly(false).volumeID("pxvol2");
        assertTrue(source1.equals(source2));
        assertFalse(source1.equals(source3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 21E7C669790BD385B6BD62E387A48759
    @Test
    void testHashCode() {
        V1PortworxVolumeSource source1 = new V1PortworxVolumeSource().fsType("ext4").readOnly(true).volumeID("pxvol1");
        V1PortworxVolumeSource source2 = new V1PortworxVolumeSource().fsType("ext4").readOnly(true).volumeID("pxvol1");
        assertEquals(source1.hashCode(), source2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 8AA0FE1F01EADC046DB0624D92D8CE47
    @Test
    void testToString() {
        V1PortworxVolumeSource volumeSource = new V1PortworxVolumeSource().fsType("ext4").readOnly(true).volumeID("pxvol");
        String expected = "class V1PortworxVolumeSource {\n" + "    fsType: ext4\n" + "    readOnly: true\n" + "    volumeID: pxvol\n" + "}";
        assertEquals(expected, volumeSource.toString());
    }

    //BaseRock generated method id: ${testFsTypeWithDifferentValues}, hash: BE201CF06F378BC5B2883E8A5A06DF03
    @ParameterizedTest
    @ValueSource(strings = { "ext4", "xfs", "" })
    void testFsTypeWithDifferentValues(String fsType) {
        V1PortworxVolumeSource volumeSource = new V1PortworxVolumeSource().fsType(fsType);
        assertEquals(fsType, volumeSource.getFsType());
    }

    //BaseRock generated method id: ${testReadOnlyDefaultValue}, hash: 905C5B4E51D151EEE4EDBCDC8B31053F
    @Test
    void testReadOnlyDefaultValue() {
        V1PortworxVolumeSource volumeSource = new V1PortworxVolumeSource();
        assertNull(volumeSource.getReadOnly());
    }

    //BaseRock generated method id: ${testVolumeIDRequired}, hash: D2414FCFF4711DC4F588C7E946D5F4D7
    @Disabled()
    @Test
    void testVolumeIDRequired() {
        V1PortworxVolumeSource volumeSource = new V1PortworxVolumeSource();
        assertThrows(NullPointerException.class, () -> {
            volumeSource.volumeID(null);
        });
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 6B402DCD98140BC375776B9509C7BDF7
    @Test
    void testValidateJsonElement() throws IOException {
        V1PortworxVolumeSource volumeSource = new V1PortworxVolumeSource().fsType("ext4").readOnly(true).volumeID("pxvol");
        try (MockedStatic<V1PortworxVolumeSource> mockedStatic = mockStatic(V1PortworxVolumeSource.class)) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("fsType", "ext4");
            jsonObject.addProperty("readOnly", true);
            jsonObject.addProperty("volumeID", "pxvol");
            mockedStatic.when(() -> V1PortworxVolumeSource.validateJsonElement(any(JsonElement.class))).thenCallRealMethod();
            assertDoesNotThrow(() -> V1PortworxVolumeSource.validateJsonElement(jsonObject));
        }
    }

    //BaseRock generated method id: ${testFromJson}, hash: 1AFF9C52FE2050F073B732A87AB7DBD9
    @Test
    void testFromJson() throws IOException {
        String json = "{\"fsType\":\"ext4\",\"readOnly\":true,\"volumeID\":\"pxvol\"}";
        try (MockedStatic<JSON> jsonMockedStatic = mockStatic(JSON.class)) {
            Gson gsonMock = mock(Gson.class);
            JSON jsonMock = mock(JSON.class);
            jsonMockedStatic.when(JSON::getGson).thenReturn(gsonMock);
            when(gsonMock.fromJson(anyString(), eq(V1PortworxVolumeSource.class))).thenReturn(new V1PortworxVolumeSource().fsType("ext4").readOnly(true).volumeID("pxvol"));
            V1PortworxVolumeSource result = V1PortworxVolumeSource.fromJson(json);
            assertNotNull(result);
            assertEquals("ext4", result.getFsType());
            assertTrue(result.getReadOnly());
            assertEquals("pxvol", result.getVolumeID());
        }
    }

    //BaseRock generated method id: ${testToJson}, hash: 9CFE3662FF1C6D2640CB818D64223A8D
    @Test
    void testToJson() {
        V1PortworxVolumeSource volumeSource = new V1PortworxVolumeSource().fsType("ext4").readOnly(true).volumeID("pxvol");
        try (MockedStatic<JSON> jsonMockedStatic = mockStatic(JSON.class)) {
            Gson gsonMock = mock(Gson.class);
            jsonMockedStatic.when(JSON::getGson).thenReturn(gsonMock);
            when(gsonMock.toJson(any(V1PortworxVolumeSource.class))).thenReturn("{\"fsType\":\"ext4\",\"readOnly\":true,\"volumeID\":\"pxvol\"}");
            String result = volumeSource.toJson();
            assertEquals("{\"fsType\":\"ext4\",\"readOnly\":true,\"volumeID\":\"pxvol\"}", result);
        }
    }
}

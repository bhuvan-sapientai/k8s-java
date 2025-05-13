package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import com.google.gson.Gson;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import com.google.gson.JsonObject;
import static org.junit.jupiter.api.Assertions.*;
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

@Timeout(10)
class V1AzureFileVolumeSourceBaseRockGeneratedTest {

    private V1AzureFileVolumeSource v1AzureFileVolumeSource;

    @Mock
    private Gson gsonMock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        v1AzureFileVolumeSource = new V1AzureFileVolumeSource();
    }

    //BaseRock generated method id: ${testReadOnly}, hash: C2965ABC5FD0D2E6ADBBEC342FB0D1A6
    @Test
    void testReadOnly() {
        assertNull(v1AzureFileVolumeSource.getReadOnly());
        v1AzureFileVolumeSource.setReadOnly(true);
        assertTrue(v1AzureFileVolumeSource.getReadOnly());
        v1AzureFileVolumeSource.setReadOnly(false);
        assertFalse(v1AzureFileVolumeSource.getReadOnly());
    }

    //BaseRock generated method id: ${testSecretName}, hash: 4508ED9D5A50C8408915EC1B00389033
    @Test
    void testSecretName() {
        assertNull(v1AzureFileVolumeSource.getSecretName());
        String secretName = "testSecretName";
        v1AzureFileVolumeSource.setSecretName(secretName);
        assertEquals(secretName, v1AzureFileVolumeSource.getSecretName());
    }

    //BaseRock generated method id: ${testShareName}, hash: E0F71D3B503B632A5C194BFE4E400ACE
    @Test
    void testShareName() {
        assertNull(v1AzureFileVolumeSource.getShareName());
        String shareName = "testShareName";
        v1AzureFileVolumeSource.setShareName(shareName);
        assertEquals(shareName, v1AzureFileVolumeSource.getShareName());
    }

    //BaseRock generated method id: ${testEquals}, hash: E99FBA5618FD428EFECADD757B7C0E63
    @Test
    void testEquals() {
        V1AzureFileVolumeSource source1 = new V1AzureFileVolumeSource().readOnly(true).secretName("secret1").shareName("share1");
        V1AzureFileVolumeSource source2 = new V1AzureFileVolumeSource().readOnly(true).secretName("secret1").shareName("share1");
        V1AzureFileVolumeSource source3 = new V1AzureFileVolumeSource().readOnly(false).secretName("secret2").shareName("share2");
        assertTrue(source1.equals(source2));
        assertFalse(source1.equals(source3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 1B2DF98613AB6FAC5EC1CB89971E9424
    @Test
    void testHashCode() {
        V1AzureFileVolumeSource source1 = new V1AzureFileVolumeSource().readOnly(true).secretName("secret1").shareName("share1");
        V1AzureFileVolumeSource source2 = new V1AzureFileVolumeSource().readOnly(true).secretName("secret1").shareName("share1");
        assertEquals(source1.hashCode(), source2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: B2425BC2EA6F182B072D2B7697768A62
    @Test
    void testToString() {
        v1AzureFileVolumeSource.setReadOnly(true);
        v1AzureFileVolumeSource.setSecretName("testSecret");
        v1AzureFileVolumeSource.setShareName("testShare");
        String expected = "class V1AzureFileVolumeSource {\n    readOnly: true\n    secretName: testSecret\n    shareName: testShare\n}";
        assertEquals(expected, v1AzureFileVolumeSource.toString());
    }

    //BaseRock generated method id: ${testToJson}, hash: 5D7AE9D13A1303A8AB9923F62D9E5EC8
    @Test
    void testToJson() throws IOException {
        v1AzureFileVolumeSource.setReadOnly(true);
        v1AzureFileVolumeSource.setSecretName("testSecret");
        v1AzureFileVolumeSource.setShareName("testShare");
        try (MockedStatic<JSON> jsonStaticMock = mockStatic(JSON.class)) {
            jsonStaticMock.when(JSON::getGson).thenReturn(gsonMock);
            when(gsonMock.toJson(v1AzureFileVolumeSource)).thenReturn("{\"readOnly\":true,\"secretName\":\"testSecret\",\"shareName\":\"testShare\"}");
            String result = v1AzureFileVolumeSource.toJson();
            assertEquals("{\"readOnly\":true,\"secretName\":\"testSecret\",\"shareName\":\"testShare\"}", result);
        }
    }

    //BaseRock generated method id: ${testFromJson}, hash: 05C4A6DDC677CD7DC2C67502E4233135
    @Test
    void testFromJson() throws IOException {
        String json = "{\"readOnly\":true,\"secretName\":\"testSecret\",\"shareName\":\"testShare\"}";
        try (MockedStatic<JSON> jsonStaticMock = mockStatic(JSON.class)) {
            jsonStaticMock.when(JSON::getGson).thenReturn(gsonMock);
            when(gsonMock.fromJson(json, V1AzureFileVolumeSource.class)).thenReturn(v1AzureFileVolumeSource);
            V1AzureFileVolumeSource result = V1AzureFileVolumeSource.fromJson(json);
            assertNotNull(result);
            assertEquals(v1AzureFileVolumeSource, result);
        }
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 62DC9406E3BD3CBA4FAEE7D4F526869B
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("secretName", "testSecret");
        jsonObject.addProperty("shareName", "testShare");
        assertDoesNotThrow(() -> V1AzureFileVolumeSource.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementMissingRequiredField}, hash: CC3A84F87FEF2231864D7E4A164E6E70
    @Test
    void testValidateJsonElementMissingRequiredField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("secretName", "testSecret");
        assertThrows(IllegalArgumentException.class, () -> V1AzureFileVolumeSource.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidField}, hash: BFD907ABDDA54106ED34011CE9572CB8
    @Test
    void testValidateJsonElementWithInvalidField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("secretName", "testSecret");
        jsonObject.addProperty("shareName", "testShare");
        jsonObject.addProperty("invalidField", "invalidValue");
        assertThrows(IllegalArgumentException.class, () -> V1AzureFileVolumeSource.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithNullJsonElement}, hash: E8C5454C7B1F4A23A804147B2B93443D
    @Test
    void testValidateJsonElementWithNullJsonElement() {
        assertThrows(IllegalArgumentException.class, () -> V1AzureFileVolumeSource.validateJsonElement(null));
    }
}

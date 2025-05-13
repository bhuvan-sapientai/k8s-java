package io.kubernetes.client.openapi.models;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import com.google.gson.JsonElement;
import io.kubernetes.client.openapi.models.V1beta1CELDeviceSelector;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1beta1DeviceSelectorBaseRockGeneratedTest {

    @Mock
    private V1beta1CELDeviceSelector mockCel;

    //BaseRock generated method id: ${testConstructor}, hash: 412D8AE1B6CA50712FAAE0F5F105A7EA
    @Test
    void testConstructor() {
        V1beta1DeviceSelector selector = new V1beta1DeviceSelector();
        assertNotNull(selector);
    }

    //BaseRock generated method id: ${testCelSetter}, hash: 7CD4551E937FD03E1DCD1D34300178DC
    @Test
    void testCelSetter() {
        V1beta1DeviceSelector selector = new V1beta1DeviceSelector();
        selector.setCel(mockCel);
        assertEquals(mockCel, selector.getCel());
    }

    //BaseRock generated method id: ${testCelGetter}, hash: 1F71132EC353EA9446747032DA521D65
    @Test
    void testCelGetter() {
        V1beta1DeviceSelector selector = new V1beta1DeviceSelector();
        assertNull(selector.getCel());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 359D02DE1C09BF6B8FFBA0E248550390
    @Test
    void testEqualsWithSameObject() {
        V1beta1DeviceSelector selector = new V1beta1DeviceSelector();
        assertTrue(selector.equals(selector));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: B3D5DA2212AF2F5FE7EFDCC1871F4EF3
    @Test
    void testEqualsWithDifferentClass() {
        V1beta1DeviceSelector selector = new V1beta1DeviceSelector();
        assertFalse(selector.equals(new Object()));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentCel}, hash: AD60F75B5E87306E44EDB41937013BBC
    @Disabled()
    @Test
    void testEqualsWithDifferentCel() {
        V1beta1DeviceSelector selector1 = new V1beta1DeviceSelector().cel(mockCel);
        V1beta1DeviceSelector selector2 = new V1beta1DeviceSelector().cel(null);
        assertFalse(selector1.equals(selector2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 4B8692A33594681E63686CEF2798A235
    @Test
    void testHashCode() {
        V1beta1DeviceSelector selector1 = new V1beta1DeviceSelector().cel(mockCel);
        V1beta1DeviceSelector selector2 = new V1beta1DeviceSelector().cel(mockCel);
        assertEquals(selector1.hashCode(), selector2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 6F44E621CB4CEF2547BA82AC581CEDB7
    @Test
    void testToString() {
        V1beta1DeviceSelector selector = new V1beta1DeviceSelector().cel(mockCel);
        String result = selector.toString();
        assertTrue(result.contains("class V1beta1DeviceSelector"));
        assertTrue(result.contains("cel:"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 6903959D32509181D936366601BDF556
    @Test
    void testValidateJsonElement() throws Exception {
        JsonObject jsonObject = new JsonObject();
        JsonObject celObject = new JsonObject();
        celObject.addProperty("expression", "someExpression");
        jsonObject.add("cel", celObject);
        JsonElement jsonElement = jsonObject;
        V1beta1DeviceSelector.validateJsonElement(jsonElement);
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidField}, hash: 4CF3FB655B11B3DCE7116A1AFDAF95C7
    @Test
    void testValidateJsonElementWithInvalidField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("invalidField", "value");
        JsonElement jsonElement = jsonObject;
        assertThrows(IllegalArgumentException.class, () -> V1beta1DeviceSelector.validateJsonElement(jsonElement));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 299D8809C7F452C40C9D639D3D10068D
    @Test
    void testFromJson() throws Exception {
        String json = "{\"cel\":{\"expression\":\"someExpression\"}}";
        V1beta1DeviceSelector result = V1beta1DeviceSelector.fromJson(json);
        assertNotNull(result);
        assertNotNull(result.getCel());
    }

    //BaseRock generated method id: ${testToJson}, hash: 2F74CEE5EA6F929633F10C9B6978978F
    @Disabled()
    @Test
    void testToJson() {
        MockitoAnnotations.openMocks(this);
        doReturn("{\"expression\":\"someExpression\"}").when(mockCel).toJson();
        V1beta1DeviceSelector selector = new V1beta1DeviceSelector().cel(mockCel);
        String json = selector.toJson();
        assertTrue(json.contains("\"cel\":"));
        assertTrue(json.contains("\"expression\":\"someExpression\""));
    }
}

package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1alpha3CELDeviceSelector;
import static org.mockito.Mockito.when;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.V1alpha3DeviceSelector;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3DeviceSelectorBaseRockGeneratedTest {

    private V1alpha3DeviceSelector deviceSelector;

    @BeforeEach
    void setUp() {
        deviceSelector = new V1alpha3DeviceSelector();
    }

    //BaseRock generated method id: ${testConstructor}, hash: F81F27412A79B9F2CB084BC7CE404B4B
    @Test
    void testConstructor() {
        assertNotNull(deviceSelector);
    }

    //BaseRock generated method id: ${testCelSetter}, hash: E4CAC4FCAFBD2ECF1B42AE0069B95CE3
    @Test
    void testCelSetter() {
        V1alpha3CELDeviceSelector celDeviceSelector = mock(V1alpha3CELDeviceSelector.class);
        deviceSelector.setCel(celDeviceSelector);
        assertEquals(celDeviceSelector, deviceSelector.getCel());
    }

    //BaseRock generated method id: ${testCelGetter}, hash: 44346149A520F6C009C9DE932F0CFCC8
    @Test
    void testCelGetter() {
        V1alpha3CELDeviceSelector celDeviceSelector = mock(V1alpha3CELDeviceSelector.class);
        deviceSelector.setCel(celDeviceSelector);
        assertThat(deviceSelector.getCel(), is(notNullValue()));
        assertThat(deviceSelector.getCel(), is(equalTo(celDeviceSelector)));
    }

    //BaseRock generated method id: ${testEquals}, hash: B9D8550E5B8D653D011328F9C72CE951
    @Test
    void testEquals() {
        V1alpha3DeviceSelector selector1 = new V1alpha3DeviceSelector();
        V1alpha3DeviceSelector selector2 = new V1alpha3DeviceSelector();
        V1alpha3CELDeviceSelector celDeviceSelector = mock(V1alpha3CELDeviceSelector.class);
        selector1.setCel(celDeviceSelector);
        selector2.setCel(celDeviceSelector);
        assertThat(selector1, is(equalTo(selector2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 3470D244A892D34F3250129502617A08
    @Test
    void testHashCode() {
        V1alpha3DeviceSelector selector1 = new V1alpha3DeviceSelector();
        V1alpha3DeviceSelector selector2 = new V1alpha3DeviceSelector();
        V1alpha3CELDeviceSelector celDeviceSelector = mock(V1alpha3CELDeviceSelector.class);
        selector1.setCel(celDeviceSelector);
        selector2.setCel(celDeviceSelector);
        assertThat(selector1.hashCode(), is(equalTo(selector2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: EE309BC30734C6C66E27A2B01C8221E3
    @Test
    void testToString() {
        V1alpha3CELDeviceSelector celDeviceSelector = mock(V1alpha3CELDeviceSelector.class);
        deviceSelector.setCel(celDeviceSelector);
        String result = deviceSelector.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result.contains("cel"), is(true));
    }

    //BaseRock generated method id: ${testOpenapiFields}, hash: A909FF4CF520D36324D1CACB46C0C0BF
    @Test
    void testOpenapiFields() {
        HashSet<String> fields = V1alpha3DeviceSelector.openapiFields;
        assertThat(fields, is(notNullValue()));
        assertThat(fields.contains("cel"), is(true));
    }

    //BaseRock generated method id: ${testOpenapiRequiredFields}, hash: 1DA319D2081E17748F2FCB103C4D3926
    @Test
    void testOpenapiRequiredFields() {
        HashSet<String> requiredFields = V1alpha3DeviceSelector.openapiRequiredFields;
        assertThat(requiredFields, is(notNullValue()));
        assertThat(requiredFields.isEmpty(), is(true));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: BCB7DD57D8C65B40108E4562508FDE3D
    @Test
    void testValidateJsonElement() throws Exception {
        JsonObject jsonObject = new JsonObject();
        JsonObject celObject = new JsonObject();
        celObject.addProperty("expression", "test expression");
        jsonObject.add("cel", celObject);
        V1alpha3DeviceSelector.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testFromJson}, hash: F97DA72BC27D7D80691FF51E04440638
    @Test
    void testFromJson() throws Exception {
        String json = "{\"cel\":{\"expression\":\"test expression\"}}";
        V1alpha3DeviceSelector result = V1alpha3DeviceSelector.fromJson(json);
        assertThat(result, is(notNullValue()));
        assertThat(result.getCel(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToJson}, hash: 4020CDBF543A7293AADF422BF7630149
    @Test
    void testToJson() {
        V1alpha3CELDeviceSelector celDeviceSelector = mock(V1alpha3CELDeviceSelector.class);
        deviceSelector.setCel(celDeviceSelector);
        String json = deviceSelector.toJson();
        assertThat(json, is(notNullValue()));
        assertThat(json.contains("cel"), is(true));
    }
}

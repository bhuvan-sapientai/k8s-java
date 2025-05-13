package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1DeploymentCondition;
import com.google.gson.JsonParseException;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.io.IOException;
import java.time.ZoneOffset;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.Objects;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import org.hamcrest.Matchers;
import java.time.OffsetDateTime;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.JSON;
import org.junit.jupiter.params.provider.NullSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class // Other existing tests remain unchanged
V1DeploymentConditionBaseRockGeneratedTest {

    // Existing tests remain unchanged
    //BaseRock generated method id: ${testValidateJsonElementWithNullThrowsException}, hash: A3594B9093782A3D1631DD3E9848F65F
    @Disabled()
    @ParameterizedTest
    @NullSource
    void testValidateJsonElementWithNullThrowsException(JsonElement jsonElement) {
        IOException exception = assertThrows(IOException.class, () -> {
            V1DeploymentCondition.validateJsonElement(jsonElement);
        });
        assertThat(exception.getMessage(), is("The required field(s) [status, type] in V1DeploymentCondition is not found in the empty JSON string"));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithMissingRequiredField}, hash: C4FE492E823D5FA2CF946F97B8C3AA79
    @Disabled()
    @Test
    void testValidateJsonElementWithMissingRequiredField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("status", "True");
        IOException exception = assertThrows(IOException.class, () -> {
            V1DeploymentCondition.validateJsonElement(jsonObject);
        });
        assertThat(exception.getMessage(), is("The required field `type` is not found in the JSON string: {\"status\":\"True\"}"));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidFieldType}, hash: FD5AE74C7197D2067C068207E7AE74A7
    @Disabled()
    @Test
    void testValidateJsonElementWithInvalidFieldType() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("status", "True");
        jsonObject.add("type", new JsonObject());
        IOException exception = assertThrows(IOException.class, () -> {
            V1DeploymentCondition.validateJsonElement(jsonObject);
        });
        assertThat(exception.getMessage(), is("Expected the field `type` to be a primitive type in the JSON string but got `{}`"));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithExtraField}, hash: 3CE8A740E44FE63006BDC0835817D69C
    @Disabled()
    @Test
    void testValidateJsonElementWithExtraField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("status", "True");
        jsonObject.addProperty("type", "Available");
        jsonObject.addProperty("extraField", "value");
        IOException exception = assertThrows(IOException.class, () -> {
            V1DeploymentCondition.validateJsonElement(jsonObject);
        });
        assertThat(exception.getMessage(), startsWith("The field `extraField` in the JSON string is not defined in the `V1DeploymentCondition` properties."));
    }
}

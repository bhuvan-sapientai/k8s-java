package io.kubernetes.client.openapi.models;

import com.google.gson.JsonParseException;
import org.junit.jupiter.params.provider.MethodSource;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import static org.hamcrest.Matchers.hasItem;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import java.util.stream.Stream;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.not;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.NullSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
public class V1CustomResourceColumnDefinitionBaseRockGeneratedTest {

    // All existing test methods remain unchanged
    //BaseRock generated method id: ${testValidateJsonElementWithNull}, hash: 63B8AE536AD4EBC11C0B1D3889C00D8C
    @ParameterizedTest
    @NullSource
    public void testValidateJsonElementWithNull(JsonElement jsonElement) {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> V1CustomResourceColumnDefinition.validateJsonElement(jsonElement));
        assertThat(exception.getMessage(), containsString("The required field(s) [name, jsonPath, type] in V1CustomResourceColumnDefinition is not found in the empty JSON string"));
    }
}

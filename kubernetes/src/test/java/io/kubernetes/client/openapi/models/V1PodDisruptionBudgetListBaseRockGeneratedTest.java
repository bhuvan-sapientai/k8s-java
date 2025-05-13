package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1PodDisruptionBudget;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1PodDisruptionBudgetListBaseRockGeneratedTest {

    private V1PodDisruptionBudgetList v1PodDisruptionBudgetList;

    @BeforeEach
    void setUp() {
        v1PodDisruptionBudgetList = new V1PodDisruptionBudgetList();
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 68B21829853DEA9218B90D019A076DDD
    @Disabled
    @Test
    void testValidateJsonElement() throws IOException {
        //JsonObject jsonObject = mock(JsonObject.class);
        //JsonElement jsonElement = mock(JsonElement.class);
        //when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        //when(jsonObject.entrySet()).thenReturn(new ArrayList<>());
        //JsonElement itemsElement = mock(JsonElement.class);
        //when(jsonObject.get("items")).thenReturn(itemsElement);
        //when(itemsElement.isJsonArray()).thenReturn(true);
        //V1PodDisruptionBudgetList.validateJsonElement(jsonElement);
    }

    //BaseRock generated method id: ${testFromJson}, hash: B6366D1D7065AB6BBC2BD06459B3A4D3
    @Test
    void testFromJson() throws IOException {
        String json = "{\"items\": []}";
        V1PodDisruptionBudgetList result = V1PodDisruptionBudgetList.fromJson(json);
        assertThat(result, notNullValue());
        assertThat(result.getItems(), notNullValue());
        assertThat(result.getItems(), hasSize(0));
    }

    //BaseRock generated method id: ${testToJson}, hash: F788529A8DAB7D8EAC08AB445CA053DF
    @Test
    void testToJson() {
        String result = v1PodDisruptionBudgetList.toJson();
        assertThat(result, notNullValue());
        assertThat(result, containsString("\"items\":[]"));
    }
}
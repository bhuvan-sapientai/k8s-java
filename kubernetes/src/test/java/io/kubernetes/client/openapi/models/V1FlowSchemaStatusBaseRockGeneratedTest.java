package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import org.junit.jupiter.params.provider.NullSource;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1FlowSchemaStatusBaseRockGeneratedTest {

    private V1FlowSchemaStatus v1FlowSchemaStatus;

    @BeforeEach
    void setUp() {
        v1FlowSchemaStatus = new V1FlowSchemaStatus();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 2ADFF5629CDBEBE4D03DF91E666F379A
    @Test
    void testConstructor() {
        assertNotNull(v1FlowSchemaStatus);
    }

    //BaseRock generated method id: ${testConditions}, hash: 77212799C2FF62C9000ED614DE1D4D5B
    @Test
    void testConditions() {
        List<V1FlowSchemaCondition> conditions = new ArrayList<>();
        V1FlowSchemaCondition condition = mock(V1FlowSchemaCondition.class);
        conditions.add(condition);
        v1FlowSchemaStatus.conditions(conditions);
        assertEquals(conditions, v1FlowSchemaStatus.getConditions());
    }

    //BaseRock generated method id: ${testAddConditionsItem}, hash: F02EE0DAD77AD7EE3F70E53D4C98E076
    @Test
    void testAddConditionsItem() {
        V1FlowSchemaCondition condition = mock(V1FlowSchemaCondition.class);
        v1FlowSchemaStatus.addConditionsItem(condition);
        assertNotNull(v1FlowSchemaStatus.getConditions());
        assertEquals(1, v1FlowSchemaStatus.getConditions().size());
        assertEquals(condition, v1FlowSchemaStatus.getConditions().get(0));
    }

    //BaseRock generated method id: ${testGetConditions}, hash: 75705256088C407CB9D1E0AAA7FD6BA8
    @Test
    void testGetConditions() {
        assertThat(v1FlowSchemaStatus.getConditions(), is(empty()));
        List<V1FlowSchemaCondition> conditions = new ArrayList<>();
        v1FlowSchemaStatus.setConditions(conditions);
        assertEquals(conditions, v1FlowSchemaStatus.getConditions());
    }

    //BaseRock generated method id: ${testSetConditions}, hash: BDA163E28C13DB8BB942C254813EAA34
    @Test
    void testSetConditions() {
        List<V1FlowSchemaCondition> conditions = new ArrayList<>();
        v1FlowSchemaStatus.setConditions(conditions);
        assertEquals(conditions, v1FlowSchemaStatus.getConditions());
    }

    //BaseRock generated method id: ${testEquals}, hash: 9F9AAAE6FA25100AE98E29499CECF9AC
    @Test
    void testEquals() {
        V1FlowSchemaStatus status1 = new V1FlowSchemaStatus();
        V1FlowSchemaStatus status2 = new V1FlowSchemaStatus();
        assertTrue(status1.equals(status2));
        assertTrue(status2.equals(status1));
        List<V1FlowSchemaCondition> conditions = new ArrayList<>();
        conditions.add(mock(V1FlowSchemaCondition.class));
        status1.setConditions(conditions);
        assertFalse(status1.equals(status2));
        status2.setConditions(conditions);
        assertTrue(status1.equals(status2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: BEC29DA3F1C55887D20981F13D9765AF
    @Test
    void testHashCode() {
        V1FlowSchemaStatus status1 = new V1FlowSchemaStatus();
        V1FlowSchemaStatus status2 = new V1FlowSchemaStatus();
        assertEquals(status1.hashCode(), status2.hashCode());
        List<V1FlowSchemaCondition> conditions = new ArrayList<>();
        conditions.add(mock(V1FlowSchemaCondition.class));
        status1.setConditions(conditions);
        assertNotEquals(status1.hashCode(), status2.hashCode());
        status2.setConditions(conditions);
        assertEquals(status1.hashCode(), status2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: B9572886754F8C57EAD0F730AAB32183
    @Test
    void testToString() {
        String expectedString = "class V1FlowSchemaStatus {\n    conditions: []\n}";
        assertEquals(expectedString, v1FlowSchemaStatus.toString());
        List<V1FlowSchemaCondition> conditions = new ArrayList<>();
        V1FlowSchemaCondition condition = mock(V1FlowSchemaCondition.class);
        conditions.add(condition);
        v1FlowSchemaStatus.setConditions(conditions);
        expectedString = "class V1FlowSchemaStatus {\n    conditions: [" + condition + "]\n}";
        assertEquals(expectedString, v1FlowSchemaStatus.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 6199C40371C7100A7A6D1FB27C888420
    @Disabled()
    @ParameterizedTest
    @NullSource
    @ValueSource(strings = { "", " ", "  " })
    void testValidateJsonElement(String input) throws IOException {
        JsonElement jsonElement = input == null ? null : new JsonObject();
        if (jsonElement == null) {
            assertThrows(IllegalArgumentException.class, () -> V1FlowSchemaStatus.validateJsonElement(null));
        } else {
            assertDoesNotThrow(() -> V1FlowSchemaStatus.validateJsonElement(jsonElement));
        }
    }
}

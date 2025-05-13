package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1DaemonSetUpdateStrategyBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 05E0964141768EB357BBA747FD5BA18D
    @Test
    void testConstructor() {
        V1DaemonSetUpdateStrategy strategy = new V1DaemonSetUpdateStrategy();
        assertNotNull(strategy);
    }

    //BaseRock generated method id: ${testRollingUpdateGetterAndSetter}, hash: 055A4754B0ED8A088B0CDDAE61953547
    @Test
    void testRollingUpdateGetterAndSetter() {
        V1DaemonSetUpdateStrategy strategy = new V1DaemonSetUpdateStrategy();
        V1RollingUpdateDaemonSet rollingUpdate = mock(V1RollingUpdateDaemonSet.class);
        strategy.setRollingUpdate(rollingUpdate);
        assertEquals(rollingUpdate, strategy.getRollingUpdate());
    }

    //BaseRock generated method id: ${testTypeGetterAndSetter}, hash: E22BDE29064BB8928DB38518685179CA
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "RollingUpdate", "OnDelete" })
    void testTypeGetterAndSetter(String type) {
        V1DaemonSetUpdateStrategy strategy = new V1DaemonSetUpdateStrategy();
        strategy.setType(type);
        assertEquals(type, strategy.getType());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: BB16CBB8606D0622109F2EE6A5CA4180
    @Test
    void testEqualsAndHashCode() {
        V1RollingUpdateDaemonSet rollingUpdate1 = mock(V1RollingUpdateDaemonSet.class);
        V1RollingUpdateDaemonSet rollingUpdate2 = mock(V1RollingUpdateDaemonSet.class);
        V1DaemonSetUpdateStrategy strategy1 = new V1DaemonSetUpdateStrategy().rollingUpdate(rollingUpdate1).type("RollingUpdate");
        V1DaemonSetUpdateStrategy strategy2 = new V1DaemonSetUpdateStrategy().rollingUpdate(rollingUpdate2).type("RollingUpdate");
        V1DaemonSetUpdateStrategy strategy3 = new V1DaemonSetUpdateStrategy().rollingUpdate(mock(V1RollingUpdateDaemonSet.class)).type("OnDelete");
        assertEquals(strategy1, strategy1);
        assertNotEquals(strategy1, strategy2);
        assertNotEquals(strategy1, strategy3);
        assertNotEquals(strategy1.hashCode(), strategy2.hashCode());
        assertNotEquals(strategy1.hashCode(), strategy3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 26E7A5C8D17093DE03F8BCDB37FE0486
    @Test
    void testToString() {
        V1DaemonSetUpdateStrategy strategy = new V1DaemonSetUpdateStrategy().rollingUpdate(mock(V1RollingUpdateDaemonSet.class)).type("RollingUpdate");
        String result = strategy.toString();
        assertTrue(result.contains("rollingUpdate"));
        assertTrue(result.contains("type"));
        assertTrue(result.contains("RollingUpdate"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 752EF5C9CB0C7357942C764A168AB743
    @Test
    void testValidateJsonElement() throws Exception {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", "RollingUpdate");
        JsonObject rollingUpdateObject = new JsonObject();
        jsonObject.add("rollingUpdate", rollingUpdateObject);
        V1DaemonSetUpdateStrategy.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidField}, hash: 6D629974081196E8C3F61B6058C6830D
    @Test
    void testValidateJsonElementWithInvalidField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("invalidField", "someValue");
        assertThrows(IllegalArgumentException.class, () -> {
            V1DaemonSetUpdateStrategy.validateJsonElement(jsonObject);
        });
    }

    //BaseRock generated method id: ${testValidateJsonElementWithNullJsonElement}, hash: F3DE6B9225E9B965B2918A227224A64F
    @Disabled()
    @Test
    void testValidateJsonElementWithNullJsonElement() {
        assertDoesNotThrow(() -> {
            V1DaemonSetUpdateStrategy.validateJsonElement(null);
        });
    }
}

package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.mockito.Mockito.*;
import io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategy;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1StatefulSetUpdateStrategyBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: B9994E6C5832472B2375D556EAB4A9A4
    @Test
    void testConstructor() {
        V1StatefulSetUpdateStrategy strategy = new V1StatefulSetUpdateStrategy();
        assertNotNull(strategy);
    }

    //BaseRock generated method id: ${testRollingUpdate}, hash: 74C67B319E31A092573D0F03256A8155
    @Test
    void testRollingUpdate() {
        V1StatefulSetUpdateStrategy strategy = new V1StatefulSetUpdateStrategy();
        V1RollingUpdateStatefulSetStrategy rollingUpdate = new V1RollingUpdateStatefulSetStrategy();
        strategy.setRollingUpdate(rollingUpdate);
        assertEquals(rollingUpdate, strategy.getRollingUpdate());
    }

    //BaseRock generated method id: ${testType}, hash: E7D4619A93D45C961C50885CB352D7E4
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "OnDelete", "RollingUpdate" })
    void testType(String type) {
        V1StatefulSetUpdateStrategy strategy = new V1StatefulSetUpdateStrategy();
        strategy.setType(type);
        assertEquals(type, strategy.getType());
    }

    //BaseRock generated method id: ${testEquals}, hash: DB0A7B8F24FFB03AE5155BC5E566208A
    @Test
    void testEquals() {
        V1StatefulSetUpdateStrategy strategy1 = new V1StatefulSetUpdateStrategy().rollingUpdate(new V1RollingUpdateStatefulSetStrategy()).type("RollingUpdate");
        V1StatefulSetUpdateStrategy strategy2 = new V1StatefulSetUpdateStrategy().rollingUpdate(new V1RollingUpdateStatefulSetStrategy()).type("RollingUpdate");
        V1StatefulSetUpdateStrategy strategy3 = new V1StatefulSetUpdateStrategy().rollingUpdate(new V1RollingUpdateStatefulSetStrategy()).type("OnDelete");
        assertTrue(strategy1.equals(strategy2));
        assertFalse(strategy1.equals(strategy3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 6DC4DB3BDE740AC22DA171A75229409F
    @Test
    void testHashCode() {
        V1StatefulSetUpdateStrategy strategy1 = new V1StatefulSetUpdateStrategy().rollingUpdate(new V1RollingUpdateStatefulSetStrategy()).type("RollingUpdate");
        V1StatefulSetUpdateStrategy strategy2 = new V1StatefulSetUpdateStrategy().rollingUpdate(new V1RollingUpdateStatefulSetStrategy()).type("RollingUpdate");
        assertEquals(strategy1.hashCode(), strategy2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: CF372A76342F4BF75FD3D0DDE749C0ED
    @Test
    void testToString() {
        V1StatefulSetUpdateStrategy strategy = new V1StatefulSetUpdateStrategy().rollingUpdate(new V1RollingUpdateStatefulSetStrategy()).type("RollingUpdate");
        String expectedString = "class V1StatefulSetUpdateStrategy {\n" + "    rollingUpdate: class V1RollingUpdateStatefulSetStrategy {\n" + "        maxUnavailable: null\n" + "        partition: null\n" + "    }\n" + "    type: RollingUpdate\n" + "}";
        assertEquals(expectedString, strategy.toString());
    }
}

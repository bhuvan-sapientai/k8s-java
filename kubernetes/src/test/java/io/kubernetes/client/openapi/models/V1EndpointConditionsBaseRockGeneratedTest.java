package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1EndpointConditions;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1EndpointConditionsBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: F571347BB85037B5136F4E1509A99704
    @Test
    void testConstructor() {
        V1EndpointConditions conditions = new V1EndpointConditions();
        assertNotNull(conditions);
    }

    //BaseRock generated method id: ${testReadyGetter}, hash: 603CCCC0BD6E70B942588AFC7CF91A12
    @Test
    void testReadyGetter() {
        V1EndpointConditions conditions = new V1EndpointConditions();
        assertThat(conditions.getReady(), is(nullValue()));
    }

    //BaseRock generated method id: ${testReadySetter}, hash: 1699B49A02DE18CC71618D65840F442B
    @Test
    void testReadySetter() {
        V1EndpointConditions conditions = new V1EndpointConditions();
        conditions.setReady(true);
        assertTrue(conditions.getReady());
    }

    //BaseRock generated method id: ${testServingGetter}, hash: 51843747C2285DE859595C23CE1092BB
    @Test
    void testServingGetter() {
        V1EndpointConditions conditions = new V1EndpointConditions();
        assertThat(conditions.getServing(), is(nullValue()));
    }

    //BaseRock generated method id: ${testServingSetter}, hash: BAD6F32F5AD0A0D6EB5DAA26DCCFC63D
    @Test
    void testServingSetter() {
        V1EndpointConditions conditions = new V1EndpointConditions();
        conditions.setServing(true);
        assertTrue(conditions.getServing());
    }

    //BaseRock generated method id: ${testTerminatingGetter}, hash: 036FE967FDADF6E2CBACDA84E041ED81
    @Test
    void testTerminatingGetter() {
        V1EndpointConditions conditions = new V1EndpointConditions();
        assertThat(conditions.getTerminating(), is(nullValue()));
    }

    //BaseRock generated method id: ${testTerminatingSetter}, hash: 5C0226B2936E752D48C2AE7066A47E2A
    @Test
    void testTerminatingSetter() {
        V1EndpointConditions conditions = new V1EndpointConditions();
        conditions.setTerminating(true);
        assertTrue(conditions.getTerminating());
    }

    //BaseRock generated method id: ${testReadyFluentSetter}, hash: 98CE08F08B2F70CBC0AC214C8DB189A4
    @Test
    void testReadyFluentSetter() {
        V1EndpointConditions conditions = new V1EndpointConditions().ready(true);
        assertTrue(conditions.getReady());
    }

    //BaseRock generated method id: ${testServingFluentSetter}, hash: C144381AC3E2675E95315C9B73E42EB2
    @Test
    void testServingFluentSetter() {
        V1EndpointConditions conditions = new V1EndpointConditions().serving(true);
        assertTrue(conditions.getServing());
    }

    //BaseRock generated method id: ${testTerminatingFluentSetter}, hash: E30869946A36E0D611DF2699DE84F4B4
    @Test
    void testTerminatingFluentSetter() {
        V1EndpointConditions conditions = new V1EndpointConditions().terminating(true);
        assertTrue(conditions.getTerminating());
    }

    //BaseRock generated method id: ${testEquals}, hash: 5AE6D5FEAA83E0C1D3CB2D3A95219065
    @Test
    void testEquals() {
        V1EndpointConditions conditions1 = new V1EndpointConditions().ready(true).serving(true).terminating(false);
        V1EndpointConditions conditions2 = new V1EndpointConditions().ready(true).serving(true).terminating(false);
        V1EndpointConditions conditions3 = new V1EndpointConditions().ready(false).serving(true).terminating(true);
        assertTrue(conditions1.equals(conditions2));
        assertFalse(conditions1.equals(conditions3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 7756F34B5EBF1556063DEF98CB1D1B52
    @Test
    void testHashCode() {
        V1EndpointConditions conditions1 = new V1EndpointConditions().ready(true).serving(true).terminating(false);
        V1EndpointConditions conditions2 = new V1EndpointConditions().ready(true).serving(true).terminating(false);
        V1EndpointConditions conditions3 = new V1EndpointConditions().ready(false).serving(true).terminating(true);
        assertEquals(conditions1.hashCode(), conditions2.hashCode());
        assertFalse(conditions1.hashCode() == conditions3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 022E5A8F3AFE32162C88696840959BF4
    @Test
    void testToString() {
        V1EndpointConditions conditions = new V1EndpointConditions().ready(true).serving(false).terminating(true);
        String expected = "class V1EndpointConditions {\n    ready: true\n    serving: false\n    terminating: true\n}";
        assertEquals(expected, conditions.toString());
    }
}

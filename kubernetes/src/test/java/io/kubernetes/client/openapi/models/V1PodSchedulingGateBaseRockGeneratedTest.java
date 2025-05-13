package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PodSchedulingGateBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: C735ECA254FA59176B89CB7703F92785
    @Test
    void testConstructor() {
        V1PodSchedulingGate gate = new V1PodSchedulingGate();
        assertNotNull(gate);
    }

    //BaseRock generated method id: ${testNameSetter}, hash: 95A916DDE8C35CE861D438351D6A3400
    @Test
    void testNameSetter() {
        V1PodSchedulingGate gate = new V1PodSchedulingGate();
        gate.setName("test-gate");
        assertEquals("test-gate", gate.getName());
    }

    //BaseRock generated method id: ${testNameSetterWithDifferentValues}, hash: 783D90A3AF6ABACFA7C690E3E06CE422
    @ParameterizedTest
    @ValueSource(strings = { "gate1", "gate2", "longGateName123456789" })
    void testNameSetterWithDifferentValues(String gateName) {
        V1PodSchedulingGate gate = new V1PodSchedulingGate();
        gate.setName(gateName);
        assertEquals(gateName, gate.getName());
    }

    //BaseRock generated method id: ${testNameSetterWithNullAndEmpty}, hash: E55A325A941C5CEBC1BAB493B443AB04
    @ParameterizedTest
    @NullAndEmptySource
    void testNameSetterWithNullAndEmpty(String gateName) {
        V1PodSchedulingGate gate = new V1PodSchedulingGate();
        gate.setName(gateName);
        assertEquals(gateName, gate.getName());
    }

    //BaseRock generated method id: ${testEquals}, hash: 19AA399C57F8A5B385DD66FE1E7E7B83
    @Test
    void testEquals() {
        V1PodSchedulingGate gate1 = new V1PodSchedulingGate().name("gate1");
        V1PodSchedulingGate gate2 = new V1PodSchedulingGate().name("gate1");
        V1PodSchedulingGate gate3 = new V1PodSchedulingGate().name("gate2");
        assertTrue(gate1.equals(gate2));
        assertFalse(gate1.equals(gate3));
        assertFalse(gate1.equals(null));
        assertFalse(gate1.equals(new Object()));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 5F5927AE725BA2899DF146367918E969
    @Test
    void testHashCode() {
        V1PodSchedulingGate gate1 = new V1PodSchedulingGate().name("gate1");
        V1PodSchedulingGate gate2 = new V1PodSchedulingGate().name("gate1");
        V1PodSchedulingGate gate3 = new V1PodSchedulingGate().name("gate2");
        assertEquals(gate1.hashCode(), gate2.hashCode());
        assertNotEquals(gate1.hashCode(), gate3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 9DE512EC76378F0C78F75049429A596B
    @Test
    void testToString() {
        V1PodSchedulingGate gate = new V1PodSchedulingGate().name("test-gate");
        String expected = "class V1PodSchedulingGate {\n    name: test-gate\n}";
        assertEquals(expected, gate.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 59123CC4EDFB560E706BB17C61CC5ECD
    @Test
    void testValidateJsonElement() {
        assertThrows(IllegalArgumentException.class, () -> V1PodSchedulingGate.validateJsonElement(null));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 463C2F6648FF44BA60B8428CD23E3CE2
    @Test
    void testFromJson() throws IOException {
        String json = "{\"name\":\"test-gate\"}";
        V1PodSchedulingGate gate = V1PodSchedulingGate.fromJson(json);
        assertEquals("test-gate", gate.getName());
    }

    //BaseRock generated method id: ${testToJson}, hash: 9B441A14A54B90F0B0519FD9A7B5BAD2
    @Test
    void testToJson() {
        V1PodSchedulingGate gate = new V1PodSchedulingGate().name("test-gate");
        String json = gate.toJson();
        assertTrue(json.contains("\"name\":\"test-gate\""));
    }
}

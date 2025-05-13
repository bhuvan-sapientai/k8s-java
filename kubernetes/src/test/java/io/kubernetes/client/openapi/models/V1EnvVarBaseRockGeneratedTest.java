package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1EnvVarSource;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.not;
import io.kubernetes.client.openapi.models.V1EnvVar;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1EnvVarBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1EnvVarConstructor}, hash: 68062F859BDDE165AECF15B92275D395
    @Test
    void testV1EnvVarConstructor() {
        V1EnvVar envVar = new V1EnvVar();
        assertNotNull(envVar);
    }

    //BaseRock generated method id: ${testSetAndGetName}, hash: ADD95140B0E3B28FCBBBB8409B8A79F4
    @Test
    void testSetAndGetName() {
        V1EnvVar envVar = new V1EnvVar();
        String name = "TEST_VAR";
        envVar.setName(name);
        assertEquals(name, envVar.getName());
    }

    //BaseRock generated method id: ${testSetAndGetValue}, hash: E0E2A946F0ADF0C3FE523D592392109E
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "TEST_VAR", "ANOTHER_VAR" })
    void testSetAndGetValue(String value) {
        V1EnvVar envVar = new V1EnvVar();
        envVar.setValue(value);
        assertEquals(value, envVar.getValue());
    }

    //BaseRock generated method id: ${testSetAndGetValueFrom}, hash: 66A0E0B4314E43BEB4114844E56C0ABB
    @Test
    void testSetAndGetValueFrom() {
        V1EnvVar envVar = new V1EnvVar();
        V1EnvVarSource valueFrom = new V1EnvVarSource();
        envVar.setValueFrom(valueFrom);
        assertEquals(valueFrom, envVar.getValueFrom());
    }

    //BaseRock generated method id: ${testNameChaining}, hash: 7F2CBAD496E046501C349FA31594BE2E
    @Test
    void testNameChaining() {
        V1EnvVar envVar = new V1EnvVar().name("TEST_VAR");
        assertEquals("TEST_VAR", envVar.getName());
    }

    //BaseRock generated method id: ${testValueChaining}, hash: 5F38010A48C3CC355E2F69C3F90F8566
    @Test
    void testValueChaining() {
        V1EnvVar envVar = new V1EnvVar().value("test_value");
        assertEquals("test_value", envVar.getValue());
    }

    //BaseRock generated method id: ${testValueFromChaining}, hash: 70F260C5411F0EBF7C2A8895D2A5633E
    @Test
    void testValueFromChaining() {
        V1EnvVarSource valueFrom = new V1EnvVarSource();
        V1EnvVar envVar = new V1EnvVar().valueFrom(valueFrom);
        assertEquals(valueFrom, envVar.getValueFrom());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 1C209337A8F2D31B6A67D770D4C25E07
    @Test
    void testEqualsWithSameObject() {
        V1EnvVar envVar = new V1EnvVar().name("TEST_VAR").value("test_value");
        assertThat(envVar.equals(envVar), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 40888B1ECA5E0390FFF1EDB9E7E8FA8A
    @Test
    void testEqualsWithDifferentObject() {
        V1EnvVar envVar1 = new V1EnvVar().name("TEST_VAR1").value("test_value1");
        V1EnvVar envVar2 = new V1EnvVar().name("TEST_VAR2").value("test_value2");
        assertThat(envVar1.equals(envVar2), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: 759B3E2645561561FEC01018D7496DD7
    @Test
    void testEqualsWithNull() {
        V1EnvVar envVar = new V1EnvVar().name("TEST_VAR").value("test_value");
        assertThat(envVar.equals(null), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: ECBBF44116A2843DC8F120297EAEC98F
    @Test
    void testHashCode() {
        V1EnvVar envVar1 = new V1EnvVar().name("TEST_VAR").value("test_value");
        V1EnvVar envVar2 = new V1EnvVar().name("TEST_VAR").value("test_value");
        assertEquals(envVar1.hashCode(), envVar2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 6A1B70588F2106BAF84C5F396E4B8571
    @Test
    void testToString() {
        V1EnvVar envVar = new V1EnvVar().name("TEST_VAR").value("test_value").valueFrom(new V1EnvVarSource());
        String toString = envVar.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("name"), is(true));
        assertThat(toString.contains("value"), is(true));
        assertThat(toString.contains("valueFrom"), is(true));
    }

    //BaseRock generated method id: ${testSetNullName}, hash: CAA1BF4EA1426854DFFEC624DD748B0A
    @Disabled()
    @Test
    void testSetNullName() {
        V1EnvVar envVar = new V1EnvVar();
        assertThrows(IllegalArgumentException.class, () -> envVar.setName(null));
    }

    //BaseRock generated method id: ${testSetNullValueFrom}, hash: 8E12015C329AFB37969263CE290D3ED3
    @Test
    void testSetNullValueFrom() {
        V1EnvVar envVar = new V1EnvVar();
        envVar.setValueFrom(null);
        assertThat(envVar.getValueFrom(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: D49B2E43DEED1DD2AFBDCF9AED6939FB
    @Test
    void testEqualsWithDifferentClass() {
        V1EnvVar envVar = new V1EnvVar().name("TEST_VAR").value("test_value");
        assertThat(envVar.equals("Not a V1EnvVar"), is(false));
    }

    //BaseRock generated method id: ${testHashCodeConsistency}, hash: D8356109B6ABCBC9B1264338BAF3D6E0
    @Test
    void testHashCodeConsistency() {
        V1EnvVar envVar = new V1EnvVar().name("TEST_VAR").value("test_value");
        int initialHashCode = envVar.hashCode();
        assertThat(envVar.hashCode(), is(equalTo(initialHashCode)));
        envVar.setValue("new_value");
        assertThat(envVar.hashCode(), is(not(equalTo(initialHashCode))));
    }
}

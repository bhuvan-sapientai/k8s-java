package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.V1LocalObjectReference;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1LocalObjectReferenceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: BE73E5CBD138DF353BFAEA83D310E6CB
    @Test
    void testConstructor() {
        V1LocalObjectReference reference = new V1LocalObjectReference();
        assertNotNull(reference);
    }

    //BaseRock generated method id: ${testNameGetter}, hash: F5E9D9D1384A4395DA33CB8DDC82E986
    @Test
    void testNameGetter() {
        V1LocalObjectReference reference = new V1LocalObjectReference();
        assertThat(reference.getName(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNameSetter}, hash: 6F0625BA98B33D9003375C2CE34356BA
    @ParameterizedTest
    @ValueSource(strings = { "test", "example", "kubernetes" })
    void testNameSetter(String name) {
        V1LocalObjectReference reference = new V1LocalObjectReference();
        reference.setName(name);
        assertEquals(name, reference.getName());
    }

    //BaseRock generated method id: ${testNameSetterWithNullAndEmpty}, hash: F7192604947209A65A4C07C051583503
    @ParameterizedTest
    @NullAndEmptySource
    void testNameSetterWithNullAndEmpty(String name) {
        V1LocalObjectReference reference = new V1LocalObjectReference();
        reference.setName(name);
        assertEquals(name, reference.getName());
    }

    //BaseRock generated method id: ${testNameChainedSetter}, hash: 9C3A88C747A1143AB9943E2CAC5A94A5
    @Test
    void testNameChainedSetter() {
        V1LocalObjectReference reference = new V1LocalObjectReference().name("chained");
        assertEquals("chained", reference.getName());
    }

    //BaseRock generated method id: ${testEquals}, hash: A8AE5615B204EA44D550BE5EB2451443
    @Test
    void testEquals() {
        V1LocalObjectReference reference1 = new V1LocalObjectReference().name("test");
        V1LocalObjectReference reference2 = new V1LocalObjectReference().name("test");
        V1LocalObjectReference reference3 = new V1LocalObjectReference().name("different");
        assertThat(reference1.equals(reference2), is(true));
        assertThat(reference1.equals(reference3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 2BEC73738E975076E4B6C36DEC134A2D
    @Test
    void testHashCode() {
        V1LocalObjectReference reference1 = new V1LocalObjectReference().name("test");
        V1LocalObjectReference reference2 = new V1LocalObjectReference().name("test");
        assertEquals(reference1.hashCode(), reference2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 03A5FDA897C8E6D0FE02DC091D0B92FE
    @Test
    void testToString() {
        V1LocalObjectReference reference = new V1LocalObjectReference().name("test");
        String expectedString = "class V1LocalObjectReference {\n    name: test\n}";
        assertEquals(expectedString, reference.toString());
    }
}

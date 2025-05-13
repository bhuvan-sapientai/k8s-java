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
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1SecretReferenceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 3308CDF902D78781C5326584F27402E0
    @Test
    void testConstructor() {
        V1SecretReference secretReference = new V1SecretReference();
        assertNotNull(secretReference);
    }

    //BaseRock generated method id: ${testNameGetter}, hash: 171C9297C0FCAB4380C9A8D9837B89EF
    @Test
    void testNameGetter() {
        V1SecretReference secretReference = new V1SecretReference();
        assertNull(secretReference.getName());
    }

    //BaseRock generated method id: ${testNameSetter}, hash: 0FCF345086739CE1289ACE9CAB181104
    @Test
    void testNameSetter() {
        V1SecretReference secretReference = new V1SecretReference();
        secretReference.setName("test-name");
        assertEquals("test-name", secretReference.getName());
    }

    //BaseRock generated method id: ${testNameChaining}, hash: 81B63A0AC537BB94FADB565234E579C1
    @Test
    void testNameChaining() {
        V1SecretReference secretReference = new V1SecretReference().name("chained-name");
        assertEquals("chained-name", secretReference.getName());
    }

    //BaseRock generated method id: ${testNameSetterWithVariousInputs}, hash: F5D55261FB78EBE7AE07F8112DAA104D
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "name1", "name2", "very-long-name-with-hyphens" })
    void testNameSetterWithVariousInputs(String name) {
        V1SecretReference secretReference = new V1SecretReference();
        secretReference.setName(name);
        assertEquals(name, secretReference.getName());
    }

    //BaseRock generated method id: ${testNamespaceGetter}, hash: 36DA3874269F1533ACC22F4B6299EF7D
    @Test
    void testNamespaceGetter() {
        V1SecretReference secretReference = new V1SecretReference();
        assertNull(secretReference.getNamespace());
    }

    //BaseRock generated method id: ${testNamespaceSetter}, hash: 2D170753D50966FE11EF768319CB12BF
    @Test
    void testNamespaceSetter() {
        V1SecretReference secretReference = new V1SecretReference();
        secretReference.setNamespace("test-namespace");
        assertEquals("test-namespace", secretReference.getNamespace());
    }

    //BaseRock generated method id: ${testNamespaceChaining}, hash: C25116C0DADA200968802A29FE883959
    @Test
    void testNamespaceChaining() {
        V1SecretReference secretReference = new V1SecretReference().namespace("chained-namespace");
        assertEquals("chained-namespace", secretReference.getNamespace());
    }

    //BaseRock generated method id: ${testNamespaceSetterWithVariousInputs}, hash: 503DD5BC87422525A1D767DCB9D10AA7
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "namespace1", "namespace2", "very-long-namespace-with-hyphens" })
    void testNamespaceSetterWithVariousInputs(String namespace) {
        V1SecretReference secretReference = new V1SecretReference();
        secretReference.setNamespace(namespace);
        assertEquals(namespace, secretReference.getNamespace());
    }

    //BaseRock generated method id: ${testEquals}, hash: 78F9155BED963F39484AB83F124F9A83
    @Test
    void testEquals() {
        V1SecretReference ref1 = new V1SecretReference().name("name1").namespace("namespace1");
        V1SecretReference ref2 = new V1SecretReference().name("name1").namespace("namespace1");
        V1SecretReference ref3 = new V1SecretReference().name("name2").namespace("namespace2");
        assertTrue(ref1.equals(ref2));
        assertTrue(ref2.equals(ref1));
        assertFalse(ref1.equals(ref3));
        assertFalse(ref1.equals(null));
        assertFalse(ref1.equals(new Object()));
    }

    //BaseRock generated method id: ${testHashCode}, hash: DA2274080A76282B8CB2846AB8CF50C0
    @Test
    void testHashCode() {
        V1SecretReference ref1 = new V1SecretReference().name("name1").namespace("namespace1");
        V1SecretReference ref2 = new V1SecretReference().name("name1").namespace("namespace1");
        V1SecretReference ref3 = new V1SecretReference().name("name2").namespace("namespace2");
        assertEquals(ref1.hashCode(), ref2.hashCode());
        assertNotEquals(ref1.hashCode(), ref3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: D882195F73D907D3ED72405C95D2BB93
    @Test
    void testToString() {
        V1SecretReference secretReference = new V1SecretReference().name("test-name").namespace("test-namespace");
        String expected = "class V1SecretReference {\n" + "    name: test-name\n" + "    namespace: test-namespace\n" + "}";
        assertEquals(expected, secretReference.toString());
    }

    //BaseRock generated method id: ${testToIndentedString}, hash: 294C7EC17A69195ECCCAA6C5A2C16389
    @Test
    void testToIndentedString() {
        V1SecretReference secretReference = new V1SecretReference().name("test-name").namespace("test-namespace");
        String expected = "class V1SecretReference {\n    name: test-name\n    namespace: test-namespace\n}";
        assertEquals(expected, secretReference.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: F01C4F84BE17FADE33C369FE3CA6B315
    @Test
    void testValidateJsonElement() {
        // This method is not implemented in the provided source code
        // If it were implemented, we would test various scenarios here
    }

    //BaseRock generated method id: ${testFromJson}, hash: 18FB0B45EF5098EB7A1FAD8702954CBF
    @Test
    void testFromJson() {
        // This method relies on external JSON processing which is not mocked
        // In a real scenario, we would mock the JSON processing and test various inputs
    }

    //BaseRock generated method id: ${testToJson}, hash: 9A4B48EE9E4AFE1716E9CCE769F3D644
    @Test
    void testToJson() {
        // This method relies on external JSON processing which is not mocked
        // In a real scenario, we would mock the JSON processing and test the output
    }
}

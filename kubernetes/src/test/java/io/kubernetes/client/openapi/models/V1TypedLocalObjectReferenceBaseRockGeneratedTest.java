package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1TypedLocalObjectReference;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1TypedLocalObjectReferenceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: FAABE7C8E926245532CA82430B9EA06E
    @Test
    void testConstructor() {
        V1TypedLocalObjectReference reference = new V1TypedLocalObjectReference();
        assertNotNull(reference);
    }

    //BaseRock generated method id: ${testApiGroup}, hash: 75C5B1FA04E02087ADEA0AAA82D06A4B
    @Test
    void testApiGroup() {
        V1TypedLocalObjectReference reference = new V1TypedLocalObjectReference();
        String apiGroup = "test-api-group";
        reference.setApiGroup(apiGroup);
        assertEquals(apiGroup, reference.getApiGroup());
    }

    //BaseRock generated method id: ${testApiGroupWithVariousValues}, hash: A9517945F9FD31D7A43E875E63866FFB
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "group1", "group2" })
    void testApiGroupWithVariousValues(String apiGroup) {
        V1TypedLocalObjectReference reference = new V1TypedLocalObjectReference();
        reference.setApiGroup(apiGroup);
        assertEquals(apiGroup, reference.getApiGroup());
    }

    //BaseRock generated method id: ${testKind}, hash: C37982FBAC4787D499B143DCFFEF264F
    @Test
    void testKind() {
        V1TypedLocalObjectReference reference = new V1TypedLocalObjectReference();
        String kind = "test-kind";
        reference.setKind(kind);
        assertEquals(kind, reference.getKind());
    }

    //BaseRock generated method id: ${testKindWithVariousValues}, hash: C9ECA8BF5CB43D640F531B61484F7516
    @ParameterizedTest
    @ValueSource(strings = { "kind1", "kind2" })
    void testKindWithVariousValues(String kind) {
        V1TypedLocalObjectReference reference = new V1TypedLocalObjectReference();
        reference.setKind(kind);
        assertEquals(kind, reference.getKind());
    }

    //BaseRock generated method id: ${testName}, hash: BE659C5DC5D5131ACB1163FE3AAB569B
    @Test
    void testName() {
        V1TypedLocalObjectReference reference = new V1TypedLocalObjectReference();
        String name = "test-name";
        reference.setName(name);
        assertEquals(name, reference.getName());
    }

    //BaseRock generated method id: ${testNameWithVariousValues}, hash: A47F2CD824FCF527DE9C05EE4A09D22E
    @ParameterizedTest
    @ValueSource(strings = { "name1", "name2" })
    void testNameWithVariousValues(String name) {
        V1TypedLocalObjectReference reference = new V1TypedLocalObjectReference();
        reference.setName(name);
        assertEquals(name, reference.getName());
    }

    //BaseRock generated method id: ${testEquals}, hash: 9B9855F0988C48288548457F546EC205
    @Test
    void testEquals() {
        V1TypedLocalObjectReference reference1 = new V1TypedLocalObjectReference().apiGroup("group1").kind("kind1").name("name1");
        V1TypedLocalObjectReference reference2 = new V1TypedLocalObjectReference().apiGroup("group1").kind("kind1").name("name1");
        V1TypedLocalObjectReference reference3 = new V1TypedLocalObjectReference().apiGroup("group2").kind("kind2").name("name2");
        assertTrue(reference1.equals(reference2));
        assertTrue(reference2.equals(reference1));
        assertFalse(reference1.equals(reference3));
        assertFalse(reference1.equals(null));
        assertFalse(reference1.equals(new Object()));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 4C061AFCFAF3F41F89FF0C0433B85423
    @Test
    void testHashCode() {
        V1TypedLocalObjectReference reference1 = new V1TypedLocalObjectReference().apiGroup("group1").kind("kind1").name("name1");
        V1TypedLocalObjectReference reference2 = new V1TypedLocalObjectReference().apiGroup("group1").kind("kind1").name("name1");
        V1TypedLocalObjectReference reference3 = new V1TypedLocalObjectReference().apiGroup("group2").kind("kind2").name("name2");
        assertEquals(reference1.hashCode(), reference2.hashCode());
        assertNotEquals(reference1.hashCode(), reference3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: F7C8D251326B94ED4D0DE6FCFD201039
    @Test
    void testToString() {
        V1TypedLocalObjectReference reference = new V1TypedLocalObjectReference().apiGroup("test-group").kind("test-kind").name("test-name");
        String expected = "class V1TypedLocalObjectReference {\n" + "    apiGroup: test-group\n" + "    kind: test-kind\n" + "    name: test-name\n" + "}";
        assertEquals(expected, reference.toString());
    }

    //BaseRock generated method id: ${testBuilder}, hash: 96821F61E703E9758A60D4BFD0119DC7
    @Test
    void testBuilder() {
        V1TypedLocalObjectReference reference = new V1TypedLocalObjectReference().apiGroup("test-group").kind("test-kind").name("test-name");
        assertEquals("test-group", reference.getApiGroup());
        assertEquals("test-kind", reference.getKind());
        assertEquals("test-name", reference.getName());
    }
}

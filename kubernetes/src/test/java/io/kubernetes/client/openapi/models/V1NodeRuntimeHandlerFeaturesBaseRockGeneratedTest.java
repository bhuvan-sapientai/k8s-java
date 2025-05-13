package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1NodeRuntimeHandlerFeaturesBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 1884773FDDC7DF8DDFEB0BE973F4EB8A
    @Test
    void testConstructor() {
        V1NodeRuntimeHandlerFeatures features = new V1NodeRuntimeHandlerFeatures();
        assertNotNull(features);
    }

    //BaseRock generated method id: ${testRecursiveReadOnlyMounts}, hash: 0433FE3A5EBFAA8A3A544C7B10DF7537
    @Test
    void testRecursiveReadOnlyMounts() {
        V1NodeRuntimeHandlerFeatures features = new V1NodeRuntimeHandlerFeatures();
        assertNull(features.getRecursiveReadOnlyMounts());
        features.setRecursiveReadOnlyMounts(true);
        assertTrue(features.getRecursiveReadOnlyMounts());
        features.setRecursiveReadOnlyMounts(false);
        assertFalse(features.getRecursiveReadOnlyMounts());
    }

    //BaseRock generated method id: ${testUserNamespaces}, hash: 6D6407255854614927A0A6E4642B6414
    @Test
    void testUserNamespaces() {
        V1NodeRuntimeHandlerFeatures features = new V1NodeRuntimeHandlerFeatures();
        assertNull(features.getUserNamespaces());
        features.setUserNamespaces(true);
        assertTrue(features.getUserNamespaces());
        features.setUserNamespaces(false);
        assertFalse(features.getUserNamespaces());
    }

    //BaseRock generated method id: ${testEquals}, hash: 2D9202EB7799CAB2E873BD52CF72971B
    @Test
    void testEquals() {
        V1NodeRuntimeHandlerFeatures features1 = new V1NodeRuntimeHandlerFeatures().recursiveReadOnlyMounts(true).userNamespaces(false);
        V1NodeRuntimeHandlerFeatures features2 = new V1NodeRuntimeHandlerFeatures().recursiveReadOnlyMounts(true).userNamespaces(false);
        V1NodeRuntimeHandlerFeatures features3 = new V1NodeRuntimeHandlerFeatures().recursiveReadOnlyMounts(false).userNamespaces(true);
        assertEquals(features1, features2);
        assertNotEquals(features1, features3);
        assertNotEquals(features1, null);
        assertNotEquals(features1, new Object());
    }

    //BaseRock generated method id: ${testHashCode}, hash: 5CAD6189A4515627CCA8C335496B4137
    @Test
    void testHashCode() {
        V1NodeRuntimeHandlerFeatures features1 = new V1NodeRuntimeHandlerFeatures().recursiveReadOnlyMounts(true).userNamespaces(false);
        V1NodeRuntimeHandlerFeatures features2 = new V1NodeRuntimeHandlerFeatures().recursiveReadOnlyMounts(true).userNamespaces(false);
        assertEquals(features1.hashCode(), features2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: FABD4913A37F8056BC17A68017E97E09
    @Test
    void testToString() {
        V1NodeRuntimeHandlerFeatures features = new V1NodeRuntimeHandlerFeatures().recursiveReadOnlyMounts(true).userNamespaces(false);
        String expected = "class V1NodeRuntimeHandlerFeatures {\n    recursiveReadOnlyMounts: true\n    userNamespaces: false\n}";
        assertEquals(expected, features.toString());
    }

    //BaseRock generated method id: ${testRecursiveReadOnlyMountsParameterized}, hash: C6AE23E887F15172DB206A88042DE508
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    void testRecursiveReadOnlyMountsParameterized(boolean value) {
        V1NodeRuntimeHandlerFeatures features = new V1NodeRuntimeHandlerFeatures();
        features.setRecursiveReadOnlyMounts(value);
        assertEquals(value, features.getRecursiveReadOnlyMounts());
    }

    //BaseRock generated method id: ${testUserNamespacesParameterized}, hash: 20D2D3913438F552CB10456E205C4272
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    void testUserNamespacesParameterized(boolean value) {
        V1NodeRuntimeHandlerFeatures features = new V1NodeRuntimeHandlerFeatures();
        features.setUserNamespaces(value);
        assertEquals(value, features.getUserNamespaces());
    }
}

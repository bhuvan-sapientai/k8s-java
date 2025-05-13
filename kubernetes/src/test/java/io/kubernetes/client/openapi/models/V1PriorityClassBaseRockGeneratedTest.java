package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PriorityClassBaseRockGeneratedTest {

    private V1PriorityClass v1PriorityClass;

    @BeforeEach
    void setUp() {
        v1PriorityClass = new V1PriorityClass();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 778DF44F528FD09BD25E09CA6DD75349
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1PriorityClass.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1PriorityClass.getApiVersion());
    }

    //BaseRock generated method id: ${testDescription}, hash: 27D5AB9245340A0FFF9E531EDEFAE797
    @Test
    void testDescription() {
        String description = "Test description";
        v1PriorityClass.setDescription(description);
        assertEquals(description, v1PriorityClass.getDescription());
    }

    //BaseRock generated method id: ${testGlobalDefault}, hash: 54F799EDE96E36C68A6F2FD403D08754
    @Test
    void testGlobalDefault() {
        v1PriorityClass.setGlobalDefault(true);
        assertTrue(v1PriorityClass.getGlobalDefault());
        v1PriorityClass.setGlobalDefault(false);
        assertFalse(v1PriorityClass.getGlobalDefault());
    }

    //BaseRock generated method id: ${testKind}, hash: 17582B20A56C6A05A75551D76FB02CFD
    @Test
    void testKind() {
        String kind = "PriorityClass";
        v1PriorityClass.setKind(kind);
        assertEquals(kind, v1PriorityClass.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: E96BA58812CA0CF9935894E2F11E4A3F
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1PriorityClass.setMetadata(metadata);
        assertEquals(metadata, v1PriorityClass.getMetadata());
    }

    //BaseRock generated method id: ${testPreemptionPolicy}, hash: 256CD51E9218B73864974FFE9CE2D218
    @Test
    void testPreemptionPolicy() {
        String preemptionPolicy = "PreemptLowerPriority";
        v1PriorityClass.setPreemptionPolicy(preemptionPolicy);
        assertEquals(preemptionPolicy, v1PriorityClass.getPreemptionPolicy());
    }

    //BaseRock generated method id: ${testValue}, hash: EE0347FBCD4521834FD7EF33CB11345A
    @Test
    void testValue() {
        Integer value = 100;
        v1PriorityClass.setValue(value);
        assertEquals(value, v1PriorityClass.getValue());
    }

    //BaseRock generated method id: ${testEquals}, hash: 81A108F1F8BF1E984721AFE352C0D9FC
    @Test
    void testEquals() {
        V1PriorityClass other = new V1PriorityClass();
        assertTrue(v1PriorityClass.equals(v1PriorityClass));
        assertTrue(v1PriorityClass.equals(other));
        other.setApiVersion("v2");
        assertFalse(v1PriorityClass.equals(other));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 279F54A12F9C117168EFD1BB79AF7E27
    @Test
    void testHashCode() {
        V1PriorityClass other = new V1PriorityClass();
        assertEquals(v1PriorityClass.hashCode(), other.hashCode());
        other.setApiVersion("v2");
        assertFalse(v1PriorityClass.hashCode() == other.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 6165A7EC4FFAF98F305DBCEEB4CD09ED
    @Test
    void testToString() {
        String result = v1PriorityClass.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result.contains("V1PriorityClass"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 3D532F7981431D24633FBA10A65B39DA
    @Test
    void testBuilder() {
        String apiVersion = "v1";
        String description = "Test description";
        Boolean globalDefault = true;
        String kind = "PriorityClass";
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        String preemptionPolicy = "PreemptLowerPriority";
        Integer value = 100;
        V1PriorityClass built = new V1PriorityClass().apiVersion(apiVersion).description(description).globalDefault(globalDefault).kind(kind).metadata(metadata).preemptionPolicy(preemptionPolicy).value(value);
        assertThat(built.getApiVersion(), is(equalTo(apiVersion)));
        assertThat(built.getDescription(), is(equalTo(description)));
        assertThat(built.getGlobalDefault(), is(equalTo(globalDefault)));
        assertThat(built.getKind(), is(equalTo(kind)));
        assertThat(built.getMetadata(), is(equalTo(metadata)));
        assertThat(built.getPreemptionPolicy(), is(equalTo(preemptionPolicy)));
        assertThat(built.getValue(), is(equalTo(value)));
    }

    //BaseRock generated method id: ${testNullValues}, hash: 86B23521CF5EACAE405FFD40CF5D28AA
    @Test
    void testNullValues() {
        v1PriorityClass.setApiVersion(null);
        assertNull(v1PriorityClass.getApiVersion());
        v1PriorityClass.setDescription(null);
        assertNull(v1PriorityClass.getDescription());
        v1PriorityClass.setGlobalDefault(null);
        assertNull(v1PriorityClass.getGlobalDefault());
        v1PriorityClass.setKind(null);
        assertNull(v1PriorityClass.getKind());
        v1PriorityClass.setMetadata(null);
        assertNull(v1PriorityClass.getMetadata());
        v1PriorityClass.setPreemptionPolicy(null);
        assertNull(v1PriorityClass.getPreemptionPolicy());
        v1PriorityClass.setValue(null);
        assertNull(v1PriorityClass.getValue());
    }
}

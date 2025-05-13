package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1Preconditions;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PreconditionsBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1PreconditionsConstructor}, hash: 962D1B7F72AE57F3DFF7A40F732C3D3A
    @Test
    void testV1PreconditionsConstructor() {
        V1Preconditions preconditions = new V1Preconditions();
        assertThat(preconditions, is(notNullValue()));
    }

    //BaseRock generated method id: ${testResourceVersion}, hash: D900CAC0D4BDF9CAE9A076AE12F0C0C2
    @Test
    void testResourceVersion() {
        V1Preconditions preconditions = new V1Preconditions();
        String resourceVersion = "1.0";
        preconditions.setResourceVersion(resourceVersion);
        assertEquals(resourceVersion, preconditions.getResourceVersion());
    }

    //BaseRock generated method id: ${testUid}, hash: C3EF2C0005C0D112AA42B624D1886B52
    @Test
    void testUid() {
        V1Preconditions preconditions = new V1Preconditions();
        String uid = "test-uid";
        preconditions.setUid(uid);
        assertEquals(uid, preconditions.getUid());
    }

    //BaseRock generated method id: ${testEquals}, hash: BD2F29B18F948ECA2BC4D37543A684CF
    @Test
    void testEquals() {
        V1Preconditions preconditions1 = new V1Preconditions().resourceVersion("1.0").uid("test-uid");
        V1Preconditions preconditions2 = new V1Preconditions().resourceVersion("1.0").uid("test-uid");
        V1Preconditions preconditions3 = new V1Preconditions().resourceVersion("2.0").uid("other-uid");
        assertEquals(preconditions1, preconditions2);
        assertNotEquals(preconditions1, preconditions3);
    }

    //BaseRock generated method id: ${testHashCode}, hash: E4DFA07CC608E9901BF4F63E480E6D58
    @Test
    void testHashCode() {
        V1Preconditions preconditions1 = new V1Preconditions().resourceVersion("1.0").uid("test-uid");
        V1Preconditions preconditions2 = new V1Preconditions().resourceVersion("1.0").uid("test-uid");
        assertEquals(preconditions1.hashCode(), preconditions2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: CA11225748EF7DAB5135B631E37CD414
    @Test
    void testToString() {
        V1Preconditions preconditions = new V1Preconditions().resourceVersion("1.0").uid("test-uid");
        String expectedString = "class V1Preconditions {\n    resourceVersion: 1.0\n    uid: test-uid\n}";
        assertEquals(expectedString, preconditions.toString());
    }

    //BaseRock generated method id: ${testBuilder}, hash: C71DBF1E5715C974194BAA8DECE40345
    @Test
    void testBuilder() {
        V1Preconditions preconditions = new V1Preconditions().resourceVersion("1.0").uid("test-uid");
        assertThat(preconditions.getResourceVersion(), is(equalTo("1.0")));
        assertThat(preconditions.getUid(), is(equalTo("test-uid")));
    }
}

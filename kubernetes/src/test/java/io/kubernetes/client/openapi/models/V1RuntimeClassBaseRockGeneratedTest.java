package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1Scheduling;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1Overhead;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1RuntimeClassBaseRockGeneratedTest {

    private V1RuntimeClass v1RuntimeClass;

    @BeforeEach
    void setUp() {
        v1RuntimeClass = new V1RuntimeClass();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 00EEBFF299C058A9D35BBB3D86FF26B8
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1RuntimeClass.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1RuntimeClass.getApiVersion());
    }

    //BaseRock generated method id: ${testHandler}, hash: EACAC8B50C67E57076D518A7DF3337F1
    @Test
    void testHandler() {
        String handler = "runc";
        v1RuntimeClass.setHandler(handler);
        assertEquals(handler, v1RuntimeClass.getHandler());
    }

    //BaseRock generated method id: ${testKind}, hash: 30B2B452F46F2F14FFFBB31923CD3E6B
    @Test
    void testKind() {
        String kind = "RuntimeClass";
        v1RuntimeClass.setKind(kind);
        assertEquals(kind, v1RuntimeClass.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 1AC407D28823BC0EBE8EEF1731419F68
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1RuntimeClass.setMetadata(metadata);
        assertEquals(metadata, v1RuntimeClass.getMetadata());
    }

    //BaseRock generated method id: ${testOverhead}, hash: 89DB0A41A71B31049D394018451F87EF
    @Test
    void testOverhead() {
        V1Overhead overhead = mock(V1Overhead.class);
        v1RuntimeClass.setOverhead(overhead);
        assertEquals(overhead, v1RuntimeClass.getOverhead());
    }

    //BaseRock generated method id: ${testScheduling}, hash: EB886C57A9803B3E5E8A38F6B4A16D7C
    @Test
    void testScheduling() {
        V1Scheduling scheduling = mock(V1Scheduling.class);
        v1RuntimeClass.setScheduling(scheduling);
        assertEquals(scheduling, v1RuntimeClass.getScheduling());
    }

    //BaseRock generated method id: ${testEquals}, hash: AAC8647410C758797CD3E06C8A96ACF7
    @Test
    void testEquals() {
        V1RuntimeClass other = new V1RuntimeClass();
        other.setApiVersion("v1");
        other.setHandler("runc");
        other.setKind("RuntimeClass");
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1Overhead overhead = mock(V1Overhead.class);
        V1Scheduling scheduling = mock(V1Scheduling.class);
        other.setMetadata(metadata);
        other.setOverhead(overhead);
        other.setScheduling(scheduling);
        v1RuntimeClass.setApiVersion("v1");
        v1RuntimeClass.setHandler("runc");
        v1RuntimeClass.setKind("RuntimeClass");
        v1RuntimeClass.setMetadata(metadata);
        v1RuntimeClass.setOverhead(overhead);
        v1RuntimeClass.setScheduling(scheduling);
        assertThat(v1RuntimeClass, is(equalTo(other)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 1CBEB3FFE6446A1BF15C91223C2F8DFE
    @Test
    void testHashCode() {
        v1RuntimeClass.setApiVersion("v1");
        v1RuntimeClass.setHandler("runc");
        v1RuntimeClass.setKind("RuntimeClass");
        v1RuntimeClass.setMetadata(mock(V1ObjectMeta.class));
        v1RuntimeClass.setOverhead(mock(V1Overhead.class));
        v1RuntimeClass.setScheduling(mock(V1Scheduling.class));
        int hashCode = v1RuntimeClass.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 76C86653C7A84CD1F5138B76B3D4A54B
    @Test
    void testToString() {
        v1RuntimeClass.setApiVersion("v1");
        v1RuntimeClass.setHandler("runc");
        v1RuntimeClass.setKind("RuntimeClass");
        v1RuntimeClass.setMetadata(mock(V1ObjectMeta.class));
        v1RuntimeClass.setOverhead(mock(V1Overhead.class));
        v1RuntimeClass.setScheduling(mock(V1Scheduling.class));
        String toString = v1RuntimeClass.toString();
        assertThat(toString, is(notNullValue()));
    }

    //BaseRock generated method id: ${testNullValues}, hash: A8CD58DEB9A96915FA6E5C954D61DC23
    @Test
    void testNullValues() {
        assertNull(v1RuntimeClass.getApiVersion());
        assertNull(v1RuntimeClass.getHandler());
        assertNull(v1RuntimeClass.getKind());
        assertNull(v1RuntimeClass.getMetadata());
        assertNull(v1RuntimeClass.getOverhead());
        assertNull(v1RuntimeClass.getScheduling());
    }
}

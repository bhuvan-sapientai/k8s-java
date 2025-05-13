package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1beta1DeviceClassSpec;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1DeviceClassBaseRockGeneratedTest {

    private V1beta1DeviceClass v1beta1DeviceClass;

    @BeforeEach
    void setUp() {
        v1beta1DeviceClass = new V1beta1DeviceClass();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: BE5C3216005719EB0A4428FB76279DA8
    @Test
    void testApiVersion() {
        String apiVersion = "v1beta1";
        v1beta1DeviceClass.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1beta1DeviceClass.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: A0D258099B12AC030BE9B11D6646D9CB
    @Test
    void testKind() {
        String kind = "DeviceClass";
        v1beta1DeviceClass.setKind(kind);
        assertEquals(kind, v1beta1DeviceClass.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 0A82585716C04639588D6D17D7B6CF67
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1beta1DeviceClass.setMetadata(metadata);
        assertEquals(metadata, v1beta1DeviceClass.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: 30A7F0FBBB61B664986DC4B4DC3350F7
    @Test
    void testSpec() {
        V1beta1DeviceClassSpec spec = mock(V1beta1DeviceClassSpec.class);
        v1beta1DeviceClass.setSpec(spec);
        assertEquals(spec, v1beta1DeviceClass.getSpec());
    }

    //BaseRock generated method id: ${testEquals}, hash: CBE24ED4EA0772926204894552D6F0DB
    @Test
    void testEquals() {
        V1beta1DeviceClass other = new V1beta1DeviceClass();
        String apiVersion = "v1beta1";
        String kind = "DeviceClass";
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1beta1DeviceClassSpec spec = mock(V1beta1DeviceClassSpec.class);
        other.setApiVersion(apiVersion);
        other.setKind(kind);
        other.setMetadata(metadata);
        other.setSpec(spec);
        v1beta1DeviceClass.setApiVersion(apiVersion);
        v1beta1DeviceClass.setKind(kind);
        v1beta1DeviceClass.setMetadata(metadata);
        v1beta1DeviceClass.setSpec(spec);
        assertThat(v1beta1DeviceClass, is(equalTo(other)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: C1FA1FC13815C68AC3BFC69FD50AF3AC
    @Test
    void testHashCode() {
        v1beta1DeviceClass.setApiVersion("v1beta1");
        v1beta1DeviceClass.setKind("DeviceClass");
        v1beta1DeviceClass.setMetadata(mock(V1ObjectMeta.class));
        v1beta1DeviceClass.setSpec(mock(V1beta1DeviceClassSpec.class));
        int hashCode = v1beta1DeviceClass.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: FAA409972B8CA95F95A896C5A94F1088
    @Test
    void testToString() {
        v1beta1DeviceClass.setApiVersion("v1beta1");
        v1beta1DeviceClass.setKind("DeviceClass");
        v1beta1DeviceClass.setMetadata(mock(V1ObjectMeta.class));
        v1beta1DeviceClass.setSpec(mock(V1beta1DeviceClassSpec.class));
        String toString = v1beta1DeviceClass.toString();
        assertNotNull(toString);
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("spec"), is(true));
    }

    //BaseRock generated method id: ${testConstructor}, hash: F4C2C13E0161F4DC5EEE44B45A673436
    @Test
    void testConstructor() {
        assertNotNull(new V1beta1DeviceClass());
    }
}

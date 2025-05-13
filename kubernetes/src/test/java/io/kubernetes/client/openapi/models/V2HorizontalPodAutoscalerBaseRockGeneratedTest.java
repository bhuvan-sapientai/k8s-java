package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatus;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpec;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V2HorizontalPodAutoscalerBaseRockGeneratedTest {

    private V2HorizontalPodAutoscaler v2HorizontalPodAutoscaler;

    @BeforeEach
    void setUp() {
        v2HorizontalPodAutoscaler = new V2HorizontalPodAutoscaler();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 9B57F7D456DA1E43932172DF4AB22F29
    @Test
    void testApiVersion() {
        String apiVersion = "v2";
        v2HorizontalPodAutoscaler.setApiVersion(apiVersion);
        assertEquals(apiVersion, v2HorizontalPodAutoscaler.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: A5F9A92995D14D20230E27DC64BC6292
    @Test
    void testKind() {
        String kind = "HorizontalPodAutoscaler";
        v2HorizontalPodAutoscaler.setKind(kind);
        assertEquals(kind, v2HorizontalPodAutoscaler.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 03C83AFC56A73D9E8C3679DCBABD4F3B
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v2HorizontalPodAutoscaler.setMetadata(metadata);
        assertThat(v2HorizontalPodAutoscaler.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testSpec}, hash: F8AEB37736E9BB42F8AEA595F039A7AA
    @Test
    void testSpec() {
        V2HorizontalPodAutoscalerSpec spec = mock(V2HorizontalPodAutoscalerSpec.class);
        v2HorizontalPodAutoscaler.setSpec(spec);
        assertThat(v2HorizontalPodAutoscaler.getSpec(), is(equalTo(spec)));
    }

    //BaseRock generated method id: ${testStatus}, hash: A2D240EB483C898E4326BB9A6AD9D406
    @Test
    void testStatus() {
        V2HorizontalPodAutoscalerStatus status = mock(V2HorizontalPodAutoscalerStatus.class);
        v2HorizontalPodAutoscaler.setStatus(status);
        assertThat(v2HorizontalPodAutoscaler.getStatus(), is(equalTo(status)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 5C78CCFD056770099B02883599CF728B
    @Test
    void testEquals() {
        V2HorizontalPodAutoscaler other = new V2HorizontalPodAutoscaler();
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V2HorizontalPodAutoscalerSpec spec = mock(V2HorizontalPodAutoscalerSpec.class);
        V2HorizontalPodAutoscalerStatus status = mock(V2HorizontalPodAutoscalerStatus.class);
        other.setApiVersion("v2");
        other.setKind("HorizontalPodAutoscaler");
        other.setMetadata(metadata);
        other.setSpec(spec);
        other.setStatus(status);
        v2HorizontalPodAutoscaler.setApiVersion("v2");
        v2HorizontalPodAutoscaler.setKind("HorizontalPodAutoscaler");
        v2HorizontalPodAutoscaler.setMetadata(metadata);
        v2HorizontalPodAutoscaler.setSpec(spec);
        v2HorizontalPodAutoscaler.setStatus(status);
        assertThat(v2HorizontalPodAutoscaler, is(equalTo(other)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: E2056E349DBE98B1BE5D9D39886164D0
    @Test
    void testHashCode() {
        v2HorizontalPodAutoscaler.setApiVersion("v2");
        v2HorizontalPodAutoscaler.setKind("HorizontalPodAutoscaler");
        v2HorizontalPodAutoscaler.setMetadata(mock(V1ObjectMeta.class));
        v2HorizontalPodAutoscaler.setSpec(mock(V2HorizontalPodAutoscalerSpec.class));
        v2HorizontalPodAutoscaler.setStatus(mock(V2HorizontalPodAutoscalerStatus.class));
        int hashCode = v2HorizontalPodAutoscaler.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 6E1E61B376AE490288EE9BCD611D37B0
    @Test
    void testToString() {
        v2HorizontalPodAutoscaler.setApiVersion("v2");
        v2HorizontalPodAutoscaler.setKind("HorizontalPodAutoscaler");
        v2HorizontalPodAutoscaler.setMetadata(mock(V1ObjectMeta.class));
        v2HorizontalPodAutoscaler.setSpec(mock(V2HorizontalPodAutoscalerSpec.class));
        v2HorizontalPodAutoscaler.setStatus(mock(V2HorizontalPodAutoscalerStatus.class));
        String toString = v2HorizontalPodAutoscaler.toString();
        assertNotNull(toString);
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("spec"), is(true));
        assertThat(toString.contains("status"), is(true));
    }

    //BaseRock generated method id: ${testConstructor}, hash: 9978444FF86B80C9CE3B4D62CB58CC1A
    @Test
    void testConstructor() {
        assertNotNull(v2HorizontalPodAutoscaler);
    }
}

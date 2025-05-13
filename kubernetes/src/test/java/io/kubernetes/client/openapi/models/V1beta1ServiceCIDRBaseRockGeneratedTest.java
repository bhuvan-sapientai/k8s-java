package io.kubernetes.client.openapi.models;

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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.not;
import io.kubernetes.client.openapi.models.V1beta1ServiceCIDRSpec;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.V1beta1ServiceCIDRStatus;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1ServiceCIDRBaseRockGeneratedTest {

    private V1beta1ServiceCIDR serviceCIDR;

    @BeforeEach
    void setUp() {
        serviceCIDR = new V1beta1ServiceCIDR();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 926E654085C3CD6F55AEFC4716EF8042
    @Test
    void testApiVersion() {
        String apiVersion = "v1beta1";
        serviceCIDR.setApiVersion(apiVersion);
        assertEquals(apiVersion, serviceCIDR.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: D1B3D49692F31429C6BB8DC9836337FE
    @Test
    void testKind() {
        String kind = "ServiceCIDR";
        serviceCIDR.setKind(kind);
        assertEquals(kind, serviceCIDR.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 1E8D300C5FF711FA1B2B655C6ADC96A3
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        when(metadata.getName()).thenReturn("test-metadata");
        serviceCIDR.setMetadata(metadata);
        assertThat(serviceCIDR.getMetadata(), is(notNullValue()));
        assertEquals("test-metadata", serviceCIDR.getMetadata().getName());
    }

    //BaseRock generated method id: ${testSpec}, hash: EEF04E2BD0D72D7B02B904903527AFC0
    @Test
    void testSpec() {
        V1beta1ServiceCIDRSpec spec = mock(V1beta1ServiceCIDRSpec.class);
        serviceCIDR.setSpec(spec);
        assertThat(serviceCIDR.getSpec(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testStatus}, hash: DFF24559F026A511CE622E1495CA0A26
    @Test
    void testStatus() {
        V1beta1ServiceCIDRStatus status = mock(V1beta1ServiceCIDRStatus.class);
        serviceCIDR.setStatus(status);
        assertThat(serviceCIDR.getStatus(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testEquals}, hash: 10F46BAA4CAE9EDF25E0D36A93B2F959
    @Test
    void testEquals() {
        V1beta1ServiceCIDR serviceCIDR1 = new V1beta1ServiceCIDR();
        V1beta1ServiceCIDR serviceCIDR2 = new V1beta1ServiceCIDR();
        assertThat(serviceCIDR1.equals(serviceCIDR2), is(true));
        serviceCIDR1.setApiVersion("v1");
        assertThat(serviceCIDR1.equals(serviceCIDR2), is(false));
        serviceCIDR2.setApiVersion("v1");
        assertThat(serviceCIDR1.equals(serviceCIDR2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: F6D992B2EABA0FC4717D86823D39802F
    @Test
    void testHashCode() {
        V1beta1ServiceCIDR serviceCIDR1 = new V1beta1ServiceCIDR();
        V1beta1ServiceCIDR serviceCIDR2 = new V1beta1ServiceCIDR();
        assertThat(serviceCIDR1.hashCode(), equalTo(serviceCIDR2.hashCode()));
        serviceCIDR1.setApiVersion("v1");
        assertThat(serviceCIDR1.hashCode(), is(not(equalTo(serviceCIDR2.hashCode()))));
        serviceCIDR2.setApiVersion("v1");
        assertThat(serviceCIDR1.hashCode(), equalTo(serviceCIDR2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: FA213836C1C4AF76249F3F389F1FCD93
    @Test
    void testToString() {
        V1beta1ServiceCIDR serviceCIDR = new V1beta1ServiceCIDR();
        serviceCIDR.setApiVersion("v1");
        serviceCIDR.setKind("ServiceCIDR");
        String expected = "class V1beta1ServiceCIDR {\n" + "    apiVersion: v1\n" + "    kind: ServiceCIDR\n" + "    metadata: null\n" + "    spec: null\n" + "    status: null\n" + "}";
        assertThat(serviceCIDR.toString(), equalTo(expected));
    }

    //BaseRock generated method id: ${testConstructor}, hash: 6BD24902288AD1188E63DC7CA415C59D
    @Test
    void testConstructor() {
        assertNotNull(new V1beta1ServiceCIDR());
    }
}

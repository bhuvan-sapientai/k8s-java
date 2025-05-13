package io.kubernetes.client.openapi.models;

import java.util.List;
import io.kubernetes.client.openapi.models.V1Taint;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1NodeConfigSource;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1NodeSpecBaseRockGeneratedTest {

    @Mock
    private V1NodeConfigSource mockConfigSource;

    @Mock
    private V1Taint mockTaint;

    private V1NodeSpec v1NodeSpec;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        v1NodeSpec = new V1NodeSpec();
    }

    //BaseRock generated method id: ${testConfigSource}, hash: 873D7289E893C998DE48A6F496939A92
    @Test
    void testConfigSource() {
        v1NodeSpec.setConfigSource(mockConfigSource);
        assertEquals(mockConfigSource, v1NodeSpec.getConfigSource());
    }

    //BaseRock generated method id: ${testExternalID}, hash: 043B9D6199356BBAA7A02B5FB0F23F22
    @ParameterizedTest
    @ValueSource(strings = { "externalID1", "externalID2" })
    @NullAndEmptySource
    void testExternalID(String externalID) {
        v1NodeSpec.setExternalID(externalID);
        assertEquals(externalID, v1NodeSpec.getExternalID());
    }

    //BaseRock generated method id: ${testPodCIDR}, hash: 6DBA8A07450968276E7310714D4A76A0
    @ParameterizedTest
    @ValueSource(strings = { "10.0.0.0/24", "192.168.1.0/24" })
    @NullAndEmptySource
    void testPodCIDR(String podCIDR) {
        v1NodeSpec.setPodCIDR(podCIDR);
        assertEquals(podCIDR, v1NodeSpec.getPodCIDR());
    }

    //BaseRock generated method id: ${testPodCIDRs}, hash: 1DC0324120DD6CCDE61B2878D42E2C96
    @Test
    void testPodCIDRs() {
        List<String> podCIDRs = new ArrayList<>();
        podCIDRs.add("10.0.0.0/24");
        podCIDRs.add("192.168.1.0/24");
        v1NodeSpec.setPodCIDRs(podCIDRs);
        assertEquals(podCIDRs, v1NodeSpec.getPodCIDRs());
    }

    //BaseRock generated method id: ${testAddPodCIDRsItem}, hash: 7BE0C9AF5ABC10FA6B385A56233068A2
    @Test
    void testAddPodCIDRsItem() {
        String podCIDR = "10.0.0.0/24";
        v1NodeSpec.addPodCIDRsItem(podCIDR);
        assertTrue(v1NodeSpec.getPodCIDRs().contains(podCIDR));
    }

    //BaseRock generated method id: ${testProviderID}, hash: E0BEC68DE77D3C21D060A8628BDAE2A1
    @ParameterizedTest
    @ValueSource(strings = { "provider1", "provider2" })
    @NullAndEmptySource
    void testProviderID(String providerID) {
        v1NodeSpec.setProviderID(providerID);
        assertEquals(providerID, v1NodeSpec.getProviderID());
    }

    //BaseRock generated method id: ${testTaints}, hash: E34C1DC7DBCD170203704236C38369FA
    @Test
    void testTaints() {
        List<V1Taint> taints = new ArrayList<>();
        taints.add(mockTaint);
        v1NodeSpec.setTaints(taints);
        assertEquals(taints, v1NodeSpec.getTaints());
    }

    //BaseRock generated method id: ${testAddTaintsItem}, hash: 0E2A0055CDBD3CFBDE2FB2BAC551AAB9
    @Test
    void testAddTaintsItem() {
        v1NodeSpec.addTaintsItem(mockTaint);
        assertTrue(v1NodeSpec.getTaints().contains(mockTaint));
    }

    //BaseRock generated method id: ${testUnschedulable}, hash: A888F68A8FF26EACE10B5915A117B872
    @Test
    void testUnschedulable() {
        v1NodeSpec.setUnschedulable(true);
        assertTrue(v1NodeSpec.getUnschedulable());
        v1NodeSpec.setUnschedulable(false);
        assertFalse(v1NodeSpec.getUnschedulable());
    }

    //BaseRock generated method id: ${testEquals}, hash: 1FE17E02A03DED55A0961FFBDFAA2C37
    @Test
    void testEquals() {
        V1NodeSpec spec1 = new V1NodeSpec().configSource(mockConfigSource).externalID("ext1").podCIDR("10.0.0.0/24").providerID("provider1").unschedulable(true);
        V1NodeSpec spec2 = new V1NodeSpec().configSource(mockConfigSource).externalID("ext1").podCIDR("10.0.0.0/24").providerID("provider1").unschedulable(true);
        V1NodeSpec spec3 = new V1NodeSpec().configSource(mockConfigSource).externalID("ext2").podCIDR("192.168.1.0/24").providerID("provider2").unschedulable(false);
        assertEquals(spec1, spec2);
        assertNotEquals(spec1, spec3);
    }

    //BaseRock generated method id: ${testHashCode}, hash: A366102468F26D49BAA0E36CDF2DA286
    @Test
    void testHashCode() {
        V1NodeSpec spec1 = new V1NodeSpec().configSource(mockConfigSource).externalID("ext1").podCIDR("10.0.0.0/24").providerID("provider1").unschedulable(true);
        V1NodeSpec spec2 = new V1NodeSpec().configSource(mockConfigSource).externalID("ext1").podCIDR("10.0.0.0/24").providerID("provider1").unschedulable(true);
        assertEquals(spec1.hashCode(), spec2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 551F9F8E6864A9EEA04AA8B453EB2FF4
    @Test
    void testToString() {
        v1NodeSpec.setConfigSource(mockConfigSource);
        v1NodeSpec.setExternalID("ext1");
        v1NodeSpec.setPodCIDR("10.0.0.0/24");
        v1NodeSpec.setProviderID("provider1");
        v1NodeSpec.setUnschedulable(true);
        String toString = v1NodeSpec.toString();
        assertThat(toString, containsString("configSource"));
        assertThat(toString, containsString("externalID"));
        assertThat(toString, containsString("podCIDR"));
        assertThat(toString, containsString("providerID"));
        assertThat(toString, containsString("unschedulable"));
    }
}

package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import io.kubernetes.client.openapi.models.V1CSIDriverSpec;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import io.kubernetes.client.openapi.models.StorageV1TokenRequest;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CSIDriverSpecBaseRockGeneratedTest {

    private V1CSIDriverSpec v1CSIDriverSpec;

    @BeforeEach
    void setUp() {
        v1CSIDriverSpec = new V1CSIDriverSpec();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 59B3018D88FA590FA96AF655EAF9657B
    @Test
    void testConstructor() {
        assertNotNull(v1CSIDriverSpec);
    }

    //BaseRock generated method id: ${testAttachRequired}, hash: FB78D55D20BF53474719BFA92316BA35
    @Test
    void testAttachRequired() {
        assertNull(v1CSIDriverSpec.getAttachRequired());
        v1CSIDriverSpec.setAttachRequired(true);
        assertTrue(v1CSIDriverSpec.getAttachRequired());
        v1CSIDriverSpec.setAttachRequired(false);
        assertFalse(v1CSIDriverSpec.getAttachRequired());
    }

    //BaseRock generated method id: ${testFsGroupPolicy}, hash: FBA7A6AEE27C66212F2578537B06EDD3
    @ParameterizedTest
    @ValueSource(strings = { "ReadWriteOnceWithFSType", "None", "File" })
    void testFsGroupPolicy(String policy) {
        v1CSIDriverSpec.setFsGroupPolicy(policy);
        assertEquals(policy, v1CSIDriverSpec.getFsGroupPolicy());
    }

    //BaseRock generated method id: ${testPodInfoOnMount}, hash: 673D880C4DCE045D800768D8D5F27B93
    @Test
    void testPodInfoOnMount() {
        assertNull(v1CSIDriverSpec.getPodInfoOnMount());
        v1CSIDriverSpec.setPodInfoOnMount(true);
        assertTrue(v1CSIDriverSpec.getPodInfoOnMount());
        v1CSIDriverSpec.setPodInfoOnMount(false);
        assertFalse(v1CSIDriverSpec.getPodInfoOnMount());
    }

    //BaseRock generated method id: ${testRequiresRepublish}, hash: 6242933149CB2E33E35720C904D38312
    @Test
    void testRequiresRepublish() {
        assertNull(v1CSIDriverSpec.getRequiresRepublish());
        v1CSIDriverSpec.setRequiresRepublish(true);
        assertTrue(v1CSIDriverSpec.getRequiresRepublish());
        v1CSIDriverSpec.setRequiresRepublish(false);
        assertFalse(v1CSIDriverSpec.getRequiresRepublish());
    }

    //BaseRock generated method id: ${testSeLinuxMount}, hash: 4CD41210D9F90CF91C03210A2452FC82
    @Test
    void testSeLinuxMount() {
        assertNull(v1CSIDriverSpec.getSeLinuxMount());
        v1CSIDriverSpec.setSeLinuxMount(true);
        assertTrue(v1CSIDriverSpec.getSeLinuxMount());
        v1CSIDriverSpec.setSeLinuxMount(false);
        assertFalse(v1CSIDriverSpec.getSeLinuxMount());
    }

    //BaseRock generated method id: ${testStorageCapacity}, hash: B4EA248E0675F566F184613CCBFD837C
    @Test
    void testStorageCapacity() {
        assertNull(v1CSIDriverSpec.getStorageCapacity());
        v1CSIDriverSpec.setStorageCapacity(true);
        assertTrue(v1CSIDriverSpec.getStorageCapacity());
        v1CSIDriverSpec.setStorageCapacity(false);
        assertFalse(v1CSIDriverSpec.getStorageCapacity());
    }

    //BaseRock generated method id: ${testTokenRequests}, hash: 26702C79EB835C9EBEC238D0E437CE01
    @Test
    void testTokenRequests() {
        List<StorageV1TokenRequest> tokenRequests = new ArrayList<>();
        StorageV1TokenRequest tokenRequest = new StorageV1TokenRequest();
        tokenRequests.add(tokenRequest);
        v1CSIDriverSpec.setTokenRequests(tokenRequests);
        assertEquals(tokenRequests, v1CSIDriverSpec.getTokenRequests());
        v1CSIDriverSpec.addTokenRequestsItem(new StorageV1TokenRequest());
        assertEquals(2, v1CSIDriverSpec.getTokenRequests().size());
    }

    //BaseRock generated method id: ${testVolumeLifecycleModes}, hash: 47FFFA8C99E2B54035D56F96E4571709
    @ParameterizedTest
    @ValueSource(strings = { "Persistent", "Ephemeral" })
    void testVolumeLifecycleModes(String mode) {
        List<String> modes = new ArrayList<>();
        modes.add(mode);
        v1CSIDriverSpec.setVolumeLifecycleModes(modes);
        assertEquals(modes, v1CSIDriverSpec.getVolumeLifecycleModes());
        v1CSIDriverSpec.addVolumeLifecycleModesItem("NewMode");
        assertEquals(2, v1CSIDriverSpec.getVolumeLifecycleModes().size());
        assertTrue(v1CSIDriverSpec.getVolumeLifecycleModes().contains("NewMode"));
    }

    //BaseRock generated method id: ${testEquals}, hash: 6F754AB543ADAE7F1A44E2C9517273E2
    @Test
    void testEquals() {
        V1CSIDriverSpec spec1 = new V1CSIDriverSpec().attachRequired(true).fsGroupPolicy("ReadWriteOnceWithFSType").podInfoOnMount(true).requiresRepublish(false).seLinuxMount(true).storageCapacity(false);
        V1CSIDriverSpec spec2 = new V1CSIDriverSpec().attachRequired(true).fsGroupPolicy("ReadWriteOnceWithFSType").podInfoOnMount(true).requiresRepublish(false).seLinuxMount(true).storageCapacity(false);
        assertEquals(spec1, spec2);
        assertEquals(spec1.hashCode(), spec2.hashCode());
        spec2.setAttachRequired(false);
        assertNotEquals(spec1, spec2);
    }

    //BaseRock generated method id: ${testToString}, hash: CF1992F3390C04953F37898018B768C1
    @Test
    void testToString() {
        v1CSIDriverSpec.setAttachRequired(true);
        v1CSIDriverSpec.setFsGroupPolicy("ReadWriteOnceWithFSType");
        v1CSIDriverSpec.setPodInfoOnMount(true);
        v1CSIDriverSpec.setRequiresRepublish(false);
        v1CSIDriverSpec.setSeLinuxMount(true);
        v1CSIDriverSpec.setStorageCapacity(false);
        String toString = v1CSIDriverSpec.toString();
        assertThat(toString, containsString("attachRequired: true"));
        assertThat(toString, containsString("fsGroupPolicy: ReadWriteOnceWithFSType"));
        assertThat(toString, containsString("podInfoOnMount: true"));
        assertThat(toString, containsString("requiresRepublish: false"));
        assertThat(toString, containsString("seLinuxMount: true"));
        assertThat(toString, containsString("storageCapacity: false"));
    }

    //BaseRock generated method id: ${testFsGroupPolicyWithInvalidInput}, hash: 0F4C608E3F2FD8E2169B1F1C446E6B9B
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "  ", "\t", "\n" })
    void testFsGroupPolicyWithInvalidInput(String input) {
        v1CSIDriverSpec.setFsGroupPolicy(input);
        assertEquals(input, v1CSIDriverSpec.getFsGroupPolicy());
    }

    //BaseRock generated method id: ${testNullTokenRequests}, hash: 632EC0022FBCFF77E987A280ECB60A2A
    @Test
    void testNullTokenRequests() {
        v1CSIDriverSpec.setTokenRequests(null);
        assertNull(v1CSIDriverSpec.getTokenRequests());
        v1CSIDriverSpec.addTokenRequestsItem(new StorageV1TokenRequest());
        assertNotNull(v1CSIDriverSpec.getTokenRequests());
        assertEquals(1, v1CSIDriverSpec.getTokenRequests().size());
    }

    //BaseRock generated method id: ${testNullVolumeLifecycleModes}, hash: 95ABF35AD06377A3FB174B7F5896473E
    @Test
    void testNullVolumeLifecycleModes() {
        v1CSIDriverSpec.setVolumeLifecycleModes(null);
        assertNull(v1CSIDriverSpec.getVolumeLifecycleModes());
        v1CSIDriverSpec.addVolumeLifecycleModesItem("NewMode");
        assertNotNull(v1CSIDriverSpec.getVolumeLifecycleModes());
        assertEquals(1, v1CSIDriverSpec.getVolumeLifecycleModes().size());
    }
}

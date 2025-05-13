package io.kubernetes.client.openapi.models;

import java.util.List;
import io.kubernetes.client.openapi.models.V1AppArmorProfile;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1Sysctl;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1SELinuxOptions;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions;
import io.kubernetes.client.openapi.models.V1PodSecurityContext;
import io.kubernetes.client.openapi.models.V1SeccompProfile;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PodSecurityContextBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1PodSecurityContextConstructor}, hash: 982B458E203A38F0601E6B1513923D7F
    @Test
    void testV1PodSecurityContextConstructor() {
        V1PodSecurityContext podSecurityContext = new V1PodSecurityContext();
        assertNotNull(podSecurityContext);
    }

    //BaseRock generated method id: ${testAppArmorProfile}, hash: CC0C0A5852200C6F866790FC439DC152
    @Test
    void testAppArmorProfile() {
        V1AppArmorProfile appArmorProfile = mock(V1AppArmorProfile.class);
        V1PodSecurityContext podSecurityContext = new V1PodSecurityContext().appArmorProfile(appArmorProfile);
        assertEquals(appArmorProfile, podSecurityContext.getAppArmorProfile());
    }

    //BaseRock generated method id: ${testFsGroup}, hash: 1DF26BB5517108F2BE873C1EF0D2F22A
    @Test
    void testFsGroup() {
        Long fsGroup = 1000L;
        V1PodSecurityContext podSecurityContext = new V1PodSecurityContext().fsGroup(fsGroup);
        assertEquals(fsGroup, podSecurityContext.getFsGroup());
    }

    //BaseRock generated method id: ${testFsGroupChangePolicy}, hash: 3D15741E3EDAFA2ED43CE482173F31EF
    @Test
    void testFsGroupChangePolicy() {
        String fsGroupChangePolicy = "OnRootMismatch";
        V1PodSecurityContext podSecurityContext = new V1PodSecurityContext().fsGroupChangePolicy(fsGroupChangePolicy);
        assertEquals(fsGroupChangePolicy, podSecurityContext.getFsGroupChangePolicy());
    }

    //BaseRock generated method id: ${testRunAsGroup}, hash: 49E64FCDC67ACAEEA0714E861B28CED2
    @Test
    void testRunAsGroup() {
        Long runAsGroup = 2000L;
        V1PodSecurityContext podSecurityContext = new V1PodSecurityContext().runAsGroup(runAsGroup);
        assertEquals(runAsGroup, podSecurityContext.getRunAsGroup());
    }

    //BaseRock generated method id: ${testRunAsNonRoot}, hash: C4D2AB92BDAA1EE5A73856796D698C43
    @Test
    void testRunAsNonRoot() {
        Boolean runAsNonRoot = true;
        V1PodSecurityContext podSecurityContext = new V1PodSecurityContext().runAsNonRoot(runAsNonRoot);
        assertEquals(runAsNonRoot, podSecurityContext.getRunAsNonRoot());
    }

    //BaseRock generated method id: ${testRunAsUser}, hash: A8DB67E8F9D10EE5989B21A8F7204BB5
    @Test
    void testRunAsUser() {
        Long runAsUser = 3000L;
        V1PodSecurityContext podSecurityContext = new V1PodSecurityContext().runAsUser(runAsUser);
        assertEquals(runAsUser, podSecurityContext.getRunAsUser());
    }

    //BaseRock generated method id: ${testSeLinuxChangePolicy}, hash: F8C7DD65E565FAE9274BBA83E8785AC1
    @Test
    void testSeLinuxChangePolicy() {
        String seLinuxChangePolicy = "MountOption";
        V1PodSecurityContext podSecurityContext = new V1PodSecurityContext().seLinuxChangePolicy(seLinuxChangePolicy);
        assertEquals(seLinuxChangePolicy, podSecurityContext.getSeLinuxChangePolicy());
    }

    //BaseRock generated method id: ${testSeLinuxOptions}, hash: 8CA90308C7E0E9B86C57176AFCA0ECAF
    @Test
    void testSeLinuxOptions() {
        V1SELinuxOptions seLinuxOptions = mock(V1SELinuxOptions.class);
        V1PodSecurityContext podSecurityContext = new V1PodSecurityContext().seLinuxOptions(seLinuxOptions);
        assertEquals(seLinuxOptions, podSecurityContext.getSeLinuxOptions());
    }

    //BaseRock generated method id: ${testSeccompProfile}, hash: 78279FAF0517CEAB88C85FFD46073BEF
    @Test
    void testSeccompProfile() {
        V1SeccompProfile seccompProfile = mock(V1SeccompProfile.class);
        V1PodSecurityContext podSecurityContext = new V1PodSecurityContext().seccompProfile(seccompProfile);
        assertEquals(seccompProfile, podSecurityContext.getSeccompProfile());
    }

    //BaseRock generated method id: ${testSupplementalGroups}, hash: 7400939571551B24D212DDAEE93348DF
    @Test
    void testSupplementalGroups() {
        List<Long> supplementalGroups = new ArrayList<>();
        supplementalGroups.add(4000L);
        supplementalGroups.add(5000L);
        V1PodSecurityContext podSecurityContext = new V1PodSecurityContext().supplementalGroups(supplementalGroups);
        assertEquals(supplementalGroups, podSecurityContext.getSupplementalGroups());
    }

    //BaseRock generated method id: ${testAddSupplementalGroupsItem}, hash: DFA04F747FDEA667EE7E4535606829D6
    @Test
    void testAddSupplementalGroupsItem() {
        Long supplementalGroupItem = 6000L;
        V1PodSecurityContext podSecurityContext = new V1PodSecurityContext().addSupplementalGroupsItem(supplementalGroupItem);
        assertThat(podSecurityContext.getSupplementalGroups(), is(notNullValue()));
        assertThat(podSecurityContext.getSupplementalGroups().size(), is(1));
        assertThat(podSecurityContext.getSupplementalGroups().get(0), is(equalTo(supplementalGroupItem)));
    }

    //BaseRock generated method id: ${testSupplementalGroupsPolicy}, hash: 1897E3662FE0B166525FA49CC5115730
    @Test
    void testSupplementalGroupsPolicy() {
        String supplementalGroupsPolicy = "Strict";
        V1PodSecurityContext podSecurityContext = new V1PodSecurityContext().supplementalGroupsPolicy(supplementalGroupsPolicy);
        assertEquals(supplementalGroupsPolicy, podSecurityContext.getSupplementalGroupsPolicy());
    }

    //BaseRock generated method id: ${testSysctls}, hash: 068AA77075186C179E8B9BA3A769443A
    @Test
    void testSysctls() {
        List<V1Sysctl> sysctls = new ArrayList<>();
        sysctls.add(mock(V1Sysctl.class));
        V1PodSecurityContext podSecurityContext = new V1PodSecurityContext().sysctls(sysctls);
        assertEquals(sysctls, podSecurityContext.getSysctls());
    }

    //BaseRock generated method id: ${testAddSysctlsItem}, hash: 090ADA43E3887159B8361B2083613296
    @Test
    void testAddSysctlsItem() {
        V1Sysctl sysctlItem = mock(V1Sysctl.class);
        V1PodSecurityContext podSecurityContext = new V1PodSecurityContext().addSysctlsItem(sysctlItem);
        assertThat(podSecurityContext.getSysctls(), is(notNullValue()));
        assertThat(podSecurityContext.getSysctls().size(), is(1));
        assertThat(podSecurityContext.getSysctls().get(0), is(equalTo(sysctlItem)));
    }

    //BaseRock generated method id: ${testWindowsOptions}, hash: 106F7C38510EE2D92D0743996C2400D2
    @Test
    void testWindowsOptions() {
        V1WindowsSecurityContextOptions windowsOptions = mock(V1WindowsSecurityContextOptions.class);
        V1PodSecurityContext podSecurityContext = new V1PodSecurityContext().windowsOptions(windowsOptions);
        assertEquals(windowsOptions, podSecurityContext.getWindowsOptions());
    }

    //BaseRock generated method id: ${testToString}, hash: D0DA70C2A685B54F9AEF8872AF06966A
    @Test
    void testToString() {
        V1PodSecurityContext podSecurityContext = new V1PodSecurityContext().fsGroup(1000L).runAsGroup(2000L).runAsNonRoot(true).runAsUser(3000L);
        String toString = podSecurityContext.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("fsGroup"), is(true));
        assertThat(toString.contains("runAsGroup"), is(true));
        assertThat(toString.contains("runAsNonRoot"), is(true));
        assertThat(toString.contains("runAsUser"), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: DD8FFC20219E4D840698B2F06D7EE703
    @Test
    void testHashCode() {
        V1PodSecurityContext podSecurityContext1 = new V1PodSecurityContext().fsGroup(1000L).runAsGroup(2000L);
        V1PodSecurityContext podSecurityContext2 = new V1PodSecurityContext().fsGroup(1000L).runAsGroup(2000L);
        assertEquals(podSecurityContext1.hashCode(), podSecurityContext2.hashCode());
    }

    //BaseRock generated method id: ${testEquals}, hash: EF172F5EA1C56DE7699E2804C7DA15D8
    @Test
    void testEquals() {
        V1PodSecurityContext podSecurityContext1 = new V1PodSecurityContext().fsGroup(1000L).runAsGroup(2000L);
        V1PodSecurityContext podSecurityContext2 = new V1PodSecurityContext().fsGroup(1000L).runAsGroup(2000L);
        V1PodSecurityContext podSecurityContext3 = new V1PodSecurityContext().fsGroup(3000L).runAsGroup(4000L);
        assertThat(podSecurityContext1.equals(podSecurityContext2), is(true));
        assertThat(podSecurityContext1.equals(podSecurityContext3), is(false));
    }
}

package io.kubernetes.client.openapi.models;

import static org.junit.jupiter.api.Assertions.assertAll;
import io.kubernetes.client.openapi.models.V1AppArmorProfile;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1SELinuxOptions;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import io.kubernetes.client.openapi.models.V1Capabilities;
import io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions;
import io.kubernetes.client.openapi.models.V1SeccompProfile;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1SecurityContextBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1SecurityContextConstructor}, hash: 89586D4BDB0EFBBB3116E9D0C0063468
    @Test
    void testV1SecurityContextConstructor() {
        V1SecurityContext securityContext = new V1SecurityContext();
        assertThat(securityContext, is(notNullValue()));
    }

    //BaseRock generated method id: ${testAllowPrivilegeEscalation}, hash: EF425AA1FBC3AD47A3F4DBE076C94455
    @Test
    void testAllowPrivilegeEscalation() {
        V1SecurityContext securityContext = new V1SecurityContext();
        securityContext.setAllowPrivilegeEscalation(true);
        assertTrue(securityContext.getAllowPrivilegeEscalation());
        securityContext.setAllowPrivilegeEscalation(false);
        assertFalse(securityContext.getAllowPrivilegeEscalation());
        securityContext.setAllowPrivilegeEscalation(null);
        assertNull(securityContext.getAllowPrivilegeEscalation());
    }

    //BaseRock generated method id: ${testAppArmorProfile}, hash: F63F7EA595B821BE9CEECD5E1A858447
    @Test
    void testAppArmorProfile() {
        V1SecurityContext securityContext = new V1SecurityContext();
        V1AppArmorProfile appArmorProfile = new V1AppArmorProfile();
        securityContext.setAppArmorProfile(appArmorProfile);
        assertEquals(appArmorProfile, securityContext.getAppArmorProfile());
        securityContext.setAppArmorProfile(null);
        assertNull(securityContext.getAppArmorProfile());
    }

    //BaseRock generated method id: ${testCapabilities}, hash: EE228E2969913EE7E77CCE70350940B4
    @Test
    void testCapabilities() {
        V1SecurityContext securityContext = new V1SecurityContext();
        V1Capabilities capabilities = new V1Capabilities();
        securityContext.setCapabilities(capabilities);
        assertEquals(capabilities, securityContext.getCapabilities());
        securityContext.setCapabilities(null);
        assertNull(securityContext.getCapabilities());
    }

    //BaseRock generated method id: ${testPrivileged}, hash: B2A34D39FBF2FDF2423E463FB1E31FE1
    @Test
    void testPrivileged() {
        V1SecurityContext securityContext = new V1SecurityContext();
        securityContext.setPrivileged(true);
        assertTrue(securityContext.getPrivileged());
        securityContext.setPrivileged(false);
        assertFalse(securityContext.getPrivileged());
        securityContext.setPrivileged(null);
        assertNull(securityContext.getPrivileged());
    }

    //BaseRock generated method id: ${testProcMount}, hash: D2DAF1FA88D34D521A88611B51E9D928
    @Test
    void testProcMount() {
        V1SecurityContext securityContext = new V1SecurityContext();
        securityContext.setProcMount("Default");
        assertEquals("Default", securityContext.getProcMount());
        securityContext.setProcMount(null);
        assertNull(securityContext.getProcMount());
    }

    //BaseRock generated method id: ${testReadOnlyRootFilesystem}, hash: 6BFB22F0087A292F10B71C7927EA3EE7
    @Test
    void testReadOnlyRootFilesystem() {
        V1SecurityContext securityContext = new V1SecurityContext();
        securityContext.setReadOnlyRootFilesystem(true);
        assertTrue(securityContext.getReadOnlyRootFilesystem());
        securityContext.setReadOnlyRootFilesystem(false);
        assertFalse(securityContext.getReadOnlyRootFilesystem());
        securityContext.setReadOnlyRootFilesystem(null);
        assertNull(securityContext.getReadOnlyRootFilesystem());
    }

    //BaseRock generated method id: ${testRunAsGroup}, hash: 308B39D9C0E95594A132619762273B6B
    @Test
    void testRunAsGroup() {
        V1SecurityContext securityContext = new V1SecurityContext();
        securityContext.setRunAsGroup(1000L);
        assertEquals(1000L, securityContext.getRunAsGroup());
        securityContext.setRunAsGroup(null);
        assertNull(securityContext.getRunAsGroup());
    }

    //BaseRock generated method id: ${testRunAsNonRoot}, hash: F9603071A8263A9F9F0AE19C5E177713
    @Test
    void testRunAsNonRoot() {
        V1SecurityContext securityContext = new V1SecurityContext();
        securityContext.setRunAsNonRoot(true);
        assertTrue(securityContext.getRunAsNonRoot());
        securityContext.setRunAsNonRoot(false);
        assertFalse(securityContext.getRunAsNonRoot());
        securityContext.setRunAsNonRoot(null);
        assertNull(securityContext.getRunAsNonRoot());
    }

    //BaseRock generated method id: ${testRunAsUser}, hash: 04A78789B177017798066BA977B9DA22
    @Test
    void testRunAsUser() {
        V1SecurityContext securityContext = new V1SecurityContext();
        securityContext.setRunAsUser(1000L);
        assertEquals(1000L, securityContext.getRunAsUser());
        securityContext.setRunAsUser(null);
        assertNull(securityContext.getRunAsUser());
    }

    //BaseRock generated method id: ${testSeLinuxOptions}, hash: AD45326AA9583E9A636AD2999F5BFFAC
    @Test
    void testSeLinuxOptions() {
        V1SecurityContext securityContext = new V1SecurityContext();
        V1SELinuxOptions seLinuxOptions = new V1SELinuxOptions();
        securityContext.setSeLinuxOptions(seLinuxOptions);
        assertEquals(seLinuxOptions, securityContext.getSeLinuxOptions());
        securityContext.setSeLinuxOptions(null);
        assertNull(securityContext.getSeLinuxOptions());
    }

    //BaseRock generated method id: ${testSeccompProfile}, hash: 6114C0B7FDADD0072214724AD88F3962
    @Test
    void testSeccompProfile() {
        V1SecurityContext securityContext = new V1SecurityContext();
        V1SeccompProfile seccompProfile = new V1SeccompProfile();
        securityContext.setSeccompProfile(seccompProfile);
        assertEquals(seccompProfile, securityContext.getSeccompProfile());
        securityContext.setSeccompProfile(null);
        assertNull(securityContext.getSeccompProfile());
    }

    //BaseRock generated method id: ${testWindowsOptions}, hash: 07B83FADE0D14A99CBFF21B2FF8FECF8
    @Test
    void testWindowsOptions() {
        V1SecurityContext securityContext = new V1SecurityContext();
        V1WindowsSecurityContextOptions windowsOptions = new V1WindowsSecurityContextOptions();
        securityContext.setWindowsOptions(windowsOptions);
        assertEquals(windowsOptions, securityContext.getWindowsOptions());
        securityContext.setWindowsOptions(null);
        assertNull(securityContext.getWindowsOptions());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: EC2FA06107419C36AE92AC0C3FF07A3D
    @Test
    void testEqualsAndHashCode() {
        V1SecurityContext securityContext1 = new V1SecurityContext().allowPrivilegeEscalation(true).privileged(false).procMount("Default").readOnlyRootFilesystem(true).runAsGroup(1000L).runAsNonRoot(true).runAsUser(2000L);
        V1SecurityContext securityContext2 = new V1SecurityContext().allowPrivilegeEscalation(true).privileged(false).procMount("Default").readOnlyRootFilesystem(true).runAsGroup(1000L).runAsNonRoot(true).runAsUser(2000L);
        V1SecurityContext securityContext3 = new V1SecurityContext().allowPrivilegeEscalation(false).privileged(true).procMount("Unmasked").readOnlyRootFilesystem(false).runAsGroup(3000L).runAsNonRoot(false).runAsUser(4000L);
        assertAll(() -> assertTrue(securityContext1.equals(securityContext2)), () -> assertTrue(securityContext2.equals(securityContext1)), () -> assertFalse(securityContext1.equals(securityContext3)), () -> assertFalse(securityContext3.equals(securityContext1)), () -> assertEquals(securityContext1.hashCode(), securityContext2.hashCode()), () -> assertFalse(securityContext1.hashCode() == securityContext3.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: A43C4B026DBFC44EB32C973BFBD3EC98
    @Test
    void testToString() {
        V1SecurityContext securityContext = new V1SecurityContext().allowPrivilegeEscalation(true).privileged(false).procMount("Default").readOnlyRootFilesystem(true).runAsGroup(1000L).runAsNonRoot(true).runAsUser(2000L);
        String toString = securityContext.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("allowPrivilegeEscalation"), is(true));
        assertThat(toString.contains("privileged"), is(true));
        assertThat(toString.contains("procMount"), is(true));
        assertThat(toString.contains("readOnlyRootFilesystem"), is(true));
        assertThat(toString.contains("runAsGroup"), is(true));
        assertThat(toString.contains("runAsNonRoot"), is(true));
        assertThat(toString.contains("runAsUser"), is(true));
    }
}

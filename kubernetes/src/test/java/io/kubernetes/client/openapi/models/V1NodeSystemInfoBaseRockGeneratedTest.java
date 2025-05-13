package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1NodeSystemInfo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1NodeSystemInfoBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1NodeSystemInfoConstructor}, hash: 588660090DBEF1F8D9EC443208870331
    @Test
    void testV1NodeSystemInfoConstructor() {
        V1NodeSystemInfo nodeSystemInfo = new V1NodeSystemInfo();
        assertNotNull(nodeSystemInfo);
    }

    //BaseRock generated method id: ${testSetAndGetArchitecture}, hash: 0FD0DC0F336EE9963ED6B4FC69C0B7E3
    @Test
    void testSetAndGetArchitecture() {
        V1NodeSystemInfo nodeSystemInfo = new V1NodeSystemInfo();
        String architecture = "x86_64";
        nodeSystemInfo.setArchitecture(architecture);
        assertEquals(architecture, nodeSystemInfo.getArchitecture());
    }

    //BaseRock generated method id: ${testSetAndGetBootID}, hash: C5D6F81D7F5A807758DD67FE98BF5FEB
    @Test
    void testSetAndGetBootID() {
        V1NodeSystemInfo nodeSystemInfo = new V1NodeSystemInfo();
        String bootID = "123e4567-e89b-12d3-a456-426614174000";
        nodeSystemInfo.setBootID(bootID);
        assertEquals(bootID, nodeSystemInfo.getBootID());
    }

    //BaseRock generated method id: ${testSetAndGetContainerRuntimeVersion}, hash: A1AD80FCD03C959C4FABF484DF2F6882
    @Test
    void testSetAndGetContainerRuntimeVersion() {
        V1NodeSystemInfo nodeSystemInfo = new V1NodeSystemInfo();
        String containerRuntimeVersion = "docker://19.03.8";
        nodeSystemInfo.setContainerRuntimeVersion(containerRuntimeVersion);
        assertEquals(containerRuntimeVersion, nodeSystemInfo.getContainerRuntimeVersion());
    }

    //BaseRock generated method id: ${testSetAndGetKernelVersion}, hash: 0C47F4704E8AF40AF19825030C9416B9
    @Test
    void testSetAndGetKernelVersion() {
        V1NodeSystemInfo nodeSystemInfo = new V1NodeSystemInfo();
        String kernelVersion = "4.19.76-linuxkit";
        nodeSystemInfo.setKernelVersion(kernelVersion);
        assertEquals(kernelVersion, nodeSystemInfo.getKernelVersion());
    }

    //BaseRock generated method id: ${testSetAndGetKubeProxyVersion}, hash: F82A3A2F849B9B6239A3E8E25536B45D
    @Test
    void testSetAndGetKubeProxyVersion() {
        V1NodeSystemInfo nodeSystemInfo = new V1NodeSystemInfo();
        String kubeProxyVersion = "v1.18.3";
        nodeSystemInfo.setKubeProxyVersion(kubeProxyVersion);
        assertEquals(kubeProxyVersion, nodeSystemInfo.getKubeProxyVersion());
    }

    //BaseRock generated method id: ${testSetAndGetKubeletVersion}, hash: 3DCAF71D45CA37555D5CB2268C1F80D5
    @Test
    void testSetAndGetKubeletVersion() {
        V1NodeSystemInfo nodeSystemInfo = new V1NodeSystemInfo();
        String kubeletVersion = "v1.18.3";
        nodeSystemInfo.setKubeletVersion(kubeletVersion);
        assertEquals(kubeletVersion, nodeSystemInfo.getKubeletVersion());
    }

    //BaseRock generated method id: ${testSetAndGetMachineID}, hash: F83974CE37E81CA88995127A26F0AEF0
    @Test
    void testSetAndGetMachineID() {
        V1NodeSystemInfo nodeSystemInfo = new V1NodeSystemInfo();
        String machineID = "123e4567-e89b-12d3-a456-426614174000";
        nodeSystemInfo.setMachineID(machineID);
        assertEquals(machineID, nodeSystemInfo.getMachineID());
    }

    //BaseRock generated method id: ${testSetAndGetOperatingSystem}, hash: BC7FA15B9B6484B080A63845E23E15A3
    @Test
    void testSetAndGetOperatingSystem() {
        V1NodeSystemInfo nodeSystemInfo = new V1NodeSystemInfo();
        String operatingSystem = "linux";
        nodeSystemInfo.setOperatingSystem(operatingSystem);
        assertEquals(operatingSystem, nodeSystemInfo.getOperatingSystem());
    }

    //BaseRock generated method id: ${testSetAndGetOsImage}, hash: 0C6220993650EE899BE2684ABFF6BDD1
    @Test
    void testSetAndGetOsImage() {
        V1NodeSystemInfo nodeSystemInfo = new V1NodeSystemInfo();
        String osImage = "Ubuntu 20.04 LTS";
        nodeSystemInfo.setOsImage(osImage);
        assertEquals(osImage, nodeSystemInfo.getOsImage());
    }

    //BaseRock generated method id: ${testSetAndGetSystemUUID}, hash: 7763F2498FBBCFCD40A59AE6A7647C08
    @Test
    void testSetAndGetSystemUUID() {
        V1NodeSystemInfo nodeSystemInfo = new V1NodeSystemInfo();
        String systemUUID = "123e4567-e89b-12d3-a456-426614174000";
        nodeSystemInfo.setSystemUUID(systemUUID);
        assertEquals(systemUUID, nodeSystemInfo.getSystemUUID());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 9A7A1F7A68254EFCC4F030DC362B15F9
    @Test
    void testEqualsAndHashCode() {
        V1NodeSystemInfo info1 = new V1NodeSystemInfo().architecture("x86_64").bootID("boot-123").containerRuntimeVersion("docker://19.03.8").kernelVersion("4.19.76-linuxkit").kubeProxyVersion("v1.18.3").kubeletVersion("v1.18.3").machineID("machine-123").operatingSystem("linux").osImage("Ubuntu 20.04 LTS").systemUUID("system-123");
        V1NodeSystemInfo info2 = new V1NodeSystemInfo().architecture("x86_64").bootID("boot-123").containerRuntimeVersion("docker://19.03.8").kernelVersion("4.19.76-linuxkit").kubeProxyVersion("v1.18.3").kubeletVersion("v1.18.3").machineID("machine-123").operatingSystem("linux").osImage("Ubuntu 20.04 LTS").systemUUID("system-123");
        assertThat(info1, is(equalTo(info2)));
        assertThat(info1.hashCode(), is(equalTo(info2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 04E3180A9F7F03A9ED8F643761115087
    @Test
    void testToString() {
        V1NodeSystemInfo nodeSystemInfo = new V1NodeSystemInfo().architecture("x86_64").bootID("boot-123").containerRuntimeVersion("docker://19.03.8").kernelVersion("4.19.76-linuxkit").kubeProxyVersion("v1.18.3").kubeletVersion("v1.18.3").machineID("machine-123").operatingSystem("linux").osImage("Ubuntu 20.04 LTS").systemUUID("system-123");
        String toString = nodeSystemInfo.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("architecture"), is(true));
        assertThat(toString.contains("bootID"), is(true));
        assertThat(toString.contains("containerRuntimeVersion"), is(true));
        assertThat(toString.contains("kernelVersion"), is(true));
        assertThat(toString.contains("kubeProxyVersion"), is(true));
        assertThat(toString.contains("kubeletVersion"), is(true));
        assertThat(toString.contains("machineID"), is(true));
        assertThat(toString.contains("operatingSystem"), is(true));
        assertThat(toString.contains("osImage"), is(true));
        assertThat(toString.contains("systemUUID"), is(true));
    }
}

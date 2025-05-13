package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import io.kubernetes.client.openapi.models.V1LocalObjectReference;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.models.V1ScaleIOVolumeSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ScaleIOVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1ScaleIOVolumeSourceConstructor}, hash: F4662A379E6165259365B3193ADC4B4C
    @Test
    void testV1ScaleIOVolumeSourceConstructor() {
        V1ScaleIOVolumeSource scaleIOVolumeSource = new V1ScaleIOVolumeSource();
        assertNotNull(scaleIOVolumeSource);
    }

    //BaseRock generated method id: ${testSetAndGetFsType}, hash: 2128C193FF522749C60958877D7822A5
    @ParameterizedTest
    @ValueSource(strings = { "ext4", "xfs", "ntfs" })
    void testSetAndGetFsType(String fsType) {
        V1ScaleIOVolumeSource scaleIOVolumeSource = new V1ScaleIOVolumeSource();
        scaleIOVolumeSource.setFsType(fsType);
        assertEquals(fsType, scaleIOVolumeSource.getFsType());
    }

    //BaseRock generated method id: ${testSetAndGetGateway}, hash: F90E93C45B42D23AE4BBA557CB916BBC
    @Test
    void testSetAndGetGateway() {
        V1ScaleIOVolumeSource scaleIOVolumeSource = new V1ScaleIOVolumeSource();
        String gateway = "192.168.1.1";
        scaleIOVolumeSource.setGateway(gateway);
        assertEquals(gateway, scaleIOVolumeSource.getGateway());
    }

    //BaseRock generated method id: ${testSetAndGetProtectionDomain}, hash: 29C039A083B4AD70E605A2CBD83E74DA
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "protection_domain_1", "protection_domain_2" })
    void testSetAndGetProtectionDomain(String protectionDomain) {
        V1ScaleIOVolumeSource scaleIOVolumeSource = new V1ScaleIOVolumeSource();
        scaleIOVolumeSource.setProtectionDomain(protectionDomain);
        assertEquals(protectionDomain, scaleIOVolumeSource.getProtectionDomain());
    }

    //BaseRock generated method id: ${testSetAndGetReadOnly}, hash: 4B1A83A71B985B3EE99580FE0F295A0F
    @Test
    void testSetAndGetReadOnly() {
        V1ScaleIOVolumeSource scaleIOVolumeSource = new V1ScaleIOVolumeSource();
        scaleIOVolumeSource.setReadOnly(true);
        assertTrue(scaleIOVolumeSource.getReadOnly());
        scaleIOVolumeSource.setReadOnly(false);
        assertFalse(scaleIOVolumeSource.getReadOnly());
    }

    //BaseRock generated method id: ${testSetAndGetSecretRef}, hash: D2557345E08D615A7FD6C15502B4A365
    @Test
    void testSetAndGetSecretRef() {
        V1ScaleIOVolumeSource scaleIOVolumeSource = new V1ScaleIOVolumeSource();
        V1LocalObjectReference secretRef = new V1LocalObjectReference();
        scaleIOVolumeSource.setSecretRef(secretRef);
        assertEquals(secretRef, scaleIOVolumeSource.getSecretRef());
    }

    //BaseRock generated method id: ${testSetAndGetSslEnabled}, hash: 3809E72DEF59A70F2C093D4ADF6013FA
    @Test
    void testSetAndGetSslEnabled() {
        V1ScaleIOVolumeSource scaleIOVolumeSource = new V1ScaleIOVolumeSource();
        scaleIOVolumeSource.setSslEnabled(true);
        assertTrue(scaleIOVolumeSource.getSslEnabled());
        scaleIOVolumeSource.setSslEnabled(false);
        assertFalse(scaleIOVolumeSource.getSslEnabled());
    }

    //BaseRock generated method id: ${testSetAndGetStorageMode}, hash: 990A52322234266CBD34A64C2F14BBF8
    @ParameterizedTest
    @ValueSource(strings = { "ThickProvisioned", "ThinProvisioned" })
    void testSetAndGetStorageMode(String storageMode) {
        V1ScaleIOVolumeSource scaleIOVolumeSource = new V1ScaleIOVolumeSource();
        scaleIOVolumeSource.setStorageMode(storageMode);
        assertEquals(storageMode, scaleIOVolumeSource.getStorageMode());
    }

    //BaseRock generated method id: ${testSetAndGetStoragePool}, hash: 7E6F30A183F5E3A23C1D24B8F3FA7927
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "storage_pool_1", "storage_pool_2" })
    void testSetAndGetStoragePool(String storagePool) {
        V1ScaleIOVolumeSource scaleIOVolumeSource = new V1ScaleIOVolumeSource();
        scaleIOVolumeSource.setStoragePool(storagePool);
        assertEquals(storagePool, scaleIOVolumeSource.getStoragePool());
    }

    //BaseRock generated method id: ${testSetAndGetSystem}, hash: 7E9E055D7EE25007E758E2117B108879
    @Test
    void testSetAndGetSystem() {
        V1ScaleIOVolumeSource scaleIOVolumeSource = new V1ScaleIOVolumeSource();
        String system = "scaleio_system_1";
        scaleIOVolumeSource.setSystem(system);
        assertEquals(system, scaleIOVolumeSource.getSystem());
    }

    //BaseRock generated method id: ${testSetAndGetVolumeName}, hash: 6AFA6544C6979880DDB1AB3E89FDFA62
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "volume_1", "volume_2" })
    void testSetAndGetVolumeName(String volumeName) {
        V1ScaleIOVolumeSource scaleIOVolumeSource = new V1ScaleIOVolumeSource();
        scaleIOVolumeSource.setVolumeName(volumeName);
        assertEquals(volumeName, scaleIOVolumeSource.getVolumeName());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 11D45826D9196E2014342C1388CBE248
    @Test
    void testEqualsAndHashCode() {
        V1ScaleIOVolumeSource source1 = new V1ScaleIOVolumeSource().fsType("ext4").gateway("192.168.1.1").protectionDomain("domain1").readOnly(true).secretRef(new V1LocalObjectReference()).sslEnabled(true).storageMode("ThinProvisioned").storagePool("pool1").system("system1").volumeName("volume1");
        V1ScaleIOVolumeSource source2 = new V1ScaleIOVolumeSource().fsType("ext4").gateway("192.168.1.1").protectionDomain("domain1").readOnly(true).secretRef(new V1LocalObjectReference()).sslEnabled(true).storageMode("ThinProvisioned").storagePool("pool1").system("system1").volumeName("volume1");
        V1ScaleIOVolumeSource source3 = new V1ScaleIOVolumeSource().fsType("xfs").gateway("192.168.1.2").protectionDomain("domain2").readOnly(false).secretRef(new V1LocalObjectReference()).sslEnabled(false).storageMode("ThickProvisioned").storagePool("pool2").system("system2").volumeName("volume2");
        assertTrue(source1.equals(source2) && source2.equals(source1));
        assertEquals(source1.hashCode(), source2.hashCode());
        assertFalse(source1.equals(source3) || source3.equals(source1));
        assertFalse(source1.hashCode() == source3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 449E14D4E286897781EF489228849482
    @Test
    void testToString() {
        V1ScaleIOVolumeSource scaleIOVolumeSource = new V1ScaleIOVolumeSource().fsType("ext4").gateway("192.168.1.1").protectionDomain("domain1").readOnly(true).secretRef(new V1LocalObjectReference()).sslEnabled(true).storageMode("ThinProvisioned").storagePool("pool1").system("system1").volumeName("volume1");
        String toString = scaleIOVolumeSource.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("V1ScaleIOVolumeSource"), is(true));
        assertThat(toString.contains("fsType"), is(true));
        assertThat(toString.contains("gateway"), is(true));
        assertThat(toString.contains("protectionDomain"), is(true));
        assertThat(toString.contains("readOnly"), is(true));
        assertThat(toString.contains("secretRef"), is(true));
        assertThat(toString.contains("sslEnabled"), is(true));
        assertThat(toString.contains("storageMode"), is(true));
        assertThat(toString.contains("storagePool"), is(true));
        assertThat(toString.contains("system"), is(true));
        assertThat(toString.contains("volumeName"), is(true));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 0C2BC20BCC7667E04D24CF6CF3F5653F
    @Test
    void testBuilderPattern() {
        V1ScaleIOVolumeSource scaleIOVolumeSource = new V1ScaleIOVolumeSource().fsType("ext4").gateway("192.168.1.1").protectionDomain("domain1").readOnly(true).secretRef(new V1LocalObjectReference()).sslEnabled(true).storageMode("ThinProvisioned").storagePool("pool1").system("system1").volumeName("volume1");
        assertThat(scaleIOVolumeSource.getFsType(), is(equalTo("ext4")));
        assertThat(scaleIOVolumeSource.getGateway(), is(equalTo("192.168.1.1")));
        assertThat(scaleIOVolumeSource.getProtectionDomain(), is(equalTo("domain1")));
        assertThat(scaleIOVolumeSource.getReadOnly(), is(true));
        assertThat(scaleIOVolumeSource.getSecretRef(), is(notNullValue()));
        assertThat(scaleIOVolumeSource.getSslEnabled(), is(true));
        assertThat(scaleIOVolumeSource.getStorageMode(), is(equalTo("ThinProvisioned")));
        assertThat(scaleIOVolumeSource.getStoragePool(), is(equalTo("pool1")));
        assertThat(scaleIOVolumeSource.getSystem(), is(equalTo("system1")));
        assertThat(scaleIOVolumeSource.getVolumeName(), is(equalTo("volume1")));
    }

    //BaseRock generated method id: ${testBuilderPatternNullValues}, hash: 7EE491DF8D5FE77B4DB4D042BB35B4C5
    @Test
    void testBuilderPatternNullValues() {
        V1ScaleIOVolumeSource scaleIOVolumeSource = new V1ScaleIOVolumeSource().fsType(null).gateway(null).protectionDomain(null).readOnly(null).secretRef(null).sslEnabled(null).storageMode(null).storagePool(null).system(null).volumeName(null);
        assertThat(scaleIOVolumeSource.getFsType(), is(nullValue()));
        assertThat(scaleIOVolumeSource.getGateway(), is(nullValue()));
        assertThat(scaleIOVolumeSource.getProtectionDomain(), is(nullValue()));
        assertThat(scaleIOVolumeSource.getReadOnly(), is(nullValue()));
        assertThat(scaleIOVolumeSource.getSecretRef(), is(nullValue()));
        assertThat(scaleIOVolumeSource.getSslEnabled(), is(nullValue()));
        assertThat(scaleIOVolumeSource.getStorageMode(), is(nullValue()));
        assertThat(scaleIOVolumeSource.getStoragePool(), is(nullValue()));
        assertThat(scaleIOVolumeSource.getSystem(), is(nullValue()));
        assertThat(scaleIOVolumeSource.getVolumeName(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNoExceptionsInMethods}, hash: E540A636DD7A8D9FC8A7052A07B41DCC
    @Test
    void testNoExceptionsInMethods() {
        V1ScaleIOVolumeSource scaleIOVolumeSource = new V1ScaleIOVolumeSource();
        assertDoesNotThrow(() -> scaleIOVolumeSource.getFsType());
        assertDoesNotThrow(() -> scaleIOVolumeSource.getGateway());
        assertDoesNotThrow(() -> scaleIOVolumeSource.getProtectionDomain());
        assertDoesNotThrow(() -> scaleIOVolumeSource.getReadOnly());
        assertDoesNotThrow(() -> scaleIOVolumeSource.getSecretRef());
        assertDoesNotThrow(() -> scaleIOVolumeSource.getSslEnabled());
        assertDoesNotThrow(() -> scaleIOVolumeSource.getStorageMode());
        assertDoesNotThrow(() -> scaleIOVolumeSource.getStoragePool());
        assertDoesNotThrow(() -> scaleIOVolumeSource.getSystem());
        assertDoesNotThrow(() -> scaleIOVolumeSource.getVolumeName());
        assertDoesNotThrow(() -> scaleIOVolumeSource.setFsType("ext4"));
        assertDoesNotThrow(() -> scaleIOVolumeSource.setGateway("192.168.1.1"));
        assertDoesNotThrow(() -> scaleIOVolumeSource.setProtectionDomain("domain1"));
        assertDoesNotThrow(() -> scaleIOVolumeSource.setReadOnly(true));
        assertDoesNotThrow(() -> scaleIOVolumeSource.setSecretRef(new V1LocalObjectReference()));
        assertDoesNotThrow(() -> scaleIOVolumeSource.setSslEnabled(true));
        assertDoesNotThrow(() -> scaleIOVolumeSource.setStorageMode("ThinProvisioned"));
        assertDoesNotThrow(() -> scaleIOVolumeSource.setStoragePool("pool1"));
        assertDoesNotThrow(() -> scaleIOVolumeSource.setSystem("system1"));
        assertDoesNotThrow(() -> scaleIOVolumeSource.setVolumeName("volume1"));
    }
}

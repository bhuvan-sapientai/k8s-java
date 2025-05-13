package io.kubernetes.client.openapi.models;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1VsphereVirtualDiskVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 02E05514C7A741BE24B2ACFCC2517E2F
    @Test
    void testConstructor() {
        V1VsphereVirtualDiskVolumeSource source = new V1VsphereVirtualDiskVolumeSource();
        assertThat(source, is(notNullValue()));
    }

    //BaseRock generated method id: ${testFsType}, hash: 111E26B7FBDCD5777FFEBD27822FAEA0
    @Test
    void testFsType() {
        V1VsphereVirtualDiskVolumeSource source = new V1VsphereVirtualDiskVolumeSource();
        source.setFsType("ext4");
        assertEquals("ext4", source.getFsType());
    }

    //BaseRock generated method id: ${testFsTypeWithVariousValues}, hash: D7456A0C602C43088774A2E626B32653
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "ext4", "xfs", "ntfs" })
    void testFsTypeWithVariousValues(String fsType) {
        V1VsphereVirtualDiskVolumeSource source = new V1VsphereVirtualDiskVolumeSource();
        source.setFsType(fsType);
        assertEquals(fsType, source.getFsType());
    }

    //BaseRock generated method id: ${testStoragePolicyID}, hash: DCA8883C5EEB4351B6492E4E0C573592
    @Test
    void testStoragePolicyID() {
        V1VsphereVirtualDiskVolumeSource source = new V1VsphereVirtualDiskVolumeSource();
        source.setStoragePolicyID("policy-123");
        assertEquals("policy-123", source.getStoragePolicyID());
    }

    //BaseRock generated method id: ${testStoragePolicyIDWithVariousValues}, hash: 086E6E4E3EBDE1722C43C5FAA013357E
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "policy-123", "policy-456" })
    void testStoragePolicyIDWithVariousValues(String policyID) {
        V1VsphereVirtualDiskVolumeSource source = new V1VsphereVirtualDiskVolumeSource();
        source.setStoragePolicyID(policyID);
        assertEquals(policyID, source.getStoragePolicyID());
    }

    //BaseRock generated method id: ${testStoragePolicyName}, hash: A7FBFAF2A098F42126300436B1F29FC4
    @Test
    void testStoragePolicyName() {
        V1VsphereVirtualDiskVolumeSource source = new V1VsphereVirtualDiskVolumeSource();
        source.setStoragePolicyName("Gold");
        assertEquals("Gold", source.getStoragePolicyName());
    }

    //BaseRock generated method id: ${testStoragePolicyNameWithVariousValues}, hash: B3A422BEB19C53D5B79762BB0CE40DEB
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Gold", "Silver", "Bronze" })
    void testStoragePolicyNameWithVariousValues(String policyName) {
        V1VsphereVirtualDiskVolumeSource source = new V1VsphereVirtualDiskVolumeSource();
        source.setStoragePolicyName(policyName);
        assertEquals(policyName, source.getStoragePolicyName());
    }

    //BaseRock generated method id: ${testVolumePath}, hash: 55C3B8F0B0B5CC5B605A94ADB9D307CB
    @Test
    void testVolumePath() {
        V1VsphereVirtualDiskVolumeSource source = new V1VsphereVirtualDiskVolumeSource();
        source.setVolumePath("/path/to/volume");
        assertEquals("/path/to/volume", source.getVolumePath());
    }

    //BaseRock generated method id: ${testVolumePathWithVariousValues}, hash: EDE518A791E987A707D743F58803040B
    @ParameterizedTest
    @ValueSource(strings = { "/path/to/volume", "/another/path" })
    void testVolumePathWithVariousValues(String volumePath) {
        V1VsphereVirtualDiskVolumeSource source = new V1VsphereVirtualDiskVolumeSource();
        source.setVolumePath(volumePath);
        assertEquals(volumePath, source.getVolumePath());
    }

    //BaseRock generated method id: ${testVolumePathCannotBeNull}, hash: B84B71EE62B79AE8BCBAB5B6197CD282
    @Disabled()
    @Test
    void testVolumePathCannotBeNull() {
        V1VsphereVirtualDiskVolumeSource source = new V1VsphereVirtualDiskVolumeSource();
        assertThrows(NullPointerException.class, () -> source.setVolumePath(null));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 895ABA247D1A4F803A32CACF69BEE24A
    @Test
    void testEqualsAndHashCode() {
        V1VsphereVirtualDiskVolumeSource source1 = new V1VsphereVirtualDiskVolumeSource().fsType("ext4").storagePolicyID("policy-123").storagePolicyName("Gold").volumePath("/path/to/volume");
        V1VsphereVirtualDiskVolumeSource source2 = new V1VsphereVirtualDiskVolumeSource().fsType("ext4").storagePolicyID("policy-123").storagePolicyName("Gold").volumePath("/path/to/volume");
        V1VsphereVirtualDiskVolumeSource source3 = new V1VsphereVirtualDiskVolumeSource().fsType("xfs").storagePolicyID("policy-456").storagePolicyName("Silver").volumePath("/another/path");
        assertAll(() -> assertThat(source1, equalTo(source2)), () -> assertThat(source1.hashCode(), equalTo(source2.hashCode())), () -> assertThat(source1, is(notNullValue())), () -> assertThat(source1, is(equalTo(source1))), () -> assertThat(source1, is(not(equalTo(source3)))));
    }

    //BaseRock generated method id: ${testToString}, hash: C627A1683063CBC529E7D7C49169F2CC
    @Test
    void testToString() {
        V1VsphereVirtualDiskVolumeSource source = new V1VsphereVirtualDiskVolumeSource().fsType("ext4").storagePolicyID("policy-123").storagePolicyName("Gold").volumePath("/path/to/volume");
        String expected = "class V1VsphereVirtualDiskVolumeSource {\n" + "    fsType: ext4\n" + "    storagePolicyID: policy-123\n" + "    storagePolicyName: Gold\n" + "    volumePath: /path/to/volume\n" + "}";
        assertEquals(expected, source.toString());
    }
}

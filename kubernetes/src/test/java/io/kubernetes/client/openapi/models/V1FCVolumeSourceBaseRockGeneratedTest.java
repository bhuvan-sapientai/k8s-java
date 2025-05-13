package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.ArrayList;
import static org.hamcrest.Matchers.not;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.V1FCVolumeSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1FCVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1FCVolumeSourceConstructor}, hash: 67C4937B77466738E5512FBDCF72521A
    @Test
    void testV1FCVolumeSourceConstructor() {
        V1FCVolumeSource v1FCVolumeSource = new V1FCVolumeSource();
        assertThat(v1FCVolumeSource, is(not(nullValue())));
    }

    //BaseRock generated method id: ${testFsType}, hash: A05D761D38AFAE604875725A1E76675D
    @Test
    void testFsType() {
        V1FCVolumeSource v1FCVolumeSource = new V1FCVolumeSource();
        String fsType = "ext4";
        v1FCVolumeSource.setFsType(fsType);
        assertEquals(fsType, v1FCVolumeSource.getFsType());
    }

    //BaseRock generated method id: ${testLun}, hash: 565436C1B3CE24F9C62B56EFC49FC155
    @Test
    void testLun() {
        V1FCVolumeSource v1FCVolumeSource = new V1FCVolumeSource();
        Integer lun = 1;
        v1FCVolumeSource.setLun(lun);
        assertEquals(lun, v1FCVolumeSource.getLun());
    }

    //BaseRock generated method id: ${testReadOnly}, hash: C4DF5008679B61EFB02B64C80EF58943
    @Test
    void testReadOnly() {
        V1FCVolumeSource v1FCVolumeSource = new V1FCVolumeSource();
        v1FCVolumeSource.setReadOnly(true);
        assertTrue(v1FCVolumeSource.getReadOnly());
        v1FCVolumeSource.setReadOnly(false);
        assertFalse(v1FCVolumeSource.getReadOnly());
    }

    //BaseRock generated method id: ${testTargetWWNs}, hash: 4E81C2F0B38F7ECE644AE75F24DFBAC4
    @Test
    void testTargetWWNs() {
        V1FCVolumeSource v1FCVolumeSource = new V1FCVolumeSource();
        List<String> targetWWNs = Arrays.asList("wwn1", "wwn2", "wwn3");
        v1FCVolumeSource.setTargetWWNs(targetWWNs);
        assertThat(v1FCVolumeSource.getTargetWWNs(), hasSize(3));
        assertThat(v1FCVolumeSource.getTargetWWNs(), containsInAnyOrder("wwn1", "wwn2", "wwn3"));
    }

    //BaseRock generated method id: ${testWwids}, hash: 1C9EAFEBECD4425BA02494D947E11FE8
    @Test
    void testWwids() {
        V1FCVolumeSource v1FCVolumeSource = new V1FCVolumeSource();
        List<String> wwids = Arrays.asList("wwid1", "wwid2", "wwid3");
        v1FCVolumeSource.setWwids(wwids);
        assertThat(v1FCVolumeSource.getWwids(), hasSize(3));
        assertThat(v1FCVolumeSource.getWwids(), containsInAnyOrder("wwid1", "wwid2", "wwid3"));
    }

    //BaseRock generated method id: ${testAddTargetWWNsItem}, hash: 7B7B45104BD3BB3FA16C697F2CE9CDC6
    @Test
    void testAddTargetWWNsItem() {
        V1FCVolumeSource v1FCVolumeSource = new V1FCVolumeSource();
        v1FCVolumeSource.addTargetWWNsItem("wwn1");
        assertThat(v1FCVolumeSource.getTargetWWNs(), hasSize(1));
        assertThat(v1FCVolumeSource.getTargetWWNs().get(0), is(equalTo("wwn1")));
    }

    //BaseRock generated method id: ${testAddWwidsItem}, hash: 9D20BA90B94E06BEAB19B71277861918
    @Test
    void testAddWwidsItem() {
        V1FCVolumeSource v1FCVolumeSource = new V1FCVolumeSource();
        v1FCVolumeSource.addWwidsItem("wwid1");
        assertThat(v1FCVolumeSource.getWwids(), hasSize(1));
        assertThat(v1FCVolumeSource.getWwids().get(0), is(equalTo("wwid1")));
    }

    //BaseRock generated method id: ${testEquals}, hash: FBB938AE61DD93261348EFAC26ED8AB1
    @Test
    void testEquals() {
        V1FCVolumeSource v1FCVolumeSource1 = new V1FCVolumeSource().fsType("ext4").lun(1).readOnly(true).targetWWNs(Arrays.asList("wwn1", "wwn2")).wwids(Arrays.asList("wwid1", "wwid2"));
        V1FCVolumeSource v1FCVolumeSource2 = new V1FCVolumeSource().fsType("ext4").lun(1).readOnly(true).targetWWNs(Arrays.asList("wwn1", "wwn2")).wwids(Arrays.asList("wwid1", "wwid2"));
        assertEquals(v1FCVolumeSource1, v1FCVolumeSource2);
        v1FCVolumeSource2.setFsType("xfs");
        assertNotEquals(v1FCVolumeSource1, v1FCVolumeSource2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 2B32C6274C72E394673B503ACD8439D8
    @Test
    void testHashCode() {
        V1FCVolumeSource v1FCVolumeSource1 = new V1FCVolumeSource().fsType("ext4").lun(1).readOnly(true).targetWWNs(Arrays.asList("wwn1", "wwn2")).wwids(Arrays.asList("wwid1", "wwid2"));
        V1FCVolumeSource v1FCVolumeSource2 = new V1FCVolumeSource().fsType("ext4").lun(1).readOnly(true).targetWWNs(Arrays.asList("wwn1", "wwn2")).wwids(Arrays.asList("wwid1", "wwid2"));
        assertEquals(v1FCVolumeSource1.hashCode(), v1FCVolumeSource2.hashCode());
        v1FCVolumeSource2.setFsType("xfs");
        assertNotEquals(v1FCVolumeSource1.hashCode(), v1FCVolumeSource2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: F150B966D5B520D02C205B2DD47546FB
    @Test
    void testToString() {
        V1FCVolumeSource v1FCVolumeSource = new V1FCVolumeSource().fsType("ext4").lun(1).readOnly(true).targetWWNs(Arrays.asList("wwn1", "wwn2")).wwids(Arrays.asList("wwid1", "wwid2"));
        String expectedString = "class V1FCVolumeSource {\n" + "    fsType: ext4\n" + "    lun: 1\n" + "    readOnly: true\n" + "    targetWWNs: [wwn1, wwn2]\n" + "    wwids: [wwid1, wwid2]\n" + "}";
        assertEquals(expectedString, v1FCVolumeSource.toString());
    }

    //BaseRock generated method id: ${testDifferentFsTypes}, hash: 86DEA188C3F0B38A7C0E5AB9FCE472A3
    @ParameterizedTest
    @ValueSource(strings = { "ext4", "xfs", "ntfs" })
    void testDifferentFsTypes(String fsType) {
        V1FCVolumeSource v1FCVolumeSource = new V1FCVolumeSource().fsType(fsType);
        assertEquals(fsType, v1FCVolumeSource.getFsType());
    }

    //BaseRock generated method id: ${testNullValues}, hash: FC0ADC67C043BBBE597E8703FEAB15B3
    @Disabled()
    @Test
    void testNullValues() {
        V1FCVolumeSource v1FCVolumeSource = new V1FCVolumeSource();
        assertThat(v1FCVolumeSource.getFsType(), is(nullValue()));
        assertThat(v1FCVolumeSource.getLun(), is(nullValue()));
        assertThat(v1FCVolumeSource.getReadOnly(), is(nullValue()));
        assertThat(v1FCVolumeSource.getTargetWWNs(), is(nullValue()));
        assertThat(v1FCVolumeSource.getWwids(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEmptyLists}, hash: CE4F2D1B40B59A06A0086A20C48BE674
    @Test
    void testEmptyLists() {
        V1FCVolumeSource v1FCVolumeSource = new V1FCVolumeSource().targetWWNs(new ArrayList<>()).wwids(new ArrayList<>());
        assertThat(v1FCVolumeSource.getTargetWWNs(), hasSize(0));
        assertThat(v1FCVolumeSource.getWwids(), hasSize(0));
    }

    //BaseRock generated method id: ${testFluentInterface}, hash: F90667BEC22EEF8A63C0A619DD13DDFD
    @Test
    void testFluentInterface() {
        V1FCVolumeSource v1FCVolumeSource = new V1FCVolumeSource().fsType("ext4").lun(1).readOnly(true).targetWWNs(Arrays.asList("wwn1", "wwn2")).wwids(Arrays.asList("wwid1", "wwid2"));
        assertEquals("ext4", v1FCVolumeSource.getFsType());
        assertEquals(Integer.valueOf(1), v1FCVolumeSource.getLun());
        assertTrue(v1FCVolumeSource.getReadOnly());
        assertThat(v1FCVolumeSource.getTargetWWNs(), containsInAnyOrder("wwn1", "wwn2"));
        assertThat(v1FCVolumeSource.getWwids(), containsInAnyOrder("wwid1", "wwid2"));
    }
}

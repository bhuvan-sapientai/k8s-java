package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1LocalObjectReference;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ISCSIVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 070DA35E2BAFC460E2C5235E5027E67C
    @Test
    void testConstructor() {
        V1ISCSIVolumeSource volumeSource = new V1ISCSIVolumeSource();
        assertThat(volumeSource, is(notNullValue()));
    }

    //BaseRock generated method id: ${testChapAuthDiscovery}, hash: 2E9E8C50059869809728E69E6704C9E7
    @Test
    void testChapAuthDiscovery() {
        V1ISCSIVolumeSource volumeSource = new V1ISCSIVolumeSource();
        volumeSource.setChapAuthDiscovery(true);
        assertThat(volumeSource.getChapAuthDiscovery(), is(true));
    }

    //BaseRock generated method id: ${testChapAuthSession}, hash: 518E0AB4F591125CC8777D71656CF8D5
    @Test
    void testChapAuthSession() {
        V1ISCSIVolumeSource volumeSource = new V1ISCSIVolumeSource();
        volumeSource.setChapAuthSession(false);
        assertThat(volumeSource.getChapAuthSession(), is(false));
    }

    //BaseRock generated method id: ${testFsType}, hash: F8AEE285D09AB1B97E3379C86A7C265A
    @Test
    void testFsType() {
        V1ISCSIVolumeSource volumeSource = new V1ISCSIVolumeSource();
        volumeSource.setFsType("ext4");
        assertThat(volumeSource.getFsType(), is("ext4"));
    }

    //BaseRock generated method id: ${testInitiatorName}, hash: CB74AD3ACA602DDBC81335351BDE6640
    @Test
    void testInitiatorName() {
        V1ISCSIVolumeSource volumeSource = new V1ISCSIVolumeSource();
        volumeSource.setInitiatorName("iqn.2000-01.com.example:node1");
        assertThat(volumeSource.getInitiatorName(), is("iqn.2000-01.com.example:node1"));
    }

    //BaseRock generated method id: ${testIqn}, hash: EED54D0B5C5670988BA8DF021A4E29E0
    @Test
    void testIqn() {
        V1ISCSIVolumeSource volumeSource = new V1ISCSIVolumeSource();
        volumeSource.setIqn("iqn.2000-01.com.example:storage.disk1");
        assertThat(volumeSource.getIqn(), is("iqn.2000-01.com.example:storage.disk1"));
    }

    //BaseRock generated method id: ${testIscsiInterface}, hash: 20C75E371BC8D246C27C6A7F46708E8E
    @Test
    void testIscsiInterface() {
        V1ISCSIVolumeSource volumeSource = new V1ISCSIVolumeSource();
        volumeSource.setIscsiInterface("default");
        assertThat(volumeSource.getIscsiInterface(), is("default"));
    }

    //BaseRock generated method id: ${testLun}, hash: 5A844829CBDCE430E0E08A528FF60B88
    @Test
    void testLun() {
        V1ISCSIVolumeSource volumeSource = new V1ISCSIVolumeSource();
        volumeSource.setLun(0);
        assertThat(volumeSource.getLun(), is(0));
    }

    //BaseRock generated method id: ${testPortals}, hash: F5E1AA2E473C71CA7E876B5739032B47
    @Test
    void testPortals() {
        V1ISCSIVolumeSource volumeSource = new V1ISCSIVolumeSource();
        List<String> portals = new ArrayList<>();
        portals.add("192.168.1.1:3260");
        portals.add("192.168.1.2:3260");
        volumeSource.setPortals(portals);
        assertThat(volumeSource.getPortals(), is(portals));
    }

    //BaseRock generated method id: ${testReadOnly}, hash: 45551B5D2DDD7088C299DC766AA49534
    @Test
    void testReadOnly() {
        V1ISCSIVolumeSource volumeSource = new V1ISCSIVolumeSource();
        volumeSource.setReadOnly(true);
        assertThat(volumeSource.getReadOnly(), is(true));
    }

    //BaseRock generated method id: ${testSecretRef}, hash: D3CFD8FA1DE34617BCB3B5388BD13952
    @Test
    void testSecretRef() {
        V1ISCSIVolumeSource volumeSource = new V1ISCSIVolumeSource();
        V1LocalObjectReference secretRef = new V1LocalObjectReference();
        secretRef.setName("my-secret");
        volumeSource.setSecretRef(secretRef);
        assertThat(volumeSource.getSecretRef(), is(secretRef));
    }

    //BaseRock generated method id: ${testTargetPortal}, hash: 56013A4083014E45D5EBF85B6F749142
    @Test
    void testTargetPortal() {
        V1ISCSIVolumeSource volumeSource = new V1ISCSIVolumeSource();
        volumeSource.setTargetPortal("192.168.1.1:3260");
        assertThat(volumeSource.getTargetPortal(), is("192.168.1.1:3260"));
    }

    //BaseRock generated method id: ${testEquals}, hash: CD43CC0F50D4C60DBF5A1B4919FFA6EA
    @Test
    void testEquals() {
        V1ISCSIVolumeSource volumeSource1 = new V1ISCSIVolumeSource().chapAuthDiscovery(true).chapAuthSession(false).fsType("ext4").initiatorName("iqn.2000-01.com.example:node1").iqn("iqn.2000-01.com.example:storage.disk1").iscsiInterface("default").lun(0).readOnly(true).targetPortal("192.168.1.1:3260");
        V1ISCSIVolumeSource volumeSource2 = new V1ISCSIVolumeSource().chapAuthDiscovery(true).chapAuthSession(false).fsType("ext4").initiatorName("iqn.2000-01.com.example:node1").iqn("iqn.2000-01.com.example:storage.disk1").iscsiInterface("default").lun(0).readOnly(true).targetPortal("192.168.1.1:3260");
        assertThat(volumeSource1, is(equalTo(volumeSource2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: BEC91DAB8A332288A4F975FD8F7DDFD4
    @Test
    void testHashCode() {
        V1ISCSIVolumeSource volumeSource1 = new V1ISCSIVolumeSource().chapAuthDiscovery(true).chapAuthSession(false).fsType("ext4").initiatorName("iqn.2000-01.com.example:node1").iqn("iqn.2000-01.com.example:storage.disk1").iscsiInterface("default").lun(0).readOnly(true).targetPortal("192.168.1.1:3260");
        V1ISCSIVolumeSource volumeSource2 = new V1ISCSIVolumeSource().chapAuthDiscovery(true).chapAuthSession(false).fsType("ext4").initiatorName("iqn.2000-01.com.example:node1").iqn("iqn.2000-01.com.example:storage.disk1").iscsiInterface("default").lun(0).readOnly(true).targetPortal("192.168.1.1:3260");
        assertThat(volumeSource1.hashCode(), is(volumeSource2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: A38F0DFF235474BD96390866E29FE769
    @Test
    void testToString() {
        V1ISCSIVolumeSource volumeSource = new V1ISCSIVolumeSource().chapAuthDiscovery(true).chapAuthSession(false).fsType("ext4").initiatorName("iqn.2000-01.com.example:node1").iqn("iqn.2000-01.com.example:storage.disk1").iscsiInterface("default").lun(0).readOnly(true).targetPortal("192.168.1.1:3260");
        String expectedString = "class V1ISCSIVolumeSource {\n" + "    chapAuthDiscovery: true\n" + "    chapAuthSession: false\n" + "    fsType: ext4\n" + "    initiatorName: iqn.2000-01.com.example:node1\n" + "    iqn: iqn.2000-01.com.example:storage.disk1\n" + "    iscsiInterface: default\n" + "    lun: 0\n" + "    portals: []\n" + "    readOnly: true\n" + "    secretRef: null\n" + "    targetPortal: 192.168.1.1:3260\n" + "}";
        assertThat(volumeSource.toString(), is(expectedString));
    }

    //BaseRock generated method id: ${testInvalidLun}, hash: 55CF23649F3B9CA6AB9E071DB46FEF55
    @ParameterizedTest
    @ValueSource(ints = { -1, 256 })
    void testInvalidLun(int lun) {
        V1ISCSIVolumeSource volumeSource = new V1ISCSIVolumeSource();
        volumeSource.setLun(lun);
        assertThat(volumeSource.getLun(), is(lun));
    }

    //BaseRock generated method id: ${testNullIqn}, hash: 62D58695F5AF7871082C78FA95DC41E1
    @Test
    void testNullIqn() {
        V1ISCSIVolumeSource volumeSource = new V1ISCSIVolumeSource();
        volumeSource.setIqn(null);
        assertThat(volumeSource.getIqn(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNullTargetPortal}, hash: CD6856B2EA1D80E272176A5910DFB81B
    @Test
    void testNullTargetPortal() {
        V1ISCSIVolumeSource volumeSource = new V1ISCSIVolumeSource();
        volumeSource.setTargetPortal(null);
        assertThat(volumeSource.getTargetPortal(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAddPortalsItem}, hash: FD27DD56047DF448E7FBCD202C2FF3DA
    @Test
    void testAddPortalsItem() {
        V1ISCSIVolumeSource volumeSource = new V1ISCSIVolumeSource();
        volumeSource.addPortalsItem("192.168.1.1:3260");
        assertThat(volumeSource.getPortals().size(), is(1));
        assertThat(volumeSource.getPortals().get(0), is("192.168.1.1:3260"));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: FCA4B7D885785D73DC3ACD1F507F8943
    @Test
    void testBuilderPattern() {
        V1ISCSIVolumeSource volumeSource = new V1ISCSIVolumeSource().chapAuthDiscovery(true).chapAuthSession(false).fsType("ext4").initiatorName("iqn.2000-01.com.example:node1").iqn("iqn.2000-01.com.example:storage.disk1").iscsiInterface("default").lun(0).readOnly(true).targetPortal("192.168.1.1:3260");
        assertThat(volumeSource.getChapAuthDiscovery(), is(true));
        assertThat(volumeSource.getChapAuthSession(), is(false));
        assertThat(volumeSource.getFsType(), is("ext4"));
        assertThat(volumeSource.getInitiatorName(), is("iqn.2000-01.com.example:node1"));
        assertThat(volumeSource.getIqn(), is("iqn.2000-01.com.example:storage.disk1"));
        assertThat(volumeSource.getIscsiInterface(), is("default"));
        assertThat(volumeSource.getLun(), is(0));
        assertThat(volumeSource.getReadOnly(), is(true));
        assertThat(volumeSource.getTargetPortal(), is("192.168.1.1:3260"));
    }
}

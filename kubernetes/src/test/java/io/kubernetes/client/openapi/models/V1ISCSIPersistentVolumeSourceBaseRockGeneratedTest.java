package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1SecretReference;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1ISCSIPersistentVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1ISCSIPersistentVolumeSourceConstructor}, hash: 3DAAAD4B176A88E3B4BC9F9F84A09679
    @Test
    void testV1ISCSIPersistentVolumeSourceConstructor() {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource();
        assertThat(source, is(notNullValue()));
    }

    //BaseRock generated method id: ${testChapAuthDiscovery}, hash: 00120EB4641128A9294C1450D0C6EBF5
    @Test
    void testChapAuthDiscovery() {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource();
        source.setChapAuthDiscovery(true);
        assertThat(source.getChapAuthDiscovery(), is(true));
    }

    //BaseRock generated method id: ${testChapAuthSession}, hash: D08BDE6137289567F10025AD2010D1E2
    @Test
    void testChapAuthSession() {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource();
        source.setChapAuthSession(false);
        assertThat(source.getChapAuthSession(), is(false));
    }

    //BaseRock generated method id: ${testFsType}, hash: 5221F62A468BE3D0802C44987D479799
    @Test
    void testFsType() {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource();
        source.setFsType("ext4");
        assertThat(source.getFsType(), is("ext4"));
    }

    //BaseRock generated method id: ${testInitiatorName}, hash: BE4A2413A9665638BE87EEBEA299AC56
    @Test
    void testInitiatorName() {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource();
        source.setInitiatorName("iqn.1993-08.org.debian:01:cca175ce01");
        assertThat(source.getInitiatorName(), is("iqn.1993-08.org.debian:01:cca175ce01"));
    }

    //BaseRock generated method id: ${testIqn}, hash: 5A5DB85C4559C19A32EE7238538F4F2C
    @Test
    void testIqn() {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource();
        source.setIqn("iqn.2000-01.com.synology:diskstation.target-1.b3295ab7");
        assertThat(source.getIqn(), is("iqn.2000-01.com.synology:diskstation.target-1.b3295ab7"));
    }

    //BaseRock generated method id: ${testIscsiInterface}, hash: 1DF2E4CF7D4F12879EEE910CAFF6977A
    @Test
    void testIscsiInterface() {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource();
        source.setIscsiInterface("default");
        assertThat(source.getIscsiInterface(), is("default"));
    }

    //BaseRock generated method id: ${testLun}, hash: 813CCA7897F8EE0C1CA0F087B98E44FF
    @Test
    void testLun() {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource();
        source.setLun(0);
        assertThat(source.getLun(), is(0));
    }

    //BaseRock generated method id: ${testPortals}, hash: 38015895170AA57C81C8CD062AE718C8
    @Test
    void testPortals() {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource();
        List<String> portals = new ArrayList<>();
        portals.add("192.168.1.10:3260");
        portals.add("192.168.1.11:3260");
        source.setPortals(portals);
        assertThat(source.getPortals(), is(portals));
    }

    //BaseRock generated method id: ${testReadOnly}, hash: 842FCF547C950EBCD023976FF9F29747
    @Test
    void testReadOnly() {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource();
        source.setReadOnly(true);
        assertThat(source.getReadOnly(), is(true));
    }

    //BaseRock generated method id: ${testSecretRef}, hash: 6DF58C93D36BC408B4AA9857CA2F6FDF
    @Test
    void testSecretRef() {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource();
        V1SecretReference secretRef = new V1SecretReference();
        secretRef.setName("iscsi-secret");
        secretRef.setNamespace("default");
        source.setSecretRef(secretRef);
        assertThat(source.getSecretRef(), is(secretRef));
    }

    //BaseRock generated method id: ${testTargetPortal}, hash: BAA594A31B74A733BB73B56522000DDF
    @Test
    void testTargetPortal() {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource();
        source.setTargetPortal("192.168.1.10:3260");
        assertThat(source.getTargetPortal(), is("192.168.1.10:3260"));
    }

    //BaseRock generated method id: ${testChapAuthDiscoveryFluentSetter}, hash: 5EB52E7564ADDD4A446AEC3FDEFBB5E7
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    void testChapAuthDiscoveryFluentSetter(boolean value) {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource().chapAuthDiscovery(value);
        assertThat(source.getChapAuthDiscovery(), is(value));
    }

    //BaseRock generated method id: ${testChapAuthSessionFluentSetter}, hash: C067F78F56057952C70BA0E2E821BE78
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    void testChapAuthSessionFluentSetter(boolean value) {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource().chapAuthSession(value);
        assertThat(source.getChapAuthSession(), is(value));
    }

    //BaseRock generated method id: ${testFsTypeFluentSetter}, hash: C02EE4CD0531CEE3287D5B63D00E6EF7
    @Test
    void testFsTypeFluentSetter() {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource().fsType("xfs");
        assertThat(source.getFsType(), is("xfs"));
    }

    //BaseRock generated method id: ${testInitiatorNameFluentSetter}, hash: 809C660EA576EB07CE7D52344C79D492
    @Test
    void testInitiatorNameFluentSetter() {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource().initiatorName("iqn.1993-08.org.debian:01:cca175ce02");
        assertThat(source.getInitiatorName(), is("iqn.1993-08.org.debian:01:cca175ce02"));
    }

    //BaseRock generated method id: ${testIqnFluentSetter}, hash: DFF619982775C85944B12C6E514732D1
    @Test
    void testIqnFluentSetter() {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource().iqn("iqn.2000-01.com.synology:diskstation.target-1.b3295ab8");
        assertThat(source.getIqn(), is("iqn.2000-01.com.synology:diskstation.target-1.b3295ab8"));
    }

    //BaseRock generated method id: ${testIscsiInterfaceFluentSetter}, hash: 7146FFC7321C683CB18124277732F8FB
    @Test
    void testIscsiInterfaceFluentSetter() {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource().iscsiInterface("custom");
        assertThat(source.getIscsiInterface(), is("custom"));
    }

    //BaseRock generated method id: ${testLunFluentSetter}, hash: C9AE99499AEE634ADCAA3B41D0154769
    @Test
    void testLunFluentSetter() {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource().lun(1);
        assertThat(source.getLun(), is(1));
    }

    //BaseRock generated method id: ${testPortalsFluentSetter}, hash: B2EBAF438288816E3273A55972CFFBAF
    @Test
    void testPortalsFluentSetter() {
        List<String> portals = new ArrayList<>();
        portals.add("192.168.1.12:3260");
        portals.add("192.168.1.13:3260");
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource().portals(portals);
        assertThat(source.getPortals(), is(portals));
    }

    //BaseRock generated method id: ${testReadOnlyFluentSetter}, hash: F1DBA77AD742178D86A58636CA470514
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    void testReadOnlyFluentSetter(boolean value) {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource().readOnly(value);
        assertThat(source.getReadOnly(), is(value));
    }

    //BaseRock generated method id: ${testSecretRefFluentSetter}, hash: 38D33EFE61E32F308C8192A3159BF687
    @Test
    void testSecretRefFluentSetter() {
        V1SecretReference secretRef = new V1SecretReference().name("iscsi-secret-2").namespace("kube-system");
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource().secretRef(secretRef);
        assertThat(source.getSecretRef(), is(secretRef));
    }

    //BaseRock generated method id: ${testTargetPortalFluentSetter}, hash: 0F4B6E8C5B424B7CBD1B6FC385F69C07
    @Test
    void testTargetPortalFluentSetter() {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource().targetPortal("192.168.1.14:3260");
        assertThat(source.getTargetPortal(), is("192.168.1.14:3260"));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 9C42DEB2669D05C2AC20D6942A310B2E
    @Test
    void testEqualsAndHashCode() {
        V1ISCSIPersistentVolumeSource source1 = new V1ISCSIPersistentVolumeSource().chapAuthDiscovery(true).chapAuthSession(false).fsType("ext4").initiatorName("iqn.1993-08.org.debian:01:cca175ce01").iqn("iqn.2000-01.com.synology:diskstation.target-1.b3295ab7").iscsiInterface("default").lun(0).readOnly(true).targetPortal("192.168.1.10:3260");
        V1ISCSIPersistentVolumeSource source2 = new V1ISCSIPersistentVolumeSource().chapAuthDiscovery(true).chapAuthSession(false).fsType("ext4").initiatorName("iqn.1993-08.org.debian:01:cca175ce01").iqn("iqn.2000-01.com.synology:diskstation.target-1.b3295ab7").iscsiInterface("default").lun(0).readOnly(true).targetPortal("192.168.1.10:3260");
        assertThat(source1, is(equalTo(source2)));
        assertThat(source1.hashCode(), is(equalTo(source2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 3D02DB8C5F0CD8AF40CB9C9EC96B258F
    @Test
    void testToString() {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource().chapAuthDiscovery(true).chapAuthSession(false).fsType("ext4").initiatorName("iqn.1993-08.org.debian:01:cca175ce01").iqn("iqn.2000-01.com.synology:diskstation.target-1.b3295ab7").iscsiInterface("default").lun(0).readOnly(true).targetPortal("192.168.1.10:3260");
        String toString = source.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("chapAuthDiscovery"), is(true));
        assertThat(toString.contains("chapAuthSession"), is(true));
        assertThat(toString.contains("fsType"), is(true));
        assertThat(toString.contains("initiatorName"), is(true));
        assertThat(toString.contains("iqn"), is(true));
        assertThat(toString.contains("iscsiInterface"), is(true));
        assertThat(toString.contains("lun"), is(true));
        assertThat(toString.contains("readOnly"), is(true));
        assertThat(toString.contains("targetPortal"), is(true));
    }

    //BaseRock generated method id: ${testAddPortalsItem}, hash: AC641D9F74A587911A559955663B1E43
    @Test
    void testAddPortalsItem() {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource();
        source.addPortalsItem("192.168.1.15:3260");
        assertThat(source.getPortals().size(), is(1));
        assertThat(source.getPortals().get(0), is("192.168.1.15:3260"));
    }

    //BaseRock generated method id: ${testRequiredFieldsNotNull}, hash: FF5C519B1F6A35FD0923A8B051D5D5C3
    @Disabled()
    @Test
    void testRequiredFieldsNotNull() {
        V1ISCSIPersistentVolumeSource source = new V1ISCSIPersistentVolumeSource();
        assertThrows(NullPointerException.class, () -> source.setIqn(null));
        assertThrows(NullPointerException.class, () -> source.setLun(null));
        assertThrows(NullPointerException.class, () -> source.setTargetPortal(null));
    }
}

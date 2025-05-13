package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1beta1NetworkDeviceData;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1NetworkDeviceDataBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1beta1NetworkDeviceDataConstructor}, hash: A9EB88DBD34FD1B7A961C3A345971A77
    @Test
    void testV1beta1NetworkDeviceDataConstructor() {
        V1beta1NetworkDeviceData networkDeviceData = new V1beta1NetworkDeviceData();
        assertNotNull(networkDeviceData);
    }

    //BaseRock generated method id: ${testHardwareAddress}, hash: 92844BD2C0382F3B52E1434C4CCA7FEA
    @Test
    void testHardwareAddress() {
        V1beta1NetworkDeviceData networkDeviceData = new V1beta1NetworkDeviceData();
        String hardwareAddress = "00:11:22:33:44:55";
        networkDeviceData.setHardwareAddress(hardwareAddress);
        assertEquals(hardwareAddress, networkDeviceData.getHardwareAddress());
    }

    //BaseRock generated method id: ${testInterfaceName}, hash: C8B466A23144DE3A75309C5386C322BC
    @Test
    void testInterfaceName() {
        V1beta1NetworkDeviceData networkDeviceData = new V1beta1NetworkDeviceData();
        String interfaceName = "eth0";
        networkDeviceData.setInterfaceName(interfaceName);
        assertEquals(interfaceName, networkDeviceData.getInterfaceName());
    }

    //BaseRock generated method id: ${testIps}, hash: 944F99994F7B106DCDEA626C27382674
    @Test
    void testIps() {
        V1beta1NetworkDeviceData networkDeviceData = new V1beta1NetworkDeviceData();
        List<String> ips = Arrays.asList("192.168.1.1/24", "2001:db8::1/64");
        networkDeviceData.setIps(ips);
        assertThat(networkDeviceData.getIps(), is(equalTo(ips)));
    }

    //BaseRock generated method id: ${testAddIpsItem}, hash: 660C2D7C9D7378B749CE91957EAD7930
    @Test
    void testAddIpsItem() {
        V1beta1NetworkDeviceData networkDeviceData = new V1beta1NetworkDeviceData();
        String ip = "10.0.0.1/24";
        networkDeviceData.addIpsItem(ip);
        assertThat(networkDeviceData.getIps(), hasSize(1));
        assertThat(networkDeviceData.getIps().get(0), is(equalTo(ip)));
    }

    //BaseRock generated method id: ${testAddMultipleIpsItems}, hash: F33025EAF8FBD7D0589B3B53119E1716
    @ParameterizedTest
    @ValueSource(strings = { "192.168.0.1/24", "2001:db8::1/64", "10.0.0.1/16" })
    void testAddMultipleIpsItems(String ip) {
        V1beta1NetworkDeviceData networkDeviceData = new V1beta1NetworkDeviceData();
        networkDeviceData.addIpsItem(ip);
        assertThat(networkDeviceData.getIps(), hasSize(1));
        assertThat(networkDeviceData.getIps().get(0), is(equalTo(ip)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 2B65903BDC5E351FFE724C4DE846FAB7
    @Test
    void testEquals() {
        V1beta1NetworkDeviceData networkDeviceData1 = new V1beta1NetworkDeviceData().hardwareAddress("00:11:22:33:44:55").interfaceName("eth0").addIpsItem("192.168.1.1/24");
        V1beta1NetworkDeviceData networkDeviceData2 = new V1beta1NetworkDeviceData().hardwareAddress("00:11:22:33:44:55").interfaceName("eth0").addIpsItem("192.168.1.1/24");
        assertThat(networkDeviceData1, is(equalTo(networkDeviceData2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 462EB8C0213F0BF0D591160F149B0F98
    @Test
    void testHashCode() {
        V1beta1NetworkDeviceData networkDeviceData1 = new V1beta1NetworkDeviceData().hardwareAddress("00:11:22:33:44:55").interfaceName("eth0").addIpsItem("192.168.1.1/24");
        V1beta1NetworkDeviceData networkDeviceData2 = new V1beta1NetworkDeviceData().hardwareAddress("00:11:22:33:44:55").interfaceName("eth0").addIpsItem("192.168.1.1/24");
        assertEquals(networkDeviceData1.hashCode(), networkDeviceData2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 451DA9D397B989B622B44726D989898E
    @Test
    void testToString() {
        V1beta1NetworkDeviceData networkDeviceData = new V1beta1NetworkDeviceData().hardwareAddress("00:11:22:33:44:55").interfaceName("eth0").addIpsItem("192.168.1.1/24");
        String expectedString = "class V1beta1NetworkDeviceData {\n    hardwareAddress: 00:11:22:33:44:55\n    interfaceName: eth0\n    ips: [192.168.1.1/24]\n}";
        assertThat(networkDeviceData.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 30429391B7C2AE7C62F35AFC8E12BA15
    @Test
    void testBuilder() {
        V1beta1NetworkDeviceData networkDeviceData = new V1beta1NetworkDeviceData().hardwareAddress("00:11:22:33:44:55").interfaceName("eth0").addIpsItem("192.168.1.1/24");
        assertThat(networkDeviceData, is(notNullValue()));
        assertThat(networkDeviceData.getHardwareAddress(), is(equalTo("00:11:22:33:44:55")));
        assertThat(networkDeviceData.getInterfaceName(), is(equalTo("eth0")));
        assertThat(networkDeviceData.getIps(), hasSize(1));
        assertThat(networkDeviceData.getIps().get(0), is(equalTo("192.168.1.1/24")));
    }
}

package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import org.junit.jupiter.api.Timeout;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import io.kubernetes.client.openapi.models.V1alpha3NetworkDeviceData;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3NetworkDeviceDataBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 96BE1492C2197B31B0255512E379062E
    @Test
    void testConstructor() {
        V1alpha3NetworkDeviceData networkDeviceData = new V1alpha3NetworkDeviceData();
        assertNotNull(networkDeviceData);
    }

    //BaseRock generated method id: ${testSetAndGetHardwareAddress}, hash: 339B74585019DAEE41CA60AF26511698
    @Test
    void testSetAndGetHardwareAddress() {
        V1alpha3NetworkDeviceData networkDeviceData = new V1alpha3NetworkDeviceData();
        String hardwareAddress = "00:11:22:33:44:55";
        networkDeviceData.setHardwareAddress(hardwareAddress);
        assertEquals(hardwareAddress, networkDeviceData.getHardwareAddress());
    }

    //BaseRock generated method id: ${testSetAndGetHardwareAddressWithDifferentValues}, hash: 82DAFE27C1DCB52C45BDC998F5B07B07
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "AA:BB:CC:DD:EE:FF", "12:34:56:78:90:AB" })
    void testSetAndGetHardwareAddressWithDifferentValues(String hardwareAddress) {
        V1alpha3NetworkDeviceData networkDeviceData = new V1alpha3NetworkDeviceData();
        networkDeviceData.setHardwareAddress(hardwareAddress);
        assertEquals(hardwareAddress, networkDeviceData.getHardwareAddress());
    }

    //BaseRock generated method id: ${testSetAndGetInterfaceName}, hash: 3513018FFD9288993CF3F9CD5294D86A
    @Test
    void testSetAndGetInterfaceName() {
        V1alpha3NetworkDeviceData networkDeviceData = new V1alpha3NetworkDeviceData();
        String interfaceName = "eth0";
        networkDeviceData.setInterfaceName(interfaceName);
        assertEquals(interfaceName, networkDeviceData.getInterfaceName());
    }

    //BaseRock generated method id: ${testSetAndGetInterfaceNameWithDifferentValues}, hash: C82295787317027B3DB53FA44D124E18
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "wlan0", "enp0s3", "lo" })
    void testSetAndGetInterfaceNameWithDifferentValues(String interfaceName) {
        V1alpha3NetworkDeviceData networkDeviceData = new V1alpha3NetworkDeviceData();
        networkDeviceData.setInterfaceName(interfaceName);
        assertEquals(interfaceName, networkDeviceData.getInterfaceName());
    }

    //BaseRock generated method id: ${testSetAndGetIps}, hash: 54DB33D0E5AACDDDF19D9E229FCF18AD
    @Test
    void testSetAndGetIps() {
        V1alpha3NetworkDeviceData networkDeviceData = new V1alpha3NetworkDeviceData();
        List<String> ips = Arrays.asList("192.168.1.100", "2001:db8::1");
        networkDeviceData.setIps(ips);
        assertEquals(ips, networkDeviceData.getIps());
    }

    //BaseRock generated method id: ${testAddIpsItem}, hash: 41CF755784105D04F2C378166AD76794
    @Test
    void testAddIpsItem() {
        V1alpha3NetworkDeviceData networkDeviceData = new V1alpha3NetworkDeviceData();
        String ip = "10.0.0.1";
        networkDeviceData.addIpsItem(ip);
        assertTrue(networkDeviceData.getIps().contains(ip));
    }

    //BaseRock generated method id: ${testAddIpsItemToNullList}, hash: 54E5DF911F782A3A19B77ADB4A0EAAA3
    @Test
    void testAddIpsItemToNullList() {
        V1alpha3NetworkDeviceData networkDeviceData = new V1alpha3NetworkDeviceData();
        networkDeviceData.setIps(null);
        String ip = "172.16.0.1";
        networkDeviceData.addIpsItem(ip);
        assertNotNull(networkDeviceData.getIps());
        assertTrue(networkDeviceData.getIps().contains(ip));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: B30073AAC2C8D1815BF858D3375A5497
    @Test
    void testEqualsAndHashCode() {
        V1alpha3NetworkDeviceData networkDeviceData1 = new V1alpha3NetworkDeviceData().hardwareAddress("00:11:22:33:44:55").interfaceName("eth0").ips(Arrays.asList("192.168.1.100", "2001:db8::1"));
        V1alpha3NetworkDeviceData networkDeviceData2 = new V1alpha3NetworkDeviceData().hardwareAddress("00:11:22:33:44:55").interfaceName("eth0").ips(Arrays.asList("192.168.1.100", "2001:db8::1"));
        V1alpha3NetworkDeviceData networkDeviceData3 = new V1alpha3NetworkDeviceData().hardwareAddress("AA:BB:CC:DD:EE:FF").interfaceName("wlan0").ips(Arrays.asList("10.0.0.1", "fe80::1"));
        assertEquals(networkDeviceData1, networkDeviceData2);
        assertNotEquals(networkDeviceData1, networkDeviceData3);
        assertEquals(networkDeviceData1.hashCode(), networkDeviceData2.hashCode());
        assertNotEquals(networkDeviceData1.hashCode(), networkDeviceData3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: B87BD514DA954A161C0F7AF21F51791B
    @Test
    void testToString() {
        V1alpha3NetworkDeviceData networkDeviceData = new V1alpha3NetworkDeviceData().hardwareAddress("00:11:22:33:44:55").interfaceName("eth0").ips(Arrays.asList("192.168.1.100", "2001:db8::1"));
        String toString = networkDeviceData.toString();
        assertThat(toString, containsString("hardwareAddress"));
        assertThat(toString, containsString("00:11:22:33:44:55"));
        assertThat(toString, containsString("interfaceName"));
        assertThat(toString, containsString("eth0"));
        assertThat(toString, containsString("ips"));
        assertThat(toString, containsString("192.168.1.100"));
        assertThat(toString, containsString("2001:db8::1"));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 85E9C18A0DB0AD293437BFB6620167D3
    @Test
    void testBuilder() {
        V1alpha3NetworkDeviceData networkDeviceData = new V1alpha3NetworkDeviceData().hardwareAddress("00:11:22:33:44:55").interfaceName("eth0").ips(Arrays.asList("192.168.1.100", "2001:db8::1"));
        assertEquals("00:11:22:33:44:55", networkDeviceData.getHardwareAddress());
        assertEquals("eth0", networkDeviceData.getInterfaceName());
        assertEquals(Arrays.asList("192.168.1.100", "2001:db8::1"), networkDeviceData.getIps());
    }

    //BaseRock generated method id: ${testBuilderWithNullValues}, hash: 19701C0DC3B841D22D3AD363F2337986
    @Test
    void testBuilderWithNullValues() {
        V1alpha3NetworkDeviceData networkDeviceData = new V1alpha3NetworkDeviceData().hardwareAddress(null).interfaceName(null).ips(null);
        assertNull(networkDeviceData.getHardwareAddress());
        assertNull(networkDeviceData.getInterfaceName());
        assertNull(networkDeviceData.getIps());
    }

    //BaseRock generated method id: ${testClone}, hash: 7B9EE0E8D5D00053DDDDA04F5C3C649D
    @Test
    void testClone() {
        V1alpha3NetworkDeviceData original = new V1alpha3NetworkDeviceData().hardwareAddress("00:11:22:33:44:55").interfaceName("eth0").ips(Arrays.asList("192.168.1.100", "2001:db8::1"));
        V1alpha3NetworkDeviceData clone = new V1alpha3NetworkDeviceData().hardwareAddress(original.getHardwareAddress()).interfaceName(original.getInterfaceName()).ips(new ArrayList<>(original.getIps()));
        assertEquals(original, clone);
        assertNotSame(original, clone);
        assertNotSame(original.getIps(), clone.getIps());
    }
}

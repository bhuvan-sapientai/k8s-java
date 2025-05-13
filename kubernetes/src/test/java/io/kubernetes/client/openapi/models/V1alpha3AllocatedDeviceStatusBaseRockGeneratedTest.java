package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1Condition;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1alpha3NetworkDeviceData;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3AllocatedDeviceStatusBaseRockGeneratedTest {

    private V1alpha3AllocatedDeviceStatus allocatedDeviceStatus;

    @BeforeEach
    void setUp() {
        allocatedDeviceStatus = new V1alpha3AllocatedDeviceStatus();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 569081F7561AE309D0CB449121B66018
    @Test
    void testConstructor() {
        assertNotNull(allocatedDeviceStatus);
    }

    //BaseRock generated method id: ${testConditions}, hash: 981AE3AF1A1C7F792339DDBF3728BD36
    @Test
    void testConditions() {
        List<V1Condition> conditions = new ArrayList<>();
        V1Condition condition = mock(V1Condition.class);
        conditions.add(condition);
        allocatedDeviceStatus.setConditions(conditions);
        assertEquals(conditions, allocatedDeviceStatus.getConditions());
        allocatedDeviceStatus.addConditionsItem(condition);
        assertThat(allocatedDeviceStatus.getConditions(), hasSize(2));
    }

    //BaseRock generated method id: ${testData}, hash: 60539395B8E6AE629CFD9D5298C7104B
    @Test
    void testData() {
        Object data = new Object();
        allocatedDeviceStatus.setData(data);
        assertEquals(data, allocatedDeviceStatus.getData());
    }

    //BaseRock generated method id: ${testDevice}, hash: 50A6EFED30CD03A75EEE9EA67AEC9DB1
    @Test
    void testDevice() {
        String device = "test-device";
        allocatedDeviceStatus.setDevice(device);
        assertEquals(device, allocatedDeviceStatus.getDevice());
    }

    //BaseRock generated method id: ${testDriver}, hash: FCE27479E57347249E75655E5D1425C0
    @Test
    void testDriver() {
        String driver = "test-driver";
        allocatedDeviceStatus.setDriver(driver);
        assertEquals(driver, allocatedDeviceStatus.getDriver());
    }

    //BaseRock generated method id: ${testNetworkData}, hash: 417E785B3936B6F715FFB12D9DCE448A
    @Test
    void testNetworkData() {
        V1alpha3NetworkDeviceData networkData = mock(V1alpha3NetworkDeviceData.class);
        allocatedDeviceStatus.setNetworkData(networkData);
        assertEquals(networkData, allocatedDeviceStatus.getNetworkData());
    }

    //BaseRock generated method id: ${testPool}, hash: 53CB7A994437E28472A0BBE38793B43D
    @Test
    void testPool() {
        String pool = "test-pool";
        allocatedDeviceStatus.setPool(pool);
        assertEquals(pool, allocatedDeviceStatus.getPool());
    }

    //BaseRock generated method id: ${testEquals}, hash: 6C761C3E1235B2B95102D760010A0A37
    @Test
    void testEquals() {
        V1alpha3AllocatedDeviceStatus status1 = new V1alpha3AllocatedDeviceStatus().conditions(new ArrayList<>()).data("data").device("device1").driver("driver1").networkData(new V1alpha3NetworkDeviceData()).pool("pool1");
        V1alpha3AllocatedDeviceStatus status2 = new V1alpha3AllocatedDeviceStatus().conditions(new ArrayList<>()).data("data").device("device1").driver("driver1").networkData(new V1alpha3NetworkDeviceData()).pool("pool1");
        assertEquals(status1, status2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: A34AFD079D726B0CAC409F3F36612337
    @Test
    void testHashCode() {
        V1alpha3AllocatedDeviceStatus status1 = new V1alpha3AllocatedDeviceStatus().conditions(new ArrayList<>()).data("data").device("device1").driver("driver1").networkData(new V1alpha3NetworkDeviceData()).pool("pool1");
        V1alpha3AllocatedDeviceStatus status2 = new V1alpha3AllocatedDeviceStatus().conditions(new ArrayList<>()).data("data").device("device1").driver("driver1").networkData(new V1alpha3NetworkDeviceData()).pool("pool1");
        assertEquals(status1.hashCode(), status2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 10B48C7EB061742645EF7B230F7944D4
    @Test
    void testToString() {
        V1alpha3AllocatedDeviceStatus status = new V1alpha3AllocatedDeviceStatus().conditions(new ArrayList<>()).data("data").device("device1").driver("driver1").networkData(new V1alpha3NetworkDeviceData()).pool("pool1");
        String toString = status.toString();
        assertThat(toString, notNullValue());
        assertThat(toString, startsWith("class V1alpha3AllocatedDeviceStatus {"));
        assertThat(toString, endsWith("}"));
        assertThat(toString.contains("conditions"), equalTo(true));
        assertThat(toString.contains("data"), equalTo(true));
        assertThat(toString.contains("device"), equalTo(true));
        assertThat(toString.contains("driver"), equalTo(true));
        assertThat(toString.contains("networkData"), equalTo(true));
        assertThat(toString.contains("pool"), equalTo(true));
    }
}

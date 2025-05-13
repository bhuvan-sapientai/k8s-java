package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1Condition;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1beta1NetworkDeviceData;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1beta1AllocatedDeviceStatusBaseRockGeneratedTest {

    private V1beta1AllocatedDeviceStatus allocatedDeviceStatus;

    @BeforeEach
    void setUp() {
        allocatedDeviceStatus = new V1beta1AllocatedDeviceStatus();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 6CEC04CA6E141A4AF775AAB7A247A1E6
    @Test
    void testConstructor() {
        assertThat(allocatedDeviceStatus, is(notNullValue()));
    }

    //BaseRock generated method id: ${testConditions}, hash: C4C8BA7E74D9C56456A935862168B199
    @Test
    void testConditions() {
        List<V1Condition> conditions = new ArrayList<>();
        V1Condition condition = mock(V1Condition.class);
        conditions.add(condition);
        allocatedDeviceStatus.setConditions(conditions);
        assertThat(allocatedDeviceStatus.getConditions(), hasSize(1));
        assertThat(allocatedDeviceStatus.getConditions().get(0), is(condition));
        V1Condition anotherCondition = mock(V1Condition.class);
        allocatedDeviceStatus.addConditionsItem(anotherCondition);
        assertThat(allocatedDeviceStatus.getConditions(), hasSize(2));
        assertThat(allocatedDeviceStatus.getConditions().get(1), is(anotherCondition));
    }

    //BaseRock generated method id: ${testData}, hash: 485A46B23D7730420D45F61C48B31A7C
    @Test
    void testData() {
        Object data = new Object();
        allocatedDeviceStatus.setData(data);
        assertThat(allocatedDeviceStatus.getData(), is(data));
    }

    //BaseRock generated method id: ${testDevice}, hash: C072F7F3591B230E2716965F8F836323
    @Test
    void testDevice() {
        String device = "testDevice";
        allocatedDeviceStatus.setDevice(device);
        assertThat(allocatedDeviceStatus.getDevice(), is(device));
    }

    //BaseRock generated method id: ${testDriver}, hash: 623836DAB4FFDBD58535977A2A8002A1
    @Test
    void testDriver() {
        String driver = "testDriver";
        allocatedDeviceStatus.setDriver(driver);
        assertThat(allocatedDeviceStatus.getDriver(), is(driver));
    }

    //BaseRock generated method id: ${testNetworkData}, hash: 6E69334DCA10AF8D099514CA58255779
    @Test
    void testNetworkData() {
        V1beta1NetworkDeviceData networkData = mock(V1beta1NetworkDeviceData.class);
        allocatedDeviceStatus.setNetworkData(networkData);
        assertThat(allocatedDeviceStatus.getNetworkData(), is(networkData));
    }

    //BaseRock generated method id: ${testPool}, hash: 61D81BA391D8282FC6F9504133F1905C
    @Test
    void testPool() {
        String pool = "testPool";
        allocatedDeviceStatus.setPool(pool);
        assertThat(allocatedDeviceStatus.getPool(), is(pool));
    }

    //BaseRock generated method id: ${testEquals}, hash: 7BC5708662ABC8AE3C54A2038BAAE0FD
    @Test
    void testEquals() {
        V1beta1AllocatedDeviceStatus status1 = new V1beta1AllocatedDeviceStatus().device("device1").driver("driver1").pool("pool1");
        V1beta1AllocatedDeviceStatus status2 = new V1beta1AllocatedDeviceStatus().device("device1").driver("driver1").pool("pool1");
        assertThat(status1.equals(status2), is(true));
        status2.setDevice("device2");
        assertThat(status1.equals(status2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: AB7ABBBFAA44729B826B8CE622C47E75
    @Test
    void testHashCode() {
        V1beta1AllocatedDeviceStatus status1 = new V1beta1AllocatedDeviceStatus().device("device1").driver("driver1").pool("pool1");
        V1beta1AllocatedDeviceStatus status2 = new V1beta1AllocatedDeviceStatus().device("device1").driver("driver1").pool("pool1");
        assertThat(status1.hashCode(), is(equalTo(status2.hashCode())));
        status2.setDevice("device2");
        assertThat(status1.hashCode(), is(not(equalTo(status2.hashCode()))));
    }

    //BaseRock generated method id: ${testToString}, hash: 274EFD027E3214DE1EB564FFB01C3304
    @Test
    void testToString() {
        V1beta1AllocatedDeviceStatus status = new V1beta1AllocatedDeviceStatus().device("testDevice").driver("testDriver").pool("testPool");
        String toString = status.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("testDevice"), is(true));
        assertThat(toString.contains("testDriver"), is(true));
        assertThat(toString.contains("testPool"), is(true));
    }

    //BaseRock generated method id: ${testSetNullValues}, hash: C9DA424527737EDA2AEEC3DA3874B1CE
    @Test
    void testSetNullValues() {
        allocatedDeviceStatus.setConditions(null);
        assertThat(allocatedDeviceStatus.getConditions(), is(nullValue()));
        allocatedDeviceStatus.setData(null);
        assertThat(allocatedDeviceStatus.getData(), is(nullValue()));
        allocatedDeviceStatus.setNetworkData(null);
        assertThat(allocatedDeviceStatus.getNetworkData(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetNullRequiredFields}, hash: 50125797BA98F42111182AB324A06133
    @Disabled()
    @Test
    void testSetNullRequiredFields() {
        assertThrows(NullPointerException.class, () -> allocatedDeviceStatus.setDevice(null));
        assertThrows(NullPointerException.class, () -> allocatedDeviceStatus.setDriver(null));
        assertThrows(NullPointerException.class, () -> allocatedDeviceStatus.setPool(null));
    }
}

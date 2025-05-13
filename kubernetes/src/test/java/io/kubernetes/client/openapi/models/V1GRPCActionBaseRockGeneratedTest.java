package io.kubernetes.client.openapi.models;

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
import io.kubernetes.client.openapi.models.V1GRPCAction;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1GRPCActionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 48E327E45A0C47080044D18BAB98E3EB
    @Test
    void testConstructor() {
        V1GRPCAction action = new V1GRPCAction();
        assertThat(action, is(notNullValue()));
    }

    //BaseRock generated method id: ${testGetPort}, hash: 9FE41FC84FC50CEBCCC6BD34D498198C
    @Test
    void testGetPort() {
        V1GRPCAction action = new V1GRPCAction().port(8080);
        assertThat(action.getPort(), is(equalTo(8080)));
    }

    //BaseRock generated method id: ${testSetPort}, hash: 0B2F091076931D904ED75D4A8E112A4C
    @Test
    void testSetPort() {
        V1GRPCAction action = new V1GRPCAction();
        action.setPort(9090);
        assertThat(action.getPort(), is(equalTo(9090)));
    }

    //BaseRock generated method id: ${testSetPortBoundaryValues}, hash: EBD3BFFB9554CB0EC5E65732A337A4FD
    @ParameterizedTest
    @ValueSource(ints = { 1, 65535 })
    void testSetPortBoundaryValues(int port) {
        V1GRPCAction action = new V1GRPCAction();
        action.setPort(port);
        assertThat(action.getPort(), is(equalTo(port)));
    }

    //BaseRock generated method id: ${testSetPortNegativeValue}, hash: 294322372EAAD44CBBFDF2A0572D886D
    @Test
    void testSetPortNegativeValue() {
        V1GRPCAction action = new V1GRPCAction();
        action.setPort(-1);
        assertThat(action.getPort(), is(equalTo(-1)));
    }

    //BaseRock generated method id: ${testSetPortExceedingMaxValue}, hash: A520920382FDF5C5640A0597566F3AAA
    @Test
    void testSetPortExceedingMaxValue() {
        V1GRPCAction action = new V1GRPCAction();
        action.setPort(65536);
        assertThat(action.getPort(), is(equalTo(65536)));
    }

    //BaseRock generated method id: ${testGetService}, hash: B737528FA124465D78443E9DC8F15768
    @Test
    void testGetService() {
        V1GRPCAction action = new V1GRPCAction().service("test-service");
        assertThat(action.getService(), is(equalTo("test-service")));
    }

    //BaseRock generated method id: ${testSetService}, hash: 307A7BBD58F154C72A0FA459C687FE00
    @Test
    void testSetService() {
        V1GRPCAction action = new V1GRPCAction();
        action.setService("new-service");
        assertThat(action.getService(), is(equalTo("new-service")));
    }

    //BaseRock generated method id: ${testSetServiceNull}, hash: E60656A0CD26A5612979609D1D87CA64
    @Test
    void testSetServiceNull() {
        V1GRPCAction action = new V1GRPCAction();
        action.setService(null);
        assertThat(action.getService(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 43F6A2BC23489A823B2A0EC416258B6E
    @Test
    void testEquals() {
        V1GRPCAction action1 = new V1GRPCAction().port(8080).service("test-service");
        V1GRPCAction action2 = new V1GRPCAction().port(8080).service("test-service");
        V1GRPCAction action3 = new V1GRPCAction().port(9090).service("other-service");
        assertThat(action1.equals(action2), is(true));
        assertThat(action1.equals(action3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 97545D42DFC926BEDCF293BA5682650A
    @Test
    void testHashCode() {
        V1GRPCAction action1 = new V1GRPCAction().port(8080).service("test-service");
        V1GRPCAction action2 = new V1GRPCAction().port(8080).service("test-service");
        V1GRPCAction action3 = new V1GRPCAction().port(9090).service("other-service");
        assertThat(action1.hashCode(), is(equalTo(action2.hashCode())));
        assertThat(action1.hashCode(), is(not(equalTo(action3.hashCode()))));
    }

    //BaseRock generated method id: ${testToString}, hash: F48F8DCE39B9E290D278CCC8C7D3C0D8
    @Test
    void testToString() {
        V1GRPCAction action = new V1GRPCAction().port(8080).service("test-service");
        String expected = "class V1GRPCAction {\n    port: 8080\n    service: test-service\n}";
        assertThat(action.toString(), is(equalTo(expected)));
    }
}

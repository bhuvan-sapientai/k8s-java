package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1TCPSocketAction;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.custom.IntOrString;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1TCPSocketActionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 803A432C275E992E6D61B80770A3F738
    @Test
    void testConstructor() {
        V1TCPSocketAction action = new V1TCPSocketAction();
        assertThat(action, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetHost}, hash: 87D020BB66BF2F697C3614E94C2040A3
    @Test
    void testSetAndGetHost() {
        V1TCPSocketAction action = new V1TCPSocketAction();
        String host = "example.com";
        action.setHost(host);
        assertThat(action.getHost(), is(equalTo(host)));
    }

    //BaseRock generated method id: ${testSetAndGetHostWithDifferentValues}, hash: 88837CE91536084E77419E3ECE3F2FE2
    @ParameterizedTest
    @ValueSource(strings = { "localhost", "127.0.0.1", "" })
    void testSetAndGetHostWithDifferentValues(String host) {
        V1TCPSocketAction action = new V1TCPSocketAction();
        action.setHost(host);
        assertThat(action.getHost(), is(equalTo(host)));
    }

    //BaseRock generated method id: ${testSetAndGetPort}, hash: 5EEF50A168D3C38D1BFAA72E534BF6A4
    @Test
    void testSetAndGetPort() {
        V1TCPSocketAction action = new V1TCPSocketAction();
        IntOrString port = new IntOrString(8080);
        action.setPort(port);
        assertThat(action.getPort(), is(equalTo(port)));
    }

    //BaseRock generated method id: ${testSetAndGetPortWithString}, hash: 4499261A05AE46C9A946B3831E4DD047
    @Test
    void testSetAndGetPortWithString() {
        V1TCPSocketAction action = new V1TCPSocketAction();
        IntOrString port = new IntOrString("http");
        action.setPort(port);
        assertThat(action.getPort(), is(equalTo(port)));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: D4643F70A8A860B0D16058904F21A3C4
    @Test
    void testEqualsWithSameObject() {
        V1TCPSocketAction action = new V1TCPSocketAction().host("example.com").port(new IntOrString(8080));
        assertThat(action.equals(action), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 283602EE30091696FE7737A20DA1B161
    @Test
    void testEqualsWithDifferentObject() {
        V1TCPSocketAction action1 = new V1TCPSocketAction().host("example.com").port(new IntOrString(8080));
        V1TCPSocketAction action2 = new V1TCPSocketAction().host("example.com").port(new IntOrString(8080));
        assertThat(action1.equals(action2), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentHost}, hash: F16A34B68B4DE4D838CD93F7FEBAE4F7
    @Test
    void testEqualsWithDifferentHost() {
        V1TCPSocketAction action1 = new V1TCPSocketAction().host("example.com").port(new IntOrString(8080));
        V1TCPSocketAction action2 = new V1TCPSocketAction().host("example.org").port(new IntOrString(8080));
        assertThat(action1.equals(action2), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentPort}, hash: EF88A4BBA7F75B551ECBA593D57237F2
    @Test
    void testEqualsWithDifferentPort() {
        V1TCPSocketAction action1 = new V1TCPSocketAction().host("example.com").port(new IntOrString(8080));
        V1TCPSocketAction action2 = new V1TCPSocketAction().host("example.com").port(new IntOrString(9090));
        assertThat(action1.equals(action2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 040147324FE4B39C66A6A50617098611
    @Test
    void testHashCode() {
        V1TCPSocketAction action1 = new V1TCPSocketAction().host("example.com").port(new IntOrString(8080));
        V1TCPSocketAction action2 = new V1TCPSocketAction().host("example.com").port(new IntOrString(8080));
        assertThat(action1.hashCode(), is(equalTo(action2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 746EE036387AFE1DC93478562B9D6EA0
    @Test
    void testToString() {
        V1TCPSocketAction action = new V1TCPSocketAction().host("example.com").port(new IntOrString(8080));
        String expected = "class V1TCPSocketAction {\n    host: example.com\n    port: 8080\n}";
        assertThat(action.toString(), is(equalTo(expected)));
    }

    //BaseRock generated method id: ${testSetNullHost}, hash: 2C8F0A613F565A5C611FD3FD4216001A
    @Test
    void testSetNullHost() {
        V1TCPSocketAction action = new V1TCPSocketAction();
        action.setHost(null);
        assertThat(action.getHost(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetNullPort}, hash: 97ECB640C18127385578F7CA3A46903F
    @Test
    void testSetNullPort() {
        V1TCPSocketAction action = new V1TCPSocketAction();
        assertDoesNotThrow(() -> action.setPort(null));
    }
}

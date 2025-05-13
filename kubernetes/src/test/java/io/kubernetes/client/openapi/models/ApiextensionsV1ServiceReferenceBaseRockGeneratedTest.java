package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.Objects;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class ApiextensionsV1ServiceReferenceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: B3EE4A91A00016FDFE72C9465269B03F
    @Test
    void testConstructor() {
        ApiextensionsV1ServiceReference serviceReference = new ApiextensionsV1ServiceReference();
        assertThat(serviceReference, is(notNullValue()));
    }

    //BaseRock generated method id: ${testNameGetterAndSetter}, hash: 0F2E47505761AC87D126712B40993F83
    @Test
    void testNameGetterAndSetter() {
        ApiextensionsV1ServiceReference serviceReference = new ApiextensionsV1ServiceReference();
        String name = "test-service";
        serviceReference.setName(name);
        assertThat(serviceReference.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testNamespaceGetterAndSetter}, hash: 1006F11168BE223FAA0B557FCCB3CB8C
    @Test
    void testNamespaceGetterAndSetter() {
        ApiextensionsV1ServiceReference serviceReference = new ApiextensionsV1ServiceReference();
        String namespace = "test-namespace";
        serviceReference.setNamespace(namespace);
        assertThat(serviceReference.getNamespace(), is(equalTo(namespace)));
    }

    //BaseRock generated method id: ${testPathGetterAndSetter}, hash: 61C455E4F600B7805D41E26F2558C446
    @Test
    void testPathGetterAndSetter() {
        ApiextensionsV1ServiceReference serviceReference = new ApiextensionsV1ServiceReference();
        String path = "/test/path";
        serviceReference.setPath(path);
        assertThat(serviceReference.getPath(), is(equalTo(path)));
    }

    //BaseRock generated method id: ${testPortGetterAndSetter}, hash: D0DD13D3D09B585BB9D77C6CD02D670B
    @Test
    void testPortGetterAndSetter() {
        ApiextensionsV1ServiceReference serviceReference = new ApiextensionsV1ServiceReference();
        Integer port = 8080;
        serviceReference.setPort(port);
        assertThat(serviceReference.getPort(), is(equalTo(port)));
    }

    //BaseRock generated method id: ${testEquals}, hash: AFC7FF65BC2FD8BDD839244D195CB645
    @Test
    void testEquals() {
        ApiextensionsV1ServiceReference reference1 = new ApiextensionsV1ServiceReference().name("test-service").namespace("test-namespace").path("/test/path").port(8080);
        ApiextensionsV1ServiceReference reference2 = new ApiextensionsV1ServiceReference().name("test-service").namespace("test-namespace").path("/test/path").port(8080);
        assertThat(reference1.equals(reference2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: F1FDF2191A1126C8CC632CC832A6AA83
    @Test
    void testHashCode() {
        ApiextensionsV1ServiceReference reference = new ApiextensionsV1ServiceReference().name("test-service").namespace("test-namespace").path("/test/path").port(8080);
        int expectedHashCode = Objects.hash(reference.getName(), reference.getNamespace(), reference.getPath(), reference.getPort());
        assertThat(reference.hashCode(), is(equalTo(expectedHashCode)));
    }

    //BaseRock generated method id: ${testToString}, hash: 5625929FCF18DF152DB01351D94531E3
    @Test
    void testToString() {
        ApiextensionsV1ServiceReference reference = new ApiextensionsV1ServiceReference().name("test-service").namespace("test-namespace").path("/test/path").port(8080);
        String expectedString = "class ApiextensionsV1ServiceReference {\n    name: test-service\n    namespace: test-namespace\n    path: /test/path\n    port: 8080\n}";
        assertThat(reference.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testValidPortValues}, hash: BE62C70CD7798A1337550BB192C87952
    @ParameterizedTest
    @ValueSource(ints = { 1, 443, 65535 })
    void testValidPortValues(int port) {
        ApiextensionsV1ServiceReference reference = new ApiextensionsV1ServiceReference().port(port);
        assertThat(reference.getPort(), is(equalTo(port)));
    }

    //BaseRock generated method id: ${testInvalidPortValue}, hash: 65A2BCABBD571035D3A9242879BEE177
    @Test
    void testInvalidPortValue() {
        ApiextensionsV1ServiceReference reference = new ApiextensionsV1ServiceReference();
        // The ApiextensionsV1ServiceReference class does not throw IllegalArgumentException for invalid port values
        // It simply sets the value without validation
        reference.setPort(0);
        assertThat(reference.getPort(), is(equalTo(0)));
        reference.setPort(65536);
        assertThat(reference.getPort(), is(equalTo(65536)));
    }

    //BaseRock generated method id: ${testNullValues}, hash: 4522118FE5B9651DAEE10C89E06B78BC
    @Test
    void testNullValues() {
        ApiextensionsV1ServiceReference reference = new ApiextensionsV1ServiceReference();
        reference.setName(null);
        reference.setNamespace(null);
        reference.setPath(null);
        reference.setPort(null);
        assertThat(reference.getName(), is(equalTo(null)));
        assertThat(reference.getNamespace(), is(equalTo(null)));
        assertThat(reference.getPath(), is(equalTo(null)));
        assertThat(reference.getPort(), is(equalTo(null)));
    }
}

package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.ApiregistrationV1ServiceReference;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class ApiregistrationV1ServiceReferenceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: E04C03C24BAF7EE2CA9803481EF04450
    @Test
    void testConstructor() {
        ApiregistrationV1ServiceReference serviceReference = new ApiregistrationV1ServiceReference();
        assertNotNull(serviceReference);
    }

    //BaseRock generated method id: ${testSetAndGetName}, hash: 1933DD52F70E24A7CDDF2221C25ACB43
    @Test
    void testSetAndGetName() {
        ApiregistrationV1ServiceReference serviceReference = new ApiregistrationV1ServiceReference();
        String name = "test-service";
        serviceReference.setName(name);
        assertEquals(name, serviceReference.getName());
    }

    //BaseRock generated method id: ${testSetAndGetNamespace}, hash: D83FF7240B163CA35A67E604552F35FF
    @Test
    void testSetAndGetNamespace() {
        ApiregistrationV1ServiceReference serviceReference = new ApiregistrationV1ServiceReference();
        String namespace = "test-namespace";
        serviceReference.setNamespace(namespace);
        assertEquals(namespace, serviceReference.getNamespace());
    }

    //BaseRock generated method id: ${testSetAndGetPort}, hash: 41A65DC427A79ECDC0FB4103C7208E25
    @Test
    void testSetAndGetPort() {
        ApiregistrationV1ServiceReference serviceReference = new ApiregistrationV1ServiceReference();
        Integer port = 8080;
        serviceReference.setPort(port);
        assertEquals(port, serviceReference.getPort());
    }

    //BaseRock generated method id: ${testBuilderMethods}, hash: EBCED282D8E99A95F8E72F56EE4A23F3
    @Test
    void testBuilderMethods() {
        String name = "test-service";
        String namespace = "test-namespace";
        Integer port = 8080;
        ApiregistrationV1ServiceReference serviceReference = new ApiregistrationV1ServiceReference().name(name).namespace(namespace).port(port);
        assertEquals(name, serviceReference.getName());
        assertEquals(namespace, serviceReference.getNamespace());
        assertEquals(port, serviceReference.getPort());
    }

    //BaseRock generated method id: ${testEquals}, hash: 1CE74A8E9DC601E7F13BF2781B082216
    @Test
    void testEquals() {
        ApiregistrationV1ServiceReference ref1 = new ApiregistrationV1ServiceReference().name("service1").namespace("namespace1").port(8080);
        ApiregistrationV1ServiceReference ref2 = new ApiregistrationV1ServiceReference().name("service1").namespace("namespace1").port(8080);
        ApiregistrationV1ServiceReference ref3 = new ApiregistrationV1ServiceReference().name("service2").namespace("namespace2").port(9090);
        assertThat(ref1, is(equalTo(ref2)));
        assertThat(ref1, is(notNullValue()));
        assertThat(ref1.equals(ref3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 68CD2C7FEFDCE79C43E323DAF4D1FB26
    @Test
    void testHashCode() {
        ApiregistrationV1ServiceReference ref1 = new ApiregistrationV1ServiceReference().name("service1").namespace("namespace1").port(8080);
        ApiregistrationV1ServiceReference ref2 = new ApiregistrationV1ServiceReference().name("service1").namespace("namespace1").port(8080);
        assertThat(ref1.hashCode(), is(equalTo(ref2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: C3FA1017A8D2C9FE10F298845208E866
    @Test
    void testToString() {
        ApiregistrationV1ServiceReference serviceReference = new ApiregistrationV1ServiceReference().name("test-service").namespace("test-namespace").port(8080);
        String expectedString = "class ApiregistrationV1ServiceReference {\n" + "    name: test-service\n" + "    namespace: test-namespace\n" + "    port: 8080\n" + "}";
        assertEquals(expectedString, serviceReference.toString());
    }

    //BaseRock generated method id: ${testValidPortValues}, hash: 2FD39EA37FA248708D6B1511214CC4B5
    @ParameterizedTest
    @ValueSource(ints = { 1, 65535 })
    void testValidPortValues(int port) {
        ApiregistrationV1ServiceReference serviceReference = new ApiregistrationV1ServiceReference().port(port);
        assertEquals(port, serviceReference.getPort());
    }

    //BaseRock generated method id: ${testNullValues}, hash: 0EB930629AD53174A4520D1E1E85A57B
    @Test
    void testNullValues() {
        ApiregistrationV1ServiceReference serviceReference = new ApiregistrationV1ServiceReference();
        assertThat(serviceReference.getName(), is(equalTo(null)));
        assertThat(serviceReference.getNamespace(), is(equalTo(null)));
        assertThat(serviceReference.getPort(), is(equalTo(null)));
    }
}

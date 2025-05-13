package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReference;
import org.junit.jupiter.api.BeforeEach;
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
import static org.hamcrest.Matchers.closeTo;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class AdmissionregistrationV1ServiceReferenceBaseRockGeneratedTest {

    private AdmissionregistrationV1ServiceReference serviceReference;

    @BeforeEach
    void setUp() {
        serviceReference = new AdmissionregistrationV1ServiceReference();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 9CD4D8B9E7F30309F5D6681453A5B7FD
    @Test
    void testConstructor() {
        assertThat(serviceReference, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetName}, hash: C3851A97B9A63B6055BEE52C184CF398
    @Test
    void testSetAndGetName() {
        String name = "test-service";
        serviceReference.setName(name);
        assertThat(serviceReference.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testSetAndGetNamespace}, hash: 989446E816B640332F8A6D002D01C0CD
    @Test
    void testSetAndGetNamespace() {
        String namespace = "test-namespace";
        serviceReference.setNamespace(namespace);
        assertThat(serviceReference.getNamespace(), is(equalTo(namespace)));
    }

    //BaseRock generated method id: ${testSetAndGetPath}, hash: AE5702C9BB3070854D538FEFFDB44285
    @Test
    void testSetAndGetPath() {
        String path = "/api/v1/test";
        serviceReference.setPath(path);
        assertThat(serviceReference.getPath(), is(equalTo(path)));
    }

    //BaseRock generated method id: ${testSetAndGetPort}, hash: 6D98F688839C2002765C5360A826F768
    @Test
    void testSetAndGetPort() {
        Integer port = 8080;
        serviceReference.setPort(port);
        assertThat(serviceReference.getPort(), is(equalTo(port)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 85A5DEA8393E5C089F0ECB0DBCFC6CE3
    @Test
    void testEquals() {
        AdmissionregistrationV1ServiceReference reference1 = new AdmissionregistrationV1ServiceReference().name("service1").namespace("namespace1").path("/api/v1").port(8080);
        AdmissionregistrationV1ServiceReference reference2 = new AdmissionregistrationV1ServiceReference().name("service1").namespace("namespace1").path("/api/v1").port(8080);
        assertThat(reference1.equals(reference2), is(true));
    }

    //BaseRock generated method id: ${testNotEquals}, hash: 815064C39100A03D087DC4D72B012465
    @Test
    void testNotEquals() {
        AdmissionregistrationV1ServiceReference reference1 = new AdmissionregistrationV1ServiceReference().name("service1").namespace("namespace1").path("/api/v1").port(8080);
        AdmissionregistrationV1ServiceReference reference2 = new AdmissionregistrationV1ServiceReference().name("service2").namespace("namespace2").path("/api/v2").port(9090);
        assertThat(reference1.equals(reference2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: C084B9A486573D01568BEAFA430C3C61
    @Test
    void testHashCode() {
        AdmissionregistrationV1ServiceReference reference1 = new AdmissionregistrationV1ServiceReference().name("service1").namespace("namespace1").path("/api/v1").port(8080);
        AdmissionregistrationV1ServiceReference reference2 = new AdmissionregistrationV1ServiceReference().name("service1").namespace("namespace1").path("/api/v1").port(8080);
        assertThat(reference1.hashCode(), is(equalTo(reference2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: A13D85B197BCCEBC4E1E124B466CEBA4
    @Test
    void testToString() {
        AdmissionregistrationV1ServiceReference reference = new AdmissionregistrationV1ServiceReference().name("test-service").namespace("test-namespace").path("/api/v1/test").port(8080);
        String expectedString = "class AdmissionregistrationV1ServiceReference {\n" + "    name: test-service\n" + "    namespace: test-namespace\n" + "    path: /api/v1/test\n" + "    port: 8080\n" + "}";
        assertThat(reference.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testValidPorts}, hash: ECF4559F58D0E1CC382A4952FD5852B0
    @ParameterizedTest
    @ValueSource(ints = { 1, 1000, 65535 })
    void testValidPorts(int port) {
        serviceReference.setPort(port);
        assertThat(serviceReference.getPort(), is(equalTo(port)));
    }

    //BaseRock generated method id: ${testInvalidPort}, hash: F42798FA9F06F093E6CE260F9B1FFB97
    @Test
    void testInvalidPort() {
        assertDoesNotThrow(() -> serviceReference.setPort(0));
        assertDoesNotThrow(() -> serviceReference.setPort(65536));
    }

    //BaseRock generated method id: ${testNullName}, hash: 2992CF2686764C0C8066BF72E81604CF
    @Test
    void testNullName() {
        assertDoesNotThrow(() -> serviceReference.setName(null));
    }

    //BaseRock generated method id: ${testNullNamespace}, hash: B0FA4025AC77F7F8FCBF6CB3C2DCAF5D
    @Test
    void testNullNamespace() {
        assertDoesNotThrow(() -> serviceReference.setNamespace(null));
    }

    //BaseRock generated method id: ${testNullPath}, hash: D96461E4EDE0443DFAB3C3A5EA209052
    @Test
    void testNullPath() {
        serviceReference.setPath(null);
        assertThat(serviceReference.getPath(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testNullPort}, hash: E84294B6C310FD5EB9ECA0FE85D60092
    @Test
    void testNullPort() {
        serviceReference.setPort(null);
        assertThat(serviceReference.getPort(), is(equalTo(null)));
    }
}

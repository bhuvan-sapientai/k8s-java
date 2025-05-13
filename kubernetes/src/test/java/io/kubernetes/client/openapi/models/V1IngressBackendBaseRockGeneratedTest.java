package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V1IngressBackend;
import io.kubernetes.client.openapi.models.V1IngressServiceBackend;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1TypedLocalObjectReference;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1IngressBackendBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1IngressBackendConstructor}, hash: 1008ACC5235819DDBDB51AB0E719A41D
    @Test
    void testV1IngressBackendConstructor() {
        V1IngressBackend ingressBackend = new V1IngressBackend();
        assertThat(ingressBackend, notNullValue());
    }

    //BaseRock generated method id: ${testResourceGetterAndSetter}, hash: A642841CC47503778156D59C11E77CCF
    @Test
    void testResourceGetterAndSetter() {
        V1IngressBackend ingressBackend = new V1IngressBackend();
        V1TypedLocalObjectReference resource = mock(V1TypedLocalObjectReference.class);
        ingressBackend.setResource(resource);
        assertThat(ingressBackend.getResource(), equalTo(resource));
    }

    //BaseRock generated method id: ${testServiceGetterAndSetter}, hash: B0DF0739B7BB32176FD57E426AF57D42
    @Test
    void testServiceGetterAndSetter() {
        V1IngressBackend ingressBackend = new V1IngressBackend();
        V1IngressServiceBackend service = mock(V1IngressServiceBackend.class);
        ingressBackend.setService(service);
        assertThat(ingressBackend.getService(), equalTo(service));
    }

    //BaseRock generated method id: ${testEqualsMethod}, hash: 0EA55A64ABDA06CA87FC6E922A67501D
    @Test
    void testEqualsMethod() {
        V1IngressBackend ingressBackend1 = new V1IngressBackend();
        V1IngressBackend ingressBackend2 = new V1IngressBackend();
        V1TypedLocalObjectReference resource = mock(V1TypedLocalObjectReference.class);
        V1IngressServiceBackend service = mock(V1IngressServiceBackend.class);
        ingressBackend1.setResource(resource);
        ingressBackend1.setService(service);
        ingressBackend2.setResource(resource);
        ingressBackend2.setService(service);
        assertThat(ingressBackend1.equals(ingressBackend2), equalTo(true));
    }

    //BaseRock generated method id: ${testHashCodeMethod}, hash: 86D7BCA21374A39E0760A325176857CC
    @Test
    void testHashCodeMethod() {
        V1IngressBackend ingressBackend1 = new V1IngressBackend();
        V1IngressBackend ingressBackend2 = new V1IngressBackend();
        V1TypedLocalObjectReference resource = mock(V1TypedLocalObjectReference.class);
        V1IngressServiceBackend service = mock(V1IngressServiceBackend.class);
        ingressBackend1.setResource(resource);
        ingressBackend1.setService(service);
        ingressBackend2.setResource(resource);
        ingressBackend2.setService(service);
        assertThat(ingressBackend1.hashCode(), equalTo(ingressBackend2.hashCode()));
    }

    //BaseRock generated method id: ${testToStringMethod}, hash: 1413A69FD7DBEAFDAE5406B19CF94513
    @Test
    void testToStringMethod() {
        V1IngressBackend ingressBackend = new V1IngressBackend();
        V1TypedLocalObjectReference resource = mock(V1TypedLocalObjectReference.class);
        V1IngressServiceBackend service = mock(V1IngressServiceBackend.class);
        when(resource.toString()).thenReturn("MockResource");
        when(service.toString()).thenReturn("MockService");
        ingressBackend.setResource(resource);
        ingressBackend.setService(service);
        String expectedString = "class V1IngressBackend {\n    resource: MockResource\n    service: MockService\n}";
        assertThat(ingressBackend.toString(), equalTo(expectedString));
    }
}

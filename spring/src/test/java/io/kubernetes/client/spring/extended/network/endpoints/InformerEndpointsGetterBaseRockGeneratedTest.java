package io.kubernetes.client.spring.extended.network.endpoints;

import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.V1Endpoints;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.informer.cache.Lister;
import org.mockito.Mock;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class InformerEndpointsGetterBaseRockGeneratedTest {

    @Mock
    private Lister<V1Endpoints> endpointsLister;

    @Mock
    private Lister<V1Endpoints> namespaceLister;

    private InformerEndpointsGetter informerEndpointsGetter;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        informerEndpointsGetter = new InformerEndpointsGetter(endpointsLister);
    }

    //BaseRock generated method id: ${testGetWithValidNamespaceAndName}, hash: 1685C1729744E2570C3929FC2B20F97A
    @Test
    void testGetWithValidNamespaceAndName() {
        String namespace = "default";
        String name = "test-endpoint";
        V1Endpoints expectedEndpoints = new V1Endpoints();
        when(endpointsLister.namespace(namespace)).thenReturn(namespaceLister);
        when(namespaceLister.get(name)).thenReturn(expectedEndpoints);
        V1Endpoints result = informerEndpointsGetter.get(namespace, name);
        assertEquals(expectedEndpoints, result);
    }

    //BaseRock generated method id: ${testGetWithNonExistentEndpoint}, hash: 908A0B709A21D4F977A2068353FBD6E6
    @Test
    void testGetWithNonExistentEndpoint() {
        String namespace = "default";
        String name = "non-existent-endpoint";
        when(endpointsLister.namespace(namespace)).thenReturn(namespaceLister);
        when(namespaceLister.get(name)).thenReturn(null);
        V1Endpoints result = informerEndpointsGetter.get(namespace, name);
        assertNull(result);
    }

    //BaseRock generated method id: ${testGetWithNullNamespace}, hash: EB595FC9B8D383AAE9EB13194F9EA6C0
    @Test
    void testGetWithNullNamespace() {
        String name = "test-endpoint";
        V1Endpoints expectedEndpoints = new V1Endpoints();
        when(endpointsLister.namespace(null)).thenReturn(namespaceLister);
        when(namespaceLister.get(name)).thenReturn(expectedEndpoints);
        V1Endpoints result = informerEndpointsGetter.get(null, name);
        assertEquals(expectedEndpoints, result);
    }

    //BaseRock generated method id: ${testGetWithNullName}, hash: 5E5B27C9FB29910545A569876E1A55CC
    @Test
    void testGetWithNullName() {
        String namespace = "default";
        when(endpointsLister.namespace(namespace)).thenReturn(namespaceLister);
        when(namespaceLister.get(null)).thenReturn(null);
        V1Endpoints result = informerEndpointsGetter.get(namespace, null);
        assertNull(result);
    }

    //BaseRock generated method id: ${testGetWithNullNamespaceAndName}, hash: FFAD8230DC652E6E1ACA12714F6009F4
    @Test
    void testGetWithNullNamespaceAndName() {
        when(endpointsLister.namespace(null)).thenReturn(namespaceLister);
        when(namespaceLister.get(null)).thenReturn(null);
        V1Endpoints result = informerEndpointsGetter.get(null, null);
        assertNull(result);
    }
}

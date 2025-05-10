package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.openapi.ApiClient;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.Discovery;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.ApiException;
import java.util.HashSet;
import java.util.Set;
import org.mockito.MockitoAnnotations;
import io.kubernetes.client.util.exception.IncompleteDiscoveryException;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class KubectlApiResourcesBaseRockGeneratedTest {

    @Mock
    private ApiClient apiClient;

    @Mock
    private Discovery discovery;

    private KubectlApiResources kubectlApiResources;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        kubectlApiResources = new KubectlApiResources().apiClient(apiClient);
    }

    //BaseRock generated method id: ${execute_shouldReturnDiscoveredResources}, hash: 4C4AA6EB4B974C55D0D91C96AD946A8E
    @Disabled()
    @Test
    void execute_shouldReturnDiscoveredResources() throws Exception {
        Set<Discovery.APIResource> expectedResources = new HashSet<>();
        expectedResources.add(new Discovery.APIResource("name", Arrays.asList("version"), "kind", "singularName", true, "namespaced", "verbs"));
        try (MockedStatic<Discovery> mockedDiscovery = mockStatic(Discovery.class)) {
            mockedDiscovery.when(() -> new Discovery(apiClient)).thenReturn(discovery);
            when(discovery.findAll()).thenReturn(expectedResources);
            Set<Discovery.APIResource> result = kubectlApiResources.execute();
            assertEquals(expectedResources, result);
            verify(discovery).findAll();
        }
    }

    //BaseRock generated method id: ${execute_shouldHandleIncompleteDiscoveryException}, hash: C1DE1411676B82E37511B2D57897DF06
    @Disabled()
    @Test
    void execute_shouldHandleIncompleteDiscoveryException() throws Exception {
        Set<Discovery.APIResource> partialResources = new HashSet<>();
        partialResources.add(new Discovery.APIResource("name", Arrays.asList("version"), "kind", "singularName", true, "namespaced", "verbs"));
        IncompleteDiscoveryException incompleteDiscoveryException = new IncompleteDiscoveryException("Incomplete discovery", new ApiException(), partialResources);
        try (MockedStatic<Discovery> mockedDiscovery = mockStatic(Discovery.class)) {
            mockedDiscovery.when(() -> new Discovery(apiClient)).thenReturn(discovery);
            when(discovery.findAll()).thenThrow(incompleteDiscoveryException);
            Set<Discovery.APIResource> result = kubectlApiResources.execute();
            assertEquals(partialResources, result);
            verify(discovery).findAll();
        }
    }

    //BaseRock generated method id: ${execute_shouldThrowKubectlExceptionOnApiException}, hash: 18BDCC6C232A89184AE37778423C3732
    @Disabled()
    @Test
    void execute_shouldThrowKubectlExceptionOnApiException() throws Exception {
        ApiException apiException = new ApiException("API error");
        try (MockedStatic<Discovery> mockedDiscovery = mockStatic(Discovery.class)) {
            mockedDiscovery.when(() -> new Discovery(apiClient)).thenReturn(discovery);
            when(discovery.findAll()).thenThrow(apiException);
            KubectlException exception = assertThrows(KubectlException.class, () -> kubectlApiResources.execute());
            assertEquals(apiException, exception.getCause());
            verify(discovery).findAll();
        }
    }

    //BaseRock generated method id: ${execute_shouldUseProvidedApiClient}, hash: 56BE52F93921B9A440F196799FAB47F9
    @Disabled()
    @Test
    void execute_shouldUseProvidedApiClient() throws Exception {
        Set<Discovery.APIResource> expectedResources = new HashSet<>();
        try (MockedStatic<Discovery> mockedDiscovery = mockStatic(Discovery.class)) {
            mockedDiscovery.when(() -> new Discovery(apiClient)).thenReturn(discovery);
            when(discovery.findAll()).thenReturn(expectedResources);
            kubectlApiResources.execute();
            mockedDiscovery.verify(() -> new Discovery(eq(apiClient)));
        }
    }
}

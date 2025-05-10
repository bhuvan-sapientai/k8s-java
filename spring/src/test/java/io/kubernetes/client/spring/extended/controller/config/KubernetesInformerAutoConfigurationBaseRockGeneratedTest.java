package io.kubernetes.client.spring.extended.controller.config;

import io.kubernetes.client.openapi.ApiClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.util.ClientBuilder;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import io.kubernetes.client.spring.extended.controller.KubernetesInformerFactoryProcessor;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class KubernetesInformerAutoConfigurationBaseRockGeneratedTest {

    @Mock
    private ClientBuilder clientBuilder;

    @Mock
    private ApiClient apiClient;

    private KubernetesInformerAutoConfiguration configuration;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        configuration = new KubernetesInformerAutoConfiguration();
    }

    //BaseRock generated method id: ${testDefaultApiClient}, hash: 4C2068D71AF7D31F434DE136055886E5
    @Test
    void testDefaultApiClient() throws IOException {
        try (MockedStatic<ClientBuilder> mockedClientBuilder = mockStatic(ClientBuilder.class)) {
            mockedClientBuilder.when(ClientBuilder::defaultClient).thenReturn(apiClient);
            ApiClient result = configuration.defaultApiClient();
            assertNotNull(result);
            assertEquals(apiClient, result);
        }
    }

    //BaseRock generated method id: ${testDefaultApiClientWithException}, hash: 6D411ECE8645AC62D49215D21447E59A
    @Disabled()
    @Test
    void testDefaultApiClientWithException() throws IOException {
        try (MockedStatic<ClientBuilder> mockedClientBuilder = mockStatic(ClientBuilder.class)) {
            mockedClientBuilder.when(ClientBuilder::defaultClient).thenThrow(new RuntimeException("Test exception"));
            mockedClientBuilder.when(ClientBuilder::new).thenReturn(clientBuilder);
            when(clientBuilder.build()).thenReturn(apiClient);
            ApiClient result = configuration.defaultApiClient();
            assertNotNull(result);
            assertEquals(apiClient, result);
        }
    }

    //BaseRock generated method id: ${testSharedInformerFactory}, hash: 94095BA5823EFA57D44883BB35634E40
    @Test
    void testSharedInformerFactory() {
        SharedInformerFactory result = configuration.sharedInformerFactory();
        assertNotNull(result);
        assertTrue(result instanceof SharedInformerFactory);
    }

    //BaseRock generated method id: ${testKubernetesInformerConfigurer}, hash: 407D86E4E4F3B6D1C559117B8433383F
    @Test
    void testKubernetesInformerConfigurer() {
        KubernetesInformerFactoryProcessor result = KubernetesInformerAutoConfiguration.kubernetesInformerConfigurer();
        assertNotNull(result);
        assertTrue(result instanceof KubernetesInformerFactoryProcessor);
    }
}

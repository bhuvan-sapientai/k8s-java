package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.ApiResponse;
import org.mockito.Mock;
import io.kubernetes.client.openapi.models.V1APIGroup;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import okhttp3.Call;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class StoragemigrationApiBaseRockGeneratedTest {

    @Mock
    private ApiClient mockApiClient;

    @Mock
    private Call mockCall;

    private StoragemigrationApi storagemigrationApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        storagemigrationApi = new StoragemigrationApi(mockApiClient);
    }

    //BaseRock generated method id: ${testConstructor}, hash: 3A5CF50814F0DF35EBEF063D1BB9A390
    @Test
    void testConstructor() {
        StoragemigrationApi api = new StoragemigrationApi();
        assertNotNull(api);
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: 3C20135354AF57F184483F295B61D64C
    @Test
    void testGetApiClient() {
        assertEquals(mockApiClient, storagemigrationApi.getApiClient());
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: 655239A0EB1B119E74E1CDD3589B61D5
    @Test
    void testSetApiClient() {
        ApiClient newApiClient = mock(ApiClient.class);
        storagemigrationApi.setApiClient(newApiClient);
        assertEquals(newApiClient, storagemigrationApi.getApiClient());
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: 11CF853247859DCC0B34C561D79AF848
    @Test
    void testGetHostIndex() {
        assertEquals(0, storagemigrationApi.getHostIndex());
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: A5A13D851BBBCE977E3D480D1784A87C
    @Test
    void testSetHostIndex() {
        int newIndex = 1;
        storagemigrationApi.setHostIndex(newIndex);
        assertEquals(newIndex, storagemigrationApi.getHostIndex());
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: 09423EEA79A62D90FFBD7E04E06EC0D0
    @Test
    void testGetCustomBaseUrl() {
        assertNull(storagemigrationApi.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: A08173EC4C77991797DE8396BD1CCD96
    @Test
    void testSetCustomBaseUrl() {
        String newUrl = "https://example.com";
        storagemigrationApi.setCustomBaseUrl(newUrl);
        assertEquals(newUrl, storagemigrationApi.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testGetAPIGroup}, hash: F590DC0F6D90470581BD6F37EF17CA15
    @Disabled()
    @Test
    void testGetAPIGroup() throws ApiException {
        // Setup
        V1APIGroup mockResponse = mock(V1APIGroup.class);
        ApiResponse<V1APIGroup> expectedResponse = new ApiResponse<>(200, null, mockResponse);
        doReturn(mockCall).when(mockApiClient).buildCall(anyString(), anyString(), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any());
        doReturn(expectedResponse).when(mockApiClient).execute(any(Call.class), any());
        // Execute
        V1APIGroup result = storagemigrationApi.getAPIGroup().execute();
        // Verify
        assertNotNull(result);
        assertEquals(mockResponse, result);
        verify(mockApiClient).execute(eq(mockCall), any());
    }
}

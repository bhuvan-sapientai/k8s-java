package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import org.junit.jupiter.api.BeforeEach;
import java.lang.reflect.Type;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.ApiResponse;
import org.mockito.Mock;
import org.junit.jupiter.api.Disabled;
import io.kubernetes.client.openapi.models.V1APIGroup;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import io.kubernetes.client.openapi.ApiCallback;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import okhttp3.Call;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class EventsApiBaseRockGeneratedTest {

    @Mock
    private ApiClient apiClient;

    @Mock
    private Call call;

    private EventsApi eventsApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        eventsApi = new EventsApi(apiClient);
    }

    //BaseRock generated method id: ${testGetAPIGroup}, hash: DAC0B1DA755C1D1485BE8903287699EF
    @Disabled
    @Test
    void testGetAPIGroup() throws ApiException {
        // Arrange
        //V1APIGroup expectedResponse = new V1APIGroup();
        //ApiResponse<V1APIGroup> apiResponse = new ApiResponse<>(200, new HashMap<>(), expectedResponse);
        //when(apiClient.buildCall(anyString(), anyString(), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any())).thenReturn(call);
        //when(apiClient.execute(any(Call.class), any(Type.class))).thenReturn(apiResponse);
        // Act
        //V1APIGroup result = eventsApi.getAPIGroup().execute();
        // Assert
        //assertNotNull(result);
        //assertEquals(expectedResponse, result);
        //verify(apiClient).buildCall(anyString(), eq("/apis/events.k8s.io/"), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any());
        //verify(apiClient).execute(eq(call), any(Type.class));
    }

    //BaseRock generated method id: ${testGetAPIGroupAsync}, hash: E0A49FD9A105453B8235F2ACCA9433D7
    @Test
    void testGetAPIGroupAsync() throws ApiException {
        // Arrange
        ApiCallback<V1APIGroup> callback = mock(ApiCallback.class);
        when(apiClient.buildCall(isNull(), eq("/apis/events.k8s.io/"), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any())).thenReturn(call);
        doNothing().when(apiClient).executeAsync(eq(call), any(Type.class), eq(callback));
        // Act
        okhttp3.Call result = eventsApi.getAPIGroup().executeAsync(callback);
        // Assert
        assertNotNull(result);
        assertEquals(call, result);
        verify(apiClient).buildCall(isNull(), eq("/apis/events.k8s.io/"), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any());
        verify(apiClient).executeAsync(eq(call), any(Type.class), eq(callback));
    }

    //BaseRock generated method id: ${testGetAPIGroupWithHttpInfo}, hash: CE801AF0656677CE8E62F3281E8E08D2
    @Disabled
    @Test
    void testGetAPIGroupWithHttpInfo() throws ApiException {
        // Arrange
        //V1APIGroup expectedResponse = new V1APIGroup();
        //ApiResponse<V1APIGroup> expectedApiResponse = new ApiResponse<>(200, new HashMap<>(), expectedResponse);
        //when(apiClient.buildCall(anyString(), anyString(), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any())).thenReturn(call);
        //when(apiClient.execute(any(Call.class), any(Type.class))).thenReturn(expectedApiResponse);
        // Act
        //ApiResponse<V1APIGroup> result = eventsApi.getAPIGroup().executeWithHttpInfo();
        // Assert
        //assertNotNull(result);
        //assertEquals(expectedApiResponse.getStatusCode(), result.getStatusCode());
        //assertEquals(expectedApiResponse.getHeaders(), result.getHeaders());
        //assertEquals(expectedApiResponse.getData(), result.getData());
        //verify(apiClient).buildCall(anyString(), eq("/apis/events.k8s.io/"), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any());
        //verify(apiClient).execute(eq(call), any(Type.class));
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: 6849B39A07B31625BF1D4AAACB2A1EEE
    @Test
    void testSetApiClient() {
        // Arrange
        ApiClient newApiClient = mock(ApiClient.class);
        // Act
        eventsApi.setApiClient(newApiClient);
        // Assert
        assertEquals(newApiClient, eventsApi.getApiClient());
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: 53C84685BE694252805631E438BE9EC4
    @Test
    void testSetHostIndex() {
        // Arrange
        int hostIndex = 1;
        // Act
        eventsApi.setHostIndex(hostIndex);
        // Assert
        assertEquals(hostIndex, eventsApi.getHostIndex());
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: 9EE9A0259F3291AE4AFCE39BBB1BC2B5
    @Test
    void testSetCustomBaseUrl() {
        // Arrange
        String customBaseUrl = "https://custom.api.url";
        // Act
        eventsApi.setCustomBaseUrl(customBaseUrl);
        // Assert
        assertEquals(customBaseUrl, eventsApi.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testConstructor}, hash: 2FD430B5D334FC1DB84D3C3A6C9C95CE
    @Test
    void testConstructor() {
        // Arrange & Act
        EventsApi defaultEventsApi = new EventsApi();
        // Assert
        assertNotNull(defaultEventsApi);
        assertNotNull(defaultEventsApi.getApiClient());
    }
}

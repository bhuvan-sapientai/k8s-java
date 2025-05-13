package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import io.kubernetes.client.openapi.Configuration;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import io.kubernetes.client.openapi.Pair;
import org.mockito.MockedStatic;
import java.util.HashMap;
import okhttp3.Call;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.ApiResponse;
import io.kubernetes.client.openapi.models.V1APIGroup;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import io.kubernetes.client.openapi.ApiCallback;
import java.util.ArrayList;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class StorageApiBaseRockGeneratedTest {

    @Mock
    private ApiClient mockApiClient;

    @Mock
    private Call mockCall;

    private StorageApi storageApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        storageApi = new StorageApi(mockApiClient);
    }

    //BaseRock generated method id: ${testConstructorWithDefaultApiClient}, hash: F722CA8D692E1F24E156C8D49BCD34A8
    @Test
    void testConstructorWithDefaultApiClient() {
        try (MockedStatic<Configuration> mockedConfiguration = mockStatic(Configuration.class)) {
            ApiClient defaultApiClient = mock(ApiClient.class);
            mockedConfiguration.when(Configuration::getDefaultApiClient).thenReturn(defaultApiClient);
            StorageApi api = new StorageApi();
            assertThat(api, is(notNullValue()));
            assertThat(api.getApiClient(), is(defaultApiClient));
        }
    }

    //BaseRock generated method id: ${testConstructorWithProvidedApiClient}, hash: AB8E63C56F99A34756105BCF7B48F6FA
    @Test
    void testConstructorWithProvidedApiClient() {
        StorageApi api = new StorageApi(mockApiClient);
        assertThat(api, is(notNullValue()));
        assertThat(api.getApiClient(), is(mockApiClient));
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: 00B9C72AE02D2121579B234E4E8D850F
    @Test
    void testGetApiClient() {
        assertThat(storageApi.getApiClient(), is(mockApiClient));
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: F83D1ED6AEE4E0337DEDB7A9121CBC4A
    @Test
    void testSetApiClient() {
        ApiClient newApiClient = mock(ApiClient.class);
        storageApi.setApiClient(newApiClient);
        assertThat(storageApi.getApiClient(), is(newApiClient));
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: B0638BE08C47EA0D3BC35E9ED96FA4CF
    @Test
    void testGetHostIndex() {
        int hostIndex = 5;
        storageApi.setHostIndex(hostIndex);
        assertThat(storageApi.getHostIndex(), is(hostIndex));
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: 83C4E177BB5139186F20AE3E17FBC782
    @Test
    void testSetHostIndex() {
        int hostIndex = 3;
        storageApi.setHostIndex(hostIndex);
        assertThat(storageApi.getHostIndex(), is(hostIndex));
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: EFC5EA771FEEAB96E2EAB2641B5A015C
    @Test
    void testGetCustomBaseUrl() {
        String customBaseUrl = "https://custom.api.com";
        storageApi.setCustomBaseUrl(customBaseUrl);
        assertThat(storageApi.getCustomBaseUrl(), is(customBaseUrl));
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: D8F77589934F10FDF72AF4D5E6F9557D
    @Test
    void testSetCustomBaseUrl() {
        String customBaseUrl = "https://another.api.com";
        storageApi.setCustomBaseUrl(customBaseUrl);
        assertThat(storageApi.getCustomBaseUrl(), is(customBaseUrl));
    }

    //BaseRock generated method id: ${testGetAPIGroup}, hash: EBF0C1C19275B028C12913C598018D57
    @Disabled
    @Test
    void testGetAPIGroup() throws ApiException {
        //V1APIGroup mockApiGroup = mock(V1APIGroup.class);
        //ApiResponse<V1APIGroup> mockResponse = new ApiResponse<>(200, null, mockApiGroup);
        //doReturn(mockCall).when(mockApiClient).buildCall(eq(null), eq("/apis/storage.k8s.io/"), eq("GET"), any(), any(), eq(null), any(), any(), any(), eq(new String[] { "BearerToken" }), eq(null));
        //when(mockApiClient.execute(eq(mockCall), eq(V1APIGroup.class))).thenReturn(mockResponse);
        //V1APIGroup result = storageApi.getAPIGroup().execute();
        //assertThat(result, is(mockApiGroup));
        //verify(mockApiClient, times(1)).buildCall(eq(null), eq("/apis/storage.k8s.io/"), eq("GET"), any(), any(), eq(null), any(), any(), any(), eq(new String[] { "BearerToken" }), eq(null));
        //verify(mockApiClient, times(1)).execute(eq(mockCall), eq(V1APIGroup.class));
    }
}
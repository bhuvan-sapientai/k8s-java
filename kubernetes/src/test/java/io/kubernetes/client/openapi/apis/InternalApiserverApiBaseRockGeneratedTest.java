package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.nullValue;
import io.kubernetes.client.openapi.Configuration;
import org.junit.jupiter.api.Test;
import com.google.gson.reflect.TypeToken;
import org.mockito.Mock;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import io.kubernetes.client.openapi.Pair;
import org.mockito.MockedStatic;
import java.util.HashMap;
import okhttp3.Call;
import java.util.List;
import static org.mockito.Mockito.doNothing;
import java.lang.reflect.Type;
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

@Timeout(10)
class InternalApiserverApiBaseRockGeneratedTest {

    @Mock
    private ApiClient mockApiClient;

    @Mock
    private Call mockCall;

    private InternalApiserverApi internalApiserverApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        internalApiserverApi = new InternalApiserverApi(mockApiClient);
    }

    //BaseRock generated method id: ${testConstructor}, hash: ED8333AC883AF6F1C35F08D4383D8CD6
    @Test
    void testConstructor() {
        try (MockedStatic<Configuration> mockedConfiguration = mockStatic(Configuration.class)) {
            mockedConfiguration.when(Configuration::getDefaultApiClient).thenReturn(mockApiClient);
            InternalApiserverApi api = new InternalApiserverApi();
            assertThat(api, is(notNullValue()));
        }
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: F046ADFD98670B732D980F513B2FD1FD
    @Test
    void testGetApiClient() {
        assertThat(internalApiserverApi.getApiClient(), is(mockApiClient));
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: 0140AD0E3F31AE6068527A60216FADCF
    @Test
    void testSetApiClient() {
        ApiClient newApiClient = mock(ApiClient.class);
        internalApiserverApi.setApiClient(newApiClient);
        assertThat(internalApiserverApi.getApiClient(), is(newApiClient));
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: F4F178B1CED3E22FA9D36241DAE2AE58
    @Test
    void testGetHostIndex() {
        assertThat(internalApiserverApi.getHostIndex(), is(0));
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: 360EB20CBD3F7745056AD4CCB65417C0
    @Test
    void testSetHostIndex() {
        internalApiserverApi.setHostIndex(1);
        assertThat(internalApiserverApi.getHostIndex(), is(1));
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: 69025378273146B9643DCDC470C61C5F
    @Test
    void testGetCustomBaseUrl() {
        assertThat(internalApiserverApi.getCustomBaseUrl(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: FF643F0B9849718F032BCC713C8589A6
    @Test
    void testSetCustomBaseUrl() {
        String customBaseUrl = "https://example.com";
        internalApiserverApi.setCustomBaseUrl(customBaseUrl);
        assertThat(internalApiserverApi.getCustomBaseUrl(), is(customBaseUrl));
    }

    //BaseRock generated method id: ${testGetAPIGroup}, hash: 888463BBC7E7A43E0DAEA86D1F82B72A
    @Test
    void testGetAPIGroup() throws ApiException {
        V1APIGroup mockApiGroup = mock(V1APIGroup.class);
        ApiResponse<V1APIGroup> mockResponse = new ApiResponse<>(200, new HashMap<>(), mockApiGroup);
        doReturn(mockCall).when(mockApiClient).buildCall(anyString(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doReturn(mockResponse).when(mockApiClient).execute(any(), any());
        V1APIGroup result = internalApiserverApi.getAPIGroup().execute();
        assertThat(result, is(mockApiGroup));
    }

    //BaseRock generated method id: ${testGetAPIGroupExecuteWithHttpInfo}, hash: 41D22463E55885A4A35E171A4A323DA1
    @Test
    void testGetAPIGroupExecuteWithHttpInfo() throws ApiException {
        V1APIGroup mockApiGroup = mock(V1APIGroup.class);
        ApiResponse<V1APIGroup> mockResponse = new ApiResponse<>(200, new HashMap<>(), mockApiGroup);
        doReturn(mockCall).when(mockApiClient).buildCall(anyString(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doReturn(mockResponse).when(mockApiClient).execute(any(), any());
        ApiResponse<V1APIGroup> result = internalApiserverApi.getAPIGroup().executeWithHttpInfo();
        assertThat(result, is(mockResponse));
    }

    //BaseRock generated method id: ${testGetAPIGroupExecuteAsync}, hash: 94720693D51AE483A05589F51E0EC9B8
    @Test
    void testGetAPIGroupExecuteAsync() throws ApiException {
        ApiCallback<V1APIGroup> mockCallback = mock(ApiCallback.class);
        doReturn(mockCall).when(mockApiClient).buildCall(anyString(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doNothing().when(mockApiClient).executeAsync(any(), any(), any());
        internalApiserverApi.getAPIGroup().executeAsync(mockCallback);
        verify(mockApiClient).executeAsync(any(), any(), eq(mockCallback));
    }
}

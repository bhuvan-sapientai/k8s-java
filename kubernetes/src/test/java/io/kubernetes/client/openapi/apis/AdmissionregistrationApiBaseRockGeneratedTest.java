package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import io.kubernetes.client.openapi.Configuration;
import org.junit.jupiter.api.Test;
import com.google.gson.reflect.TypeToken;
import org.mockito.Mock;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.apis.AdmissionregistrationApi.APIgetAPIGroupRequest;
import io.kubernetes.client.openapi.Pair;
import org.mockito.MockedStatic;
import java.util.HashMap;
import okhttp3.Call;
import java.util.List;
import java.lang.reflect.Type;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.ApiResponse;
import io.kubernetes.client.openapi.models.V1APIGroup;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import io.kubernetes.client.openapi.ApiCallback;
import java.util.ArrayList;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class AdmissionregistrationApiBaseRockGeneratedTest {

    @Mock
    private ApiClient apiClient;

    @Mock
    private Call call;

    private AdmissionregistrationApi admissionregistrationApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        admissionregistrationApi = new AdmissionregistrationApi(apiClient);
    }

    //BaseRock generated method id: ${testConstructor}, hash: 99550361B5684C43AE1B85B5C888454B
    @Test
    void testConstructor() {
        try (MockedStatic<Configuration> mockedConfiguration = mockStatic(Configuration.class)) {
            ApiClient defaultApiClient = mock(ApiClient.class);
            mockedConfiguration.when(Configuration::getDefaultApiClient).thenReturn(defaultApiClient);
            AdmissionregistrationApi api = new AdmissionregistrationApi();
            assertThat(api, is(notNullValue()));
        }
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: 5232D830DDF66D59C41AAACAF18D51D0
    @Test
    void testGetApiClient() {
        assertThat(admissionregistrationApi.getApiClient(), is(equalTo(apiClient)));
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: 855595E39FF0D88FBA6C87394EFF7AB5
    @Test
    void testSetApiClient() {
        ApiClient newApiClient = mock(ApiClient.class);
        admissionregistrationApi.setApiClient(newApiClient);
        assertThat(admissionregistrationApi.getApiClient(), is(equalTo(newApiClient)));
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: 5DD5301FB3A42C9BAF9637107F48510F
    @Test
    void testGetHostIndex() {
        assertThat(admissionregistrationApi.getHostIndex(), is(equalTo(0)));
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: 17FF60666C8DF9A084A47F6A97E19AE8
    @Test
    void testSetHostIndex() {
        admissionregistrationApi.setHostIndex(1);
        assertThat(admissionregistrationApi.getHostIndex(), is(equalTo(1)));
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: 84C82C1CEC84B04FA7CB0FFD573E33A8
    @Test
    void testGetCustomBaseUrl() {
        assertThat(admissionregistrationApi.getCustomBaseUrl(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: 7E808720BB0A691449D5436AA067DE94
    @Test
    void testSetCustomBaseUrl() {
        String customBaseUrl = "https://custom.api.url";
        admissionregistrationApi.setCustomBaseUrl(customBaseUrl);
        assertThat(admissionregistrationApi.getCustomBaseUrl(), is(equalTo(customBaseUrl)));
    }

    //BaseRock generated method id: ${testGetAPIGroup}, hash: 9C5D7F1F90B7F7B89651D413D6F239E3
    @Test
    void testGetAPIGroup() {
        APIgetAPIGroupRequest result = admissionregistrationApi.getAPIGroup();
        assertThat(result, is(notNullValue()));
    }
}

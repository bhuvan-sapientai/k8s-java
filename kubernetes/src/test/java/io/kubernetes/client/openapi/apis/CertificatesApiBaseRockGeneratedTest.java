package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import io.kubernetes.client.openapi.Configuration;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.junit.jupiter.api.Disabled;
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

@Timeout(10)
class CertificatesApiBaseRockGeneratedTest {

    @Mock
    private ApiClient mockApiClient;

    @Mock
    private Call mockCall;

    private CertificatesApi certificatesApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        certificatesApi = new CertificatesApi(mockApiClient);
    }

    //BaseRock generated method id: ${testConstructor}, hash: 0964CC191DA4EB638A57EFC692D0751C
    @Test
    void testConstructor() {
        try (MockedStatic<Configuration> mockedConfiguration = mockStatic(Configuration.class)) {
            mockedConfiguration.when(Configuration::getDefaultApiClient).thenReturn(mockApiClient);
            CertificatesApi api = new CertificatesApi();
            assertThat(api, is(notNullValue()));
        }
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: B5F8F4D570E6162F3B6FCF3896304D73
    @Test
    void testGetApiClient() {
        assertThat(certificatesApi.getApiClient(), is(mockApiClient));
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: 78ED875C5ADF11D6F1EF6CA0AB995380
    @Test
    void testSetApiClient() {
        ApiClient newApiClient = mock(ApiClient.class);
        certificatesApi.setApiClient(newApiClient);
        assertThat(certificatesApi.getApiClient(), is(newApiClient));
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: F93FB7849AFDF336D9F6D02E53AC1210
    @Test
    void testGetHostIndex() {
        assertThat(certificatesApi.getHostIndex(), is(0));
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: 50A591A21EDA8F367A574FA399BBC137
    @Test
    void testSetHostIndex() {
        int newHostIndex = 1;
        certificatesApi.setHostIndex(newHostIndex);
        assertThat(certificatesApi.getHostIndex(), is(newHostIndex));
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: 5A092D016AE6A91C624F5C139DA16D5B
    @Disabled()
    @Test
    void testGetCustomBaseUrl() {
        assertThat(certificatesApi.getCustomBaseUrl(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: 434B55468F0F8751691F5F2276CFD4B6
    @Test
    void testSetCustomBaseUrl() {
        String newCustomBaseUrl = "https://example.com";
        certificatesApi.setCustomBaseUrl(newCustomBaseUrl);
        assertThat(certificatesApi.getCustomBaseUrl(), is(newCustomBaseUrl));
    }

    //BaseRock generated method id: ${testGetAPIGroup}, hash: DAC0B1DA755C1D1485BE8903287699EF
    @Disabled
    @Test
    void testGetAPIGroup() throws ApiException {
    }
}

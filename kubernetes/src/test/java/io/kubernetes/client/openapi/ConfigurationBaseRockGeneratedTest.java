package io.kubernetes.client.openapi;

import io.kubernetes.client.openapi.ApiClient;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.sameInstance;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class ConfigurationBaseRockGeneratedTest {

    //BaseRock generated method id: ${testGetVersion}, hash: 77B5F0F2C495DC8453F868F73C3D47A1
    @Test
    void testGetVersion() {
        assertThat(Configuration.VERSION, is(equalTo("24.0.0-SNAPSHOT")));
    }

    //BaseRock generated method id: ${testGetDefaultApiClient}, hash: 060F646926A1D618250DEDB7F4789BA7
    @Test
    void testGetDefaultApiClient() {
        ApiClient defaultApiClient = Configuration.getDefaultApiClient();
        assertNotNull(defaultApiClient);
        assertThat(defaultApiClient, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetDefaultApiClient}, hash: CFF1CE00165BAE5A07921D614C5B2C58
    @Test
    void testSetDefaultApiClient() {
        ApiClient mockApiClient = mock(ApiClient.class);
        Configuration.setDefaultApiClient(mockApiClient);
        ApiClient retrievedApiClient = Configuration.getDefaultApiClient();
        assertThat(retrievedApiClient, is(sameInstance(mockApiClient)));
    }

    //BaseRock generated method id: ${testSetAndGetDefaultApiClient}, hash: C06C445C793FAF9DEC73DFF1428AA3D6
    @Test
    void testSetAndGetDefaultApiClient() {
        ApiClient originalApiClient = Configuration.getDefaultApiClient();
        ApiClient newApiClient = new ApiClient();
        Configuration.setDefaultApiClient(newApiClient);
        ApiClient retrievedApiClient = Configuration.getDefaultApiClient();
        assertThat(retrievedApiClient, is(sameInstance(newApiClient)));
        // Reset to original state
        Configuration.setDefaultApiClient(originalApiClient);
    }
}

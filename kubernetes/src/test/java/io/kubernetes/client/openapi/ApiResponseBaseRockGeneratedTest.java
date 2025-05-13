package io.kubernetes.client.openapi;

import java.util.List;
import java.util.Map;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.HashMap;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class ApiResponseBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructorWithStatusCodeAndHeaders}, hash: 9C5272A9110A36346DCBA20AAB6B35FA
    @Test
    void testConstructorWithStatusCodeAndHeaders() {
        int statusCode = 200;
        Map<String, List<String>> headers = new HashMap<>();
        headers.put("Content-Type", new ArrayList<>());
        ApiResponse<String> response = new ApiResponse<>(statusCode, headers);
        assertEquals(statusCode, response.getStatusCode());
        assertEquals(headers, response.getHeaders());
        assertThat(response.getData(), is(nullValue()));
    }

    //BaseRock generated method id: ${testConstructorWithDifferentStatusCodes}, hash: 20583DECFF30624E342CD24F7EAC4848
    @ParameterizedTest
    @ValueSource(ints = { 200, 201, 204, 400, 401, 403, 404, 500 })
    void testConstructorWithDifferentStatusCodes(int statusCode) {
        Map<String, List<String>> headers = new HashMap<>();
        ApiResponse<String> response = new ApiResponse<>(statusCode, headers);
        assertEquals(statusCode, response.getStatusCode());
    }

    //BaseRock generated method id: ${testConstructorWithStatusCodeHeadersAndData}, hash: 41A1BD6C8B3FD121BEC9CE96BAC073E9
    @Test
    void testConstructorWithStatusCodeHeadersAndData() {
        int statusCode = 200;
        Map<String, List<String>> headers = new HashMap<>();
        headers.put("Content-Type", new ArrayList<>());
        String data = "Test Data";
        ApiResponse<String> response = new ApiResponse<>(statusCode, headers, data);
        assertEquals(statusCode, response.getStatusCode());
        assertEquals(headers, response.getHeaders());
        assertEquals(data, response.getData());
    }

    //BaseRock generated method id: ${testGetStatusCode}, hash: 94A415EB69C2D1B28A7AF3021C394349
    @Test
    void testGetStatusCode() {
        int statusCode = 200;
        ApiResponse<String> response = new ApiResponse<>(statusCode, new HashMap<>());
        assertEquals(statusCode, response.getStatusCode());
    }

    //BaseRock generated method id: ${testGetHeaders}, hash: 63FA3A2BB5EDAA62FEF16F6D6E24A087
    @Test
    void testGetHeaders() {
        Map<String, List<String>> headers = new HashMap<>();
        headers.put("Content-Type", new ArrayList<>());
        ApiResponse<String> response = new ApiResponse<>(200, headers);
        assertEquals(headers, response.getHeaders());
    }

    //BaseRock generated method id: ${testGetData}, hash: DDC82428F72707ED59F5D99CBBF8154C
    @Test
    void testGetData() {
        String data = "Test Data";
        ApiResponse<String> response = new ApiResponse<>(200, new HashMap<>(), data);
        assertEquals(data, response.getData());
    }

    //BaseRock generated method id: ${testNullData}, hash: 8E19E1772561BD01CD8C2C7E86CD7682
    @Test
    void testNullData() {
        ApiResponse<String> response = new ApiResponse<>(200, new HashMap<>(), null);
        assertThat(response.getData(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEmptyHeaders}, hash: BF76979E86B79058BA98BE316806A039
    @Test
    void testEmptyHeaders() {
        Map<String, List<String>> headers = new HashMap<>();
        ApiResponse<String> response = new ApiResponse<>(200, headers);
        assertNotNull(response.getHeaders());
        assertEquals(0, response.getHeaders().size());
    }

    //BaseRock generated method id: ${testMultipleHeaders}, hash: 4DE7578DA228C1D076FB83F6C69ECFC4
    @Test
    void testMultipleHeaders() {
        Map<String, List<String>> headers = new HashMap<>();
        headers.put("Content-Type", List.of("application/json"));
        headers.put("Authorization", List.of("Bearer token"));
        ApiResponse<String> response = new ApiResponse<>(200, headers);
        assertEquals(2, response.getHeaders().size());
        assertEquals(List.of("application/json"), response.getHeaders().get("Content-Type"));
        assertEquals(List.of("Bearer token"), response.getHeaders().get("Authorization"));
    }

    //BaseRock generated method id: ${testApiResponseWithGenericType}, hash: FD5945F37F9DB3D4A2CCAD38D5E6E8CA
    @Test
    void testApiResponseWithGenericType() {
        List<String> data = List.of("item1", "item2");
        ApiResponse<List<String>> response = new ApiResponse<>(200, new HashMap<>(), data);
        assertEquals(200, response.getStatusCode());
        assertEquals(data, response.getData());
    }
}

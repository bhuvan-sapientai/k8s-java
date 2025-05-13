package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1ResourceClaim;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ResourceClaimBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 51E0B60E383A62FD0EA1FCA026DEC9E2
    @Test
    void testConstructor() {
        V1ResourceClaim resourceClaim = new V1ResourceClaim();
        assertThat(resourceClaim, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetName}, hash: EBA1FDC432E1BD832F2E5BB2499BCADD
    @Test
    void testSetAndGetName() {
        V1ResourceClaim resourceClaim = new V1ResourceClaim();
        String name = "testName";
        resourceClaim.setName(name);
        assertThat(resourceClaim.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testSetAndGetNameWithDifferentValues}, hash: D0AB5901C8AB394EEC0C4F4F4CD93452
    @ParameterizedTest
    @ValueSource(strings = { "name1", "name2", "name3" })
    void testSetAndGetNameWithDifferentValues(String name) {
        V1ResourceClaim resourceClaim = new V1ResourceClaim();
        resourceClaim.setName(name);
        assertThat(resourceClaim.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testSetAndGetRequest}, hash: 4CA808A7566065F45C1C7F56ADA19FDA
    @Test
    void testSetAndGetRequest() {
        V1ResourceClaim resourceClaim = new V1ResourceClaim();
        String request = "testRequest";
        resourceClaim.setRequest(request);
        assertThat(resourceClaim.getRequest(), is(equalTo(request)));
    }

    //BaseRock generated method id: ${testSetAndGetRequestWithDifferentValues}, hash: 894EA6FD3F6FA2ADACEBD8F2E3277137
    @ParameterizedTest
    @ValueSource(strings = { "request1", "request2", "request3" })
    void testSetAndGetRequestWithDifferentValues(String request) {
        V1ResourceClaim resourceClaim = new V1ResourceClaim();
        resourceClaim.setRequest(request);
        assertThat(resourceClaim.getRequest(), is(equalTo(request)));
    }

    //BaseRock generated method id: ${testSetAndGetRequestWithNullAndEmptyValues}, hash: 4F7FC469474B7B9F3ED77B245701437D
    @ParameterizedTest
    @NullAndEmptySource
    void testSetAndGetRequestWithNullAndEmptyValues(String request) {
        V1ResourceClaim resourceClaim = new V1ResourceClaim();
        resourceClaim.setRequest(request);
        assertThat(resourceClaim.getRequest(), is(equalTo(request)));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 764D453503056F2640C9318CE923E37A
    @Test
    void testEqualsWithSameObject() {
        V1ResourceClaim resourceClaim = new V1ResourceClaim();
        assertThat(resourceClaim.equals(resourceClaim), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: DEA64A8C9A298428CE3A9549ECF3A3AB
    @Test
    void testEqualsWithDifferentObject() {
        V1ResourceClaim resourceClaim1 = new V1ResourceClaim().name("name1").request("request1");
        V1ResourceClaim resourceClaim2 = new V1ResourceClaim().name("name2").request("request2");
        assertThat(resourceClaim1.equals(resourceClaim2), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: 250363A80A8430DDA440B13F68BAC965
    @Test
    void testEqualsWithNull() {
        V1ResourceClaim resourceClaim = new V1ResourceClaim();
        assertThat(resourceClaim.equals(null), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: F615D5E357731623B7CA7A7C6647EF7D
    @Test
    void testHashCode() {
        V1ResourceClaim resourceClaim1 = new V1ResourceClaim().name("name").request("request");
        V1ResourceClaim resourceClaim2 = new V1ResourceClaim().name("name").request("request");
        assertThat(resourceClaim1.hashCode(), is(equalTo(resourceClaim2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: B6A0E262795DDB4E8AEF7B0C500B8453
    @Test
    void testToString() {
        V1ResourceClaim resourceClaim = new V1ResourceClaim().name("testName").request("testRequest");
        String expected = "class V1ResourceClaim {\n    name: testName\n    request: testRequest\n}";
        assertThat(resourceClaim.toString(), is(equalTo(expected)));
    }

    //BaseRock generated method id: ${testSetNameNull}, hash: 7FE02FA9960CF0DF5593440A85A544C3
    @Test
    void testSetNameNull() {
        V1ResourceClaim resourceClaim = new V1ResourceClaim();
        resourceClaim.setName(null);
        assertThat(resourceClaim.getName(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 58C6B34010F3505CEBFADD3D5BB89A47
    @Test
    void testBuilder() {
        String name = "testName";
        String request = "testRequest";
        V1ResourceClaim resourceClaim = new V1ResourceClaim().name(name).request(request);
        assertThat(resourceClaim.getName(), is(equalTo(name)));
        assertThat(resourceClaim.getRequest(), is(equalTo(request)));
    }
}

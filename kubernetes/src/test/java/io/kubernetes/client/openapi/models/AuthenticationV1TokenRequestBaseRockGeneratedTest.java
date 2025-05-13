package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1TokenRequestStatus;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.models.V1TokenRequestSpec;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class AuthenticationV1TokenRequestBaseRockGeneratedTest {

    private AuthenticationV1TokenRequest authenticationV1TokenRequest;

    @BeforeEach
    void setUp() {
        authenticationV1TokenRequest = new AuthenticationV1TokenRequest();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 440FEBC3DF7C275F551176E0D17A9D5E
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        authenticationV1TokenRequest.setApiVersion(apiVersion);
        assertThat(authenticationV1TokenRequest.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testKind}, hash: A96A45FE164345CC0722EA924E7D69DB
    @Test
    void testKind() {
        String kind = "TokenRequest";
        authenticationV1TokenRequest.setKind(kind);
        assertThat(authenticationV1TokenRequest.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testMetadata}, hash: 7DCA5086BA51A0D9534EAC0114A5EAA4
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        authenticationV1TokenRequest.setMetadata(metadata);
        assertThat(authenticationV1TokenRequest.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testSpec}, hash: F4E7297A4932CC0EAB242081C4697DC1
    @Test
    void testSpec() {
        V1TokenRequestSpec spec = mock(V1TokenRequestSpec.class);
        authenticationV1TokenRequest.setSpec(spec);
        assertThat(authenticationV1TokenRequest.getSpec(), is(equalTo(spec)));
    }

    //BaseRock generated method id: ${testStatus}, hash: E34FDD19ED1A2EA5DFB3BB3BF47CE850
    @Test
    void testStatus() {
        V1TokenRequestStatus status = mock(V1TokenRequestStatus.class);
        authenticationV1TokenRequest.setStatus(status);
        assertThat(authenticationV1TokenRequest.getStatus(), is(equalTo(status)));
    }

    //BaseRock generated method id: ${testEquals}, hash: C8CB416F06C3A40CD28E4908A0D0AA5A
    @Test
    void testEquals() {
        AuthenticationV1TokenRequest other = new AuthenticationV1TokenRequest();
        other.setApiVersion("v1");
        other.setKind("TokenRequest");
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        other.setMetadata(metadata);
        V1TokenRequestSpec spec = mock(V1TokenRequestSpec.class);
        other.setSpec(spec);
        V1TokenRequestStatus status = mock(V1TokenRequestStatus.class);
        other.setStatus(status);
        authenticationV1TokenRequest.setApiVersion("v1");
        authenticationV1TokenRequest.setKind("TokenRequest");
        authenticationV1TokenRequest.setMetadata(metadata);
        authenticationV1TokenRequest.setSpec(spec);
        authenticationV1TokenRequest.setStatus(status);
        assertThat(authenticationV1TokenRequest.equals(other), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 6C41C8CA28E36F2380874110CBD7EAF4
    @Test
    void testHashCode() {
        authenticationV1TokenRequest.setApiVersion("v1");
        authenticationV1TokenRequest.setKind("TokenRequest");
        authenticationV1TokenRequest.setMetadata(mock(V1ObjectMeta.class));
        authenticationV1TokenRequest.setSpec(mock(V1TokenRequestSpec.class));
        authenticationV1TokenRequest.setStatus(mock(V1TokenRequestStatus.class));
        int hashCode = authenticationV1TokenRequest.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: C8D9705B7A514D3E10342F265A1C27E6
    @Test
    void testToString() {
        authenticationV1TokenRequest.setApiVersion("v1");
        authenticationV1TokenRequest.setKind("TokenRequest");
        authenticationV1TokenRequest.setMetadata(mock(V1ObjectMeta.class));
        authenticationV1TokenRequest.setSpec(mock(V1TokenRequestSpec.class));
        authenticationV1TokenRequest.setStatus(mock(V1TokenRequestStatus.class));
        String toString = authenticationV1TokenRequest.toString();
        assertThat(toString, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetNullApiVersion}, hash: BAF7141653EBBDF368AA545C47530264
    @Test
    void testSetNullApiVersion() {
        assertDoesNotThrow(() -> authenticationV1TokenRequest.setApiVersion(null));
    }

    //BaseRock generated method id: ${testSetNullKind}, hash: 55D3133B9339C04C7E7B14A697A3E3DE
    @Test
    void testSetNullKind() {
        assertDoesNotThrow(() -> authenticationV1TokenRequest.setKind(null));
    }

    //BaseRock generated method id: ${testSetNullMetadata}, hash: 935AB543DB04CFFE85BA6F921E62476B
    @Test
    void testSetNullMetadata() {
        assertDoesNotThrow(() -> authenticationV1TokenRequest.setMetadata(null));
    }

    //BaseRock generated method id: ${testSetNullSpec}, hash: B9166B0EAEA5882FD2EA6FE72BAA6331
    @Test
    void testSetNullSpec() {
        assertDoesNotThrow(() -> authenticationV1TokenRequest.setSpec(null));
    }

    //BaseRock generated method id: ${testSetNullStatus}, hash: 9B2E4879917A3D48077367F17CB2BC88
    @Test
    void testSetNullStatus() {
        assertDoesNotThrow(() -> authenticationV1TokenRequest.setStatus(null));
    }
}

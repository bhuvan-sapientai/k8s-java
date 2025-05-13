package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.containsString;
import io.kubernetes.client.openapi.models.V1StatusDetails;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1Status;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1StatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1StatusConstructor}, hash: 08FF38C596BF3B7CB95A32A848662D43
    @Test
    void testV1StatusConstructor() {
        V1Status status = new V1Status();
        assertNotNull(status);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 77E5B2405B70F01F1090106B01C289D8
    @Test
    void testApiVersion() {
        V1Status status = new V1Status();
        String apiVersion = "v1";
        status.setApiVersion(apiVersion);
        assertEquals(apiVersion, status.getApiVersion());
    }

    //BaseRock generated method id: ${testCode}, hash: E0BB907673CB6233100DEF468AD74E58
    @Test
    void testCode() {
        V1Status status = new V1Status();
        Integer code = 200;
        status.setCode(code);
        assertEquals(code, status.getCode());
    }

    //BaseRock generated method id: ${testDetails}, hash: A746F5E38898B6D26094E8FE4FA6942B
    @Test
    void testDetails() {
        V1Status status = new V1Status();
        V1StatusDetails details = mock(V1StatusDetails.class);
        status.setDetails(details);
        assertEquals(details, status.getDetails());
    }

    //BaseRock generated method id: ${testKind}, hash: 30B4BA944436EE53B8964C853BA5D958
    @Test
    void testKind() {
        V1Status status = new V1Status();
        String kind = "Status";
        status.setKind(kind);
        assertEquals(kind, status.getKind());
    }

    //BaseRock generated method id: ${testMessage}, hash: 1B3DCCE539F669837E20BEAED005A0C7
    @Test
    void testMessage() {
        V1Status status = new V1Status();
        String message = "Operation successful";
        status.setMessage(message);
        assertEquals(message, status.getMessage());
    }

    //BaseRock generated method id: ${testMetadata}, hash: F9F7E1308DDCFD03BC472B0C1CF330CF
    @Test
    void testMetadata() {
        V1Status status = new V1Status();
        V1ListMeta metadata = mock(V1ListMeta.class);
        status.setMetadata(metadata);
        assertEquals(metadata, status.getMetadata());
    }

    //BaseRock generated method id: ${testReason}, hash: 191EB4785B32A17ACA3607D9E993DBED
    @Test
    void testReason() {
        V1Status status = new V1Status();
        String reason = "Success";
        status.setReason(reason);
        assertEquals(reason, status.getReason());
    }

    //BaseRock generated method id: ${testStatus}, hash: F4A076BB2E052C7D5470C968B22B69EB
    @Test
    void testStatus() {
        V1Status status = new V1Status();
        String statusValue = "Success";
        status.setStatus(statusValue);
        assertEquals(statusValue, status.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: 54F18ACFDE8F72DB855DF9DF3B7CDA18
    @Test
    void testEquals() {
        V1StatusDetails details = mock(V1StatusDetails.class);
        V1ListMeta metadata = mock(V1ListMeta.class);
        V1Status status1 = new V1Status().apiVersion("v1").code(200).details(details).kind("Status").message("Success").metadata(metadata).reason("OK").status("Success");
        V1Status status2 = new V1Status().apiVersion("v1").code(200).details(details).kind("Status").message("Success").metadata(metadata).reason("OK").status("Success");
        assertThat(status1.equals(status2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: FD5DBDC1CBAC1DF70DB6368CF21A7570
    @Test
    void testHashCode() {
        V1Status status = new V1Status().apiVersion("v1").code(200).details(mock(V1StatusDetails.class)).kind("Status").message("Success").metadata(mock(V1ListMeta.class)).reason("OK").status("Success");
        assertThat(status.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: ED9435EA689FC520CE8533430FBE8E13
    @Test
    void testToString() {
        V1Status status = new V1Status().apiVersion("v1").code(200).details(mock(V1StatusDetails.class)).kind("Status").message("Success").metadata(mock(V1ListMeta.class)).reason("OK").status("Success");
        String result = status.toString();
        assertThat(result, containsString("apiVersion"));
        assertThat(result, containsString("code"));
        assertThat(result, containsString("details"));
        assertThat(result, containsString("kind"));
        assertThat(result, containsString("message"));
        assertThat(result, containsString("metadata"));
        assertThat(result, containsString("reason"));
        assertThat(result, containsString("status"));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 47C7D0F7275F43BD955C8CE856F63504
    @Test
    void testBuilder() {
        V1Status status = new V1Status().apiVersion("v1").code(200).details(mock(V1StatusDetails.class)).kind("Status").message("Success").metadata(mock(V1ListMeta.class)).reason("OK").status("Success");
        assertThat(status.getApiVersion(), is("v1"));
        assertThat(status.getCode(), is(200));
        assertThat(status.getDetails(), is(notNullValue()));
        assertThat(status.getKind(), is("Status"));
        assertThat(status.getMessage(), is("Success"));
        assertThat(status.getMetadata(), is(notNullValue()));
        assertThat(status.getReason(), is("OK"));
        assertThat(status.getStatus(), is("Success"));
    }

    //BaseRock generated method id: ${testNullValues}, hash: C2DD499753ADC9F298CBA8907BD0A5A4
    @Test
    void testNullValues() {
        V1Status status = new V1Status().apiVersion(null).code(null).details(null).kind(null).message(null).metadata(null).reason(null).status(null);
        assertThat(status.getApiVersion(), is(nullValue()));
        assertThat(status.getCode(), is(nullValue()));
        assertThat(status.getDetails(), is(nullValue()));
        assertThat(status.getKind(), is(nullValue()));
        assertThat(status.getMessage(), is(nullValue()));
        assertThat(status.getMetadata(), is(nullValue()));
        assertThat(status.getReason(), is(nullValue()));
        assertThat(status.getStatus(), is(nullValue()));
    }
}

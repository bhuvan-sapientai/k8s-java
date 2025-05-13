package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1CertificateSigningRequestStatusBaseRockGeneratedTest {

    private V1CertificateSigningRequestStatus status;

    @BeforeEach
    void setUp() {
        status = new V1CertificateSigningRequestStatus();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 9438689FA9EC88C1FCE2B1836C4FC623
    @Test
    void testConstructor() {
        assertThat(status, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetCertificate}, hash: F437D2BDB82C6E95F3EE9EA313D9F070
    @Test
    void testSetAndGetCertificate() {
        byte[] certificate = "test-certificate".getBytes();
        status.setCertificate(certificate);
        assertArrayEquals(certificate, status.getCertificate());
    }

    //BaseRock generated method id: ${testSetAndGetCertificateWithVariousInputs}, hash: D07BB908F9699F6D2A592A8E423B1B8A
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "test", "another-test" })
    void testSetAndGetCertificateWithVariousInputs(String input) {
        byte[] certificate = input == null ? null : input.getBytes();
        status.setCertificate(certificate);
        assertArrayEquals(certificate, status.getCertificate());
    }

    //BaseRock generated method id: ${testSetAndGetConditions}, hash: 284B547F5B9301DD55FF2EC99869024C
    @Test
    void testSetAndGetConditions() {
        List<V1CertificateSigningRequestCondition> conditions = new ArrayList<>();
        V1CertificateSigningRequestCondition condition1 = mock(V1CertificateSigningRequestCondition.class);
        V1CertificateSigningRequestCondition condition2 = mock(V1CertificateSigningRequestCondition.class);
        conditions.add(condition1);
        conditions.add(condition2);
        status.setConditions(conditions);
        assertThat(status.getConditions(), is(equalTo(conditions)));
        assertThat(status.getConditions(), hasSize(2));
    }

    //BaseRock generated method id: ${testAddConditionsItem}, hash: A517CBFB597D127DEDD667AF4E90D0A8
    @Test
    void testAddConditionsItem() {
        V1CertificateSigningRequestCondition condition = mock(V1CertificateSigningRequestCondition.class);
        status.addConditionsItem(condition);
        assertThat(status.getConditions(), hasSize(1));
        assertThat(status.getConditions().get(0), is(equalTo(condition)));
    }

    //BaseRock generated method id: ${testAddConditionsItemToExistingList}, hash: ECF48ED682D8D3D19FFAF389FD68F277
    @Test
    void testAddConditionsItemToExistingList() {
        V1CertificateSigningRequestCondition condition1 = mock(V1CertificateSigningRequestCondition.class);
        V1CertificateSigningRequestCondition condition2 = mock(V1CertificateSigningRequestCondition.class);
        status.setConditions(new ArrayList<>(Arrays.asList(condition1)));
        status.addConditionsItem(condition2);
        assertThat(status.getConditions(), hasSize(2));
    }

    //BaseRock generated method id: ${testSetConditionsNull}, hash: FD6CB1E383EDB7B7A1D87D6296A9C6AC
    @Test
    void testSetConditionsNull() {
        status.setConditions(null);
        assertThat(status.getConditions(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAddConditionsItemToNullList}, hash: 2758C62DB494108580CDF11709B8A8C9
    @Test
    void testAddConditionsItemToNullList() {
        status.setConditions(null);
        V1CertificateSigningRequestCondition condition = mock(V1CertificateSigningRequestCondition.class);
        status.addConditionsItem(condition);
        assertThat(status.getConditions(), hasSize(1));
        assertThat(status.getConditions().get(0), is(equalTo(condition)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 4BAF907186492897FAE676C286016084
    @Test
    void testEqualsAndHashCode() {
        V1CertificateSigningRequestStatus status1 = new V1CertificateSigningRequestStatus().certificate("test".getBytes()).conditions(Arrays.asList(mock(V1CertificateSigningRequestCondition.class)));
        V1CertificateSigningRequestStatus status2 = new V1CertificateSigningRequestStatus().certificate("test".getBytes()).conditions(Arrays.asList(mock(V1CertificateSigningRequestCondition.class)));
        assertArrayEquals(status1.getCertificate(), status2.getCertificate());
        assertEquals(status1.getConditions().size(), status2.getConditions().size());
        for (int i = 0; i < status1.getConditions().size(); i++) {
            assertEquals(status1.getConditions().get(i).getClass(), status2.getConditions().get(i).getClass());
        }
    }

    //BaseRock generated method id: ${testToString}, hash: 0B098EEB54490B0731B908574C37DB0E
    @Disabled()
    @Test
    void testToString() {
        V1CertificateSigningRequestCondition condition = mock(V1CertificateSigningRequestCondition.class);
        when(condition.toString()).thenReturn("MockCondition");
        status.setCertificate("test".getBytes());
        status.setConditions(Arrays.asList(condition));
        String result = status.toString();
        assertThat(result, startsWith("class V1CertificateSigningRequestStatus {"));
        assertThat(result, containsString("certificate:"));
        assertThat(result, containsString("test"));
        assertThat(result, containsString("conditions:"));
        assertThat(result, containsString("[MockCondition]"));
        assertThat(result, endsWith("}"));
    }

    //BaseRock generated method id: ${testToStringWithNullFields}, hash: 68002DE4E38FEDF2A55C9CE01477B446
    @Test
    void testToStringWithNullFields() {
        String result = status.toString();
        assertThat(result, startsWith("class V1CertificateSigningRequestStatus {"));
        assertThat(result, containsString("certificate: null"));
        assertThat(result, containsString("conditions: []"));
        assertThat(result, endsWith("}"));
    }
}

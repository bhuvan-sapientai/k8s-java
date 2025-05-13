package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.*;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CertificateSigningRequestSpecBaseRockGeneratedTest {

    private V1CertificateSigningRequestSpec certificateSigningRequestSpec;

    @BeforeEach
    void setUp() {
        certificateSigningRequestSpec = new V1CertificateSigningRequestSpec();
    }

    //BaseRock generated method id: ${testExpirationSeconds}, hash: 57D3AE47374727FFAB321A6EBF65122F
    @Test
    void testExpirationSeconds() {
        Integer expirationSeconds = 3600;
        certificateSigningRequestSpec.setExpirationSeconds(expirationSeconds);
        assertEquals(expirationSeconds, certificateSigningRequestSpec.getExpirationSeconds());
    }

    //BaseRock generated method id: ${testExtra}, hash: DD9F52ADACF52FDBEA55D9EF22017971
    @Test
    void testExtra() {
        Map<String, List<String>> extra = new HashMap<>();
        List<String> values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
        extra.put("key", values);
        certificateSigningRequestSpec.setExtra(extra);
        assertEquals(extra, certificateSigningRequestSpec.getExtra());
        certificateSigningRequestSpec.putExtraItem("newKey", values);
        assertTrue(certificateSigningRequestSpec.getExtra().containsKey("newKey"));
        assertEquals(values, certificateSigningRequestSpec.getExtra().get("newKey"));
    }

    //BaseRock generated method id: ${testGroups}, hash: E9E70082E7A83AF0CC7E40BF04071AEC
    @Test
    void testGroups() {
        List<String> groups = new ArrayList<>();
        groups.add("group1");
        groups.add("group2");
        certificateSigningRequestSpec.setGroups(groups);
        assertEquals(groups, certificateSigningRequestSpec.getGroups());
        certificateSigningRequestSpec.addGroupsItem("group3");
        assertTrue(certificateSigningRequestSpec.getGroups().contains("group3"));
    }

    //BaseRock generated method id: ${testRequest}, hash: 48A1C7D23ACAEFF958C6695DF18458B8
    @Test
    void testRequest() {
        byte[] request = "test request".getBytes();
        certificateSigningRequestSpec.setRequest(request);
        assertArrayEquals(request, certificateSigningRequestSpec.getRequest());
    }

    //BaseRock generated method id: ${testSignerName}, hash: A92C52E6835CD742A3A4F6782702C256
    @Test
    void testSignerName() {
        String signerName = "test-signer";
        certificateSigningRequestSpec.setSignerName(signerName);
        assertEquals(signerName, certificateSigningRequestSpec.getSignerName());
    }

    //BaseRock generated method id: ${testUid}, hash: 5351BFEE5A606D0C1A9E39B56BC9ABF3
    @Test
    void testUid() {
        String uid = "test-uid";
        certificateSigningRequestSpec.setUid(uid);
        assertEquals(uid, certificateSigningRequestSpec.getUid());
    }

    //BaseRock generated method id: ${testUsages}, hash: DD8409800E31574D06917ADB0C07BA72
    @Test
    void testUsages() {
        List<String> usages = new ArrayList<>();
        usages.add("usage1");
        usages.add("usage2");
        certificateSigningRequestSpec.setUsages(usages);
        assertEquals(usages, certificateSigningRequestSpec.getUsages());
        certificateSigningRequestSpec.addUsagesItem("usage3");
        assertTrue(certificateSigningRequestSpec.getUsages().contains("usage3"));
    }

    //BaseRock generated method id: ${testUsername}, hash: 82C1C545D346299B36E758417D1DC2F2
    @Test
    void testUsername() {
        String username = "test-user";
        certificateSigningRequestSpec.setUsername(username);
        assertEquals(username, certificateSigningRequestSpec.getUsername());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 9DC493658C7D8824AEEDD07E412053A7
    @Test
    void testEqualsAndHashCode() {
        V1CertificateSigningRequestSpec spec1 = new V1CertificateSigningRequestSpec().expirationSeconds(3600).signerName("signer1").uid("uid1").username("user1");
        V1CertificateSigningRequestSpec spec2 = new V1CertificateSigningRequestSpec().expirationSeconds(3600).signerName("signer1").uid("uid1").username("user1");
        V1CertificateSigningRequestSpec spec3 = new V1CertificateSigningRequestSpec().expirationSeconds(7200).signerName("signer2").uid("uid2").username("user2");
        assertTrue(spec1.equals(spec2) && spec2.equals(spec1));
        assertEquals(spec1.hashCode(), spec2.hashCode());
        assertFalse(spec1.equals(spec3) || spec3.equals(spec1));
        assertNotEquals(spec1.hashCode(), spec3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: F758C822478B69CA829B400B82691A58
    @Test
    void testToString() {
        V1CertificateSigningRequestSpec spec = new V1CertificateSigningRequestSpec().expirationSeconds(3600).signerName("test-signer").uid("test-uid").username("test-user");
        String toString = spec.toString();
        assertThat(toString, containsString("expirationSeconds"));
        assertThat(toString, containsString("signerName"));
        assertThat(toString, containsString("uid"));
        assertThat(toString, containsString("username"));
    }

    //BaseRock generated method id: ${testValidExpirationSeconds}, hash: B51D750B02F78E32DC844C3F504350F4
    @ParameterizedTest
    @ValueSource(ints = { 600, 3600, 86400 })
    void testValidExpirationSeconds(int seconds) {
        certificateSigningRequestSpec.setExpirationSeconds(seconds);
        assertEquals(seconds, certificateSigningRequestSpec.getExpirationSeconds());
    }

    //BaseRock generated method id: ${testNullValues}, hash: 0B99E6D1D17B4D3EF8945A28552BC550
    @Test
    void testNullValues() {
        assertNull(certificateSigningRequestSpec.getExpirationSeconds());
        assertNull(certificateSigningRequestSpec.getUid());
        assertNull(certificateSigningRequestSpec.getUsername());
        assertNotNull(certificateSigningRequestSpec.getExtra());
        assertNotNull(certificateSigningRequestSpec.getGroups());
        assertNotNull(certificateSigningRequestSpec.getUsages());
    }
}

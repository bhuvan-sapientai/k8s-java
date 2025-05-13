package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1APIServiceSpec;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.ApiregistrationV1ServiceReference;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1APIServiceSpecBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1APIServiceSpecConstructor}, hash: 3E3B7413D0B11A18D018799BD84ECAA9
    @Test
    void testV1APIServiceSpecConstructor() {
        V1APIServiceSpec spec = new V1APIServiceSpec();
        assertThat(spec, is(notNullValue()));
    }

    //BaseRock generated method id: ${testCaBundle}, hash: 285203EBF9CA300271EB8A2352E1ABB6
    @Test
    void testCaBundle() {
        V1APIServiceSpec spec = new V1APIServiceSpec();
        byte[] caBundle = "test".getBytes();
        spec.setCaBundle(caBundle);
        assertArrayEquals(caBundle, spec.getCaBundle());
    }

    //BaseRock generated method id: ${testGroup}, hash: 881933765A6F54DC9B3AB6037091DFCB
    @Test
    void testGroup() {
        V1APIServiceSpec spec = new V1APIServiceSpec();
        String group = "testGroup";
        spec.setGroup(group);
        assertEquals(group, spec.getGroup());
    }

    //BaseRock generated method id: ${testGroupPriorityMinimum}, hash: A08BF63456999BB29ACCE5265074BA7E
    @Test
    void testGroupPriorityMinimum() {
        V1APIServiceSpec spec = new V1APIServiceSpec();
        Integer groupPriorityMinimum = 100;
        spec.setGroupPriorityMinimum(groupPriorityMinimum);
        assertEquals(groupPriorityMinimum, spec.getGroupPriorityMinimum());
    }

    //BaseRock generated method id: ${testInsecureSkipTLSVerify}, hash: C76A71D8176F05BDDE590EAF768EE0BC
    @Test
    void testInsecureSkipTLSVerify() {
        V1APIServiceSpec spec = new V1APIServiceSpec();
        Boolean insecureSkipTLSVerify = true;
        spec.setInsecureSkipTLSVerify(insecureSkipTLSVerify);
        assertEquals(insecureSkipTLSVerify, spec.getInsecureSkipTLSVerify());
    }

    //BaseRock generated method id: ${testService}, hash: B79A681C8871F32B9EDE47AD2ED73981
    @Test
    void testService() {
        V1APIServiceSpec spec = new V1APIServiceSpec();
        ApiregistrationV1ServiceReference service = new ApiregistrationV1ServiceReference();
        spec.setService(service);
        assertEquals(service, spec.getService());
    }

    //BaseRock generated method id: ${testVersion}, hash: EDB37D81EC110E2228081DA796C827E0
    @Test
    void testVersion() {
        V1APIServiceSpec spec = new V1APIServiceSpec();
        String version = "v1";
        spec.setVersion(version);
        assertEquals(version, spec.getVersion());
    }

    //BaseRock generated method id: ${testVersionPriority}, hash: 2F22EF721EB10373C2C839A78188CE4B
    @Test
    void testVersionPriority() {
        V1APIServiceSpec spec = new V1APIServiceSpec();
        Integer versionPriority = 10;
        spec.setVersionPriority(versionPriority);
        assertEquals(versionPriority, spec.getVersionPriority());
    }

    //BaseRock generated method id: ${testEquals}, hash: 1CE59F3C09C1B3948E3D7ADA70DA27A0
    @Test
    void testEquals() {
        V1APIServiceSpec spec1 = new V1APIServiceSpec().caBundle("test".getBytes()).group("testGroup").groupPriorityMinimum(100).insecureSkipTLSVerify(true).service(new ApiregistrationV1ServiceReference()).version("v1").versionPriority(10);
        V1APIServiceSpec spec2 = new V1APIServiceSpec().caBundle("test".getBytes()).group("testGroup").groupPriorityMinimum(100).insecureSkipTLSVerify(true).service(new ApiregistrationV1ServiceReference()).version("v1").versionPriority(10);
        assertThat(spec1.equals(spec2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 7C1C5640FDFDC135275E7A07F1FB203A
    @Test
    void testHashCode() {
        V1APIServiceSpec spec1 = new V1APIServiceSpec().caBundle("test".getBytes()).group("testGroup").groupPriorityMinimum(100).insecureSkipTLSVerify(true).service(new ApiregistrationV1ServiceReference()).version("v1").versionPriority(10);
        V1APIServiceSpec spec2 = new V1APIServiceSpec().caBundle("test".getBytes()).group("testGroup").groupPriorityMinimum(100).insecureSkipTLSVerify(true).service(new ApiregistrationV1ServiceReference()).version("v1").versionPriority(10);
        assertThat(spec1.hashCode(), equalTo(spec2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 8643A54E86A7868FFC72E15693BFDBC8
    @Test
    void testToString() {
        V1APIServiceSpec spec = new V1APIServiceSpec().caBundle("test".getBytes()).group("testGroup").groupPriorityMinimum(100).insecureSkipTLSVerify(true).service(new ApiregistrationV1ServiceReference()).version("v1").versionPriority(10);
        String result = spec.toString();
        assertThat(result, startsWith("class V1APIServiceSpec {"));
        assertThat(result, endsWith("}"));
        assertThat(result.contains("caBundle:"), is(true));
        assertThat(result.contains("group: testGroup"), is(true));
        assertThat(result.contains("groupPriorityMinimum: 100"), is(true));
        assertThat(result.contains("insecureSkipTLSVerify: true"), is(true));
        assertThat(result.contains("service: class ApiregistrationV1ServiceReference {"), is(true));
        assertThat(result.contains("version: v1"), is(true));
        assertThat(result.contains("versionPriority: 10"), is(true));
    }

    //BaseRock generated method id: ${testGroupWithDifferentValues}, hash: F9FAB8682553F76CA15BEFFE44E4362D
    @ParameterizedTest
    @ValueSource(strings = { "", "testGroup", "com.example.group" })
    void testGroupWithDifferentValues(String groupValue) {
        V1APIServiceSpec spec = new V1APIServiceSpec();
        spec.setGroup(groupValue);
        assertEquals(groupValue, spec.getGroup());
    }

    //BaseRock generated method id: ${testNullGroup}, hash: 7E26DC252D7252FCF5968F1416A9537F
    @Test
    void testNullGroup() {
        V1APIServiceSpec spec = new V1APIServiceSpec();
        spec.setGroup(null);
        assertThat(spec.getGroup(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNullCaBundle}, hash: D63B7AC6424159A7636F235E179F0954
    @Test
    void testNullCaBundle() {
        V1APIServiceSpec spec = new V1APIServiceSpec();
        spec.setCaBundle(null);
        assertThat(spec.getCaBundle(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEmptyCaBundle}, hash: 2C27C7B93A827447A3F07619A728C429
    @Test
    void testEmptyCaBundle() {
        V1APIServiceSpec spec = new V1APIServiceSpec();
        byte[] emptyArray = new byte[0];
        spec.setCaBundle(emptyArray);
        assertArrayEquals(emptyArray, spec.getCaBundle());
    }

    //BaseRock generated method id: ${testNullService}, hash: EDC874A5A20FA1CB76A78FC5CCF31224
    @Test
    void testNullService() {
        V1APIServiceSpec spec = new V1APIServiceSpec();
        spec.setService(null);
        assertThat(spec.getService(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNullVersion}, hash: 1F8DF5220AD15F7F6AF10714742EEBF1
    @Test
    void testNullVersion() {
        V1APIServiceSpec spec = new V1APIServiceSpec();
        spec.setVersion(null);
        assertThat(spec.getVersion(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNullInsecureSkipTLSVerify}, hash: 469A5513E0D072B10D5B2F3DEFD7B6CE
    @Test
    void testNullInsecureSkipTLSVerify() {
        V1APIServiceSpec spec = new V1APIServiceSpec();
        spec.setInsecureSkipTLSVerify(null);
        assertThat(spec.getInsecureSkipTLSVerify(), is(nullValue()));
    }

    //BaseRock generated method id: ${testGroupPriorityMinimumNonNull}, hash: E4021AC2C6051EBCD9046D93DB55C9B5
    @Test
    void testGroupPriorityMinimumNonNull() {
        V1APIServiceSpec spec = new V1APIServiceSpec();
        spec.setGroupPriorityMinimum(null);
        assertThat(spec.getGroupPriorityMinimum(), is(nullValue()));
    }

    //BaseRock generated method id: ${testVersionPriorityNonNull}, hash: 289824572952FE8D82085D0DD9E5530F
    @Test
    void testVersionPriorityNonNull() {
        V1APIServiceSpec spec = new V1APIServiceSpec();
        spec.setVersionPriority(null);
        assertThat(spec.getVersionPriority(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObjects}, hash: C12C09D0F021F2A7666C4A45C77AC878
    @Test
    void testEqualsWithDifferentObjects() {
        V1APIServiceSpec spec = new V1APIServiceSpec().caBundle("test".getBytes()).group("testGroup").groupPriorityMinimum(100).insecureSkipTLSVerify(true).service(new ApiregistrationV1ServiceReference()).version("v1").versionPriority(10);
        assertThat(spec.equals(null), is(false));
        assertThat(spec.equals(new Object()), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentValues}, hash: 97A8E8C73C70780436D9A09D5D3C0307
    @Test
    void testEqualsWithDifferentValues() {
        V1APIServiceSpec spec1 = new V1APIServiceSpec().caBundle("test1".getBytes()).group("testGroup1").groupPriorityMinimum(100).insecureSkipTLSVerify(true).service(new ApiregistrationV1ServiceReference()).version("v1").versionPriority(10);
        V1APIServiceSpec spec2 = new V1APIServiceSpec().caBundle("test2".getBytes()).group("testGroup2").groupPriorityMinimum(200).insecureSkipTLSVerify(false).service(new ApiregistrationV1ServiceReference()).version("v2").versionPriority(20);
        assertThat(spec1.equals(spec2), is(false));
    }

    //BaseRock generated method id: ${testHashCodeConsistency}, hash: 16D243602E549465B254891D49D11964
    @Test
    void testHashCodeConsistency() {
        V1APIServiceSpec spec = new V1APIServiceSpec().caBundle("test".getBytes()).group("testGroup").groupPriorityMinimum(100).insecureSkipTLSVerify(true).service(new ApiregistrationV1ServiceReference()).version("v1").versionPriority(10);
        int hashCode1 = spec.hashCode();
        int hashCode2 = spec.hashCode();
        assertThat(hashCode1, equalTo(hashCode2));
    }

    //BaseRock generated method id: ${testHashCodeWithNullValues}, hash: BCAD8EEC18B9E3D78D7C9A5015957B17
    @Test
    void testHashCodeWithNullValues() {
        V1APIServiceSpec spec = new V1APIServiceSpec();
        assertThat(spec.hashCode(), notNullValue());
    }

    //BaseRock generated method id: ${testToStringWithNullValues}, hash: B9732F8877B5842EEB9828588264C779
    @Test
    void testToStringWithNullValues() {
        V1APIServiceSpec spec = new V1APIServiceSpec();
        String result = spec.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("null"), is(true));
    }

    //BaseRock generated method id: ${testCaBundleWithLargeArray}, hash: 79A8A4BF9CA5421E0360FDFE33E5EAC2
    @Test
    void testCaBundleWithLargeArray() {
        V1APIServiceSpec spec = new V1APIServiceSpec();
        byte[] largeArray = new byte[1000000];
        Arrays.fill(largeArray, (byte) 1);
        spec.setCaBundle(largeArray);
        assertArrayEquals(largeArray, spec.getCaBundle());
    }

    //BaseRock generated method id: ${testGroupPriorityMinimumBoundary}, hash: B1376FD9C50CFDBE65B732D950E694C2
    @Test
    void testGroupPriorityMinimumBoundary() {
        V1APIServiceSpec spec = new V1APIServiceSpec();
        spec.setGroupPriorityMinimum(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, spec.getGroupPriorityMinimum());
        spec.setGroupPriorityMinimum(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, spec.getGroupPriorityMinimum());
    }

    //BaseRock generated method id: ${testVersionPriorityBoundary}, hash: 366C8474F3706C173622452B3E94971E
    @Test
    void testVersionPriorityBoundary() {
        V1APIServiceSpec spec = new V1APIServiceSpec();
        spec.setVersionPriority(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, spec.getVersionPriority());
        spec.setVersionPriority(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, spec.getVersionPriority());
    }
}

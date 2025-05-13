package io.kubernetes.client.openapi.models;

import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import java.util.Map;
import io.kubernetes.client.openapi.models.V1beta1ParentReference;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1beta1IPAddressSpec;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1beta1IPAddressBaseRockGeneratedTest {

    private V1beta1IPAddress v1beta1IPAddress;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        v1beta1IPAddress = new V1beta1IPAddress();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 345DB52C6B17C31BAAD709AC1901F2E9
    @Test
    void testApiVersion() {
        String apiVersion = "v1beta1";
        v1beta1IPAddress.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1beta1IPAddress.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: DF93AC71BA057BFFF455235CD08E94A9
    @Test
    void testKind() {
        String kind = "IPAddress";
        v1beta1IPAddress.setKind(kind);
        assertEquals(kind, v1beta1IPAddress.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: B92DFE968733FF985C5F7D751880AA1F
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1beta1IPAddress.setMetadata(metadata);
        assertEquals(metadata, v1beta1IPAddress.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: 5D5188C7C681E19D12A1C94A773AB455
    @Test
    void testSpec() {
        V1beta1IPAddressSpec spec = mock(V1beta1IPAddressSpec.class);
        v1beta1IPAddress.setSpec(spec);
        assertEquals(spec, v1beta1IPAddress.getSpec());
    }

    //BaseRock generated method id: ${testEquals}, hash: DEFBD9AA559B6DEDA223F80EAEB196FB
    @Test
    void testEquals() {
        V1beta1IPAddress other = new V1beta1IPAddress();
        other.setApiVersion("v1beta1");
        other.setKind("IPAddress");
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1beta1IPAddressSpec spec = mock(V1beta1IPAddressSpec.class);
        other.setMetadata(metadata);
        other.setSpec(spec);
        v1beta1IPAddress.setApiVersion("v1beta1");
        v1beta1IPAddress.setKind("IPAddress");
        v1beta1IPAddress.setMetadata(metadata);
        v1beta1IPAddress.setSpec(spec);
        assertThat(v1beta1IPAddress, is(equalTo(other)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: A164C2C1C8B13640C3793C7E3595F8D4
    @Test
    void testHashCode() {
        v1beta1IPAddress.setApiVersion("v1beta1");
        v1beta1IPAddress.setKind("IPAddress");
        v1beta1IPAddress.setMetadata(mock(V1ObjectMeta.class));
        v1beta1IPAddress.setSpec(mock(V1beta1IPAddressSpec.class));
        int hashCode = v1beta1IPAddress.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 4615B661F5E4F9FD4870CDF13D5ED758
    @Test
    void testToString() {
        v1beta1IPAddress.setApiVersion("v1beta1");
        v1beta1IPAddress.setKind("IPAddress");
        v1beta1IPAddress.setMetadata(mock(V1ObjectMeta.class));
        v1beta1IPAddress.setSpec(mock(V1beta1IPAddressSpec.class));
        String toString = v1beta1IPAddress.toString();
        assertNotNull(toString);
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("spec"), is(true));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 16AD0C3550F911A6E1F97340FF46EC18
    @Disabled()
    @Test
    void testFromJson() throws Exception {
        String json = "{\"apiVersion\":\"v1beta1\",\"kind\":\"IPAddress\",\"metadata\":{},\"spec\":{\"parentRef\":{\"group\":\"test\",\"resource\":\"testResource\"}}}";
        V1beta1IPAddress fromJson = V1beta1IPAddress.fromJson(json);
        assertNotNull(fromJson);
        assertEquals("v1beta1", fromJson.getApiVersion());
        assertEquals("IPAddress", fromJson.getKind());
        assertNotNull(fromJson.getMetadata());
        assertNotNull(fromJson.getSpec());
        assertNotNull(fromJson.getSpec().getParentRef());
        assertEquals("test", fromJson.getSpec().getParentRef().getGroup());
        assertEquals("testResource", fromJson.getSpec().getParentRef().getResource());
    }

    //BaseRock generated method id: ${testToJson}, hash: BC2F73A29CFDAC525264647CF677F87D
    @Disabled()
    @Test
    void testToJson() throws Exception {
        v1beta1IPAddress.setApiVersion("v1beta1");
        v1beta1IPAddress.setKind("IPAddress");
        v1beta1IPAddress.setMetadata(new V1ObjectMeta());
        V1beta1IPAddressSpec spec = new V1beta1IPAddressSpec();
        V1beta1ParentReference parentRef = new V1beta1ParentReference();
        parentRef.setGroup("test");
        parentRef.setResource("testResource");
        spec.setParentRef(parentRef);
        v1beta1IPAddress.setSpec(spec);
        String json = v1beta1IPAddress.toJson();
        assertNotNull(json);
        assertThat(json.contains("\"apiVersion\":\"v1beta1\""), is(true));
        assertThat(json.contains("\"kind\":\"IPAddress\""), is(true));
        assertThat(json.contains("\"metadata\":{}"), is(true));
        assertThat(json.contains("\"spec\":{"), is(true));
        assertThat(json.contains("\"parentRef\":{"), is(true));
        assertThat(json.contains("\"group\":\"test\""), is(true));
        assertThat(json.contains("\"resource\":\"testResource\""), is(true));
    }
}

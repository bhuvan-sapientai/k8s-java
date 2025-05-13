package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.models.V1beta1ServiceCIDRSpec;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1beta1ServiceCIDRSpecBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 088CA6DB1A24D06499146DAED8A3E5A9
    @Test
    void testConstructor() {
        V1beta1ServiceCIDRSpec spec = new V1beta1ServiceCIDRSpec();
        assertThat(spec, is(notNullValue()));
        assertThat(spec.getCidrs(), is(empty()));
    }

    //BaseRock generated method id: ${testCidrs}, hash: FD6E43F7BD7BF4811FA3BA2B667F2654
    @Test
    void testCidrs() {
        V1beta1ServiceCIDRSpec spec = new V1beta1ServiceCIDRSpec();
        List<String> cidrs = new ArrayList<>();
        cidrs.add("192.168.0.0/24");
        cidrs.add("2001:db8::/64");
        spec.setCidrs(cidrs);
        assertThat(spec.getCidrs(), is(equalTo(cidrs)));
        assertThat(spec.getCidrs(), hasSize(2));
        assertThat(spec.getCidrs(), contains("192.168.0.0/24", "2001:db8::/64"));
    }

    //BaseRock generated method id: ${testAddCidrsItem}, hash: 19CF918CA4F39B7ABEB0033747279FC7
    @Test
    void testAddCidrsItem() {
        V1beta1ServiceCIDRSpec spec = new V1beta1ServiceCIDRSpec();
        spec.addCidrsItem("192.168.0.0/24");
        assertThat(spec.getCidrs(), hasSize(1));
        assertThat(spec.getCidrs(), contains("192.168.0.0/24"));
        spec.addCidrsItem("2001:db8::/64");
        assertThat(spec.getCidrs(), hasSize(2));
        assertThat(spec.getCidrs(), contains("192.168.0.0/24", "2001:db8::/64"));
    }

    //BaseRock generated method id: ${testAddCidrsItemParameterized}, hash: FC44CE1E84CF9DD88F23C87D33A918DF
    @ParameterizedTest
    @ValueSource(strings = { "192.168.0.0/24", "2001:db8::/64", "10.0.0.0/8" })
    void testAddCidrsItemParameterized(String cidr) {
        V1beta1ServiceCIDRSpec spec = new V1beta1ServiceCIDRSpec();
        spec.addCidrsItem(cidr);
        assertThat(spec.getCidrs(), hasSize(1));
        assertThat(spec.getCidrs(), contains(cidr));
    }

    //BaseRock generated method id: ${testEquals}, hash: D8925589378859AA64BAE5FBBEC85B9D
    @Test
    void testEquals() {
        V1beta1ServiceCIDRSpec spec1 = new V1beta1ServiceCIDRSpec();
        V1beta1ServiceCIDRSpec spec2 = new V1beta1ServiceCIDRSpec();
        assertThat(spec1.equals(spec2), is(true));
        spec1.addCidrsItem("192.168.0.0/24");
        assertThat(spec1.equals(spec2), is(false));
        spec2.addCidrsItem("192.168.0.0/24");
        assertThat(spec1.equals(spec2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 8F98C3D8FF39E454A63EEEE2ABBA7DE7
    @Test
    void testHashCode() {
        V1beta1ServiceCIDRSpec spec1 = new V1beta1ServiceCIDRSpec();
        V1beta1ServiceCIDRSpec spec2 = new V1beta1ServiceCIDRSpec();
        assertThat(spec1.hashCode(), is(equalTo(spec2.hashCode())));
        spec1.addCidrsItem("192.168.0.0/24");
        assertThat(spec1.hashCode(), is(not(equalTo(spec2.hashCode()))));
        spec2.addCidrsItem("192.168.0.0/24");
        assertThat(spec1.hashCode(), is(equalTo(spec2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: AEA332152C17C74E53DF472133EADAF5
    @Test
    void testToString() {
        V1beta1ServiceCIDRSpec spec = new V1beta1ServiceCIDRSpec();
        spec.addCidrsItem("192.168.0.0/24");
        spec.addCidrsItem("2001:db8::/64");
        String toString = spec.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString, containsString("class V1beta1ServiceCIDRSpec"));
        assertThat(toString, containsString("cidrs:"));
        assertThat(toString, containsString("192.168.0.0/24"));
        assertThat(toString, containsString("2001:db8::/64"));
    }

    //BaseRock generated method id: ${testSetNullCidrs}, hash: 7FF505F23872EDE2CEBEE30668D8FCBE
    @Test
    void testSetNullCidrs() {
        V1beta1ServiceCIDRSpec spec = new V1beta1ServiceCIDRSpec();
        spec.setCidrs(null);
        assertThat(spec.getCidrs(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAddNullCidrsItem}, hash: 03779780BAAEBDF3325847EBACAAACE3
    @Disabled()
    @Test
    void testAddNullCidrsItem() {
        V1beta1ServiceCIDRSpec spec = new V1beta1ServiceCIDRSpec();
        assertThrows(NullPointerException.class, () -> spec.addCidrsItem(null));
    }
}

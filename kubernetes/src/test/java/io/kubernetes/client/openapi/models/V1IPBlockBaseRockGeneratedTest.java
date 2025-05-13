package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
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
import io.kubernetes.client.openapi.models.V1IPBlock;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1IPBlockBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 2FA3BB96404F74DA32F50BC696EAECE0
    @Test
    void testConstructor() {
        V1IPBlock ipBlock = new V1IPBlock();
        assertThat(ipBlock, is(notNullValue()));
    }

    //BaseRock generated method id: ${testCidr}, hash: 4EC808B1BAD49729DCD95ED2E10879FC
    @Test
    void testCidr() {
        String cidr = "192.168.1.0/24";
        V1IPBlock ipBlock = new V1IPBlock().cidr(cidr);
        assertThat(ipBlock.getCidr(), is(equalTo(cidr)));
    }

    //BaseRock generated method id: ${testCidrWithDifferentValues}, hash: C5FBBD275D74F93C0D23A42B14FE0465
    @ParameterizedTest
    @ValueSource(strings = { "192.168.1.0/24", "2001:db8::/64" })
    void testCidrWithDifferentValues(String cidr) {
        V1IPBlock ipBlock = new V1IPBlock().cidr(cidr);
        assertThat(ipBlock.getCidr(), is(equalTo(cidr)));
    }

    //BaseRock generated method id: ${testSetCidr}, hash: EF14F090453B7910DC45386BAA5BB26D
    @Test
    void testSetCidr() {
        String cidr = "10.0.0.0/16";
        V1IPBlock ipBlock = new V1IPBlock();
        ipBlock.setCidr(cidr);
        assertThat(ipBlock.getCidr(), is(equalTo(cidr)));
    }

    //BaseRock generated method id: ${testExcept}, hash: B358BD76B00370107BBF495DED940DA1
    @Test
    void testExcept() {
        List<String> exceptList = Arrays.asList("192.168.1.1/32", "192.168.1.2/32");
        V1IPBlock ipBlock = new V1IPBlock().except(exceptList);
        assertThat(ipBlock.getExcept(), is(equalTo(exceptList)));
    }

    //BaseRock generated method id: ${testAddExceptItem}, hash: 31912CDEE964982F368585C89F213539
    @Test
    void testAddExceptItem() {
        String exceptItem = "192.168.1.1/32";
        V1IPBlock ipBlock = new V1IPBlock().addExceptItem(exceptItem);
        assertThat(ipBlock.getExcept(), hasSize(1));
        assertThat(ipBlock.getExcept().get(0), is(equalTo(exceptItem)));
    }

    //BaseRock generated method id: ${testAddMultipleExceptItems}, hash: 463BD091844AFE0BC43C535524349602
    @Test
    void testAddMultipleExceptItems() {
        V1IPBlock ipBlock = new V1IPBlock().addExceptItem("192.168.1.1/32").addExceptItem("192.168.1.2/32");
        assertThat(ipBlock.getExcept(), hasSize(2));
        assertThat(ipBlock.getExcept(), containsInAnyOrder("192.168.1.1/32", "192.168.1.2/32"));
    }

    //BaseRock generated method id: ${testSetExcept}, hash: 40858307EAEED42983DE6A75D03C0A3F
    @Test
    void testSetExcept() {
        List<String> exceptList = Arrays.asList("192.168.1.1/32", "192.168.1.2/32");
        V1IPBlock ipBlock = new V1IPBlock();
        ipBlock.setExcept(exceptList);
        assertThat(ipBlock.getExcept(), is(equalTo(exceptList)));
    }

    //BaseRock generated method id: ${testEquals}, hash: F565FACE1C3133905F2998D7B7687F32
    @Test
    void testEquals() {
        V1IPBlock ipBlock1 = new V1IPBlock().cidr("192.168.1.0/24").addExceptItem("192.168.1.1/32");
        V1IPBlock ipBlock2 = new V1IPBlock().cidr("192.168.1.0/24").addExceptItem("192.168.1.1/32");
        V1IPBlock ipBlock3 = new V1IPBlock().cidr("10.0.0.0/16").addExceptItem("10.0.0.1/32");
        assertThat(ipBlock1.equals(ipBlock2), is(true));
        assertThat(ipBlock1.equals(ipBlock3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: BD1016108B997AA7281DC8B4054123E8
    @Test
    void testHashCode() {
        V1IPBlock ipBlock1 = new V1IPBlock().cidr("192.168.1.0/24").addExceptItem("192.168.1.1/32");
        V1IPBlock ipBlock2 = new V1IPBlock().cidr("192.168.1.0/24").addExceptItem("192.168.1.1/32");
        V1IPBlock ipBlock3 = new V1IPBlock().cidr("10.0.0.0/16").addExceptItem("10.0.0.1/32");
        assertThat(ipBlock1.hashCode(), is(equalTo(ipBlock2.hashCode())));
        assertThat(ipBlock1.hashCode(), is(not(equalTo(ipBlock3.hashCode()))));
    }

    //BaseRock generated method id: ${testToString}, hash: A3D37E12EC45C14FCC1E5FFA4A927923
    @Test
    void testToString() {
        V1IPBlock ipBlock = new V1IPBlock().cidr("192.168.1.0/24").addExceptItem("192.168.1.1/32").addExceptItem("192.168.1.2/32");
        String expectedString = "class V1IPBlock {\n" + "    cidr: 192.168.1.0/24\n" + "    except: [192.168.1.1/32, 192.168.1.2/32]\n" + "}";
        assertThat(ipBlock.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testAddExceptItemToNullList}, hash: 436CFFADBF47EF904ECD243CA445C2C7
    @Test
    void testAddExceptItemToNullList() {
        V1IPBlock ipBlock = new V1IPBlock();
        ipBlock.setExcept(null);
        ipBlock.addExceptItem("192.168.1.1/32");
        assertThat(ipBlock.getExcept(), hasSize(1));
        assertThat(ipBlock.getExcept().get(0), is(equalTo("192.168.1.1/32")));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: E44D1D0B1966F9760C197122714EB27F
    @Test
    void testEqualsWithNull() {
        V1IPBlock ipBlock = new V1IPBlock().cidr("192.168.1.0/24");
        assertThat(ipBlock.equals(null), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 385B6EF5C39AF83A0CAEA8FDC432B0CA
    @Test
    void testEqualsWithDifferentClass() {
        V1IPBlock ipBlock = new V1IPBlock().cidr("192.168.1.0/24");
        assertThat(ipBlock.equals("not an IPBlock"), is(false));
    }

    //BaseRock generated method id: ${testHashCodeConsistency}, hash: 9ED7279C26A3A442B9C825E57545AEBB
    @Test
    void testHashCodeConsistency() {
        V1IPBlock ipBlock = new V1IPBlock().cidr("192.168.1.0/24").addExceptItem("192.168.1.1/32");
        int initialHashCode = ipBlock.hashCode();
        assertThat(ipBlock.hashCode(), is(equalTo(initialHashCode)));
        ipBlock.addExceptItem("192.168.1.2/32");
        assertThat(ipBlock.hashCode(), is(not(equalTo(initialHashCode))));
    }
}

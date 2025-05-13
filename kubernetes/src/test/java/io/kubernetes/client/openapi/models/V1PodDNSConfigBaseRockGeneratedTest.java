package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import io.kubernetes.client.openapi.models.V1PodDNSConfig;
import java.util.List;
import io.kubernetes.client.openapi.models.V1PodDNSConfigOption;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PodDNSConfigBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1PodDNSConfigConstructor}, hash: 23EB3BA474622EE2EA13101B9ED26BBF
    @Test
    void testV1PodDNSConfigConstructor() {
        V1PodDNSConfig podDNSConfig = new V1PodDNSConfig();
        assertNotNull(podDNSConfig);
    }

    //BaseRock generated method id: ${testNameservers}, hash: 9F63B696F2E68E2C8AB568E521B3B04B
    @Test
    void testNameservers() {
        V1PodDNSConfig podDNSConfig = new V1PodDNSConfig();
        List<String> nameservers = Arrays.asList("8.8.8.8", "8.8.4.4");
        podDNSConfig.setNameservers(nameservers);
        assertEquals(nameservers, podDNSConfig.getNameservers());
    }

    //BaseRock generated method id: ${testAddNameserversItem}, hash: 81F7D24F6BD29DC4C537270C3403924C
    @Test
    void testAddNameserversItem() {
        V1PodDNSConfig podDNSConfig = new V1PodDNSConfig();
        String nameserver = "1.1.1.1";
        podDNSConfig.addNameserversItem(nameserver);
        assertThat(podDNSConfig.getNameservers(), hasSize(1));
        assertThat(podDNSConfig.getNameservers().get(0), is(equalTo(nameserver)));
    }

    //BaseRock generated method id: ${testOptions}, hash: 2D4F0CB39EB8772BC6A78317E93CD04B
    @Test
    void testOptions() {
        V1PodDNSConfig podDNSConfig = new V1PodDNSConfig();
        List<V1PodDNSConfigOption> options = new ArrayList<>();
        V1PodDNSConfigOption option = new V1PodDNSConfigOption();
        option.setName("ndots");
        option.setValue("5");
        options.add(option);
        podDNSConfig.setOptions(options);
        assertEquals(options, podDNSConfig.getOptions());
    }

    //BaseRock generated method id: ${testAddOptionsItem}, hash: A53BA2DBBBEC737FD44E72BE507A03C4
    @Test
    void testAddOptionsItem() {
        V1PodDNSConfig podDNSConfig = new V1PodDNSConfig();
        V1PodDNSConfigOption option = new V1PodDNSConfigOption();
        option.setName("timeout");
        option.setValue("10");
        podDNSConfig.addOptionsItem(option);
        assertThat(podDNSConfig.getOptions(), hasSize(1));
        assertThat(podDNSConfig.getOptions().get(0), is(equalTo(option)));
    }

    //BaseRock generated method id: ${testSearches}, hash: D99366E729B4492D424C8B5C2E552219
    @Test
    void testSearches() {
        V1PodDNSConfig podDNSConfig = new V1PodDNSConfig();
        List<String> searches = Arrays.asList("example.com", "kubernetes.default.svc.cluster.local");
        podDNSConfig.setSearches(searches);
        assertEquals(searches, podDNSConfig.getSearches());
    }

    //BaseRock generated method id: ${testAddSearchesItem}, hash: 9977E2685B1E75E0EF69A6BB817D389D
    @Test
    void testAddSearchesItem() {
        V1PodDNSConfig podDNSConfig = new V1PodDNSConfig();
        String search = "test.local";
        podDNSConfig.addSearchesItem(search);
        assertThat(podDNSConfig.getSearches(), hasSize(1));
        assertThat(podDNSConfig.getSearches().get(0), is(equalTo(search)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 8135A6D34AA34B417FE79F91AA540FBD
    @Test
    void testEquals() {
        V1PodDNSConfig config1 = new V1PodDNSConfig().nameservers(Arrays.asList("8.8.8.8")).searches(Arrays.asList("example.com"));
        V1PodDNSConfig config2 = new V1PodDNSConfig().nameservers(Arrays.asList("8.8.8.8")).searches(Arrays.asList("example.com"));
        V1PodDNSConfig config3 = new V1PodDNSConfig().nameservers(Arrays.asList("8.8.4.4")).searches(Arrays.asList("test.com"));
        assertThat(config1.equals(config2), is(true));
        assertThat(config1.equals(config3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: E8A58F807F1C3DE8DA3C81741E297DC3
    @Test
    void testHashCode() {
        V1PodDNSConfig config1 = new V1PodDNSConfig().nameservers(Arrays.asList("8.8.8.8")).searches(Arrays.asList("example.com"));
        V1PodDNSConfig config2 = new V1PodDNSConfig().nameservers(Arrays.asList("8.8.8.8")).searches(Arrays.asList("example.com"));
        assertThat(config1.hashCode(), is(equalTo(config2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 24A28C04FB2FCB68DCDFDE44A2E81F28
    @Test
    void testToString() {
        V1PodDNSConfig podDNSConfig = new V1PodDNSConfig().nameservers(Arrays.asList("8.8.8.8")).searches(Arrays.asList("example.com"));
        String toString = podDNSConfig.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("nameservers"), is(true));
        assertThat(toString.contains("searches"), is(true));
    }

    //BaseRock generated method id: ${testSetAndGetNameservers}, hash: 23C1560C5CA32A3B5D819BF82DFE7AFB
    @Test
    void testSetAndGetNameservers() {
        V1PodDNSConfig podDNSConfig = new V1PodDNSConfig();
        List<String> nameservers = Arrays.asList("8.8.8.8", "8.8.4.4");
        podDNSConfig.setNameservers(nameservers);
        assertThat(podDNSConfig.getNameservers(), is(equalTo(nameservers)));
    }

    //BaseRock generated method id: ${testSetAndGetOptions}, hash: 26A67057823809426753699C01DE5AA1
    @Test
    void testSetAndGetOptions() {
        V1PodDNSConfig podDNSConfig = new V1PodDNSConfig();
        List<V1PodDNSConfigOption> options = new ArrayList<>();
        V1PodDNSConfigOption option = new V1PodDNSConfigOption().name("ndots").value("5");
        options.add(option);
        podDNSConfig.setOptions(options);
        assertThat(podDNSConfig.getOptions(), is(equalTo(options)));
    }

    //BaseRock generated method id: ${testSetAndGetSearches}, hash: 58EBD67CA4F4490B29E063D1C0BDAB2D
    @Test
    void testSetAndGetSearches() {
        V1PodDNSConfig podDNSConfig = new V1PodDNSConfig();
        List<String> searches = Arrays.asList("example.com", "kubernetes.default.svc.cluster.local");
        podDNSConfig.setSearches(searches);
        assertThat(podDNSConfig.getSearches(), is(equalTo(searches)));
    }

    //BaseRock generated method id: ${testEmptyNameservers}, hash: DF541822D270B53927240F0860C06D24
    @Test
    void testEmptyNameservers() {
        V1PodDNSConfig podDNSConfig = new V1PodDNSConfig();
        assertThat(podDNSConfig.getNameservers(), is(empty()));
    }

    //BaseRock generated method id: ${testEmptyOptions}, hash: AB1AB6432C0F9CA8B07DF980836128BC
    @Test
    void testEmptyOptions() {
        V1PodDNSConfig podDNSConfig = new V1PodDNSConfig();
        assertThat(podDNSConfig.getOptions(), is(empty()));
    }

    //BaseRock generated method id: ${testEmptySearches}, hash: 092AFC741EF2DA492593E5444BAE465F
    @Test
    void testEmptySearches() {
        V1PodDNSConfig podDNSConfig = new V1PodDNSConfig();
        assertThat(podDNSConfig.getSearches(), is(empty()));
    }

    //BaseRock generated method id: ${testNullNameservers}, hash: 3F6E357B799A28326CFDBAC1D98FDD3B
    @Test
    void testNullNameservers() {
        V1PodDNSConfig podDNSConfig = new V1PodDNSConfig();
        podDNSConfig.setNameservers(null);
        assertThat(podDNSConfig.getNameservers(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNullOptions}, hash: 45A52A6213DE1FAD8583CB4AAA68BCA4
    @Test
    void testNullOptions() {
        V1PodDNSConfig podDNSConfig = new V1PodDNSConfig();
        podDNSConfig.setOptions(null);
        assertThat(podDNSConfig.getOptions(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNullSearches}, hash: E6672E44ACA819C4BAC3F3643DD32566
    @Test
    void testNullSearches() {
        V1PodDNSConfig podDNSConfig = new V1PodDNSConfig();
        podDNSConfig.setSearches(null);
        assertThat(podDNSConfig.getSearches(), is(nullValue()));
    }

    //BaseRock generated method id: ${testMultipleNameservers}, hash: DC609436FDD1E02F967C9B6E2607E027
    @Test
    void testMultipleNameservers() {
        V1PodDNSConfig podDNSConfig = new V1PodDNSConfig();
        List<String> nameservers = Arrays.asList("8.8.8.8", "8.8.4.4", "1.1.1.1");
        podDNSConfig.setNameservers(nameservers);
        assertThat(podDNSConfig.getNameservers(), containsInAnyOrder("8.8.8.8", "8.8.4.4", "1.1.1.1"));
    }

    //BaseRock generated method id: ${testMultipleOptions}, hash: 32029FF22719B71E92B209429F62496C
    @Test
    void testMultipleOptions() {
        V1PodDNSConfig podDNSConfig = new V1PodDNSConfig();
        List<V1PodDNSConfigOption> options = new ArrayList<>();
        options.add(new V1PodDNSConfigOption().name("ndots").value("5"));
        options.add(new V1PodDNSConfigOption().name("timeout").value("10"));
        podDNSConfig.setOptions(options);
        assertThat(podDNSConfig.getOptions(), is(equalTo(options)));
    }

    //BaseRock generated method id: ${testMultipleSearches}, hash: 5C9486EA3ED13F423B703A7111A85F62
    @Test
    void testMultipleSearches() {
        V1PodDNSConfig podDNSConfig = new V1PodDNSConfig();
        List<String> searches = Arrays.asList("example.com", "kubernetes.default.svc.cluster.local", "test.local");
        podDNSConfig.setSearches(searches);
        assertThat(podDNSConfig.getSearches(), containsInAnyOrder("example.com", "kubernetes.default.svc.cluster.local", "test.local"));
    }
}

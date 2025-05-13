package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1alpha3DeviceRequestAllocationResult;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.containsString;
import io.kubernetes.client.openapi.models.V1alpha3DeviceAllocationConfiguration;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.containsInAnyOrder;
import java.util.Arrays;
import java.util.List;
import io.kubernetes.client.openapi.models.V1alpha3DeviceAllocationResult;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3DeviceAllocationResultBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: A34DD9A181818013D14C85C21ABC19CD
    @Test
    void testConstructor() {
        V1alpha3DeviceAllocationResult result = new V1alpha3DeviceAllocationResult();
        assertNotNull(result);
        assertThat(result.getConfig(), is(empty()));
        assertThat(result.getResults(), is(empty()));
    }

    //BaseRock generated method id: ${testSetAndGetConfig}, hash: 4342904D02677CCBD497441CAD4F3BD0
    @Test
    void testSetAndGetConfig() {
        V1alpha3DeviceAllocationResult result = new V1alpha3DeviceAllocationResult();
        List<V1alpha3DeviceAllocationConfiguration> config = new ArrayList<>();
        config.add(new V1alpha3DeviceAllocationConfiguration());
        result.setConfig(config);
        assertThat(result.getConfig(), hasSize(1));
        assertEquals(config, result.getConfig());
    }

    //BaseRock generated method id: ${testSetAndGetResults}, hash: A811EDFE7866B0C8BF0DCCA7C8FC4430
    @Test
    void testSetAndGetResults() {
        V1alpha3DeviceAllocationResult result = new V1alpha3DeviceAllocationResult();
        List<V1alpha3DeviceRequestAllocationResult> results = new ArrayList<>();
        results.add(new V1alpha3DeviceRequestAllocationResult());
        result.setResults(results);
        assertThat(result.getResults(), hasSize(1));
        assertEquals(results, result.getResults());
    }

    //BaseRock generated method id: ${testAddConfigItem}, hash: 1C8C56EAF00DB0F4C08B3BA2C73394A8
    @Test
    void testAddConfigItem() {
        V1alpha3DeviceAllocationResult result = new V1alpha3DeviceAllocationResult();
        V1alpha3DeviceAllocationConfiguration config = new V1alpha3DeviceAllocationConfiguration();
        result.addConfigItem(config);
        assertThat(result.getConfig(), hasSize(1));
        assertThat(result.getConfig().get(0), is(equalTo(config)));
    }

    //BaseRock generated method id: ${testAddResultsItem}, hash: F670832581E3CE1213DB913D02A860ED
    @Test
    void testAddResultsItem() {
        V1alpha3DeviceAllocationResult result = new V1alpha3DeviceAllocationResult();
        V1alpha3DeviceRequestAllocationResult allocationResult = new V1alpha3DeviceRequestAllocationResult();
        result.addResultsItem(allocationResult);
        assertThat(result.getResults(), hasSize(1));
        assertThat(result.getResults().get(0), is(equalTo(allocationResult)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 492EC5C88878C40C2C4958E9788CC2A6
    @Test
    void testEqualsAndHashCode() {
        V1alpha3DeviceAllocationResult result1 = new V1alpha3DeviceAllocationResult().config(Arrays.asList(new V1alpha3DeviceAllocationConfiguration())).results(Arrays.asList(new V1alpha3DeviceRequestAllocationResult()));
        V1alpha3DeviceAllocationResult result2 = new V1alpha3DeviceAllocationResult().config(Arrays.asList(new V1alpha3DeviceAllocationConfiguration())).results(Arrays.asList(new V1alpha3DeviceRequestAllocationResult()));
        V1alpha3DeviceAllocationResult result3 = new V1alpha3DeviceAllocationResult().config(Arrays.asList(new V1alpha3DeviceAllocationConfiguration(), new V1alpha3DeviceAllocationConfiguration())).results(Arrays.asList(new V1alpha3DeviceRequestAllocationResult()));
        assertEquals(result1, result2);
        assertEquals(result1.hashCode(), result2.hashCode());
        assertNotEquals(result1, result3);
        assertNotEquals(result1.hashCode(), result3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 49BB21B4C7A5FE915FEA9D47E3FC9785
    @Test
    void testToString() {
        V1alpha3DeviceAllocationResult result = new V1alpha3DeviceAllocationResult().config(Arrays.asList(new V1alpha3DeviceAllocationConfiguration())).results(Arrays.asList(new V1alpha3DeviceRequestAllocationResult()));
        String toString = result.toString();
        assertThat(toString, notNullValue());
        assertThat(toString, startsWith("class V1alpha3DeviceAllocationResult"));
        assertThat(toString, containsString("config:"));
        assertThat(toString, containsString("results:"));
    }

    //BaseRock generated method id: ${testConfigWithNull}, hash: E3784CB5BB3722AF2007830E89E9C8EF
    @Test
    void testConfigWithNull() {
        V1alpha3DeviceAllocationResult result = new V1alpha3DeviceAllocationResult();
        result.setConfig(null);
        assertThat(result.getConfig(), is(nullValue()));
    }

    //BaseRock generated method id: ${testResultsWithNull}, hash: 9B62B2BD10CF68096528CDF9228F5D41
    @Test
    void testResultsWithNull() {
        V1alpha3DeviceAllocationResult result = new V1alpha3DeviceAllocationResult();
        result.setResults(null);
        assertThat(result.getResults(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAddConfigItemWithNull}, hash: 9FE8A5320637767013808E0EA0D688E0
    @Test
    void testAddConfigItemWithNull() {
        V1alpha3DeviceAllocationResult result = new V1alpha3DeviceAllocationResult();
        result.addConfigItem(null);
        assertThat(result.getConfig(), hasSize(1));
        assertThat(result.getConfig().get(0), is(nullValue()));
    }

    //BaseRock generated method id: ${testAddResultsItemWithNull}, hash: 2E50FD05F531D8167F1DD6354C8302FB
    @Test
    void testAddResultsItemWithNull() {
        V1alpha3DeviceAllocationResult result = new V1alpha3DeviceAllocationResult();
        result.addResultsItem(null);
        assertThat(result.getResults(), hasSize(1));
        assertThat(result.getResults().get(0), is(nullValue()));
    }

    //BaseRock generated method id: ${testMultipleConfigItems}, hash: 521D4B648FB436FF00FBFF9D3D674D20
    @Test
    void testMultipleConfigItems() {
        V1alpha3DeviceAllocationResult result = new V1alpha3DeviceAllocationResult();
        V1alpha3DeviceAllocationConfiguration config1 = new V1alpha3DeviceAllocationConfiguration();
        V1alpha3DeviceAllocationConfiguration config2 = new V1alpha3DeviceAllocationConfiguration();
        result.addConfigItem(config1);
        result.addConfigItem(config2);
        assertThat(result.getConfig(), hasSize(2));
        assertThat(result.getConfig(), containsInAnyOrder(config1, config2));
    }

    //BaseRock generated method id: ${testMultipleResultsItems}, hash: A2C0A62867738A96836C4B0710D57EA1
    @Test
    void testMultipleResultsItems() {
        V1alpha3DeviceAllocationResult result = new V1alpha3DeviceAllocationResult();
        V1alpha3DeviceRequestAllocationResult allocationResult1 = new V1alpha3DeviceRequestAllocationResult();
        V1alpha3DeviceRequestAllocationResult allocationResult2 = new V1alpha3DeviceRequestAllocationResult();
        result.addResultsItem(allocationResult1);
        result.addResultsItem(allocationResult2);
        assertThat(result.getResults(), hasSize(2));
        assertThat(result.getResults(), containsInAnyOrder(allocationResult1, allocationResult2));
    }

    //BaseRock generated method id: ${testConfigBuilderMethod}, hash: 7F635EE28184E4093806CE9BD94B4FBD
    @Test
    void testConfigBuilderMethod() {
        List<V1alpha3DeviceAllocationConfiguration> configList = Arrays.asList(new V1alpha3DeviceAllocationConfiguration(), new V1alpha3DeviceAllocationConfiguration());
        V1alpha3DeviceAllocationResult result = new V1alpha3DeviceAllocationResult().config(configList);
        assertThat(result.getConfig(), is(equalTo(configList)));
    }

    //BaseRock generated method id: ${testResultsBuilderMethod}, hash: DF20DD4BF7EBA7EBBF358A6E8A12DA75
    @Test
    void testResultsBuilderMethod() {
        List<V1alpha3DeviceRequestAllocationResult> resultsList = Arrays.asList(new V1alpha3DeviceRequestAllocationResult(), new V1alpha3DeviceRequestAllocationResult());
        V1alpha3DeviceAllocationResult result = new V1alpha3DeviceAllocationResult().results(resultsList);
        assertThat(result.getResults(), is(equalTo(resultsList)));
    }
}

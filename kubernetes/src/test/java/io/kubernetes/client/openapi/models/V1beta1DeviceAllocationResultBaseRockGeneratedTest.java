package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1beta1DeviceRequestAllocationResult;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1beta1DeviceAllocationConfiguration;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1DeviceAllocationResultBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 94B6A0B4A434F80F3BFAECF491BA47A3
    @Test
    void testConstructor() {
        V1beta1DeviceAllocationResult result = new V1beta1DeviceAllocationResult();
        assertThat(result, is(notNullValue()));
        assertThat(result.getConfig(), is(empty()));
        assertThat(result.getResults(), is(empty()));
    }

    //BaseRock generated method id: ${testSetAndGetConfig}, hash: A78A0C3E4C0D17FC752774D92F5FD8B4
    @Test
    void testSetAndGetConfig() {
        V1beta1DeviceAllocationResult result = new V1beta1DeviceAllocationResult();
        List<V1beta1DeviceAllocationConfiguration> config = new ArrayList<>();
        config.add(new V1beta1DeviceAllocationConfiguration());
        result.setConfig(config);
        assertThat(result.getConfig(), is(equalTo(config)));
    }

    //BaseRock generated method id: ${testSetAndGetResults}, hash: 3D42BB7351EBBB468B7DE2C7EFCD7892
    @Test
    void testSetAndGetResults() {
        V1beta1DeviceAllocationResult result = new V1beta1DeviceAllocationResult();
        List<V1beta1DeviceRequestAllocationResult> results = new ArrayList<>();
        results.add(new V1beta1DeviceRequestAllocationResult());
        result.setResults(results);
        assertThat(result.getResults(), is(equalTo(results)));
    }

    //BaseRock generated method id: ${testAddConfigItem}, hash: FED4A9AD68E6BBAB76CBDFDEF02F263C
    @Test
    void testAddConfigItem() {
        V1beta1DeviceAllocationResult result = new V1beta1DeviceAllocationResult();
        V1beta1DeviceAllocationConfiguration configItem = new V1beta1DeviceAllocationConfiguration();
        result.addConfigItem(configItem);
        assertThat(result.getConfig(), hasSize(1));
        assertThat(result.getConfig(), contains(configItem));
    }

    //BaseRock generated method id: ${testAddResultsItem}, hash: A91A85F7324ED5B9DE6AFA8C771DC4B0
    @Test
    void testAddResultsItem() {
        V1beta1DeviceAllocationResult result = new V1beta1DeviceAllocationResult();
        V1beta1DeviceRequestAllocationResult resultItem = new V1beta1DeviceRequestAllocationResult();
        result.addResultsItem(resultItem);
        assertThat(result.getResults(), hasSize(1));
        assertThat(result.getResults(), contains(resultItem));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 38ECEC7569C411859CDDD1C7600F4948
    @Test
    void testEqualsAndHashCode() {
        V1beta1DeviceAllocationResult result1 = new V1beta1DeviceAllocationResult();
        V1beta1DeviceAllocationResult result2 = new V1beta1DeviceAllocationResult();
        assertThat(result1.equals(result2), is(true));
        assertThat(result1.hashCode(), is(equalTo(result2.hashCode())));
        result1.addConfigItem(new V1beta1DeviceAllocationConfiguration());
        assertThat(result1.equals(result2), is(false));
        assertThat(result1.hashCode(), is(not(equalTo(result2.hashCode()))));
    }

    //BaseRock generated method id: ${testToString}, hash: B8297AA3F661A26DE4611CD0690149B0
    @Test
    void testToString() {
        V1beta1DeviceAllocationResult result = new V1beta1DeviceAllocationResult();
        String toString = result.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString, containsString("V1beta1DeviceAllocationResult"));
        assertThat(toString, containsString("config"));
        assertThat(toString, containsString("results"));
    }

    //BaseRock generated method id: ${testSetNullConfig}, hash: 13BD90D70F4B80488B66C12CBB801BD3
    @Test
    void testSetNullConfig() {
        V1beta1DeviceAllocationResult result = new V1beta1DeviceAllocationResult();
        result.setConfig(null);
        assertThat(result.getConfig(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetNullResults}, hash: 0263E1BD2C1B41F563092B20990D6BFF
    @Test
    void testSetNullResults() {
        V1beta1DeviceAllocationResult result = new V1beta1DeviceAllocationResult();
        result.setResults(null);
        assertThat(result.getResults(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAddConfigItemToNullConfig}, hash: D970DF32768C4C7550F6DE5377F1B7F3
    @Test
    void testAddConfigItemToNullConfig() {
        V1beta1DeviceAllocationResult result = new V1beta1DeviceAllocationResult();
        result.setConfig(null);
        V1beta1DeviceAllocationConfiguration configItem = new V1beta1DeviceAllocationConfiguration();
        result.addConfigItem(configItem);
        assertThat(result.getConfig(), hasSize(1));
        assertThat(result.getConfig(), contains(configItem));
    }

    //BaseRock generated method id: ${testAddResultsItemToNullResults}, hash: 3C429715CE6BA9F29D4FB7AB00BB67E0
    @Test
    void testAddResultsItemToNullResults() {
        V1beta1DeviceAllocationResult result = new V1beta1DeviceAllocationResult();
        result.setResults(null);
        V1beta1DeviceRequestAllocationResult resultItem = new V1beta1DeviceRequestAllocationResult();
        result.addResultsItem(resultItem);
        assertThat(result.getResults(), hasSize(1));
        assertThat(result.getResults(), contains(resultItem));
    }
}

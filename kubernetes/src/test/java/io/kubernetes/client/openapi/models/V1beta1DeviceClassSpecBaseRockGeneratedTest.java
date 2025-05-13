package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1beta1DeviceClassConfiguration;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1beta1DeviceClassSpec;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1beta1DeviceSelector;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1DeviceClassSpecBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1beta1DeviceClassSpecConstructor}, hash: 4F580AABEFD302E1CF0681AEA0C7E484
    @Test
    void testV1beta1DeviceClassSpecConstructor() {
        V1beta1DeviceClassSpec spec = new V1beta1DeviceClassSpec();
        assertNotNull(spec);
    }

    //BaseRock generated method id: ${testConfigGetter}, hash: 9ED9BC0BDE73AD96A4E830C8A075F1CD
    @Test
    void testConfigGetter() {
        V1beta1DeviceClassSpec spec = new V1beta1DeviceClassSpec();
        List<V1beta1DeviceClassConfiguration> config = spec.getConfig();
        assertNotNull(config);
        assertEquals(0, config.size());
    }

    //BaseRock generated method id: ${testConfigSetter}, hash: 2E9BEAD2A1830519EE3A86590CA141F3
    @Test
    void testConfigSetter() {
        V1beta1DeviceClassSpec spec = new V1beta1DeviceClassSpec();
        List<V1beta1DeviceClassConfiguration> config = new ArrayList<>();
        config.add(new V1beta1DeviceClassConfiguration());
        spec.setConfig(config);
        assertEquals(1, spec.getConfig().size());
    }

    //BaseRock generated method id: ${testConfigFluentSetter}, hash: 0E0BC1A18D4F6F77FFC2A297DD2814C9
    @Test
    void testConfigFluentSetter() {
        V1beta1DeviceClassSpec spec = new V1beta1DeviceClassSpec();
        List<V1beta1DeviceClassConfiguration> config = new ArrayList<>();
        config.add(new V1beta1DeviceClassConfiguration());
        V1beta1DeviceClassSpec result = spec.config(config);
        assertThat(result, is(spec));
        assertThat(result.getConfig(), hasSize(1));
    }

    //BaseRock generated method id: ${testAddConfigItem}, hash: A2FF938B72AB46F84A64A3605D4B8CD7
    @Test
    void testAddConfigItem() {
        V1beta1DeviceClassSpec spec = new V1beta1DeviceClassSpec();
        V1beta1DeviceClassConfiguration configItem = new V1beta1DeviceClassConfiguration();
        spec.addConfigItem(configItem);
        assertThat(spec.getConfig(), contains(configItem));
    }

    //BaseRock generated method id: ${testSelectorsGetter}, hash: 02A3FE32C87C94F548577EA6D7B2548A
    @Test
    void testSelectorsGetter() {
        V1beta1DeviceClassSpec spec = new V1beta1DeviceClassSpec();
        List<V1beta1DeviceSelector> selectors = spec.getSelectors();
        assertNotNull(selectors);
        assertEquals(0, selectors.size());
    }

    //BaseRock generated method id: ${testSelectorsSetter}, hash: E0112153DDCF549CBE0163CE0A1F3457
    @Test
    void testSelectorsSetter() {
        V1beta1DeviceClassSpec spec = new V1beta1DeviceClassSpec();
        List<V1beta1DeviceSelector> selectors = new ArrayList<>();
        selectors.add(new V1beta1DeviceSelector());
        spec.setSelectors(selectors);
        assertEquals(1, spec.getSelectors().size());
    }

    //BaseRock generated method id: ${testSelectorsFluentSetter}, hash: 9EA79C2616B9ECB5BED8FBDD92EDA705
    @Test
    void testSelectorsFluentSetter() {
        V1beta1DeviceClassSpec spec = new V1beta1DeviceClassSpec();
        List<V1beta1DeviceSelector> selectors = new ArrayList<>();
        selectors.add(new V1beta1DeviceSelector());
        V1beta1DeviceClassSpec result = spec.selectors(selectors);
        assertThat(result, is(spec));
        assertThat(result.getSelectors(), hasSize(1));
    }

    //BaseRock generated method id: ${testAddSelectorsItem}, hash: 99C9948B621CDA087874C0183255C534
    @Test
    void testAddSelectorsItem() {
        V1beta1DeviceClassSpec spec = new V1beta1DeviceClassSpec();
        V1beta1DeviceSelector selectorItem = new V1beta1DeviceSelector();
        spec.addSelectorsItem(selectorItem);
        assertThat(spec.getSelectors(), contains(selectorItem));
    }

    //BaseRock generated method id: ${testEquals}, hash: 1C964FB999F7A7AF9F176BC204EA87C8
    @Test
    void testEquals() {
        V1beta1DeviceClassSpec spec1 = new V1beta1DeviceClassSpec();
        V1beta1DeviceClassSpec spec2 = new V1beta1DeviceClassSpec();
        assertEquals(spec1, spec2);
        List<V1beta1DeviceClassConfiguration> config = new ArrayList<>();
        config.add(new V1beta1DeviceClassConfiguration());
        spec1.setConfig(config);
        assertNotNull(spec1.equals(spec2));
        spec2.setConfig(config);
        assertEquals(spec1, spec2);
        List<V1beta1DeviceSelector> selectors = new ArrayList<>();
        selectors.add(new V1beta1DeviceSelector());
        spec1.setSelectors(selectors);
        assertNotNull(spec1.equals(spec2));
        spec2.setSelectors(selectors);
        assertEquals(spec1, spec2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 63E64C9ADF91E8168619BF0E2697E282
    @Test
    void testHashCode() {
        V1beta1DeviceClassSpec spec1 = new V1beta1DeviceClassSpec();
        V1beta1DeviceClassSpec spec2 = new V1beta1DeviceClassSpec();
        assertEquals(spec1.hashCode(), spec2.hashCode());
        List<V1beta1DeviceClassConfiguration> config = new ArrayList<>();
        config.add(new V1beta1DeviceClassConfiguration());
        spec1.setConfig(config);
        assertNotNull(spec1.hashCode() == spec2.hashCode());
        spec2.setConfig(config);
        assertEquals(spec1.hashCode(), spec2.hashCode());
        List<V1beta1DeviceSelector> selectors = new ArrayList<>();
        selectors.add(new V1beta1DeviceSelector());
        spec1.setSelectors(selectors);
        assertNotNull(spec1.hashCode() == spec2.hashCode());
        spec2.setSelectors(selectors);
        assertEquals(spec1.hashCode(), spec2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 8AF9D3519FF2599B883552251186C4CF
    @Test
    void testToString() {
        V1beta1DeviceClassSpec spec = new V1beta1DeviceClassSpec();
        String result = spec.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("class V1beta1DeviceClassSpec"), is(true));
        assertThat(result.contains("config"), is(true));
        assertThat(result.contains("selectors"), is(true));
    }
}

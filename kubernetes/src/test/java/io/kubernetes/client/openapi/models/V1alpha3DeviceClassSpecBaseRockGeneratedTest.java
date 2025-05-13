package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V1alpha3DeviceClassConfiguration;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.V1alpha3DeviceSelector;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3DeviceClassSpecBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 1F41C6C2175DEB8311FAAE69A269547A
    @Test
    void testConstructor() {
        V1alpha3DeviceClassSpec spec = new V1alpha3DeviceClassSpec();
        assertNotNull(spec);
        assertNotNull(spec.getConfig());
        assertNotNull(spec.getSelectors());
        assertTrue(spec.getConfig().isEmpty());
        assertTrue(spec.getSelectors().isEmpty());
    }

    //BaseRock generated method id: ${testSetAndGetConfig}, hash: AEF4A520C4DAA4B8E5582BBC84667B92
    @Test
    void testSetAndGetConfig() {
        V1alpha3DeviceClassSpec spec = new V1alpha3DeviceClassSpec();
        List<V1alpha3DeviceClassConfiguration> config = new ArrayList<>();
        V1alpha3DeviceClassConfiguration configuration = mock(V1alpha3DeviceClassConfiguration.class);
        config.add(configuration);
        spec.setConfig(config);
        assertThat(spec.getConfig(), is(notNullValue()));
        assertThat(spec.getConfig(), hasSize(1));
        assertThat(spec.getConfig().get(0), is(equalTo(configuration)));
    }

    //BaseRock generated method id: ${testAddConfigItem}, hash: 9D809348DF8E04CB7A1BD89AD8DB08F7
    @Test
    void testAddConfigItem() {
        V1alpha3DeviceClassSpec spec = new V1alpha3DeviceClassSpec();
        V1alpha3DeviceClassConfiguration configuration = mock(V1alpha3DeviceClassConfiguration.class);
        spec.addConfigItem(configuration);
        assertThat(spec.getConfig(), is(notNullValue()));
        assertThat(spec.getConfig(), hasSize(1));
        assertThat(spec.getConfig().get(0), is(equalTo(configuration)));
    }

    //BaseRock generated method id: ${testSetAndGetSelectors}, hash: B29E06A364858C6E391F3CE3D227D78B
    @Test
    void testSetAndGetSelectors() {
        V1alpha3DeviceClassSpec spec = new V1alpha3DeviceClassSpec();
        List<V1alpha3DeviceSelector> selectors = new ArrayList<>();
        V1alpha3DeviceSelector selector = mock(V1alpha3DeviceSelector.class);
        selectors.add(selector);
        spec.setSelectors(selectors);
        assertThat(spec.getSelectors(), is(notNullValue()));
        assertThat(spec.getSelectors(), hasSize(1));
        assertThat(spec.getSelectors().get(0), is(equalTo(selector)));
    }

    //BaseRock generated method id: ${testAddSelectorsItem}, hash: EE006AC70F2F228973ECA13331DA8918
    @Test
    void testAddSelectorsItem() {
        V1alpha3DeviceClassSpec spec = new V1alpha3DeviceClassSpec();
        V1alpha3DeviceSelector selector = mock(V1alpha3DeviceSelector.class);
        spec.addSelectorsItem(selector);
        assertThat(spec.getSelectors(), is(notNullValue()));
        assertThat(spec.getSelectors(), hasSize(1));
        assertThat(spec.getSelectors().get(0), is(equalTo(selector)));
    }

    //BaseRock generated method id: ${testEquals}, hash: A0FDAF90DDE306D3029D9C826737960D
    @Test
    void testEquals() {
        V1alpha3DeviceClassSpec spec1 = new V1alpha3DeviceClassSpec();
        V1alpha3DeviceClassSpec spec2 = new V1alpha3DeviceClassSpec();
        assertTrue(spec1.equals(spec2));
        assertTrue(spec2.equals(spec1));
        V1alpha3DeviceClassConfiguration config = mock(V1alpha3DeviceClassConfiguration.class);
        spec1.addConfigItem(config);
        assertFalse(spec1.equals(spec2));
        assertFalse(spec2.equals(spec1));
        spec2.addConfigItem(config);
        assertTrue(spec1.equals(spec2));
        assertTrue(spec2.equals(spec1));
        V1alpha3DeviceSelector selector = mock(V1alpha3DeviceSelector.class);
        spec1.addSelectorsItem(selector);
        assertFalse(spec1.equals(spec2));
        assertFalse(spec2.equals(spec1));
        spec2.addSelectorsItem(selector);
        assertTrue(spec1.equals(spec2));
        assertTrue(spec2.equals(spec1));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 597B4E6CEF1E0CBFB6C7781E46DA508A
    @Test
    void testHashCode() {
        V1alpha3DeviceClassSpec spec1 = new V1alpha3DeviceClassSpec();
        V1alpha3DeviceClassSpec spec2 = new V1alpha3DeviceClassSpec();
        assertEquals(spec1.hashCode(), spec2.hashCode());
        V1alpha3DeviceClassConfiguration config = mock(V1alpha3DeviceClassConfiguration.class);
        spec1.addConfigItem(config);
        spec2.addConfigItem(config);
        assertEquals(spec1.hashCode(), spec2.hashCode());
        V1alpha3DeviceSelector selector = mock(V1alpha3DeviceSelector.class);
        spec1.addSelectorsItem(selector);
        spec2.addSelectorsItem(selector);
        assertEquals(spec1.hashCode(), spec2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: A5CE5531DFEA999BB599B4D671FA05BD
    @Test
    void testToString() {
        V1alpha3DeviceClassSpec spec = new V1alpha3DeviceClassSpec();
        V1alpha3DeviceClassConfiguration config = mock(V1alpha3DeviceClassConfiguration.class);
        V1alpha3DeviceSelector selector = mock(V1alpha3DeviceSelector.class);
        spec.addConfigItem(config);
        spec.addSelectorsItem(selector);
        String result = spec.toString();
        assertThat(result, notNullValue());
        assertTrue(result.contains("config"));
        assertTrue(result.contains("selectors"));
    }

    //BaseRock generated method id: ${testToIndentedString}, hash: 3148BC036737BC808E814F544EDC80CA
    @Test
    void testToIndentedString() {
        V1alpha3DeviceClassSpec spec = new V1alpha3DeviceClassSpec();
        V1alpha3DeviceClassConfiguration config = mock(V1alpha3DeviceClassConfiguration.class);
        V1alpha3DeviceSelector selector = mock(V1alpha3DeviceSelector.class);
        when(config.toString()).thenReturn("MockConfig");
        when(selector.toString()).thenReturn("MockSelector");
        spec.addConfigItem(config);
        spec.addSelectorsItem(selector);
        String result = spec.toString();
        assertThat(result, notNullValue());
        assertTrue(result.contains("config: [MockConfig]"));
        assertTrue(result.contains("selectors: [MockSelector]"));
    }

    //BaseRock generated method id: ${testOpenapiFields}, hash: 63131A8D4BEE38BECCA9CD874AF30980
    @Test
    void testOpenapiFields() {
        assertThat(V1alpha3DeviceClassSpec.openapiFields, notNullValue());
        assertThat(V1alpha3DeviceClassSpec.openapiFields, containsInAnyOrder("config", "selectors"));
    }

    //BaseRock generated method id: ${testOpenapiRequiredFields}, hash: 571466316AECDC770129CE11C4CD968F
    @Test
    void testOpenapiRequiredFields() {
        assertThat(V1alpha3DeviceClassSpec.openapiRequiredFields, notNullValue());
        assertTrue(V1alpha3DeviceClassSpec.openapiRequiredFields.isEmpty());
    }
}

package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.Arrays;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.models.V1PodAffinityTerm;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PodAffinityTermBaseRockGeneratedTest {

    private V1PodAffinityTerm podAffinityTerm;

    @BeforeEach
    void setUp() {
        podAffinityTerm = new V1PodAffinityTerm();
    }

    //BaseRock generated method id: ${testConstructor}, hash: E1C8B84E620061B815377669587EE034
    @Test
    void testConstructor() {
        assertNotNull(podAffinityTerm);
    }

    //BaseRock generated method id: ${testLabelSelector}, hash: BD25F3717FD3A5FE92F1A0F38E3C5D08
    @Test
    void testLabelSelector() {
        V1LabelSelector labelSelector = mock(V1LabelSelector.class);
        podAffinityTerm.setLabelSelector(labelSelector);
        assertEquals(labelSelector, podAffinityTerm.getLabelSelector());
    }

    //BaseRock generated method id: ${testMatchLabelKeys}, hash: 31BDE91721A4F499D160599EEF607B42
    @Test
    void testMatchLabelKeys() {
        List<String> matchLabelKeys = Arrays.asList("key1", "key2");
        podAffinityTerm.setMatchLabelKeys(matchLabelKeys);
        assertThat(podAffinityTerm.getMatchLabelKeys(), is(equalTo(matchLabelKeys)));
    }

    //BaseRock generated method id: ${testAddMatchLabelKeysItem}, hash: F3AFD894D15378C493CC2462C4CB9AA6
    @Test
    void testAddMatchLabelKeysItem() {
        String matchLabelKey = "newKey";
        podAffinityTerm.addMatchLabelKeysItem(matchLabelKey);
        assertThat(podAffinityTerm.getMatchLabelKeys(), hasSize(1));
        assertThat(podAffinityTerm.getMatchLabelKeys().get(0), is(equalTo(matchLabelKey)));
    }

    //BaseRock generated method id: ${testMismatchLabelKeys}, hash: 9C7BAF297FD7664F53FE22D2F2A9F541
    @Test
    void testMismatchLabelKeys() {
        List<String> mismatchLabelKeys = Arrays.asList("key3", "key4");
        podAffinityTerm.setMismatchLabelKeys(mismatchLabelKeys);
        assertThat(podAffinityTerm.getMismatchLabelKeys(), is(equalTo(mismatchLabelKeys)));
    }

    //BaseRock generated method id: ${testAddMismatchLabelKeysItem}, hash: CF708707BE89B424FD092526307A6AF1
    @Test
    void testAddMismatchLabelKeysItem() {
        String mismatchLabelKey = "newMismatchKey";
        podAffinityTerm.addMismatchLabelKeysItem(mismatchLabelKey);
        assertThat(podAffinityTerm.getMismatchLabelKeys(), hasSize(1));
        assertThat(podAffinityTerm.getMismatchLabelKeys().get(0), is(equalTo(mismatchLabelKey)));
    }

    //BaseRock generated method id: ${testNamespaceSelector}, hash: CAE9F949123F520849C7E06155555EBF
    @Test
    void testNamespaceSelector() {
        V1LabelSelector namespaceSelector = mock(V1LabelSelector.class);
        podAffinityTerm.setNamespaceSelector(namespaceSelector);
        assertEquals(namespaceSelector, podAffinityTerm.getNamespaceSelector());
    }

    //BaseRock generated method id: ${testNamespaces}, hash: 005D30EFCE17F857BC16EBA23378F5FA
    @Test
    void testNamespaces() {
        List<String> namespaces = Arrays.asList("namespace1", "namespace2");
        podAffinityTerm.setNamespaces(namespaces);
        assertThat(podAffinityTerm.getNamespaces(), is(equalTo(namespaces)));
    }

    //BaseRock generated method id: ${testAddNamespacesItem}, hash: D8176F8F373D9A516C51E144AA15FD87
    @Test
    void testAddNamespacesItem() {
        String namespace = "newNamespace";
        podAffinityTerm.addNamespacesItem(namespace);
        assertThat(podAffinityTerm.getNamespaces(), hasSize(1));
        assertThat(podAffinityTerm.getNamespaces().get(0), is(equalTo(namespace)));
    }

    //BaseRock generated method id: ${testTopologyKey}, hash: 116B9717A083265D060D4024072C20EA
    @Test
    void testTopologyKey() {
        String topologyKey = "zone";
        podAffinityTerm.setTopologyKey(topologyKey);
        assertEquals(topologyKey, podAffinityTerm.getTopologyKey());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 6A4BC6F90C643A91E56BD94AC76CF411
    @Test
    void testEqualsAndHashCode() {
        V1PodAffinityTerm term1 = new V1PodAffinityTerm().labelSelector(new V1LabelSelector()).matchLabelKeys(Arrays.asList("key1")).mismatchLabelKeys(Arrays.asList("key2")).namespaceSelector(new V1LabelSelector()).namespaces(Arrays.asList("namespace1")).topologyKey("zone");
        V1PodAffinityTerm term2 = new V1PodAffinityTerm().labelSelector(new V1LabelSelector()).matchLabelKeys(Arrays.asList("key1")).mismatchLabelKeys(Arrays.asList("key2")).namespaceSelector(new V1LabelSelector()).namespaces(Arrays.asList("namespace1")).topologyKey("zone");
        assertThat(term1, is(equalTo(term2)));
        assertThat(term1.hashCode(), is(equalTo(term2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 5C643768CA6C0623E2260860525AD651
    @Test
    void testToString() {
        V1PodAffinityTerm term = new V1PodAffinityTerm().labelSelector(new V1LabelSelector()).matchLabelKeys(Arrays.asList("key1")).mismatchLabelKeys(Arrays.asList("key2")).namespaceSelector(new V1LabelSelector()).namespaces(Arrays.asList("namespace1")).topologyKey("zone");
        String expectedString = "class V1PodAffinityTerm {\n" + "    labelSelector: class V1LabelSelector {\n" + "        matchExpressions: []\n" + "        matchLabels: {}\n" + "    }\n" + "    matchLabelKeys: [key1]\n" + "    mismatchLabelKeys: [key2]\n" + "    namespaceSelector: class V1LabelSelector {\n" + "        matchExpressions: []\n" + "        matchLabels: {}\n" + "    }\n" + "    namespaces: [namespace1]\n" + "    topologyKey: zone\n" + "}";
        assertThat(term.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testTopologyKeyValidation}, hash: 43CA3C3C020BAE2A6461F41E4C546FF0
    @ParameterizedTest
    @ValueSource(strings = { "", " ", "validKey" })
    void testTopologyKeyValidation(String key) {
        V1PodAffinityTerm term = new V1PodAffinityTerm().topologyKey(key);
        assertThat(term.getTopologyKey(), is(equalTo(key)));
    }

    //BaseRock generated method id: ${testNullTopologyKey}, hash: 589180902DB85B8B22E170CC062B55A0
    @Test
    void testNullTopologyKey() {
        assertThat(new V1PodAffinityTerm().topologyKey(null).getTopologyKey(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEmptyMatchLabelKeys}, hash: F4F2CA78BCA25B83952A2DD7DAF9DD9A
    @Test
    void testEmptyMatchLabelKeys() {
        V1PodAffinityTerm term = new V1PodAffinityTerm().matchLabelKeys(new ArrayList<>());
        assertThat(term.getMatchLabelKeys(), is(notNullValue()));
        assertThat(term.getMatchLabelKeys(), hasSize(0));
    }

    //BaseRock generated method id: ${testEmptyMismatchLabelKeys}, hash: 88F875EEFB653C26D9A5A1FA9040F7F9
    @Test
    void testEmptyMismatchLabelKeys() {
        V1PodAffinityTerm term = new V1PodAffinityTerm().mismatchLabelKeys(new ArrayList<>());
        assertThat(term.getMismatchLabelKeys(), is(notNullValue()));
        assertThat(term.getMismatchLabelKeys(), hasSize(0));
    }

    //BaseRock generated method id: ${testEmptyNamespaces}, hash: 30E5362C13FE28A813B923E9693884CA
    @Test
    void testEmptyNamespaces() {
        V1PodAffinityTerm term = new V1PodAffinityTerm().namespaces(new ArrayList<>());
        assertThat(term.getNamespaces(), is(notNullValue()));
        assertThat(term.getNamespaces(), hasSize(0));
    }

    //BaseRock generated method id: ${testNullLabelSelector}, hash: BA751FFE6D26A5DD22789FFB7F96AF60
    @Test
    void testNullLabelSelector() {
        V1PodAffinityTerm term = new V1PodAffinityTerm().labelSelector(null);
        assertThat(term.getLabelSelector(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNullNamespaceSelector}, hash: AB71C9BCCAA56FB23D68762781C74D66
    @Test
    void testNullNamespaceSelector() {
        V1PodAffinityTerm term = new V1PodAffinityTerm().namespaceSelector(null);
        assertThat(term.getNamespaceSelector(), is(nullValue()));
    }
}

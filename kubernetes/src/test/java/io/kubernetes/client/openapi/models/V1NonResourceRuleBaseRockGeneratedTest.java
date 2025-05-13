package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1NonResourceRuleBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 5A71546FBF5C7EF9DECFF622D3DA6C20
    @Test
    void testConstructor() {
        V1NonResourceRule rule = new V1NonResourceRule();
        assertNotNull(rule);
    }

    //BaseRock generated method id: ${testNonResourceURLs}, hash: BCF5E30855DDA6BF60D14ACEA74AADDF
    @Test
    void testNonResourceURLs() {
        V1NonResourceRule rule = new V1NonResourceRule();
        List<String> urls = new ArrayList<>();
        urls.add("test-url");
        rule.setNonResourceURLs(urls);
        assertEquals(urls, rule.getNonResourceURLs());
    }

    //BaseRock generated method id: ${testAddNonResourceURLsItem}, hash: 73DAB021887B58D2C77B3DD426509683
    @Test
    void testAddNonResourceURLsItem() {
        V1NonResourceRule rule = new V1NonResourceRule();
        String url = "test-url";
        rule.addNonResourceURLsItem(url);
        assertTrue(rule.getNonResourceURLs().contains(url));
    }

    //BaseRock generated method id: ${testVerbs}, hash: FB2DF54607B131364B7986761AE5AEB2
    @Test
    void testVerbs() {
        V1NonResourceRule rule = new V1NonResourceRule();
        List<String> verbs = new ArrayList<>();
        verbs.add("get");
        verbs.add("post");
        rule.setVerbs(verbs);
        assertEquals(verbs, rule.getVerbs());
    }

    //BaseRock generated method id: ${testAddVerbsItem}, hash: A38234AD9B781E2366CAD6425E8B28FA
    @Test
    void testAddVerbsItem() {
        V1NonResourceRule rule = new V1NonResourceRule();
        String verb = "get";
        rule.addVerbsItem(verb);
        assertTrue(rule.getVerbs().contains(verb));
    }

    //BaseRock generated method id: ${testEquals}, hash: DD67133D7B69077458BB0D4A7927E31B
    @Test
    void testEquals() {
        V1NonResourceRule rule1 = new V1NonResourceRule().nonResourceURLs(List.of("url1", "url2")).verbs(List.of("get", "post"));
        V1NonResourceRule rule2 = new V1NonResourceRule().nonResourceURLs(List.of("url1", "url2")).verbs(List.of("get", "post"));
        V1NonResourceRule rule3 = new V1NonResourceRule().nonResourceURLs(List.of("url3")).verbs(List.of("delete"));
        assertTrue(rule1.equals(rule2));
        assertFalse(rule1.equals(rule3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 919629F09EA64255A6879B1167B6D0BF
    @Test
    void testHashCode() {
        V1NonResourceRule rule1 = new V1NonResourceRule().nonResourceURLs(List.of("url1", "url2")).verbs(List.of("get", "post"));
        V1NonResourceRule rule2 = new V1NonResourceRule().nonResourceURLs(List.of("url1", "url2")).verbs(List.of("get", "post"));
        assertEquals(rule1.hashCode(), rule2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 74C20D6232D671970B6ABA2598D6DBDB
    @Test
    void testToString() {
        V1NonResourceRule rule = new V1NonResourceRule().nonResourceURLs(List.of("url1", "url2")).verbs(List.of("get", "post"));
        String expected = "class V1NonResourceRule {\n    nonResourceURLs: [url1, url2]\n    verbs: [get, post]\n}";
        assertEquals(expected, rule.toString());
    }

    //BaseRock generated method id: ${testNonResourceURLsWithDifferentInputs}, hash: E5220F6D933898F5A84D0DC53DC9B083
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "url1", "url1,url2" })
    void testNonResourceURLsWithDifferentInputs(String input) {
        V1NonResourceRule rule = new V1NonResourceRule();
        if (input != null) {
            rule.setNonResourceURLs(List.of(input.split(",")));
        }
        assertNotNull(rule.getNonResourceURLs());
    }

    //BaseRock generated method id: ${testVerbsWithDifferentInputs}, hash: 464793FBD76C5A6C2538583A8080F949
    @ParameterizedTest
    @ValueSource(strings = { "get", "post,put,delete" })
    void testVerbsWithDifferentInputs(String input) {
        V1NonResourceRule rule = new V1NonResourceRule();
        rule.setVerbs(List.of(input.split(",")));
        assertFalse(rule.getVerbs().isEmpty());
    }

    //BaseRock generated method id: ${testNonResourceURLsNull}, hash: BF27644842C8BAE5E8877177E2AE0ECB
    @Test
    void testNonResourceURLsNull() {
        V1NonResourceRule rule = new V1NonResourceRule();
        rule.setNonResourceURLs(null);
        assertNull(rule.getNonResourceURLs());
    }

    //BaseRock generated method id: ${testVerbsNull}, hash: D3DD16EADDD5D3BA78D36BBDCE5D2E06
    @Test
    void testVerbsNull() {
        V1NonResourceRule rule = new V1NonResourceRule();
        assertDoesNotThrow(() -> rule.setVerbs(null));
        assertNull(rule.getVerbs());
    }
}

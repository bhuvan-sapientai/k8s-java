package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1NonResourcePolicyRule;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1NonResourcePolicyRuleBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1NonResourcePolicyRuleConstructor}, hash: 4DC71BF2B6628FA8DBF3D0C99D4243F2
    @Test
    void testV1NonResourcePolicyRuleConstructor() {
        V1NonResourcePolicyRule rule = new V1NonResourcePolicyRule();
        assertThat(rule, is(notNullValue()));
        assertThat(rule.getNonResourceURLs(), is(empty()));
        assertThat(rule.getVerbs(), is(empty()));
    }

    //BaseRock generated method id: ${testNonResourceURLs}, hash: 05AE3987C7B979FC28E25A03CDA222AF
    @Test
    void testNonResourceURLs() {
        V1NonResourcePolicyRule rule = new V1NonResourcePolicyRule();
        List<String> urls = Arrays.asList("/healthz", "/metrics");
        rule.setNonResourceURLs(urls);
        assertThat(rule.getNonResourceURLs(), is(equalTo(urls)));
    }

    //BaseRock generated method id: ${testVerbs}, hash: 1505DA0985EABCD01FA676DB976B749D
    @Test
    void testVerbs() {
        V1NonResourcePolicyRule rule = new V1NonResourcePolicyRule();
        List<String> verbs = Arrays.asList("get", "post");
        rule.setVerbs(verbs);
        assertThat(rule.getVerbs(), is(equalTo(verbs)));
    }

    //BaseRock generated method id: ${testAddNonResourceURLsItem}, hash: 0E8DFE819E598995E13BC31FC5FE582E
    @Test
    void testAddNonResourceURLsItem() {
        V1NonResourcePolicyRule rule = new V1NonResourcePolicyRule();
        rule.addNonResourceURLsItem("/healthz");
        assertThat(rule.getNonResourceURLs(), contains("/healthz"));
    }

    //BaseRock generated method id: ${testAddVerbsItem}, hash: 80705051468DA6261BFB6C5FD9AD656B
    @Test
    void testAddVerbsItem() {
        V1NonResourcePolicyRule rule = new V1NonResourcePolicyRule();
        rule.addVerbsItem("get");
        assertThat(rule.getVerbs(), contains("get"));
    }

    //BaseRock generated method id: ${testNonResourceURLsFluentInterface}, hash: AA8A18D6C62D8EFCD029C582BE6C972B
    @Test
    void testNonResourceURLsFluentInterface() {
        V1NonResourcePolicyRule rule = new V1NonResourcePolicyRule().nonResourceURLs(Arrays.asList("/healthz", "/metrics"));
        assertThat(rule.getNonResourceURLs(), contains("/healthz", "/metrics"));
    }

    //BaseRock generated method id: ${testVerbsFluentInterface}, hash: BF29F00E5666E7A2086A42C0A731C36D
    @Test
    void testVerbsFluentInterface() {
        V1NonResourcePolicyRule rule = new V1NonResourcePolicyRule().verbs(Arrays.asList("get", "post"));
        assertThat(rule.getVerbs(), contains("get", "post"));
    }

    //BaseRock generated method id: ${testEquals}, hash: 8C7233280A269CB85611B67DCDA27150
    @Test
    void testEquals() {
        V1NonResourcePolicyRule rule1 = new V1NonResourcePolicyRule().nonResourceURLs(Arrays.asList("/healthz")).verbs(Arrays.asList("get"));
        V1NonResourcePolicyRule rule2 = new V1NonResourcePolicyRule().nonResourceURLs(Arrays.asList("/healthz")).verbs(Arrays.asList("get"));
        V1NonResourcePolicyRule rule3 = new V1NonResourcePolicyRule().nonResourceURLs(Arrays.asList("/metrics")).verbs(Arrays.asList("post"));
        assertThat(rule1.equals(rule2), is(true));
        assertThat(rule1.equals(rule3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 57DA08F80D9B08D982828C6CA36E9603
    @Test
    void testHashCode() {
        V1NonResourcePolicyRule rule1 = new V1NonResourcePolicyRule().nonResourceURLs(Arrays.asList("/healthz")).verbs(Arrays.asList("get"));
        V1NonResourcePolicyRule rule2 = new V1NonResourcePolicyRule().nonResourceURLs(Arrays.asList("/healthz")).verbs(Arrays.asList("get"));
        assertThat(rule1.hashCode(), is(equalTo(rule2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: A73DF9A090FDF2B9A5A263479F061D55
    @Test
    void testToString() {
        V1NonResourcePolicyRule rule = new V1NonResourcePolicyRule().nonResourceURLs(Arrays.asList("/healthz")).verbs(Arrays.asList("get"));
        String expectedString = "class V1NonResourcePolicyRule {\n    nonResourceURLs: [/healthz]\n    verbs: [get]\n}";
        assertThat(rule.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testMultipleNonResourceURLs}, hash: 5260D67B24A81A2411CA2F8E35998AD2
    @ParameterizedTest
    @ValueSource(strings = { "/healthz", "/metrics", "/readiness" })
    void testMultipleNonResourceURLs(String url) {
        V1NonResourcePolicyRule rule = new V1NonResourcePolicyRule();
        rule.addNonResourceURLsItem(url);
        assertThat(rule.getNonResourceURLs(), contains(url));
    }

    //BaseRock generated method id: ${testMultipleVerbs}, hash: 32FCDBC4D34EFD6C778E4B68D64B7B49
    @ParameterizedTest
    @ValueSource(strings = { "get", "post", "put", "delete" })
    void testMultipleVerbs(String verb) {
        V1NonResourcePolicyRule rule = new V1NonResourcePolicyRule();
        rule.addVerbsItem(verb);
        assertThat(rule.getVerbs(), contains(verb));
    }

    //BaseRock generated method id: ${testNullNonResourceURLs}, hash: 70D0F1CE527605EB1C119893C6F50C30
    @Disabled()
    @Test
    void testNullNonResourceURLs() {
        V1NonResourcePolicyRule rule = new V1NonResourcePolicyRule();
        rule.setNonResourceURLs(null);
        assertThat(rule.getNonResourceURLs(), is(notNullValue()));
        assertThat(rule.getNonResourceURLs(), is(empty()));
    }

    //BaseRock generated method id: ${testNullVerbs}, hash: 17F1F06C3E43BD5A6407ABF1CF6EAD6B
    @Disabled()
    @Test
    void testNullVerbs() {
        V1NonResourcePolicyRule rule = new V1NonResourcePolicyRule();
        rule.setVerbs(null);
        assertThat(rule.getVerbs(), is(notNullValue()));
        assertThat(rule.getVerbs(), is(empty()));
    }

    //BaseRock generated method id: ${testEmptyNonResourceURLs}, hash: DA74822F2770034B6EC844C17D70E3D7
    @Test
    void testEmptyNonResourceURLs() {
        V1NonResourcePolicyRule rule = new V1NonResourcePolicyRule();
        rule.setNonResourceURLs(new ArrayList<>());
        assertThat(rule.getNonResourceURLs(), is(empty()));
    }

    //BaseRock generated method id: ${testEmptyVerbs}, hash: BCA6DD675DDDE1142D1295F64B6D3D1E
    @Test
    void testEmptyVerbs() {
        V1NonResourcePolicyRule rule = new V1NonResourcePolicyRule();
        rule.setVerbs(new ArrayList<>());
        assertThat(rule.getVerbs(), is(empty()));
    }

    //BaseRock generated method id: ${testLargeNumberOfNonResourceURLs}, hash: E0F6A69779D59D96D759C484026D91D1
    @Test
    void testLargeNumberOfNonResourceURLs() {
        V1NonResourcePolicyRule rule = new V1NonResourcePolicyRule();
        List<String> urls = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            urls.add("/url" + i);
        }
        rule.setNonResourceURLs(urls);
        assertThat(rule.getNonResourceURLs(), hasSize(1000));
    }

    //BaseRock generated method id: ${testLargeNumberOfVerbs}, hash: 6F8A8CE5071987C5119548B5CCCF12D9
    @Test
    void testLargeNumberOfVerbs() {
        V1NonResourcePolicyRule rule = new V1NonResourcePolicyRule();
        List<String> verbs = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            verbs.add("verb" + i);
        }
        rule.setVerbs(verbs);
        assertThat(rule.getVerbs(), hasSize(1000));
    }

    //BaseRock generated method id: ${testNonResourceURLsWithSpecialCharacters}, hash: DF3CB90A6186B0CE2B755C8ED6131DE6
    @Test
    void testNonResourceURLsWithSpecialCharacters() {
        V1NonResourcePolicyRule rule = new V1NonResourcePolicyRule();
        rule.addNonResourceURLsItem("/health-check_1.2.3");
        assertThat(rule.getNonResourceURLs(), contains("/health-check_1.2.3"));
    }

    //BaseRock generated method id: ${testVerbsWithSpecialCharacters}, hash: 24E9D8B393A1402FC4C96A12976650DF
    @Test
    void testVerbsWithSpecialCharacters() {
        V1NonResourcePolicyRule rule = new V1NonResourcePolicyRule();
        rule.addVerbsItem("custom-verb_1.2.3");
        assertThat(rule.getVerbs(), contains("custom-verb_1.2.3"));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentOrder}, hash: EC8593B6590873FBF9E7761282B7139B
    @Disabled()
    @Test
    void testEqualsWithDifferentOrder() {
        V1NonResourcePolicyRule rule1 = new V1NonResourcePolicyRule().nonResourceURLs(Arrays.asList("/healthz", "/metrics")).verbs(Arrays.asList("get", "post"));
        V1NonResourcePolicyRule rule2 = new V1NonResourcePolicyRule().nonResourceURLs(Arrays.asList("/metrics", "/healthz")).verbs(Arrays.asList("post", "get"));
        assertThat(rule1.equals(rule2), is(true));
    }

    //BaseRock generated method id: ${testHashCodeWithDifferentOrder}, hash: 33C9D237A9F07DACA2260A8ADD07B9CC
    @Disabled()
    @Test
    void testHashCodeWithDifferentOrder() {
        V1NonResourcePolicyRule rule1 = new V1NonResourcePolicyRule().nonResourceURLs(Arrays.asList("/healthz", "/metrics")).verbs(Arrays.asList("get", "post"));
        V1NonResourcePolicyRule rule2 = new V1NonResourcePolicyRule().nonResourceURLs(Arrays.asList("/metrics", "/healthz")).verbs(Arrays.asList("post", "get"));
        assertThat(rule1.hashCode(), is(equalTo(rule2.hashCode())));
    }
}

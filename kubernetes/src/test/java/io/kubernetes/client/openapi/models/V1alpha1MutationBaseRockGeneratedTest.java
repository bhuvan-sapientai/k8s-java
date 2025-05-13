package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1alpha1JSONPatch;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.V1alpha1ApplyConfiguration;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha1MutationBaseRockGeneratedTest {

    private V1alpha1Mutation mutation;

    @BeforeEach
    void setUp() {
        mutation = new V1alpha1Mutation();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 63904AEA6CE35732A075DC3730ADDB1F
    @Test
    void testConstructor() {
        assertThat(mutation, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetApplyConfiguration}, hash: E3558874B16A179CE87FF3B9ED2F6019
    @Test
    void testSetAndGetApplyConfiguration() {
        V1alpha1ApplyConfiguration applyConfiguration = mock(V1alpha1ApplyConfiguration.class);
        mutation.setApplyConfiguration(applyConfiguration);
        assertThat(mutation.getApplyConfiguration(), is(equalTo(applyConfiguration)));
    }

    //BaseRock generated method id: ${testSetAndGetJsonPatch}, hash: A4A53405831249547273F43A08B87AC5
    @Test
    void testSetAndGetJsonPatch() {
        V1alpha1JSONPatch jsonPatch = mock(V1alpha1JSONPatch.class);
        mutation.setJsonPatch(jsonPatch);
        assertThat(mutation.getJsonPatch(), is(equalTo(jsonPatch)));
    }

    //BaseRock generated method id: ${testSetAndGetPatchType}, hash: FA145D6560FB30F194B7CB87B47969FD
    @Test
    void testSetAndGetPatchType() {
        String patchType = "ApplyConfiguration";
        mutation.setPatchType(patchType);
        assertThat(mutation.getPatchType(), is(equalTo(patchType)));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: CD2E2EF299C8C3FA90B099C15ABA0F6F
    @Test
    void testEqualsWithSameObject() {
        assertThat(mutation.equals(mutation), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 14F1E772BE67A05FE1E58644CDAA6E88
    @Test
    void testEqualsWithDifferentObject() {
        V1alpha1Mutation otherMutation = new V1alpha1Mutation();
        assertThat(mutation.equals(otherMutation), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 8B95B641A0C1E752FF459C925A30B8C7
    @Test
    void testEqualsWithDifferentClass() {
        Object otherObject = new Object();
        assertThat(mutation.equals(otherObject), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: E6DAEAD58043061871E3E1DC4EDE693E
    @Test
    void testHashCode() {
        V1alpha1Mutation sameMutation = new V1alpha1Mutation();
        assertThat(mutation.hashCode(), is(equalTo(sameMutation.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 59C7235B49C07CA5D2F4F6A996799222
    @Test
    void testToString() {
        String expectedString = "class V1alpha1Mutation {\n    applyConfiguration: null\n    jsonPatch: null\n    patchType: null\n}";
        assertThat(mutation.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testSetValidPatchType}, hash: 374FDB2115A62EAF868596EF29739AC8
    @ParameterizedTest
    @ValueSource(strings = { "ApplyConfiguration", "JSONPatch" })
    void testSetValidPatchType(String patchType) {
        mutation.setPatchType(patchType);
        assertThat(mutation.getPatchType(), is(equalTo(patchType)));
    }

    //BaseRock generated method id: ${testSetNullPatchType}, hash: 466C457AC9C78863D2946CE25416C04B
    @Test
    void testSetNullPatchType() {
        mutation.setPatchType(null);
        assertThat(mutation.getPatchType(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testToJsonWithNullValues}, hash: C7DF62AABA166BE915AFAC37BB731F1C
    @Test
    void testToJsonWithNullValues() {
        String expectedJson = "{}";
        assertThat(mutation.toJson(), is(equalTo(expectedJson)));
    }

    //BaseRock generated method id: ${testToJsonWithNonNullValues}, hash: C5DE3B1453935CBA4BA937D6571BB4FD
    @Test
    void testToJsonWithNonNullValues() {
        V1alpha1ApplyConfiguration applyConfiguration = mock(V1alpha1ApplyConfiguration.class);
        V1alpha1JSONPatch jsonPatch = mock(V1alpha1JSONPatch.class);
        String patchType = "ApplyConfiguration";
        mutation.setApplyConfiguration(applyConfiguration);
        mutation.setJsonPatch(jsonPatch);
        mutation.setPatchType(patchType);
        String expectedJson = "{\"applyConfiguration\":{},\"jsonPatch\":{},\"patchType\":\"ApplyConfiguration\"}";
        assertThat(mutation.toJson(), is(equalTo(expectedJson)));
    }

    //BaseRock generated method id: ${testFromJsonWithValidJson}, hash: 8DE562B7507B53F7D85CF935BE3B31D3
    @Test
    void testFromJsonWithValidJson() throws Exception {
        String json = "{\"applyConfiguration\":{},\"jsonPatch\":{},\"patchType\":\"ApplyConfiguration\"}";
        V1alpha1Mutation fromJsonMutation = V1alpha1Mutation.fromJson(json);
        assertThat(fromJsonMutation, is(notNullValue()));
        assertThat(fromJsonMutation.getApplyConfiguration(), is(notNullValue()));
        assertThat(fromJsonMutation.getJsonPatch(), is(notNullValue()));
        assertThat(fromJsonMutation.getPatchType(), is(equalTo("ApplyConfiguration")));
    }

    //BaseRock generated method id: ${testFromJsonWithInvalidJson}, hash: B235DD6CB343283909634DEC1F0D99AC
    @Test
    void testFromJsonWithInvalidJson() {
        String invalidJson = "{invalid_json}";
        assertThrows(Exception.class, () -> V1alpha1Mutation.fromJson(invalidJson));
    }
}

package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1EvictionBaseRockGeneratedTest {

    private V1Eviction v1Eviction;

    @BeforeEach
    void setUp() {
        v1Eviction = new V1Eviction();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 94595AEEAFE8C7CF5FF0E092CF6EC5E6
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1Eviction.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1Eviction.getApiVersion());
    }

    //BaseRock generated method id: ${testDeleteOptions}, hash: C309EC0DA1A1BE33A2B493966F5964C0
    @Test
    void testDeleteOptions() {
        V1DeleteOptions deleteOptions = mock(V1DeleteOptions.class);
        v1Eviction.setDeleteOptions(deleteOptions);
        assertEquals(deleteOptions, v1Eviction.getDeleteOptions());
    }

    //BaseRock generated method id: ${testKind}, hash: 954DD2648D9A52C1E6FF20F44AC14473
    @Test
    void testKind() {
        String kind = "Eviction";
        v1Eviction.setKind(kind);
        assertEquals(kind, v1Eviction.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: E744E2BE2FEDE7C94E779E63271D30F9
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1Eviction.setMetadata(metadata);
        assertEquals(metadata, v1Eviction.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: F76E05F50902CAF1C755AA9B0286B345
    @Test
    void testEquals() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1DeleteOptions deleteOptions = mock(V1DeleteOptions.class);
        V1Eviction eviction1 = new V1Eviction().apiVersion("v1").kind("Eviction").metadata(metadata).deleteOptions(deleteOptions);
        V1Eviction eviction2 = new V1Eviction().apiVersion("v1").kind("Eviction").metadata(metadata).deleteOptions(deleteOptions);
        assertThat(eviction1.equals(eviction2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: C5B4992841BE1DF94CF3C4A71B90CFDD
    @Test
    void testHashCode() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1DeleteOptions deleteOptions = mock(V1DeleteOptions.class);
        V1Eviction eviction1 = new V1Eviction().apiVersion("v1").kind("Eviction").metadata(metadata).deleteOptions(deleteOptions);
        V1Eviction eviction2 = new V1Eviction().apiVersion("v1").kind("Eviction").metadata(metadata).deleteOptions(deleteOptions);
        assertEquals(eviction1.hashCode(), eviction2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 8187334532D5B1A975D88573161FC24D
    @Test
    void testToString() {
        V1Eviction eviction = new V1Eviction().apiVersion("v1").kind("Eviction").metadata(mock(V1ObjectMeta.class)).deleteOptions(mock(V1DeleteOptions.class));
        String result = eviction.toString();
        assertNotNull(result);
        assertThat(result.contains("apiVersion"), is(true));
        assertThat(result.contains("kind"), is(true));
        assertThat(result.contains("metadata"), is(true));
        assertThat(result.contains("deleteOptions"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: C3E0882BBBA53E687D78A0146DE6B1BD
    @Test
    void testBuilder() {
        V1Eviction eviction = new V1Eviction().apiVersion("v1").kind("Eviction").metadata(mock(V1ObjectMeta.class)).deleteOptions(mock(V1DeleteOptions.class));
        assertThat(eviction, is(notNullValue()));
        assertThat(eviction.getApiVersion(), equalTo("v1"));
        assertThat(eviction.getKind(), equalTo("Eviction"));
        assertThat(eviction.getMetadata(), is(notNullValue()));
        assertThat(eviction.getDeleteOptions(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 310A3722B33FD27CD9C4DDB008EE48FD
    @Test
    void testGetApiVersion() {
        V1Eviction eviction = new V1Eviction().apiVersion("v1");
        assertThat(eviction.getApiVersion(), equalTo("v1"));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 64246D363B641D83A0E2560F0C784268
    @Test
    void testGetKind() {
        V1Eviction eviction = new V1Eviction().kind("Eviction");
        assertThat(eviction.getKind(), equalTo("Eviction"));
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: B0300FF00DD8AE7491EA14E1288D4994
    @Test
    void testGetMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1Eviction eviction = new V1Eviction().metadata(metadata);
        assertThat(eviction.getMetadata(), equalTo(metadata));
    }

    //BaseRock generated method id: ${testGetDeleteOptions}, hash: B3AD5049204D6725B62D3911BA983A0F
    @Test
    void testGetDeleteOptions() {
        V1DeleteOptions deleteOptions = mock(V1DeleteOptions.class);
        V1Eviction eviction = new V1Eviction().deleteOptions(deleteOptions);
        assertThat(eviction.getDeleteOptions(), equalTo(deleteOptions));
    }
}

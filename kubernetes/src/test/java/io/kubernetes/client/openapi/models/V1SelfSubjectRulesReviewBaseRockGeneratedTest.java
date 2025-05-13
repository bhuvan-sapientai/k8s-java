package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1SelfSubjectRulesReviewSpec;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatus;
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
class V1SelfSubjectRulesReviewBaseRockGeneratedTest {

    private V1SelfSubjectRulesReview v1SelfSubjectRulesReview;

    @BeforeEach
    void setUp() {
        v1SelfSubjectRulesReview = new V1SelfSubjectRulesReview();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 6574E688F6884F8D4DDBCE4DBEB61D69
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1SelfSubjectRulesReview.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1SelfSubjectRulesReview.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 3133D3A3174E8AC301770A7071ED8E4A
    @Test
    void testKind() {
        String kind = "SelfSubjectRulesReview";
        v1SelfSubjectRulesReview.setKind(kind);
        assertEquals(kind, v1SelfSubjectRulesReview.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: B87E33C525F57AE9BC705A198C881A33
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1SelfSubjectRulesReview.setMetadata(metadata);
        assertEquals(metadata, v1SelfSubjectRulesReview.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: 19BDFF9B56A02AB74E5D852860374B54
    @Test
    void testSpec() {
        V1SelfSubjectRulesReviewSpec spec = mock(V1SelfSubjectRulesReviewSpec.class);
        v1SelfSubjectRulesReview.setSpec(spec);
        assertEquals(spec, v1SelfSubjectRulesReview.getSpec());
    }

    //BaseRock generated method id: ${testStatus}, hash: 38F6548A461F03251058B3661D3FFFAD
    @Test
    void testStatus() {
        V1SubjectRulesReviewStatus status = mock(V1SubjectRulesReviewStatus.class);
        v1SelfSubjectRulesReview.setStatus(status);
        assertEquals(status, v1SelfSubjectRulesReview.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: 97914382BBEEFBB46E4D5BF1C6D563AB
    @Test
    void testEquals() {
        V1SelfSubjectRulesReview other = new V1SelfSubjectRulesReview();
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1SelfSubjectRulesReviewSpec spec = mock(V1SelfSubjectRulesReviewSpec.class);
        V1SubjectRulesReviewStatus status = mock(V1SubjectRulesReviewStatus.class);
        other.setApiVersion("v1");
        other.setKind("SelfSubjectRulesReview");
        other.setMetadata(metadata);
        other.setSpec(spec);
        other.setStatus(status);
        v1SelfSubjectRulesReview.setApiVersion("v1");
        v1SelfSubjectRulesReview.setKind("SelfSubjectRulesReview");
        v1SelfSubjectRulesReview.setMetadata(metadata);
        v1SelfSubjectRulesReview.setSpec(spec);
        v1SelfSubjectRulesReview.setStatus(status);
        assertThat(v1SelfSubjectRulesReview, is(equalTo(other)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: E2F10930C08D168277C8E4EEDBD54944
    @Test
    void testHashCode() {
        v1SelfSubjectRulesReview.setApiVersion("v1");
        v1SelfSubjectRulesReview.setKind("SelfSubjectRulesReview");
        v1SelfSubjectRulesReview.setMetadata(mock(V1ObjectMeta.class));
        v1SelfSubjectRulesReview.setSpec(mock(V1SelfSubjectRulesReviewSpec.class));
        v1SelfSubjectRulesReview.setStatus(mock(V1SubjectRulesReviewStatus.class));
        int hashCode = v1SelfSubjectRulesReview.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 50401B71180CBBF97F2A32E61FC007B8
    @Test
    void testToString() {
        v1SelfSubjectRulesReview.setApiVersion("v1");
        v1SelfSubjectRulesReview.setKind("SelfSubjectRulesReview");
        v1SelfSubjectRulesReview.setMetadata(mock(V1ObjectMeta.class));
        v1SelfSubjectRulesReview.setSpec(mock(V1SelfSubjectRulesReviewSpec.class));
        v1SelfSubjectRulesReview.setStatus(mock(V1SubjectRulesReviewStatus.class));
        String toString = v1SelfSubjectRulesReview.toString();
        assertNotNull(toString);
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("spec"), is(true));
        assertThat(toString.contains("status"), is(true));
    }
}

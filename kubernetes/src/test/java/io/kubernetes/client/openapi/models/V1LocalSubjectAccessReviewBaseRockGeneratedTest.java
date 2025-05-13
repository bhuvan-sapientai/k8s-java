package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatus;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpec;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1LocalSubjectAccessReviewBaseRockGeneratedTest {

    private V1LocalSubjectAccessReview v1LocalSubjectAccessReview;

    @BeforeEach
    void setUp() {
        v1LocalSubjectAccessReview = new V1LocalSubjectAccessReview();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: CC7028B5938B3BCCCF5481FCD62BB6D5
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1LocalSubjectAccessReview.setApiVersion(apiVersion);
        assertThat(v1LocalSubjectAccessReview.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testKind}, hash: 7E6DBFE9E0A61945DD26B0132C2FEF24
    @Test
    void testKind() {
        String kind = "LocalSubjectAccessReview";
        v1LocalSubjectAccessReview.setKind(kind);
        assertThat(v1LocalSubjectAccessReview.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testMetadata}, hash: BD242B6AC053905C3AF48D73DB02E49C
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1LocalSubjectAccessReview.setMetadata(metadata);
        assertThat(v1LocalSubjectAccessReview.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testSpec}, hash: 1A3289DB8BF2B9FC053575A6BD1A03E5
    @Test
    void testSpec() {
        V1SubjectAccessReviewSpec spec = mock(V1SubjectAccessReviewSpec.class);
        v1LocalSubjectAccessReview.setSpec(spec);
        assertThat(v1LocalSubjectAccessReview.getSpec(), is(equalTo(spec)));
    }

    //BaseRock generated method id: ${testStatus}, hash: CC3D79295FD170E1F2DE5235A6128EA3
    @Test
    void testStatus() {
        V1SubjectAccessReviewStatus status = mock(V1SubjectAccessReviewStatus.class);
        v1LocalSubjectAccessReview.setStatus(status);
        assertThat(v1LocalSubjectAccessReview.getStatus(), is(equalTo(status)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 1AD3E5D26456174B3C1CF1A95F89E4D4
    @Test
    void testEqualsAndHashCode() {
        V1LocalSubjectAccessReview other = new V1LocalSubjectAccessReview();
        other.setApiVersion(v1LocalSubjectAccessReview.getApiVersion());
        other.setKind(v1LocalSubjectAccessReview.getKind());
        other.setMetadata(v1LocalSubjectAccessReview.getMetadata());
        other.setSpec(v1LocalSubjectAccessReview.getSpec());
        other.setStatus(v1LocalSubjectAccessReview.getStatus());
        assertThat(v1LocalSubjectAccessReview, is(equalTo(other)));
        assertThat(v1LocalSubjectAccessReview.hashCode(), is(equalTo(other.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: F074D86628B575D46F9F1B2828DDA6B8
    @Test
    void testToString() {
        assertThat(v1LocalSubjectAccessReview.toString(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testRequiredFields}, hash: 76FE90F195C88E3CD5B1F97FA70ADA74
    @Test
    void testRequiredFields() {
        V1LocalSubjectAccessReview review = new V1LocalSubjectAccessReview();
        assertThrows(IllegalArgumentException.class, () -> review.validateJsonElement(null));
    }
}

package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1SelfSubjectReviewStatus;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1SelfSubjectReviewBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1SelfSubjectReview}, hash: 8BC045D2AA80F23FBB8546C1C9F14E4F
    @Test
    void testV1SelfSubjectReview() {
        V1SelfSubjectReview v1SelfSubjectReview = new V1SelfSubjectReview();
        assertThat(v1SelfSubjectReview, is(notNullValue()));
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 502F1A5E6A029CD92BF5E218B5C76869
    @Test
    void testApiVersion() {
        V1SelfSubjectReview v1SelfSubjectReview = new V1SelfSubjectReview();
        String apiVersion = "v1";
        v1SelfSubjectReview.setApiVersion(apiVersion);
        assertThat(v1SelfSubjectReview.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testKind}, hash: 12A9CA17F66D855799FBC33233B2F85E
    @Test
    void testKind() {
        V1SelfSubjectReview v1SelfSubjectReview = new V1SelfSubjectReview();
        String kind = "SelfSubjectReview";
        v1SelfSubjectReview.setKind(kind);
        assertThat(v1SelfSubjectReview.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testMetadata}, hash: F1EF53B192FCFFEFF4B62CD671EA466A
    @Test
    void testMetadata() {
        V1SelfSubjectReview v1SelfSubjectReview = new V1SelfSubjectReview();
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1SelfSubjectReview.setMetadata(metadata);
        assertThat(v1SelfSubjectReview.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testStatus}, hash: 2FD4814DF847ED3CF960B044B513B634
    @Test
    void testStatus() {
        V1SelfSubjectReview v1SelfSubjectReview = new V1SelfSubjectReview();
        V1SelfSubjectReviewStatus status = mock(V1SelfSubjectReviewStatus.class);
        v1SelfSubjectReview.setStatus(status);
        assertThat(v1SelfSubjectReview.getStatus(), is(equalTo(status)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 422F8F85A9E63515AFB3C039CB7F066E
    @Test
    void testEquals() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1SelfSubjectReviewStatus status = mock(V1SelfSubjectReviewStatus.class);
        V1SelfSubjectReview v1SelfSubjectReview1 = new V1SelfSubjectReview().apiVersion("v1").kind("SelfSubjectReview").metadata(metadata).status(status);
        V1SelfSubjectReview v1SelfSubjectReview2 = new V1SelfSubjectReview().apiVersion("v1").kind("SelfSubjectReview").metadata(metadata).status(status);
        assertThat(v1SelfSubjectReview1.equals(v1SelfSubjectReview2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: BC59BF4A4CEB1818BA645ADE0FE3E620
    @Test
    void testHashCode() {
        V1SelfSubjectReview v1SelfSubjectReview = new V1SelfSubjectReview().apiVersion("v1").kind("SelfSubjectReview").metadata(mock(V1ObjectMeta.class)).status(mock(V1SelfSubjectReviewStatus.class));
        int hashCode = v1SelfSubjectReview.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 859C98636D18BB5D9673BBC6B0390F20
    @Test
    void testToString() {
        V1SelfSubjectReview v1SelfSubjectReview = new V1SelfSubjectReview().apiVersion("v1").kind("SelfSubjectReview").metadata(mock(V1ObjectMeta.class)).status(mock(V1SelfSubjectReviewStatus.class));
        String toString = v1SelfSubjectReview.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("status"), is(true));
    }
}

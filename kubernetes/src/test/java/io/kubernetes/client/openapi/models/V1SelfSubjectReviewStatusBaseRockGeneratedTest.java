package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1UserInfo;
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
class V1SelfSubjectReviewStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1SelfSubjectReviewStatusConstructor}, hash: F227EBBEEF9E0A0290A0F6DF713DA788
    @Test
    void testV1SelfSubjectReviewStatusConstructor() {
        V1SelfSubjectReviewStatus status = new V1SelfSubjectReviewStatus();
        assertNotNull(status);
    }

    //BaseRock generated method id: ${testUserInfoGetterAndSetter}, hash: 435C07DDDDC5B369A98F0A7B2EB2D69B
    @Test
    void testUserInfoGetterAndSetter() {
        V1SelfSubjectReviewStatus status = new V1SelfSubjectReviewStatus();
        V1UserInfo userInfo = mock(V1UserInfo.class);
        status.setUserInfo(userInfo);
        assertEquals(userInfo, status.getUserInfo());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 3A1602967D0E992D2F17EDA6025599A0
    @Test
    void testEqualsWithSameObject() {
        V1SelfSubjectReviewStatus status = new V1SelfSubjectReviewStatus();
        assertThat(status.equals(status), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 9783A60D2964C4169B82ACB64D5B4744
    @Test
    void testEqualsWithDifferentObject() {
        V1SelfSubjectReviewStatus status1 = new V1SelfSubjectReviewStatus();
        V1SelfSubjectReviewStatus status2 = new V1SelfSubjectReviewStatus();
        V1UserInfo userInfo = mock(V1UserInfo.class);
        status1.setUserInfo(userInfo);
        status2.setUserInfo(userInfo);
        assertThat(status1.equals(status2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 1F88D6451B5FC417D1DA12C909484DC9
    @Test
    void testHashCode() {
        V1SelfSubjectReviewStatus status = new V1SelfSubjectReviewStatus();
        V1UserInfo userInfo = mock(V1UserInfo.class);
        status.setUserInfo(userInfo);
        assertThat(status.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: D5957C9B73E2B2AB83CC2C444AAE582A
    @Test
    void testToString() {
        V1SelfSubjectReviewStatus status = new V1SelfSubjectReviewStatus();
        V1UserInfo userInfo = mock(V1UserInfo.class);
        when(userInfo.toString()).thenReturn("MockUserInfo");
        status.setUserInfo(userInfo);
        String result = status.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result.contains("userInfo"), is(true));
        assertThat(result.contains("MockUserInfo"), is(true));
    }

    //BaseRock generated method id: ${testUserInfoField}, hash: C09BAEE7E1114AC459922DAD6F6DE1EB
    @Test
    void testUserInfoField() {
        V1SelfSubjectReviewStatus status = new V1SelfSubjectReviewStatus();
        assertThat(status.getUserInfo(), is(equalTo(null)));
    }
}

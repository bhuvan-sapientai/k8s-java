package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1beta1SelfSubjectReviewStatus;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1UserInfo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1SelfSubjectReviewStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 995DCD7BE4FA9B831DA5212C9A4CED24
    @Test
    void testConstructor() {
        V1beta1SelfSubjectReviewStatus status = new V1beta1SelfSubjectReviewStatus();
        assertThat(status, is(notNullValue()));
    }

    //BaseRock generated method id: ${testUserInfo}, hash: A3E76CFF11C01FB9DBC77BAD368B4A24
    @Test
    void testUserInfo() {
        V1beta1SelfSubjectReviewStatus status = new V1beta1SelfSubjectReviewStatus();
        V1UserInfo userInfo = mock(V1UserInfo.class);
        status.setUserInfo(userInfo);
        assertEquals(userInfo, status.getUserInfo());
    }

    //BaseRock generated method id: ${testUserInfoNull}, hash: 2FF21A16E37C8214A1E78313A90A84D5
    @Test
    void testUserInfoNull() {
        V1beta1SelfSubjectReviewStatus status = new V1beta1SelfSubjectReviewStatus();
        status.setUserInfo(null);
        assertThat(status.getUserInfo(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEquals}, hash: 5A7C48C16ADB98F7BA76F52667A2FE92
    @Test
    void testEquals() {
        V1beta1SelfSubjectReviewStatus status1 = new V1beta1SelfSubjectReviewStatus();
        V1beta1SelfSubjectReviewStatus status2 = new V1beta1SelfSubjectReviewStatus();
        V1UserInfo userInfo = mock(V1UserInfo.class);
        status1.setUserInfo(userInfo);
        status2.setUserInfo(userInfo);
        assertThat(status1, is(equalTo(status2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 669DCF0B0423DC6240F99FFD90B33348
    @Test
    void testHashCode() {
        V1beta1SelfSubjectReviewStatus status = new V1beta1SelfSubjectReviewStatus();
        V1UserInfo userInfo = mock(V1UserInfo.class);
        status.setUserInfo(userInfo);
        assertThat(status.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 6B70E4AD6CEE4C6ED02289DA73730BAF
    @Test
    void testToString() {
        V1beta1SelfSubjectReviewStatus status = new V1beta1SelfSubjectReviewStatus();
        V1UserInfo userInfo = mock(V1UserInfo.class);
        when(userInfo.toString()).thenReturn("MockedUserInfo");
        status.setUserInfo(userInfo);
        String result = status.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result.contains("MockedUserInfo"), is(true));
    }
}

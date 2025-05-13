package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import io.kubernetes.client.openapi.models.V1TokenReviewStatus;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1UserInfo;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1TokenReviewStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1TokenReviewStatusConstructor}, hash: F21C3D488D8C873813C6CDF81F862964
    @Test
    void testV1TokenReviewStatusConstructor() {
        V1TokenReviewStatus status = new V1TokenReviewStatus();
        assertThat(status, is(notNullValue()));
        assertThat(status.getAudiences(), is(notNullValue()));
        assertThat(status.getAudiences(), hasSize(0));
        assertThat(status.getAuthenticated(), is(nullValue()));
        assertThat(status.getError(), is(nullValue()));
        assertThat(status.getUser(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetAudiences}, hash: F1A5000FEFA26B7CD7853CC1B94D4C91
    @Test
    void testSetAndGetAudiences() {
        V1TokenReviewStatus status = new V1TokenReviewStatus();
        List<String> audiences = Arrays.asList("audience1", "audience2");
        status.setAudiences(audiences);
        assertEquals(audiences, status.getAudiences());
    }

    //BaseRock generated method id: ${testAddAudiencesItem}, hash: 2E00D87BEBF0420BCE7520EECCBAED31
    @Test
    void testAddAudiencesItem() {
        V1TokenReviewStatus status = new V1TokenReviewStatus();
        status.addAudiencesItem("audience1");
        status.addAudiencesItem("audience2");
        assertThat(status.getAudiences(), containsInAnyOrder("audience1", "audience2"));
    }

    //BaseRock generated method id: ${testSetAndGetAuthenticated}, hash: E4C5CCA3D6594D9364987DDD47C5C3DC
    @Test
    void testSetAndGetAuthenticated() {
        V1TokenReviewStatus status = new V1TokenReviewStatus();
        status.setAuthenticated(true);
        assertTrue(status.getAuthenticated());
        status.setAuthenticated(false);
        assertFalse(status.getAuthenticated());
    }

    //BaseRock generated method id: ${testSetAndGetError}, hash: BBD56CE17528443531A18A8EDE306DA7
    @Test
    void testSetAndGetError() {
        V1TokenReviewStatus status = new V1TokenReviewStatus();
        String error = "Authentication error";
        status.setError(error);
        assertEquals(error, status.getError());
    }

    //BaseRock generated method id: ${testSetAndGetUser}, hash: C23F2BE14B9469456191459CCF03CBB0
    @Test
    void testSetAndGetUser() {
        V1TokenReviewStatus status = new V1TokenReviewStatus();
        V1UserInfo userInfo = new V1UserInfo();
        status.setUser(userInfo);
        assertEquals(userInfo, status.getUser());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 5FA3694BC7F9EF0D05A480DABD5FBB7A
    @Test
    void testEqualsAndHashCode() {
        V1TokenReviewStatus status1 = new V1TokenReviewStatus().audiences(Arrays.asList("audience1", "audience2")).authenticated(true).error("No error").user(new V1UserInfo());
        V1TokenReviewStatus status2 = new V1TokenReviewStatus().audiences(Arrays.asList("audience1", "audience2")).authenticated(true).error("No error").user(new V1UserInfo());
        V1TokenReviewStatus status3 = new V1TokenReviewStatus().audiences(Arrays.asList("audience3")).authenticated(false).error("Error").user(new V1UserInfo());
        assertEquals(status1, status2);
        assertEquals(status1.hashCode(), status2.hashCode());
        assertNotEquals(status1, status3);
        assertNotEquals(status1.hashCode(), status3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: A794187F1B63EB171AA4A0A8B84BE965
    @Test
    void testToString() {
        V1TokenReviewStatus status = new V1TokenReviewStatus().audiences(Arrays.asList("audience1", "audience2")).authenticated(true).error("No error").user(new V1UserInfo());
        String toString = status.toString();
        assertThat(toString, notNullValue());
        assertTrue(toString.contains("audiences"));
        assertTrue(toString.contains("authenticated"));
        assertTrue(toString.contains("error"));
        assertTrue(toString.contains("user"));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 97626D071544337477FC39F469582973
    @Test
    void testBuilder() {
        List<String> audiences = Arrays.asList("audience1", "audience2");
        V1UserInfo userInfo = new V1UserInfo();
        V1TokenReviewStatus status = new V1TokenReviewStatus().audiences(audiences).authenticated(true).error("No error").user(userInfo);
        assertThat(status.getAudiences(), is(equalTo(audiences)));
        assertTrue(status.getAuthenticated());
        assertEquals("No error", status.getError());
        assertEquals(userInfo, status.getUser());
    }

    //BaseRock generated method id: ${testSetNullValues}, hash: F54148E1386A79AA3D54A91E752390AE
    @Test
    void testSetNullValues() {
        V1TokenReviewStatus status = new V1TokenReviewStatus();
        status.setAudiences(null);
        assertThat(status.getAudiences(), is(nullValue()));
        status.setAuthenticated(null);
        assertThat(status.getAuthenticated(), is(nullValue()));
        status.setError(null);
        assertThat(status.getError(), is(nullValue()));
        status.setUser(null);
        assertThat(status.getUser(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAudiencesImmutability}, hash: 8D871B03434B82FCB949D9A10EA023A4
    @Disabled()
    @Test
    void testAudiencesImmutability() {
        V1TokenReviewStatus status = new V1TokenReviewStatus();
        List<String> audiences = new ArrayList<>(Arrays.asList("audience1", "audience2"));
        status.setAudiences(audiences);
        audiences.add("audience3");
        assertThat(status.getAudiences(), hasSize(2));
        assertThat(status.getAudiences(), containsInAnyOrder("audience1", "audience2"));
    }
}

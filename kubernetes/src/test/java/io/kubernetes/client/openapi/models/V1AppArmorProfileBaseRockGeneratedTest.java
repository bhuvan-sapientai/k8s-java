package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1AppArmorProfile;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1AppArmorProfileBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1AppArmorProfileConstructor}, hash: 373711D3B0DA2480FD3FE933E4B82C2D
    @Test
    void testV1AppArmorProfileConstructor() {
        V1AppArmorProfile profile = new V1AppArmorProfile();
        assertNotNull(profile);
    }

    //BaseRock generated method id: ${testLocalhostProfileGetterAndSetter}, hash: 5B42D99EE27C75A04E7AABF719913C20
    @Test
    void testLocalhostProfileGetterAndSetter() {
        V1AppArmorProfile profile = new V1AppArmorProfile();
        String localhostProfile = "test-profile";
        profile.setLocalhostProfile(localhostProfile);
        assertEquals(localhostProfile, profile.getLocalhostProfile());
    }

    //BaseRock generated method id: ${testTypeGetterAndSetter}, hash: 5981169E8362B3175BB88149CDC2EC28
    @Test
    void testTypeGetterAndSetter() {
        V1AppArmorProfile profile = new V1AppArmorProfile();
        String type = "Localhost";
        profile.setType(type);
        assertEquals(type, profile.getType());
    }

    //BaseRock generated method id: ${testLocalhostProfileFluentSetter}, hash: 0CFC1386D92BA5D89FF88552BE595E67
    @Test
    void testLocalhostProfileFluentSetter() {
        V1AppArmorProfile profile = new V1AppArmorProfile();
        String localhostProfile = "test-profile";
        V1AppArmorProfile result = profile.localhostProfile(localhostProfile);
        assertThat(result, is(profile));
        assertEquals(localhostProfile, profile.getLocalhostProfile());
    }

    //BaseRock generated method id: ${testTypeFluentSetter}, hash: FFFB52105ECD870F2C892AB8EBE45645
    @Test
    void testTypeFluentSetter() {
        V1AppArmorProfile profile = new V1AppArmorProfile();
        String type = "RuntimeDefault";
        V1AppArmorProfile result = profile.type(type);
        assertThat(result, is(profile));
        assertEquals(type, profile.getType());
    }

    //BaseRock generated method id: ${testEquals}, hash: 5DE39D6EA0F14678FCA62BBBD2D7B1B3
    @ParameterizedTest
    @CsvSource({ "profile1, Localhost, profile1, Localhost, true", "profile1, Localhost, profile2, Localhost, false", "profile1, Localhost, profile1, RuntimeDefault, false", "profile1, Localhost, profile2, RuntimeDefault, false" })
    void testEquals(String profile1, String type1, String profile2, String type2, boolean expectedResult) {
        V1AppArmorProfile appArmorProfile1 = new V1AppArmorProfile().localhostProfile(profile1).type(type1);
        V1AppArmorProfile appArmorProfile2 = new V1AppArmorProfile().localhostProfile(profile2).type(type2);
        assertEquals(expectedResult, appArmorProfile1.equals(appArmorProfile2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: DA095A96AD77CE0C5CDF9879A69A00E2
    @Test
    void testHashCode() {
        V1AppArmorProfile profile1 = new V1AppArmorProfile().localhostProfile("profile1").type("Localhost");
        V1AppArmorProfile profile2 = new V1AppArmorProfile().localhostProfile("profile1").type("Localhost");
        V1AppArmorProfile profile3 = new V1AppArmorProfile().localhostProfile("profile2").type("RuntimeDefault");
        assertEquals(profile1.hashCode(), profile2.hashCode());
        assertThat(profile1.hashCode() == profile3.hashCode(), is(false));
    }

    //BaseRock generated method id: ${testToString}, hash: B5007AF8423C7FB107BB069D7501ABD6
    @Test
    void testToString() {
        V1AppArmorProfile profile = new V1AppArmorProfile().localhostProfile("test-profile").type("Localhost");
        String expectedString = "class V1AppArmorProfile {\n    localhostProfile: test-profile\n    type: Localhost\n}";
        assertEquals(expectedString, profile.toString());
    }

    //BaseRock generated method id: ${testSetNullLocalhostProfile}, hash: 4C5AA4C204FF0C8A2C99E205AEDA0AFA
    @Test
    void testSetNullLocalhostProfile() {
        V1AppArmorProfile profile = new V1AppArmorProfile();
        profile.setLocalhostProfile(null);
        assertThat(profile.getLocalhostProfile(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetNullType}, hash: F974DB7CDD15D522AE82B27D3D20CBA2
    @Test
    void testSetNullType() {
        V1AppArmorProfile profile = new V1AppArmorProfile();
        profile.setType(null);
        assertThat(profile.getType(), is(nullValue()));
    }
}

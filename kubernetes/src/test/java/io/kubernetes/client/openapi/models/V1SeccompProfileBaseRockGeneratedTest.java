package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.models.V1SeccompProfile;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1SeccompProfileBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1SeccompProfileConstructor}, hash: 77A2007CC54D742CFFFEC20368A1ED4E
    @Test
    void testV1SeccompProfileConstructor() {
        V1SeccompProfile profile = new V1SeccompProfile();
        assertThat(profile, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetLocalhostProfile}, hash: 77975E028F2133FB8C90CEC0E7E182B1
    @Test
    void testSetAndGetLocalhostProfile() {
        V1SeccompProfile profile = new V1SeccompProfile();
        String localhostProfile = "test-profile";
        profile.setLocalhostProfile(localhostProfile);
        assertThat(profile.getLocalhostProfile(), is(equalTo(localhostProfile)));
    }

    //BaseRock generated method id: ${testSetAndGetLocalhostProfileWithVariousValues}, hash: 46251CFA0A46B0F318959DB37781C6FA
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "profile1", "profile2" })
    void testSetAndGetLocalhostProfileWithVariousValues(String localhostProfile) {
        V1SeccompProfile profile = new V1SeccompProfile();
        profile.setLocalhostProfile(localhostProfile);
        assertThat(profile.getLocalhostProfile(), is(equalTo(localhostProfile)));
    }

    //BaseRock generated method id: ${testSetAndGetType}, hash: A2611DE67B57AEE95521C63086C3D9CF
    @Test
    void testSetAndGetType() {
        V1SeccompProfile profile = new V1SeccompProfile();
        String type = "Localhost";
        profile.setType(type);
        assertThat(profile.getType(), is(equalTo(type)));
    }

    //BaseRock generated method id: ${testSetAndGetTypeWithValidValues}, hash: C1377EFBE1FC4ED0D35FA75A22623E21
    @ParameterizedTest
    @ValueSource(strings = { "Localhost", "RuntimeDefault", "Unconfined" })
    void testSetAndGetTypeWithValidValues(String type) {
        V1SeccompProfile profile = new V1SeccompProfile();
        profile.setType(type);
        assertThat(profile.getType(), is(equalTo(type)));
    }

    //BaseRock generated method id: ${testSetTypeWithNull}, hash: C4C3B10CFB17BE10285069D8219E0BA0
    @Test
    void testSetTypeWithNull() {
        V1SeccompProfile profile = new V1SeccompProfile();
        assertDoesNotThrow(() -> profile.setType(null));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 3DCD65BDDA14E5269174DF53284FB274
    @Test
    void testEqualsWithSameObject() {
        V1SeccompProfile profile = new V1SeccompProfile().localhostProfile("test-profile").type("Localhost");
        assertThat(profile.equals(profile), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 9F30AAEBC973E94FCFF0BC341612C4B2
    @Test
    void testEqualsWithDifferentObject() {
        V1SeccompProfile profile1 = new V1SeccompProfile().localhostProfile("test-profile1").type("Localhost");
        V1SeccompProfile profile2 = new V1SeccompProfile().localhostProfile("test-profile2").type("RuntimeDefault");
        assertThat(profile1.equals(profile2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 679794C6BF20DBC08970ACE537C9AF7B
    @Test
    void testHashCode() {
        V1SeccompProfile profile1 = new V1SeccompProfile().localhostProfile("test-profile").type("Localhost");
        V1SeccompProfile profile2 = new V1SeccompProfile().localhostProfile("test-profile").type("Localhost");
        assertThat(profile1.hashCode(), is(equalTo(profile2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: DE808ACF9EA1CB5480ACFEA5F7A5A1E7
    @Test
    void testToString() {
        V1SeccompProfile profile = new V1SeccompProfile().localhostProfile("test-profile").type("Localhost");
        String expectedString = "class V1SeccompProfile {\n    localhostProfile: test-profile\n    type: Localhost\n}";
        assertThat(profile.toString(), is(equalTo(expectedString)));
    }
}

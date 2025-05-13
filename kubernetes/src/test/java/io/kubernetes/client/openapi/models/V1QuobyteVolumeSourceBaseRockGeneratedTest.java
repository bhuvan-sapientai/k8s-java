package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1QuobyteVolumeSource;
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
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1QuobyteVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1QuobyteVolumeSourceConstructor}, hash: B251EFDEFC419E478B4A3903BB6328E2
    @Test
    void testV1QuobyteVolumeSourceConstructor() {
        V1QuobyteVolumeSource volumeSource = new V1QuobyteVolumeSource();
        assertThat(volumeSource, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetGroup}, hash: 32311117793992B2234CDD2204B5970E
    @Test
    void testSetAndGetGroup() {
        V1QuobyteVolumeSource volumeSource = new V1QuobyteVolumeSource();
        String group = "testGroup";
        volumeSource.setGroup(group);
        assertThat(volumeSource.getGroup(), is(equalTo(group)));
    }

    //BaseRock generated method id: ${testSetAndGetGroupWithDifferentValues}, hash: 94EC8E7474BD3DB8768ADAC455AF9991
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "group1", "group2" })
    void testSetAndGetGroupWithDifferentValues(String group) {
        V1QuobyteVolumeSource volumeSource = new V1QuobyteVolumeSource();
        volumeSource.setGroup(group);
        assertThat(volumeSource.getGroup(), is(equalTo(group)));
    }

    //BaseRock generated method id: ${testSetAndGetReadOnly}, hash: D797B659D0663A5F26B794FCC4F701E2
    @Test
    void testSetAndGetReadOnly() {
        V1QuobyteVolumeSource volumeSource = new V1QuobyteVolumeSource();
        volumeSource.setReadOnly(true);
        assertThat(volumeSource.getReadOnly(), is(equalTo(true)));
    }

    //BaseRock generated method id: ${testSetAndGetRegistry}, hash: E9A7E56436618D6D34829BE5A12FA864
    @Test
    void testSetAndGetRegistry() {
        V1QuobyteVolumeSource volumeSource = new V1QuobyteVolumeSource();
        String registry = "testRegistry";
        volumeSource.setRegistry(registry);
        assertThat(volumeSource.getRegistry(), is(equalTo(registry)));
    }

    //BaseRock generated method id: ${testSetAndGetTenant}, hash: AC6DF0F37646845285E311E89F4C1FA2
    @Test
    void testSetAndGetTenant() {
        V1QuobyteVolumeSource volumeSource = new V1QuobyteVolumeSource();
        String tenant = "testTenant";
        volumeSource.setTenant(tenant);
        assertThat(volumeSource.getTenant(), is(equalTo(tenant)));
    }

    //BaseRock generated method id: ${testSetAndGetUser}, hash: 9CC97ACE4051A2594E795B7B8CE43AC4
    @Test
    void testSetAndGetUser() {
        V1QuobyteVolumeSource volumeSource = new V1QuobyteVolumeSource();
        String user = "testUser";
        volumeSource.setUser(user);
        assertThat(volumeSource.getUser(), is(equalTo(user)));
    }

    //BaseRock generated method id: ${testSetAndGetVolume}, hash: 8FE91E3C044F01147492A0EA61C9EE5D
    @Test
    void testSetAndGetVolume() {
        V1QuobyteVolumeSource volumeSource = new V1QuobyteVolumeSource();
        String volume = "testVolume";
        volumeSource.setVolume(volume);
        assertThat(volumeSource.getVolume(), is(equalTo(volume)));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 18750103ADEFB64AB1E0A3E460B42F49
    @Test
    void testEqualsWithSameObject() {
        V1QuobyteVolumeSource volumeSource = new V1QuobyteVolumeSource();
        assertThat(volumeSource.equals(volumeSource), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: F4DAE8858AA4371A174BCC982907B6E2
    @Test
    void testEqualsWithDifferentObject() {
        V1QuobyteVolumeSource volumeSource1 = new V1QuobyteVolumeSource();
        V1QuobyteVolumeSource volumeSource2 = new V1QuobyteVolumeSource();
        assertThat(volumeSource1.equals(volumeSource2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: DE2CB02B5003372389C0F422BD68FE26
    @Test
    void testHashCode() {
        V1QuobyteVolumeSource volumeSource = new V1QuobyteVolumeSource();
        assertThat(volumeSource.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: EF91F03CD1C1EB0602D4330C67400458
    @Test
    void testToString() {
        V1QuobyteVolumeSource volumeSource = new V1QuobyteVolumeSource().group("testGroup").readOnly(true).registry("testRegistry").tenant("testTenant").user("testUser").volume("testVolume");
        String toString = volumeSource.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("group"), is(true));
        assertThat(toString.contains("readOnly"), is(true));
        assertThat(toString.contains("registry"), is(true));
        assertThat(toString.contains("tenant"), is(true));
        assertThat(toString.contains("user"), is(true));
        assertThat(toString.contains("volume"), is(true));
    }

    //BaseRock generated method id: ${testSetNullRegistry}, hash: EC34A8DEA928CD6FA4EA9405492F0C54
    @Test
    void testSetNullRegistry() {
        V1QuobyteVolumeSource volumeSource = new V1QuobyteVolumeSource();
        assertDoesNotThrow(() -> volumeSource.setRegistry(null));
    }

    //BaseRock generated method id: ${testSetNullVolume}, hash: 27A713CC3E0BCD93BAE99E270C72F240
    @Test
    void testSetNullVolume() {
        V1QuobyteVolumeSource volumeSource = new V1QuobyteVolumeSource();
        assertDoesNotThrow(() -> volumeSource.setVolume(null));
    }
}

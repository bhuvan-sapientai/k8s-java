package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.models.V1LinuxContainerUser;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1LinuxContainerUserBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1LinuxContainerUserConstructor}, hash: 82AEC3DBD179F51514818FF223B96830
    @Test
    void testV1LinuxContainerUserConstructor() {
        V1LinuxContainerUser containerUser = new V1LinuxContainerUser();
        assertThat(containerUser, is(notNullValue()));
    }

    //BaseRock generated method id: ${testGetSetGid}, hash: 9D6A5A702BC0E812D84E56C85613F17C
    @Test
    void testGetSetGid() {
        V1LinuxContainerUser containerUser = new V1LinuxContainerUser();
        Long gid = 1000L;
        containerUser.setGid(gid);
        assertEquals(gid, containerUser.getGid());
    }

    //BaseRock generated method id: ${testGetSetUid}, hash: D630B58288DD708B3080BA569870F674
    @Test
    void testGetSetUid() {
        V1LinuxContainerUser containerUser = new V1LinuxContainerUser();
        Long uid = 1001L;
        containerUser.setUid(uid);
        assertEquals(uid, containerUser.getUid());
    }

    //BaseRock generated method id: ${testGetSetSupplementalGroups}, hash: 405CA336DAD6DEF409D0CE1D7FA17ADB
    @Test
    void testGetSetSupplementalGroups() {
        V1LinuxContainerUser containerUser = new V1LinuxContainerUser();
        List<Long> groups = new ArrayList<>();
        groups.add(1002L);
        groups.add(1003L);
        containerUser.setSupplementalGroups(groups);
        assertThat(containerUser.getSupplementalGroups(), is(equalTo(groups)));
    }

    //BaseRock generated method id: ${testAddSupplementalGroupsItem}, hash: 0869E0DCE7A82B77DC925D56DF26BC26
    @Test
    void testAddSupplementalGroupsItem() {
        V1LinuxContainerUser containerUser = new V1LinuxContainerUser();
        Long groupId = 1004L;
        containerUser.addSupplementalGroupsItem(groupId);
        assertThat(containerUser.getSupplementalGroups(), hasSize(1));
        assertThat(containerUser.getSupplementalGroups().get(0), is(equalTo(groupId)));
    }

    //BaseRock generated method id: ${testSetValidGid}, hash: BA3E9CA05CD2398B741D416CB77C3A04
    @ParameterizedTest
    @ValueSource(longs = { 0L, 1L, 1000L, Long.MAX_VALUE })
    void testSetValidGid(long gid) {
        V1LinuxContainerUser containerUser = new V1LinuxContainerUser();
        containerUser.setGid(gid);
        assertEquals(gid, containerUser.getGid());
    }

    //BaseRock generated method id: ${testSetValidUid}, hash: 776AF3394E677AF4D5D1A9AF582496B6
    @ParameterizedTest
    @ValueSource(longs = { 0L, 1L, 1000L, Long.MAX_VALUE })
    void testSetValidUid(long uid) {
        V1LinuxContainerUser containerUser = new V1LinuxContainerUser();
        containerUser.setUid(uid);
        assertEquals(uid, containerUser.getUid());
    }

    //BaseRock generated method id: ${testSetNullGid}, hash: 3CD68938ED720CEB77A58BDC374376FF
    @Test
    void testSetNullGid() {
        V1LinuxContainerUser containerUser = new V1LinuxContainerUser();
        containerUser.setGid(null);
        assertThat(containerUser.getGid(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetNullUid}, hash: 7F0B9F591E3A2E2526C70815246EFDD5
    @Test
    void testSetNullUid() {
        V1LinuxContainerUser containerUser = new V1LinuxContainerUser();
        containerUser.setUid(null);
        assertThat(containerUser.getUid(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetNullSupplementalGroups}, hash: 84753FCB6076FAACDF41EEB80A05CBA7
    @Test
    void testSetNullSupplementalGroups() {
        V1LinuxContainerUser containerUser = new V1LinuxContainerUser();
        containerUser.setSupplementalGroups(null);
        assertThat(containerUser.getSupplementalGroups(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testAddNullSupplementalGroupsItem}, hash: 2F63E4168F7FD8BEEA5E0A53EC5B685E
    @Test
    void testAddNullSupplementalGroupsItem() {
        V1LinuxContainerUser containerUser = new V1LinuxContainerUser();
        containerUser.addSupplementalGroupsItem(null);
        assertThat(containerUser.getSupplementalGroups(), hasSize(1));
        assertThat(containerUser.getSupplementalGroups().get(0), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 2ABF2A612C2572DAC56AC3EB48739205
    @Test
    void testEqualsAndHashCode() {
        V1LinuxContainerUser user1 = new V1LinuxContainerUser().gid(1000L).uid(2000L);
        V1LinuxContainerUser user2 = new V1LinuxContainerUser().gid(1000L).uid(2000L);
        V1LinuxContainerUser user3 = new V1LinuxContainerUser().gid(3000L).uid(4000L);
        assertThat(user1, is(equalTo(user2)));
        assertThat(user1.hashCode(), is(equalTo(user2.hashCode())));
        assertThat(user1, is(notNullValue()));
        assertThat(user1.equals(user3), is(false));
    }

    //BaseRock generated method id: ${testToString}, hash: D7610D47452234BDB6B145CBEB466C9D
    @Test
    void testToString() {
        V1LinuxContainerUser containerUser = new V1LinuxContainerUser().gid(1000L).uid(2000L).addSupplementalGroupsItem(3000L);
        String expected = "class V1LinuxContainerUser {\n" + "    gid: 1000\n" + "    supplementalGroups: [3000]\n" + "    uid: 2000\n" + "}";
        assertThat(containerUser.toString(), is(equalTo(expected)));
    }
}

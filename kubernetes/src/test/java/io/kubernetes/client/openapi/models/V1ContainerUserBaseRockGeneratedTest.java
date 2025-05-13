package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1LinuxContainerUser;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ContainerUserBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1ContainerUserConstructor}, hash: EC505287C3ADBCB722B5AFA89299B41B
    @Test
    void testV1ContainerUserConstructor() {
        V1ContainerUser containerUser = new V1ContainerUser();
        assertNotNull(containerUser);
    }

    //BaseRock generated method id: ${testSetAndGetLinux}, hash: 3D7F173B8977901F4FCBC484811562D3
    @Test
    void testSetAndGetLinux() {
        V1ContainerUser containerUser = new V1ContainerUser();
        V1LinuxContainerUser linuxUser = mock(V1LinuxContainerUser.class);
        containerUser.setLinux(linuxUser);
        assertEquals(linuxUser, containerUser.getLinux());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 206131EE7F61439F30F4EA3630F9B611
    @Test
    void testEqualsWithSameObject() {
        V1ContainerUser containerUser = new V1ContainerUser();
        assertThat(containerUser.equals(containerUser), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 65732E16E5F34425451B7F5EC6613211
    @Test
    void testEqualsWithDifferentObject() {
        V1ContainerUser containerUser1 = new V1ContainerUser();
        V1ContainerUser containerUser2 = new V1ContainerUser();
        V1LinuxContainerUser linuxUser1 = mock(V1LinuxContainerUser.class);
        V1LinuxContainerUser linuxUser2 = mock(V1LinuxContainerUser.class);
        containerUser1.setLinux(linuxUser1);
        containerUser2.setLinux(linuxUser2);
        assertThat(containerUser1.equals(containerUser2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 5C08048EC2FC335A019246E7A91DE498
    @Test
    void testHashCode() {
        V1ContainerUser containerUser = new V1ContainerUser();
        V1LinuxContainerUser linuxUser = mock(V1LinuxContainerUser.class);
        containerUser.setLinux(linuxUser);
        assertThat(containerUser.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: E844BE5BB2DC864CE6912AFBB0A5962A
    @Test
    void testToString() {
        V1ContainerUser containerUser = new V1ContainerUser();
        V1LinuxContainerUser linuxUser = mock(V1LinuxContainerUser.class);
        containerUser.setLinux(linuxUser);
        String result = containerUser.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("class V1ContainerUser"), is(true));
        assertThat(result.contains("linux:"), is(true));
    }

    //BaseRock generated method id: ${testV1ContainerUserBuilder}, hash: 73DAA89AA34776CBF447782699D244F7
    @Test
    void testV1ContainerUserBuilder() {
        V1LinuxContainerUser linuxUser = mock(V1LinuxContainerUser.class);
        V1ContainerUser containerUser = new V1ContainerUser().linux(linuxUser);
        assertThat(containerUser, notNullValue());
        assertThat(containerUser.getLinux(), equalTo(linuxUser));
    }
}

package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1SELinuxOptions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1SELinuxOptionsBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1SELinuxOptionsConstructor}, hash: 4B672F63EC3A4EDCD230FC7FCD442C79
    @Test
    void testV1SELinuxOptionsConstructor() {
        V1SELinuxOptions seLinuxOptions = new V1SELinuxOptions();
        assertNotNull(seLinuxOptions);
    }

    //BaseRock generated method id: ${testSetAndGetLevel}, hash: 33A268B0D74B5352CD1BCE88AED7A960
    @Test
    void testSetAndGetLevel() {
        V1SELinuxOptions seLinuxOptions = new V1SELinuxOptions();
        String level = "s0:c123,c456";
        seLinuxOptions.setLevel(level);
        assertEquals(level, seLinuxOptions.getLevel());
    }

    //BaseRock generated method id: ${testSetAndGetRole}, hash: EC0E6DE5F35FB654E8DDF9CC8A05F256
    @Test
    void testSetAndGetRole() {
        V1SELinuxOptions seLinuxOptions = new V1SELinuxOptions();
        String role = "object_r";
        seLinuxOptions.setRole(role);
        assertEquals(role, seLinuxOptions.getRole());
    }

    //BaseRock generated method id: ${testSetAndGetType}, hash: EF67BEA7EFC0BC9864292335262C28D7
    @Test
    void testSetAndGetType() {
        V1SELinuxOptions seLinuxOptions = new V1SELinuxOptions();
        String type = "svirt_lxc_net_t";
        seLinuxOptions.setType(type);
        assertEquals(type, seLinuxOptions.getType());
    }

    //BaseRock generated method id: ${testSetAndGetUser}, hash: 6FF53EA390D3F2DF4B2DBEFE1D04ACCD
    @Test
    void testSetAndGetUser() {
        V1SELinuxOptions seLinuxOptions = new V1SELinuxOptions();
        String user = "system_u";
        seLinuxOptions.setUser(user);
        assertEquals(user, seLinuxOptions.getUser());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 4EDA1D27A60BCEBAAE738FD45976E2FB
    @Test
    void testEqualsWithSameObject() {
        V1SELinuxOptions seLinuxOptions = new V1SELinuxOptions().level("s0").role("role").type("type").user("user");
        assertThat(seLinuxOptions.equals(seLinuxOptions), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: DD0515E6E2340C5A6A71F49EE89A2616
    @Test
    void testEqualsWithDifferentObject() {
        V1SELinuxOptions seLinuxOptions1 = new V1SELinuxOptions().level("s0").role("role1").type("type1").user("user1");
        V1SELinuxOptions seLinuxOptions2 = new V1SELinuxOptions().level("s0").role("role2").type("type2").user("user2");
        assertThat(seLinuxOptions1.equals(seLinuxOptions2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 7AF040BDC9636F0BB0D63A495ADE273B
    @Test
    void testHashCode() {
        V1SELinuxOptions seLinuxOptions1 = new V1SELinuxOptions().level("s0").role("role").type("type").user("user");
        V1SELinuxOptions seLinuxOptions2 = new V1SELinuxOptions().level("s0").role("role").type("type").user("user");
        assertEquals(seLinuxOptions1.hashCode(), seLinuxOptions2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 2F784F0C554885E8CA5C183EF8D9288E
    @Test
    void testToString() {
        V1SELinuxOptions seLinuxOptions = new V1SELinuxOptions().level("s0").role("role").type("type").user("user");
        String expectedString = "class V1SELinuxOptions {\n    level: s0\n    role: role\n    type: type\n    user: user\n}";
        assertEquals(expectedString, seLinuxOptions.toString());
    }

    //BaseRock generated method id: ${testBuilder}, hash: 9FA48C0F0746D2A1DCEEE9ECE4D32910
    @Test
    void testBuilder() {
        V1SELinuxOptions seLinuxOptions = new V1SELinuxOptions().level("s0").role("role").type("type").user("user");
        assertThat(seLinuxOptions, is(notNullValue()));
        assertThat(seLinuxOptions.getLevel(), is(equalTo("s0")));
        assertThat(seLinuxOptions.getRole(), is(equalTo("role")));
        assertThat(seLinuxOptions.getType(), is(equalTo("type")));
        assertThat(seLinuxOptions.getUser(), is(equalTo("user")));
    }
}

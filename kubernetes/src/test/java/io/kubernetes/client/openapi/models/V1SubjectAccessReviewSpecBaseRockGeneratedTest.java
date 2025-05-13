package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import java.util.Map;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpec;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1NonResourceAttributes;
import java.util.ArrayList;
import static org.hamcrest.Matchers.hasEntry;
import io.kubernetes.client.openapi.models.V1ResourceAttributes;
import static org.hamcrest.Matchers.containsInAnyOrder;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1SubjectAccessReviewSpecBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1SubjectAccessReviewSpecConstructor}, hash: 0849D287F1480903B960975B225FA98C
    @Test
    void testV1SubjectAccessReviewSpecConstructor() {
        V1SubjectAccessReviewSpec spec = new V1SubjectAccessReviewSpec();
        assertNotNull(spec);
    }

    //BaseRock generated method id: ${testExtraField}, hash: E3CC997B120D7A9CE07A601EF98BA9C4
    @Test
    void testExtraField() {
        V1SubjectAccessReviewSpec spec = new V1SubjectAccessReviewSpec();
        Map<String, List<String>> extra = new HashMap<>();
        extra.put("key1", Arrays.asList("value1", "value2"));
        spec.setExtra(extra);
        assertEquals(extra, spec.getExtra());
        assertThat(spec.getExtra(), hasEntry("key1", Arrays.asList("value1", "value2")));
    }

    //BaseRock generated method id: ${testPutExtraItem}, hash: A85321EB2872412EB4CF4C9A2A30845C
    @Test
    void testPutExtraItem() {
        V1SubjectAccessReviewSpec spec = new V1SubjectAccessReviewSpec();
        spec.putExtraItem("key1", Arrays.asList("value1", "value2"));
        assertNotNull(spec.getExtra());
        assertThat(spec.getExtra(), hasEntry("key1", Arrays.asList("value1", "value2")));
    }

    //BaseRock generated method id: ${testGroupsField}, hash: BC928DE90D5282B77153913E041B244D
    @Test
    void testGroupsField() {
        V1SubjectAccessReviewSpec spec = new V1SubjectAccessReviewSpec();
        List<String> groups = Arrays.asList("group1", "group2");
        spec.setGroups(groups);
        assertEquals(groups, spec.getGroups());
    }

    //BaseRock generated method id: ${testAddGroupsItem}, hash: C4BA59C43D488AF706586F1A9BE72B75
    @Test
    void testAddGroupsItem() {
        V1SubjectAccessReviewSpec spec = new V1SubjectAccessReviewSpec();
        spec.addGroupsItem("group1");
        spec.addGroupsItem("group2");
        assertNotNull(spec.getGroups());
        assertThat(spec.getGroups(), containsInAnyOrder("group1", "group2"));
    }

    //BaseRock generated method id: ${testNonResourceAttributesField}, hash: 32DE6127C6673BEFDCC2ED7EB228671A
    @Test
    void testNonResourceAttributesField() {
        V1SubjectAccessReviewSpec spec = new V1SubjectAccessReviewSpec();
        V1NonResourceAttributes nonResourceAttributes = new V1NonResourceAttributes();
        spec.setNonResourceAttributes(nonResourceAttributes);
        assertEquals(nonResourceAttributes, spec.getNonResourceAttributes());
    }

    //BaseRock generated method id: ${testResourceAttributesField}, hash: 486979612DE5F473C3EAE1A698DA8712
    @Test
    void testResourceAttributesField() {
        V1SubjectAccessReviewSpec spec = new V1SubjectAccessReviewSpec();
        V1ResourceAttributes resourceAttributes = new V1ResourceAttributes();
        spec.setResourceAttributes(resourceAttributes);
        assertEquals(resourceAttributes, spec.getResourceAttributes());
    }

    //BaseRock generated method id: ${testUidField}, hash: B720E3E73BB808F39A7C371F6D35FC7F
    @Test
    void testUidField() {
        V1SubjectAccessReviewSpec spec = new V1SubjectAccessReviewSpec();
        String uid = "testUid";
        spec.setUid(uid);
        assertEquals(uid, spec.getUid());
    }

    //BaseRock generated method id: ${testUserField}, hash: 213FE84A60CF00619A34C217CA0D5716
    @Test
    void testUserField() {
        V1SubjectAccessReviewSpec spec = new V1SubjectAccessReviewSpec();
        String user = "testUser";
        spec.setUser(user);
        assertEquals(user, spec.getUser());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 2B02D0D71A404B5536B47734C6B0FFF0
    @Test
    void testEqualsAndHashCode() {
        V1SubjectAccessReviewSpec spec1 = new V1SubjectAccessReviewSpec().extra(new HashMap<>()).groups(new ArrayList<>()).nonResourceAttributes(new V1NonResourceAttributes()).resourceAttributes(new V1ResourceAttributes()).uid("uid1").user("user1");
        V1SubjectAccessReviewSpec spec2 = new V1SubjectAccessReviewSpec().extra(new HashMap<>()).groups(new ArrayList<>()).nonResourceAttributes(new V1NonResourceAttributes()).resourceAttributes(new V1ResourceAttributes()).uid("uid1").user("user1");
        V1SubjectAccessReviewSpec spec3 = new V1SubjectAccessReviewSpec().extra(new HashMap<>()).groups(new ArrayList<>()).nonResourceAttributes(new V1NonResourceAttributes()).resourceAttributes(new V1ResourceAttributes()).uid("uid2").user("user2");
        assertThat(spec1, is(equalTo(spec2)));
        assertThat(spec1.hashCode(), is(equalTo(spec2.hashCode())));
        assertThat(spec1, is(notNullValue()));
        assertThat(spec1, is(equalTo(spec1)));
        assertThat(spec1, is(notNullValue()));
        assertThat(spec1, is(notNullValue()));
        assertThat(spec1, is(notNullValue()));
        assertThat(spec1, is(notNullValue()));
        assertThat(spec1, is(notNullValue()));
        assertThat(spec1, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 57D35BF22A71CD412A6CB714DEF3DA7A
    @Test
    void testToString() {
        V1SubjectAccessReviewSpec spec = new V1SubjectAccessReviewSpec().extra(new HashMap<>()).groups(Arrays.asList("group1", "group2")).nonResourceAttributes(new V1NonResourceAttributes()).resourceAttributes(new V1ResourceAttributes()).uid("testUid").user("testUser");
        String toString = spec.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("extra"), is(true));
        assertThat(toString.contains("groups"), is(true));
        assertThat(toString.contains("nonResourceAttributes"), is(true));
        assertThat(toString.contains("resourceAttributes"), is(true));
        assertThat(toString.contains("uid"), is(true));
        assertThat(toString.contains("user"), is(true));
    }

    //BaseRock generated method id: ${testNullFields}, hash: DBC1BE7216C80645DC9FF84E0CA6889B
    @Disabled()
    @Test
    void testNullFields() {
        V1SubjectAccessReviewSpec spec = new V1SubjectAccessReviewSpec();
        assertThat(spec.getExtra(), is(notNullValue()));
        assertThat(spec.getGroups(), is(nullValue()));
        assertThat(spec.getNonResourceAttributes(), is(nullValue()));
        assertThat(spec.getResourceAttributes(), is(nullValue()));
        assertThat(spec.getUid(), is(nullValue()));
        assertThat(spec.getUser(), is(nullValue()));
    }
}

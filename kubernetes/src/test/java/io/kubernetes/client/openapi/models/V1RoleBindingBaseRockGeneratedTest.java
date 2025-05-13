package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1RoleBinding;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.RbacV1Subject;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import io.kubernetes.client.openapi.models.V1RoleRef;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1RoleBindingBaseRockGeneratedTest {

    private V1RoleBinding roleBinding;

    @BeforeEach
    void setUp() {
        roleBinding = new V1RoleBinding();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 81554E80BDAFA96E6CB14F6993AA38C6
    @Test
    void testApiVersion() {
        String apiVersion = "rbac.authorization.k8s.io/v1";
        roleBinding.setApiVersion(apiVersion);
        assertEquals(apiVersion, roleBinding.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 2CA4862332F68C0D87B24105F0E8D17C
    @Test
    void testKind() {
        String kind = "RoleBinding";
        roleBinding.setKind(kind);
        assertEquals(kind, roleBinding.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 14EB83AEA01C387D353610864C430543
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = new V1ObjectMeta();
        roleBinding.setMetadata(metadata);
        assertThat(roleBinding.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testRoleRef}, hash: 81A3CFF5CDE607E8CACF6BC254EFF5DF
    @Test
    void testRoleRef() {
        V1RoleRef roleRef = new V1RoleRef();
        roleBinding.setRoleRef(roleRef);
        assertThat(roleBinding.getRoleRef(), is(roleRef));
    }

    //BaseRock generated method id: ${testSubjects}, hash: 60968B5372FD15DEA5B05915AAB29B10
    @Test
    void testSubjects() {
        List<RbacV1Subject> subjects = new ArrayList<>();
        RbacV1Subject subject1 = new RbacV1Subject();
        RbacV1Subject subject2 = new RbacV1Subject();
        subjects.add(subject1);
        subjects.add(subject2);
        roleBinding.setSubjects(subjects);
        assertThat(roleBinding.getSubjects(), hasSize(2));
        assertThat(roleBinding.getSubjects(), containsInAnyOrder(subject1, subject2));
    }

    //BaseRock generated method id: ${testAddSubjectsItem}, hash: 81264C0BD6802CA6E101A8F113BBA211
    @Test
    void testAddSubjectsItem() {
        RbacV1Subject subject = new RbacV1Subject();
        roleBinding.addSubjectsItem(subject);
        assertThat(roleBinding.getSubjects(), hasSize(1));
        assertThat(roleBinding.getSubjects().get(0), is(subject));
    }

    //BaseRock generated method id: ${testEquals}, hash: 8B7D16115DD2EA3C76EE974BB8838A75
    @Test
    void testEquals() {
        V1RoleBinding roleBinding1 = new V1RoleBinding().apiVersion("v1").kind("RoleBinding").metadata(new V1ObjectMeta()).roleRef(new V1RoleRef()).subjects(new ArrayList<>());
        V1RoleBinding roleBinding2 = new V1RoleBinding().apiVersion("v1").kind("RoleBinding").metadata(new V1ObjectMeta()).roleRef(new V1RoleRef()).subjects(new ArrayList<>());
        assertThat(roleBinding1.equals(roleBinding2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 4B1120140B1F1B10CE7AA929A4941E00
    @Test
    void testHashCode() {
        V1RoleBinding roleBinding1 = new V1RoleBinding().apiVersion("v1").kind("RoleBinding").metadata(new V1ObjectMeta()).roleRef(new V1RoleRef()).subjects(new ArrayList<>());
        V1RoleBinding roleBinding2 = new V1RoleBinding().apiVersion("v1").kind("RoleBinding").metadata(new V1ObjectMeta()).roleRef(new V1RoleRef()).subjects(new ArrayList<>());
        assertThat(roleBinding1.hashCode(), equalTo(roleBinding2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 7D3503E222EE02DFD304A07328A43163
    @Test
    void testToString() {
        V1RoleBinding roleBinding = new V1RoleBinding().apiVersion("v1").kind("RoleBinding").metadata(new V1ObjectMeta()).roleRef(new V1RoleRef()).subjects(new ArrayList<>());
        String expected = "class V1RoleBinding {\n" + "    apiVersion: v1\n" + "    kind: RoleBinding\n" + "    metadata: class V1ObjectMeta {\n" + "        annotations: {}\n" + "        creationTimestamp: null\n" + "        deletionGracePeriodSeconds: null\n" + "        deletionTimestamp: null\n" + "        finalizers: []\n" + "        generateName: null\n" + "        generation: null\n" + "        labels: {}\n" + "        managedFields: []\n" + "        name: null\n" + "        namespace: null\n" + "        ownerReferences: []\n" + "        resourceVersion: null\n" + "        selfLink: null\n" + "        uid: null\n" + "    }\n" + "    roleRef: class V1RoleRef {\n" + "        apiGroup: null\n" + "        kind: null\n" + "        name: null\n" + "    }\n" + "    subjects: []\n" + "}";
        assertThat(roleBinding.toString(), equalTo(expected));
    }

    //BaseRock generated method id: ${testConstructor}, hash: CC68CAA4EB764B32AEE9BE8075B38A76
    @Test
    void testConstructor() {
        V1RoleBinding roleBinding = new V1RoleBinding();
        assertNotNull(roleBinding);
        assertThat(roleBinding.getApiVersion(), is(nullValue()));
        assertThat(roleBinding.getKind(), is(nullValue()));
        assertThat(roleBinding.getMetadata(), is(nullValue()));
        assertThat(roleBinding.getRoleRef(), is(nullValue()));
        assertThat(roleBinding.getSubjects(), is(notNullValue()));
        assertThat(roleBinding.getSubjects(), hasSize(0));
    }
}

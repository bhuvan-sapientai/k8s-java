package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.RbacV1Subject;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.CsvSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class RbacV1SubjectBaseRockGeneratedTest {

    //BaseRock generated method id: ${testRbacV1SubjectConstructor}, hash: B20FF4BD084C38118D73F6B0848E8C81
    @Test
    void testRbacV1SubjectConstructor() {
        RbacV1Subject subject = new RbacV1Subject();
        assertNotNull(subject);
    }

    //BaseRock generated method id: ${testApiGroup}, hash: 490E6E405C7ABF0C9D68ED3A1CEE046F
    @Test
    void testApiGroup() {
        RbacV1Subject subject = new RbacV1Subject();
        String apiGroup = "test-api-group";
        subject.setApiGroup(apiGroup);
        assertEquals(apiGroup, subject.getApiGroup());
    }

    //BaseRock generated method id: ${testKind}, hash: 6CB4F9C9D7BE499E0667C3F8976873BA
    @Test
    void testKind() {
        RbacV1Subject subject = new RbacV1Subject();
        String kind = "User";
        subject.setKind(kind);
        assertEquals(kind, subject.getKind());
    }

    //BaseRock generated method id: ${testName}, hash: 70E417C2C3C58B803159EA94CA5768CD
    @Test
    void testName() {
        RbacV1Subject subject = new RbacV1Subject();
        String name = "test-name";
        subject.setName(name);
        assertEquals(name, subject.getName());
    }

    //BaseRock generated method id: ${testNamespace}, hash: 6FD77428C80328149EC893A90DEF8A41
    @Test
    void testNamespace() {
        RbacV1Subject subject = new RbacV1Subject();
        String namespace = "test-namespace";
        subject.setNamespace(namespace);
        assertEquals(namespace, subject.getNamespace());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 47A7DD938F6A4C50E7AA7B05C7B02668
    @Test
    void testEqualsWithSameObject() {
        RbacV1Subject subject = new RbacV1Subject().apiGroup("test-api-group").kind("User").name("test-name").namespace("test-namespace");
        assertThat(subject.equals(subject), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 7B98198BB3F38C1D6C957C8F058E4C70
    @Test
    void testEqualsWithDifferentObject() {
        RbacV1Subject subject1 = new RbacV1Subject().apiGroup("test-api-group").kind("User").name("test-name").namespace("test-namespace");
        RbacV1Subject subject2 = new RbacV1Subject().apiGroup("test-api-group").kind("User").name("test-name").namespace("test-namespace");
        assertThat(subject1.equals(subject2), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentValues}, hash: 1B82D6E6E77100137DB79C8FD6A5C307
    @Test
    void testEqualsWithDifferentValues() {
        RbacV1Subject subject1 = new RbacV1Subject().apiGroup("test-api-group-1").kind("User").name("test-name-1").namespace("test-namespace-1");
        RbacV1Subject subject2 = new RbacV1Subject().apiGroup("test-api-group-2").kind("Group").name("test-name-2").namespace("test-namespace-2");
        assertThat(subject1.equals(subject2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 270C2F677BDA0D08D45238950B6ABE23
    @Test
    void testHashCode() {
        RbacV1Subject subject1 = new RbacV1Subject().apiGroup("test-api-group").kind("User").name("test-name").namespace("test-namespace");
        RbacV1Subject subject2 = new RbacV1Subject().apiGroup("test-api-group").kind("User").name("test-name").namespace("test-namespace");
        assertThat(subject1.hashCode(), equalTo(subject2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 02F6DCCEF41B0B3B06D06D00E29C8AA6
    @Test
    void testToString() {
        RbacV1Subject subject = new RbacV1Subject().apiGroup("test-api-group").kind("User").name("test-name").namespace("test-namespace");
        String expectedString = "class RbacV1Subject {\n    apiGroup: test-api-group\n    kind: User\n    name: test-name\n    namespace: test-namespace\n}";
        assertThat(subject.toString(), equalTo(expectedString));
    }

    //BaseRock generated method id: ${testRbacV1SubjectBuilder}, hash: 4D7A271ED4DFCBC7ECB0CFD169D6ECAC
    @ParameterizedTest
    @CsvSource({ "test-api-group,User,test-name,test-namespace", ",ServiceAccount,system:serviceaccount:kube-system:default,kube-system", "rbac.authorization.k8s.io,Group,system:authenticated," })
    void testRbacV1SubjectBuilder(String apiGroup, String kind, String name, String namespace) {
        RbacV1Subject subject = new RbacV1Subject().apiGroup(apiGroup).kind(kind).name(name).namespace(namespace);
        assertThat(subject, is(notNullValue()));
        assertThat(subject.getApiGroup(), is(equalTo(apiGroup)));
        assertThat(subject.getKind(), is(equalTo(kind)));
        assertThat(subject.getName(), is(equalTo(name)));
        assertThat(subject.getNamespace(), is(equalTo(namespace)));
    }

    //BaseRock generated method id: ${testSetNullKind}, hash: 87A88940D7C2B4077D3270F6C9A476BA
    @Test
    void testSetNullKind() {
        RbacV1Subject subject = new RbacV1Subject();
        assertDoesNotThrow(() -> subject.kind(null));
    }

    //BaseRock generated method id: ${testSetNullName}, hash: 0BA10983D62326BE2AB22F9786965A52
    @Test
    void testSetNullName() {
        RbacV1Subject subject = new RbacV1Subject();
        assertDoesNotThrow(() -> subject.name(null));
    }
}

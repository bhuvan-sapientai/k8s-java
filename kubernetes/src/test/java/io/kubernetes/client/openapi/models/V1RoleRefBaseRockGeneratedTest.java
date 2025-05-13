package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.CsvSource;
import io.kubernetes.client.openapi.models.V1RoleRef;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1RoleRefBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1RoleRefConstructor}, hash: DA59D4CC5EA01D6E5A4D84CDB7E802CE
    @Test
    void testV1RoleRefConstructor() {
        V1RoleRef roleRef = new V1RoleRef();
        assertThat(roleRef, is(notNullValue()));
    }

    //BaseRock generated method id: ${testApiGroup}, hash: A42C26F9A2EB496E81DA5A4754F866F1
    @Test
    void testApiGroup() {
        V1RoleRef roleRef = new V1RoleRef().apiGroup("rbac.authorization.k8s.io");
        assertThat(roleRef.getApiGroup(), is(equalTo("rbac.authorization.k8s.io")));
    }

    //BaseRock generated method id: ${testKind}, hash: E2852C93793E7C85A6488E7E6452A459
    @Test
    void testKind() {
        V1RoleRef roleRef = new V1RoleRef().kind("Role");
        assertThat(roleRef.getKind(), is(equalTo("Role")));
    }

    //BaseRock generated method id: ${testName}, hash: 9AD44F48F4B355EBADF93A78C9302D24
    @Test
    void testName() {
        V1RoleRef roleRef = new V1RoleRef().name("example-role");
        assertThat(roleRef.getName(), is(equalTo("example-role")));
    }

    //BaseRock generated method id: ${testSetApiGroup}, hash: 92FD411D7EB7522E221FF1D0B7B3D035
    @Test
    void testSetApiGroup() {
        V1RoleRef roleRef = new V1RoleRef();
        roleRef.setApiGroup("rbac.authorization.k8s.io");
        assertThat(roleRef.getApiGroup(), is(equalTo("rbac.authorization.k8s.io")));
    }

    //BaseRock generated method id: ${testSetKind}, hash: D089286C21B6D1B39C1BCFDE581A586E
    @Test
    void testSetKind() {
        V1RoleRef roleRef = new V1RoleRef();
        roleRef.setKind("Role");
        assertThat(roleRef.getKind(), is(equalTo("Role")));
    }

    //BaseRock generated method id: ${testSetName}, hash: 5F6AE5B8E1C34575F048ACE54AC43B4F
    @Test
    void testSetName() {
        V1RoleRef roleRef = new V1RoleRef();
        roleRef.setName("example-role");
        assertThat(roleRef.getName(), is(equalTo("example-role")));
    }

    //BaseRock generated method id: ${testEquals}, hash: B2A0C5697DEA90F418986C44EFE27CFD
    @Test
    void testEquals() {
        V1RoleRef roleRef1 = new V1RoleRef().apiGroup("rbac.authorization.k8s.io").kind("Role").name("example-role");
        V1RoleRef roleRef2 = new V1RoleRef().apiGroup("rbac.authorization.k8s.io").kind("Role").name("example-role");
        assertThat(roleRef1.equals(roleRef2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 7A0388A15EE368F3998CDD72B4625DB2
    @Test
    void testHashCode() {
        V1RoleRef roleRef1 = new V1RoleRef().apiGroup("rbac.authorization.k8s.io").kind("Role").name("example-role");
        V1RoleRef roleRef2 = new V1RoleRef().apiGroup("rbac.authorization.k8s.io").kind("Role").name("example-role");
        assertThat(roleRef1.hashCode(), is(equalTo(roleRef2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: A4AF64028C5277C393696BAD1D6F1AC8
    @Test
    void testToString() {
        V1RoleRef roleRef = new V1RoleRef().apiGroup("rbac.authorization.k8s.io").kind("Role").name("example-role");
        String expected = "class V1RoleRef {\n    apiGroup: rbac.authorization.k8s.io\n    kind: Role\n    name: example-role\n}";
        assertThat(roleRef.toString(), is(equalTo(expected)));
    }

    //BaseRock generated method id: ${testV1RoleRefWithDifferentValues}, hash: 03205B447FE2095526A4F24FBC9661CD
    @ParameterizedTest
    @CsvSource({ "rbac.authorization.k8s.io,Role,example-role", "apps,Deployment,nginx-deployment", "batch,Job,backup-job" })
    void testV1RoleRefWithDifferentValues(String apiGroup, String kind, String name) {
        V1RoleRef roleRef = new V1RoleRef().apiGroup(apiGroup).kind(kind).name(name);
        assertThat(roleRef.getApiGroup(), is(equalTo(apiGroup)));
        assertThat(roleRef.getKind(), is(equalTo(kind)));
        assertThat(roleRef.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testV1RoleRefNullValues}, hash: D9B1E942A19D5F022063E353139DB3C8
    @Test
    void testV1RoleRefNullValues() {
        V1RoleRef roleRef = new V1RoleRef();
        assertThat(roleRef.getApiGroup(), is(equalTo(null)));
        assertThat(roleRef.getKind(), is(equalTo(null)));
        assertThat(roleRef.getName(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetApiGroupNull}, hash: F9AC57377620E963029E7AD4CCC2AA16
    @Test
    void testSetApiGroupNull() {
        V1RoleRef roleRef = new V1RoleRef();
        assertDoesNotThrow(() -> roleRef.setApiGroup(null));
    }

    //BaseRock generated method id: ${testSetKindNull}, hash: 88BB67A14E1D0A486AB611984BE7C476
    @Test
    void testSetKindNull() {
        V1RoleRef roleRef = new V1RoleRef();
        assertDoesNotThrow(() -> roleRef.setKind(null));
    }

    //BaseRock generated method id: ${testSetNameNull}, hash: 2A18A3B03D8F10AE2F111267BF733CAB
    @Test
    void testSetNameNull() {
        V1RoleRef roleRef = new V1RoleRef();
        assertDoesNotThrow(() -> roleRef.setName(null));
    }
}

package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import io.kubernetes.client.openapi.models.V1VolumeMount;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1VolumeMountBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1VolumeMountConstructor}, hash: 90BB45D84B97ABD4D5F4887629F9F074
    @Test
    void testV1VolumeMountConstructor() {
        V1VolumeMount volumeMount = new V1VolumeMount();
        assertThat(volumeMount, is(notNullValue()));
    }

    //BaseRock generated method id: ${testMountPath}, hash: 78F2137898AF1236A6619AE9B1D2B6B9
    @Test
    void testMountPath() {
        V1VolumeMount volumeMount = new V1VolumeMount();
        String mountPath = "/test/path";
        volumeMount.setMountPath(mountPath);
        assertThat(volumeMount.getMountPath(), is(equalTo(mountPath)));
    }

    //BaseRock generated method id: ${testMountPathRequired}, hash: EF1BFDCC684474BC410B3700CD0E2E62
    @Disabled()
    @Test
    void testMountPathRequired() {
        V1VolumeMount volumeMount = new V1VolumeMount();
        assertThrows(NullPointerException.class, () -> volumeMount.mountPath(null));
    }

    //BaseRock generated method id: ${testMountPropagation}, hash: 290ED57AFE1503B267F9943F1514CC32
    @Test
    void testMountPropagation() {
        V1VolumeMount volumeMount = new V1VolumeMount();
        String mountPropagation = "Bidirectional";
        volumeMount.setMountPropagation(mountPropagation);
        assertThat(volumeMount.getMountPropagation(), is(equalTo(mountPropagation)));
    }

    //BaseRock generated method id: ${testName}, hash: 23452837ECC86489485AAE6C72FD8C1F
    @Test
    void testName() {
        V1VolumeMount volumeMount = new V1VolumeMount();
        String name = "test-volume";
        volumeMount.setName(name);
        assertThat(volumeMount.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testNameRequired}, hash: FE52BFA497FAB24020FD0AB808D88A4F
    @Disabled()
    @Test
    void testNameRequired() {
        V1VolumeMount volumeMount = new V1VolumeMount();
        assertThrows(NullPointerException.class, () -> volumeMount.name(null));
    }

    //BaseRock generated method id: ${testReadOnly}, hash: 4637C14A172BF44E40143A5B2AD3689F
    @Test
    void testReadOnly() {
        V1VolumeMount volumeMount = new V1VolumeMount();
        volumeMount.setReadOnly(true);
        assertThat(volumeMount.getReadOnly(), is(true));
    }

    //BaseRock generated method id: ${testRecursiveReadOnly}, hash: FD5CC312D2084051A048A73820F7ADE6
    @Test
    void testRecursiveReadOnly() {
        V1VolumeMount volumeMount = new V1VolumeMount();
        String recursiveReadOnly = "Enabled";
        volumeMount.setRecursiveReadOnly(recursiveReadOnly);
        assertThat(volumeMount.getRecursiveReadOnly(), is(equalTo(recursiveReadOnly)));
    }

    //BaseRock generated method id: ${testSubPath}, hash: B72AEAAB6544FF1055274DD5915C219C
    @Test
    void testSubPath() {
        V1VolumeMount volumeMount = new V1VolumeMount();
        String subPath = "data";
        volumeMount.setSubPath(subPath);
        assertThat(volumeMount.getSubPath(), is(equalTo(subPath)));
    }

    //BaseRock generated method id: ${testSubPathExpr}, hash: 5CABA50886665C758DFD14F6AC1C803F
    @Test
    void testSubPathExpr() {
        V1VolumeMount volumeMount = new V1VolumeMount();
        String subPathExpr = "$(POD_NAME)";
        volumeMount.setSubPathExpr(subPathExpr);
        assertThat(volumeMount.getSubPathExpr(), is(equalTo(subPathExpr)));
    }

    //BaseRock generated method id: ${testEquals}, hash: DFFF0AE6710BE99E6244F50ADACE9BBC
    @Test
    void testEquals() {
        V1VolumeMount volumeMount1 = new V1VolumeMount().mountPath("/test/path").name("test-volume").readOnly(true);
        V1VolumeMount volumeMount2 = new V1VolumeMount().mountPath("/test/path").name("test-volume").readOnly(true);
        assertThat(volumeMount1, is(equalTo(volumeMount2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 31DAC6C1D1930457E3003E25EC1D3A99
    @Test
    void testHashCode() {
        V1VolumeMount volumeMount1 = new V1VolumeMount().mountPath("/test/path").name("test-volume").readOnly(true);
        V1VolumeMount volumeMount2 = new V1VolumeMount().mountPath("/test/path").name("test-volume").readOnly(true);
        assertThat(volumeMount1.hashCode(), is(equalTo(volumeMount2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: C8D50FA366B44792AF567775B8F3BA5F
    @Test
    void testToString() {
        V1VolumeMount volumeMount = new V1VolumeMount().mountPath("/test/path").name("test-volume").readOnly(true);
        String expectedString = "class V1VolumeMount {\n" + "    mountPath: /test/path\n" + "    mountPropagation: null\n" + "    name: test-volume\n" + "    readOnly: true\n" + "    recursiveReadOnly: null\n" + "    subPath: null\n" + "    subPathExpr: null\n" + "}";
        assertThat(volumeMount.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testValidMountPropagationValues}, hash: 8D75EC6F9437AAA59BF6A9C9C9D5AE6D
    @ParameterizedTest
    @ValueSource(strings = { "None", "HostToContainer", "Bidirectional" })
    void testValidMountPropagationValues(String mountPropagation) {
        V1VolumeMount volumeMount = new V1VolumeMount().mountPropagation(mountPropagation);
        assertThat(volumeMount.getMountPropagation(), is(equalTo(mountPropagation)));
    }

    //BaseRock generated method id: ${testValidRecursiveReadOnlyValues}, hash: 34C1D9466139730F603FA49775224797
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Disabled", "IfPossible", "Enabled" })
    void testValidRecursiveReadOnlyValues(String recursiveReadOnly) {
        V1VolumeMount volumeMount = new V1VolumeMount().recursiveReadOnly(recursiveReadOnly);
        assertThat(volumeMount.getRecursiveReadOnly(), is(equalTo(recursiveReadOnly)));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: C341FC4D45A1E09CB6E1C0913166C5A8
    @Test
    void testBuilderPattern() {
        V1VolumeMount volumeMount = new V1VolumeMount().mountPath("/test/path").mountPropagation("Bidirectional").name("test-volume").readOnly(true).recursiveReadOnly("Enabled").subPath("data").subPathExpr("$(POD_NAME)");
        assertThat(volumeMount.getMountPath(), is(equalTo("/test/path")));
        assertThat(volumeMount.getMountPropagation(), is(equalTo("Bidirectional")));
        assertThat(volumeMount.getName(), is(equalTo("test-volume")));
        assertThat(volumeMount.getReadOnly(), is(true));
        assertThat(volumeMount.getRecursiveReadOnly(), is(equalTo("Enabled")));
        assertThat(volumeMount.getSubPath(), is(equalTo("data")));
        assertThat(volumeMount.getSubPathExpr(), is(equalTo("$(POD_NAME)")));
    }
}

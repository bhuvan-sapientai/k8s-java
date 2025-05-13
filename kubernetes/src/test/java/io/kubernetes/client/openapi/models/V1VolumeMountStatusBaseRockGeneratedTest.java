package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1VolumeMountStatus;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1VolumeMountStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1VolumeMountStatusConstruction}, hash: EBE1A72273D0A4C7F9C3D0CAA437E920
    @Test
    void testV1VolumeMountStatusConstruction() {
        V1VolumeMountStatus volumeMountStatus = new V1VolumeMountStatus();
        assertThat(volumeMountStatus, is(notNullValue()));
    }

    //BaseRock generated method id: ${testMountPath}, hash: 6CA1678216CED617CD1AA72F4F6FF2E6
    @Test
    void testMountPath() {
        V1VolumeMountStatus volumeMountStatus = new V1VolumeMountStatus();
        String mountPath = "/test/path";
        volumeMountStatus.setMountPath(mountPath);
        assertThat(volumeMountStatus.getMountPath(), is(equalTo(mountPath)));
    }

    //BaseRock generated method id: ${testName}, hash: 85DBA0E030E59B0EE71486D74449C631
    @Test
    void testName() {
        V1VolumeMountStatus volumeMountStatus = new V1VolumeMountStatus();
        String name = "test-volume";
        volumeMountStatus.setName(name);
        assertThat(volumeMountStatus.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testReadOnly}, hash: 9901F4C32AD7AE4EE2380A91DC94DF62
    @Test
    void testReadOnly() {
        V1VolumeMountStatus volumeMountStatus = new V1VolumeMountStatus();
        Boolean readOnly = true;
        volumeMountStatus.setReadOnly(readOnly);
        assertThat(volumeMountStatus.getReadOnly(), is(equalTo(readOnly)));
    }

    //BaseRock generated method id: ${testRecursiveReadOnly}, hash: AD8393462C0934A2B3B16A50FCC8C6EC
    @Test
    void testRecursiveReadOnly() {
        V1VolumeMountStatus volumeMountStatus = new V1VolumeMountStatus();
        String recursiveReadOnly = "Enabled";
        volumeMountStatus.setRecursiveReadOnly(recursiveReadOnly);
        assertThat(volumeMountStatus.getRecursiveReadOnly(), is(equalTo(recursiveReadOnly)));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 7F9828C9D62549A0CCB54E5F07C7D5F8
    @Test
    void testBuilder() {
        V1VolumeMountStatus volumeMountStatus = new V1VolumeMountStatus().mountPath("/test/path").name("test-volume").readOnly(true).recursiveReadOnly("Enabled");
        assertThat(volumeMountStatus.getMountPath(), is(equalTo("/test/path")));
        assertThat(volumeMountStatus.getName(), is(equalTo("test-volume")));
        assertThat(volumeMountStatus.getReadOnly(), is(equalTo(true)));
        assertThat(volumeMountStatus.getRecursiveReadOnly(), is(equalTo("Enabled")));
    }

    //BaseRock generated method id: ${testEquals}, hash: 84624B18993F3511EF8E2F1B512D9957
    @Test
    void testEquals() {
        V1VolumeMountStatus volumeMountStatus1 = new V1VolumeMountStatus().mountPath("/test/path").name("test-volume").readOnly(true).recursiveReadOnly("Enabled");
        V1VolumeMountStatus volumeMountStatus2 = new V1VolumeMountStatus().mountPath("/test/path").name("test-volume").readOnly(true).recursiveReadOnly("Enabled");
        assertThat(volumeMountStatus1.equals(volumeMountStatus2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 81FECC4F62E8DE0DD6042CAC9F818736
    @Test
    void testHashCode() {
        V1VolumeMountStatus volumeMountStatus1 = new V1VolumeMountStatus().mountPath("/test/path").name("test-volume").readOnly(true).recursiveReadOnly("Enabled");
        V1VolumeMountStatus volumeMountStatus2 = new V1VolumeMountStatus().mountPath("/test/path").name("test-volume").readOnly(true).recursiveReadOnly("Enabled");
        assertThat(volumeMountStatus1.hashCode(), is(equalTo(volumeMountStatus2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: B7D3141957C72E010F1C382C67CC8200
    @Test
    void testToString() {
        V1VolumeMountStatus volumeMountStatus = new V1VolumeMountStatus().mountPath("/test/path").name("test-volume").readOnly(true).recursiveReadOnly("Enabled");
        String expectedString = "class V1VolumeMountStatus {\n" + "    mountPath: /test/path\n" + "    name: test-volume\n" + "    readOnly: true\n" + "    recursiveReadOnly: Enabled\n" + "}";
        assertThat(volumeMountStatus.toString(), is(equalTo(expectedString)));
    }
}

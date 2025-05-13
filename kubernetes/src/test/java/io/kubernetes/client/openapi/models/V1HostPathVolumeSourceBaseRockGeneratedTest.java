package io.kubernetes.client.openapi.models;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1HostPathVolumeSource;
import static org.hamcrest.Matchers.not;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1HostPathVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 22CC38A94E1DCE908B960F4F85BF90FC
    @Test
    void testConstructor() {
        V1HostPathVolumeSource volumeSource = new V1HostPathVolumeSource();
        assertThat(volumeSource, is(not(nullValue())));
    }

    //BaseRock generated method id: ${testSetAndGetPath}, hash: AA06B694A60D72AD146546B614367BD3
    @Test
    void testSetAndGetPath() {
        V1HostPathVolumeSource volumeSource = new V1HostPathVolumeSource();
        String path = "/test/path";
        volumeSource.setPath(path);
        assertEquals(path, volumeSource.getPath());
    }

    //BaseRock generated method id: ${testSetAndGetPathWithDifferentValues}, hash: BEB502DBC7C8BED382361B057B28F484
    @ParameterizedTest
    @ValueSource(strings = { "/test/path", "/another/path", "/" })
    void testSetAndGetPathWithDifferentValues(String path) {
        V1HostPathVolumeSource volumeSource = new V1HostPathVolumeSource();
        volumeSource.setPath(path);
        assertEquals(path, volumeSource.getPath());
    }

    //BaseRock generated method id: ${testSetAndGetType}, hash: B252D78FAA02CE2B4E3D94AED9CE9405
    @Test
    void testSetAndGetType() {
        V1HostPathVolumeSource volumeSource = new V1HostPathVolumeSource();
        String type = "Directory";
        volumeSource.setType(type);
        assertEquals(type, volumeSource.getType());
    }

    //BaseRock generated method id: ${testSetAndGetTypeWithDifferentValues}, hash: CE0FCEAA181447C055C2B80D36E2EC57
    @ParameterizedTest
    @ValueSource(strings = { "Directory", "File", "Socket", "BlockDevice" })
    void testSetAndGetTypeWithDifferentValues(String type) {
        V1HostPathVolumeSource volumeSource = new V1HostPathVolumeSource();
        volumeSource.setType(type);
        assertEquals(type, volumeSource.getType());
    }

    //BaseRock generated method id: ${testSetAndGetTypeWithNullAndEmptyValues}, hash: 92397EA7B2B7160C1BC675F850F7FA99
    @ParameterizedTest
    @NullAndEmptySource
    void testSetAndGetTypeWithNullAndEmptyValues(String type) {
        V1HostPathVolumeSource volumeSource = new V1HostPathVolumeSource();
        volumeSource.setType(type);
        assertEquals(type, volumeSource.getType());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 1EF0022B8B2B43EA6184128038FC5C33
    @Test
    void testEqualsAndHashCode() {
        V1HostPathVolumeSource volumeSource1 = new V1HostPathVolumeSource().path("/test/path").type("Directory");
        V1HostPathVolumeSource volumeSource2 = new V1HostPathVolumeSource().path("/test/path").type("Directory");
        V1HostPathVolumeSource volumeSource3 = new V1HostPathVolumeSource().path("/other/path").type("File");
        assertAll(() -> assertEquals(volumeSource1, volumeSource2), () -> assertEquals(volumeSource1.hashCode(), volumeSource2.hashCode()), () -> assertNotEquals(volumeSource1, volumeSource3), () -> assertNotEquals(volumeSource1.hashCode(), volumeSource3.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 014068069A0EAAF21C69CE81707BE06D
    @Test
    void testToString() {
        V1HostPathVolumeSource volumeSource = new V1HostPathVolumeSource().path("/test/path").type("Directory");
        String expectedString = "class V1HostPathVolumeSource {\n" + "    path: /test/path\n" + "    type: Directory\n" + "}";
        assertEquals(expectedString, volumeSource.toString());
    }

    //BaseRock generated method id: ${testBuilder}, hash: 6E03765A68964B38ACE18B8730E4806E
    @Test
    void testBuilder() {
        V1HostPathVolumeSource volumeSource = new V1HostPathVolumeSource().path("/test/path").type("Directory");
        assertAll(() -> assertEquals("/test/path", volumeSource.getPath()), () -> assertEquals("Directory", volumeSource.getType()));
    }

    //BaseRock generated method id: ${testSetRequiredFieldPath}, hash: BA5365FAFF85EB458ED886511BE6F753
    @Disabled()
    @Test
    void testSetRequiredFieldPath() {
        V1HostPathVolumeSource volumeSource = new V1HostPathVolumeSource();
        assertThrows(NullPointerException.class, () -> volumeSource.path(null));
    }

    //BaseRock generated method id: ${testSetOptionalFieldType}, hash: 8A2B512030A39F3CFB91E58981208CDA
    @Test
    void testSetOptionalFieldType() {
        V1HostPathVolumeSource volumeSource = new V1HostPathVolumeSource();
        volumeSource.type(null);
        assertThat(volumeSource.getType(), is(nullValue()));
    }
}

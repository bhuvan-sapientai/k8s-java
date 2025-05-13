package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ModifyVolumeStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 8B9AC7FAE856201D4FA54237335B6915
    @Test
    void testConstructor() {
        V1ModifyVolumeStatus status = new V1ModifyVolumeStatus();
        assertNotNull(status);
    }

    //BaseRock generated method id: ${testSetAndGetStatus}, hash: 5DC18886DBE5EBCA77BE24373B1D5FC5
    @Test
    void testSetAndGetStatus() {
        V1ModifyVolumeStatus status = new V1ModifyVolumeStatus();
        status.setStatus("Pending");
        assertEquals("Pending", status.getStatus());
    }

    //BaseRock generated method id: ${testSetAndGetStatusWithValidValues}, hash: 3C93D2EE65F20873466293A885693359
    @ParameterizedTest
    @ValueSource(strings = { "Pending", "InProgress", "Infeasible" })
    void testSetAndGetStatusWithValidValues(String statusValue) {
        V1ModifyVolumeStatus status = new V1ModifyVolumeStatus();
        status.setStatus(statusValue);
        assertEquals(statusValue, status.getStatus());
    }

    //BaseRock generated method id: ${testSetAndGetTargetVolumeAttributesClassName}, hash: FFCE6319AC0470388A01AD8B06B44861
    @Test
    void testSetAndGetTargetVolumeAttributesClassName() {
        V1ModifyVolumeStatus status = new V1ModifyVolumeStatus();
        status.setTargetVolumeAttributesClassName("test-class");
        assertEquals("test-class", status.getTargetVolumeAttributesClassName());
    }

    //BaseRock generated method id: ${testSetAndGetTargetVolumeAttributesClassNameWithDifferentValues}, hash: BF6C3FC96613DA323EE2F901454E225D
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "class1", "class2" })
    void testSetAndGetTargetVolumeAttributesClassNameWithDifferentValues(String className) {
        V1ModifyVolumeStatus status = new V1ModifyVolumeStatus();
        status.setTargetVolumeAttributesClassName(className);
        assertEquals(className, status.getTargetVolumeAttributesClassName());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 6542D2E7B06C695011F2DA19739F5EA0
    @Test
    void testEqualsAndHashCode() {
        V1ModifyVolumeStatus status1 = new V1ModifyVolumeStatus().status("Pending").targetVolumeAttributesClassName("class1");
        V1ModifyVolumeStatus status2 = new V1ModifyVolumeStatus().status("Pending").targetVolumeAttributesClassName("class1");
        V1ModifyVolumeStatus status3 = new V1ModifyVolumeStatus().status("InProgress").targetVolumeAttributesClassName("class2");
        assertThat(status1, equalTo(status2));
        assertThat(status1.hashCode(), equalTo(status2.hashCode()));
        assertThat(status1, is(not(equalTo(status3))));
    }

    //BaseRock generated method id: ${testToString}, hash: BA583AF99E3F923277A6EBF426A58977
    @Test
    void testToString() {
        V1ModifyVolumeStatus status = new V1ModifyVolumeStatus().status("Pending").targetVolumeAttributesClassName("test-class");
        String expectedString = "class V1ModifyVolumeStatus {\n" + "    status: Pending\n" + "    targetVolumeAttributesClassName: test-class\n" + "}";
        assertEquals(expectedString, status.toString());
    }

    //BaseRock generated method id: ${testSetNullStatus}, hash: B8D8CC3705B9F7712F5701376F90916D
    @Test
    void testSetNullStatus() {
        V1ModifyVolumeStatus status = new V1ModifyVolumeStatus();
        status.setStatus(null);
        assertNull(status.getStatus());
    }

    //BaseRock generated method id: ${testBuilder}, hash: 795891E4A9ADA83C4184DD327039BB77
    @Test
    void testBuilder() {
        V1ModifyVolumeStatus status = new V1ModifyVolumeStatus().status("InProgress").targetVolumeAttributesClassName("test-class");
        assertThat(status.getStatus(), equalTo("InProgress"));
        assertThat(status.getTargetVolumeAttributesClassName(), equalTo("test-class"));
    }
}

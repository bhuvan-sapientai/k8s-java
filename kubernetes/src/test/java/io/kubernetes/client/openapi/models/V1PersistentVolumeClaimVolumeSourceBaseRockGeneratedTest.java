package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PersistentVolumeClaimVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 1930558EE081C395CEA0C4CF25D23682
    @Test
    void testConstructor() {
        V1PersistentVolumeClaimVolumeSource source = new V1PersistentVolumeClaimVolumeSource();
        assertThat(source, is(notNullValue()));
    }

    //BaseRock generated method id: ${testClaimName}, hash: 0C6AFCA4F8530281A142C7DCBA041C56
    @Test
    void testClaimName() {
        V1PersistentVolumeClaimVolumeSource source = new V1PersistentVolumeClaimVolumeSource();
        String claimName = "test-claim";
        source.setClaimName(claimName);
        assertEquals(claimName, source.getClaimName());
    }

    //BaseRock generated method id: ${testReadOnly}, hash: 16F38833D9D35E189B09902C06A7C82E
    @Test
    void testReadOnly() {
        V1PersistentVolumeClaimVolumeSource source = new V1PersistentVolumeClaimVolumeSource();
        source.setReadOnly(true);
        assertTrue(source.getReadOnly());
        source.setReadOnly(false);
        assertFalse(source.getReadOnly());
        source.setReadOnly(null);
        assertNull(source.getReadOnly());
    }

    //BaseRock generated method id: ${testEquals}, hash: DA68F6C26DA1D0EC527611A806D4482B
    @Test
    void testEquals() {
        V1PersistentVolumeClaimVolumeSource source1 = new V1PersistentVolumeClaimVolumeSource().claimName("claim1").readOnly(true);
        V1PersistentVolumeClaimVolumeSource source2 = new V1PersistentVolumeClaimVolumeSource().claimName("claim1").readOnly(true);
        V1PersistentVolumeClaimVolumeSource source3 = new V1PersistentVolumeClaimVolumeSource().claimName("claim2").readOnly(false);
        assertTrue(source1.equals(source2));
        assertFalse(source1.equals(source3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 62B4CA1E57DD567D63829C76C83A4A61
    @Test
    void testHashCode() {
        V1PersistentVolumeClaimVolumeSource source1 = new V1PersistentVolumeClaimVolumeSource().claimName("claim1").readOnly(true);
        V1PersistentVolumeClaimVolumeSource source2 = new V1PersistentVolumeClaimVolumeSource().claimName("claim1").readOnly(true);
        assertEquals(source1.hashCode(), source2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 88C970B80399EDCB08F59A2935D78C96
    @Test
    void testToString() {
        V1PersistentVolumeClaimVolumeSource source = new V1PersistentVolumeClaimVolumeSource().claimName("test-claim").readOnly(true);
        String expected = "class V1PersistentVolumeClaimVolumeSource {\n" + "    claimName: test-claim\n" + "    readOnly: true\n" + "}";
        assertEquals(expected, source.toString());
    }
}

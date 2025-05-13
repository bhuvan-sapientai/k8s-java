package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1StatefulSetPersistentVolumeClaimRetentionPolicyBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 614108D358BFEA7F68D6010BE10DA9F3
    @Test
    void testConstructor() {
        V1StatefulSetPersistentVolumeClaimRetentionPolicy policy = new V1StatefulSetPersistentVolumeClaimRetentionPolicy();
        assertNotNull(policy);
    }

    //BaseRock generated method id: ${testWhenDeletedSetter}, hash: 4813351816D7FD36B98CD4C611E6CE69
    @Test
    void testWhenDeletedSetter() {
        V1StatefulSetPersistentVolumeClaimRetentionPolicy policy = new V1StatefulSetPersistentVolumeClaimRetentionPolicy();
        policy.setWhenDeleted("Retain");
        assertEquals("Retain", policy.getWhenDeleted());
    }

    //BaseRock generated method id: ${testWhenScaledSetter}, hash: F8A52F197092FBE4591800A0C0C9715E
    @Test
    void testWhenScaledSetter() {
        V1StatefulSetPersistentVolumeClaimRetentionPolicy policy = new V1StatefulSetPersistentVolumeClaimRetentionPolicy();
        policy.setWhenScaled("Delete");
        assertEquals("Delete", policy.getWhenScaled());
    }

    //BaseRock generated method id: ${testWhenDeletedSetterWithVariousValues}, hash: CCA3B4FFCF5E3C16FC592703179DA929
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Retain", "Delete" })
    void testWhenDeletedSetterWithVariousValues(String value) {
        V1StatefulSetPersistentVolumeClaimRetentionPolicy policy = new V1StatefulSetPersistentVolumeClaimRetentionPolicy();
        policy.setWhenDeleted(value);
        assertEquals(value, policy.getWhenDeleted());
    }

    //BaseRock generated method id: ${testWhenScaledSetterWithVariousValues}, hash: 0956EAFA6722EBEBD6DAA843370C2E14
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Retain", "Delete" })
    void testWhenScaledSetterWithVariousValues(String value) {
        V1StatefulSetPersistentVolumeClaimRetentionPolicy policy = new V1StatefulSetPersistentVolumeClaimRetentionPolicy();
        policy.setWhenScaled(value);
        assertEquals(value, policy.getWhenScaled());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 6EEC8114F4B9D4FB32CBFCFD8E3E513B
    @Test
    void testEqualsWithSameObject() {
        V1StatefulSetPersistentVolumeClaimRetentionPolicy policy = new V1StatefulSetPersistentVolumeClaimRetentionPolicy();
        assertTrue(policy.equals(policy));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 39CB8D0ECCC30204A16CA4067ACCC3C9
    @Test
    void testEqualsWithDifferentClass() {
        V1StatefulSetPersistentVolumeClaimRetentionPolicy policy = new V1StatefulSetPersistentVolumeClaimRetentionPolicy();
        assertFalse(policy.equals(new Object()));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObjects}, hash: 98367A0D06C5D7B07057389F27BD49C8
    @Test
    void testEqualsWithDifferentObjects() {
        V1StatefulSetPersistentVolumeClaimRetentionPolicy policy1 = new V1StatefulSetPersistentVolumeClaimRetentionPolicy().whenDeleted("Retain").whenScaled("Delete");
        V1StatefulSetPersistentVolumeClaimRetentionPolicy policy2 = new V1StatefulSetPersistentVolumeClaimRetentionPolicy().whenDeleted("Delete").whenScaled("Retain");
        assertFalse(policy1.equals(policy2));
    }

    //BaseRock generated method id: ${testEqualsWithSameValues}, hash: 44FFCAB9454C7851DA87BC0BA5F9E220
    @Test
    void testEqualsWithSameValues() {
        V1StatefulSetPersistentVolumeClaimRetentionPolicy policy1 = new V1StatefulSetPersistentVolumeClaimRetentionPolicy().whenDeleted("Retain").whenScaled("Delete");
        V1StatefulSetPersistentVolumeClaimRetentionPolicy policy2 = new V1StatefulSetPersistentVolumeClaimRetentionPolicy().whenDeleted("Retain").whenScaled("Delete");
        assertTrue(policy1.equals(policy2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 2280EB2ACC58C7894E2C264DE06AB04D
    @Test
    void testHashCode() {
        V1StatefulSetPersistentVolumeClaimRetentionPolicy policy1 = new V1StatefulSetPersistentVolumeClaimRetentionPolicy().whenDeleted("Retain").whenScaled("Delete");
        V1StatefulSetPersistentVolumeClaimRetentionPolicy policy2 = new V1StatefulSetPersistentVolumeClaimRetentionPolicy().whenDeleted("Retain").whenScaled("Delete");
        assertEquals(policy1.hashCode(), policy2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 9E0BF3292BDEC3E91D63F7B1359FA43D
    @Test
    void testToString() {
        V1StatefulSetPersistentVolumeClaimRetentionPolicy policy = new V1StatefulSetPersistentVolumeClaimRetentionPolicy().whenDeleted("Retain").whenScaled("Delete");
        String expected = "class V1StatefulSetPersistentVolumeClaimRetentionPolicy {\n    whenDeleted: Retain\n    whenScaled: Delete\n}";
        assertEquals(expected, policy.toString());
    }

    //BaseRock generated method id: ${testToJson}, hash: CFE58F119D3D087CF0B055409ACC7B43
    @Test
    void testToJson() throws Exception {
        V1StatefulSetPersistentVolumeClaimRetentionPolicy policy = new V1StatefulSetPersistentVolumeClaimRetentionPolicy().whenDeleted("Retain").whenScaled("Delete");
        String expected = "{\"whenDeleted\":\"Retain\",\"whenScaled\":\"Delete\"}";
        assertEquals(expected, policy.toJson());
    }

    //BaseRock generated method id: ${testFromJson}, hash: 96933A890E3DC731FFEBAC7F41B9576E
    @Test
    void testFromJson() throws Exception {
        String json = "{\"whenDeleted\":\"Retain\",\"whenScaled\":\"Delete\"}";
        V1StatefulSetPersistentVolumeClaimRetentionPolicy policy = V1StatefulSetPersistentVolumeClaimRetentionPolicy.fromJson(json);
        assertEquals("Retain", policy.getWhenDeleted());
        assertEquals("Delete", policy.getWhenScaled());
    }
}

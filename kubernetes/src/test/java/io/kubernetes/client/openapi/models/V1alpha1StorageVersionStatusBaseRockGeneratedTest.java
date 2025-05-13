package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha1StorageVersionStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 642ABD3534EFEA6CBBB0742E69AACB0B
    @Test
    void testConstructor() {
        V1alpha1StorageVersionStatus status = new V1alpha1StorageVersionStatus();
        assertNotNull(status);
    }

    //BaseRock generated method id: ${testCommonEncodingVersion}, hash: DC532F878D9C91813968362DC169B46E
    @Test
    void testCommonEncodingVersion() {
        V1alpha1StorageVersionStatus status = new V1alpha1StorageVersionStatus();
        String version = "v1";
        status.setCommonEncodingVersion(version);
        assertEquals(version, status.getCommonEncodingVersion());
    }

    //BaseRock generated method id: ${testConditions}, hash: 8686A78BD23CEBDB5FC855F5227A1DE8
    @Test
    void testConditions() {
        V1alpha1StorageVersionStatus status = new V1alpha1StorageVersionStatus();
        List<V1alpha1StorageVersionCondition> conditions = new ArrayList<>();
        V1alpha1StorageVersionCondition condition = new V1alpha1StorageVersionCondition();
        conditions.add(condition);
        status.setConditions(conditions);
        assertThat(status.getConditions(), hasSize(1));
        assertThat(status.getConditions().get(0), is(condition));
    }

    //BaseRock generated method id: ${testAddConditionsItem}, hash: 9C28D0BEFD01F3A0A7C5481B1D8FE5E7
    @Test
    void testAddConditionsItem() {
        V1alpha1StorageVersionStatus status = new V1alpha1StorageVersionStatus();
        V1alpha1StorageVersionCondition condition = new V1alpha1StorageVersionCondition();
        status.addConditionsItem(condition);
        assertThat(status.getConditions(), hasSize(1));
        assertThat(status.getConditions().get(0), is(condition));
    }

    //BaseRock generated method id: ${testStorageVersions}, hash: CD7090BA2184CDAEC61DD09F882D8119
    @Test
    void testStorageVersions() {
        V1alpha1StorageVersionStatus status = new V1alpha1StorageVersionStatus();
        List<V1alpha1ServerStorageVersion> storageVersions = new ArrayList<>();
        V1alpha1ServerStorageVersion storageVersion = new V1alpha1ServerStorageVersion();
        storageVersions.add(storageVersion);
        status.setStorageVersions(storageVersions);
        assertThat(status.getStorageVersions(), hasSize(1));
        assertThat(status.getStorageVersions().get(0), is(storageVersion));
    }

    //BaseRock generated method id: ${testAddStorageVersionsItem}, hash: 2346F7557F89A1E9046B670C97CC2E77
    @Test
    void testAddStorageVersionsItem() {
        V1alpha1StorageVersionStatus status = new V1alpha1StorageVersionStatus();
        V1alpha1ServerStorageVersion storageVersion = new V1alpha1ServerStorageVersion();
        status.addStorageVersionsItem(storageVersion);
        assertThat(status.getStorageVersions(), hasSize(1));
        assertThat(status.getStorageVersions().get(0), is(storageVersion));
    }

    //BaseRock generated method id: ${testEquals}, hash: 5D9059FD72CBEB0F32BA012E489A3BE7
    @Test
    void testEquals() {
        V1alpha1StorageVersionStatus status1 = new V1alpha1StorageVersionStatus().commonEncodingVersion("v1").addConditionsItem(new V1alpha1StorageVersionCondition()).addStorageVersionsItem(new V1alpha1ServerStorageVersion());
        V1alpha1StorageVersionStatus status2 = new V1alpha1StorageVersionStatus().commonEncodingVersion("v1").addConditionsItem(new V1alpha1StorageVersionCondition()).addStorageVersionsItem(new V1alpha1ServerStorageVersion());
        assertThat(status1.equals(status2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 79F9155B5CA908564AC4660136DB8159
    @Test
    void testHashCode() {
        V1alpha1StorageVersionStatus status1 = new V1alpha1StorageVersionStatus().commonEncodingVersion("v1").addConditionsItem(new V1alpha1StorageVersionCondition()).addStorageVersionsItem(new V1alpha1ServerStorageVersion());
        V1alpha1StorageVersionStatus status2 = new V1alpha1StorageVersionStatus().commonEncodingVersion("v1").addConditionsItem(new V1alpha1StorageVersionCondition()).addStorageVersionsItem(new V1alpha1ServerStorageVersion());
        assertThat(status1.hashCode(), equalTo(status2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: F8AA548C7E513A9C860898F3B259E54E
    @Test
    void testToString() {
        V1alpha1StorageVersionStatus status = new V1alpha1StorageVersionStatus().commonEncodingVersion("v1").addConditionsItem(new V1alpha1StorageVersionCondition()).addStorageVersionsItem(new V1alpha1ServerStorageVersion());
        String toString = status.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("commonEncodingVersion"), is(true));
        assertThat(toString.contains("conditions"), is(true));
        assertThat(toString.contains("storageVersions"), is(true));
    }

    //BaseRock generated method id: ${testSetNullValues}, hash: A943EFB0BD546DA8841BC6E1C61327CA
    @Test
    void testSetNullValues() {
        V1alpha1StorageVersionStatus status = new V1alpha1StorageVersionStatus();
        status.setCommonEncodingVersion(null);
        status.setConditions(null);
        status.setStorageVersions(null);
        assertThat(status.getCommonEncodingVersion(), nullValue());
        assertThat(status.getConditions(), nullValue());
        assertThat(status.getStorageVersions(), nullValue());
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 37C1AF8632B297A2D5FCDC2E24BD2C82
    @Test
    void testBuilderPattern() {
        V1alpha1StorageVersionStatus status = new V1alpha1StorageVersionStatus().commonEncodingVersion("v1").addConditionsItem(new V1alpha1StorageVersionCondition()).addStorageVersionsItem(new V1alpha1ServerStorageVersion());
        assertThat(status.getCommonEncodingVersion(), equalTo("v1"));
        assertThat(status.getConditions(), hasSize(1));
        assertThat(status.getStorageVersions(), hasSize(1));
    }

    //BaseRock generated method id: ${testMultipleItemsInLists}, hash: EE513447224D2BA765BA7860814222A3
    @Test
    void testMultipleItemsInLists() {
        V1alpha1StorageVersionStatus status = new V1alpha1StorageVersionStatus();
        V1alpha1StorageVersionCondition condition1 = new V1alpha1StorageVersionCondition();
        V1alpha1StorageVersionCondition condition2 = new V1alpha1StorageVersionCondition();
        V1alpha1ServerStorageVersion version1 = new V1alpha1ServerStorageVersion();
        V1alpha1ServerStorageVersion version2 = new V1alpha1ServerStorageVersion();
        status.addConditionsItem(condition1);
        status.addConditionsItem(condition2);
        status.addStorageVersionsItem(version1);
        status.addStorageVersionsItem(version2);
        assertThat(status.getConditions(), hasSize(2));
        assertThat(status.getConditions(), containsInAnyOrder(condition1, condition2));
        assertThat(status.getStorageVersions(), hasSize(2));
        assertThat(status.getStorageVersions(), containsInAnyOrder(version1, version2));
    }
}

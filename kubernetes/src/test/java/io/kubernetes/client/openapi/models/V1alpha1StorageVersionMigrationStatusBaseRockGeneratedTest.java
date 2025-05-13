package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1alpha1MigrationCondition;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.models.V1alpha1StorageVersionMigrationStatus;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha1StorageVersionMigrationStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1alpha1StorageVersionMigrationStatusConstructor}, hash: 710F620D554AAB614AC7B5C476CC70C7
    @Test
    void testV1alpha1StorageVersionMigrationStatusConstructor() {
        V1alpha1StorageVersionMigrationStatus status = new V1alpha1StorageVersionMigrationStatus();
        assertNotNull(status);
    }

    //BaseRock generated method id: ${testConditions}, hash: 7B901296B40B9F877A7C54CD992F6BD4
    @Test
    void testConditions() {
        V1alpha1StorageVersionMigrationStatus status = new V1alpha1StorageVersionMigrationStatus();
        List<V1alpha1MigrationCondition> conditions = new ArrayList<>();
        V1alpha1MigrationCondition condition = mock(V1alpha1MigrationCondition.class);
        conditions.add(condition);
        status.setConditions(conditions);
        assertEquals(conditions, status.getConditions());
        status.addConditionsItem(mock(V1alpha1MigrationCondition.class));
        assertThat(status.getConditions(), hasSize(2));
    }

    //BaseRock generated method id: ${testResourceVersion}, hash: 6F5A334837F7733BC2DC994E17F57915
    @ParameterizedTest
    @ValueSource(strings = { "version1", "version2", "" })
    void testResourceVersion(String version) {
        V1alpha1StorageVersionMigrationStatus status = new V1alpha1StorageVersionMigrationStatus();
        status.setResourceVersion(version);
        assertEquals(version, status.getResourceVersion());
    }

    //BaseRock generated method id: ${testEquals}, hash: 948DFC9A0F8DDE631D89031F55A6E399
    @Test
    void testEquals() {
        V1alpha1StorageVersionMigrationStatus status1 = new V1alpha1StorageVersionMigrationStatus().resourceVersion("version1");
        V1alpha1StorageVersionMigrationStatus status2 = new V1alpha1StorageVersionMigrationStatus().resourceVersion("version1");
        V1alpha1StorageVersionMigrationStatus status3 = new V1alpha1StorageVersionMigrationStatus().resourceVersion("version2");
        assertThat(status1.equals(status2), is(true));
        assertThat(status1.equals(status3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 7B0EE3F8FA0F70394BBD0EE9673654AB
    @Test
    void testHashCode() {
        V1alpha1StorageVersionMigrationStatus status1 = new V1alpha1StorageVersionMigrationStatus().resourceVersion("version1");
        V1alpha1StorageVersionMigrationStatus status2 = new V1alpha1StorageVersionMigrationStatus().resourceVersion("version1");
        assertEquals(status1.hashCode(), status2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 72BBD7F0EB8893A5C836ACD8042656B7
    @Test
    void testToString() {
        V1alpha1StorageVersionMigrationStatus status = new V1alpha1StorageVersionMigrationStatus().resourceVersion("version1");
        String result = status.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("resourceVersion"), is(true));
        assertThat(result.contains("version1"), is(true));
    }

    //BaseRock generated method id: ${testToIndentedString}, hash: 7A7EEEF3FD422B98E0606D98896E646D
    @Test
    void testToIndentedString() {
        V1alpha1StorageVersionMigrationStatus status = new V1alpha1StorageVersionMigrationStatus().resourceVersion("version1");
        V1alpha1MigrationCondition condition = mock(V1alpha1MigrationCondition.class);
        when(condition.toString()).thenReturn("condition1");
        status.addConditionsItem(condition);
        String result = status.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("resourceVersion"), is(true));
        assertThat(result.contains("version1"), is(true));
        assertThat(result.contains("condition1"), is(true));
    }
}

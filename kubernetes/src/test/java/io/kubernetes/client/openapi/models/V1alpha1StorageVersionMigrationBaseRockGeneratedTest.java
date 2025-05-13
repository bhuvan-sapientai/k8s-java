package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1alpha1StorageVersionMigrationSpec;
import io.kubernetes.client.openapi.models.V1alpha1StorageVersionMigrationStatus;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha1StorageVersionMigrationBaseRockGeneratedTest {

    private V1alpha1StorageVersionMigration storageVersionMigration;

    @BeforeEach
    void setUp() {
        storageVersionMigration = new V1alpha1StorageVersionMigration();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 222F8182311299D7C96897EE5DA2CE62
    @Test
    void testApiVersion() {
        String apiVersion = "v1alpha1";
        storageVersionMigration.setApiVersion(apiVersion);
        assertEquals(apiVersion, storageVersionMigration.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 0810466ABC06413F2CBE2E1B9E36F3E5
    @Test
    void testKind() {
        String kind = "StorageVersionMigration";
        storageVersionMigration.setKind(kind);
        assertEquals(kind, storageVersionMigration.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 05D2AED7A6549365F5299A026B703B01
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        storageVersionMigration.setMetadata(metadata);
        assertThat(storageVersionMigration.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testSpec}, hash: 8C0E20F1CF56FE56F74BE9202BDA5373
    @Test
    void testSpec() {
        V1alpha1StorageVersionMigrationSpec spec = mock(V1alpha1StorageVersionMigrationSpec.class);
        storageVersionMigration.setSpec(spec);
        assertThat(storageVersionMigration.getSpec(), is(equalTo(spec)));
    }

    //BaseRock generated method id: ${testStatus}, hash: 9C400D662A2A6F3ADDDA42C4084B487A
    @Test
    void testStatus() {
        V1alpha1StorageVersionMigrationStatus status = mock(V1alpha1StorageVersionMigrationStatus.class);
        storageVersionMigration.setStatus(status);
        assertThat(storageVersionMigration.getStatus(), is(equalTo(status)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 61362D48FAB91E10DEFAD55CBA5A7B31
    @Test
    void testEquals() {
        V1ObjectMeta metadata1 = new V1ObjectMeta();
        V1alpha1StorageVersionMigrationSpec spec1 = new V1alpha1StorageVersionMigrationSpec();
        V1alpha1StorageVersionMigrationStatus status1 = new V1alpha1StorageVersionMigrationStatus();
        V1alpha1StorageVersionMigration migration1 = new V1alpha1StorageVersionMigration().apiVersion("v1alpha1").kind("StorageVersionMigration").metadata(metadata1).spec(spec1).status(status1);
        V1ObjectMeta metadata2 = new V1ObjectMeta();
        V1alpha1StorageVersionMigrationSpec spec2 = new V1alpha1StorageVersionMigrationSpec();
        V1alpha1StorageVersionMigrationStatus status2 = new V1alpha1StorageVersionMigrationStatus();
        V1alpha1StorageVersionMigration migration2 = new V1alpha1StorageVersionMigration().apiVersion("v1alpha1").kind("StorageVersionMigration").metadata(metadata2).spec(spec2).status(status2);
        assertThat(migration1.equals(migration2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 87E498E0006B7FC49AE66502C90EC57D
    @Test
    void testHashCode() {
        V1alpha1StorageVersionMigration migration = new V1alpha1StorageVersionMigration().apiVersion("v1alpha1").kind("StorageVersionMigration").metadata(new V1ObjectMeta()).spec(new V1alpha1StorageVersionMigrationSpec()).status(new V1alpha1StorageVersionMigrationStatus());
        assertThat(migration.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: C84ACC09D86CAAA1A68D74B85FAB38CF
    @Test
    void testToString() {
        V1alpha1StorageVersionMigration migration = new V1alpha1StorageVersionMigration().apiVersion("v1alpha1").kind("StorageVersionMigration").metadata(new V1ObjectMeta()).spec(new V1alpha1StorageVersionMigrationSpec()).status(new V1alpha1StorageVersionMigrationStatus());
        String result = migration.toString();
        assertNotNull(result);
        assertThat(result.contains("apiVersion"), is(true));
        assertThat(result.contains("kind"), is(true));
        assertThat(result.contains("metadata"), is(true));
        assertThat(result.contains("spec"), is(true));
        assertThat(result.contains("status"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 06F10C196B93C84735A7609CF1C45F3B
    @Test
    void testBuilder() {
        V1ObjectMeta metadata = new V1ObjectMeta();
        V1alpha1StorageVersionMigrationSpec spec = new V1alpha1StorageVersionMigrationSpec();
        V1alpha1StorageVersionMigrationStatus status = new V1alpha1StorageVersionMigrationStatus();
        V1alpha1StorageVersionMigration migration = new V1alpha1StorageVersionMigration().apiVersion("v1alpha1").kind("StorageVersionMigration").metadata(metadata).spec(spec).status(status);
        assertThat(migration.getApiVersion(), is(equalTo("v1alpha1")));
        assertThat(migration.getKind(), is(equalTo("StorageVersionMigration")));
        assertThat(migration.getMetadata(), is(equalTo(metadata)));
        assertThat(migration.getSpec(), is(equalTo(spec)));
        assertThat(migration.getStatus(), is(equalTo(status)));
    }
}

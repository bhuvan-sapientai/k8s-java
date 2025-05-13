package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus;
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
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1alpha1StorageVersionBaseRockGeneratedTest {

    private V1alpha1StorageVersion storageVersion;

    @BeforeEach
    void setUp() {
        storageVersion = new V1alpha1StorageVersion();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 7A93CA3B0FB19C3575BBEB6203AB4944
    @Test
    void testApiVersion() {
        String apiVersion = "v1alpha1";
        storageVersion.setApiVersion(apiVersion);
        assertEquals(apiVersion, storageVersion.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 58357E54A84E32087131D61FC34F37EA
    @Test
    void testKind() {
        String kind = "StorageVersion";
        storageVersion.setKind(kind);
        assertEquals(kind, storageVersion.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 80244E9F397BC873804F92B1DC195DA3
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = new V1ObjectMeta();
        storageVersion.setMetadata(metadata);
        assertEquals(metadata, storageVersion.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: D134D99C34D660425717F02EB2AD6EE4
    @Test
    void testSpec() {
        Object spec = new Object();
        storageVersion.setSpec(spec);
        assertEquals(spec, storageVersion.getSpec());
    }

    //BaseRock generated method id: ${testStatus}, hash: DC14A58F0FE9BCAE8C058E1A78874665
    @Test
    void testStatus() {
        V1alpha1StorageVersionStatus status = new V1alpha1StorageVersionStatus();
        storageVersion.setStatus(status);
        assertEquals(status, storageVersion.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: 1145ABC330E6C08A2EE1D9D516F8B7CE
    @Disabled()
    @Test
    void testEquals() {
        V1alpha1StorageVersion other = new V1alpha1StorageVersion();
        other.setApiVersion("v1alpha1");
        other.setKind("StorageVersion");
        other.setMetadata(new V1ObjectMeta());
        other.setSpec(new Object());
        other.setStatus(new V1alpha1StorageVersionStatus());
        storageVersion.setApiVersion("v1alpha1");
        storageVersion.setKind("StorageVersion");
        storageVersion.setMetadata(new V1ObjectMeta());
        storageVersion.setSpec(new Object());
        storageVersion.setStatus(new V1alpha1StorageVersionStatus());
        assertThat(storageVersion, is(equalTo(other)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 60BE93519CFD2DD5FA74E141A2944777
    @Test
    void testHashCode() {
        storageVersion.setApiVersion("v1alpha1");
        storageVersion.setKind("StorageVersion");
        storageVersion.setMetadata(new V1ObjectMeta());
        storageVersion.setSpec(new Object());
        storageVersion.setStatus(new V1alpha1StorageVersionStatus());
        int hashCode = storageVersion.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: EAD9282741D4483CAC4C8914B1784507
    @Test
    void testToString() {
        storageVersion.setApiVersion("v1alpha1");
        storageVersion.setKind("StorageVersion");
        storageVersion.setMetadata(new V1ObjectMeta());
        storageVersion.setSpec(new Object());
        storageVersion.setStatus(new V1alpha1StorageVersionStatus());
        String toString = storageVersion.toString();
        assertNotNull(toString);
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("spec"), is(true));
        assertThat(toString.contains("status"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 51B8740482E26A3BBC3B48C3FEA40851
    @Test
    void testBuilder() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        when(metadata.getName()).thenReturn("test-name");
        Object spec = new Object();
        V1alpha1StorageVersionStatus status = mock(V1alpha1StorageVersionStatus.class);
        when(status.getCommonEncodingVersion()).thenReturn("v1");
        V1alpha1StorageVersion built = new V1alpha1StorageVersion().apiVersion("v1alpha1").kind("StorageVersion").metadata(metadata).spec(spec).status(status);
        assertThat(built.getApiVersion(), is("v1alpha1"));
        assertThat(built.getKind(), is("StorageVersion"));
        assertThat(built.getMetadata().getName(), is("test-name"));
        assertThat(built.getSpec(), is(spec));
        assertThat(built.getStatus().getCommonEncodingVersion(), is("v1"));
    }
}

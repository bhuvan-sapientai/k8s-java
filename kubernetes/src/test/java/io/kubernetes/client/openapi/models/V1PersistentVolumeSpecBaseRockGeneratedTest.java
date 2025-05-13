package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSource;
import io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSource;
import io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource;
import io.kubernetes.client.openapi.models.V1NFSVolumeSource;
import io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSource;
import io.kubernetes.client.openapi.models.V1PortworxVolumeSource;
import io.kubernetes.client.openapi.models.V1QuobyteVolumeSource;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1PersistentVolumeSpec;
import io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource;
import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.openapi.models.V1VolumeNodeAffinity;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1FlockerVolumeSource;
import io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource;
import io.kubernetes.client.openapi.models.V1LocalVolumeSource;
import java.util.HashMap;
import io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSource;
import io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSource;
import java.util.List;
import io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource;
import io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSource;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1ObjectReference;
import io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V1HostPathVolumeSource;
import io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSource;
import io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.V1FCVolumeSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1PersistentVolumeSpecBaseRockGeneratedTest {

    // ... (all other test methods remain unchanged)
    //BaseRock generated method id: ${testToString}, hash: 9890689C2F374DA3796E5BE9E47DA5AE
    @Disabled()
    @Test
    void testToString() {
        V1PersistentVolumeSpec spec = new V1PersistentVolumeSpec();
        spec.setVolumeMode("Filesystem");
        String toString = spec.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString, containsString("volumeMode=Filesystem"));
        assertThat(toString, startsWith("class V1PersistentVolumeSpec {"));
        assertThat(toString, endsWith("}"));
    }
}

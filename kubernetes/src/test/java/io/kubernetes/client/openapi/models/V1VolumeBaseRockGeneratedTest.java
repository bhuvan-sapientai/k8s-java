package io.kubernetes.client.openapi.models;

import static org.mockito.Mockito.doReturn;
import io.kubernetes.client.openapi.models.V1NFSVolumeSource;
import io.kubernetes.client.openapi.models.V1PortworxVolumeSource;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;
import io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource;
import io.kubernetes.client.openapi.models.V1StorageOSVolumeSource;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1ISCSIVolumeSource;
import io.kubernetes.client.openapi.models.V1AzureFileVolumeSource;
import io.kubernetes.client.openapi.models.V1FlockerVolumeSource;
import io.kubernetes.client.openapi.models.V1EmptyDirVolumeSource;
import io.kubernetes.client.openapi.models.V1GitRepoVolumeSource;
import io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1CinderVolumeSource;
import io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource;
import static org.hamcrest.Matchers.not;
import io.kubernetes.client.openapi.models.V1ScaleIOVolumeSource;
import io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource;
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.V1FCVolumeSource;
import io.kubernetes.client.openapi.models.V1Volume;
import io.kubernetes.client.openapi.models.V1QuobyteVolumeSource;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource;
import io.kubernetes.client.openapi.models.V1ConfigMapVolumeSource;
import io.kubernetes.client.openapi.models.V1RBDVolumeSource;
import io.kubernetes.client.openapi.models.V1CSIVolumeSource;
import io.kubernetes.client.openapi.models.V1SecretVolumeSource;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1CephFSVolumeSource;
import com.google.gson.JsonElement;
import io.kubernetes.client.openapi.models.V1ImageVolumeSource;
import io.kubernetes.client.openapi.models.V1ProjectedVolumeSource;
import io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource;
import io.kubernetes.client.openapi.models.V1EphemeralVolumeSource;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V1FlexVolumeSource;
import io.kubernetes.client.openapi.models.V1HostPathVolumeSource;
import io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1VolumeBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1VolumeConstructor}, hash: AE5BAB50ED6C78AAC486CE2E3B8C7157
    @Test
    void testV1VolumeConstructor() {
        V1Volume volume = new V1Volume();
        assertThat(volume, is(notNullValue()));
    }

    //BaseRock generated method id: ${testV1VolumeSettersAndGetters}, hash: 465584C9D13E5585B3D064B41F584A0E
    @Test
    void testV1VolumeSettersAndGetters() {
        V1Volume volume = new V1Volume();
        V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore = mock(V1AWSElasticBlockStoreVolumeSource.class);
        volume.setAwsElasticBlockStore(awsElasticBlockStore);
        assertThat(volume.getAwsElasticBlockStore(), is(equalTo(awsElasticBlockStore)));
        V1AzureDiskVolumeSource azureDisk = mock(V1AzureDiskVolumeSource.class);
        volume.setAzureDisk(azureDisk);
        assertThat(volume.getAzureDisk(), is(equalTo(azureDisk)));
        V1AzureFileVolumeSource azureFile = mock(V1AzureFileVolumeSource.class);
        volume.setAzureFile(azureFile);
        assertThat(volume.getAzureFile(), is(equalTo(azureFile)));
        V1CephFSVolumeSource cephfs = mock(V1CephFSVolumeSource.class);
        volume.setCephfs(cephfs);
        assertThat(volume.getCephfs(), is(equalTo(cephfs)));
        V1CinderVolumeSource cinder = mock(V1CinderVolumeSource.class);
        volume.setCinder(cinder);
        assertThat(volume.getCinder(), is(equalTo(cinder)));
        V1ConfigMapVolumeSource configMap = mock(V1ConfigMapVolumeSource.class);
        volume.setConfigMap(configMap);
        assertThat(volume.getConfigMap(), is(equalTo(configMap)));
        V1CSIVolumeSource csi = mock(V1CSIVolumeSource.class);
        volume.setCsi(csi);
        assertThat(volume.getCsi(), is(equalTo(csi)));
        V1DownwardAPIVolumeSource downwardAPI = mock(V1DownwardAPIVolumeSource.class);
        volume.setDownwardAPI(downwardAPI);
        assertThat(volume.getDownwardAPI(), is(equalTo(downwardAPI)));
        V1EmptyDirVolumeSource emptyDir = mock(V1EmptyDirVolumeSource.class);
        volume.setEmptyDir(emptyDir);
        assertThat(volume.getEmptyDir(), is(equalTo(emptyDir)));
        V1EphemeralVolumeSource ephemeral = mock(V1EphemeralVolumeSource.class);
        volume.setEphemeral(ephemeral);
        assertThat(volume.getEphemeral(), is(equalTo(ephemeral)));
        V1FCVolumeSource fc = mock(V1FCVolumeSource.class);
        volume.setFc(fc);
        assertThat(volume.getFc(), is(equalTo(fc)));
        V1FlexVolumeSource flexVolume = mock(V1FlexVolumeSource.class);
        volume.setFlexVolume(flexVolume);
        assertThat(volume.getFlexVolume(), is(equalTo(flexVolume)));
        V1FlockerVolumeSource flocker = mock(V1FlockerVolumeSource.class);
        volume.setFlocker(flocker);
        assertThat(volume.getFlocker(), is(equalTo(flocker)));
        V1GCEPersistentDiskVolumeSource gcePersistentDisk = mock(V1GCEPersistentDiskVolumeSource.class);
        volume.setGcePersistentDisk(gcePersistentDisk);
        assertThat(volume.getGcePersistentDisk(), is(equalTo(gcePersistentDisk)));
        V1GitRepoVolumeSource gitRepo = mock(V1GitRepoVolumeSource.class);
        volume.setGitRepo(gitRepo);
        assertThat(volume.getGitRepo(), is(equalTo(gitRepo)));
        V1GlusterfsVolumeSource glusterfs = mock(V1GlusterfsVolumeSource.class);
        volume.setGlusterfs(glusterfs);
        assertThat(volume.getGlusterfs(), is(equalTo(glusterfs)));
        V1HostPathVolumeSource hostPath = mock(V1HostPathVolumeSource.class);
        volume.setHostPath(hostPath);
        assertThat(volume.getHostPath(), is(equalTo(hostPath)));
        V1ImageVolumeSource image = mock(V1ImageVolumeSource.class);
        volume.setImage(image);
        assertThat(volume.getImage(), is(equalTo(image)));
        V1ISCSIVolumeSource iscsi = mock(V1ISCSIVolumeSource.class);
        volume.setIscsi(iscsi);
        assertThat(volume.getIscsi(), is(equalTo(iscsi)));
        String name = "test-volume";
        volume.setName(name);
        assertThat(volume.getName(), is(equalTo(name)));
        V1NFSVolumeSource nfs = mock(V1NFSVolumeSource.class);
        volume.setNfs(nfs);
        assertThat(volume.getNfs(), is(equalTo(nfs)));
        V1PersistentVolumeClaimVolumeSource persistentVolumeClaim = mock(V1PersistentVolumeClaimVolumeSource.class);
        volume.setPersistentVolumeClaim(persistentVolumeClaim);
        assertThat(volume.getPersistentVolumeClaim(), is(equalTo(persistentVolumeClaim)));
        V1PhotonPersistentDiskVolumeSource photonPersistentDisk = mock(V1PhotonPersistentDiskVolumeSource.class);
        volume.setPhotonPersistentDisk(photonPersistentDisk);
        assertThat(volume.getPhotonPersistentDisk(), is(equalTo(photonPersistentDisk)));
        V1PortworxVolumeSource portworxVolume = mock(V1PortworxVolumeSource.class);
        volume.setPortworxVolume(portworxVolume);
        assertThat(volume.getPortworxVolume(), is(equalTo(portworxVolume)));
        V1ProjectedVolumeSource projected = mock(V1ProjectedVolumeSource.class);
        volume.setProjected(projected);
        assertThat(volume.getProjected(), is(equalTo(projected)));
        V1QuobyteVolumeSource quobyte = mock(V1QuobyteVolumeSource.class);
        volume.setQuobyte(quobyte);
        assertThat(volume.getQuobyte(), is(equalTo(quobyte)));
        V1RBDVolumeSource rbd = mock(V1RBDVolumeSource.class);
        volume.setRbd(rbd);
        assertThat(volume.getRbd(), is(equalTo(rbd)));
        V1ScaleIOVolumeSource scaleIO = mock(V1ScaleIOVolumeSource.class);
        volume.setScaleIO(scaleIO);
        assertThat(volume.getScaleIO(), is(equalTo(scaleIO)));
        V1SecretVolumeSource secret = mock(V1SecretVolumeSource.class);
        volume.setSecret(secret);
        assertThat(volume.getSecret(), is(equalTo(secret)));
        V1StorageOSVolumeSource storageos = mock(V1StorageOSVolumeSource.class);
        volume.setStorageos(storageos);
        assertThat(volume.getStorageos(), is(equalTo(storageos)));
        V1VsphereVirtualDiskVolumeSource vsphereVolume = mock(V1VsphereVirtualDiskVolumeSource.class);
        volume.setVsphereVolume(vsphereVolume);
        assertThat(volume.getVsphereVolume(), is(equalTo(vsphereVolume)));
    }

    //BaseRock generated method id: ${testV1VolumeEqualsAndHashCode}, hash: 445984FCAD1B72478E0B2D594F472D62
    @Test
    void testV1VolumeEqualsAndHashCode() {
        V1Volume volume1 = new V1Volume().name("test-volume");
        V1Volume volume2 = new V1Volume().name("test-volume");
        V1Volume volume3 = new V1Volume().name("different-volume");
        assertThat(volume1.equals(volume2), is(true));
        assertThat(volume1.equals(volume3), is(false));
        assertThat(volume1.hashCode(), is(equalTo(volume2.hashCode())));
        assertThat(volume1.hashCode(), is(not(equalTo(volume3.hashCode()))));
    }

    //BaseRock generated method id: ${testV1VolumeToString}, hash: E3A4C79DA91766A4FF4D02FBAEDDE2DA
    @Disabled()
    @Test
    void testV1VolumeToString() {
        V1Volume volume = new V1Volume().name("test-volume").emptyDir(new V1EmptyDirVolumeSource());
        String toString = volume.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString, containsString("name=test-volume"));
        assertThat(toString, containsString("emptyDir="));
    }

    //BaseRock generated method id: ${testV1VolumeValidation}, hash: 8493E4BEA01DAAEFC705B8C92B814C44
    @Disabled
    @Test
    void testV1VolumeValidation() {
        // Disabled as per instructions
    }
}

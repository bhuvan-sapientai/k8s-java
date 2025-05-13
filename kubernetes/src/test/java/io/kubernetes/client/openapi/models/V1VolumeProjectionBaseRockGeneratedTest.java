package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1DownwardAPIProjection;
import io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1VolumeProjection;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import io.kubernetes.client.openapi.models.V1ClusterTrustBundleProjection;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1SecretProjection;
import io.kubernetes.client.openapi.models.V1ConfigMapProjection;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1VolumeProjectionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 3B75FFC1054F9D1D39149A070E9330B1
    @Test
    void testConstructor() {
        V1VolumeProjection volumeProjection = new V1VolumeProjection();
        assertThat(volumeProjection, is(notNullValue()));
    }

    //BaseRock generated method id: ${testClusterTrustBundle}, hash: E0297B0D2DC190C4257408F4B83394DF
    @Test
    void testClusterTrustBundle() {
        V1ClusterTrustBundleProjection clusterTrustBundle = new V1ClusterTrustBundleProjection();
        V1VolumeProjection volumeProjection = new V1VolumeProjection().clusterTrustBundle(clusterTrustBundle);
        assertThat(volumeProjection.getClusterTrustBundle(), is(equalTo(clusterTrustBundle)));
    }

    //BaseRock generated method id: ${testConfigMap}, hash: 78BC261BE63275C40D10C2045D9C09D4
    @Test
    void testConfigMap() {
        V1ConfigMapProjection configMap = new V1ConfigMapProjection();
        V1VolumeProjection volumeProjection = new V1VolumeProjection().configMap(configMap);
        assertThat(volumeProjection.getConfigMap(), is(equalTo(configMap)));
    }

    //BaseRock generated method id: ${testDownwardAPI}, hash: A5DD204519149CCAA34A1C3D970DDC6D
    @Test
    void testDownwardAPI() {
        V1DownwardAPIProjection downwardAPI = new V1DownwardAPIProjection();
        V1VolumeProjection volumeProjection = new V1VolumeProjection().downwardAPI(downwardAPI);
        assertThat(volumeProjection.getDownwardAPI(), is(equalTo(downwardAPI)));
    }

    //BaseRock generated method id: ${testSecret}, hash: 3E00FA500B9F712E95F12E11D772F5E1
    @Test
    void testSecret() {
        V1SecretProjection secret = new V1SecretProjection();
        V1VolumeProjection volumeProjection = new V1VolumeProjection().secret(secret);
        assertThat(volumeProjection.getSecret(), is(equalTo(secret)));
    }

    //BaseRock generated method id: ${testServiceAccountToken}, hash: E6E1B9C2194C6808CB2CC1C2621D1799
    @Test
    void testServiceAccountToken() {
        V1ServiceAccountTokenProjection serviceAccountToken = new V1ServiceAccountTokenProjection();
        V1VolumeProjection volumeProjection = new V1VolumeProjection().serviceAccountToken(serviceAccountToken);
        assertThat(volumeProjection.getServiceAccountToken(), is(equalTo(serviceAccountToken)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: E81B8747355A6059698F80F317B4034E
    @Test
    void testEqualsAndHashCode() {
        V1VolumeProjection volumeProjection1 = new V1VolumeProjection().clusterTrustBundle(new V1ClusterTrustBundleProjection()).configMap(new V1ConfigMapProjection()).downwardAPI(new V1DownwardAPIProjection()).secret(new V1SecretProjection()).serviceAccountToken(new V1ServiceAccountTokenProjection());
        V1VolumeProjection volumeProjection2 = new V1VolumeProjection().clusterTrustBundle(new V1ClusterTrustBundleProjection()).configMap(new V1ConfigMapProjection()).downwardAPI(new V1DownwardAPIProjection()).secret(new V1SecretProjection()).serviceAccountToken(new V1ServiceAccountTokenProjection());
        assertThat(volumeProjection1, is(equalTo(volumeProjection2)));
        assertThat(volumeProjection1.hashCode(), is(equalTo(volumeProjection2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 41AEE2E31840781631BD04F3FF8D664C
    @Test
    void testToString() {
        V1VolumeProjection volumeProjection = new V1VolumeProjection().clusterTrustBundle(new V1ClusterTrustBundleProjection()).configMap(new V1ConfigMapProjection()).downwardAPI(new V1DownwardAPIProjection()).secret(new V1SecretProjection()).serviceAccountToken(new V1ServiceAccountTokenProjection());
        String expectedString = "class V1VolumeProjection {\n" + "    clusterTrustBundle: class V1ClusterTrustBundleProjection {\n" + "        labelSelector: null\n" + "        name: null\n" + "        optional: null\n" + "        path: null\n" + "        signerName: null\n" + "    }\n" + "    configMap: class V1ConfigMapProjection {\n" + "        items: []\n" + "        name: null\n" + "        optional: null\n" + "    }\n" + "    downwardAPI: class V1DownwardAPIProjection {\n" + "        items: []\n" + "    }\n" + "    secret: class V1SecretProjection {\n" + "        items: []\n" + "        name: null\n" + "        optional: null\n" + "    }\n" + "    serviceAccountToken: class V1ServiceAccountTokenProjection {\n" + "        audience: null\n" + "        expirationSeconds: null\n" + "        path: null\n" + "    }\n" + "}";
        assertThat(volumeProjection.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testSetAndGetClusterTrustBundle}, hash: 7645BF2D71FC7679794AE74AB5CCE0AA
    @Test
    void testSetAndGetClusterTrustBundle() {
        V1VolumeProjection volumeProjection = new V1VolumeProjection();
        V1ClusterTrustBundleProjection clusterTrustBundle = new V1ClusterTrustBundleProjection();
        volumeProjection.setClusterTrustBundle(clusterTrustBundle);
        assertThat(volumeProjection.getClusterTrustBundle(), is(equalTo(clusterTrustBundle)));
    }

    //BaseRock generated method id: ${testSetAndGetConfigMap}, hash: C589036CDAF33E6C254A087852464E61
    @Test
    void testSetAndGetConfigMap() {
        V1VolumeProjection volumeProjection = new V1VolumeProjection();
        V1ConfigMapProjection configMap = new V1ConfigMapProjection();
        volumeProjection.setConfigMap(configMap);
        assertThat(volumeProjection.getConfigMap(), is(equalTo(configMap)));
    }

    //BaseRock generated method id: ${testSetAndGetDownwardAPI}, hash: E9991F3B8A291585DEBDBA22CEED35AD
    @Test
    void testSetAndGetDownwardAPI() {
        V1VolumeProjection volumeProjection = new V1VolumeProjection();
        V1DownwardAPIProjection downwardAPI = new V1DownwardAPIProjection();
        volumeProjection.setDownwardAPI(downwardAPI);
        assertThat(volumeProjection.getDownwardAPI(), is(equalTo(downwardAPI)));
    }

    //BaseRock generated method id: ${testSetAndGetSecret}, hash: 8C1B317DAC667AB3F1B0B49A2E6CDB14
    @Test
    void testSetAndGetSecret() {
        V1VolumeProjection volumeProjection = new V1VolumeProjection();
        V1SecretProjection secret = new V1SecretProjection();
        volumeProjection.setSecret(secret);
        assertThat(volumeProjection.getSecret(), is(equalTo(secret)));
    }

    //BaseRock generated method id: ${testSetAndGetServiceAccountToken}, hash: 914E28F380786FBD08EE142EB0E32547
    @Test
    void testSetAndGetServiceAccountToken() {
        V1VolumeProjection volumeProjection = new V1VolumeProjection();
        V1ServiceAccountTokenProjection serviceAccountToken = new V1ServiceAccountTokenProjection();
        volumeProjection.setServiceAccountToken(serviceAccountToken);
        assertThat(volumeProjection.getServiceAccountToken(), is(equalTo(serviceAccountToken)));
    }

    //BaseRock generated method id: ${testNullValues}, hash: AA6E5C1CC81A58235E601CDDDFCAC785
    @Test
    void testNullValues() {
        V1VolumeProjection volumeProjection = new V1VolumeProjection();
        assertThat(volumeProjection.getClusterTrustBundle(), is(nullValue()));
        assertThat(volumeProjection.getConfigMap(), is(nullValue()));
        assertThat(volumeProjection.getDownwardAPI(), is(nullValue()));
        assertThat(volumeProjection.getSecret(), is(nullValue()));
        assertThat(volumeProjection.getServiceAccountToken(), is(nullValue()));
    }
}

package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSource;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1AzureFilePersistentVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: A4A52AACC209ED4CDC430774DB90ACB1
    @Test
    void testConstructor() {
        V1AzureFilePersistentVolumeSource source = new V1AzureFilePersistentVolumeSource();
        assertThat(source, is(notNullValue()));
    }

    //BaseRock generated method id: ${testReadOnly}, hash: 53D6E6FB3D8EBC43A4CC00D1DFCF08AF
    @Test
    void testReadOnly() {
        V1AzureFilePersistentVolumeSource source = new V1AzureFilePersistentVolumeSource();
        assertNull(source.getReadOnly());
        source.setReadOnly(true);
        assertTrue(source.getReadOnly());
        source.setReadOnly(false);
        assertFalse(source.getReadOnly());
    }

    //BaseRock generated method id: ${testSecretName}, hash: 35DA9EE14AB0B43521917D7362565B4F
    @Test
    void testSecretName() {
        V1AzureFilePersistentVolumeSource source = new V1AzureFilePersistentVolumeSource();
        assertNull(source.getSecretName());
        String secretName = "test-secret";
        source.setSecretName(secretName);
        assertEquals(secretName, source.getSecretName());
    }

    //BaseRock generated method id: ${testSecretNamespace}, hash: A89FB42E463FD550477756B0C7200C3F
    @Test
    void testSecretNamespace() {
        V1AzureFilePersistentVolumeSource source = new V1AzureFilePersistentVolumeSource();
        assertNull(source.getSecretNamespace());
        String secretNamespace = "test-namespace";
        source.setSecretNamespace(secretNamespace);
        assertEquals(secretNamespace, source.getSecretNamespace());
    }

    //BaseRock generated method id: ${testShareName}, hash: 59437DBF117F5D830997407596C959F2
    @Test
    void testShareName() {
        V1AzureFilePersistentVolumeSource source = new V1AzureFilePersistentVolumeSource();
        assertNull(source.getShareName());
        String shareName = "test-share";
        source.setShareName(shareName);
        assertEquals(shareName, source.getShareName());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 74CDBF15E98AA7350B67130B9D1B0469
    @Test
    void testEqualsAndHashCode() {
        V1AzureFilePersistentVolumeSource source1 = new V1AzureFilePersistentVolumeSource().readOnly(true).secretName("secret1").secretNamespace("namespace1").shareName("share1");
        V1AzureFilePersistentVolumeSource source2 = new V1AzureFilePersistentVolumeSource().readOnly(true).secretName("secret1").secretNamespace("namespace1").shareName("share1");
        V1AzureFilePersistentVolumeSource source3 = new V1AzureFilePersistentVolumeSource().readOnly(false).secretName("secret2").secretNamespace("namespace2").shareName("share2");
        assertTrue(source1.equals(source2) && source2.equals(source1));
        assertEquals(source1.hashCode(), source2.hashCode());
        assertFalse(source1.equals(source3) || source3.equals(source1));
    }

    //BaseRock generated method id: ${testToString}, hash: 8AE2DE40860EDBF8644C717D366A4421
    @Disabled()
    @Test
    void testToString() {
        V1AzureFilePersistentVolumeSource source = new V1AzureFilePersistentVolumeSource().readOnly(true).secretName("test-secret").secretNamespace("test-namespace").shareName("test-share");
        String toString = source.toString();
        assertThat(toString, containsString("readOnly=true"));
        assertThat(toString, containsString("secretName=test-secret"));
        assertThat(toString, containsString("secretNamespace=test-namespace"));
        assertThat(toString, containsString("shareName=test-share"));
    }
}

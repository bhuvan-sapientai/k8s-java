package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSource;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.Matchers;
import io.kubernetes.client.openapi.models.V1SecretReference;
import static org.hamcrest.Matchers.not;
import com.google.gson.JsonElement;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1ScaleIOPersistentVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructorAndGetters}, hash: 44E0342B0A53B5AC692AB20749AC656B
    @Test
    void testConstructorAndGetters() {
        V1SecretReference secretRef = mock(V1SecretReference.class);
        V1ScaleIOPersistentVolumeSource source = new V1ScaleIOPersistentVolumeSource().fsType("ext4").gateway("gateway").protectionDomain("domain").readOnly(true).secretRef(secretRef).sslEnabled(true).storageMode("ThickProvisioned").storagePool("pool").system("system").volumeName("volume");
        assertThat(source.getFsType(), is(equalTo("ext4")));
        assertThat(source.getGateway(), is(equalTo("gateway")));
        assertThat(source.getProtectionDomain(), is(equalTo("domain")));
        assertThat(source.getReadOnly(), is(true));
        assertThat(source.getSecretRef(), is(equalTo(secretRef)));
        assertThat(source.getSslEnabled(), is(true));
        assertThat(source.getStorageMode(), is(equalTo("ThickProvisioned")));
        assertThat(source.getStoragePool(), is(equalTo("pool")));
        assertThat(source.getSystem(), is(equalTo("system")));
        assertThat(source.getVolumeName(), is(equalTo("volume")));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 3F01DF5A9A984F2FA8D0C3094938A581
    @Test
    void testEqualsAndHashCode() {
        V1SecretReference secretRef1 = mock(V1SecretReference.class);
        V1SecretReference secretRef2 = mock(V1SecretReference.class);
        V1ScaleIOPersistentVolumeSource source1 = new V1ScaleIOPersistentVolumeSource().fsType("ext4").gateway("gateway").secretRef(secretRef1).system("system");
        V1ScaleIOPersistentVolumeSource source2 = new V1ScaleIOPersistentVolumeSource().fsType("ext4").gateway("gateway").secretRef(secretRef1).system("system");
        V1ScaleIOPersistentVolumeSource source3 = new V1ScaleIOPersistentVolumeSource().fsType("xfs").gateway("other").secretRef(secretRef2).system("other");
        assertThat(source1.equals(source2), is(true));
        assertThat(source1.equals(source3), is(false));
        assertThat(source1.hashCode(), is(equalTo(source2.hashCode())));
        assertThat(source1.hashCode(), is(not(equalTo(source3.hashCode()))));
    }

    //BaseRock generated method id: ${testToString}, hash: ECA4BD88631B7D858CBEBEFA4ED78B24
    @Test
    void testToString() {
        V1SecretReference secretRef = mock(V1SecretReference.class);
        V1ScaleIOPersistentVolumeSource source = new V1ScaleIOPersistentVolumeSource().fsType("ext4").gateway("gateway").secretRef(secretRef).system("system");
        String toString = source.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("fsType"), is(true));
        assertThat(toString.contains("gateway"), is(true));
        assertThat(toString.contains("secretRef"), is(true));
        assertThat(toString.contains("system"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 964CE1C113BBBC62873227E18CBF199B
    @Test
    void testBuilder() {
        V1SecretReference secretRef = mock(V1SecretReference.class);
        V1ScaleIOPersistentVolumeSource source = new V1ScaleIOPersistentVolumeSource().fsType("ext4").gateway("gateway").protectionDomain("domain").readOnly(true).secretRef(secretRef).sslEnabled(true).storageMode("ThickProvisioned").storagePool("pool").system("system").volumeName("volume");
        assertThat(source, notNullValue());
        assertThat(source.getFsType(), is(equalTo("ext4")));
        assertThat(source.getGateway(), is(equalTo("gateway")));
        assertThat(source.getProtectionDomain(), is(equalTo("domain")));
        assertThat(source.getReadOnly(), is(true));
        assertThat(source.getSecretRef(), is(equalTo(secretRef)));
        assertThat(source.getSslEnabled(), is(true));
        assertThat(source.getStorageMode(), is(equalTo("ThickProvisioned")));
        assertThat(source.getStoragePool(), is(equalTo("pool")));
        assertThat(source.getSystem(), is(equalTo("system")));
        assertThat(source.getVolumeName(), is(equalTo("volume")));
    }

    //BaseRock generated method id: ${testBuilderWithNullValues}, hash: A9E49BD4A45EBC94400DE9D4C9C64940
    @Test
    void testBuilderWithNullValues() {
        V1ScaleIOPersistentVolumeSource source = new V1ScaleIOPersistentVolumeSource().fsType(null).gateway(null).protectionDomain(null).readOnly(null).secretRef(null).sslEnabled(null).storageMode(null).storagePool(null).system(null).volumeName(null);
        assertThat(source, notNullValue());
        assertThat(source.getFsType(), is(Matchers.nullValue()));
        assertThat(source.getGateway(), is(Matchers.nullValue()));
        assertThat(source.getProtectionDomain(), is(Matchers.nullValue()));
        assertThat(source.getReadOnly(), is(Matchers.nullValue()));
        assertThat(source.getSecretRef(), is(Matchers.nullValue()));
        assertThat(source.getSslEnabled(), is(Matchers.nullValue()));
        assertThat(source.getStorageMode(), is(Matchers.nullValue()));
        assertThat(source.getStoragePool(), is(Matchers.nullValue()));
        assertThat(source.getSystem(), is(Matchers.nullValue()));
        assertThat(source.getVolumeName(), is(Matchers.nullValue()));
    }

    //BaseRock generated method id: ${testRequiredFieldValidation}, hash: 68B8B60714E6FC50F842BE89564E4250
    @Disabled
    @Test
    void testRequiredFieldValidation() {
        //V1ScaleIOPersistentVolumeSource source = new V1ScaleIOPersistentVolumeSource();
        /*assertThrows(NullPointerException.class, () -> {
    V1ScaleIOPersistentVolumeSource.validateJsonElement(null);
});*/
        /*assertThrows(IllegalArgumentException.class, () -> {
    source.gateway("gateway");
    V1ScaleIOPersistentVolumeSource.validateJsonElement(source.toJson());
});*/
        /*assertThrows(IllegalArgumentException.class, () -> {
    source.secretRef(mock(V1SecretReference.class));
    V1ScaleIOPersistentVolumeSource.validateJsonElement(source.toJson());
});*/
        //assertThat(source.system("system"), notNullValue());
        //V1ScaleIOPersistentVolumeSource.validateJsonElement(source.toJson());
    }
}
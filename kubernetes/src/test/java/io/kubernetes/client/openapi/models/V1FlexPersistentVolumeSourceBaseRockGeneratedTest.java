package io.kubernetes.client.openapi.models;

import java.util.Map;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import io.kubernetes.client.openapi.models.V1SecretReference;
import static org.hamcrest.Matchers.hasEntry;
import io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSource;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1FlexPersistentVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: AB7E90ABF5BABF8CD48A7F83B308AE9C
    @Test
    void testConstructor() {
        V1FlexPersistentVolumeSource source = new V1FlexPersistentVolumeSource();
        assertNotNull(source);
    }

    //BaseRock generated method id: ${testDriver}, hash: 42EE8FE0C91E16083F91D0C25C1144FE
    @Test
    void testDriver() {
        V1FlexPersistentVolumeSource source = new V1FlexPersistentVolumeSource();
        String driver = "test-driver";
        source.setDriver(driver);
        assertEquals(driver, source.getDriver());
    }

    //BaseRock generated method id: ${testFsType}, hash: 0B9AFC0B6C2AE675C0B2F5BA9E96EBE6
    @Test
    void testFsType() {
        V1FlexPersistentVolumeSource source = new V1FlexPersistentVolumeSource();
        String fsType = "ext4";
        source.setFsType(fsType);
        assertEquals(fsType, source.getFsType());
    }

    //BaseRock generated method id: ${testOptions}, hash: 9FE492C41A3C9256EEDBF6942C1F6039
    @Test
    void testOptions() {
        V1FlexPersistentVolumeSource source = new V1FlexPersistentVolumeSource();
        Map<String, String> options = new HashMap<>();
        options.put("key1", "value1");
        options.put("key2", "value2");
        source.setOptions(options);
        assertEquals(options, source.getOptions());
    }

    //BaseRock generated method id: ${testReadOnly}, hash: DDD5AF9D7AA86931D3A7409A856F4C5F
    @Test
    void testReadOnly() {
        V1FlexPersistentVolumeSource source = new V1FlexPersistentVolumeSource();
        source.setReadOnly(true);
        assertTrue(source.getReadOnly());
        source.setReadOnly(false);
        assertFalse(source.getReadOnly());
    }

    //BaseRock generated method id: ${testSecretRef}, hash: 122F54FA5B07DD7E03BD79FA72D263BD
    @Test
    void testSecretRef() {
        V1FlexPersistentVolumeSource source = new V1FlexPersistentVolumeSource();
        V1SecretReference secretRef = new V1SecretReference();
        source.setSecretRef(secretRef);
        assertEquals(secretRef, source.getSecretRef());
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 5FA7A7F6B02CACCFBD0CD80E832220B8
    @Test
    void testBuilderPattern() {
        V1FlexPersistentVolumeSource source = new V1FlexPersistentVolumeSource().driver("test-driver").fsType("ext4").readOnly(true).secretRef(new V1SecretReference());
        assertEquals("test-driver", source.getDriver());
        assertEquals("ext4", source.getFsType());
        assertTrue(source.getReadOnly());
        assertNotNull(source.getSecretRef());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: C52EE91BE27FF67B6A7F479E11B8D063
    @Test
    void testEqualsAndHashCode() {
        V1FlexPersistentVolumeSource source1 = new V1FlexPersistentVolumeSource().driver("test-driver").fsType("ext4").readOnly(true);
        V1FlexPersistentVolumeSource source2 = new V1FlexPersistentVolumeSource().driver("test-driver").fsType("ext4").readOnly(true);
        assertEquals(source1, source2);
        assertEquals(source1.hashCode(), source2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: D3BBADCA5D3C490B559178E1B64D1531
    @Disabled()
    @Test
    void testToString() {
        V1FlexPersistentVolumeSource source = new V1FlexPersistentVolumeSource().driver("test-driver").fsType("ext4").readOnly(true);
        String toString = source.toString();
        assertTrue(toString.contains("driver=test-driver"));
        assertTrue(toString.contains("fsType=ext4"));
        assertTrue(toString.contains("readOnly=true"));
    }

    //BaseRock generated method id: ${testPutOptionsItem}, hash: 7D6E29D561B2C2205C99741346CB4FDD
    @Test
    void testPutOptionsItem() {
        V1FlexPersistentVolumeSource source = new V1FlexPersistentVolumeSource();
        source.putOptionsItem("key1", "value1");
        assertThat(source.getOptions(), hasEntry("key1", "value1"));
    }

    //BaseRock generated method id: ${testNullValues}, hash: EC2C18E4DCE64EB917470120521DE497
    @Test
    void testNullValues() {
        V1FlexPersistentVolumeSource source = new V1FlexPersistentVolumeSource();
        assertThat(source.getDriver(), is(nullValue()));
        assertThat(source.getFsType(), is(nullValue()));
        assertThat(source.getOptions(), is(notNullValue()));
        assertThat(source.getReadOnly(), is(nullValue()));
        assertThat(source.getSecretRef(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEmptyOptions}, hash: 7959BD5F9BD512D130B0D10B278FD955
    @Test
    void testEmptyOptions() {
        V1FlexPersistentVolumeSource source = new V1FlexPersistentVolumeSource();
        source.setOptions(new HashMap<>());
        assertThat(source.getOptions(), is(notNullValue()));
        assertThat(source.getOptions().size(), is(equalTo(0)));
    }
}

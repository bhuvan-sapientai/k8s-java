package io.kubernetes.client.openapi.models;

import java.util.Map;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import io.kubernetes.client.openapi.models.V1LocalObjectReference;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasEntry;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1FlexVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1FlexVolumeSourceConstructor}, hash: 218A02F9EDDD8C380AEE88C84263EFF8
    @Test
    void testV1FlexVolumeSourceConstructor() {
        V1FlexVolumeSource flexVolumeSource = new V1FlexVolumeSource();
        assertThat(flexVolumeSource, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetDriver}, hash: F20ED4DE22E786E1DCD624644A2693F6
    @Test
    void testSetAndGetDriver() {
        V1FlexVolumeSource flexVolumeSource = new V1FlexVolumeSource();
        String driver = "test-driver";
        flexVolumeSource.setDriver(driver);
        assertThat(flexVolumeSource.getDriver(), is(equalTo(driver)));
    }

    //BaseRock generated method id: ${testSetAndGetFsType}, hash: 9F71EBB0D6B554AA62F9CD7F97A7554C
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "test-fs", "ext4", "xfs" })
    void testSetAndGetFsType(String fsType) {
        V1FlexVolumeSource flexVolumeSource = new V1FlexVolumeSource();
        flexVolumeSource.setFsType(fsType);
        assertThat(flexVolumeSource.getFsType(), is(equalTo(fsType)));
    }

    //BaseRock generated method id: ${testSetAndGetOptions}, hash: C8AB0C7CCDF1B0F528B1BD6E41CC1D4A
    @Test
    void testSetAndGetOptions() {
        V1FlexVolumeSource flexVolumeSource = new V1FlexVolumeSource();
        Map<String, String> options = new HashMap<>();
        options.put("key1", "value1");
        options.put("key2", "value2");
        flexVolumeSource.setOptions(options);
        assertThat(flexVolumeSource.getOptions(), is(equalTo(options)));
    }

    //BaseRock generated method id: ${testPutOptionsItem}, hash: A9ACD568B9581649EAA5E3BD595248DE
    @Test
    void testPutOptionsItem() {
        V1FlexVolumeSource flexVolumeSource = new V1FlexVolumeSource();
        String key = "testKey";
        String value = "testValue";
        flexVolumeSource.putOptionsItem(key, value);
        assertThat(flexVolumeSource.getOptions(), hasEntry(key, value));
    }

    //BaseRock generated method id: ${testSetAndGetReadOnly}, hash: 078AF147432EE1788C33F31603755D66
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    void testSetAndGetReadOnly(boolean readOnly) {
        V1FlexVolumeSource flexVolumeSource = new V1FlexVolumeSource();
        flexVolumeSource.setReadOnly(readOnly);
        assertThat(flexVolumeSource.getReadOnly(), is(equalTo(readOnly)));
    }

    //BaseRock generated method id: ${testSetAndGetSecretRef}, hash: 9FCE071ECCE743421E3CE2D387CF7470
    @Test
    void testSetAndGetSecretRef() {
        V1FlexVolumeSource flexVolumeSource = new V1FlexVolumeSource();
        V1LocalObjectReference secretRef = new V1LocalObjectReference();
        flexVolumeSource.setSecretRef(secretRef);
        assertThat(flexVolumeSource.getSecretRef(), is(equalTo(secretRef)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 769666B02AF582D173C022BAC3BA730F
    @Test
    void testEqualsAndHashCode() {
        V1FlexVolumeSource source1 = new V1FlexVolumeSource().driver("test-driver").fsType("ext4").readOnly(true).secretRef(new V1LocalObjectReference());
        V1FlexVolumeSource source2 = new V1FlexVolumeSource().driver("test-driver").fsType("ext4").readOnly(true).secretRef(new V1LocalObjectReference());
        assertThat(source1, is(equalTo(source2)));
        assertThat(source1.hashCode(), is(equalTo(source2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: EDC21AFF92126A7238F91C343CFDEE72
    @Test
    void testToString() {
        V1FlexVolumeSource flexVolumeSource = new V1FlexVolumeSource().driver("test-driver").fsType("ext4").readOnly(true).secretRef(new V1LocalObjectReference());
        String toString = flexVolumeSource.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("driver"), is(true));
        assertThat(toString.contains("fsType"), is(true));
        assertThat(toString.contains("readOnly"), is(true));
        assertThat(toString.contains("secretRef"), is(true));
    }

    //BaseRock generated method id: ${testDriverRequired}, hash: 3B46B35FA64C1E6D604D9DCB278769BE
    @Test
    void testDriverRequired() {
        V1FlexVolumeSource flexVolumeSource = new V1FlexVolumeSource();
        assertThrows(IllegalArgumentException.class, () -> flexVolumeSource.validateJsonElement(null));
    }

    //BaseRock generated method id: ${testNullDriver}, hash: 25DC355F808B6CC6C80B2323590AFAD0
    @Disabled()
    @Test
    void testNullDriver() {
        V1FlexVolumeSource flexVolumeSource = new V1FlexVolumeSource();
        assertThrows(NullPointerException.class, () -> flexVolumeSource.driver(null));
    }

    //BaseRock generated method id: ${testFluentInterface}, hash: DC64E4FA47172C0EB721901ABF95D7BF
    @Test
    void testFluentInterface() {
        V1FlexVolumeSource flexVolumeSource = new V1FlexVolumeSource().driver("test-driver").fsType("ext4").readOnly(true).secretRef(new V1LocalObjectReference()).putOptionsItem("key", "value");
        assertThat(flexVolumeSource.getDriver(), is("test-driver"));
        assertThat(flexVolumeSource.getFsType(), is("ext4"));
        assertThat(flexVolumeSource.getReadOnly(), is(true));
        assertThat(flexVolumeSource.getSecretRef(), is(notNullValue()));
        assertThat(flexVolumeSource.getOptions(), hasEntry("key", "value"));
    }

    //BaseRock generated method id: ${testNullSecretRef}, hash: CBEF606E1499FFAF8F11ABC0A6797039
    @Test
    void testNullSecretRef() {
        V1FlexVolumeSource flexVolumeSource = new V1FlexVolumeSource();
        flexVolumeSource.setSecretRef(null);
        assertThat(flexVolumeSource.getSecretRef(), is(nullValue()));
    }
}

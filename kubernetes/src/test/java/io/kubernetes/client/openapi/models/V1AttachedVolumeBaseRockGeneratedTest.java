package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1AttachedVolume;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1AttachedVolumeBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 1B05271D3E3BFF309668606CC241319A
    @Test
    void testConstructor() {
        V1AttachedVolume volume = new V1AttachedVolume();
        assertNotNull(volume);
    }

    //BaseRock generated method id: ${testGetSetDevicePath}, hash: B8637F50AB50FBD2F16AE70B193C2B38
    @Test
    void testGetSetDevicePath() {
        V1AttachedVolume volume = new V1AttachedVolume();
        String devicePath = "/dev/sda1";
        volume.setDevicePath(devicePath);
        assertEquals(devicePath, volume.getDevicePath());
    }

    //BaseRock generated method id: ${testGetSetName}, hash: 51694359B334D269D2548421C429AB09
    @Test
    void testGetSetName() {
        V1AttachedVolume volume = new V1AttachedVolume();
        String name = "test-volume";
        volume.setName(name);
        assertEquals(name, volume.getName());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: A4D9ADFDB33777FF366CE4A8B650D0FC
    @Test
    void testEqualsWithSameObject() {
        V1AttachedVolume volume = new V1AttachedVolume();
        assertTrue(volume.equals(volume));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 9518ADF79D8F8A6CF64869F0EBF1AB7B
    @Test
    void testEqualsWithDifferentClass() {
        V1AttachedVolume volume = new V1AttachedVolume();
        assertFalse(volume.equals(new Object()));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 07501C4E930CFD0EC030042379B36E96
    @Test
    void testEqualsWithDifferentObject() {
        V1AttachedVolume volume1 = new V1AttachedVolume().devicePath("/dev/sda1").name("volume1");
        V1AttachedVolume volume2 = new V1AttachedVolume().devicePath("/dev/sdb1").name("volume2");
        assertFalse(volume1.equals(volume2));
    }

    //BaseRock generated method id: ${testEqualsWithSameValues}, hash: 9976C67DA1016633C8519B02EDED1D05
    @Test
    void testEqualsWithSameValues() {
        V1AttachedVolume volume1 = new V1AttachedVolume().devicePath("/dev/sda1").name("volume1");
        V1AttachedVolume volume2 = new V1AttachedVolume().devicePath("/dev/sda1").name("volume1");
        assertTrue(volume1.equals(volume2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: CEAD1C3BB9DDA0173203520C12373776
    @Test
    void testHashCode() {
        V1AttachedVolume volume1 = new V1AttachedVolume().devicePath("/dev/sda1").name("volume1");
        V1AttachedVolume volume2 = new V1AttachedVolume().devicePath("/dev/sda1").name("volume1");
        assertEquals(volume1.hashCode(), volume2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 11EB1605BF7781FD531FD05CC91325A8
    @Test
    void testToString() {
        V1AttachedVolume volume = new V1AttachedVolume().devicePath("/dev/sda1").name("volume1");
        String expected = "class V1AttachedVolume {\n    devicePath: /dev/sda1\n    name: volume1\n}";
        assertEquals(expected, volume.toString());
    }

    //BaseRock generated method id: ${testDevicePathWithDifferentValues}, hash: 370F547595106CE597CBF520EE17F528
    @ParameterizedTest
    @ValueSource(strings = { "/dev/sda1", "/dev/sdb1", "/dev/sdc1" })
    void testDevicePathWithDifferentValues(String devicePath) {
        V1AttachedVolume volume = new V1AttachedVolume().devicePath(devicePath);
        assertEquals(devicePath, volume.getDevicePath());
    }

    //BaseRock generated method id: ${testNameWithDifferentValues}, hash: D36D5FDA54BE1B3CEF467F1D28D30E89
    @ParameterizedTest
    @ValueSource(strings = { "volume1", "volume2", "volume3" })
    void testNameWithDifferentValues(String name) {
        V1AttachedVolume volume = new V1AttachedVolume().name(name);
        assertEquals(name, volume.getName());
    }

    //BaseRock generated method id: ${testDevicePathNull}, hash: B34F21FC20474CE1D190B945E6E61ACE
    @Test
    void testDevicePathNull() {
        V1AttachedVolume volume = new V1AttachedVolume();
        assertNull(volume.getDevicePath());
    }

    //BaseRock generated method id: ${testNameNull}, hash: 189DB5BC54903CB415782C3CD698586A
    @Test
    void testNameNull() {
        V1AttachedVolume volume = new V1AttachedVolume();
        assertNull(volume.getName());
    }
}

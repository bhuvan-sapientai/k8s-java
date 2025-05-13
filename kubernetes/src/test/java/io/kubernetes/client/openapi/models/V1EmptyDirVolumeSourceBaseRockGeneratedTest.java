package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.custom.Quantity;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.models.V1EmptyDirVolumeSource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1EmptyDirVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 6345DFF5AED6066C674DF6337D1C4670
    @Test
    void testConstructor() {
        V1EmptyDirVolumeSource source = new V1EmptyDirVolumeSource();
        assertNotNull(source);
    }

    //BaseRock generated method id: ${testSetAndGetMedium}, hash: 331D699D3DD5F200ED555F416AEB311B
    @Test
    void testSetAndGetMedium() {
        V1EmptyDirVolumeSource source = new V1EmptyDirVolumeSource();
        String medium = "Memory";
        source.setMedium(medium);
        assertEquals(medium, source.getMedium());
    }

    //BaseRock generated method id: ${testSetAndGetMediumWithVariousValues}, hash: 2137F5E80D7897AA8DB0BC5D45588BAC
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "", "Memory", "SSD" })
    void testSetAndGetMediumWithVariousValues(String medium) {
        V1EmptyDirVolumeSource source = new V1EmptyDirVolumeSource();
        source.setMedium(medium);
        assertEquals(medium, source.getMedium());
    }

    //BaseRock generated method id: ${testSetAndGetSizeLimit}, hash: C0D97D76F85156ECF7A7DDF2B65B977A
    @Test
    void testSetAndGetSizeLimit() {
        V1EmptyDirVolumeSource source = new V1EmptyDirVolumeSource();
        Quantity sizeLimit = new Quantity("1Gi");
        source.setSizeLimit(sizeLimit);
        assertEquals(sizeLimit, source.getSizeLimit());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 5CE4C5CA03EB17F8FAE23CB246C7B9F9
    @Test
    void testEqualsWithSameObject() {
        V1EmptyDirVolumeSource source = new V1EmptyDirVolumeSource();
        assertTrue(source.equals(source));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: B0CA22B7ABFBB3DFC2B389F29A4B2ED0
    @Test
    void testEqualsWithDifferentClass() {
        V1EmptyDirVolumeSource source = new V1EmptyDirVolumeSource();
        assertFalse(source.equals(new Object()));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObjects}, hash: 037EEA23243566CDD92E74D507CE8188
    @Test
    void testEqualsWithDifferentObjects() {
        V1EmptyDirVolumeSource source1 = new V1EmptyDirVolumeSource().medium("Memory").sizeLimit(new Quantity("1Gi"));
        V1EmptyDirVolumeSource source2 = new V1EmptyDirVolumeSource().medium("SSD").sizeLimit(new Quantity("2Gi"));
        assertFalse(source1.equals(source2));
    }

    //BaseRock generated method id: ${testEqualsWithSameValues}, hash: EDE24F3A1ABAA271D08A131E0552E5A9
    @Test
    void testEqualsWithSameValues() {
        V1EmptyDirVolumeSource source1 = new V1EmptyDirVolumeSource().medium("Memory").sizeLimit(new Quantity("1Gi"));
        V1EmptyDirVolumeSource source2 = new V1EmptyDirVolumeSource().medium("Memory").sizeLimit(new Quantity("1Gi"));
        assertTrue(source1.equals(source2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 82FA6199B08E5CA107B5887CD0C5C4A1
    @Test
    void testHashCode() {
        V1EmptyDirVolumeSource source1 = new V1EmptyDirVolumeSource().medium("Memory").sizeLimit(new Quantity("1Gi"));
        V1EmptyDirVolumeSource source2 = new V1EmptyDirVolumeSource().medium("Memory").sizeLimit(new Quantity("1Gi"));
        assertEquals(source1.hashCode(), source2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: D757E1E8372E1B3456406A1FE9928AEF
    @Test
    void testToString() {
        V1EmptyDirVolumeSource source = new V1EmptyDirVolumeSource().medium("Memory").sizeLimit(new Quantity("1Gi"));
        String expected = "class V1EmptyDirVolumeSource {\n    medium: Memory\n    sizeLimit: Quantity{number=1073741824, format=BINARY_SI}\n}";
        assertEquals(expected, source.toString());
    }

    //BaseRock generated method id: ${testBuilder}, hash: 3611383EDC5E4DF6D5957FFD6A6B4E46
    @Test
    void testBuilder() {
        V1EmptyDirVolumeSource source = new V1EmptyDirVolumeSource().medium("Memory").sizeLimit(new Quantity("1Gi"));
        assertEquals("Memory", source.getMedium());
        assertEquals(new Quantity("1Gi"), source.getSizeLimit());
    }
}

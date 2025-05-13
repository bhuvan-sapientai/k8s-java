package io.kubernetes.client.openapi.models;

import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1PersistentVolumeSpec;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1VolumeAttachmentSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 71637569B90EFF77A663DE939B04E724
    @Test
    void testConstructor() {
        V1VolumeAttachmentSource source = new V1VolumeAttachmentSource();
        assertNotNull(source);
    }

    //BaseRock generated method id: ${testInlineVolumeSpec}, hash: 6648F718143160E342C216F583A3234E
    @Test
    void testInlineVolumeSpec() {
        V1VolumeAttachmentSource source = new V1VolumeAttachmentSource();
        V1PersistentVolumeSpec spec = new V1PersistentVolumeSpec();
        source.setInlineVolumeSpec(spec);
        assertEquals(spec, source.getInlineVolumeSpec());
    }

    //BaseRock generated method id: ${testPersistentVolumeName}, hash: F0D9A382F6CEED31592AF2D6DE99D21F
    @Test
    void testPersistentVolumeName() {
        V1VolumeAttachmentSource source = new V1VolumeAttachmentSource();
        String volumeName = "test-volume";
        source.setPersistentVolumeName(volumeName);
        assertEquals(volumeName, source.getPersistentVolumeName());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 4889E56262435D131EB216EBBCA5B082
    @Test
    void testEqualsAndHashCode() {
        V1VolumeAttachmentSource source1 = new V1VolumeAttachmentSource().inlineVolumeSpec(new V1PersistentVolumeSpec()).persistentVolumeName("volume1");
        V1VolumeAttachmentSource source2 = new V1VolumeAttachmentSource().inlineVolumeSpec(new V1PersistentVolumeSpec()).persistentVolumeName("volume1");
        V1VolumeAttachmentSource source3 = new V1VolumeAttachmentSource().inlineVolumeSpec(new V1PersistentVolumeSpec()).persistentVolumeName("volume2");
        assertAll(() -> assertEquals(source1, source2), () -> assertEquals(source1.hashCode(), source2.hashCode()), () -> assertThat(source1.equals(source3), is(false)), () -> assertThat(source1.hashCode() == source3.hashCode(), is(false)));
    }

    //BaseRock generated method id: ${testToString}, hash: 997F9A28B529577F13F0080D6502E363
    @Test
    void testToString() {
        V1VolumeAttachmentSource source = new V1VolumeAttachmentSource().inlineVolumeSpec(new V1PersistentVolumeSpec()).persistentVolumeName("test-volume");
        String toString = source.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("inlineVolumeSpec"), is(true));
        assertThat(toString.contains("persistentVolumeName"), is(true));
        assertThat(toString.contains("test-volume"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 303F12DF04D991495A7DDCF5BB13F633
    @Test
    void testBuilder() {
        V1PersistentVolumeSpec spec = new V1PersistentVolumeSpec();
        String volumeName = "test-volume";
        V1VolumeAttachmentSource source = new V1VolumeAttachmentSource().inlineVolumeSpec(spec).persistentVolumeName(volumeName);
        assertAll(() -> assertEquals(spec, source.getInlineVolumeSpec()), () -> assertEquals(volumeName, source.getPersistentVolumeName()));
    }

    //BaseRock generated method id: ${testNullValues}, hash: 53E6947FAA0E928C413789654DE55470
    @Test
    void testNullValues() {
        V1VolumeAttachmentSource source = new V1VolumeAttachmentSource();
        assertAll(() -> assertNull(source.getInlineVolumeSpec()), () -> assertNull(source.getPersistentVolumeName()));
    }
}

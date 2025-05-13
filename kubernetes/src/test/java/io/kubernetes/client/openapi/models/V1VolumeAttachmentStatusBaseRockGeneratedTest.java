package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1VolumeError;
import io.kubernetes.client.openapi.models.V1VolumeAttachmentStatus;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1VolumeAttachmentStatusBaseRockGeneratedTest {

    private V1VolumeAttachmentStatus volumeAttachmentStatus;

    @BeforeEach
    void setUp() {
        volumeAttachmentStatus = new V1VolumeAttachmentStatus();
    }

    //BaseRock generated method id: ${testAttachError}, hash: 5A7060A0E27366848D9E4BDEC4BBD282
    @Test
    void testAttachError() {
        V1VolumeError mockError = mock(V1VolumeError.class);
        volumeAttachmentStatus.setAttachError(mockError);
        assertEquals(mockError, volumeAttachmentStatus.getAttachError());
    }

    //BaseRock generated method id: ${testAttached}, hash: 8C89E6A8729C214CCF16F614A8EC7D93
    @Test
    void testAttached() {
        volumeAttachmentStatus.setAttached(true);
        assertTrue(volumeAttachmentStatus.getAttached());
        volumeAttachmentStatus.setAttached(false);
        assertFalse(volumeAttachmentStatus.getAttached());
    }

    //BaseRock generated method id: ${testAttachmentMetadata}, hash: 33EC9ADA0AFD6838B6FD8CD99955B98F
    @Test
    void testAttachmentMetadata() {
        Map<String, String> metadata = new HashMap<>();
        metadata.put("key1", "value1");
        metadata.put("key2", "value2");
        volumeAttachmentStatus.setAttachmentMetadata(metadata);
        assertEquals(metadata, volumeAttachmentStatus.getAttachmentMetadata());
    }

    //BaseRock generated method id: ${testPutAttachmentMetadataItem}, hash: D908154EDB212161528E975096842AAD
    @Test
    void testPutAttachmentMetadataItem() {
        volumeAttachmentStatus.putAttachmentMetadataItem("testKey", "testValue");
        Map<String, String> metadata = volumeAttachmentStatus.getAttachmentMetadata();
        assertNotNull(metadata);
        assertEquals("testValue", metadata.get("testKey"));
    }

    //BaseRock generated method id: ${testDetachError}, hash: B4324DD5541D2555C90CD134548C8F5D
    @Test
    void testDetachError() {
        V1VolumeError mockError = mock(V1VolumeError.class);
        volumeAttachmentStatus.setDetachError(mockError);
        assertEquals(mockError, volumeAttachmentStatus.getDetachError());
    }

    //BaseRock generated method id: ${testEquals}, hash: DCEF8BC9715846AB316435E3321F4D95
    @Test
    void testEquals() {
        V1VolumeError mockAttachError = mock(V1VolumeError.class);
        V1VolumeError mockDetachError = mock(V1VolumeError.class);
        Map<String, String> metadata = new HashMap<>();
        metadata.put("key", "value");
        V1VolumeAttachmentStatus status1 = new V1VolumeAttachmentStatus().attachError(mockAttachError).attached(true).attachmentMetadata(metadata).detachError(mockDetachError);
        V1VolumeAttachmentStatus status2 = new V1VolumeAttachmentStatus().attachError(mockAttachError).attached(true).attachmentMetadata(new HashMap<>(metadata)).detachError(mockDetachError);
        assertTrue(status1.equals(status2));
        assertTrue(status2.equals(status1));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 42A16F30C2F076D30F60C792D500176F
    @Test
    void testHashCode() {
        V1VolumeError mockAttachError = mock(V1VolumeError.class);
        V1VolumeError mockDetachError = mock(V1VolumeError.class);
        Map<String, String> metadata = new HashMap<>();
        metadata.put("key", "value");
        V1VolumeAttachmentStatus status1 = new V1VolumeAttachmentStatus().attachError(mockAttachError).attached(true).attachmentMetadata(metadata).detachError(mockDetachError);
        V1VolumeAttachmentStatus status2 = new V1VolumeAttachmentStatus().attachError(mockAttachError).attached(true).attachmentMetadata(new HashMap<>(metadata)).detachError(mockDetachError);
        assertEquals(status1.hashCode(), status2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 0C615AAE2456E64B44C9041CC4F71DF7
    @Test
    void testToString() {
        V1VolumeAttachmentStatus status = new V1VolumeAttachmentStatus().attachError(mock(V1VolumeError.class)).attached(true).attachmentMetadata(new HashMap<>()).detachError(mock(V1VolumeError.class));
        String result = status.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("attachError"), is(true));
        assertThat(result.contains("attached"), is(true));
        assertThat(result.contains("attachmentMetadata"), is(true));
        assertThat(result.contains("detachError"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: C4608DC123A5733E3C731382EB5E3ED6
    @Test
    void testBuilder() {
        V1VolumeError attachError = mock(V1VolumeError.class);
        V1VolumeError detachError = mock(V1VolumeError.class);
        Map<String, String> metadata = new HashMap<>();
        metadata.put("key", "value");
        V1VolumeAttachmentStatus status = new V1VolumeAttachmentStatus().attachError(attachError).attached(true).attachmentMetadata(metadata).detachError(detachError);
        assertThat(status.getAttachError(), equalTo(attachError));
        assertThat(status.getAttached(), is(true));
        assertThat(status.getAttachmentMetadata(), equalTo(metadata));
        assertThat(status.getDetachError(), equalTo(detachError));
    }
}

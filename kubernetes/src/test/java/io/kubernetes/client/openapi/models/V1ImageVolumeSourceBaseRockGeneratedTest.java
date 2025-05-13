package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ImageVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 2953C403462EE768271F8BA8026206C6
    @Test
    void testConstructor() {
        V1ImageVolumeSource source = new V1ImageVolumeSource();
        assertNotNull(source);
    }

    //BaseRock generated method id: ${testPullPolicy}, hash: 1D25706F0CC3AF4E20D78218ECB1E779
    @Test
    void testPullPolicy() {
        V1ImageVolumeSource source = new V1ImageVolumeSource();
        String pullPolicy = "Always";
        source.setPullPolicy(pullPolicy);
        assertEquals(pullPolicy, source.getPullPolicy());
    }

    //BaseRock generated method id: ${testPullPolicyWithDifferentValues}, hash: B610703687D9AF0EC206BFE0E17F4EE3
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Always", "Never", "IfNotPresent" })
    void testPullPolicyWithDifferentValues(String pullPolicy) {
        V1ImageVolumeSource source = new V1ImageVolumeSource();
        source.setPullPolicy(pullPolicy);
        assertEquals(pullPolicy, source.getPullPolicy());
    }

    //BaseRock generated method id: ${testReference}, hash: FF0EF6656D6B3AE76A0A4A6FB21CCEB0
    @Test
    void testReference() {
        V1ImageVolumeSource source = new V1ImageVolumeSource();
        String reference = "myimage:latest";
        source.setReference(reference);
        assertEquals(reference, source.getReference());
    }

    //BaseRock generated method id: ${testReferenceWithDifferentValues}, hash: 6C5A430D55227971287A45F002BC56B6
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "myimage:latest", "registry.example.com/myimage:v1.0" })
    void testReferenceWithDifferentValues(String reference) {
        V1ImageVolumeSource source = new V1ImageVolumeSource();
        source.setReference(reference);
        assertEquals(reference, source.getReference());
    }

    //BaseRock generated method id: ${testEquals}, hash: 4192443C948E188525D1871CD004251A
    @Test
    void testEquals() {
        V1ImageVolumeSource source1 = new V1ImageVolumeSource().pullPolicy("Always").reference("myimage:latest");
        V1ImageVolumeSource source2 = new V1ImageVolumeSource().pullPolicy("Always").reference("myimage:latest");
        V1ImageVolumeSource source3 = new V1ImageVolumeSource().pullPolicy("Never").reference("otherimage:v1");
        assertTrue(source1.equals(source2));
        assertFalse(source1.equals(source3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 24F0220D536EBBDF4563DAAE062D3E26
    @Test
    void testHashCode() {
        V1ImageVolumeSource source1 = new V1ImageVolumeSource().pullPolicy("Always").reference("myimage:latest");
        V1ImageVolumeSource source2 = new V1ImageVolumeSource().pullPolicy("Always").reference("myimage:latest");
        assertEquals(source1.hashCode(), source2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 929886E4B580204517CF8F87DEE868D5
    @Test
    void testToString() {
        V1ImageVolumeSource source = new V1ImageVolumeSource().pullPolicy("Always").reference("myimage:latest");
        String expected = "class V1ImageVolumeSource {\n" + "    pullPolicy: Always\n" + "    reference: myimage:latest\n" + "}";
        assertEquals(expected, source.toString());
    }
}

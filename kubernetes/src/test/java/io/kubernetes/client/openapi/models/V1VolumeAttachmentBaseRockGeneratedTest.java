package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1VolumeAttachmentStatus;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1VolumeAttachmentSpec;
import java.lang.reflect.Method;
import com.google.gson.JsonElement;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1VolumeAttachmentBaseRockGeneratedTest {

    private V1VolumeAttachment volumeAttachment;

    private V1ObjectMeta metadata;

    private V1VolumeAttachmentSpec spec;

    private V1VolumeAttachmentStatus status;

    @BeforeEach
    void setUp() {
        metadata = mock(V1ObjectMeta.class);
        spec = mock(V1VolumeAttachmentSpec.class);
        status = mock(V1VolumeAttachmentStatus.class);
        volumeAttachment = new V1VolumeAttachment();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 85027FB550D73236EAA6089BF9584E93
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        volumeAttachment.setApiVersion(apiVersion);
        assertEquals(apiVersion, volumeAttachment.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 4F9DBAC8A2868E66AC27B814019F473D
    @Test
    void testKind() {
        String kind = "VolumeAttachment";
        volumeAttachment.setKind(kind);
        assertEquals(kind, volumeAttachment.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 24168948204F453F590885430953BB1D
    @Test
    void testMetadata() {
        volumeAttachment.setMetadata(metadata);
        assertThat(volumeAttachment.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testSpec}, hash: 84ACD489793B4B2015EF81E9F6296B9C
    @Test
    void testSpec() {
        volumeAttachment.setSpec(spec);
        assertThat(volumeAttachment.getSpec(), is(equalTo(spec)));
    }

    //BaseRock generated method id: ${testStatus}, hash: 6A72E703C169150FFB1CA52F07EF7783
    @Test
    void testStatus() {
        volumeAttachment.setStatus(status);
        assertThat(volumeAttachment.getStatus(), is(equalTo(status)));
    }

    //BaseRock generated method id: ${testEquals}, hash: A073457AD6D154F9B4743007AAEE0BB9
    @Test
    void testEquals() {
        V1VolumeAttachment attachment1 = new V1VolumeAttachment().apiVersion("v1").kind("VolumeAttachment").metadata(metadata).spec(spec).status(status);
        V1VolumeAttachment attachment2 = new V1VolumeAttachment().apiVersion("v1").kind("VolumeAttachment").metadata(metadata).spec(spec).status(status);
        assertThat(attachment1, is(equalTo(attachment2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: E117EF7E7CED900D77C12FE1DFC946FB
    @Test
    void testHashCode() {
        V1VolumeAttachment attachment1 = new V1VolumeAttachment().apiVersion("v1").kind("VolumeAttachment").metadata(metadata).spec(spec).status(status);
        V1VolumeAttachment attachment2 = new V1VolumeAttachment().apiVersion("v1").kind("VolumeAttachment").metadata(metadata).spec(spec).status(status);
        assertEquals(attachment1.hashCode(), attachment2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 67E05C68A286715F480F61552D5732AF
    @Test
    void testToString() {
        when(metadata.toString()).thenReturn("metadata");
        when(spec.toString()).thenReturn("spec");
        when(status.toString()).thenReturn("status");
        V1VolumeAttachment attachment = new V1VolumeAttachment().apiVersion("v1").kind("VolumeAttachment").metadata(metadata).spec(spec).status(status);
        String expected = "class V1VolumeAttachment {\n" + "    apiVersion: v1\n" + "    kind: VolumeAttachment\n" + "    metadata: metadata\n" + "    spec: spec\n" + "    status: status\n" + "}";
        assertEquals(expected, attachment.toString());
    }

    //BaseRock generated method id: ${testBuilder}, hash: BD604FEDC49052DF3E7965D33DF96586
    @Test
    void testBuilder() {
        V1VolumeAttachment attachment = new V1VolumeAttachment().apiVersion("v1").kind("VolumeAttachment").metadata(metadata).spec(spec).status(status);
        assertNotNull(attachment);
        assertEquals("v1", attachment.getApiVersion());
        assertEquals("VolumeAttachment", attachment.getKind());
        assertThat(attachment.getMetadata(), is(equalTo(metadata)));
        assertThat(attachment.getSpec(), is(equalTo(spec)));
        assertThat(attachment.getStatus(), is(equalTo(status)));
    }

    //BaseRock generated method id: ${testConstructor}, hash: E84341B756FBE9B59B0FB91D4AF5E9EC
    @Test
    void testConstructor() {
        V1VolumeAttachment attachment = new V1VolumeAttachment();
        assertNotNull(attachment);
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 48624DD1EC420075EDD1DE69B3EB0113
    @Test
    void testValidateJsonElement() {
        Method method = null;
        try {
            method = V1VolumeAttachment.class.getDeclaredMethod("validateJsonElement", JsonElement.class);
        } catch (NoSuchMethodException e) {
            // Method not found
        }
        assertNotNull(method);
    }

    //BaseRock generated method id: ${testCustomTypeAdapterFactory}, hash: C002008AD281FFA3A114BFBCAF8B9566
    @Test
    void testCustomTypeAdapterFactory() {
        assertNotNull(V1VolumeAttachment.CustomTypeAdapterFactory.class);
    }

    //BaseRock generated method id: ${testFromJson}, hash: 3CFC7026819B41E624FCDE5B87770CD8
    @Disabled()
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"VolumeAttachment\",\"spec\":{}}";
        V1VolumeAttachment attachment = V1VolumeAttachment.fromJson(json);
        assertNotNull(attachment);
        assertEquals("v1", attachment.getApiVersion());
        assertEquals("VolumeAttachment", attachment.getKind());
        assertNotNull(attachment.getSpec());
    }

    //BaseRock generated method id: ${testToJson}, hash: A5A9A286C01EC85E84EE85A0DC397CDE
    @Test
    void testToJson() {
        V1VolumeAttachment attachment = new V1VolumeAttachment().apiVersion("v1").kind("VolumeAttachment").spec(new V1VolumeAttachmentSpec());
        String json = attachment.toJson();
        assertNotNull(json);
        assertThat(json, is(notNullValue()));
        assertThat(json, startsWith("{"));
        assertThat(json, endsWith("}"));
        assertThat(json, containsString("\"apiVersion\":\"v1\""));
        assertThat(json, containsString("\"kind\":\"VolumeAttachment\""));
        assertThat(json, containsString("\"spec\":{}"));
    }
}

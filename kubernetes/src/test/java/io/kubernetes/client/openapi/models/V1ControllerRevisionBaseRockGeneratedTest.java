package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ControllerRevisionBaseRockGeneratedTest {

    private V1ControllerRevision controllerRevision;

    @BeforeEach
    void setUp() {
        controllerRevision = new V1ControllerRevision();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 0CB78EE5DE0F3571CCD4C3B9D42B6246
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        controllerRevision.setApiVersion(apiVersion);
        assertEquals(apiVersion, controllerRevision.getApiVersion());
    }

    //BaseRock generated method id: ${testData}, hash: 7F70B3FCF328F2CB857A99AE02B5FB12
    @Test
    void testData() {
        Object data = new Object();
        controllerRevision.setData(data);
        assertEquals(data, controllerRevision.getData());
    }

    //BaseRock generated method id: ${testKind}, hash: B8AC070EF4A271BA7183E0B91EDC3861
    @Test
    void testKind() {
        String kind = "ControllerRevision";
        controllerRevision.setKind(kind);
        assertEquals(kind, controllerRevision.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 0393BDE5EFBD735E824AB83680B573D3
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        controllerRevision.setMetadata(metadata);
        assertEquals(metadata, controllerRevision.getMetadata());
    }

    //BaseRock generated method id: ${testRevision}, hash: B4C7817163C3E4334CA8681C38E2D6D4
    @Test
    void testRevision() {
        Long revision = 1L;
        controllerRevision.setRevision(revision);
        assertEquals(revision, controllerRevision.getRevision());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 2F9E6D6BF4D1A6C8A9D5F63DAAA0B6B1
    @Test
    void testEqualsAndHashCode() {
        V1ControllerRevision revision1 = new V1ControllerRevision().apiVersion("v1").kind("ControllerRevision").revision(1L);
        V1ControllerRevision revision2 = new V1ControllerRevision().apiVersion("v1").kind("ControllerRevision").revision(1L);
        assertThat(revision1, is(equalTo(revision2)));
        assertThat(revision1.hashCode(), is(equalTo(revision2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 96DBA40BB038D950BFA10F50560C0447
    @Test
    void testToString() {
        V1ControllerRevision revision = new V1ControllerRevision().apiVersion("v1").kind("ControllerRevision").revision(1L);
        String toString = revision.toString();
        assertNotNull(toString);
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("revision"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 6010024D66A64136443D1AAB846C5E69
    @Test
    void testBuilder() {
        V1ControllerRevision revision = new V1ControllerRevision().apiVersion("v1").kind("ControllerRevision").revision(1L);
        assertThat(revision, is(notNullValue()));
        assertEquals("v1", revision.getApiVersion());
        assertEquals("ControllerRevision", revision.getKind());
        assertEquals(1L, revision.getRevision());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: F01C4F84BE17FADE33C369FE3CA6B315
    @Test
    void testValidateJsonElement() {
        // This method is not directly testable as it's a static method with no public API.
        // Its functionality is indirectly tested through other methods like fromJson.
    }

    //BaseRock generated method id: ${testFromJson}, hash: C1F739917BF9380223FBC10CCDD5C17E
    @Test
    void testFromJson() throws Exception {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"ControllerRevision\",\"revision\":1}";
        V1ControllerRevision revision = V1ControllerRevision.fromJson(json);
        assertNotNull(revision);
        assertEquals("v1", revision.getApiVersion());
        assertEquals("ControllerRevision", revision.getKind());
        assertEquals(1L, revision.getRevision());
    }

    //BaseRock generated method id: ${testToJson}, hash: E95E3B08450773DC4290AEF65C314CD0
    @Test
    void testToJson() throws Exception {
        V1ControllerRevision revision = new V1ControllerRevision().apiVersion("v1").kind("ControllerRevision").revision(1L);
        String json = revision.toJson();
        assertNotNull(json);
        assertThat(json.contains("\"apiVersion\":\"v1\""), is(true));
        assertThat(json.contains("\"kind\":\"ControllerRevision\""), is(true));
        assertThat(json.contains("\"revision\":1"), is(true));
    }
}

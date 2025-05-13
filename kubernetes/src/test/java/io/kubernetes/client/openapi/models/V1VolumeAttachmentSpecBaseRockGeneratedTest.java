package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1VolumeAttachmentSource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1VolumeAttachmentSpecBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructorAndGetters}, hash: 0298092DE7839224520FB56FF49A3791
    @Test
    void testConstructorAndGetters() {
        String attacher = "test-attacher";
        String nodeName = "test-node";
        V1VolumeAttachmentSource source = new V1VolumeAttachmentSource();
        V1VolumeAttachmentSpec spec = new V1VolumeAttachmentSpec().attacher(attacher).nodeName(nodeName).source(source);
        assertThat(spec.getAttacher(), is(equalTo(attacher)));
        assertThat(spec.getNodeName(), is(equalTo(nodeName)));
        assertThat(spec.getSource(), is(equalTo(source)));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 24434C6AA3742827A44981E23DEDA54F
    @Test
    void testBuilder() {
        V1VolumeAttachmentSpec spec = new V1VolumeAttachmentSpec().attacher("test-attacher").nodeName("test-node").source(new V1VolumeAttachmentSource());
        assertThat(spec, is(notNullValue()));
        assertThat(spec.getAttacher(), is(equalTo("test-attacher")));
        assertThat(spec.getNodeName(), is(equalTo("test-node")));
        assertThat(spec.getSource(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testEquals}, hash: 1368DAD501E4AE78901DB84A152AA1AF
    @Test
    void testEquals() {
        V1VolumeAttachmentSpec spec1 = new V1VolumeAttachmentSpec().attacher("test-attacher").nodeName("test-node").source(new V1VolumeAttachmentSource());
        V1VolumeAttachmentSpec spec2 = new V1VolumeAttachmentSpec().attacher("test-attacher").nodeName("test-node").source(new V1VolumeAttachmentSource());
        assertThat(spec1.equals(spec2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 7DA0F99C05C4A344B849F8DB582815D6
    @Test
    void testHashCode() {
        V1VolumeAttachmentSpec spec = new V1VolumeAttachmentSpec().attacher("test-attacher").nodeName("test-node").source(new V1VolumeAttachmentSource());
        assertThat(spec.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: FFCAA344A3785353268DFFCB34F18761
    @Test
    void testToString() {
        V1VolumeAttachmentSpec spec = new V1VolumeAttachmentSpec().attacher("test-attacher").nodeName("test-node").source(new V1VolumeAttachmentSource());
        String toString = spec.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("attacher"), is(true));
        assertThat(toString.contains("nodeName"), is(true));
        assertThat(toString.contains("source"), is(true));
    }

    //BaseRock generated method id: ${testSetNullAttacher}, hash: D5E9D6ED721974049741F9BECFC07741
    @Test
    void testSetNullAttacher() {
        V1VolumeAttachmentSpec spec = new V1VolumeAttachmentSpec();
        assertDoesNotThrow(() -> spec.attacher(null));
    }

    //BaseRock generated method id: ${testSetNullNodeName}, hash: 891F30217F2E5AAE74CC3A858DC08B36
    @Test
    void testSetNullNodeName() {
        V1VolumeAttachmentSpec spec = new V1VolumeAttachmentSpec();
        assertDoesNotThrow(() -> spec.nodeName(null));
    }

    //BaseRock generated method id: ${testSetNullSource}, hash: 658124A69E36807DFDA247478DB20D51
    @Test
    void testSetNullSource() {
        V1VolumeAttachmentSpec spec = new V1VolumeAttachmentSpec();
        assertDoesNotThrow(() -> spec.source(null));
    }
}

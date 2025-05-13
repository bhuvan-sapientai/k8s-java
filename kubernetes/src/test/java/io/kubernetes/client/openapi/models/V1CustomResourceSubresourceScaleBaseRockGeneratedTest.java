package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScale;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1CustomResourceSubresourceScaleBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1CustomResourceSubresourceScaleConstructor}, hash: 864AB0993CFFD46809272E4F0A99DAF3
    @Test
    void testV1CustomResourceSubresourceScaleConstructor() {
        V1CustomResourceSubresourceScale scale = new V1CustomResourceSubresourceScale();
        assertThat(scale, is(notNullValue()));
    }

    //BaseRock generated method id: ${testGetSetLabelSelectorPath}, hash: ABD56798DC409CB10A9051DF013A9A1B
    @Test
    void testGetSetLabelSelectorPath() {
        V1CustomResourceSubresourceScale scale = new V1CustomResourceSubresourceScale();
        String labelSelectorPath = ".status.selector";
        scale.setLabelSelectorPath(labelSelectorPath);
        assertThat(scale.getLabelSelectorPath(), is(equalTo(labelSelectorPath)));
    }

    //BaseRock generated method id: ${testSetLabelSelectorPathWithVariousValues}, hash: AA512B88ADD957FCE8ECD5EE3D74CAE1
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { ".spec.selector", ".status.customSelector" })
    void testSetLabelSelectorPathWithVariousValues(String labelSelectorPath) {
        V1CustomResourceSubresourceScale scale = new V1CustomResourceSubresourceScale();
        scale.setLabelSelectorPath(labelSelectorPath);
        assertThat(scale.getLabelSelectorPath(), is(equalTo(labelSelectorPath)));
    }

    //BaseRock generated method id: ${testGetSetSpecReplicasPath}, hash: 2D58FEDEA8AADA1BE29B165C36ECE47C
    @Test
    void testGetSetSpecReplicasPath() {
        V1CustomResourceSubresourceScale scale = new V1CustomResourceSubresourceScale();
        String specReplicasPath = ".spec.replicas";
        scale.setSpecReplicasPath(specReplicasPath);
        assertThat(scale.getSpecReplicasPath(), is(equalTo(specReplicasPath)));
    }

    //BaseRock generated method id: ${testSetSpecReplicasPathWithVariousValues}, hash: AF6EB71427D552F3B1FBF87816C1E83A
    @ParameterizedTest
    @ValueSource(strings = { ".spec.size", ".spec.instances" })
    void testSetSpecReplicasPathWithVariousValues(String specReplicasPath) {
        V1CustomResourceSubresourceScale scale = new V1CustomResourceSubresourceScale();
        scale.setSpecReplicasPath(specReplicasPath);
        assertThat(scale.getSpecReplicasPath(), is(equalTo(specReplicasPath)));
    }

    //BaseRock generated method id: ${testSetSpecReplicasPathWithNull}, hash: B853E5C4FE1ABE444A96BE160680893F
    @Disabled()
    @Test
    void testSetSpecReplicasPathWithNull() {
        V1CustomResourceSubresourceScale scale = new V1CustomResourceSubresourceScale();
        assertThrows(NullPointerException.class, () -> scale.setSpecReplicasPath(null));
    }

    //BaseRock generated method id: ${testGetSetStatusReplicasPath}, hash: 5A6DEB77A56BB3B9E33C8E554C2F3528
    @Test
    void testGetSetStatusReplicasPath() {
        V1CustomResourceSubresourceScale scale = new V1CustomResourceSubresourceScale();
        String statusReplicasPath = ".status.replicas";
        scale.setStatusReplicasPath(statusReplicasPath);
        assertThat(scale.getStatusReplicasPath(), is(equalTo(statusReplicasPath)));
    }

    //BaseRock generated method id: ${testSetStatusReplicasPathWithVariousValues}, hash: E2D8EA71890E94638982694DA7FB9F1E
    @ParameterizedTest
    @ValueSource(strings = { ".status.size", ".status.instances" })
    void testSetStatusReplicasPathWithVariousValues(String statusReplicasPath) {
        V1CustomResourceSubresourceScale scale = new V1CustomResourceSubresourceScale();
        scale.setStatusReplicasPath(statusReplicasPath);
        assertThat(scale.getStatusReplicasPath(), is(equalTo(statusReplicasPath)));
    }

    //BaseRock generated method id: ${testSetStatusReplicasPathWithNull}, hash: 946EC50534E8784AD43542BEA2F3D965
    @Disabled()
    @Test
    void testSetStatusReplicasPathWithNull() {
        V1CustomResourceSubresourceScale scale = new V1CustomResourceSubresourceScale();
        assertThrows(NullPointerException.class, () -> scale.setStatusReplicasPath(null));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 202D9BE0468CF8645E2C62A0E2E20CB4
    @Test
    void testEqualsAndHashCode() {
        V1CustomResourceSubresourceScale scale1 = new V1CustomResourceSubresourceScale().labelSelectorPath(".status.selector").specReplicasPath(".spec.replicas").statusReplicasPath(".status.replicas");
        V1CustomResourceSubresourceScale scale2 = new V1CustomResourceSubresourceScale().labelSelectorPath(".status.selector").specReplicasPath(".spec.replicas").statusReplicasPath(".status.replicas");
        V1CustomResourceSubresourceScale scale3 = new V1CustomResourceSubresourceScale().labelSelectorPath(".status.differentSelector").specReplicasPath(".spec.replicas").statusReplicasPath(".status.replicas");
        assertThat(scale1.equals(scale2), is(true));
        assertThat(scale1.equals(scale3), is(false));
        assertThat(scale1.hashCode(), is(equalTo(scale2.hashCode())));
        assertThat(scale1.hashCode(), is(not(equalTo(scale3.hashCode()))));
    }

    //BaseRock generated method id: ${testToString}, hash: 875BE326E1A66E8725BBA8C120821795
    @Test
    void testToString() {
        V1CustomResourceSubresourceScale scale = new V1CustomResourceSubresourceScale().labelSelectorPath(".status.selector").specReplicasPath(".spec.replicas").statusReplicasPath(".status.replicas");
        String expectedString = "class V1CustomResourceSubresourceScale {\n" + "    labelSelectorPath: .status.selector\n" + "    specReplicasPath: .spec.replicas\n" + "    statusReplicasPath: .status.replicas\n" + "}";
        assertThat(scale.toString(), is(equalTo(expectedString)));
    }
}

package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1VolumeNodeAffinityBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 00F4D458D39C577006E1D79672164B29
    @Test
    void testConstructor() {
        V1VolumeNodeAffinity affinity = new V1VolumeNodeAffinity();
        assertNotNull(affinity);
    }

    //BaseRock generated method id: ${testRequiredSetter}, hash: 3C1E1D1768298EA172D722F3372C6A0A
    @Test
    void testRequiredSetter() {
        V1VolumeNodeAffinity affinity = new V1VolumeNodeAffinity();
        V1NodeSelector nodeSelector = mock(V1NodeSelector.class);
        V1VolumeNodeAffinity result = affinity.required(nodeSelector);
        assertEquals(nodeSelector, result.getRequired());
        assertThat(result, is(affinity));
    }

    //BaseRock generated method id: ${testRequiredGetter}, hash: C3773AD1AADDB0BB90C5746178784DAA
    @Test
    void testRequiredGetter() {
        V1VolumeNodeAffinity affinity = new V1VolumeNodeAffinity();
        V1NodeSelector nodeSelector = mock(V1NodeSelector.class);
        affinity.setRequired(nodeSelector);
        assertEquals(nodeSelector, affinity.getRequired());
    }

    //BaseRock generated method id: ${testEquals}, hash: 4D94611A4F12A221F12C970FAC45AF94
    @Disabled()
    @Test
    void testEquals() {
        V1NodeSelector nodeSelector1 = mock(V1NodeSelector.class);
        V1NodeSelector nodeSelector2 = mock(V1NodeSelector.class);
        doReturn(true).when(nodeSelector1).equals(nodeSelector2);
        V1VolumeNodeAffinity affinity1 = new V1VolumeNodeAffinity().required(nodeSelector1);
        V1VolumeNodeAffinity affinity2 = new V1VolumeNodeAffinity().required(nodeSelector2);
        V1VolumeNodeAffinity affinity3 = new V1VolumeNodeAffinity();
        assertThat(affinity1.equals(affinity2), is(true));
        assertThat(affinity1.equals(affinity3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 84788BB4B01581C410858AFF64D96CDD
    @Test
    void testHashCode() {
        V1VolumeNodeAffinity affinity = new V1VolumeNodeAffinity().required(mock(V1NodeSelector.class));
        int hashCode = affinity.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: F65D8523A0E025D642031997EC335405
    @Test
    void testToString() {
        V1VolumeNodeAffinity affinity = new V1VolumeNodeAffinity().required(mock(V1NodeSelector.class));
        String result = affinity.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result, containsString("required"));
    }

    //BaseRock generated method id: ${testToIndentedString}, hash: F62E25BFE28B00ECFCF3A0FB3E966D7D
    @Test
    void testToIndentedString() {
        V1VolumeNodeAffinity affinity = new V1VolumeNodeAffinity();
        V1NodeSelector nodeSelector = mock(V1NodeSelector.class);
        doReturn("mockNodeSelector").when(nodeSelector).toString();
        affinity.setRequired(nodeSelector);
        String result = affinity.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result, containsString("required: mockNodeSelector"));
    }
}

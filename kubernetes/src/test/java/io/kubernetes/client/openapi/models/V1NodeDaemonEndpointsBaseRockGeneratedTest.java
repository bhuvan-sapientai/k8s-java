package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1DaemonEndpoint;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1NodeDaemonEndpoints;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1NodeDaemonEndpointsBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: D354347C0DFAAC97246A52F3AF58A679
    @Test
    void testConstructor() {
        V1NodeDaemonEndpoints nodeDaemonEndpoints = new V1NodeDaemonEndpoints();
        assertThat(nodeDaemonEndpoints, is(notNullValue()));
    }

    //BaseRock generated method id: ${testKubeletEndpoint}, hash: 57AFEADE4D7E3C9B7D3F1494E9E309A7
    @Test
    void testKubeletEndpoint() {
        V1NodeDaemonEndpoints nodeDaemonEndpoints = new V1NodeDaemonEndpoints();
        V1DaemonEndpoint mockDaemonEndpoint = mock(V1DaemonEndpoint.class);
        nodeDaemonEndpoints.setKubeletEndpoint(mockDaemonEndpoint);
        assertEquals(mockDaemonEndpoint, nodeDaemonEndpoints.getKubeletEndpoint());
    }

    //BaseRock generated method id: ${testKubeletEndpointBuilder}, hash: DD39FAF74A14C7FF11C649BA9D047A97
    @Test
    void testKubeletEndpointBuilder() {
        V1DaemonEndpoint mockDaemonEndpoint = mock(V1DaemonEndpoint.class);
        V1NodeDaemonEndpoints nodeDaemonEndpoints = new V1NodeDaemonEndpoints().kubeletEndpoint(mockDaemonEndpoint);
        assertEquals(mockDaemonEndpoint, nodeDaemonEndpoints.getKubeletEndpoint());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 0A871A665BE57EF1F24C190B9DE157A6
    @Test
    void testEqualsWithSameObject() {
        V1NodeDaemonEndpoints nodeDaemonEndpoints = new V1NodeDaemonEndpoints();
        assertThat(nodeDaemonEndpoints.equals(nodeDaemonEndpoints), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 8088D7E3229F99D6CC27A9D67659917E
    @Test
    void testEqualsWithDifferentClass() {
        V1NodeDaemonEndpoints nodeDaemonEndpoints = new V1NodeDaemonEndpoints();
        assertThat(nodeDaemonEndpoints.equals("string"), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 0FA2F671A02C10818DCFF77486E305A6
    @Test
    void testEqualsWithDifferentObject() {
        V1NodeDaemonEndpoints nodeDaemonEndpoints1 = new V1NodeDaemonEndpoints().kubeletEndpoint(mock(V1DaemonEndpoint.class));
        V1NodeDaemonEndpoints nodeDaemonEndpoints2 = new V1NodeDaemonEndpoints().kubeletEndpoint(mock(V1DaemonEndpoint.class));
        assertThat(nodeDaemonEndpoints1.equals(nodeDaemonEndpoints2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 83956B70E3E652D6F7E5B50EFB9E6592
    @Test
    void testHashCode() {
        V1NodeDaemonEndpoints nodeDaemonEndpoints1 = new V1NodeDaemonEndpoints().kubeletEndpoint(mock(V1DaemonEndpoint.class));
        V1NodeDaemonEndpoints nodeDaemonEndpoints2 = new V1NodeDaemonEndpoints().kubeletEndpoint(mock(V1DaemonEndpoint.class));
        assertThat(nodeDaemonEndpoints1.hashCode(), is(not(equalTo(nodeDaemonEndpoints2.hashCode()))));
    }

    //BaseRock generated method id: ${testToString}, hash: BC0C566136762445CBB6E581CC572779
    @Test
    void testToString() {
        V1DaemonEndpoint mockDaemonEndpoint = mock(V1DaemonEndpoint.class);
        when(mockDaemonEndpoint.toString()).thenReturn("MockedDaemonEndpoint");
        V1NodeDaemonEndpoints nodeDaemonEndpoints = new V1NodeDaemonEndpoints().kubeletEndpoint(mockDaemonEndpoint);
        String expectedString = "class V1NodeDaemonEndpoints {\n    kubeletEndpoint: MockedDaemonEndpoint\n}";
        assertEquals(expectedString, nodeDaemonEndpoints.toString());
    }

    //BaseRock generated method id: ${testGetKubeletEndpointWhenNull}, hash: 0496819ACAF9D85C88B7CEE3FF2B297C
    @Test
    void testGetKubeletEndpointWhenNull() {
        V1NodeDaemonEndpoints nodeDaemonEndpoints = new V1NodeDaemonEndpoints();
        assertThat(nodeDaemonEndpoints.getKubeletEndpoint(), is(nullValue()));
    }
}

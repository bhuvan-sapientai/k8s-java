package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ServiceSpecBaseRockGeneratedTest {

    // Other test methods remain unchanged
    //BaseRock generated method id: ${testToString}, hash: E0D74C1E95A6C3FD71EC148F1D75D838
    @Test
    void testToString() {
        V1ServiceSpec serviceSpec = new V1ServiceSpec();
        serviceSpec.setType("ClusterIP");
        serviceSpec.setClusterIP("192.168.0.1");
        String toString = serviceSpec.toString();
        assertThat(toString, notNullValue());
        assertThat(toString, startsWith("class V1ServiceSpec {"));
        assertThat(toString, endsWith("}"));
        assertThat(toString, containsString("type: ClusterIP"));
        assertThat(toString, containsString("clusterIP: 192.168.0.1"));
    }
}

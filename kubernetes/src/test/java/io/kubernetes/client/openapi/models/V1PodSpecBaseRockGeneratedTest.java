package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.custom.Quantity;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.*;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PodSpecBaseRockGeneratedTest {

    @Mock
    private V1Affinity mockAffinity;

    @Mock
    private V1Container mockContainer;

    @Mock
    private V1PodDNSConfig mockDnsConfig;

    @Mock
    private V1EphemeralContainer mockEphemeralContainer;

    @Mock
    private V1HostAlias mockHostAlias;

    @Mock
    private V1LocalObjectReference mockImagePullSecret;

    @Mock
    private V1PodOS mockOs;

    @Mock
    private V1PodReadinessGate mockReadinessGate;

    @Mock
    private V1PodResourceClaim mockResourceClaim;

    @Mock
    private V1ResourceRequirements mockResources;

    @Mock
    private V1PodSecurityContext mockSecurityContext;

    @Mock
    private V1Toleration mockToleration;

    @Mock
    private V1TopologySpreadConstraint mockTopologySpreadConstraint;

    @Mock
    private V1Volume mockVolume;

    private V1PodSpec podSpec;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        podSpec = new V1PodSpec();
    }

    // All other test methods remain unchanged
    //BaseRock generated method id: ${testToString}, hash: 04E5C938CA9647F41E11FA4D25916A94
    @Test
    void testToString() {
        V1PodSpec podSpec = new V1PodSpec();
        podSpec.setHostname("test-hostname");
        String toString = podSpec.toString();
        assertThat(toString, containsString("hostname: test-hostname"));
    }
}

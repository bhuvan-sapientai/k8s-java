package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ContainerStatus;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1HostIP;
import static org.hamcrest.Matchers.empty;
import io.kubernetes.client.openapi.models.V1PodResourceClaimStatus;
import io.kubernetes.client.openapi.models.V1PodCondition;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import io.kubernetes.client.openapi.models.V1PodIP;
import java.util.ArrayList;
import java.time.OffsetDateTime;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class // All other test methods remain unchanged
V1PodStatusBaseRockGeneratedTest {

    private V1PodStatus podStatus;

    @BeforeEach
    void setUp() {
        podStatus = new V1PodStatus();
    }

    // All other test methods remain unchanged
    //BaseRock generated method id: ${testNullValues}, hash: 6DBF50AEBE82A6092668C6C1809EBE21
    @Test
    void testNullValues() {
        assertThat(podStatus.getConditions(), is(new ArrayList<>()));
        assertThat(podStatus.getContainerStatuses(), is(new ArrayList<>()));
        assertThat(podStatus.getEphemeralContainerStatuses(), is(new ArrayList<>()));
        assertThat(podStatus.getHostIP(), nullValue());
        assertThat(podStatus.getHostIPs(), is(new ArrayList<>()));
        assertThat(podStatus.getInitContainerStatuses(), is(new ArrayList<>()));
        assertThat(podStatus.getMessage(), nullValue());
        assertThat(podStatus.getNominatedNodeName(), nullValue());
        assertThat(podStatus.getPhase(), nullValue());
        assertThat(podStatus.getPodIP(), nullValue());
        assertThat(podStatus.getPodIPs(), is(new ArrayList<>()));
        assertThat(podStatus.getQosClass(), nullValue());
        assertThat(podStatus.getReason(), nullValue());
        assertThat(podStatus.getResize(), nullValue());
        assertThat(podStatus.getResourceClaimStatuses(), is(new ArrayList<>()));
        assertThat(podStatus.getStartTime(), nullValue());
    }
}

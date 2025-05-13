package io.kubernetes.client.custom;

import java.util.Map;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.custom.ContainerMetrics;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.custom.Quantity;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class ContainerMetricsBaseRockGeneratedTest {

    //BaseRock generated method id: ${testGetName}, hash: C27F6ED6F1D4CBB69A05FF571F42DAB9
    @Test
    void testGetName() {
        ContainerMetrics containerMetrics = new ContainerMetrics();
        String name = "test-container";
        containerMetrics.setName(name);
        assertThat(containerMetrics.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testGetUsage}, hash: 3D28D280381560648DCE94B3A4DA288E
    @Test
    void testGetUsage() {
        ContainerMetrics containerMetrics = new ContainerMetrics();
        Map<String, Quantity> usage = new HashMap<>();
        usage.put("cpu", new Quantity("100m"));
        usage.put("memory", new Quantity("256Mi"));
        containerMetrics.setUsage(usage);
        assertThat(containerMetrics.getUsage(), is(equalTo(usage)));
    }

    //BaseRock generated method id: ${testSetName}, hash: 641E38839E86A1903E2C81EBC71FD082
    @Test
    void testSetName() {
        ContainerMetrics containerMetrics = new ContainerMetrics();
        String name = "new-container";
        containerMetrics.setName(name);
        assertThat(containerMetrics.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testSetUsage}, hash: FA36B18E4BE4A9AB25AEE51EE9012BD0
    @Test
    void testSetUsage() {
        ContainerMetrics containerMetrics = new ContainerMetrics();
        Map<String, Quantity> usage = new HashMap<>();
        usage.put("cpu", new Quantity("200m"));
        usage.put("memory", new Quantity("512Mi"));
        containerMetrics.setUsage(usage);
        assertThat(containerMetrics.getUsage(), is(equalTo(usage)));
    }

    //BaseRock generated method id: ${testContainerMetricsInstantiation}, hash: A0272F47C363061CF70CEBEE5BCEC678
    @Test
    void testContainerMetricsInstantiation() {
        ContainerMetrics containerMetrics = new ContainerMetrics();
        assertThat(containerMetrics, is(notNullValue()));
    }
}

package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1PersistentVolumeClaim;
import io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategy;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import java.util.Arrays;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.openapi.models.V1StatefulSetPersistentVolumeClaimRetentionPolicy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1StatefulSetOrdinals;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import java.util.Objects;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import static org.hamcrest.Matchers.not;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1StatefulSetSpecBaseRockGeneratedTest {

    private V1StatefulSetSpec statefulSetSpec;

    private V1LabelSelector selector;

    private V1PodTemplateSpec template;

    private String serviceName;

    @BeforeEach
    void setUp() {
        selector = new V1LabelSelector();
        template = new V1PodTemplateSpec();
        serviceName = "test-service";
        statefulSetSpec = new V1StatefulSetSpec().selector(selector).template(template).serviceName(serviceName);
    }

    //BaseRock generated method id: ${testEquals}, hash: 111234437A8DC083C7E388B1CE864072
    @Disabled()
    @Test
    void testEquals() {
        // Same object reference
        assertTrue(statefulSetSpec.equals(statefulSetSpec));
        // Different class
        assertFalse(statefulSetSpec.equals("not a statefulSetSpec"));
        // Null comparison
        assertFalse(statefulSetSpec.equals(null));
        // Equal objects
        V1StatefulSetSpec other = new V1StatefulSetSpec().selector(selector).template(template).serviceName(serviceName);
        assertTrue(statefulSetSpec.equals(other));
        // Unequal objects - different minReadySeconds
        other.setMinReadySeconds(30);
        assertFalse(statefulSetSpec.equals(other));
        statefulSetSpec.setMinReadySeconds(30);
        assertTrue(statefulSetSpec.equals(other));
        // Unequal objects - different ordinals
        V1StatefulSetOrdinals ordinals = new V1StatefulSetOrdinals();
        other.setOrdinals(ordinals);
        assertFalse(statefulSetSpec.equals(other));
        statefulSetSpec.setOrdinals(ordinals);
        assertTrue(statefulSetSpec.equals(other));
        // Unequal objects - different persistentVolumeClaimRetentionPolicy
        V1StatefulSetPersistentVolumeClaimRetentionPolicy policy = new V1StatefulSetPersistentVolumeClaimRetentionPolicy();
        other.setPersistentVolumeClaimRetentionPolicy(policy);
        assertFalse(statefulSetSpec.equals(other));
        statefulSetSpec.setPersistentVolumeClaimRetentionPolicy(policy);
        assertTrue(statefulSetSpec.equals(other));
        // Unequal objects - different podManagementPolicy
        other.setPodManagementPolicy("Parallel");
        assertFalse(statefulSetSpec.equals(other));
        statefulSetSpec.setPodManagementPolicy("Parallel");
        assertTrue(statefulSetSpec.equals(other));
        // Unequal objects - different replicas
        other.setReplicas(3);
        assertFalse(statefulSetSpec.equals(other));
        statefulSetSpec.setReplicas(3);
        assertTrue(statefulSetSpec.equals(other));
        // Unequal objects - different revisionHistoryLimit
        other.setRevisionHistoryLimit(5);
        assertFalse(statefulSetSpec.equals(other));
        statefulSetSpec.setRevisionHistoryLimit(5);
        assertTrue(statefulSetSpec.equals(other));
        // Unequal objects - different selector
        V1LabelSelector newSelector = new V1LabelSelector();
        other.setSelector(newSelector);
        assertFalse(statefulSetSpec.equals(other));
        statefulSetSpec.setSelector(newSelector);
        assertTrue(statefulSetSpec.equals(other));
        // Unequal objects - different serviceName
        other.setServiceName("different-service");
        assertFalse(statefulSetSpec.equals(other));
        statefulSetSpec.setServiceName("different-service");
        assertTrue(statefulSetSpec.equals(other));
        // Unequal objects - different template
        V1PodTemplateSpec newTemplate = new V1PodTemplateSpec();
        other.setTemplate(newTemplate);
        assertFalse(statefulSetSpec.equals(other));
        statefulSetSpec.setTemplate(newTemplate);
        assertTrue(statefulSetSpec.equals(other));
        // Unequal objects - different updateStrategy
        V1StatefulSetUpdateStrategy strategy = new V1StatefulSetUpdateStrategy();
        other.setUpdateStrategy(strategy);
        assertFalse(statefulSetSpec.equals(other));
        statefulSetSpec.setUpdateStrategy(strategy);
        assertTrue(statefulSetSpec.equals(other));
        // Unequal objects - different volumeClaimTemplates
        List<V1PersistentVolumeClaim> templates = new ArrayList<>();
        templates.add(new V1PersistentVolumeClaim());
        other.setVolumeClaimTemplates(templates);
        assertFalse(statefulSetSpec.equals(other));
        statefulSetSpec.setVolumeClaimTemplates(new ArrayList<>(templates));
        assertTrue(statefulSetSpec.equals(other));
    }
}

package io.kubernetes.client.openapi.models;

import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatus;
import io.kubernetes.client.custom.Quantity;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.containsInAnyOrder;
import io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition;
import java.util.HashMap;
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.V1ModifyVolumeStatus;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PersistentVolumeClaimStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1PersistentVolumeClaimStatusConstructor}, hash: 3A971BA20A27BFAD73FAF96D8BDF2DD3
    @Test
    void testV1PersistentVolumeClaimStatusConstructor() {
        V1PersistentVolumeClaimStatus status = new V1PersistentVolumeClaimStatus();
        assertNotNull(status);
    }

    //BaseRock generated method id: ${testAccessModes}, hash: 14B9DDD130B7E2F2FAA1C4E0B96A8681
    @Test
    void testAccessModes() {
        V1PersistentVolumeClaimStatus status = new V1PersistentVolumeClaimStatus();
        List<String> accessModes = new ArrayList<>();
        accessModes.add("ReadWriteOnce");
        accessModes.add("ReadOnlyMany");
        status.setAccessModes(accessModes);
        assertEquals(accessModes, status.getAccessModes());
        status.addAccessModesItem("ReadWriteMany");
        assertThat(status.getAccessModes(), hasSize(3));
        assertThat(status.getAccessModes(), containsInAnyOrder("ReadWriteOnce", "ReadOnlyMany", "ReadWriteMany"));
    }

    //BaseRock generated method id: ${testAllocatedResourceStatuses}, hash: 292F77CD3E9101561BBE36E54DF0B7AE
    @Test
    void testAllocatedResourceStatuses() {
        V1PersistentVolumeClaimStatus status = new V1PersistentVolumeClaimStatus();
        Map<String, String> allocatedResourceStatuses = new HashMap<>();
        allocatedResourceStatuses.put("storage", "Bound");
        status.setAllocatedResourceStatuses(allocatedResourceStatuses);
        assertEquals(allocatedResourceStatuses, status.getAllocatedResourceStatuses());
        status.putAllocatedResourceStatusesItem("cpu", "Pending");
        assertThat(status.getAllocatedResourceStatuses(), hasEntry("storage", "Bound"));
        assertThat(status.getAllocatedResourceStatuses(), hasEntry("cpu", "Pending"));
    }

    //BaseRock generated method id: ${testAllocatedResources}, hash: 618D7C4E16E5AACC0AA3D9F35DE0E204
    @Test
    void testAllocatedResources() {
        V1PersistentVolumeClaimStatus status = new V1PersistentVolumeClaimStatus();
        Map<String, Quantity> allocatedResources = new HashMap<>();
        allocatedResources.put("storage", new Quantity("10Gi"));
        status.setAllocatedResources(allocatedResources);
        assertEquals(allocatedResources, status.getAllocatedResources());
        status.putAllocatedResourcesItem("cpu", new Quantity("2"));
        assertThat(status.getAllocatedResources(), hasEntry(equalTo("storage"), notNullValue()));
        assertThat(status.getAllocatedResources(), hasEntry(equalTo("cpu"), notNullValue()));
    }

    //BaseRock generated method id: ${testCapacity}, hash: FB0DDC42EF9FFC2FB2A67FF8AC57A794
    @Test
    void testCapacity() {
        V1PersistentVolumeClaimStatus status = new V1PersistentVolumeClaimStatus();
        Map<String, Quantity> capacity = new HashMap<>();
        capacity.put("storage", new Quantity("20Gi"));
        status.setCapacity(capacity);
        assertEquals(capacity, status.getCapacity());
        status.putCapacityItem("memory", new Quantity("4Gi"));
        assertThat(status.getCapacity(), hasEntry(equalTo("storage"), notNullValue()));
        assertThat(status.getCapacity(), hasEntry(equalTo("memory"), notNullValue()));
    }

    //BaseRock generated method id: ${testConditions}, hash: F65050A6B9872B5C9F073F044CCE5AFE
    @Test
    void testConditions() {
        V1PersistentVolumeClaimStatus status = new V1PersistentVolumeClaimStatus();
        List<V1PersistentVolumeClaimCondition> conditions = new ArrayList<>();
        V1PersistentVolumeClaimCondition condition = new V1PersistentVolumeClaimCondition();
        condition.setType("Resizing");
        condition.setStatus("True");
        conditions.add(condition);
        status.setConditions(conditions);
        assertEquals(conditions, status.getConditions());
        V1PersistentVolumeClaimCondition newCondition = new V1PersistentVolumeClaimCondition();
        newCondition.setType("FileSystemResizePending");
        newCondition.setStatus("True");
        status.addConditionsItem(newCondition);
        assertThat(status.getConditions(), hasSize(2));
        assertThat(status.getConditions().get(0).getType(), is("Resizing"));
        assertThat(status.getConditions().get(1).getType(), is("FileSystemResizePending"));
    }

    //BaseRock generated method id: ${testCurrentVolumeAttributesClassName}, hash: FEE82B644C0F2EDD6E3E5060ACF347FC
    @Test
    void testCurrentVolumeAttributesClassName() {
        V1PersistentVolumeClaimStatus status = new V1PersistentVolumeClaimStatus();
        String className = "fast-storage";
        status.setCurrentVolumeAttributesClassName(className);
        assertEquals(className, status.getCurrentVolumeAttributesClassName());
    }

    //BaseRock generated method id: ${testModifyVolumeStatus}, hash: D08DF4044030404C956FE8BA39CACA64
    @Test
    void testModifyVolumeStatus() {
        V1PersistentVolumeClaimStatus status = new V1PersistentVolumeClaimStatus();
        V1ModifyVolumeStatus modifyVolumeStatus = new V1ModifyVolumeStatus();
        modifyVolumeStatus.setStatus("InProgress");
        status.setModifyVolumeStatus(modifyVolumeStatus);
        assertEquals(modifyVolumeStatus, status.getModifyVolumeStatus());
    }

    //BaseRock generated method id: ${testPhase}, hash: 310D9061BE6D2085AE7D70755ABDFB1A
    @Test
    void testPhase() {
        V1PersistentVolumeClaimStatus status = new V1PersistentVolumeClaimStatus();
        String phase = "Bound";
        status.setPhase(phase);
        assertEquals(phase, status.getPhase());
    }
}

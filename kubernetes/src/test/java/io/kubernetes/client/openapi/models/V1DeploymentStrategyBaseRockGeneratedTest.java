package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1DeploymentStrategy;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.V1RollingUpdateDeployment;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1DeploymentStrategyBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1DeploymentStrategyConstructor}, hash: BE223D21A9A9A13F2E7AAE9020166AB8
    @Test
    void testV1DeploymentStrategyConstructor() {
        V1DeploymentStrategy strategy = new V1DeploymentStrategy();
        assertNotNull(strategy);
    }

    //BaseRock generated method id: ${testRollingUpdate}, hash: B85638E14810F3540938961C82BEEDF2
    @Test
    void testRollingUpdate() {
        V1RollingUpdateDeployment rollingUpdate = mock(V1RollingUpdateDeployment.class);
        V1DeploymentStrategy strategy = new V1DeploymentStrategy().rollingUpdate(rollingUpdate);
        assertEquals(rollingUpdate, strategy.getRollingUpdate());
    }

    //BaseRock generated method id: ${testType}, hash: DDAE18A79335B801B03E1D2DFED3E5B6
    @Test
    void testType() {
        String type = "RollingUpdate";
        V1DeploymentStrategy strategy = new V1DeploymentStrategy().type(type);
        assertEquals(type, strategy.getType());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: DF97F8F540786EEE9AE3FF114ADD40E5
    @Test
    void testEqualsAndHashCode() {
        V1RollingUpdateDeployment rollingUpdate1 = mock(V1RollingUpdateDeployment.class);
        V1RollingUpdateDeployment rollingUpdate2 = mock(V1RollingUpdateDeployment.class);
        V1DeploymentStrategy strategy1 = new V1DeploymentStrategy().rollingUpdate(rollingUpdate1).type("RollingUpdate");
        V1DeploymentStrategy strategy2 = new V1DeploymentStrategy().rollingUpdate(rollingUpdate1).type("RollingUpdate");
        V1DeploymentStrategy strategy3 = new V1DeploymentStrategy().rollingUpdate(rollingUpdate2).type("Recreate");
        assertThat(strategy1, equalTo(strategy2));
        assertThat(strategy1.hashCode(), equalTo(strategy2.hashCode()));
        assertThat(strategy1, is(notNullValue()));
        assertThat(strategy1.equals(strategy3), is(false));
    }

    //BaseRock generated method id: ${testToString}, hash: EAFFB932487C7EA9F32DB7A4D6B87DA8
    @Test
    void testToString() {
        V1RollingUpdateDeployment rollingUpdate = mock(V1RollingUpdateDeployment.class);
        when(rollingUpdate.toString()).thenReturn("RollingUpdateMock");
        V1DeploymentStrategy strategy = new V1DeploymentStrategy().rollingUpdate(rollingUpdate).type("RollingUpdate");
        String expected = "class V1DeploymentStrategy {\n    rollingUpdate: RollingUpdateMock\n    type: RollingUpdate\n}";
        assertEquals(expected, strategy.toString());
    }
}

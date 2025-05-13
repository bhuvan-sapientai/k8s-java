package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1RollingUpdateDeployment;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import io.kubernetes.client.custom.IntOrString;
import com.google.gson.JsonElement;
import io.kubernetes.client.openapi.JSON;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1RollingUpdateDeploymentBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: DF7C632405310B6895CB0AA32013C16E
    @Test
    void testConstructor() {
        V1RollingUpdateDeployment deployment = new V1RollingUpdateDeployment();
        assertNotNull(deployment);
    }

    //BaseRock generated method id: ${testMaxSurge}, hash: CA92B26C2BC29A00F49EB2EAA6500DA8
    @Test
    void testMaxSurge() {
        V1RollingUpdateDeployment deployment = new V1RollingUpdateDeployment();
        IntOrString maxSurge = new IntOrString(5);
        deployment.setMaxSurge(maxSurge);
        assertEquals(maxSurge, deployment.getMaxSurge());
    }

    //BaseRock generated method id: ${testMaxUnavailable}, hash: 02CEF3030A4E89FAF16C414429B628B8
    @Test
    void testMaxUnavailable() {
        V1RollingUpdateDeployment deployment = new V1RollingUpdateDeployment();
        IntOrString maxUnavailable = new IntOrString("25%");
        deployment.setMaxUnavailable(maxUnavailable);
        assertEquals(maxUnavailable, deployment.getMaxUnavailable());
    }

    //BaseRock generated method id: ${testEquals}, hash: F9343A34471BB82EB1A1665DD64F7C68
    @Test
    void testEquals() {
        V1RollingUpdateDeployment deployment1 = new V1RollingUpdateDeployment().maxSurge(new IntOrString(3)).maxUnavailable(new IntOrString("30%"));
        V1RollingUpdateDeployment deployment2 = new V1RollingUpdateDeployment().maxSurge(new IntOrString(3)).maxUnavailable(new IntOrString("30%"));
        V1RollingUpdateDeployment deployment3 = new V1RollingUpdateDeployment().maxSurge(new IntOrString(4)).maxUnavailable(new IntOrString("40%"));
        assertThat(deployment1.equals(deployment2), is(true));
        assertThat(deployment1.equals(deployment3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: AB1BA735019E968DCD3F5E456C6D431A
    @Test
    void testHashCode() {
        V1RollingUpdateDeployment deployment1 = new V1RollingUpdateDeployment().maxSurge(new IntOrString(3)).maxUnavailable(new IntOrString("30%"));
        V1RollingUpdateDeployment deployment2 = new V1RollingUpdateDeployment().maxSurge(new IntOrString(3)).maxUnavailable(new IntOrString("30%"));
        assertThat(deployment1.hashCode(), equalTo(deployment2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 23309A43A55387598CE89317A073AFA1
    @Test
    void testToString() {
        V1RollingUpdateDeployment deployment = new V1RollingUpdateDeployment().maxSurge(new IntOrString(3)).maxUnavailable(new IntOrString("30%"));
        String expectedString = "class V1RollingUpdateDeployment {\n    maxSurge: 3\n    maxUnavailable: 30%\n}";
        assertThat(deployment.toString(), equalTo(expectedString));
    }

    //BaseRock generated method id: ${testToJson}, hash: E1728DAFFBD91461D86940EE993C5293
    @Test
    void testToJson() throws Exception {
        V1RollingUpdateDeployment deployment = new V1RollingUpdateDeployment().maxSurge(new IntOrString(3)).maxUnavailable(new IntOrString("30%"));
        String json = deployment.toJson();
        assertThat(json, notNullValue());
        assertThat(json.contains("\"maxSurge\":3"), is(true));
        assertThat(json.contains("\"maxUnavailable\":\"30%\""), is(true));
    }

    //BaseRock generated method id: ${testFromJson}, hash: BBE44FBBC4026C2BC3594B1A9AA9476F
    @Test
    void testFromJson() throws Exception {
        String json = "{\"maxSurge\":3,\"maxUnavailable\":\"30%\"}";
        V1RollingUpdateDeployment deployment = V1RollingUpdateDeployment.fromJson(json);
        assertThat(deployment, notNullValue());
        assertThat(deployment.getMaxSurge().getIntValue(), equalTo(3));
        assertThat(deployment.getMaxUnavailable().getStrValue(), equalTo("30%"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: C122EDF964427972B7B978B71D65F94B
    @Test
    void testValidateJsonElement() throws Exception {
        V1RollingUpdateDeployment deployment = new V1RollingUpdateDeployment().maxSurge(new IntOrString(3)).maxUnavailable(new IntOrString("30%"));
        JsonElement jsonElement = JSON.getGson().toJsonTree(deployment);
        V1RollingUpdateDeployment.validateJsonElement(jsonElement);
    }
}

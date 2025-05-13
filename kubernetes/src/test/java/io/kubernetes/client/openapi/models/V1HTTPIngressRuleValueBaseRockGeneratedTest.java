package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1HTTPIngressPath;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1HTTPIngressRuleValueBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 1B0D82A0ACF9E587BB35DDC1C69C7D95
    @Test
    void testConstructor() {
        V1HTTPIngressRuleValue ruleValue = new V1HTTPIngressRuleValue();
        assertThat(ruleValue, notNullValue());
        assertThat(ruleValue.getPaths(), notNullValue());
        assertThat(ruleValue.getPaths(), hasSize(0));
    }

    //BaseRock generated method id: ${testSetAndGetPaths}, hash: 4F51B9570F729E65784D189FE492F59A
    @Test
    void testSetAndGetPaths() {
        V1HTTPIngressRuleValue ruleValue = new V1HTTPIngressRuleValue();
        List<V1HTTPIngressPath> paths = new ArrayList<>();
        paths.add(mock(V1HTTPIngressPath.class));
        paths.add(mock(V1HTTPIngressPath.class));
        ruleValue.setPaths(paths);
        assertThat(ruleValue.getPaths(), equalTo(paths));
        assertThat(ruleValue.getPaths(), hasSize(2));
    }

    //BaseRock generated method id: ${testAddPathsItem}, hash: DFA1A01CDC1FF2C44A475D4BC4526368
    @Test
    void testAddPathsItem() {
        V1HTTPIngressRuleValue ruleValue = new V1HTTPIngressRuleValue();
        V1HTTPIngressPath path = mock(V1HTTPIngressPath.class);
        ruleValue.addPathsItem(path);
        assertThat(ruleValue.getPaths(), hasSize(1));
        assertThat(ruleValue.getPaths().get(0), equalTo(path));
    }

    //BaseRock generated method id: ${testAddPathsItemToNullList}, hash: 4386D6F3AEE35A8EA619CB80257E22F7
    @Test
    void testAddPathsItemToNullList() {
        V1HTTPIngressRuleValue ruleValue = new V1HTTPIngressRuleValue();
        ruleValue.setPaths(null);
        V1HTTPIngressPath path = mock(V1HTTPIngressPath.class);
        ruleValue.addPathsItem(path);
        assertThat(ruleValue.getPaths(), hasSize(1));
        assertThat(ruleValue.getPaths().get(0), equalTo(path));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 74FBEEA9669979918B82E7EBB46C5894
    @Test
    void testEqualsAndHashCode() {
        V1HTTPIngressRuleValue ruleValue1 = new V1HTTPIngressRuleValue();
        V1HTTPIngressRuleValue ruleValue2 = new V1HTTPIngressRuleValue();
        List<V1HTTPIngressPath> paths = new ArrayList<>();
        paths.add(mock(V1HTTPIngressPath.class));
        ruleValue1.setPaths(paths);
        ruleValue2.setPaths(paths);
        assertThat(ruleValue1, equalTo(ruleValue2));
        assertThat(ruleValue1.hashCode(), equalTo(ruleValue2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 5ABA17986050E35C11382BA028CB5687
    @Test
    void testToString() {
        V1HTTPIngressRuleValue ruleValue = new V1HTTPIngressRuleValue();
        List<V1HTTPIngressPath> paths = new ArrayList<>();
        paths.add(mock(V1HTTPIngressPath.class));
        ruleValue.setPaths(paths);
        String result = ruleValue.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("class V1HTTPIngressRuleValue"), equalTo(true));
        assertThat(result.contains("paths:"), equalTo(true));
    }

    //BaseRock generated method id: ${testSetNullPaths}, hash: F71C1AD4CD199E54C7702D735233E9E1
    @Disabled()
    @Test
    void testSetNullPaths() {
        V1HTTPIngressRuleValue ruleValue = new V1HTTPIngressRuleValue();
        ruleValue.setPaths(null);
        assertThat(ruleValue.getPaths(), notNullValue());
        assertThat(ruleValue.getPaths(), hasSize(0));
    }
}

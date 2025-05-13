package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatus;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition;
import io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CustomResourceDefinitionStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 65F174780DCAC3946B63F7F0B2C4311E
    @Test
    void testConstructor() {
        V1CustomResourceDefinitionStatus status = new V1CustomResourceDefinitionStatus();
        assertNotNull(status);
    }

    //BaseRock generated method id: ${testAcceptedNames}, hash: 28424E1473D4A2C2BC5F186512814F5C
    @Test
    void testAcceptedNames() {
        V1CustomResourceDefinitionStatus status = new V1CustomResourceDefinitionStatus();
        V1CustomResourceDefinitionNames names = new V1CustomResourceDefinitionNames();
        status.setAcceptedNames(names);
        assertEquals(names, status.getAcceptedNames());
    }

    //BaseRock generated method id: ${testConditions}, hash: E0B6A4FB77B9008FEB511786D57DA5A7
    @Test
    void testConditions() {
        V1CustomResourceDefinitionStatus status = new V1CustomResourceDefinitionStatus();
        List<V1CustomResourceDefinitionCondition> conditions = new ArrayList<>();
        V1CustomResourceDefinitionCondition condition = new V1CustomResourceDefinitionCondition();
        conditions.add(condition);
        status.setConditions(conditions);
        assertEquals(conditions, status.getConditions());
    }

    //BaseRock generated method id: ${testAddConditionsItem}, hash: 09B1211D58ED8F2854B92D525DD83E32
    @Test
    void testAddConditionsItem() {
        V1CustomResourceDefinitionStatus status = new V1CustomResourceDefinitionStatus();
        V1CustomResourceDefinitionCondition condition = new V1CustomResourceDefinitionCondition();
        status.addConditionsItem(condition);
        assertThat(status.getConditions(), hasSize(1));
        assertThat(status.getConditions().get(0), is(condition));
    }

    //BaseRock generated method id: ${testStoredVersions}, hash: 334FD44108B6C7D2DEB15B843E83E387
    @Test
    void testStoredVersions() {
        V1CustomResourceDefinitionStatus status = new V1CustomResourceDefinitionStatus();
        List<String> versions = Arrays.asList("v1", "v2");
        status.setStoredVersions(versions);
        assertEquals(versions, status.getStoredVersions());
    }

    //BaseRock generated method id: ${testAddStoredVersionsItem}, hash: 1F3DE9AD8CE8E279971B03DC3071F58C
    @Test
    void testAddStoredVersionsItem() {
        V1CustomResourceDefinitionStatus status = new V1CustomResourceDefinitionStatus();
        String version = "v1";
        status.addStoredVersionsItem(version);
        assertThat(status.getStoredVersions(), hasSize(1));
        assertThat(status.getStoredVersions().get(0), is(version));
    }

    //BaseRock generated method id: ${testEquals}, hash: 0025F3F5DE337C973928C83A8C866D9D
    @Test
    void testEquals() {
        V1CustomResourceDefinitionStatus status1 = new V1CustomResourceDefinitionStatus().acceptedNames(new V1CustomResourceDefinitionNames()).conditions(Arrays.asList(new V1CustomResourceDefinitionCondition())).storedVersions(Arrays.asList("v1"));
        V1CustomResourceDefinitionStatus status2 = new V1CustomResourceDefinitionStatus().acceptedNames(new V1CustomResourceDefinitionNames()).conditions(Arrays.asList(new V1CustomResourceDefinitionCondition())).storedVersions(Arrays.asList("v1"));
        assertThat(status1.equals(status2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 77D31BCA69E6790513A3560B3C1D1DEF
    @Test
    void testHashCode() {
        V1CustomResourceDefinitionStatus status1 = new V1CustomResourceDefinitionStatus().acceptedNames(new V1CustomResourceDefinitionNames()).conditions(Arrays.asList(new V1CustomResourceDefinitionCondition())).storedVersions(Arrays.asList("v1"));
        V1CustomResourceDefinitionStatus status2 = new V1CustomResourceDefinitionStatus().acceptedNames(new V1CustomResourceDefinitionNames()).conditions(Arrays.asList(new V1CustomResourceDefinitionCondition())).storedVersions(Arrays.asList("v1"));
        assertThat(status1.hashCode(), equalTo(status2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 656E1D007B0CB28B83A4C5574AB3E960
    @Test
    void testToString() {
        V1CustomResourceDefinitionStatus status = new V1CustomResourceDefinitionStatus().acceptedNames(new V1CustomResourceDefinitionNames()).conditions(Arrays.asList(new V1CustomResourceDefinitionCondition())).storedVersions(Arrays.asList("v1"));
        String result = status.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("acceptedNames"), is(true));
        assertThat(result.contains("conditions"), is(true));
        assertThat(result.contains("storedVersions"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 556C6E4BFD51FB3F7C2ED8275F66B948
    @Test
    void testBuilder() {
        V1CustomResourceDefinitionNames names = new V1CustomResourceDefinitionNames();
        V1CustomResourceDefinitionCondition condition = new V1CustomResourceDefinitionCondition();
        String version = "v1";
        V1CustomResourceDefinitionStatus status = new V1CustomResourceDefinitionStatus().acceptedNames(names).addConditionsItem(condition).addStoredVersionsItem(version);
        assertThat(status.getAcceptedNames(), is(names));
        assertThat(status.getConditions(), containsInAnyOrder(condition));
        assertThat(status.getStoredVersions(), containsInAnyOrder(version));
    }

    //BaseRock generated method id: ${testNullFields}, hash: 31C021C1D7D23C68212F85AD73CA99B1
    @Test
    void testNullFields() {
        V1CustomResourceDefinitionStatus status = new V1CustomResourceDefinitionStatus();
        assertThat(status.getAcceptedNames(), is(nullValue()));
        assertThat(status.getConditions(), is(notNullValue()));
        assertThat(status.getConditions(), hasSize(0));
        assertThat(status.getStoredVersions(), is(notNullValue()));
        assertThat(status.getStoredVersions(), hasSize(0));
    }
}

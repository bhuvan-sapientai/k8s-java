package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1FieldSelectorAttributes;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import io.kubernetes.client.openapi.models.V1FieldSelectorRequirement;
import java.util.ArrayList;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1FieldSelectorAttributesBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: DA0DC3FA2DF3534ED5AE253F17F3A2B9
    @Test
    void testConstructor() {
        V1FieldSelectorAttributes attributes = new V1FieldSelectorAttributes();
        assertThat(attributes, is(notNullValue()));
    }

    //BaseRock generated method id: ${testRawSelector}, hash: F5D5AD0BF98293B7E1C7AB2B35066EAF
    @Test
    void testRawSelector() {
        V1FieldSelectorAttributes attributes = new V1FieldSelectorAttributes();
        String rawSelector = "test-selector";
        attributes.setRawSelector(rawSelector);
        assertEquals(rawSelector, attributes.getRawSelector());
    }

    //BaseRock generated method id: ${testRequirements}, hash: 0FCEB3E28B073141FAE9A11FE06CAF2A
    @Test
    void testRequirements() {
        V1FieldSelectorAttributes attributes = new V1FieldSelectorAttributes();
        List<V1FieldSelectorRequirement> requirements = new ArrayList<>();
        V1FieldSelectorRequirement requirement = new V1FieldSelectorRequirement();
        requirements.add(requirement);
        attributes.setRequirements(requirements);
        assertThat(attributes.getRequirements(), hasSize(1));
        assertEquals(requirement, attributes.getRequirements().get(0));
    }

    //BaseRock generated method id: ${testAddRequirementsItem}, hash: D7FAD58F67349C4F1E5831FF6AF9AB19
    @Test
    void testAddRequirementsItem() {
        V1FieldSelectorAttributes attributes = new V1FieldSelectorAttributes();
        V1FieldSelectorRequirement requirement = new V1FieldSelectorRequirement();
        attributes.addRequirementsItem(requirement);
        assertThat(attributes.getRequirements(), hasSize(1));
        assertEquals(requirement, attributes.getRequirements().get(0));
    }

    //BaseRock generated method id: ${testEquals}, hash: B8E5BD0D8243ACEAE2D9F1DF29D48C43
    @Test
    void testEquals() {
        V1FieldSelectorAttributes attributes1 = new V1FieldSelectorAttributes().rawSelector("selector1").addRequirementsItem(new V1FieldSelectorRequirement());
        V1FieldSelectorAttributes attributes2 = new V1FieldSelectorAttributes().rawSelector("selector1").addRequirementsItem(new V1FieldSelectorRequirement());
        V1FieldSelectorAttributes attributes3 = new V1FieldSelectorAttributes().rawSelector("selector2").addRequirementsItem(new V1FieldSelectorRequirement());
        assertThat(attributes1.equals(attributes2), is(true));
        assertThat(attributes1.equals(attributes3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 10AC3C71BB012F84A52CD7FCEF469E04
    @Test
    void testHashCode() {
        V1FieldSelectorAttributes attributes1 = new V1FieldSelectorAttributes().rawSelector("selector1").addRequirementsItem(new V1FieldSelectorRequirement());
        V1FieldSelectorAttributes attributes2 = new V1FieldSelectorAttributes().rawSelector("selector1").addRequirementsItem(new V1FieldSelectorRequirement());
        assertEquals(attributes1.hashCode(), attributes2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 23B1AC8BFC382C3C0BC25066482CCA61
    @Test
    void testToString() {
        V1FieldSelectorAttributes attributes = new V1FieldSelectorAttributes().rawSelector("test-selector").addRequirementsItem(new V1FieldSelectorRequirement());
        String toString = attributes.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("rawSelector"), is(true));
        assertThat(toString.contains("requirements"), is(true));
    }

    //BaseRock generated method id: ${testSetNullRawSelector}, hash: 1658E7C75C748B2CB8C79A80E99A4B35
    @Test
    void testSetNullRawSelector() {
        V1FieldSelectorAttributes attributes = new V1FieldSelectorAttributes();
        attributes.setRawSelector(null);
        assertNull(attributes.getRawSelector());
    }

    //BaseRock generated method id: ${testSetNullRequirements}, hash: 40355EB3125ADB72F05B096ADAF96FEB
    @Test
    void testSetNullRequirements() {
        V1FieldSelectorAttributes attributes = new V1FieldSelectorAttributes();
        attributes.setRequirements(null);
        assertNull(attributes.getRequirements());
    }

    //BaseRock generated method id: ${testAddRequirementsItemToNullList}, hash: 10C5E385B63E837733D5253F8F9EFC75
    @Test
    void testAddRequirementsItemToNullList() {
        V1FieldSelectorAttributes attributes = new V1FieldSelectorAttributes();
        attributes.setRequirements(null);
        V1FieldSelectorRequirement requirement = new V1FieldSelectorRequirement();
        attributes.addRequirementsItem(requirement);
        assertThat(attributes.getRequirements(), hasSize(1));
        assertEquals(requirement, attributes.getRequirements().get(0));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: A33BDD2FF12CF8D20F4B50226153BB2C
    @Test
    void testEqualsWithNull() {
        V1FieldSelectorAttributes attributes = new V1FieldSelectorAttributes();
        assertThat(attributes.equals(null), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: C72D57C2D7AEC97577AE32E32B5AF607
    @Test
    void testEqualsWithDifferentClass() {
        V1FieldSelectorAttributes attributes = new V1FieldSelectorAttributes();
        assertThat(attributes.equals(new Object()), is(false));
    }

    //BaseRock generated method id: ${testToStringWithNullFields}, hash: F530A6DCC2321460426E44DB30066D0D
    @Disabled()
    @Test
    void testToStringWithNullFields() {
        V1FieldSelectorAttributes attributes = new V1FieldSelectorAttributes();
        String toString = attributes.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString, startsWith("class V1FieldSelectorAttributes {"));
        assertThat(toString, endsWith("}"));
        assertThat(toString.contains("rawSelector=null"), is(true));
        assertThat(toString.contains("requirements=null"), is(true));
    }
}

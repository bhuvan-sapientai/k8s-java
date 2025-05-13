package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import io.kubernetes.client.openapi.models.V1LabelSelectorAttributes;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import io.kubernetes.client.openapi.models.V1LabelSelectorRequirement;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1LabelSelectorAttributesBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 48E3E97207ACFEA87DFF76803060EF39
    @Test
    void testConstructor() {
        V1LabelSelectorAttributes attributes = new V1LabelSelectorAttributes();
        assertThat(attributes, is(notNullValue()));
    }

    //BaseRock generated method id: ${testRawSelector}, hash: F3298C273EFAFA486A00D6E2B3270B64
    @Test
    void testRawSelector() {
        V1LabelSelectorAttributes attributes = new V1LabelSelectorAttributes();
        String rawSelector = "app=myapp";
        attributes.setRawSelector(rawSelector);
        assertEquals(rawSelector, attributes.getRawSelector());
    }

    //BaseRock generated method id: ${testRequirements}, hash: CFE7FB2E93460C74126A52006F23D51C
    @Test
    void testRequirements() {
        V1LabelSelectorAttributes attributes = new V1LabelSelectorAttributes();
        List<V1LabelSelectorRequirement> requirements = new ArrayList<>();
        V1LabelSelectorRequirement requirement = new V1LabelSelectorRequirement();
        requirement.setKey("environment");
        requirement.setOperator("In");
        requirement.setValues(List.of("production", "staging"));
        requirements.add(requirement);
        attributes.setRequirements(requirements);
        assertThat(attributes.getRequirements(), hasSize(1));
        assertEquals(requirement, attributes.getRequirements().get(0));
    }

    //BaseRock generated method id: ${testAddRequirementsItem}, hash: F517AF6C35AB34E10BC4B628E88D6A08
    @Test
    void testAddRequirementsItem() {
        V1LabelSelectorAttributes attributes = new V1LabelSelectorAttributes();
        V1LabelSelectorRequirement requirement = new V1LabelSelectorRequirement();
        requirement.setKey("app");
        requirement.setOperator("Exists");
        attributes.addRequirementsItem(requirement);
        assertThat(attributes.getRequirements(), hasSize(1));
        assertEquals(requirement, attributes.getRequirements().get(0));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: CC2A0AEBC6BDBB78B0EC11D0937E87B0
    @Test
    void testEqualsAndHashCode() {
        V1LabelSelectorAttributes attributes1 = new V1LabelSelectorAttributes().rawSelector("app=myapp").addRequirementsItem(new V1LabelSelectorRequirement().key("environment").operator("In").values(List.of("production")));
        V1LabelSelectorAttributes attributes2 = new V1LabelSelectorAttributes().rawSelector("app=myapp").addRequirementsItem(new V1LabelSelectorRequirement().key("environment").operator("In").values(List.of("production")));
        V1LabelSelectorAttributes attributes3 = new V1LabelSelectorAttributes().rawSelector("app=otherapp").addRequirementsItem(new V1LabelSelectorRequirement().key("tier").operator("NotIn").values(List.of("frontend")));
        assertTrue(attributes1.equals(attributes2));
        assertEquals(attributes1.hashCode(), attributes2.hashCode());
        assertFalse(attributes1.equals(attributes3));
        assertNotEquals(attributes1.hashCode(), attributes3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: E96016BE7710B517CAE4FE15D1731692
    @Test
    void testToString() {
        V1LabelSelectorAttributes attributes = new V1LabelSelectorAttributes().rawSelector("app=myapp").addRequirementsItem(new V1LabelSelectorRequirement().key("environment").operator("In").values(List.of("production", "staging")));
        String expectedString = "class V1LabelSelectorAttributes {\n    rawSelector: app=myapp\n    requirements: [class V1LabelSelectorRequirement {\n        key: environment\n        operator: In\n        values: [production, staging]\n    }]\n}";
        assertEquals(expectedString, attributes.toString());
    }

    //BaseRock generated method id: ${testSetAndGetRawSelector}, hash: 01A9130F756D847FA1C4CF49D0FFEEB3
    @Test
    void testSetAndGetRawSelector() {
        V1LabelSelectorAttributes attributes = new V1LabelSelectorAttributes();
        assertThat(attributes.getRawSelector(), is(nullValue()));
        attributes.setRawSelector("app=myapp");
        assertThat(attributes.getRawSelector(), is("app=myapp"));
        attributes.setRawSelector(null);
        assertThat(attributes.getRawSelector(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetRequirements}, hash: 42399C20BA13E4216384205EC3B2EC99
    @Disabled()
    @Test
    void testSetAndGetRequirements() {
        V1LabelSelectorAttributes attributes = new V1LabelSelectorAttributes();
        assertThat(attributes.getRequirements(), is(notNullValue()));
        assertThat(attributes.getRequirements(), hasSize(0));
        List<V1LabelSelectorRequirement> requirements = new ArrayList<>();
        requirements.add(new V1LabelSelectorRequirement().key("app").operator("In").values(List.of("myapp")));
        requirements.add(new V1LabelSelectorRequirement().key("environment").operator("NotIn").values(List.of("test")));
        attributes.setRequirements(requirements);
        assertThat(attributes.getRequirements(), is(notNullValue()));
        assertThat(attributes.getRequirements(), hasSize(2));
        assertThat(attributes.getRequirements(), containsInAnyOrder(equalTo(new V1LabelSelectorRequirement().key("app").operator("In").values(List.of("myapp"))), equalTo(new V1LabelSelectorRequirement().key("environment").operator("NotIn").values(List.of("test")))));
        attributes.setRequirements(null);
        assertThat(attributes.getRequirements(), is(notNullValue()));
        assertThat(attributes.getRequirements(), hasSize(0));
    }

    //BaseRock generated method id: ${testAddRequirementsItemToNullList}, hash: 9B09AC87C64E75634696960A48F4D52A
    @Test
    void testAddRequirementsItemToNullList() {
        V1LabelSelectorAttributes attributes = new V1LabelSelectorAttributes();
        attributes.setRequirements(null);
        V1LabelSelectorRequirement requirement = new V1LabelSelectorRequirement().key("app").operator("Exists");
        attributes.addRequirementsItem(requirement);
        assertThat(attributes.getRequirements(), is(notNullValue()));
        assertThat(attributes.getRequirements(), hasSize(1));
        assertThat(attributes.getRequirements().get(0), is(equalTo(requirement)));
    }

    //BaseRock generated method id: ${testEmptyAttributes}, hash: CB0E20C61A5E1E7AD5FAD33BC3D5D50B
    @Test
    void testEmptyAttributes() {
        V1LabelSelectorAttributes attributes = new V1LabelSelectorAttributes();
        assertThat(attributes.getRawSelector(), is(nullValue()));
        assertThat(attributes.getRequirements(), is(notNullValue()));
        assertThat(attributes.getRequirements(), hasSize(0));
    }
}

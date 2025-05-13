package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import io.kubernetes.client.openapi.models.V1ConfigMapProjection;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1KeyToPath;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ConfigMapProjectionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1ConfigMapProjectionConstructor}, hash: 798C3C76A159D5F7D496A4698FA6B3C8
    @Test
    void testV1ConfigMapProjectionConstructor() {
        V1ConfigMapProjection configMapProjection = new V1ConfigMapProjection();
        assertNotNull(configMapProjection);
    }

    //BaseRock generated method id: ${testSetAndGetItems}, hash: 5FD4C5418CAF244317FB8D51B8031A0C
    @Test
    void testSetAndGetItems() {
        V1ConfigMapProjection configMapProjection = new V1ConfigMapProjection();
        List<V1KeyToPath> items = new ArrayList<>();
        items.add(new V1KeyToPath());
        configMapProjection.setItems(items);
        assertThat(configMapProjection.getItems(), notNullValue());
        assertThat(configMapProjection.getItems(), hasSize(1));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 91A7779E1935D8872D7C31A281A9060B
    @Test
    void testAddItemsItem() {
        V1ConfigMapProjection configMapProjection = new V1ConfigMapProjection();
        V1KeyToPath item = new V1KeyToPath();
        configMapProjection.addItemsItem(item);
        assertThat(configMapProjection.getItems(), notNullValue());
        assertThat(configMapProjection.getItems(), hasSize(1));
    }

    //BaseRock generated method id: ${testSetAndGetName}, hash: 4D4CF7499E0BD0228FD1BE8340224ABB
    @Test
    void testSetAndGetName() {
        V1ConfigMapProjection configMapProjection = new V1ConfigMapProjection();
        String name = "test-name";
        configMapProjection.setName(name);
        assertEquals(name, configMapProjection.getName());
    }

    //BaseRock generated method id: ${testSetAndGetOptional}, hash: 3F69B9BD735D898EB7F02C50336E9A0E
    @Test
    void testSetAndGetOptional() {
        V1ConfigMapProjection configMapProjection = new V1ConfigMapProjection();
        configMapProjection.setOptional(true);
        assertTrue(configMapProjection.getOptional());
        configMapProjection.setOptional(false);
        assertFalse(configMapProjection.getOptional());
    }

    //BaseRock generated method id: ${testEquals}, hash: 081A9235C9D319922940E6977667B52F
    @Test
    void testEquals() {
        V1ConfigMapProjection configMapProjection1 = new V1ConfigMapProjection().name("test").optional(true);
        V1ConfigMapProjection configMapProjection2 = new V1ConfigMapProjection().name("test").optional(true);
        V1ConfigMapProjection configMapProjection3 = new V1ConfigMapProjection().name("other").optional(false);
        assertTrue(configMapProjection1.equals(configMapProjection2));
        assertFalse(configMapProjection1.equals(configMapProjection3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 11545EC6C09E33F7A32005F248211E4D
    @Test
    void testHashCode() {
        V1ConfigMapProjection configMapProjection1 = new V1ConfigMapProjection().name("test").optional(true);
        V1ConfigMapProjection configMapProjection2 = new V1ConfigMapProjection().name("test").optional(true);
        assertEquals(configMapProjection1.hashCode(), configMapProjection2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 03115B79EE53951682D582D8D4D2EED4
    @Test
    void testToString() {
        V1ConfigMapProjection configMapProjection = new V1ConfigMapProjection().name("test").optional(true);
        String toString = configMapProjection.toString();
        assertThat(toString, notNullValue());
        assertThat(toString, startsWith("class V1ConfigMapProjection {"));
        assertThat(toString, endsWith("}"));
        assertTrue(toString.contains("name: test"));
        assertTrue(toString.contains("optional: true"));
    }

    //BaseRock generated method id: ${testSetNullValues}, hash: F5F2AA2E3E0ACE3511ACB52F889AEDD5
    @Test
    void testSetNullValues() {
        V1ConfigMapProjection configMapProjection = new V1ConfigMapProjection();
        configMapProjection.setItems(null);
        configMapProjection.setName(null);
        configMapProjection.setOptional(null);
        assertThat(configMapProjection.getItems(), nullValue());
        assertThat(configMapProjection.getName(), nullValue());
        assertThat(configMapProjection.getOptional(), nullValue());
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 46A1F84B8A6DCB905C58DF1B1223D55C
    @Test
    void testBuilderPattern() {
        V1ConfigMapProjection configMapProjection = new V1ConfigMapProjection().name("test-name").optional(true).addItemsItem(new V1KeyToPath());
        assertThat(configMapProjection.getName(), equalTo("test-name"));
        assertTrue(configMapProjection.getOptional());
        assertThat(configMapProjection.getItems(), hasSize(1));
    }
}

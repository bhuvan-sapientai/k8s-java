package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullSource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CustomResourceDefinitionNamesBaseRockGeneratedTest {

    private V1CustomResourceDefinitionNames customResourceDefinitionNames;

    @BeforeEach
    void setUp() {
        customResourceDefinitionNames = new V1CustomResourceDefinitionNames();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 2A6A4776EC92DD071E099553565D35D3
    @Test
    void testConstructor() {
        assertNotNull(customResourceDefinitionNames);
    }

    //BaseRock generated method id: ${testAddCategoriesItem}, hash: AAEE1C40688275EE2138D7A72D75D38D
    @ParameterizedTest
    @ValueSource(strings = { "category1", "category2" })
    void testAddCategoriesItem(String category) {
        V1CustomResourceDefinitionNames result = customResourceDefinitionNames.addCategoriesItem(category);
        assertNotNull(result);
        assertEquals(customResourceDefinitionNames, result);
        assertTrue(customResourceDefinitionNames.getCategories().contains(category));
    }

    //BaseRock generated method id: ${testSetCategories}, hash: D1FE1EC08199742D46517344E831774B
    @Test
    void testSetCategories() {
        List<String> categories = new ArrayList<>();
        categories.add("category1");
        categories.add("category2");
        customResourceDefinitionNames.setCategories(categories);
        assertEquals(categories, customResourceDefinitionNames.getCategories());
    }

    //BaseRock generated method id: ${testSetKind}, hash: DDCCD1879C1A0068915C6FCAC71A55D5
    @Test
    void testSetKind() {
        String kind = "TestKind";
        customResourceDefinitionNames.setKind(kind);
        assertEquals(kind, customResourceDefinitionNames.getKind());
    }

    //BaseRock generated method id: ${testSetListKind}, hash: FDB8B8EE9E4B771C62A7AC639B098C1C
    @Test
    void testSetListKind() {
        String listKind = "TestListKind";
        customResourceDefinitionNames.setListKind(listKind);
        assertEquals(listKind, customResourceDefinitionNames.getListKind());
    }

    //BaseRock generated method id: ${testSetPlural}, hash: B0C4DD5C4D1C886E032974BF98D3CC65
    @Test
    void testSetPlural() {
        String plural = "testplurals";
        customResourceDefinitionNames.setPlural(plural);
        assertEquals(plural, customResourceDefinitionNames.getPlural());
    }

    //BaseRock generated method id: ${testAddShortNamesItem}, hash: 8A0868A2F8D88F03A148C1D32EE4330C
    @ParameterizedTest
    @ValueSource(strings = { "shortName1", "shortName2" })
    void testAddShortNamesItem(String shortName) {
        V1CustomResourceDefinitionNames result = customResourceDefinitionNames.addShortNamesItem(shortName);
        assertNotNull(result);
        assertEquals(customResourceDefinitionNames, result);
        assertTrue(customResourceDefinitionNames.getShortNames().contains(shortName));
    }

    //BaseRock generated method id: ${testSetShortNames}, hash: 434ADB9287DC844468830150A3B7B707
    @Test
    void testSetShortNames() {
        List<String> shortNames = new ArrayList<>();
        shortNames.add("shortName1");
        shortNames.add("shortName2");
        customResourceDefinitionNames.setShortNames(shortNames);
        assertEquals(shortNames, customResourceDefinitionNames.getShortNames());
    }

    //BaseRock generated method id: ${testSetSingular}, hash: 42BC6491D9BE4A0BCF24AFBC6278C72E
    @Test
    void testSetSingular() {
        String singular = "testsingular";
        customResourceDefinitionNames.setSingular(singular);
        assertEquals(singular, customResourceDefinitionNames.getSingular());
    }

    //BaseRock generated method id: ${testEquals}, hash: A72D2FBA63BD9D034904BEB76D45193D
    @Test
    void testEquals() {
        V1CustomResourceDefinitionNames names1 = new V1CustomResourceDefinitionNames().kind("TestKind").plural("testplurals");
        V1CustomResourceDefinitionNames names2 = new V1CustomResourceDefinitionNames().kind("TestKind").plural("testplurals");
        V1CustomResourceDefinitionNames names3 = new V1CustomResourceDefinitionNames().kind("DifferentKind").plural("differentplurals");
        assertTrue(names1.equals(names2));
        assertFalse(names1.equals(names3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 4AE292777D72921A228EDFD2B40E2D99
    @Test
    void testHashCode() {
        V1CustomResourceDefinitionNames names1 = new V1CustomResourceDefinitionNames().kind("TestKind").plural("testplurals");
        V1CustomResourceDefinitionNames names2 = new V1CustomResourceDefinitionNames().kind("TestKind").plural("testplurals");
        assertEquals(names1.hashCode(), names2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: BF483B99FEA2929C17060E4BD07A3588
    @Test
    void testToString() {
        V1CustomResourceDefinitionNames names = new V1CustomResourceDefinitionNames().kind("TestKind").plural("testplurals").singular("testsingular");
        String result = names.toString();
        assertThat(result, containsString("kind: TestKind"));
        assertThat(result, containsString("plural: testplurals"));
        assertThat(result, containsString("singular: testsingular"));
    }

    //BaseRock generated method id: ${testSetKindWithInvalidInput}, hash: B4AC6AFF0FFEFCA57ADA577BCE3ECC8A
    @ParameterizedTest
    @NullSource
    @ValueSource(strings = { "", "  " })
    void testSetKindWithInvalidInput(String invalidKind) {
        customResourceDefinitionNames.setKind(invalidKind);
        if (invalidKind == null) {
            assertNull(customResourceDefinitionNames.getKind());
        } else {
            assertEquals(invalidKind, customResourceDefinitionNames.getKind());
        }
    }

    //BaseRock generated method id: ${testSetPluralWithInvalidInput}, hash: A401DFA5E404376BF3E73FF172DB06C4
    @ParameterizedTest
    @NullSource
    @ValueSource(strings = { "", "  " })
    void testSetPluralWithInvalidInput(String invalidPlural) {
        customResourceDefinitionNames.setPlural(invalidPlural);
        if (invalidPlural == null) {
            assertNull(customResourceDefinitionNames.getPlural());
        } else {
            assertEquals(invalidPlural, customResourceDefinitionNames.getPlural());
        }
    }

    //BaseRock generated method id: ${testSetCategoriesNull}, hash: F38614133CB531B5D0C711D8EDA36165
    @Test
    void testSetCategoriesNull() {
        customResourceDefinitionNames.setCategories(null);
        assertNull(customResourceDefinitionNames.getCategories());
    }

    //BaseRock generated method id: ${testSetShortNamesNull}, hash: 1B1144FC8D34B58435E89FCC453BE927
    @Test
    void testSetShortNamesNull() {
        customResourceDefinitionNames.setShortNames(null);
        assertNull(customResourceDefinitionNames.getShortNames());
    }

    //BaseRock generated method id: ${testAddCategoriesItemToNullList}, hash: 6F377C89F6F17EC2D0A252DCD96C64A3
    @Test
    void testAddCategoriesItemToNullList() {
        customResourceDefinitionNames.setCategories(null);
        customResourceDefinitionNames.addCategoriesItem("newCategory");
        assertNotNull(customResourceDefinitionNames.getCategories());
        assertEquals(1, customResourceDefinitionNames.getCategories().size());
        assertEquals("newCategory", customResourceDefinitionNames.getCategories().get(0));
    }

    //BaseRock generated method id: ${testAddShortNamesItemToNullList}, hash: BC6688BA84F701C5ADC13CAC6F6E2805
    @Test
    void testAddShortNamesItemToNullList() {
        customResourceDefinitionNames.setShortNames(null);
        customResourceDefinitionNames.addShortNamesItem("newShortName");
        assertNotNull(customResourceDefinitionNames.getShortNames());
        assertEquals(1, customResourceDefinitionNames.getShortNames().size());
        assertEquals("newShortName", customResourceDefinitionNames.getShortNames().get(0));
    }
}

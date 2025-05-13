package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import io.kubernetes.client.openapi.models.V1APIResource;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1APIResourceBaseRockGeneratedTest {

    private V1APIResource v1APIResource;

    @BeforeEach
    void setUp() {
        v1APIResource = new V1APIResource();
    }

    //BaseRock generated method id: ${testConstructor}, hash: A03BF717E20559C9759E75EDD5C48C76
    @Test
    void testConstructor() {
        assertNotNull(v1APIResource);
    }

    //BaseRock generated method id: ${testSetAndGetCategories}, hash: 6E9F33EA35443B817A47D79705FE607D
    @ParameterizedTest
    @ValueSource(strings = { "category1", "category2" })
    void testSetAndGetCategories(String category) {
        List<String> categories = new ArrayList<>();
        categories.add(category);
        v1APIResource.setCategories(categories);
        assertEquals(categories, v1APIResource.getCategories());
    }

    //BaseRock generated method id: ${testAddCategoriesItem}, hash: 3C5A0326CC38E242D361EE98B38D7D8F
    @Test
    void testAddCategoriesItem() {
        String category = "newCategory";
        v1APIResource.addCategoriesItem(category);
        assertTrue(v1APIResource.getCategories().contains(category));
    }

    //BaseRock generated method id: ${testSetAndGetGroup}, hash: D941F2232974B56EC559FDFF51545E81
    @ParameterizedTest
    @ValueSource(strings = { "group1", "group2" })
    void testSetAndGetGroup(String group) {
        v1APIResource.setGroup(group);
        assertEquals(group, v1APIResource.getGroup());
    }

    //BaseRock generated method id: ${testSetAndGetKind}, hash: 6DF5FE1C91D6194C05BAB6E355D48981
    @ParameterizedTest
    @ValueSource(strings = { "kind1", "kind2" })
    void testSetAndGetKind(String kind) {
        v1APIResource.setKind(kind);
        assertEquals(kind, v1APIResource.getKind());
    }

    //BaseRock generated method id: ${testSetAndGetName}, hash: CC94526ABD46A58704CE7AEDD0127479
    @ParameterizedTest
    @ValueSource(strings = { "name1", "name2" })
    void testSetAndGetName(String name) {
        v1APIResource.setName(name);
        assertEquals(name, v1APIResource.getName());
    }

    //BaseRock generated method id: ${testSetAndGetNamespaced}, hash: CDA93DB6D59716BA61D44ED0065BC481
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    void testSetAndGetNamespaced(boolean namespaced) {
        v1APIResource.setNamespaced(namespaced);
        assertEquals(namespaced, v1APIResource.getNamespaced());
    }

    //BaseRock generated method id: ${testSetAndGetShortNames}, hash: 49042D53A90E0C709A6B5BA5A5B01C21
    @ParameterizedTest
    @ValueSource(strings = { "shortName1", "shortName2" })
    void testSetAndGetShortNames(String shortName) {
        List<String> shortNames = new ArrayList<>();
        shortNames.add(shortName);
        v1APIResource.setShortNames(shortNames);
        assertEquals(shortNames, v1APIResource.getShortNames());
    }

    //BaseRock generated method id: ${testAddShortNamesItem}, hash: 367A727C4CC01FC68E1CEC491234B2BD
    @Test
    void testAddShortNamesItem() {
        String shortName = "newShortName";
        v1APIResource.addShortNamesItem(shortName);
        assertTrue(v1APIResource.getShortNames().contains(shortName));
    }

    //BaseRock generated method id: ${testSetAndGetSingularName}, hash: A9799FBACDDDD604D141DE9D68F9339B
    @ParameterizedTest
    @ValueSource(strings = { "singularName1", "singularName2" })
    void testSetAndGetSingularName(String singularName) {
        v1APIResource.setSingularName(singularName);
        assertEquals(singularName, v1APIResource.getSingularName());
    }

    //BaseRock generated method id: ${testSetAndGetStorageVersionHash}, hash: 2C6CE6DE04286F8427A1839116763F64
    @ParameterizedTest
    @ValueSource(strings = { "hash1", "hash2" })
    void testSetAndGetStorageVersionHash(String hash) {
        v1APIResource.setStorageVersionHash(hash);
        assertEquals(hash, v1APIResource.getStorageVersionHash());
    }

    //BaseRock generated method id: ${testSetAndGetVerbs}, hash: 05D3D155EE629A4C87DBC782BFE12447
    @ParameterizedTest
    @ValueSource(strings = { "verb1", "verb2" })
    void testSetAndGetVerbs(String verb) {
        List<String> verbs = new ArrayList<>();
        verbs.add(verb);
        v1APIResource.setVerbs(verbs);
        assertEquals(verbs, v1APIResource.getVerbs());
    }

    //BaseRock generated method id: ${testAddVerbsItem}, hash: 9DBE763B0D4F47BEF4E2A24DD263832A
    @Test
    void testAddVerbsItem() {
        String verb = "newVerb";
        v1APIResource.addVerbsItem(verb);
        assertTrue(v1APIResource.getVerbs().contains(verb));
    }

    //BaseRock generated method id: ${testSetAndGetVersion}, hash: BA6E939C549CA034F20B8CCCFEAA3C65
    @ParameterizedTest
    @ValueSource(strings = { "version1", "version2" })
    void testSetAndGetVersion(String version) {
        v1APIResource.setVersion(version);
        assertEquals(version, v1APIResource.getVersion());
    }

    //BaseRock generated method id: ${testEquals}, hash: 76EBFAC3CD41D1B418E4553072D5062A
    @Test
    void testEquals() {
        V1APIResource resource1 = new V1APIResource().categories(Arrays.asList("category1")).group("group1").kind("kind1").name("name1").namespaced(true).shortNames(Arrays.asList("short1")).singularName("singular1").storageVersionHash("hash1").verbs(Arrays.asList("verb1")).version("version1");
        V1APIResource resource2 = new V1APIResource().categories(Arrays.asList("category1")).group("group1").kind("kind1").name("name1").namespaced(true).shortNames(Arrays.asList("short1")).singularName("singular1").storageVersionHash("hash1").verbs(Arrays.asList("verb1")).version("version1");
        V1APIResource resource3 = new V1APIResource().categories(Arrays.asList("category2")).group("group2").kind("kind2").name("name2").namespaced(false).shortNames(Arrays.asList("short2")).singularName("singular2").storageVersionHash("hash2").verbs(Arrays.asList("verb2")).version("version2");
        assertTrue(resource1.equals(resource2));
        assertFalse(resource1.equals(resource3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 91B30AF2532E24E4204EC37F9C3202EC
    @Test
    void testHashCode() {
        V1APIResource resource1 = new V1APIResource().categories(Arrays.asList("category1")).group("group1").kind("kind1").name("name1").namespaced(true).shortNames(Arrays.asList("short1")).singularName("singular1").storageVersionHash("hash1").verbs(Arrays.asList("verb1")).version("version1");
        V1APIResource resource2 = new V1APIResource().categories(Arrays.asList("category1")).group("group1").kind("kind1").name("name1").namespaced(true).shortNames(Arrays.asList("short1")).singularName("singular1").storageVersionHash("hash1").verbs(Arrays.asList("verb1")).version("version1");
        assertEquals(resource1.hashCode(), resource2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 6388A577D6707587E69632229E052065
    @Test
    void testToString() {
        V1APIResource resource = new V1APIResource().categories(Arrays.asList("category1")).group("group1").kind("kind1").name("name1").namespaced(true).shortNames(Arrays.asList("short1")).singularName("singular1").storageVersionHash("hash1").verbs(Arrays.asList("verb1")).version("version1");
        String expectedString = "class V1APIResource {\n" + "    categories: [category1]\n" + "    group: group1\n" + "    kind: kind1\n" + "    name: name1\n" + "    namespaced: true\n" + "    shortNames: [short1]\n" + "    singularName: singular1\n" + "    storageVersionHash: hash1\n" + "    verbs: [verb1]\n" + "    version: version1\n" + "}";
        assertEquals(expectedString, resource.toString());
    }

    //BaseRock generated method id: ${testSetAndGetCategoriesWithNullAndEmptyValues}, hash: 8EC0A12A884C97DEC91F5D62CB16A05F
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "   " })
    void testSetAndGetCategoriesWithNullAndEmptyValues(String category) {
        List<String> categories = new ArrayList<>();
        if (category != null) {
            categories.add(category);
        }
        v1APIResource.setCategories(categories);
        assertEquals(categories, v1APIResource.getCategories());
    }

    //BaseRock generated method id: ${testSetAndGetGroupWithNullAndEmptyValues}, hash: B59F4E6D0C8911A9874753355E5163D8
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "   " })
    void testSetAndGetGroupWithNullAndEmptyValues(String group) {
        v1APIResource.setGroup(group);
        assertEquals(group, v1APIResource.getGroup());
    }

    //BaseRock generated method id: ${testSetAndGetShortNamesWithNullAndEmptyValues}, hash: B1B374D5C5DE6FB3BE2C33A9A67565BC
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "   " })
    void testSetAndGetShortNamesWithNullAndEmptyValues(String shortName) {
        List<String> shortNames = new ArrayList<>();
        if (shortName != null) {
            shortNames.add(shortName);
        }
        v1APIResource.setShortNames(shortNames);
        assertEquals(shortNames, v1APIResource.getShortNames());
    }

    //BaseRock generated method id: ${testSetAndGetStorageVersionHashWithNullAndEmptyValues}, hash: 1AAD41DFD283FCE91C4B28E32FC4E618
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "   " })
    void testSetAndGetStorageVersionHashWithNullAndEmptyValues(String hash) {
        v1APIResource.setStorageVersionHash(hash);
        assertEquals(hash, v1APIResource.getStorageVersionHash());
    }

    //BaseRock generated method id: ${testSetAndGetVersionWithNullAndEmptyValues}, hash: EC5FBCE744D9BAF76F5C7A1F2B3C450A
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "   " })
    void testSetAndGetVersionWithNullAndEmptyValues(String version) {
        v1APIResource.setVersion(version);
        assertEquals(version, v1APIResource.getVersion());
    }
}

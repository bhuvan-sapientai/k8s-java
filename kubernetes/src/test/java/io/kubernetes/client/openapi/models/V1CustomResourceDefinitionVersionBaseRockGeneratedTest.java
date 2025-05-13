package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1SelectableField;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import io.kubernetes.client.openapi.models.V1CustomResourceSubresources;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import io.kubernetes.client.openapi.models.V1CustomResourceValidation;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CustomResourceDefinitionVersionBaseRockGeneratedTest {

    @Mock
    private V1CustomResourceValidation mockSchema;

    @Mock
    private V1CustomResourceSubresources mockSubresources;

    private V1CustomResourceDefinitionVersion version;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        version = new V1CustomResourceDefinitionVersion();
    }

    //BaseRock generated method id: ${testConstructor}, hash: A07FED5F08793164BC77A2D62F887F82
    @Test
    void testConstructor() {
        assertNotNull(version);
    }

    //BaseRock generated method id: ${testAdditionalPrinterColumns}, hash: 7ECB759A10C58586844E16E1EEC43200
    @Test
    void testAdditionalPrinterColumns() {
        List<V1CustomResourceColumnDefinition> columns = new ArrayList<>();
        columns.add(new V1CustomResourceColumnDefinition());
        version.setAdditionalPrinterColumns(columns);
        assertEquals(columns, version.getAdditionalPrinterColumns());
    }

    //BaseRock generated method id: ${testAddAdditionalPrinterColumnsItem}, hash: B359DA110B3999BA7665FDDAFF3C416D
    @Test
    void testAddAdditionalPrinterColumnsItem() {
        V1CustomResourceColumnDefinition column = new V1CustomResourceColumnDefinition();
        version.addAdditionalPrinterColumnsItem(column);
        assertTrue(version.getAdditionalPrinterColumns().contains(column));
    }

    //BaseRock generated method id: ${testDeprecated}, hash: 85A7819C3E6BE3A8BB944D21D696327F
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    void testDeprecated(boolean value) {
        version.setDeprecated(value);
        assertEquals(value, version.getDeprecated());
    }

    //BaseRock generated method id: ${testDeprecationWarning}, hash: B4E75AF6681054D60AD9E09E6110B1A3
    @ParameterizedTest
    @ValueSource(strings = { "Warning", "Deprecated" })
    void testDeprecationWarning(String warning) {
        version.setDeprecationWarning(warning);
        assertEquals(warning, version.getDeprecationWarning());
    }

    //BaseRock generated method id: ${testName}, hash: 3E5658EF00E1EA268950CABF740D8093
    @Test
    void testName() {
        String name = "v1";
        version.setName(name);
        assertEquals(name, version.getName());
    }

    //BaseRock generated method id: ${testSchema}, hash: D51D5CE8C8973BF1A6659C9B948D1280
    @Test
    void testSchema() {
        version.setSchema(mockSchema);
        assertEquals(mockSchema, version.getSchema());
    }

    //BaseRock generated method id: ${testSelectableFields}, hash: 411F174DB55F5F2BDDE2198BA59A99E4
    @Test
    void testSelectableFields() {
        List<V1SelectableField> fields = new ArrayList<>();
        fields.add(new V1SelectableField());
        version.setSelectableFields(fields);
        assertEquals(fields, version.getSelectableFields());
    }

    //BaseRock generated method id: ${testAddSelectableFieldsItem}, hash: F6864F819FD560A70928B9F6FA8D238D
    @Test
    void testAddSelectableFieldsItem() {
        V1SelectableField field = new V1SelectableField();
        version.addSelectableFieldsItem(field);
        assertTrue(version.getSelectableFields().contains(field));
    }

    //BaseRock generated method id: ${testServed}, hash: D44D4085E6867BE6D907E3FDC08CE044
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    void testServed(boolean value) {
        version.setServed(value);
        assertEquals(value, version.getServed());
    }

    //BaseRock generated method id: ${testStorage}, hash: 123176BC88E51970CB767A762D3DDA84
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    void testStorage(boolean value) {
        version.setStorage(value);
        assertEquals(value, version.getStorage());
    }

    //BaseRock generated method id: ${testSubresources}, hash: F5A145E752B34F00189F9B14983399CB
    @Test
    void testSubresources() {
        version.setSubresources(mockSubresources);
        assertEquals(mockSubresources, version.getSubresources());
    }

    //BaseRock generated method id: ${testEquals}, hash: 6453B7199ACD69018A31D3A6FA836BF0
    @Test
    void testEquals() {
        V1CustomResourceDefinitionVersion version1 = new V1CustomResourceDefinitionVersion().name("v1").served(true).storage(true);
        V1CustomResourceDefinitionVersion version2 = new V1CustomResourceDefinitionVersion().name("v1").served(true).storage(true);
        assertEquals(version1, version2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: B13783461A4AE85011E85C573B113CDE
    @Test
    void testHashCode() {
        V1CustomResourceDefinitionVersion version1 = new V1CustomResourceDefinitionVersion().name("v1").served(true).storage(true);
        V1CustomResourceDefinitionVersion version2 = new V1CustomResourceDefinitionVersion().name("v1").served(true).storage(true);
        assertEquals(version1.hashCode(), version2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 5E6D0BB72D85D1AEC758052F4D84DEF1
    @Test
    void testToString() {
        V1CustomResourceDefinitionVersion version = new V1CustomResourceDefinitionVersion().name("v1").served(true).storage(true);
        String expected = "class V1CustomResourceDefinitionVersion {\n" + "    additionalPrinterColumns: []\n" + "    deprecated: null\n" + "    deprecationWarning: null\n" + "    name: v1\n" + "    schema: null\n" + "    selectableFields: []\n" + "    served: true\n" + "    storage: true\n" + "    subresources: null\n" + "}";
        assertEquals(expected, version.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: EA7FAE1DEF7F035CE44416CD0D8F241F
    @Test
    void testValidateJsonElement() {
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty("name", "v1");
        jsonObj.addProperty("served", true);
        jsonObj.addProperty("storage", true);
        assertDoesNotThrow(() -> V1CustomResourceDefinitionVersion.validateJsonElement(jsonObj));
    }

    //BaseRock generated method id: ${testValidateJsonElementMissingRequiredField}, hash: C5AABF166B8CADABD4E141A103918C9E
    @Test
    void testValidateJsonElementMissingRequiredField() {
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty("served", true);
        jsonObj.addProperty("storage", true);
        assertThrows(IllegalArgumentException.class, () -> V1CustomResourceDefinitionVersion.validateJsonElement(jsonObj));
    }

    //BaseRock generated method id: ${testValidateJsonElementNullAndEmpty}, hash: C1A04EE5FC161DA9FE03B28B764B6D2A
    @ParameterizedTest
    @NullAndEmptySource
    void testValidateJsonElementNullAndEmpty(JsonElement jsonElement) {
        assertThrows(IllegalArgumentException.class, () -> V1CustomResourceDefinitionVersion.validateJsonElement(jsonElement));
    }
}

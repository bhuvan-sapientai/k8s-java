package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.closeTo;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1DownwardAPIVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 3C142F9FCA3B633E1D41B5838C7A8E94
    @Test
    void testConstructor() {
        V1DownwardAPIVolumeSource source = new V1DownwardAPIVolumeSource();
        assertNotNull(source);
    }

    //BaseRock generated method id: ${testDefaultMode}, hash: 5C6FF34D51FD2CE2B2ED939BC8533E97
    @Test
    void testDefaultMode() {
        V1DownwardAPIVolumeSource source = new V1DownwardAPIVolumeSource();
        Integer defaultMode = 420;
        source.setDefaultMode(defaultMode);
        assertEquals(defaultMode, source.getDefaultMode());
    }

    //BaseRock generated method id: ${testItems}, hash: 8DA8D79327864137454F544A810988C9
    @Test
    void testItems() {
        V1DownwardAPIVolumeSource source = new V1DownwardAPIVolumeSource();
        List<V1DownwardAPIVolumeFile> items = new ArrayList<>();
        V1DownwardAPIVolumeFile item = mock(V1DownwardAPIVolumeFile.class);
        items.add(item);
        source.setItems(items);
        assertEquals(items, source.getItems());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 4EB8546701A6B9F4F173D99F4BA554A7
    @Test
    void testAddItemsItem() {
        V1DownwardAPIVolumeSource source = new V1DownwardAPIVolumeSource();
        V1DownwardAPIVolumeFile item = mock(V1DownwardAPIVolumeFile.class);
        source.addItemsItem(item);
        assertFalse(source.getItems().isEmpty());
        assertEquals(item, source.getItems().get(0));
    }

    //BaseRock generated method id: ${testEquals}, hash: F755A228D1FE56F7ACBDB3B355A184B3
    @Test
    void testEquals() {
        V1DownwardAPIVolumeSource source1 = new V1DownwardAPIVolumeSource().defaultMode(420).addItemsItem(new V1DownwardAPIVolumeFile());
        V1DownwardAPIVolumeSource source2 = new V1DownwardAPIVolumeSource().defaultMode(420).addItemsItem(new V1DownwardAPIVolumeFile());
        V1DownwardAPIVolumeSource source3 = new V1DownwardAPIVolumeSource().defaultMode(644);
        assertEquals(source1, source2);
        assertNotEquals(source1, source3);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 42E3FEDD27C1FB231C80CACC1B91E0AF
    @Test
    void testHashCode() {
        V1DownwardAPIVolumeSource source1 = new V1DownwardAPIVolumeSource().defaultMode(420).addItemsItem(new V1DownwardAPIVolumeFile());
        V1DownwardAPIVolumeSource source2 = new V1DownwardAPIVolumeSource().defaultMode(420).addItemsItem(new V1DownwardAPIVolumeFile());
        assertEquals(source1.hashCode(), source2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 3A62973222B70D16CC3084CB003BC0D8
    @Test
    void testToString() {
        V1DownwardAPIVolumeSource source = new V1DownwardAPIVolumeSource().defaultMode(420).addItemsItem(new V1DownwardAPIVolumeFile());
        String result = source.toString();
        assertTrue(result.contains("defaultMode"));
        assertTrue(result.contains("items"));
    }

    //BaseRock generated method id: ${testDefaultModeValidValues}, hash: E491BBF7EABA3EDB817D1371F7B5DC89
    @ParameterizedTest
    @ValueSource(ints = { 0, 420, 644, 755 })
    void testDefaultModeValidValues(int mode) {
        V1DownwardAPIVolumeSource source = new V1DownwardAPIVolumeSource().defaultMode(mode);
        assertEquals(mode, source.getDefaultMode());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 5DB172ADDC28D6B9F7C1BB3BE08D2884
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty("defaultMode", 420);
        JsonElement jsonElement = jsonObj;
        try (MockedStatic<V1DownwardAPIVolumeFile> mockedStatic = mockStatic(V1DownwardAPIVolumeFile.class)) {
            V1DownwardAPIVolumeSource.validateJsonElement(jsonElement);
            mockedStatic.verifyNoInteractions();
        }
    }

    //BaseRock generated method id: ${testValidateJsonElementWithItems}, hash: 7D9C221ED03F26BCFA366F3CC3E36F03
    @Test
    void testValidateJsonElementWithItems() throws IOException {
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty("defaultMode", 420);
        JsonArray itemsArray = new JsonArray();
        itemsArray.add(new JsonObject());
        jsonObj.add("items", itemsArray);
        JsonElement jsonElement = jsonObj;
        try (MockedStatic<V1DownwardAPIVolumeFile> mockedStatic = mockStatic(V1DownwardAPIVolumeFile.class)) {
            mockedStatic.when(() -> V1DownwardAPIVolumeFile.validateJsonElement(any())).thenAnswer(invocation -> null);
            V1DownwardAPIVolumeSource.validateJsonElement(jsonElement);
            mockedStatic.verify(() -> V1DownwardAPIVolumeFile.validateJsonElement(any()));
        }
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidField}, hash: EBF98655BE92995520BDC338C10613D2
    @Test
    void testValidateJsonElementWithInvalidField() {
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty("invalidField", "value");
        JsonElement jsonElement = jsonObj;
        assertThrows(IllegalArgumentException.class, () -> V1DownwardAPIVolumeSource.validateJsonElement(jsonElement));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 92122F85B3FF4FA3D5E2570A222B6716
    @Test
    void testFromJson() throws IOException {
        String json = "{\"defaultMode\":420,\"items\":[{\"path\":\"testPath\"}]}";
        V1DownwardAPIVolumeSource result = V1DownwardAPIVolumeSource.fromJson(json);
        assertNotNull(result);
        assertEquals(420, result.getDefaultMode());
        assertNotNull(result.getItems());
        assertEquals(1, result.getItems().size());
    }

    //BaseRock generated method id: ${testToJson}, hash: 192176F8521039EF5D19C1BFD6845222
    @Test
    void testToJson() {
        V1DownwardAPIVolumeFile volumeFile = new V1DownwardAPIVolumeFile();
        volumeFile.setPath("testPath");
        V1DownwardAPIVolumeSource source = new V1DownwardAPIVolumeSource().defaultMode(420).addItemsItem(volumeFile);
        String json = source.toJson();
        assertTrue(json.contains("\"defaultMode\":420"));
        assertTrue(json.contains("\"items\":["));
        assertTrue(json.contains("\"path\":\"testPath\""));
    }
}

package io.kubernetes.client.custom;

import com.google.gson.stream.JsonWriter;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.google.gson.TypeAdapter;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.stream.JsonReader;
import static org.mockito.Mockito.mockStatic;
import org.mockito.MockedStatic;
import java.io.IOException;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PatchBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructorAndGetter}, hash: BAB8B5B2A5EA2B63B1F317622424D925
    @Test
    void testConstructorAndGetter() {
        String patchValue = "test patch";
        V1Patch patch = new V1Patch(patchValue);
        assertThat(patch.getValue(), is(equalTo(patchValue)));
    }

    //BaseRock generated method id: ${testPatchFormatConstants}, hash: 27B7778FF9F32994199CC18C3AECA798
    @Test
    void testPatchFormatConstants() {
        assertThat(V1Patch.PATCH_FORMAT_JSON_PATCH, is(equalTo("application/json-patch+json")));
        assertThat(V1Patch.PATCH_FORMAT_JSON_MERGE_PATCH, is(equalTo("application/merge-patch+json")));
        assertThat(V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH, is(equalTo("application/strategic-merge-patch+json")));
        assertThat(V1Patch.PATCH_FORMAT_APPLY_YAML, is(equalTo("application/apply-patch+yaml")));
    }

    //BaseRock generated method id: ${testV1PatchAdapterWrite}, hash: B9D7148B6BA34EC5F620FCECF64AD302
    @Test
    void testV1PatchAdapterWrite() throws IOException {
        V1Patch.V1PatchAdapter adapter = new V1Patch.V1PatchAdapter();
        V1Patch patch = new V1Patch("test patch");
        JsonWriter jsonWriter = mock(JsonWriter.class);
        try (MockedStatic<JsonWriter> mockedJsonWriter = mockStatic(JsonWriter.class)) {
            mockedJsonWriter.when(() -> jsonWriter.jsonValue("test patch")).thenReturn(jsonWriter);
            adapter.write(jsonWriter, patch);
        }
    }

    //BaseRock generated method id: ${testV1PatchAdapterRead}, hash: B40272694FD8F400EC1A6901EB75D94A
    @Test
    void testV1PatchAdapterRead() {
        V1Patch.V1PatchAdapter adapter = new V1Patch.V1PatchAdapter();
        JsonReader jsonReader = mock(JsonReader.class);
        assertThrows(UnsupportedOperationException.class, () -> adapter.read(jsonReader));
    }

    //BaseRock generated method id: ${testTypeAdapterInheritance}, hash: A3B83CBCAFD29D59A6D4A4158CD14C7A
    @Test
    void testTypeAdapterInheritance() {
        V1Patch.V1PatchAdapter adapter = new V1Patch.V1PatchAdapter();
        assertThat(adapter, is(notNullValue()));
        assertThat(adapter instanceof TypeAdapter, is(true));
    }
}

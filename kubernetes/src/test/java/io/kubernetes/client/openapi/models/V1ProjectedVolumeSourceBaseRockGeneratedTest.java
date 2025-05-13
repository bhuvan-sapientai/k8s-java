package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1VolumeProjection;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ProjectedVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1ProjectedVolumeSourceConstruction}, hash: 86FF642B0CCA2A80ACA486148264B976
    @Test
    void testV1ProjectedVolumeSourceConstruction() {
        V1ProjectedVolumeSource projectedVolumeSource = new V1ProjectedVolumeSource();
        assertNotNull(projectedVolumeSource);
    }

    //BaseRock generated method id: ${testDefaultMode}, hash: D87A222F3FE791AA8AB2389F13B524B4
    @Test
    void testDefaultMode() {
        V1ProjectedVolumeSource projectedVolumeSource = new V1ProjectedVolumeSource();
        Integer defaultMode = 420;
        projectedVolumeSource.setDefaultMode(defaultMode);
        assertEquals(defaultMode, projectedVolumeSource.getDefaultMode());
    }

    //BaseRock generated method id: ${testDefaultModeWithDifferentValues}, hash: 63546453AB28FEE43DD748DEF86239C4
    @ParameterizedTest
    @ValueSource(ints = { 0, 511, 777 })
    void testDefaultModeWithDifferentValues(int mode) {
        V1ProjectedVolumeSource projectedVolumeSource = new V1ProjectedVolumeSource();
        projectedVolumeSource.setDefaultMode(mode);
        assertEquals(mode, projectedVolumeSource.getDefaultMode());
    }

    //BaseRock generated method id: ${testSources}, hash: 1DC14A65F4BA56FAE7E7545A15122CE5
    @Test
    void testSources() {
        V1ProjectedVolumeSource projectedVolumeSource = new V1ProjectedVolumeSource();
        List<V1VolumeProjection> sources = new ArrayList<>();
        V1VolumeProjection volumeProjection = mock(V1VolumeProjection.class);
        sources.add(volumeProjection);
        projectedVolumeSource.setSources(sources);
        assertEquals(sources, projectedVolumeSource.getSources());
    }

    //BaseRock generated method id: ${testAddSourcesItem}, hash: D5B49DE942E33536A1E874069A9347F4
    @Test
    void testAddSourcesItem() {
        V1ProjectedVolumeSource projectedVolumeSource = new V1ProjectedVolumeSource();
        V1VolumeProjection volumeProjection = mock(V1VolumeProjection.class);
        projectedVolumeSource.addSourcesItem(volumeProjection);
        assertNotNull(projectedVolumeSource.getSources());
        assertEquals(1, projectedVolumeSource.getSources().size());
        assertEquals(volumeProjection, projectedVolumeSource.getSources().get(0));
    }

    //BaseRock generated method id: ${testEquals}, hash: 1C87F3401D74B8D39D264FD1DFAFF681
    @Test
    void testEquals() {
        V1ProjectedVolumeSource source1 = new V1ProjectedVolumeSource().defaultMode(420).addSourcesItem(new V1VolumeProjection());
        V1ProjectedVolumeSource source2 = new V1ProjectedVolumeSource().defaultMode(420).addSourcesItem(new V1VolumeProjection());
        V1ProjectedVolumeSource source3 = new V1ProjectedVolumeSource().defaultMode(511).addSourcesItem(new V1VolumeProjection());
        assertThat(source1.equals(source2), is(true));
        assertThat(source1.equals(source3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 81173C835B3CB0EFE7914FEB528D0AC0
    @Test
    void testHashCode() {
        V1ProjectedVolumeSource source1 = new V1ProjectedVolumeSource().defaultMode(420).addSourcesItem(new V1VolumeProjection());
        V1ProjectedVolumeSource source2 = new V1ProjectedVolumeSource().defaultMode(420).addSourcesItem(new V1VolumeProjection());
        assertThat(source1.hashCode(), equalTo(source2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: E2708B8AFCE8BC44D4F5495AB9663F4A
    @Test
    void testToString() {
        V1ProjectedVolumeSource projectedVolumeSource = new V1ProjectedVolumeSource().defaultMode(420).addSourcesItem(mock(V1VolumeProjection.class));
        String toString = projectedVolumeSource.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("defaultMode"), is(true));
        assertThat(toString.contains("sources"), is(true));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: E477E581B5D6FB2936D4A75C1FE19EAB
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("defaultMode", 420);
        JsonElement jsonElement = jsonObject;
        V1ProjectedVolumeSource.validateJsonElement(jsonElement);
    }

    //BaseRock generated method id: ${testCustomTypeAdapterFactory}, hash: F40A2BC809E26000F6A8C226D4B051D2
    @Test
    void testCustomTypeAdapterFactory() {
        assertNotNull(new V1ProjectedVolumeSource.CustomTypeAdapterFactory());
    }
}

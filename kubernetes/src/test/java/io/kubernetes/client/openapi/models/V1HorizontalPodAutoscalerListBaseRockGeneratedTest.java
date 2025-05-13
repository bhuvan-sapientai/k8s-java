package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1HorizontalPodAutoscaler;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullSource;
import java.io.IOException;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1HorizontalPodAutoscalerListBaseRockGeneratedTest {

    private V1HorizontalPodAutoscalerList v1HorizontalPodAutoscalerList;

    @BeforeEach
    void setUp() {
        v1HorizontalPodAutoscalerList = new V1HorizontalPodAutoscalerList();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 8EE4A6091B8FA1B64C7B441B194D4238
    @Test
    void testConstructor() {
        assertThat(v1HorizontalPodAutoscalerList, is(notNullValue()));
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 3E94F044B68FE25CF525CD0163D514FE
    @Test
    void testApiVersion() {
        String apiVersion = "autoscaling/v1";
        v1HorizontalPodAutoscalerList.setApiVersion(apiVersion);
        assertThat(v1HorizontalPodAutoscalerList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testApiVersionWithDifferentValues}, hash: 24CF739E2849FF68FDC74C6E8131037F
    @ParameterizedTest
    @NullSource
    @ValueSource(strings = { "", "autoscaling/v2", "apps/v1" })
    void testApiVersionWithDifferentValues(String apiVersion) {
        v1HorizontalPodAutoscalerList.setApiVersion(apiVersion);
        assertThat(v1HorizontalPodAutoscalerList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testItems}, hash: 433310CAB4C92F76671AB31750E2CC40
    @Test
    void testItems() {
        List<V1HorizontalPodAutoscaler> items = new ArrayList<>();
        items.add(new V1HorizontalPodAutoscaler());
        items.add(new V1HorizontalPodAutoscaler());
        v1HorizontalPodAutoscalerList.setItems(items);
        assertThat(v1HorizontalPodAutoscalerList.getItems(), is(equalTo(items)));
        assertThat(v1HorizontalPodAutoscalerList.getItems(), hasSize(2));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 4B7687E304A86947FD39EDFBA6D21297
    @Test
    void testAddItemsItem() {
        V1HorizontalPodAutoscaler item = new V1HorizontalPodAutoscaler();
        v1HorizontalPodAutoscalerList.addItemsItem(item);
        assertThat(v1HorizontalPodAutoscalerList.getItems(), hasSize(1));
        assertThat(v1HorizontalPodAutoscalerList.getItems().get(0), is(equalTo(item)));
    }

    //BaseRock generated method id: ${testKind}, hash: 55E5A1881212065456F7DF816D3A654F
    @Test
    void testKind() {
        String kind = "HorizontalPodAutoscalerList";
        v1HorizontalPodAutoscalerList.setKind(kind);
        assertThat(v1HorizontalPodAutoscalerList.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testKindWithDifferentValues}, hash: D685405539B65E17E5CB3BBD129981DA
    @ParameterizedTest
    @NullSource
    @ValueSource(strings = { "", "PodList", "DeploymentList" })
    void testKindWithDifferentValues(String kind) {
        v1HorizontalPodAutoscalerList.setKind(kind);
        assertThat(v1HorizontalPodAutoscalerList.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testMetadata}, hash: 34E29E02AECA8C7C1BA7FD1F9545BE58
    @Test
    void testMetadata() {
        V1ListMeta metadata = new V1ListMeta();
        v1HorizontalPodAutoscalerList.setMetadata(metadata);
        assertThat(v1HorizontalPodAutoscalerList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 189BE3C34CDBF5D628B6B76074C2DE40
    @Test
    void testEquals() {
        V1HorizontalPodAutoscalerList list1 = new V1HorizontalPodAutoscalerList().apiVersion("v1").kind("HorizontalPodAutoscalerList").metadata(new V1ListMeta()).items(Arrays.asList(new V1HorizontalPodAutoscaler()));
        V1HorizontalPodAutoscalerList list2 = new V1HorizontalPodAutoscalerList().apiVersion("v1").kind("HorizontalPodAutoscalerList").metadata(new V1ListMeta()).items(Arrays.asList(new V1HorizontalPodAutoscaler()));
        assertThat(list1.equals(list2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 77F869BF9EE06C13F1231659ECC93FD2
    @Test
    void testHashCode() {
        V1HorizontalPodAutoscalerList list1 = new V1HorizontalPodAutoscalerList().apiVersion("v1").kind("HorizontalPodAutoscalerList").metadata(new V1ListMeta()).items(Arrays.asList(new V1HorizontalPodAutoscaler()));
        V1HorizontalPodAutoscalerList list2 = new V1HorizontalPodAutoscalerList().apiVersion("v1").kind("HorizontalPodAutoscalerList").metadata(new V1ListMeta()).items(Arrays.asList(new V1HorizontalPodAutoscaler()));
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: C162D2EE9FB9E5FDB30A2428B9304F3A
    @Test
    void testToString() {
        v1HorizontalPodAutoscalerList.setApiVersion("v1");
        v1HorizontalPodAutoscalerList.setKind("HorizontalPodAutoscalerList");
        v1HorizontalPodAutoscalerList.setMetadata(new V1ListMeta());
        v1HorizontalPodAutoscalerList.setItems(Arrays.asList(new V1HorizontalPodAutoscaler()));
        String toString = v1HorizontalPodAutoscalerList.toString();
        assertThat(toString, containsString("apiVersion"));
        assertThat(toString, containsString("kind"));
        assertThat(toString, containsString("metadata"));
        assertThat(toString, containsString("items"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 09ECB72D8714162311BEC5AD470603BC
    @Test
    void testValidateJsonElement() throws IOException {
        assertThrows(IllegalArgumentException.class, () -> {
            V1HorizontalPodAutoscalerList.validateJsonElement(null);
        });
    }

    //BaseRock generated method id: ${testFromJson}, hash: 7A57875107E23DB341CB5FA80CD989EF
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"HorizontalPodAutoscalerList\",\"metadata\":{},\"items\":[{}]}";
        V1HorizontalPodAutoscalerList list = V1HorizontalPodAutoscalerList.fromJson(json);
        assertThat(list, is(notNullValue()));
        assertThat(list.getApiVersion(), is(equalTo("v1")));
        assertThat(list.getKind(), is(equalTo("HorizontalPodAutoscalerList")));
        assertThat(list.getMetadata(), is(notNullValue()));
        assertThat(list.getItems(), hasSize(1));
    }

    //BaseRock generated method id: ${testToJson}, hash: 7CEBC469C8763F8CD234B3374A5D15E0
    @Test
    void testToJson() {
        v1HorizontalPodAutoscalerList.setApiVersion("v1");
        v1HorizontalPodAutoscalerList.setKind("HorizontalPodAutoscalerList");
        v1HorizontalPodAutoscalerList.setMetadata(new V1ListMeta());
        v1HorizontalPodAutoscalerList.setItems(Arrays.asList(new V1HorizontalPodAutoscaler()));
        String json = v1HorizontalPodAutoscalerList.toJson();
        assertThat(json, is(notNullValue()));
        assertThat(json, containsString("apiVersion"));
        assertThat(json, containsString("kind"));
        assertThat(json, containsString("metadata"));
        assertThat(json, containsString("items"));
    }
}

package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1PriorityLevelConfiguration;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
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
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.startsWith;
import java.io.IOException;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PriorityLevelConfigurationListBaseRockGeneratedTest {

    private V1PriorityLevelConfigurationList v1PriorityLevelConfigurationList;

    @BeforeEach
    void setUp() {
        v1PriorityLevelConfigurationList = new V1PriorityLevelConfigurationList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: E796FBD0C333182C0BA07D3F7C89C4EF
    @Test
    void testGetApiVersion() {
        assertThat(v1PriorityLevelConfigurationList.getApiVersion(), is(nullValue()));
        v1PriorityLevelConfigurationList.setApiVersion("v1");
        assertThat(v1PriorityLevelConfigurationList.getApiVersion(), is("v1"));
    }

    //BaseRock generated method id: ${testGetItems}, hash: 466BCB0444675D30E719F5B3E9D9791E
    @Test
    void testGetItems() {
        assertThat(v1PriorityLevelConfigurationList.getItems(), is(notNullValue()));
        assertThat(v1PriorityLevelConfigurationList.getItems(), hasSize(0));
        List<V1PriorityLevelConfiguration> items = new ArrayList<>();
        items.add(mock(V1PriorityLevelConfiguration.class));
        v1PriorityLevelConfigurationList.setItems(items);
        assertThat(v1PriorityLevelConfigurationList.getItems(), is(items));
        assertThat(v1PriorityLevelConfigurationList.getItems(), hasSize(1));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 7ECF4E8E7CDD109A014D00295F4FF902
    @Test
    void testGetKind() {
        assertThat(v1PriorityLevelConfigurationList.getKind(), is(nullValue()));
        v1PriorityLevelConfigurationList.setKind("PriorityLevelConfigurationList");
        assertThat(v1PriorityLevelConfigurationList.getKind(), is("PriorityLevelConfigurationList"));
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 5DEF18FC10DF45ED8841BF61225132DF
    @Test
    void testGetMetadata() {
        assertThat(v1PriorityLevelConfigurationList.getMetadata(), is(nullValue()));
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1PriorityLevelConfigurationList.setMetadata(metadata);
        assertThat(v1PriorityLevelConfigurationList.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 4015B1AC68931999ED6B0F119CD8CCC9
    @Test
    void testBuilder() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        List<V1PriorityLevelConfiguration> items = new ArrayList<>();
        items.add(mock(V1PriorityLevelConfiguration.class));
        V1PriorityLevelConfigurationList list = new V1PriorityLevelConfigurationList().apiVersion("v1").items(items).kind("PriorityLevelConfigurationList").metadata(metadata);
        assertThat(list.getApiVersion(), is("v1"));
        assertThat(list.getItems(), is(items));
        assertThat(list.getKind(), is("PriorityLevelConfigurationList"));
        assertThat(list.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 3BDF46C5EDA437E3BE34508AA3D5DE8C
    @Test
    void testAddItemsItem() {
        V1PriorityLevelConfiguration item = mock(V1PriorityLevelConfiguration.class);
        v1PriorityLevelConfigurationList.addItemsItem(item);
        assertThat(v1PriorityLevelConfigurationList.getItems(), hasSize(1));
        assertThat(v1PriorityLevelConfigurationList.getItems().get(0), is(item));
    }

    //BaseRock generated method id: ${testEquals}, hash: FA805706AD01C0E79E5552F0D5B23635
    @Test
    void testEquals() {
        V1PriorityLevelConfigurationList list1 = new V1PriorityLevelConfigurationList().apiVersion("v1").kind("PriorityLevelConfigurationList");
        V1PriorityLevelConfigurationList list2 = new V1PriorityLevelConfigurationList().apiVersion("v1").kind("PriorityLevelConfigurationList");
        assertThat(list1, is(equalTo(list2)));
        list2.setApiVersion("v2");
        assertThat(list1, is(not(equalTo(list2))));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 604540FB88F32AE84C60B2E235A4AE7D
    @Test
    void testHashCode() {
        V1PriorityLevelConfigurationList list1 = new V1PriorityLevelConfigurationList().apiVersion("v1").kind("PriorityLevelConfigurationList");
        V1PriorityLevelConfigurationList list2 = new V1PriorityLevelConfigurationList().apiVersion("v1").kind("PriorityLevelConfigurationList");
        assertThat(list1.hashCode(), is(equalTo(list2.hashCode())));
        list2.setApiVersion("v2");
        assertThat(list1.hashCode(), is(not(equalTo(list2.hashCode()))));
    }

    //BaseRock generated method id: ${testToString}, hash: 8D8C3883BE5A7F3D36C077BFB014BEDE
    @Test
    void testToString() {
        V1PriorityLevelConfigurationList list = new V1PriorityLevelConfigurationList().apiVersion("v1").kind("PriorityLevelConfigurationList");
        String expected = "class V1PriorityLevelConfigurationList {\n" + "    apiVersion: v1\n" + "    items: []\n" + "    kind: PriorityLevelConfigurationList\n" + "    metadata: null\n" + "}";
        assertThat(list.toString(), is(equalTo(expected)));
    }

    //BaseRock generated method id: ${testToJson}, hash: 8E481B8545CE7F3ABBEFB364359D68FB
    @Test
    void testToJson() throws IOException {
        V1PriorityLevelConfigurationList list = new V1PriorityLevelConfigurationList().apiVersion("v1").kind("PriorityLevelConfigurationList");
        String json = list.toJson();
        assertNotNull(json);
        assertTrue(json.contains("\"apiVersion\":\"v1\""));
        assertTrue(json.contains("\"kind\":\"PriorityLevelConfigurationList\""));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 22F2547E9314A637E68348F07671C2B2
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"PriorityLevelConfigurationList\",\"items\":[]}";
        V1PriorityLevelConfigurationList list = V1PriorityLevelConfigurationList.fromJson(json);
        assertNotNull(list);
        assertEquals("v1", list.getApiVersion());
        assertEquals("PriorityLevelConfigurationList", list.getKind());
        assertNotNull(list.getItems());
        assertTrue(list.getItems().isEmpty());
    }
}

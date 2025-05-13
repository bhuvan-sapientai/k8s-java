package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.CoreV1Event;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.common.KubernetesListObject;
import java.util.ArrayList;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class CoreV1EventListBaseRockGeneratedTest {

    private CoreV1EventList coreV1EventList;

    @BeforeEach
    void setUp() {
        coreV1EventList = new CoreV1EventList();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: FEB41352969E0B8E90450B8FD17CA833
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        coreV1EventList.setApiVersion(apiVersion);
        assertEquals(apiVersion, coreV1EventList.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: 0A5E4C9EFBAE37F339271CB05DB68932
    @Test
    void testItems() {
        List<CoreV1Event> items = new ArrayList<>();
        items.add(mock(CoreV1Event.class));
        items.add(mock(CoreV1Event.class));
        coreV1EventList.setItems(items);
        assertThat(coreV1EventList.getItems(), is(equalTo(items)));
        assertThat(coreV1EventList.getItems(), hasSize(2));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: B8D2AFE7E6E2C8281D42F93D8A74EF12
    @Test
    void testAddItemsItem() {
        CoreV1Event event = mock(CoreV1Event.class);
        coreV1EventList.addItemsItem(event);
        assertThat(coreV1EventList.getItems(), hasSize(1));
        assertThat(coreV1EventList.getItems().get(0), is(equalTo(event)));
    }

    //BaseRock generated method id: ${testKind}, hash: 2CB5C58623E4B05ED35EBCEC6547197C
    @Test
    void testKind() {
        String kind = "EventList";
        coreV1EventList.setKind(kind);
        assertEquals(kind, coreV1EventList.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: DC4103244D3EB59889F1A4A8F7088704
    @Test
    void testMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        coreV1EventList.setMetadata(metadata);
        assertEquals(metadata, coreV1EventList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: 3889345B408711C8B17AE49DA98F410A
    @Test
    void testEquals() {
        CoreV1EventList eventList1 = new CoreV1EventList();
        CoreV1EventList eventList2 = new CoreV1EventList();
        String apiVersion = "v1";
        String kind = "EventList";
        V1ListMeta metadata = mock(V1ListMeta.class);
        List<CoreV1Event> items = new ArrayList<>();
        items.add(mock(CoreV1Event.class));
        eventList1.setApiVersion(apiVersion);
        eventList1.setKind(kind);
        eventList1.setMetadata(metadata);
        eventList1.setItems(items);
        eventList2.setApiVersion(apiVersion);
        eventList2.setKind(kind);
        eventList2.setMetadata(metadata);
        eventList2.setItems(items);
        assertThat(eventList1.equals(eventList2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: AF613AF5C79201CDAE5EA7EF08B77CBF
    @Test
    void testHashCode() {
        CoreV1EventList eventList = new CoreV1EventList();
        eventList.setApiVersion("v1");
        eventList.setKind("EventList");
        eventList.setMetadata(mock(V1ListMeta.class));
        List<CoreV1Event> items = new ArrayList<>();
        items.add(mock(CoreV1Event.class));
        eventList.setItems(items);
        int hashCode = eventList.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 1CAAE61B6FBD332E664E62E539191FCB
    @Test
    void testToString() {
        CoreV1EventList eventList = new CoreV1EventList();
        eventList.setApiVersion("v1");
        eventList.setKind("EventList");
        eventList.setMetadata(mock(V1ListMeta.class));
        List<CoreV1Event> items = new ArrayList<>();
        items.add(mock(CoreV1Event.class));
        eventList.setItems(items);
        String toString = eventList.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("items"), is(true));
    }

    //BaseRock generated method id: ${testImplementsKubernetesListObject}, hash: C8ECDA06A6AA348700260BE4DA4E2BCB
    @Test
    void testImplementsKubernetesListObject() {
        assertThat(coreV1EventList instanceof KubernetesListObject, is(true));
    }

    //BaseRock generated method id: ${testFromJson}, hash: E4D3FCB5FC3B6031E8B4BC07EE6B4A58
    @Test
    void testFromJson() throws Exception {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"EventList\",\"metadata\":{},\"items\":[]}";
        CoreV1EventList eventList = CoreV1EventList.fromJson(json);
        assertNotNull(eventList);
        assertEquals("v1", eventList.getApiVersion());
        assertEquals("EventList", eventList.getKind());
        assertNotNull(eventList.getMetadata());
        assertNotNull(eventList.getItems());
    }

    //BaseRock generated method id: ${testToJson}, hash: F54F727A1E902B14FAC56764B60F32F1
    @Test
    void testToJson() {
        CoreV1EventList eventList = new CoreV1EventList();
        eventList.setApiVersion("v1");
        eventList.setKind("EventList");
        eventList.setMetadata(new V1ListMeta());
        eventList.setItems(new ArrayList<>());
        String json = eventList.toJson();
        assertNotNull(json);
        assertThat(json.contains("\"apiVersion\":\"v1\""), is(true));
        assertThat(json.contains("\"kind\":\"EventList\""), is(true));
        assertThat(json.contains("\"metadata\":{}"), is(true));
        assertThat(json.contains("\"items\":[]"), is(true));
    }
}

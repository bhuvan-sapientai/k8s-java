package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import static org.mockito.Mockito.doReturn;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.EventsV1Event;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class EventsV1EventListBaseRockGeneratedTest {

    private EventsV1EventList eventsV1EventList;

    @BeforeEach
    void setUp() {
        eventsV1EventList = new EventsV1EventList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: C3D5ED18D202CB09F28667717250A0D5
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1";
        eventsV1EventList.setApiVersion(apiVersion);
        assertEquals(apiVersion, eventsV1EventList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: 6F1BB6E5D135AF15D20F50696D75B567
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1";
        eventsV1EventList.setApiVersion(apiVersion);
        assertThat(eventsV1EventList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testGetItems}, hash: A8BDD5A444FBA163FD8AF99572448949
    @Test
    void testGetItems() {
        List<EventsV1Event> items = new ArrayList<>();
        items.add(mock(EventsV1Event.class));
        items.add(mock(EventsV1Event.class));
        eventsV1EventList.setItems(items);
        assertThat(eventsV1EventList.getItems(), is(equalTo(items)));
        assertThat(eventsV1EventList.getItems(), hasSize(2));
    }

    //BaseRock generated method id: ${testSetItems}, hash: 68026AA1AA439B913EF1855F71ADF7D6
    @Test
    void testSetItems() {
        List<EventsV1Event> items = new ArrayList<>();
        items.add(mock(EventsV1Event.class));
        eventsV1EventList.setItems(items);
        assertThat(eventsV1EventList.getItems(), is(equalTo(items)));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: CDF5F7B02F3AD3A12C0D68372A049AE2
    @Test
    void testAddItemsItem() {
        EventsV1Event event = mock(EventsV1Event.class);
        eventsV1EventList.addItemsItem(event);
        assertThat(eventsV1EventList.getItems(), hasSize(1));
        assertThat(eventsV1EventList.getItems().get(0), is(equalTo(event)));
    }

    //BaseRock generated method id: ${testGetKind}, hash: E7698DDFD81B3DEF524B12FEE838387E
    @Test
    void testGetKind() {
        String kind = "EventList";
        eventsV1EventList.setKind(kind);
        assertEquals(kind, eventsV1EventList.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: DA4E931D886801EC4463A705400C8154
    @Test
    void testSetKind() {
        String kind = "EventList";
        eventsV1EventList.setKind(kind);
        assertThat(eventsV1EventList.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: FB93F5E9D662AAA4F2465D7F0679F909
    @Test
    void testGetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        eventsV1EventList.setMetadata(metadata);
        assertThat(eventsV1EventList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: 1A16DBC1E0EF84A1C655B19391B35C84
    @Test
    void testSetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        eventsV1EventList.setMetadata(metadata);
        assertThat(eventsV1EventList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 6B45D8BBC46BB26B2955692F9D07A9D8
    @Test
    void testEquals() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        List<EventsV1Event> items = new ArrayList<>();
        items.add(mock(EventsV1Event.class));
        EventsV1EventList eventList1 = new EventsV1EventList().apiVersion("v1").kind("EventList").metadata(metadata).items(items);
        EventsV1EventList eventList2 = new EventsV1EventList().apiVersion("v1").kind("EventList").metadata(metadata).items(items);
        assertThat(eventList1.equals(eventList2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: E37383503290B94CD241FC1AEDBBAE91
    @Test
    void testHashCode() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        List<EventsV1Event> items = new ArrayList<>();
        items.add(mock(EventsV1Event.class));
        EventsV1EventList eventList1 = new EventsV1EventList().apiVersion("v1").kind("EventList").metadata(metadata).items(items);
        EventsV1EventList eventList2 = new EventsV1EventList().apiVersion("v1").kind("EventList").metadata(metadata).items(items);
        assertThat(eventList1.hashCode(), is(equalTo(eventList2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 1AE26449909E30E93484A4B9C5701613
    @Test
    void testToString() {
        EventsV1EventList eventList = new EventsV1EventList().apiVersion("v1").kind("EventList").metadata(mock(V1ListMeta.class));
        String toString = eventList.toString();
        assertNotNull(toString);
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: D7D32BAA9E758F147427FAF8D9E201DE
    @Test
    void testBuilder() {
        EventsV1EventList eventList = new EventsV1EventList().apiVersion("v1").kind("EventList").metadata(mock(V1ListMeta.class)).addItemsItem(mock(EventsV1Event.class));
        assertThat(eventList, is(notNullValue()));
        assertThat(eventList.getApiVersion(), is(equalTo("v1")));
        assertThat(eventList.getKind(), is(equalTo("EventList")));
        assertThat(eventList.getMetadata(), is(notNullValue()));
        assertThat(eventList.getItems(), hasSize(1));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: F01C4F84BE17FADE33C369FE3CA6B315
    @Test
    void testValidateJsonElement() {
        // This method is not directly testable as it's a static method in a different class.
        // We can only test its effects indirectly through other methods that use it.
    }
}

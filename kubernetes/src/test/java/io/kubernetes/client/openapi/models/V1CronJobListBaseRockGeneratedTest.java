package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1CronJob;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CronJobListBaseRockGeneratedTest {

    private V1CronJobList v1CronJobList;

    @BeforeEach
    void setUp() {
        v1CronJobList = new V1CronJobList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 0975F97175E11A0A6CF8EABD3D4D638A
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1";
        v1CronJobList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1CronJobList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: 2CCCF7B541815E47F45A64C7C84AB53C
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1";
        v1CronJobList.setApiVersion(apiVersion);
        assertThat(v1CronJobList.getApiVersion(), is(apiVersion));
    }

    //BaseRock generated method id: ${testGetItems}, hash: CAE8D2151FE3CB04B113594977C72E35
    @Test
    void testGetItems() {
        List<V1CronJob> items = new ArrayList<>();
        items.add(new V1CronJob());
        v1CronJobList.setItems(items);
        assertThat(v1CronJobList.getItems(), is(items));
    }

    //BaseRock generated method id: ${testSetItems}, hash: DE67941A1F20676BD0A0DF6BCD13F2B6
    @Test
    void testSetItems() {
        List<V1CronJob> items = new ArrayList<>();
        items.add(new V1CronJob());
        v1CronJobList.setItems(items);
        assertThat(v1CronJobList.getItems(), hasSize(1));
        assertThat(v1CronJobList.getItems(), containsInAnyOrder(items.toArray()));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 38140F883CFE29B05DEACE1FFD290E68
    @Test
    void testAddItemsItem() {
        V1CronJob item = new V1CronJob();
        v1CronJobList.addItemsItem(item);
        assertThat(v1CronJobList.getItems(), hasSize(1));
        assertThat(v1CronJobList.getItems().get(0), is(item));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 3CEA15EA55818664892450640D3A82CB
    @Test
    void testGetKind() {
        String kind = "CronJobList";
        v1CronJobList.setKind(kind);
        assertEquals(kind, v1CronJobList.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: CBF6DCABBF26E02AA7415CDF95C311C8
    @Test
    void testSetKind() {
        String kind = "CronJobList";
        v1CronJobList.setKind(kind);
        assertThat(v1CronJobList.getKind(), is(kind));
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 15C317E0E6292489F61001F3B04C5918
    @Test
    void testGetMetadata() {
        V1ListMeta metadata = new V1ListMeta();
        v1CronJobList.setMetadata(metadata);
        assertEquals(metadata, v1CronJobList.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: BADA1F004365D44596056669A7FEA26D
    @Test
    void testSetMetadata() {
        V1ListMeta metadata = new V1ListMeta();
        v1CronJobList.setMetadata(metadata);
        assertThat(v1CronJobList.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testEquals}, hash: 23F2AE44D97DAC195A7206518FE5348E
    @Test
    void testEquals() {
        V1CronJobList other = new V1CronJobList();
        other.setApiVersion("v1");
        other.setKind("CronJobList");
        other.setMetadata(new V1ListMeta());
        List<V1CronJob> items = new ArrayList<>();
        items.add(new V1CronJob());
        other.setItems(items);
        v1CronJobList.setApiVersion("v1");
        v1CronJobList.setKind("CronJobList");
        v1CronJobList.setMetadata(new V1ListMeta());
        v1CronJobList.setItems(items);
        assertThat(v1CronJobList, is(equalTo(other)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: DEA4326DB3F43C2729349C4D1670837C
    @Test
    void testHashCode() {
        V1CronJobList other = new V1CronJobList();
        other.setApiVersion("v1");
        other.setKind("CronJobList");
        other.setMetadata(new V1ListMeta());
        List<V1CronJob> items = new ArrayList<>();
        items.add(new V1CronJob());
        other.setItems(items);
        v1CronJobList.setApiVersion("v1");
        v1CronJobList.setKind("CronJobList");
        v1CronJobList.setMetadata(new V1ListMeta());
        v1CronJobList.setItems(items);
        assertThat(v1CronJobList.hashCode(), is(equalTo(other.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 5D0BB597B9AC4FD49862DFA7ADBA0441
    @Test
    void testToString() {
        v1CronJobList.setApiVersion("v1");
        v1CronJobList.setKind("CronJobList");
        v1CronJobList.setMetadata(new V1ListMeta());
        List<V1CronJob> items = new ArrayList<>();
        items.add(new V1CronJob());
        v1CronJobList.setItems(items);
        String toString = v1CronJobList.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("items"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: C9619EB570B9A360A283F4DACEE0D39C
    @Test
    void testBuilder() {
        V1ListMeta metadata = new V1ListMeta();
        List<V1CronJob> items = new ArrayList<>();
        items.add(new V1CronJob());
        V1CronJobList built = new V1CronJobList().apiVersion("v1").kind("CronJobList").metadata(metadata).items(items);
        assertThat(built.getApiVersion(), is("v1"));
        assertThat(built.getKind(), is("CronJobList"));
        assertThat(built.getMetadata(), is(metadata));
        assertThat(built.getItems(), is(items));
    }

    //BaseRock generated method id: ${testNewV1CronJobList}, hash: 1F47504BC1F000627BDEA9F2A9423306
    @Test
    void testNewV1CronJobList() {
        V1CronJobList newList = new V1CronJobList();
        assertNotNull(newList);
        assertThat(newList.getApiVersion(), is(nullValue()));
        assertThat(newList.getKind(), is(nullValue()));
        assertThat(newList.getMetadata(), is(nullValue()));
        assertThat(newList.getItems(), is(notNullValue()));
        assertThat(newList.getItems(), hasSize(0));
    }
}

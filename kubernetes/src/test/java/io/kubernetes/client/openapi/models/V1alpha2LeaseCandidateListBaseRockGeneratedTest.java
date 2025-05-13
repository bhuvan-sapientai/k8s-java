package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1alpha2LeaseCandidate;
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
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha2LeaseCandidateListBaseRockGeneratedTest {

    private V1alpha2LeaseCandidateList v1alpha2LeaseCandidateList;

    @BeforeEach
    void setUp() {
        v1alpha2LeaseCandidateList = new V1alpha2LeaseCandidateList();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 9A70E8208E836561AB3CCA4F25C00A32
    @Test
    void testConstructor() {
        assertNotNull(v1alpha2LeaseCandidateList);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: CC2A18093C23A8071E1F1C695C54BAD5
    @Test
    void testApiVersion() {
        String apiVersion = "v1alpha2";
        v1alpha2LeaseCandidateList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1alpha2LeaseCandidateList.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: 18050D83621F9B922C4F3E70660BDCD5
    @Test
    void testItems() {
        List<V1alpha2LeaseCandidate> items = new ArrayList<>();
        items.add(mock(V1alpha2LeaseCandidate.class));
        items.add(mock(V1alpha2LeaseCandidate.class));
        v1alpha2LeaseCandidateList.setItems(items);
        assertThat(v1alpha2LeaseCandidateList.getItems(), is(items));
        assertThat(v1alpha2LeaseCandidateList.getItems(), hasSize(2));
    }

    //BaseRock generated method id: ${testKind}, hash: D5D240EA1CC718234D79E1944DA17522
    @Test
    void testKind() {
        String kind = "LeaseCandidateList";
        v1alpha2LeaseCandidateList.setKind(kind);
        assertEquals(kind, v1alpha2LeaseCandidateList.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 98E80BD38134A830E3B49E54B2717163
    @Test
    void testMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1alpha2LeaseCandidateList.setMetadata(metadata);
        assertThat(v1alpha2LeaseCandidateList.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: F3D2D43AD5B3E2665412ECA54E2A9416
    @Test
    void testAddItemsItem() {
        V1alpha2LeaseCandidate item = mock(V1alpha2LeaseCandidate.class);
        v1alpha2LeaseCandidateList.addItemsItem(item);
        assertThat(v1alpha2LeaseCandidateList.getItems(), hasSize(1));
        assertThat(v1alpha2LeaseCandidateList.getItems().get(0), is(item));
    }

    //BaseRock generated method id: ${testEquals}, hash: DBA63F63F098A683E58400B3F550CBE4
    @Test
    void testEquals() {
        V1alpha2LeaseCandidateList other = new V1alpha2LeaseCandidateList();
        other.setApiVersion("v1alpha2");
        other.setKind("LeaseCandidateList");
        V1ListMeta metadata = mock(V1ListMeta.class);
        other.setMetadata(metadata);
        List<V1alpha2LeaseCandidate> items = new ArrayList<>();
        items.add(mock(V1alpha2LeaseCandidate.class));
        other.setItems(items);
        v1alpha2LeaseCandidateList.setApiVersion("v1alpha2");
        v1alpha2LeaseCandidateList.setKind("LeaseCandidateList");
        v1alpha2LeaseCandidateList.setMetadata(metadata);
        v1alpha2LeaseCandidateList.setItems(items);
        assertThat(v1alpha2LeaseCandidateList, is(equalTo(other)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: AA99D570A20D885C6B225661C379E1A3
    @Test
    void testHashCode() {
        v1alpha2LeaseCandidateList.setApiVersion("v1alpha2");
        v1alpha2LeaseCandidateList.setKind("LeaseCandidateList");
        v1alpha2LeaseCandidateList.setMetadata(mock(V1ListMeta.class));
        List<V1alpha2LeaseCandidate> items = new ArrayList<>();
        items.add(mock(V1alpha2LeaseCandidate.class));
        v1alpha2LeaseCandidateList.setItems(items);
        int hashCode = v1alpha2LeaseCandidateList.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 1486C6A58CCD2EAA05777B423BA6147C
    @Test
    void testToString() {
        v1alpha2LeaseCandidateList.setApiVersion("v1alpha2");
        v1alpha2LeaseCandidateList.setKind("LeaseCandidateList");
        v1alpha2LeaseCandidateList.setMetadata(mock(V1ListMeta.class));
        List<V1alpha2LeaseCandidate> items = new ArrayList<>();
        items.add(mock(V1alpha2LeaseCandidate.class));
        v1alpha2LeaseCandidateList.setItems(items);
        String toString = v1alpha2LeaseCandidateList.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("items"), is(true));
    }
}

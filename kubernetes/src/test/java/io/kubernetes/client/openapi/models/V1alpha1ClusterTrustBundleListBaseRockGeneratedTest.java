package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1alpha1ClusterTrustBundle;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha1ClusterTrustBundleListBaseRockGeneratedTest {

    private V1alpha1ClusterTrustBundleList v1alpha1ClusterTrustBundleList;

    @BeforeEach
    void setUp() {
        v1alpha1ClusterTrustBundleList = new V1alpha1ClusterTrustBundleList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: BF1F5A7DFBEE71CF3ADFCA7FAE72039F
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1alpha1";
        v1alpha1ClusterTrustBundleList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1alpha1ClusterTrustBundleList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: 7271DCA558C447A29E320A29A6C4E4A6
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1alpha1";
        v1alpha1ClusterTrustBundleList.setApiVersion(apiVersion);
        assertThat(v1alpha1ClusterTrustBundleList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testGetItems}, hash: 517FD138932ED77B3FB31FA95CF28BD3
    @Test
    void testGetItems() {
        List<V1alpha1ClusterTrustBundle> items = new ArrayList<>();
        items.add(mock(V1alpha1ClusterTrustBundle.class));
        v1alpha1ClusterTrustBundleList.setItems(items);
        assertThat(v1alpha1ClusterTrustBundleList.getItems(), is(equalTo(items)));
    }

    //BaseRock generated method id: ${testSetItems}, hash: 344B5F67A1DE69BB9F9B12F085476DF4
    @Test
    void testSetItems() {
        List<V1alpha1ClusterTrustBundle> items = new ArrayList<>();
        items.add(mock(V1alpha1ClusterTrustBundle.class));
        v1alpha1ClusterTrustBundleList.setItems(items);
        assertThat(v1alpha1ClusterTrustBundleList.getItems(), hasSize(1));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 0E956EDEAB550CCB688E08DCC8F0F8D0
    @Test
    void testAddItemsItem() {
        V1alpha1ClusterTrustBundle item = mock(V1alpha1ClusterTrustBundle.class);
        v1alpha1ClusterTrustBundleList.addItemsItem(item);
        assertThat(v1alpha1ClusterTrustBundleList.getItems(), hasSize(1));
        assertThat(v1alpha1ClusterTrustBundleList.getItems().get(0), is(equalTo(item)));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 46A853CFDE1210AEBFF3623D96FC8369
    @Test
    void testGetKind() {
        String kind = "ClusterTrustBundleList";
        v1alpha1ClusterTrustBundleList.setKind(kind);
        assertEquals(kind, v1alpha1ClusterTrustBundleList.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: 1E3449BEC9072641A9431528259467E3
    @Test
    void testSetKind() {
        String kind = "ClusterTrustBundleList";
        v1alpha1ClusterTrustBundleList.setKind(kind);
        assertThat(v1alpha1ClusterTrustBundleList.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 148CFF545D82E1712BEF9D8B2DBD49CE
    @Test
    void testGetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1alpha1ClusterTrustBundleList.setMetadata(metadata);
        assertEquals(metadata, v1alpha1ClusterTrustBundleList.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: EB3F9A0F30311992BB54E5A239BD1136
    @Test
    void testSetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1alpha1ClusterTrustBundleList.setMetadata(metadata);
        assertThat(v1alpha1ClusterTrustBundleList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: F4DBEBA56AFB49DFAA491BD9D0A03B1A
    @Test
    void testEquals() {
        V1alpha1ClusterTrustBundleList list1 = new V1alpha1ClusterTrustBundleList();
        V1alpha1ClusterTrustBundleList list2 = new V1alpha1ClusterTrustBundleList();
        list1.setApiVersion("v1alpha1");
        list2.setApiVersion("v1alpha1");
        list1.setKind("ClusterTrustBundleList");
        list2.setKind("ClusterTrustBundleList");
        V1ListMeta metadata = mock(V1ListMeta.class);
        list1.setMetadata(metadata);
        list2.setMetadata(metadata);
        List<V1alpha1ClusterTrustBundle> items = new ArrayList<>();
        items.add(mock(V1alpha1ClusterTrustBundle.class));
        list1.setItems(items);
        list2.setItems(items);
        assertThat(list1, is(equalTo(list2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 7D40BE64FA6D905B7A999D156A268805
    @Test
    void testHashCode() {
        V1alpha1ClusterTrustBundleList list = new V1alpha1ClusterTrustBundleList();
        list.setApiVersion("v1alpha1");
        list.setKind("ClusterTrustBundleList");
        list.setMetadata(mock(V1ListMeta.class));
        List<V1alpha1ClusterTrustBundle> items = new ArrayList<>();
        items.add(mock(V1alpha1ClusterTrustBundle.class));
        list.setItems(items);
        int hashCode = list.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: EAA6EBB51B9AEC349FC0A0DDEDE32AC4
    @Test
    void testToString() {
        V1alpha1ClusterTrustBundleList list = new V1alpha1ClusterTrustBundleList();
        list.setApiVersion("v1alpha1");
        list.setKind("ClusterTrustBundleList");
        V1ListMeta metadata = mock(V1ListMeta.class);
        when(metadata.toString()).thenReturn("MockedMetadata");
        list.setMetadata(metadata);
        List<V1alpha1ClusterTrustBundle> items = new ArrayList<>();
        V1alpha1ClusterTrustBundle item = mock(V1alpha1ClusterTrustBundle.class);
        when(item.toString()).thenReturn("MockedItem");
        items.add(item);
        list.setItems(items);
        String result = list.toString();
        assertNotNull(result);
        assertThat(result.contains("apiVersion"), is(true));
        assertThat(result.contains("kind"), is(true));
        assertThat(result.contains("metadata"), is(true));
        assertThat(result.contains("items"), is(true));
    }
}

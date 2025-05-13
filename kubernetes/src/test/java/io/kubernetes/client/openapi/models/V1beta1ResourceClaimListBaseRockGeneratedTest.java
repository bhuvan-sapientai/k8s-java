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
import io.kubernetes.client.openapi.models.V1beta1ResourceClaim;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
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
class V1beta1ResourceClaimListBaseRockGeneratedTest {

    private V1beta1ResourceClaimList resourceClaimList;

    @BeforeEach
    void setUp() {
        resourceClaimList = new V1beta1ResourceClaimList();
    }

    //BaseRock generated method id: ${testV1beta1ResourceClaimListImplementsKubernetesListObject}, hash: 5D58DB866D1D428DA87379B21B53885B
    @Test
    void testV1beta1ResourceClaimListImplementsKubernetesListObject() {
        assertThat(resourceClaimList, is(notNullValue()));
        assertThat(resourceClaimList instanceof KubernetesListObject, is(true));
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 07EC4CA0C3FEB1B7CCFEED124171BF22
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1beta1";
        resourceClaimList.setApiVersion(apiVersion);
        assertEquals(apiVersion, resourceClaimList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: 4EB6774660659AA1073C7324C57F0A0E
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1beta1";
        resourceClaimList.setApiVersion(apiVersion);
        assertThat(resourceClaimList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testGetItems}, hash: 52783C83D931950142274477484F9A67
    @Test
    void testGetItems() {
        List<V1beta1ResourceClaim> items = new ArrayList<>();
        items.add(mock(V1beta1ResourceClaim.class));
        resourceClaimList.setItems(items);
        assertEquals(items, resourceClaimList.getItems());
    }

    //BaseRock generated method id: ${testSetItems}, hash: 49AA7FF28BC88C0E12E68111900BCD41
    @Test
    void testSetItems() {
        List<V1beta1ResourceClaim> items = new ArrayList<>();
        items.add(mock(V1beta1ResourceClaim.class));
        resourceClaimList.setItems(items);
        assertThat(resourceClaimList.getItems(), is(equalTo(items)));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 9AAAA9CA51D864D5F0A3DA345464A161
    @Test
    void testGetKind() {
        String kind = "ResourceClaimList";
        resourceClaimList.setKind(kind);
        assertEquals(kind, resourceClaimList.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: 1356347D36D3EC0709F2B0519D3FAAC2
    @Test
    void testSetKind() {
        String kind = "ResourceClaimList";
        resourceClaimList.setKind(kind);
        assertThat(resourceClaimList.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: CD26CADDCC017D8566CB78505DA41196
    @Test
    void testGetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        resourceClaimList.setMetadata(metadata);
        assertEquals(metadata, resourceClaimList.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: CAA36DBFF19283CC21736B3497B07DCE
    @Test
    void testSetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        resourceClaimList.setMetadata(metadata);
        assertThat(resourceClaimList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: E817810D766F54FE784F2A436B05E27F
    @Test
    void testEquals() {
        V1beta1ResourceClaimList other = new V1beta1ResourceClaimList();
        other.setApiVersion("v1beta1");
        other.setKind("ResourceClaimList");
        other.setItems(new ArrayList<>());
        V1ListMeta metadata = mock(V1ListMeta.class);
        other.setMetadata(metadata);
        resourceClaimList.setApiVersion("v1beta1");
        resourceClaimList.setKind("ResourceClaimList");
        resourceClaimList.setItems(new ArrayList<>());
        resourceClaimList.setMetadata(metadata);
        assertThat(resourceClaimList.equals(other), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: D0B55AAB1D974719F731FDDEB8D0A07F
    @Test
    void testHashCode() {
        V1beta1ResourceClaimList other = new V1beta1ResourceClaimList();
        other.setApiVersion("v1beta1");
        other.setKind("ResourceClaimList");
        other.setItems(new ArrayList<>());
        V1ListMeta metadata = mock(V1ListMeta.class);
        other.setMetadata(metadata);
        resourceClaimList.setApiVersion("v1beta1");
        resourceClaimList.setKind("ResourceClaimList");
        resourceClaimList.setItems(new ArrayList<>());
        resourceClaimList.setMetadata(metadata);
        assertThat(resourceClaimList.hashCode(), is(equalTo(other.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 37AEF262E5C88E7DDB605EE749E7870C
    @Test
    void testToString() {
        resourceClaimList.setApiVersion("v1beta1");
        resourceClaimList.setKind("ResourceClaimList");
        resourceClaimList.setItems(new ArrayList<>());
        V1ListMeta metadata = mock(V1ListMeta.class);
        when(metadata.toString()).thenReturn("V1ListMeta()");
        resourceClaimList.setMetadata(metadata);
        String expected = "class V1beta1ResourceClaimList {\n" + "    apiVersion: v1beta1\n" + "    items: []\n" + "    kind: ResourceClaimList\n" + "    metadata: V1ListMeta()\n" + "}";
        assertThat(resourceClaimList.toString(), is(equalTo(expected)));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: B8FE6BF0D6A27FBEA7A3F404E582794D
    @Test
    void testAddItemsItem() {
        V1beta1ResourceClaim item = mock(V1beta1ResourceClaim.class);
        resourceClaimList.addItemsItem(item);
        assertNotNull(resourceClaimList.getItems());
        assertThat(resourceClaimList.getItems().size(), is(1));
        assertThat(resourceClaimList.getItems().get(0), is(equalTo(item)));
    }
}

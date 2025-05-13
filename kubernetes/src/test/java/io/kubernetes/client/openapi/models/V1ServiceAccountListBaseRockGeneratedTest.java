package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1ServiceAccount;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class V1ServiceAccountListBaseRockGeneratedTest {

    @Mock
    private V1ListMeta mockMetadata;

    @Mock
    private V1ServiceAccount mockServiceAccount;

    //BaseRock generated method id: ${testConstructor}, hash: B0918D110FECE3D2F70BC3851D00D8F4
    @Test
    void testConstructor() {
        V1ServiceAccountList serviceAccountList = new V1ServiceAccountList();
        assertNotNull(serviceAccountList);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 8CB6EA89F723FBA0243A6DDD45B5B81E
    @Test
    void testApiVersion() {
        V1ServiceAccountList serviceAccountList = new V1ServiceAccountList();
        String apiVersion = "v1";
        serviceAccountList.setApiVersion(apiVersion);
        assertEquals(apiVersion, serviceAccountList.getApiVersion());
    }

    //BaseRock generated method id: ${testApiVersionWithDifferentValues}, hash: 3F651FEFEEE0F786ACA9B2E77902F8FD
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "v1", "v2" })
    void testApiVersionWithDifferentValues(String apiVersion) {
        V1ServiceAccountList serviceAccountList = new V1ServiceAccountList();
        serviceAccountList.setApiVersion(apiVersion);
        assertEquals(apiVersion, serviceAccountList.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: 8FBF794E12FFABC3ED0B54AF61B7E2C9
    @Test
    void testItems() {
        V1ServiceAccountList serviceAccountList = new V1ServiceAccountList();
        List<V1ServiceAccount> items = new ArrayList<>();
        items.add(mockServiceAccount);
        serviceAccountList.setItems(items);
        assertEquals(items, serviceAccountList.getItems());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 2B438F094DC712B50F971BC191C0107B
    @Test
    void testAddItemsItem() {
        V1ServiceAccountList serviceAccountList = new V1ServiceAccountList();
        serviceAccountList.addItemsItem(mockServiceAccount);
        assertThat(serviceAccountList.getItems(), is(notNullValue()));
        assertThat(serviceAccountList.getItems().size(), is(1));
        assertThat(serviceAccountList.getItems().get(0), is(equalTo(mockServiceAccount)));
    }

    //BaseRock generated method id: ${testKind}, hash: 8B04C6224F6665A7B81B7A06B223214D
    @Test
    void testKind() {
        V1ServiceAccountList serviceAccountList = new V1ServiceAccountList();
        String kind = "ServiceAccountList";
        serviceAccountList.setKind(kind);
        assertEquals(kind, serviceAccountList.getKind());
    }

    //BaseRock generated method id: ${testKindWithDifferentValues}, hash: 77E28596AEBD93D0E1A2556B7D3ECCCA
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "ServiceAccountList", "OtherKind" })
    void testKindWithDifferentValues(String kind) {
        V1ServiceAccountList serviceAccountList = new V1ServiceAccountList();
        serviceAccountList.setKind(kind);
        assertEquals(kind, serviceAccountList.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: C5B4E63C557DD2BA9B365FE51E239C8E
    @Test
    void testMetadata() {
        V1ServiceAccountList serviceAccountList = new V1ServiceAccountList();
        serviceAccountList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, serviceAccountList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: D859677B01962ED8F11155791A74AD0D
    @Test
    void testEquals() {
        V1ServiceAccountList serviceAccountList1 = new V1ServiceAccountList().apiVersion("v1").kind("ServiceAccountList").metadata(mockMetadata);
        V1ServiceAccountList serviceAccountList2 = new V1ServiceAccountList().apiVersion("v1").kind("ServiceAccountList").metadata(mockMetadata);
        assertThat(serviceAccountList1.equals(serviceAccountList2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: B71828669DF808EC468B5094C6478239
    @Test
    void testHashCode() {
        V1ServiceAccountList serviceAccountList1 = new V1ServiceAccountList().apiVersion("v1").kind("ServiceAccountList").metadata(mockMetadata);
        V1ServiceAccountList serviceAccountList2 = new V1ServiceAccountList().apiVersion("v1").kind("ServiceAccountList").metadata(mockMetadata);
        assertThat(serviceAccountList1.hashCode(), is(equalTo(serviceAccountList2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 76941EFB731A6B281170AFA0258CC3E4
    @Test
    void testToString() {
        V1ServiceAccountList serviceAccountList = new V1ServiceAccountList().apiVersion("v1").kind("ServiceAccountList").metadata(mockMetadata);
        String expectedString = "class V1ServiceAccountList {\n" + "    apiVersion: v1\n" + "    items: []\n" + "    kind: ServiceAccountList\n" + "    metadata: " + mockMetadata + "\n" + "}";
        assertThat(serviceAccountList.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: 913718BDD38E0A8B7D0686DA2DE8548D
    @Test
    void testSetApiVersion() {
        V1ServiceAccountList serviceAccountList = new V1ServiceAccountList();
        serviceAccountList.setApiVersion("v1");
        assertThat(serviceAccountList.getApiVersion(), is("v1"));
    }

    //BaseRock generated method id: ${testSetItems}, hash: B4D9D80E333FEA8F277E2D71446EC112
    @Test
    void testSetItems() {
        V1ServiceAccountList serviceAccountList = new V1ServiceAccountList();
        List<V1ServiceAccount> items = new ArrayList<>();
        items.add(mockServiceAccount);
        serviceAccountList.setItems(items);
        assertThat(serviceAccountList.getItems(), is(items));
    }

    //BaseRock generated method id: ${testSetKind}, hash: 31D9124B04C705D079331B073A18917B
    @Test
    void testSetKind() {
        V1ServiceAccountList serviceAccountList = new V1ServiceAccountList();
        serviceAccountList.setKind("ServiceAccountList");
        assertThat(serviceAccountList.getKind(), is("ServiceAccountList"));
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: 71680DCA179AC1D00BA15DC7A473AB53
    @Test
    void testSetMetadata() {
        V1ServiceAccountList serviceAccountList = new V1ServiceAccountList();
        serviceAccountList.setMetadata(mockMetadata);
        assertThat(serviceAccountList.getMetadata(), is(mockMetadata));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 2AA8DF673FC0E3281BB2E1835EC8D610
    @Test
    void testBuilderPattern() {
        V1ServiceAccountList serviceAccountList = new V1ServiceAccountList().apiVersion("v1").addItemsItem(mockServiceAccount).kind("ServiceAccountList").metadata(mockMetadata);
        assertThat(serviceAccountList.getApiVersion(), is("v1"));
        assertThat(serviceAccountList.getItems().size(), is(1));
        assertThat(serviceAccountList.getItems().get(0), is(mockServiceAccount));
        assertThat(serviceAccountList.getKind(), is("ServiceAccountList"));
        assertThat(serviceAccountList.getMetadata(), is(mockMetadata));
    }

    //BaseRock generated method id: ${testNullChecks}, hash: 66EC825F10A179D2E4446B830871743C
    @Test
    void testNullChecks() {
        V1ServiceAccountList serviceAccountList = new V1ServiceAccountList();
        assertNotNull(serviceAccountList.getItems());
    }
}

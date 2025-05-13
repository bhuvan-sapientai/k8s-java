package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.openapi.models.V1RoleList;
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
import io.kubernetes.client.openapi.models.V1Role;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1RoleListBaseRockGeneratedTest {

    private V1RoleList v1RoleList;

    @BeforeEach
    void setUp() {
        v1RoleList = new V1RoleList();
    }

    //BaseRock generated method id: ${testV1RoleListConstructor}, hash: 0FDDBDB07C5CC986D28BD96227D7E437
    @Test
    void testV1RoleListConstructor() {
        assertNotNull(v1RoleList);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 269642676B9369995EE797F4D060F277
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1RoleList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1RoleList.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: FDFF459B0B596F4EADEB7FF91E4CACD1
    @Test
    void testItems() {
        List<V1Role> items = new ArrayList<>();
        items.add(mock(V1Role.class));
        items.add(mock(V1Role.class));
        v1RoleList.setItems(items);
        assertThat(v1RoleList.getItems(), is(items));
        assertThat(v1RoleList.getItems(), hasSize(2));
    }

    //BaseRock generated method id: ${testKind}, hash: B48B6881C12364A195276B4227532E07
    @Test
    void testKind() {
        String kind = "RoleList";
        v1RoleList.setKind(kind);
        assertEquals(kind, v1RoleList.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 4679D7E7B1B39525E83C2D87EF7107D6
    @Test
    void testMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1RoleList.setMetadata(metadata);
        assertEquals(metadata, v1RoleList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: 1329DB67860934F143DD0440C3087B6C
    @Test
    void testEquals() {
        V1RoleList roleList1 = new V1RoleList();
        V1RoleList roleList2 = new V1RoleList();
        roleList1.setApiVersion("v1");
        roleList1.setKind("RoleList");
        roleList2.setApiVersion("v1");
        roleList2.setKind("RoleList");
        V1ListMeta metadata = mock(V1ListMeta.class);
        roleList1.setMetadata(metadata);
        roleList2.setMetadata(metadata);
        List<V1Role> items = new ArrayList<>();
        items.add(mock(V1Role.class));
        roleList1.setItems(items);
        roleList2.setItems(items);
        assertThat(roleList1, equalTo(roleList2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: B3ED8B9E2FDAD73CA578C4A22BC1AA7D
    @Test
    void testHashCode() {
        V1RoleList roleList1 = new V1RoleList();
        V1RoleList roleList2 = new V1RoleList();
        roleList1.setApiVersion("v1");
        roleList1.setKind("RoleList");
        roleList2.setApiVersion("v1");
        roleList2.setKind("RoleList");
        V1ListMeta metadata = mock(V1ListMeta.class);
        roleList1.setMetadata(metadata);
        roleList2.setMetadata(metadata);
        List<V1Role> items = new ArrayList<>();
        items.add(mock(V1Role.class));
        roleList1.setItems(items);
        roleList2.setItems(items);
        assertEquals(roleList1.hashCode(), roleList2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: FD8C372530FC978790687850DD8A29DD
    @Test
    void testToString() {
        v1RoleList.setApiVersion("v1");
        v1RoleList.setKind("RoleList");
        v1RoleList.setMetadata(mock(V1ListMeta.class));
        List<V1Role> items = new ArrayList<>();
        items.add(mock(V1Role.class));
        v1RoleList.setItems(items);
        String toString = v1RoleList.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("items"), is(true));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: FB88B50978F62817F94E3A54B8FF3AF7
    @Test
    void testAddItemsItem() {
        V1Role role = mock(V1Role.class);
        v1RoleList.addItemsItem(role);
        assertThat(v1RoleList.getItems(), hasSize(1));
        assertThat(v1RoleList.getItems().get(0), is(role));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: F01C4F84BE17FADE33C369FE3CA6B315
    @Test
    void testValidateJsonElement() {
        // This method is not directly testable as it's a static method in a different class.
        // We would need to use PowerMockito to mock static methods, which is out of scope for this test.
    }
}

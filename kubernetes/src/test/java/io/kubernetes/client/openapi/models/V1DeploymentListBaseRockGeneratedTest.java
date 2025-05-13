package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1Deployment;
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
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1DeploymentListBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1DeploymentListConstructor}, hash: 70EAECAED3467CB6B5D786FCC1142237
    @Test
    void testV1DeploymentListConstructor() {
        V1DeploymentList deploymentList = new V1DeploymentList();
        assertNotNull(deploymentList);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: EE68656A7D2F01065D0295E9D768F70E
    @Test
    void testApiVersion() {
        V1DeploymentList deploymentList = new V1DeploymentList();
        String apiVersion = "apps/v1";
        deploymentList.setApiVersion(apiVersion);
        assertEquals(apiVersion, deploymentList.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: 8D271EFD0D41874E8D6336468F029B88
    @Test
    void testItems() {
        V1DeploymentList deploymentList = new V1DeploymentList();
        List<V1Deployment> items = new ArrayList<>();
        items.add(mock(V1Deployment.class));
        items.add(mock(V1Deployment.class));
        deploymentList.setItems(items);
        assertThat(deploymentList.getItems(), hasSize(2));
    }

    //BaseRock generated method id: ${testKind}, hash: D95962F410AE32AF0361A1A958393C3F
    @Test
    void testKind() {
        V1DeploymentList deploymentList = new V1DeploymentList();
        String kind = "DeploymentList";
        deploymentList.setKind(kind);
        assertEquals(kind, deploymentList.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 4AC9843F8497C4817264B0E2061670E1
    @Test
    void testMetadata() {
        V1DeploymentList deploymentList = new V1DeploymentList();
        V1ListMeta metadata = mock(V1ListMeta.class);
        deploymentList.setMetadata(metadata);
        assertThat(deploymentList.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testEquals}, hash: 15A6369C3BE7A770B4BC29F12522D711
    @Test
    void testEquals() {
        V1ListMeta metadata1 = mock(V1ListMeta.class);
        V1ListMeta metadata2 = mock(V1ListMeta.class);
        List<V1Deployment> items1 = new ArrayList<>();
        List<V1Deployment> items2 = new ArrayList<>();
        V1DeploymentList list1 = new V1DeploymentList().apiVersion("apps/v1").kind("DeploymentList").metadata(metadata1).items(items1);
        V1DeploymentList list2 = new V1DeploymentList().apiVersion("apps/v1").kind("DeploymentList").metadata(metadata1).items(items1);
        assertThat(list1.equals(list2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 45D242AB746E1B920B99B641D3281ABF
    @Test
    void testHashCode() {
        V1DeploymentList list = new V1DeploymentList().apiVersion("apps/v1").kind("DeploymentList").metadata(mock(V1ListMeta.class));
        assertThat(list.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 6BCC31BD33E1017E0D13C79E277EC2C6
    @Test
    void testToString() {
        V1DeploymentList list = new V1DeploymentList().apiVersion("apps/v1").kind("DeploymentList").metadata(mock(V1ListMeta.class));
        String result = list.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("apiVersion"), is(true));
        assertThat(result.contains("kind"), is(true));
        assertThat(result.contains("metadata"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: A4A1CC6C0AEECBF7EBCB42A2FA1C9D71
    @Test
    void testBuilder() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        List<V1Deployment> items = new ArrayList<>();
        items.add(mock(V1Deployment.class));
        V1DeploymentList list = new V1DeploymentList().apiVersion("apps/v1").kind("DeploymentList").metadata(metadata).items(items);
        assertThat(list.getApiVersion(), equalTo("apps/v1"));
        assertThat(list.getKind(), equalTo("DeploymentList"));
        assertThat(list.getMetadata(), equalTo(metadata));
        assertThat(list.getItems(), equalTo(items));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: CD18F2DE01B51997B7172B8D5BE33D6C
    @Test
    void testAddItemsItem() {
        V1DeploymentList list = new V1DeploymentList();
        V1Deployment deployment = mock(V1Deployment.class);
        list.addItemsItem(deployment);
        assertThat(list.getItems(), hasSize(1));
        assertThat(list.getItems().get(0), equalTo(deployment));
    }

    //BaseRock generated method id: ${testSetApiVersionNull}, hash: 2A96A6509FE173FDDE20F2269DA5365E
    @Test
    void testSetApiVersionNull() {
        V1DeploymentList list = new V1DeploymentList();
        list.setApiVersion(null);
        assertThat(list.getApiVersion(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetKindNull}, hash: 6A9A9E25804F7357B3E352D8DCC43321
    @Test
    void testSetKindNull() {
        V1DeploymentList list = new V1DeploymentList();
        list.setKind(null);
        assertThat(list.getKind(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetMetadataNull}, hash: E9FD47585758A98B9B1DCD4FE4661A3F
    @Test
    void testSetMetadataNull() {
        V1DeploymentList list = new V1DeploymentList();
        list.setMetadata(null);
        assertThat(list.getMetadata(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetItemsNull}, hash: AD0E6F44A4BE601BB7E3550A9458EC0D
    @Test
    void testSetItemsNull() {
        V1DeploymentList list = new V1DeploymentList();
        list.setItems(null);
        assertThat(list.getItems(), is(nullValue()));
    }
}

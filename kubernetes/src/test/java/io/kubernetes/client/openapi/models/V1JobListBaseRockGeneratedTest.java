package io.kubernetes.client.openapi.models;

import io.kubernetes.client.common.KubernetesObject;
import java.util.List;
import com.google.gson.Gson;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import com.google.gson.JsonObject;
import io.kubernetes.client.common.KubernetesListObject;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import com.google.gson.JsonElement;
import io.kubernetes.client.openapi.JSON;
import com.google.gson.JsonArray;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1JobListBaseRockGeneratedTest {

    @Mock
    private V1ListMeta mockMetadata;

    @Mock
    private V1Job mockJob;

    private V1JobList jobList;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        jobList = new V1JobList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 7B5814598E923A162270934F31BB665F
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1";
        jobList.setApiVersion(apiVersion);
        assertEquals(apiVersion, jobList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: 0F3AA10B8AF3464FCD5863900BB554FB
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1";
        jobList.setApiVersion(apiVersion);
        assertEquals(apiVersion, jobList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetItems}, hash: 91B10D9A71C67695A384287F22030337
    @Test
    void testGetItems() {
        List<V1Job> items = new ArrayList<>();
        items.add(mockJob);
        jobList.setItems(items);
        assertEquals(items, jobList.getItems());
    }

    //BaseRock generated method id: ${testSetItems}, hash: 81806F2772D8535D5985C481183DDD5C
    @Test
    void testSetItems() {
        List<V1Job> items = new ArrayList<>();
        items.add(mockJob);
        jobList.setItems(items);
        assertEquals(items, jobList.getItems());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 4692AE69802499DEA3E8056AE0B55D41
    @Test
    void testAddItemsItem() {
        jobList.addItemsItem(mockJob);
        assertEquals(1, jobList.getItems().size());
        assertEquals(mockJob, jobList.getItems().get(0));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 51CD52E64C793CC741E9063DD2DA7BB2
    @Test
    void testGetKind() {
        String kind = "JobList";
        jobList.setKind(kind);
        assertEquals(kind, jobList.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: 61AB236A6BC1EFBEFE1CEAC8FAE81037
    @Test
    void testSetKind() {
        String kind = "JobList";
        jobList.setKind(kind);
        assertEquals(kind, jobList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: BB7766E86E038A632D016114DB8FCE61
    @Test
    void testGetMetadata() {
        jobList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, jobList.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: 921F93C2BE10DBA22642CEE4A70CE599
    @Test
    void testSetMetadata() {
        jobList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, jobList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: AD79E3DB4D7878D964AE48B50A359C50
    @Test
    void testEquals() {
        V1JobList jobList1 = new V1JobList().apiVersion("v1").kind("JobList").metadata(mockMetadata);
        V1JobList jobList2 = new V1JobList().apiVersion("v1").kind("JobList").metadata(mockMetadata);
        assertEquals(jobList1, jobList2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 75626EA0CFA91C855D6F53F9C007FFB4
    @Test
    void testHashCode() {
        V1JobList jobList1 = new V1JobList().apiVersion("v1").kind("JobList").metadata(mockMetadata);
        V1JobList jobList2 = new V1JobList().apiVersion("v1").kind("JobList").metadata(mockMetadata);
        assertEquals(jobList1.hashCode(), jobList2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: AD2E10A22C86E090DD733984063BE6E4
    @Test
    void testToString() {
        jobList.setApiVersion("v1");
        jobList.setKind("JobList");
        jobList.setMetadata(mockMetadata);
        String expected = "class V1JobList {\n    apiVersion: v1\n    items: []\n    kind: JobList\n    metadata: " + mockMetadata + "\n}";
        assertEquals(expected, jobList.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: ACEBE5D583BCAA62756255E8B3682371
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty("apiVersion", "v1");
        jsonObj.addProperty("kind", "JobList");
        JsonArray itemsArray = new JsonArray();
        itemsArray.add(new JsonObject());
        jsonObj.add("items", itemsArray);
        try (MockedStatic<V1Job> mockedV1Job = mockStatic(V1Job.class);
            MockedStatic<V1ListMeta> mockedV1ListMeta = mockStatic(V1ListMeta.class)) {
            V1JobList.validateJsonElement(jsonObj);
            mockedV1Job.verify(() -> V1Job.validateJsonElement(any(JsonElement.class)));
            mockedV1ListMeta.verify(() -> V1ListMeta.validateJsonElement(any(JsonElement.class)), never());
        }
    }

    //BaseRock generated method id: ${testFromJson}, hash: 52128F08EE6D7989508151A508D0D1CA
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"JobList\",\"items\":[{}]}";
        try (MockedStatic<JSON> mockedJSON = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            when(JSON.getGson()).thenReturn(mockGson);
            when(mockGson.fromJson(json, V1JobList.class)).thenReturn(new V1JobList());
            V1JobList result = V1JobList.fromJson(json);
            assertNotNull(result);
            verify(mockGson).fromJson(json, V1JobList.class);
        }
    }

    //BaseRock generated method id: ${testToJson}, hash: FD54016EE7852ECD8CBC18497D2A330D
    @Test
    void testToJson() {
        V1JobList jobList = new V1JobList();
        try (MockedStatic<JSON> mockedJSON = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            when(JSON.getGson()).thenReturn(mockGson);
            when(mockGson.toJson(jobList)).thenReturn("{}");
            String result = jobList.toJson();
            assertEquals("{}", result);
            verify(mockGson).toJson(jobList);
        }
    }

    //BaseRock generated method id: ${testImplementsKubernetesListObject}, hash: A7ED5A6541267870AAEF15D11BA3B0F1
    @Test
    void testImplementsKubernetesListObject() {
        assertTrue(jobList instanceof KubernetesListObject);
    }
}

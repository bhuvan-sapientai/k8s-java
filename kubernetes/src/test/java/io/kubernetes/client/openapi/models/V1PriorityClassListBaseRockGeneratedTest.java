package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1PriorityClass;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PriorityClassListBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1PriorityClassListConstructor}, hash: 2E50F642D81F411B8C0972F80D064261
    @Test
    void testV1PriorityClassListConstructor() {
        V1PriorityClassList priorityClassList = new V1PriorityClassList();
        assertThat(priorityClassList, is(notNullValue()));
    }

    //BaseRock generated method id: ${testApiVersion}, hash: E41FEF5D407D228D1FF65319BD5F6095
    @Test
    void testApiVersion() {
        V1PriorityClassList priorityClassList = new V1PriorityClassList();
        String apiVersion = "v1";
        priorityClassList.setApiVersion(apiVersion);
        assertThat(priorityClassList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testItems}, hash: 8B24D89CB6F33994E02D5D7E0D217000
    @Test
    void testItems() {
        V1PriorityClassList priorityClassList = new V1PriorityClassList();
        List<V1PriorityClass> items = new ArrayList<>();
        V1PriorityClass priorityClass = mock(V1PriorityClass.class);
        items.add(priorityClass);
        priorityClassList.setItems(items);
        assertThat(priorityClassList.getItems(), hasSize(1));
        assertThat(priorityClassList.getItems().get(0), is(equalTo(priorityClass)));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: B89205A84893A4EAE06B0AEBBD72DC27
    @Test
    void testAddItemsItem() {
        V1PriorityClassList priorityClassList = new V1PriorityClassList();
        V1PriorityClass priorityClass = mock(V1PriorityClass.class);
        priorityClassList.addItemsItem(priorityClass);
        assertThat(priorityClassList.getItems(), hasSize(1));
        assertThat(priorityClassList.getItems().get(0), is(equalTo(priorityClass)));
    }

    //BaseRock generated method id: ${testKind}, hash: 048A4D987D6F774E720CF76068496A33
    @Test
    void testKind() {
        V1PriorityClassList priorityClassList = new V1PriorityClassList();
        String kind = "PriorityClassList";
        priorityClassList.setKind(kind);
        assertThat(priorityClassList.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testMetadata}, hash: 20AA7C34A7DA5E38B66C123A41BC27DC
    @Test
    void testMetadata() {
        V1PriorityClassList priorityClassList = new V1PriorityClassList();
        V1ListMeta metadata = mock(V1ListMeta.class);
        priorityClassList.setMetadata(metadata);
        assertThat(priorityClassList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: C04B2D76500E193E8FFC720BE3C30150
    @Test
    void testEquals() {
        V1PriorityClassList priorityClassList1 = new V1PriorityClassList().apiVersion("v1").kind("PriorityClassList");
        V1PriorityClassList priorityClassList2 = new V1PriorityClassList().apiVersion("v1").kind("PriorityClassList");
        assertThat(priorityClassList1.equals(priorityClassList2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 21B6B8E196ECEC9D83E4E10AD8C4484C
    @Test
    void testHashCode() {
        V1PriorityClassList priorityClassList = new V1PriorityClassList().apiVersion("v1").kind("PriorityClassList");
        int hashCode = priorityClassList.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 163B31D933925B9BD020C1BE8D460801
    @Test
    void testToString() {
        V1PriorityClassList priorityClassList = new V1PriorityClassList().apiVersion("v1").kind("PriorityClassList");
        String toString = priorityClassList.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
    }
}

package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ManagedFieldsEntry;
import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ManagedFieldsEntryBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1ManagedFieldsEntryConstructor}, hash: 1073803F16DEBC282B09CAC81A78489B
    @Test
    void testV1ManagedFieldsEntryConstructor() {
        V1ManagedFieldsEntry entry = new V1ManagedFieldsEntry();
        assertNotNull(entry);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 054703DD30F46A0006F8CE9E5BDF2AF5
    @Test
    void testApiVersion() {
        V1ManagedFieldsEntry entry = new V1ManagedFieldsEntry();
        String apiVersion = "v1";
        entry.setApiVersion(apiVersion);
        assertEquals(apiVersion, entry.getApiVersion());
    }

    //BaseRock generated method id: ${testFieldsType}, hash: 4C564E345D2113B39169BAE59E0F99D6
    @Test
    void testFieldsType() {
        V1ManagedFieldsEntry entry = new V1ManagedFieldsEntry();
        String fieldsType = "FieldsV1";
        entry.setFieldsType(fieldsType);
        assertEquals(fieldsType, entry.getFieldsType());
    }

    //BaseRock generated method id: ${testFieldsV1}, hash: 8D788D5041F66D44015B58057F9BADF8
    @Test
    void testFieldsV1() {
        V1ManagedFieldsEntry entry = new V1ManagedFieldsEntry();
        Object fieldsV1 = new Object();
        entry.setFieldsV1(fieldsV1);
        assertEquals(fieldsV1, entry.getFieldsV1());
    }

    //BaseRock generated method id: ${testManager}, hash: BD447B2728D7DEB4188047D0EE43BA38
    @Test
    void testManager() {
        V1ManagedFieldsEntry entry = new V1ManagedFieldsEntry();
        String manager = "kubectl";
        entry.setManager(manager);
        assertEquals(manager, entry.getManager());
    }

    //BaseRock generated method id: ${testOperation}, hash: E25497AA3A5438CB4C8DEAB962A16F0D
    @Test
    void testOperation() {
        V1ManagedFieldsEntry entry = new V1ManagedFieldsEntry();
        String operation = "Apply";
        entry.setOperation(operation);
        assertEquals(operation, entry.getOperation());
    }

    //BaseRock generated method id: ${testSubresource}, hash: 38CD658064593946E568E1593F2AF639
    @Test
    void testSubresource() {
        V1ManagedFieldsEntry entry = new V1ManagedFieldsEntry();
        String subresource = "status";
        entry.setSubresource(subresource);
        assertEquals(subresource, entry.getSubresource());
    }

    //BaseRock generated method id: ${testTime}, hash: 2518D5C2A8113CA4E83F919CB2412A28
    @Test
    void testTime() {
        V1ManagedFieldsEntry entry = new V1ManagedFieldsEntry();
        OffsetDateTime time = OffsetDateTime.now();
        entry.setTime(time);
        assertEquals(time, entry.getTime());
    }

    //BaseRock generated method id: ${testEquals}, hash: 0C9828823B007081B1FC31F44ADA9B05
    @Test
    void testEquals() {
        V1ManagedFieldsEntry entry1 = new V1ManagedFieldsEntry().apiVersion("v1").fieldsType("FieldsV1").fieldsV1(new Object()).manager("kubectl").operation("Apply").subresource("status").time(OffsetDateTime.now());
        V1ManagedFieldsEntry entry2 = new V1ManagedFieldsEntry().apiVersion("v1").fieldsType("FieldsV1").fieldsV1(entry1.getFieldsV1()).manager("kubectl").operation("Apply").subresource("status").time(entry1.getTime());
        assertThat(entry1, is(equalTo(entry2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 647F2831B78E8E64E4E58C079412D720
    @Test
    void testHashCode() {
        V1ManagedFieldsEntry entry1 = new V1ManagedFieldsEntry().apiVersion("v1").fieldsType("FieldsV1").fieldsV1(new Object()).manager("kubectl").operation("Apply").subresource("status").time(OffsetDateTime.now());
        V1ManagedFieldsEntry entry2 = new V1ManagedFieldsEntry().apiVersion("v1").fieldsType("FieldsV1").fieldsV1(entry1.getFieldsV1()).manager("kubectl").operation("Apply").subresource("status").time(entry1.getTime());
        assertThat(entry1.hashCode(), is(equalTo(entry2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 7115F1D1B8958E9466631456586BEA67
    @Test
    void testToString() {
        V1ManagedFieldsEntry entry = new V1ManagedFieldsEntry().apiVersion("v1").fieldsType("FieldsV1").fieldsV1(new Object()).manager("kubectl").operation("Apply").subresource("status").time(OffsetDateTime.now());
        String toString = entry.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("fieldsType"), is(true));
        assertThat(toString.contains("fieldsV1"), is(true));
        assertThat(toString.contains("manager"), is(true));
        assertThat(toString.contains("operation"), is(true));
        assertThat(toString.contains("subresource"), is(true));
        assertThat(toString.contains("time"), is(true));
    }
}

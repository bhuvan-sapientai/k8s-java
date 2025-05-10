package io.kubernetes.client.extended.controller.reconciler;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import io.kubernetes.client.extended.controller.reconciler.Request;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class RequestBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructorWithNameOnly}, hash: 0545E15AEC41CD6F0E380E9557FCB87C
    @Test
    void testConstructorWithNameOnly() {
        Request request = new Request("test-name");
        assertThat(request.getName(), is("test-name"));
        assertThat(request.getNamespace(), is(nullValue()));
    }

    //BaseRock generated method id: ${testConstructorWithNameAndNamespace}, hash: 17BC3CF12FB8C39ABC4716A47FED6717
    @Test
    void testConstructorWithNameAndNamespace() {
        Request request = new Request("test-namespace", "test-name");
        assertThat(request.getName(), is("test-name"));
        assertThat(request.getNamespace(), is("test-namespace"));
    }

    //BaseRock generated method id: ${testGetSetNamespace}, hash: A3025A7787924E050F1E07F8C277EF57
    @Test
    void testGetSetNamespace() {
        Request request = new Request("test-name");
        assertThat(request.getNamespace(), is(nullValue()));
        request.setNamespace("new-namespace");
        assertThat(request.getNamespace(), is("new-namespace"));
    }

    //BaseRock generated method id: ${testGetSetName}, hash: 94BC2B6FB546AE6EA24A7623040EB077
    @Test
    void testGetSetName() {
        Request request = new Request("test-name");
        assertThat(request.getName(), is("test-name"));
        request.setName("new-name");
        assertThat(request.getName(), is("new-name"));
    }

    //BaseRock generated method id: ${testToString}, hash: 06B4D38ED2DA35A863C8AF9056DD0EC6
    @Test
    void testToString() {
        Request request = new Request("test-namespace", "test-name");
        String expected = "Request{name='test-name', namespace='test-namespace'}";
        assertThat(request.toString(), is(expected));
    }

    //BaseRock generated method id: ${testEquals}, hash: 224316581C922625572C597E71FCEAF8
    @ParameterizedTest
    @CsvSource({ "namespace1,name1,namespace1,name1,true", "namespace1,name1,namespace2,name1,false", "namespace1,name1,namespace1,name2,false", "namespace1,name1,namespace2,name2,false", ",name1,,name1,true", ",name1,namespace1,name1,false", "namespace1,name1,,name1,false" })
    void testEquals(String namespace1, String name1, String namespace2, String name2, boolean expectedResult) {
        Request request1 = new Request(namespace1, name1);
        Request request2 = new Request(namespace2, name2);
        assertEquals(expectedResult, request1.equals(request2));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: 37B0494398F2BEB27E8E4B55950A1E6B
    @Test
    void testEqualsWithNull() {
        Request request = new Request("namespace", "name");
        assertNotEquals(null, request);
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 40DB0497A68C72494422D1DB73A47790
    @Test
    void testEqualsWithDifferentClass() {
        Request request = new Request("namespace", "name");
        assertNotEquals("not a request", request);
    }

    //BaseRock generated method id: ${testHashCode}, hash: C28BBCAAD6F2A7F0AA936D6973A05329
    @Test
    void testHashCode() {
        Request request1 = new Request("namespace", "name");
        Request request2 = new Request("namespace", "name");
        Request request3 = new Request("different", "different");
        assertEquals(request1.hashCode(), request2.hashCode());
        assertNotEquals(request1.hashCode(), request3.hashCode());
    }

    //BaseRock generated method id: ${testHashCodeWithNullValues}, hash: A694F2FD580B9AB43F7E73DA2DC27E58
    @Test
    void testHashCodeWithNullValues() {
        Request request1 = new Request(null, null);
        Request request2 = new Request(null, null);
        assertEquals(request1.hashCode(), request2.hashCode());
    }

    //BaseRock generated method id: ${testInstantiation}, hash: 264AB552788CE38471618CF6BFF1C9BB
    @Test
    void testInstantiation() {
        Request request = new Request("test-namespace", "test-name");
        assertThat(request, is(notNullValue()));
    }
}

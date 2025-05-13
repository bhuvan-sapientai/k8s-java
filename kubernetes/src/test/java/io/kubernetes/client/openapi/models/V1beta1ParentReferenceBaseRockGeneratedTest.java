package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.models.V1beta1ParentReference;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1beta1ParentReferenceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1beta1ParentReferenceConstructor}, hash: C5D4576035D14F1C6EC4F90FC992C9F3
    @Test
    void testV1beta1ParentReferenceConstructor() {
        V1beta1ParentReference parentReference = new V1beta1ParentReference();
        assertThat(parentReference, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetGroup}, hash: 7C3B8731709D011ADBC47EADE0165912
    @Test
    void testSetAndGetGroup() {
        V1beta1ParentReference parentReference = new V1beta1ParentReference();
        String group = "testGroup";
        parentReference.setGroup(group);
        assertThat(parentReference.getGroup(), is(equalTo(group)));
    }

    //BaseRock generated method id: ${testSetAndGetName}, hash: EF9C20254066C13F6F8C65F55A2656BC
    @Test
    void testSetAndGetName() {
        V1beta1ParentReference parentReference = new V1beta1ParentReference();
        String name = "testName";
        parentReference.setName(name);
        assertThat(parentReference.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testSetAndGetNamespace}, hash: A83849DED155AE79AA47BAF7409758E7
    @Test
    void testSetAndGetNamespace() {
        V1beta1ParentReference parentReference = new V1beta1ParentReference();
        String namespace = "testNamespace";
        parentReference.setNamespace(namespace);
        assertThat(parentReference.getNamespace(), is(equalTo(namespace)));
    }

    //BaseRock generated method id: ${testSetAndGetResource}, hash: 9CE1B6D86B21A0C349E144BB81C526AC
    @Test
    void testSetAndGetResource() {
        V1beta1ParentReference parentReference = new V1beta1ParentReference();
        String resource = "testResource";
        parentReference.setResource(resource);
        assertThat(parentReference.getResource(), is(equalTo(resource)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 635199853DCF97E5DE441D9838CB9BA9
    @Test
    void testEquals() {
        V1beta1ParentReference ref1 = new V1beta1ParentReference().group("group1").name("name1").namespace("namespace1").resource("resource1");
        V1beta1ParentReference ref2 = new V1beta1ParentReference().group("group1").name("name1").namespace("namespace1").resource("resource1");
        assertThat(ref1.equals(ref2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 61D30B30213DE56BE140EE64519EFAEF
    @Test
    void testHashCode() {
        V1beta1ParentReference ref1 = new V1beta1ParentReference().group("group1").name("name1").namespace("namespace1").resource("resource1");
        V1beta1ParentReference ref2 = new V1beta1ParentReference().group("group1").name("name1").namespace("namespace1").resource("resource1");
        assertThat(ref1.hashCode(), is(equalTo(ref2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: A518257DDB97F1EF3E4174C47A13EF41
    @Test
    void testToString() {
        V1beta1ParentReference parentReference = new V1beta1ParentReference().group("testGroup").name("testName").namespace("testNamespace").resource("testResource");
        String expected = "class V1beta1ParentReference {\n" + "    group: testGroup\n" + "    name: testName\n" + "    namespace: testNamespace\n" + "    resource: testResource\n" + "}";
        assertThat(parentReference.toString(), is(equalTo(expected)));
    }

    //BaseRock generated method id: ${testGroupParameterized}, hash: 487FF6B27E4C538DD4CEF0D02B470E92
    @ParameterizedTest
    @ValueSource(strings = { "group1", "group2", "" })
    void testGroupParameterized(String group) {
        V1beta1ParentReference parentReference = new V1beta1ParentReference().group(group);
        assertThat(parentReference.getGroup(), is(equalTo(group)));
    }

    //BaseRock generated method id: ${testNullGroup}, hash: 3B644B7DD6AE63AE8DE71DCDBFF5D198
    @Test
    void testNullGroup() {
        V1beta1ParentReference parentReference = new V1beta1ParentReference().group(null);
        assertThat(parentReference.getGroup(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testRequiredFields}, hash: BD451C2684B0CB4E1682FC770318841D
    @Disabled()
    @Test
    void testRequiredFields() {
        V1beta1ParentReference parentReference = new V1beta1ParentReference();
        assertThrows(NullPointerException.class, () -> parentReference.name(null));
        assertThrows(NullPointerException.class, () -> parentReference.resource(null));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 63F7F2AC2A9CB987A65A73C27FF76BF4
    @Test
    void testBuilderPattern() {
        V1beta1ParentReference parentReference = new V1beta1ParentReference().group("testGroup").name("testName").namespace("testNamespace").resource("testResource");
        assertThat(parentReference.getGroup(), is(equalTo("testGroup")));
        assertThat(parentReference.getName(), is(equalTo("testName")));
        assertThat(parentReference.getNamespace(), is(equalTo("testNamespace")));
        assertThat(parentReference.getResource(), is(equalTo("testResource")));
    }
}

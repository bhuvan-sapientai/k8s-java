package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1LabelSelectorAttributes;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1FieldSelectorAttributes;
import io.kubernetes.client.openapi.models.V1ResourceAttributes;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ResourceAttributesBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 1ED21EAB8EFD64AAA8B35B0A9D71C361
    @Test
    void testConstructor() {
        V1ResourceAttributes attributes = new V1ResourceAttributes();
        assertNotNull(attributes);
    }

    //BaseRock generated method id: ${testFieldSelector}, hash: D7B6F02351892F7D19A9FF4121F8730E
    @Test
    void testFieldSelector() {
        V1ResourceAttributes attributes = new V1ResourceAttributes();
        V1FieldSelectorAttributes fieldSelector = new V1FieldSelectorAttributes();
        attributes.setFieldSelector(fieldSelector);
        assertEquals(fieldSelector, attributes.getFieldSelector());
    }

    //BaseRock generated method id: ${testGroup}, hash: CD0E70C83156C4FFD1F16978CCFC30B5
    @Test
    void testGroup() {
        V1ResourceAttributes attributes = new V1ResourceAttributes();
        String group = "test-group";
        attributes.setGroup(group);
        assertEquals(group, attributes.getGroup());
    }

    //BaseRock generated method id: ${testLabelSelector}, hash: C522DBC33104F6E53AD2B2D98F4D0E46
    @Test
    void testLabelSelector() {
        V1ResourceAttributes attributes = new V1ResourceAttributes();
        V1LabelSelectorAttributes labelSelector = new V1LabelSelectorAttributes();
        attributes.setLabelSelector(labelSelector);
        assertEquals(labelSelector, attributes.getLabelSelector());
    }

    //BaseRock generated method id: ${testName}, hash: A7E7C9E3F9BBFD72F241A8AEDD6C74AB
    @Test
    void testName() {
        V1ResourceAttributes attributes = new V1ResourceAttributes();
        String name = "test-name";
        attributes.setName(name);
        assertEquals(name, attributes.getName());
    }

    //BaseRock generated method id: ${testNamespace}, hash: 8AA4C117104DE0949947E4F14C57BBB7
    @Test
    void testNamespace() {
        V1ResourceAttributes attributes = new V1ResourceAttributes();
        String namespace = "test-namespace";
        attributes.setNamespace(namespace);
        assertEquals(namespace, attributes.getNamespace());
    }

    //BaseRock generated method id: ${testResource}, hash: 24B1F75405F4534204F38E30E80B1499
    @Test
    void testResource() {
        V1ResourceAttributes attributes = new V1ResourceAttributes();
        String resource = "test-resource";
        attributes.setResource(resource);
        assertEquals(resource, attributes.getResource());
    }

    //BaseRock generated method id: ${testSubresource}, hash: DFECFA8ED08DF6929A561CD49F4CAF3F
    @Test
    void testSubresource() {
        V1ResourceAttributes attributes = new V1ResourceAttributes();
        String subresource = "test-subresource";
        attributes.setSubresource(subresource);
        assertEquals(subresource, attributes.getSubresource());
    }

    //BaseRock generated method id: ${testVerb}, hash: 55106562D70A131D238C8AC97503B7DA
    @Test
    void testVerb() {
        V1ResourceAttributes attributes = new V1ResourceAttributes();
        String verb = "test-verb";
        attributes.setVerb(verb);
        assertEquals(verb, attributes.getVerb());
    }

    //BaseRock generated method id: ${testVersion}, hash: 458F01269B876E8050502907D30D5A54
    @Test
    void testVersion() {
        V1ResourceAttributes attributes = new V1ResourceAttributes();
        String version = "test-version";
        attributes.setVersion(version);
        assertEquals(version, attributes.getVersion());
    }

    //BaseRock generated method id: ${testEquals}, hash: 5A3BC00EB6FAEC433B91DBFD5AF865CD
    @Test
    void testEquals() {
        V1ResourceAttributes attributes1 = new V1ResourceAttributes().fieldSelector(new V1FieldSelectorAttributes()).group("group").labelSelector(new V1LabelSelectorAttributes()).name("name").namespace("namespace").resource("resource").subresource("subresource").verb("verb").version("version");
        V1ResourceAttributes attributes2 = new V1ResourceAttributes().fieldSelector(new V1FieldSelectorAttributes()).group("group").labelSelector(new V1LabelSelectorAttributes()).name("name").namespace("namespace").resource("resource").subresource("subresource").verb("verb").version("version");
        assertThat(attributes1, is(equalTo(attributes2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: B30DB77C1C7A937771470CF837070F46
    @Test
    void testHashCode() {
        V1ResourceAttributes attributes = new V1ResourceAttributes().fieldSelector(new V1FieldSelectorAttributes()).group("group").labelSelector(new V1LabelSelectorAttributes()).name("name").namespace("namespace").resource("resource").subresource("subresource").verb("verb").version("version");
        assertThat(attributes.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 29CA48DA4B004B13164D77131FD67A20
    @Test
    void testToString() {
        V1ResourceAttributes attributes = new V1ResourceAttributes().fieldSelector(new V1FieldSelectorAttributes()).group("group").labelSelector(new V1LabelSelectorAttributes()).name("name").namespace("namespace").resource("resource").subresource("subresource").verb("verb").version("version");
        String toString = attributes.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("fieldSelector"), is(true));
        assertThat(toString.contains("group"), is(true));
        assertThat(toString.contains("labelSelector"), is(true));
        assertThat(toString.contains("name"), is(true));
        assertThat(toString.contains("namespace"), is(true));
        assertThat(toString.contains("resource"), is(true));
        assertThat(toString.contains("subresource"), is(true));
        assertThat(toString.contains("verb"), is(true));
        assertThat(toString.contains("version"), is(true));
    }
}

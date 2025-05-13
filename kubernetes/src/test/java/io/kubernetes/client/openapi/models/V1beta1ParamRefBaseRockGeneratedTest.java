package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1LabelSelector;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1beta1ParamRef;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1ParamRefBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 0479E0031DBEE8D758A58BAE527241DC
    @Test
    void testConstructor() {
        V1beta1ParamRef paramRef = new V1beta1ParamRef();
        assertNotNull(paramRef);
    }

    //BaseRock generated method id: ${testNameGetterAndSetter}, hash: 6A6107495C6B0F8882B888693FB44D57
    @Test
    void testNameGetterAndSetter() {
        V1beta1ParamRef paramRef = new V1beta1ParamRef();
        String name = "testName";
        paramRef.setName(name);
        assertEquals(name, paramRef.getName());
    }

    //BaseRock generated method id: ${testNamespaceGetterAndSetter}, hash: 1DBD5394B13BF7645F3BAED8B86E52E2
    @Test
    void testNamespaceGetterAndSetter() {
        V1beta1ParamRef paramRef = new V1beta1ParamRef();
        String namespace = "testNamespace";
        paramRef.setNamespace(namespace);
        assertEquals(namespace, paramRef.getNamespace());
    }

    //BaseRock generated method id: ${testParameterNotFoundActionGetterAndSetter}, hash: 5357ADF9AF2DCD84A139475BFB94E7DE
    @Test
    void testParameterNotFoundActionGetterAndSetter() {
        V1beta1ParamRef paramRef = new V1beta1ParamRef();
        String action = "Allow";
        paramRef.setParameterNotFoundAction(action);
        assertEquals(action, paramRef.getParameterNotFoundAction());
    }

    //BaseRock generated method id: ${testSelectorGetterAndSetter}, hash: D3872F4AC961670028843A4BEA5E92E8
    @Test
    void testSelectorGetterAndSetter() {
        V1beta1ParamRef paramRef = new V1beta1ParamRef();
        V1LabelSelector selector = mock(V1LabelSelector.class);
        paramRef.setSelector(selector);
        assertEquals(selector, paramRef.getSelector());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 8E4DD930A4189A123FE04083FF35A36E
    @Test
    void testEqualsAndHashCode() {
        V1beta1ParamRef paramRef1 = new V1beta1ParamRef().name("name1").namespace("namespace1").parameterNotFoundAction("Allow").selector(new V1LabelSelector());
        V1beta1ParamRef paramRef2 = new V1beta1ParamRef().name("name1").namespace("namespace1").parameterNotFoundAction("Allow").selector(new V1LabelSelector());
        V1beta1ParamRef paramRef3 = new V1beta1ParamRef().name("name2").namespace("namespace2").parameterNotFoundAction("Deny").selector(new V1LabelSelector());
        assertThat(paramRef1, equalTo(paramRef2));
        assertThat(paramRef1.hashCode(), is(paramRef2.hashCode()));
        assertThat(paramRef1, is(notNullValue()));
        assertThat(paramRef1.equals(paramRef3), is(false));
    }

    //BaseRock generated method id: ${testToString}, hash: C06295D47F285F448A150316EA2E177E
    @Test
    void testToString() {
        V1beta1ParamRef paramRef = new V1beta1ParamRef().name("testName").namespace("testNamespace").parameterNotFoundAction("Allow").selector(new V1LabelSelector());
        String expectedString = "class V1beta1ParamRef {\n" + "    name: testName\n" + "    namespace: testNamespace\n" + "    parameterNotFoundAction: Allow\n" + "    selector: class V1LabelSelector {\n" + "        matchExpressions: []\n" + "        matchLabels: {}\n" + "    }\n" + "}";
        assertThat(paramRef.toString(), equalTo(expectedString));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 9A278A4D61866488BC26983F7DFFDA48
    @Test
    void testBuilderPattern() {
        V1beta1ParamRef paramRef = new V1beta1ParamRef().name("testName").namespace("testNamespace").parameterNotFoundAction("Allow").selector(new V1LabelSelector());
        assertThat(paramRef.getName(), equalTo("testName"));
        assertThat(paramRef.getNamespace(), equalTo("testNamespace"));
        assertThat(paramRef.getParameterNotFoundAction(), equalTo("Allow"));
        assertNotNull(paramRef.getSelector());
    }

    //BaseRock generated method id: ${testNullValues}, hash: EE4525BFC5ACD391EDF11FAE04E11368
    @Test
    void testNullValues() {
        V1beta1ParamRef paramRef = new V1beta1ParamRef();
        assertNull(paramRef.getName());
        assertNull(paramRef.getNamespace());
        assertNull(paramRef.getParameterNotFoundAction());
        assertNull(paramRef.getSelector());
    }
}

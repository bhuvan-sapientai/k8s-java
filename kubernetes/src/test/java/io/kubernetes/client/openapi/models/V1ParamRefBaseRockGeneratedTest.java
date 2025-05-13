package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1LabelSelector;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.V1ParamRef;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1ParamRefBaseRockGeneratedTest {

    private V1ParamRef v1ParamRef;

    @BeforeEach
    void setUp() {
        v1ParamRef = new V1ParamRef();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 130F705ECF287946A91E4BC679904948
    @Test
    void testConstructor() {
        assertNotNull(v1ParamRef);
    }

    //BaseRock generated method id: ${testSetAndGetName}, hash: 0C513180871743F9CEE7DF3229299FA8
    @ParameterizedTest
    @ValueSource(strings = { "name1", "name2" })
    void testSetAndGetName(String name) {
        v1ParamRef.setName(name);
        assertEquals(name, v1ParamRef.getName());
    }

    //BaseRock generated method id: ${testSetAndGetNameWithNullAndEmptyValues}, hash: 33474B7EE9B40A972E18B897576D19AE
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "  ", "\t", "\n" })
    void testSetAndGetNameWithNullAndEmptyValues(String name) {
        v1ParamRef.setName(name);
        assertEquals(name, v1ParamRef.getName());
    }

    //BaseRock generated method id: ${testSetAndGetNamespace}, hash: 73859D2889C12B40F36BE0FDAB0410F5
    @ParameterizedTest
    @ValueSource(strings = { "namespace1", "namespace2" })
    void testSetAndGetNamespace(String namespace) {
        v1ParamRef.setNamespace(namespace);
        assertEquals(namespace, v1ParamRef.getNamespace());
    }

    //BaseRock generated method id: ${testSetAndGetNamespaceWithNullAndEmptyValues}, hash: F5AA84652BB8DDC8E2E636A7C15DC56B
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "  ", "\t", "\n" })
    void testSetAndGetNamespaceWithNullAndEmptyValues(String namespace) {
        v1ParamRef.setNamespace(namespace);
        assertEquals(namespace, v1ParamRef.getNamespace());
    }

    //BaseRock generated method id: ${testSetAndGetParameterNotFoundAction}, hash: F8D5069BCCC5554DB79C0B5031001C67
    @ParameterizedTest
    @ValueSource(strings = { "Allow", "Deny" })
    void testSetAndGetParameterNotFoundAction(String action) {
        v1ParamRef.setParameterNotFoundAction(action);
        assertEquals(action, v1ParamRef.getParameterNotFoundAction());
    }

    //BaseRock generated method id: ${testSetAndGetParameterNotFoundActionWithNullAndEmptyValues}, hash: D231A69559BE0774A0A417913403A46C
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "  ", "\t", "\n" })
    void testSetAndGetParameterNotFoundActionWithNullAndEmptyValues(String action) {
        v1ParamRef.setParameterNotFoundAction(action);
        assertEquals(action, v1ParamRef.getParameterNotFoundAction());
    }

    //BaseRock generated method id: ${testSetAndGetSelector}, hash: CE329BEE0D79656C1CB02742C7C65A4F
    @Test
    void testSetAndGetSelector() {
        V1LabelSelector selector = new V1LabelSelector();
        v1ParamRef.setSelector(selector);
        assertEquals(selector, v1ParamRef.getSelector());
    }

    //BaseRock generated method id: ${testSetAndGetSelectorWithNull}, hash: 1ED221C4C41DE26307AEB33F802331CC
    @Test
    void testSetAndGetSelectorWithNull() {
        v1ParamRef.setSelector(null);
        assertNull(v1ParamRef.getSelector());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: D0DD30EB2EB22649B58D26C866E42FA8
    @Test
    void testEqualsWithSameObject() {
        assertTrue(v1ParamRef.equals(v1ParamRef));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: A4B78159CE239A63B1AFF1B636DB2FB4
    @Test
    void testEqualsWithNull() {
        assertFalse(v1ParamRef.equals(null));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: A0ABD814C26834B0CE78594F51FEFD67
    @Test
    void testEqualsWithDifferentClass() {
        assertFalse(v1ParamRef.equals(new Object()));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 5B284FE293AF3835C09AC86EF2C25B78
    @Test
    void testEqualsWithDifferentObject() {
        V1ParamRef other = new V1ParamRef();
        other.setName("differentName");
        assertFalse(v1ParamRef.equals(other));
    }

    //BaseRock generated method id: ${testHashCode}, hash: B9906EA7068B3210AD032B72679D7956
    @Test
    void testHashCode() {
        V1ParamRef paramRef1 = new V1ParamRef().name("test").namespace("ns").parameterNotFoundAction("Allow");
        V1ParamRef paramRef2 = new V1ParamRef().name("test").namespace("ns").parameterNotFoundAction("Allow");
        assertEquals(paramRef1.hashCode(), paramRef2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 90B5832AF6991170B33BEA8D77479857
    @Disabled()
    @Test
    void testToString() {
        v1ParamRef.setName("testName");
        v1ParamRef.setNamespace("testNamespace");
        v1ParamRef.setParameterNotFoundAction("Allow");
        V1LabelSelector selector = new V1LabelSelector();
        v1ParamRef.setSelector(selector);
        String toString = v1ParamRef.toString();
        assertThat(toString, containsString("name: testName"));
        assertThat(toString, containsString("namespace: testNamespace"));
        assertThat(toString, containsString("parameterNotFoundAction: Allow"));
        assertThat(toString, containsString("selector: " + selector.toString()));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 94B88692987BBE13176BF504FCC3BA93
    @Test
    void testBuilder() {
        String name = "testName";
        String namespace = "testNamespace";
        String action = "Allow";
        V1LabelSelector selector = new V1LabelSelector();
        V1ParamRef built = new V1ParamRef().name(name).namespace(namespace).parameterNotFoundAction(action).selector(selector);
        assertEquals(name, built.getName());
        assertEquals(namespace, built.getNamespace());
        assertEquals(action, built.getParameterNotFoundAction());
        assertEquals(selector, built.getSelector());
    }
}

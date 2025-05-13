package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1alpha1ParamRef;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha1ParamRefBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 3432C7756BBF92041697A9F25BEC95B9
    @Test
    void testConstructor() {
        V1alpha1ParamRef paramRef = new V1alpha1ParamRef();
        assertThat(paramRef, is(notNullValue()));
    }

    //BaseRock generated method id: ${testName}, hash: CA542BAB7262DBF007D2BDC8467DF691
    @Test
    void testName() {
        V1alpha1ParamRef paramRef = new V1alpha1ParamRef();
        String name = "testName";
        paramRef.setName(name);
        assertThat(paramRef.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testNamespace}, hash: F5F51512A73039FEDC76B0A14C747DB9
    @Test
    void testNamespace() {
        V1alpha1ParamRef paramRef = new V1alpha1ParamRef();
        String namespace = "testNamespace";
        paramRef.setNamespace(namespace);
        assertThat(paramRef.getNamespace(), is(equalTo(namespace)));
    }

    //BaseRock generated method id: ${testParameterNotFoundAction}, hash: 9492758A42012F4FE28ABD56A352F8A1
    @Test
    void testParameterNotFoundAction() {
        V1alpha1ParamRef paramRef = new V1alpha1ParamRef();
        String action = "Allow";
        paramRef.setParameterNotFoundAction(action);
        assertThat(paramRef.getParameterNotFoundAction(), is(equalTo(action)));
    }

    //BaseRock generated method id: ${testSelector}, hash: B6E5D88C171636E80527F959A25A5363
    @Test
    void testSelector() {
        V1alpha1ParamRef paramRef = new V1alpha1ParamRef();
        V1LabelSelector selector = mock(V1LabelSelector.class);
        paramRef.setSelector(selector);
        assertThat(paramRef.getSelector(), is(equalTo(selector)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 39F73146E8AB307E571E44DC79E9A088
    @Test
    void testEqualsAndHashCode() {
        V1LabelSelector mockSelector1 = mock(V1LabelSelector.class);
        V1LabelSelector mockSelector2 = mock(V1LabelSelector.class);
        V1alpha1ParamRef paramRef1 = new V1alpha1ParamRef().name("test").namespace("namespace").parameterNotFoundAction("Allow").selector(mockSelector1);
        V1alpha1ParamRef paramRef2 = new V1alpha1ParamRef().name("test").namespace("namespace").parameterNotFoundAction("Allow").selector(mockSelector1);
        assertThat(paramRef1, is(equalTo(paramRef2)));
        assertThat(paramRef1.hashCode(), is(equalTo(paramRef2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 93635DE20674A15EED46C227B8663F92
    @Test
    void testToString() {
        V1alpha1ParamRef paramRef = new V1alpha1ParamRef().name("test").namespace("namespace").parameterNotFoundAction("Allow").selector(mock(V1LabelSelector.class));
        String toString = paramRef.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("name"), is(true));
        assertThat(toString.contains("namespace"), is(true));
        assertThat(toString.contains("parameterNotFoundAction"), is(true));
        assertThat(toString.contains("selector"), is(true));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 17A1AE6A66A2D20F68B7370D7FD9D210
    @Test
    void testBuilderPattern() {
        V1alpha1ParamRef paramRef = new V1alpha1ParamRef().name("test").namespace("namespace").parameterNotFoundAction("Allow").selector(mock(V1LabelSelector.class));
        assertThat(paramRef.getName(), is(equalTo("test")));
        assertThat(paramRef.getNamespace(), is(equalTo("namespace")));
        assertThat(paramRef.getParameterNotFoundAction(), is(equalTo("Allow")));
        assertThat(paramRef.getSelector(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testNullValues}, hash: EA8C1C7EE5F39D59F7A6693FEC45A276
    @Test
    void testNullValues() {
        V1alpha1ParamRef paramRef = new V1alpha1ParamRef();
        assertThat(paramRef.getName(), is(nullValue()));
        assertThat(paramRef.getNamespace(), is(nullValue()));
        assertThat(paramRef.getParameterNotFoundAction(), is(nullValue()));
        assertThat(paramRef.getSelector(), is(nullValue()));
    }
}

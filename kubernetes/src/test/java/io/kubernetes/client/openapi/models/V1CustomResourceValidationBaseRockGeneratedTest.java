package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1JSONSchemaProps;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import com.google.gson.JsonElement;
import io.kubernetes.client.openapi.models.V1CustomResourceValidation;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CustomResourceValidationBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: CEDBB5F7A94AE9B6BEF66186902805B9
    @Test
    void testConstructor() {
        V1CustomResourceValidation validation = new V1CustomResourceValidation();
        assertThat(validation, is(notNullValue()));
    }

    //BaseRock generated method id: ${testOpenAPIV3Schema}, hash: 6E53B5167F8B68565336AAF117641B87
    @Test
    void testOpenAPIV3Schema() {
        V1CustomResourceValidation validation = new V1CustomResourceValidation();
        V1JSONSchemaProps schema = mock(V1JSONSchemaProps.class);
        validation.setOpenAPIV3Schema(schema);
        assertThat(validation.getOpenAPIV3Schema(), is(equalTo(schema)));
    }

    //BaseRock generated method id: ${testOpenAPIV3SchemaBuilder}, hash: 3ECEE05907303BF20B88B38C4A71F501
    @Test
    void testOpenAPIV3SchemaBuilder() {
        V1JSONSchemaProps schema = mock(V1JSONSchemaProps.class);
        V1CustomResourceValidation validation = new V1CustomResourceValidation().openAPIV3Schema(schema);
        assertThat(validation.getOpenAPIV3Schema(), is(equalTo(schema)));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 2904A02FAA8917955FCD59F4DF8FFA05
    @Test
    void testEqualsWithSameObject() {
        V1CustomResourceValidation validation = new V1CustomResourceValidation();
        assertThat(validation.equals(validation), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 9CF32D171B2818E9E69AB27419B9FA37
    @Test
    void testEqualsWithDifferentClass() {
        V1CustomResourceValidation validation = new V1CustomResourceValidation();
        assertThat(validation.equals("Not a V1CustomResourceValidation"), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentOpenAPIV3Schema}, hash: C4CB934F756F13E5F054BE2C2EE34FEB
    @Test
    void testEqualsWithDifferentOpenAPIV3Schema() {
        V1CustomResourceValidation validation1 = new V1CustomResourceValidation().openAPIV3Schema(mock(V1JSONSchemaProps.class));
        V1CustomResourceValidation validation2 = new V1CustomResourceValidation().openAPIV3Schema(mock(V1JSONSchemaProps.class));
        assertThat(validation1.equals(validation2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 8B5302F3BF659E4FFA67B204ADDEA3E7
    @Test
    void testHashCode() {
        V1CustomResourceValidation validation1 = new V1CustomResourceValidation().openAPIV3Schema(mock(V1JSONSchemaProps.class));
        V1CustomResourceValidation validation2 = new V1CustomResourceValidation().openAPIV3Schema(mock(V1JSONSchemaProps.class));
        assertThat(validation1.hashCode() == validation2.hashCode(), is(false));
    }

    //BaseRock generated method id: ${testToString}, hash: 8D8AF9098116C802814359A74BAB150B
    @Test
    void testToString() {
        V1CustomResourceValidation validation = new V1CustomResourceValidation().openAPIV3Schema(mock(V1JSONSchemaProps.class));
        String toString = validation.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("V1CustomResourceValidation"), is(true));
        assertThat(toString.contains("openAPIV3Schema"), is(true));
    }

    //BaseRock generated method id: ${testSetOpenAPIV3SchemaNull}, hash: 247F6CBC133C013F36AA860681E302FE
    @Test
    void testSetOpenAPIV3SchemaNull() {
        V1CustomResourceValidation validation = new V1CustomResourceValidation();
        validation.setOpenAPIV3Schema(null);
        assertThat(validation.getOpenAPIV3Schema(), is(nullValue()));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithNullJsonElement}, hash: 244DCF316DB8C4B8E6CE2D075BD5E7D8
    @Test
    void testValidateJsonElementWithNullJsonElement() {
        assertThrows(NullPointerException.class, () -> V1CustomResourceValidation.validateJsonElement(null));
    }
}

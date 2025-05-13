package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.V1alpha1ApplyConfiguration;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha1ApplyConfigurationBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 2227473B0AD344F716680D9EFA8B3E8E
    @Test
    void testConstructor() {
        V1alpha1ApplyConfiguration configuration = new V1alpha1ApplyConfiguration();
        assertThat(configuration, is(notNullValue()));
    }

    //BaseRock generated method id: ${testExpressionSetter}, hash: DEEFBB63B54E6055F112431828F1CEDA
    @Test
    void testExpressionSetter() {
        V1alpha1ApplyConfiguration configuration = new V1alpha1ApplyConfiguration();
        String testExpression = "testExpression";
        configuration.expression(testExpression);
        assertEquals(testExpression, configuration.getExpression());
    }

    //BaseRock generated method id: ${testExpressionSetterWithDifferentValues}, hash: 97DB2869ADF8BC2A68CF3B15655D80E0
    @ParameterizedTest
    @ValueSource(strings = { "expression1", "expression2", "expression3" })
    void testExpressionSetterWithDifferentValues(String testExpression) {
        V1alpha1ApplyConfiguration configuration = new V1alpha1ApplyConfiguration();
        configuration.expression(testExpression);
        assertEquals(testExpression, configuration.getExpression());
    }

    //BaseRock generated method id: ${testExpressionSetterWithNullAndEmpty}, hash: D2E1055C0025ED079450EC1C46CD00D9
    @ParameterizedTest
    @NullAndEmptySource
    void testExpressionSetterWithNullAndEmpty(String testExpression) {
        V1alpha1ApplyConfiguration configuration = new V1alpha1ApplyConfiguration();
        configuration.expression(testExpression);
        assertEquals(testExpression, configuration.getExpression());
    }

    //BaseRock generated method id: ${testEquals}, hash: 3D32967FA34A30B846214F3DD3CE4631
    @Test
    void testEquals() {
        V1alpha1ApplyConfiguration config1 = new V1alpha1ApplyConfiguration().expression("test");
        V1alpha1ApplyConfiguration config2 = new V1alpha1ApplyConfiguration().expression("test");
        V1alpha1ApplyConfiguration config3 = new V1alpha1ApplyConfiguration().expression("different");
        assertThat(config1.equals(config2), is(true));
        assertThat(config1.equals(config3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: C657E232E7F4A5E25B725DF4E4A7B2B1
    @Test
    void testHashCode() {
        V1alpha1ApplyConfiguration config1 = new V1alpha1ApplyConfiguration().expression("test");
        V1alpha1ApplyConfiguration config2 = new V1alpha1ApplyConfiguration().expression("test");
        assertThat(config1.hashCode(), is(config2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 00B76DE6F29EDC7F839714F5F1E24466
    @Test
    void testToString() {
        V1alpha1ApplyConfiguration config = new V1alpha1ApplyConfiguration().expression("test");
        String expectedString = "class V1alpha1ApplyConfiguration {\n    expression: test\n}";
        assertEquals(expectedString, config.toString());
    }

    //BaseRock generated method id: ${testToJson}, hash: 0EE651B6132ED250CAEDFEAA116D8982
    @Test
    void testToJson() {
        V1alpha1ApplyConfiguration config = new V1alpha1ApplyConfiguration().expression("test");
        String expectedJson = "{\"expression\":\"test\"}";
        assertEquals(expectedJson, config.toJson());
    }

    //BaseRock generated method id: ${testFromJson}, hash: A7454808E0CACB84AE4D0EF586E49463
    @Test
    void testFromJson() throws Exception {
        String json = "{\"expression\":\"test\"}";
        V1alpha1ApplyConfiguration config = V1alpha1ApplyConfiguration.fromJson(json);
        assertEquals("test", config.getExpression());
    }

    //BaseRock generated method id: ${testFromJsonWithInvalidJson}, hash: 827F896CA34558B31DBEFDB98A86D61E
    @Test
    void testFromJsonWithInvalidJson() {
        String invalidJson = "{invalid_json}";
        assertThrows(Exception.class, () -> V1alpha1ApplyConfiguration.fromJson(invalidJson));
    }
}

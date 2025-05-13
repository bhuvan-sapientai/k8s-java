package io.kubernetes.client.openapi.models;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.CsvSource;
import static org.hamcrest.Matchers.startsWith;
import java.io.IOException;
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.V2CrossVersionObjectReference;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V2CrossVersionObjectReferenceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 340AD06AF97262E955E12188EFA260B3
    @Test
    void testConstructor() {
        V2CrossVersionObjectReference reference = new V2CrossVersionObjectReference();
        assertNotNull(reference);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: EB4637BF828A68261255EBEDCF545624
    @Test
    void testApiVersion() {
        V2CrossVersionObjectReference reference = new V2CrossVersionObjectReference();
        String apiVersion = "v1";
        reference.setApiVersion(apiVersion);
        assertEquals(apiVersion, reference.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 655185984D878F38633811B72DB5D67B
    @Test
    void testKind() {
        V2CrossVersionObjectReference reference = new V2CrossVersionObjectReference();
        String kind = "Pod";
        reference.setKind(kind);
        assertEquals(kind, reference.getKind());
    }

    //BaseRock generated method id: ${testName}, hash: 7EEDBACFB978D38EE4659E808D2914A3
    @Test
    void testName() {
        V2CrossVersionObjectReference reference = new V2CrossVersionObjectReference();
        String name = "test-pod";
        reference.setName(name);
        assertEquals(name, reference.getName());
    }

    //BaseRock generated method id: ${testApiVersionFluentSetter}, hash: CAE443C5FA725D711F1D2C5F93A0AF6C
    @Test
    void testApiVersionFluentSetter() {
        V2CrossVersionObjectReference reference = new V2CrossVersionObjectReference().apiVersion("v1");
        assertEquals("v1", reference.getApiVersion());
    }

    //BaseRock generated method id: ${testKindFluentSetter}, hash: 63A721560A725AD9B0BA17A2A7C7A2E3
    @Test
    void testKindFluentSetter() {
        V2CrossVersionObjectReference reference = new V2CrossVersionObjectReference().kind("Pod");
        assertEquals("Pod", reference.getKind());
    }

    //BaseRock generated method id: ${testNameFluentSetter}, hash: 0A5FC55E6C39CD4807857620D70B94CE
    @Test
    void testNameFluentSetter() {
        V2CrossVersionObjectReference reference = new V2CrossVersionObjectReference().name("test-pod");
        assertEquals("test-pod", reference.getName());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 77D99E5EC5B9B3580BCD6616BDDD53AB
    @Test
    void testEqualsAndHashCode() {
        V2CrossVersionObjectReference reference1 = new V2CrossVersionObjectReference().apiVersion("v1").kind("Pod").name("test-pod");
        V2CrossVersionObjectReference reference2 = new V2CrossVersionObjectReference().apiVersion("v1").kind("Pod").name("test-pod");
        assertAll(() -> assertEquals(reference1, reference2), () -> assertEquals(reference1.hashCode(), reference2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 61162F56E452682211EF06E21AAA353D
    @ParameterizedTest
    @CsvSource({ "v1, Pod, test-pod", "v2, Deployment, my-deployment", "v3, Service, my-service" })
    void testToString(String apiVersion, String kind, String name) {
        V2CrossVersionObjectReference reference = new V2CrossVersionObjectReference().apiVersion(apiVersion).kind(kind).name(name);
        String expectedString = "class V2CrossVersionObjectReference {\n" + "    apiVersion: " + apiVersion + "\n" + "    kind: " + kind + "\n" + "    name: " + name + "\n" + "}";
        assertEquals(expectedString, reference.toString());
    }

    //BaseRock generated method id: ${testSetNullApiVersion}, hash: 4C28D68129B49FA04005DB03C5730BC8
    @Test
    void testSetNullApiVersion() {
        V2CrossVersionObjectReference reference = new V2CrossVersionObjectReference();
        reference.setApiVersion(null);
        assertThat(reference.getApiVersion(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetNullKind}, hash: F4013EB8B7D205FCD1A40E96A2785EF8
    @Disabled()
    @Test
    void testSetNullKind() {
        V2CrossVersionObjectReference reference = new V2CrossVersionObjectReference();
        assertThrows(NullPointerException.class, () -> reference.setKind(null));
    }

    //BaseRock generated method id: ${testSetNullName}, hash: AB80E6B5510C08485BD6D9F618D5DE96
    @Disabled()
    @Test
    void testSetNullName() {
        V2CrossVersionObjectReference reference = new V2CrossVersionObjectReference();
        assertThrows(NullPointerException.class, () -> reference.setName(null));
    }

    //BaseRock generated method id: ${testBuildWithAllFields}, hash: 1D94EFDA2DA91B2B85F48A0DFC22B9DE
    @Test
    void testBuildWithAllFields() {
        V2CrossVersionObjectReference reference = new V2CrossVersionObjectReference().apiVersion("v1").kind("Pod").name("test-pod");
        assertAll(() -> assertEquals("v1", reference.getApiVersion()), () -> assertEquals("Pod", reference.getKind()), () -> assertEquals("test-pod", reference.getName()));
    }

    //BaseRock generated method id: ${testBuildWithRequiredFieldsOnly}, hash: E7A7C889EA45DF1B8A1459142C30F488
    @Test
    void testBuildWithRequiredFieldsOnly() {
        V2CrossVersionObjectReference reference = new V2CrossVersionObjectReference().kind("Pod").name("test-pod");
        assertAll(() -> assertThat(reference.getApiVersion(), is(equalTo(null))), () -> assertEquals("Pod", reference.getKind()), () -> assertEquals("test-pod", reference.getName()));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 8164D5F766B5D80E135F94B487A0E2DB
    @Test
    void testValidateJsonElement() throws IOException {
        V2CrossVersionObjectReference reference = new V2CrossVersionObjectReference().apiVersion("v1").kind("Pod").name("test-pod");
        String json = reference.toJson();
        assertThat(json, is(notNullValue()));
        V2CrossVersionObjectReference deserializedReference = V2CrossVersionObjectReference.fromJson(json);
        assertEquals(reference, deserializedReference);
    }
}

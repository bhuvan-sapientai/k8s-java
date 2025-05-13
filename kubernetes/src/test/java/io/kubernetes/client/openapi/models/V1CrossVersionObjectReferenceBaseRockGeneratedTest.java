package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1CrossVersionObjectReference;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CrossVersionObjectReferenceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 7526A08582C83CB94EA2959F31458A9A
    @Test
    void testConstructor() {
        V1CrossVersionObjectReference reference = new V1CrossVersionObjectReference();
        assertThat(reference, is(notNullValue()));
    }

    //BaseRock generated method id: ${testApiVersion}, hash: D420C78EA2CBC64BFA3DB28DED0FF174
    @Test
    void testApiVersion() {
        V1CrossVersionObjectReference reference = new V1CrossVersionObjectReference();
        String apiVersion = "v1";
        reference.setApiVersion(apiVersion);
        assertThat(reference.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testApiVersionWithDifferentValues}, hash: 672DD4FBDBEC9878475436915DD092B1
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "v1", "apps/v1", "networking.k8s.io/v1" })
    void testApiVersionWithDifferentValues(String apiVersion) {
        V1CrossVersionObjectReference reference = new V1CrossVersionObjectReference();
        reference.setApiVersion(apiVersion);
        assertThat(reference.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testKind}, hash: B5B9320A7B1E45DABDB81D81B00279CA
    @Test
    void testKind() {
        V1CrossVersionObjectReference reference = new V1CrossVersionObjectReference();
        String kind = "Pod";
        reference.setKind(kind);
        assertThat(reference.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testKindWithDifferentValues}, hash: EFC68371DE4313283F255510A0A3C54A
    @ParameterizedTest
    @ValueSource(strings = { "Pod", "Deployment", "Service", "ConfigMap" })
    void testKindWithDifferentValues(String kind) {
        V1CrossVersionObjectReference reference = new V1CrossVersionObjectReference();
        reference.setKind(kind);
        assertThat(reference.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testName}, hash: 9344970D02194961AF54AF2397311433
    @Test
    void testName() {
        V1CrossVersionObjectReference reference = new V1CrossVersionObjectReference();
        String name = "my-pod";
        reference.setName(name);
        assertThat(reference.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testNameWithDifferentValues}, hash: D7E9019AE89EE0F7BCC5EE6F23FDED84
    @ParameterizedTest
    @ValueSource(strings = { "my-pod", "test-deployment", "default-service" })
    void testNameWithDifferentValues(String name) {
        V1CrossVersionObjectReference reference = new V1CrossVersionObjectReference();
        reference.setName(name);
        assertThat(reference.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: B2F5E1B5BDEDD7814ADAC5FD7BC677BB
    @Test
    void testBuilderPattern() {
        String apiVersion = "v1";
        String kind = "Pod";
        String name = "my-pod";
        V1CrossVersionObjectReference reference = new V1CrossVersionObjectReference().apiVersion(apiVersion).kind(kind).name(name);
        assertThat(reference.getApiVersion(), is(equalTo(apiVersion)));
        assertThat(reference.getKind(), is(equalTo(kind)));
        assertThat(reference.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 9EF0C2CE2F356B7DD0BE44FF1AA439B5
    @Test
    void testEqualsAndHashCode() {
        V1CrossVersionObjectReference reference1 = new V1CrossVersionObjectReference().apiVersion("v1").kind("Pod").name("my-pod");
        V1CrossVersionObjectReference reference2 = new V1CrossVersionObjectReference().apiVersion("v1").kind("Pod").name("my-pod");
        V1CrossVersionObjectReference reference3 = new V1CrossVersionObjectReference().apiVersion("v2").kind("Deployment").name("other-pod");
        assertThat(reference1, is(equalTo(reference2)));
        assertThat(reference1.hashCode(), is(equalTo(reference2.hashCode())));
        assertThat(reference1, is(notNullValue()));
        assertThat(reference1, is(equalTo(reference1)));
        assertThat(reference1, is(equalTo(reference2)));
        assertThat(reference1.equals(reference3), is(false));
    }

    //BaseRock generated method id: ${testToString}, hash: 0D3FAC87510106693416C5567A619C12
    @Test
    void testToString() {
        V1CrossVersionObjectReference reference = new V1CrossVersionObjectReference().apiVersion("v1").kind("Pod").name("my-pod");
        String expectedString = "class V1CrossVersionObjectReference {\n" + "    apiVersion: v1\n" + "    kind: Pod\n" + "    name: my-pod\n" + "}";
        assertThat(reference.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testSetNullApiVersion}, hash: 24AAF4E98637235C8CCE1779363FF9B3
    @Test
    void testSetNullApiVersion() {
        V1CrossVersionObjectReference reference = new V1CrossVersionObjectReference();
        reference.setApiVersion(null);
        assertThat(reference.getApiVersion(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetNullKind}, hash: DEBB2AECF621889213389DE7CD215E2E
    @Test
    void testSetNullKind() {
        V1CrossVersionObjectReference reference = new V1CrossVersionObjectReference();
        reference.setKind(null);
        assertThat(reference.getKind(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetNullName}, hash: 000291F2525D06C6BB9B430786992A70
    @Test
    void testSetNullName() {
        V1CrossVersionObjectReference reference = new V1CrossVersionObjectReference();
        reference.setName(null);
        assertThat(reference.getName(), is(equalTo(null)));
    }
}

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
import io.kubernetes.client.openapi.models.V1alpha1StorageVersionMigrationSpec;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.models.V1alpha1GroupVersionResource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha1StorageVersionMigrationSpecBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: CE48FB88F3C8751450CFC78037A24737
    @Test
    void testConstructor() {
        V1alpha1StorageVersionMigrationSpec spec = new V1alpha1StorageVersionMigrationSpec();
        assertThat(spec, is(notNullValue()));
    }

    //BaseRock generated method id: ${testContinueToken}, hash: 2F9413773223A548C5DC119BE22C9A41
    @Test
    void testContinueToken() {
        V1alpha1StorageVersionMigrationSpec spec = new V1alpha1StorageVersionMigrationSpec();
        String token = "testToken";
        spec.setContinueToken(token);
        assertThat(spec.getContinueToken(), is(equalTo(token)));
    }

    //BaseRock generated method id: ${testContinueTokenWithVariousValues}, hash: C4E5F40C6BAF6845409C84AEE16C4FF6
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "token1", "token2", "longTokenWithSpecialChars!@#$%^&*()" })
    void testContinueTokenWithVariousValues(String token) {
        V1alpha1StorageVersionMigrationSpec spec = new V1alpha1StorageVersionMigrationSpec();
        spec.setContinueToken(token);
        assertThat(spec.getContinueToken(), is(equalTo(token)));
    }

    //BaseRock generated method id: ${testResource}, hash: 8395389710E6207F917560847B890633
    @Test
    void testResource() {
        V1alpha1StorageVersionMigrationSpec spec = new V1alpha1StorageVersionMigrationSpec();
        V1alpha1GroupVersionResource resource = new V1alpha1GroupVersionResource();
        spec.setResource(resource);
        assertThat(spec.getResource(), is(equalTo(resource)));
    }

    //BaseRock generated method id: ${testResourceNull}, hash: 06BD0BB4A7C80A9662537E302BA1FBFD
    @Test
    void testResourceNull() {
        V1alpha1StorageVersionMigrationSpec spec = new V1alpha1StorageVersionMigrationSpec();
        assertThat(spec.getResource(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 3CB8E4F9AD162BA3D0A419646456B12B
    @Test
    void testEquals() {
        V1alpha1StorageVersionMigrationSpec spec1 = new V1alpha1StorageVersionMigrationSpec().continueToken("token").resource(new V1alpha1GroupVersionResource());
        V1alpha1StorageVersionMigrationSpec spec2 = new V1alpha1StorageVersionMigrationSpec().continueToken("token").resource(new V1alpha1GroupVersionResource());
        assertThat(spec1.equals(spec2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 3F51BCA243DFEDF9CF027FFF3F3C530A
    @Test
    void testHashCode() {
        V1alpha1StorageVersionMigrationSpec spec = new V1alpha1StorageVersionMigrationSpec().continueToken("token").resource(new V1alpha1GroupVersionResource());
        assertThat(spec.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: FA7372A1FE79FD240730682FDB1D98E8
    @Test
    void testToString() {
        V1alpha1StorageVersionMigrationSpec spec = new V1alpha1StorageVersionMigrationSpec().continueToken("token").resource(new V1alpha1GroupVersionResource());
        String result = spec.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result.contains("continueToken"), is(true));
        assertThat(result.contains("resource"), is(true));
    }
}

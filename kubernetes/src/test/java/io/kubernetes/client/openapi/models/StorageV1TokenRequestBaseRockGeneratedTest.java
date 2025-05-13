package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import io.kubernetes.client.openapi.models.StorageV1TokenRequest;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import static org.hamcrest.Matchers.startsWith;
import com.google.gson.JsonParser;
import java.io.IOException;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class StorageV1TokenRequestBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: A70261508E22ACCC98727D9FEBB1222F
    @Test
    void testConstructor() {
        StorageV1TokenRequest tokenRequest = new StorageV1TokenRequest();
        assertThat(tokenRequest, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetAudience}, hash: 1AD21786838D155B3451248C0E65BDAF
    @Test
    void testSetAndGetAudience() {
        StorageV1TokenRequest tokenRequest = new StorageV1TokenRequest();
        String audience = "test-audience";
        tokenRequest.setAudience(audience);
        assertEquals(audience, tokenRequest.getAudience());
    }

    //BaseRock generated method id: ${testSetAndGetAudienceWithDifferentValues}, hash: 6FED489AFC42000D75A095FCFF36D3AA
    @ParameterizedTest
    @ValueSource(strings = { "audience1", "audience2", "audience3" })
    void testSetAndGetAudienceWithDifferentValues(String audience) {
        StorageV1TokenRequest tokenRequest = new StorageV1TokenRequest();
        tokenRequest.setAudience(audience);
        assertEquals(audience, tokenRequest.getAudience());
    }

    //BaseRock generated method id: ${testSetAndGetAudienceWithNullAndEmpty}, hash: 23B30EE88292399B1C5D1F817A7C9B5E
    @ParameterizedTest
    @NullAndEmptySource
    void testSetAndGetAudienceWithNullAndEmpty(String audience) {
        StorageV1TokenRequest tokenRequest = new StorageV1TokenRequest();
        tokenRequest.setAudience(audience);
        assertEquals(audience, tokenRequest.getAudience());
    }

    //BaseRock generated method id: ${testSetAndGetExpirationSeconds}, hash: 549921035E4BFC0B4590067D9DA39A01
    @Test
    void testSetAndGetExpirationSeconds() {
        StorageV1TokenRequest tokenRequest = new StorageV1TokenRequest();
        Long expirationSeconds = 3600L;
        tokenRequest.setExpirationSeconds(expirationSeconds);
        assertEquals(expirationSeconds, tokenRequest.getExpirationSeconds());
    }

    //BaseRock generated method id: ${testSetAndGetExpirationSecondsWithDifferentValues}, hash: 0C6B216D6E25D6E0615D936899A04687
    @ParameterizedTest
    @ValueSource(longs = { 0L, 1L, 60L, 3600L, 86400L })
    void testSetAndGetExpirationSecondsWithDifferentValues(Long expirationSeconds) {
        StorageV1TokenRequest tokenRequest = new StorageV1TokenRequest();
        tokenRequest.setExpirationSeconds(expirationSeconds);
        assertEquals(expirationSeconds, tokenRequest.getExpirationSeconds());
    }

    //BaseRock generated method id: ${testSetExpirationSecondsWithNull}, hash: EE7C900EBDA970E75DFC369850A02B2B
    @Test
    void testSetExpirationSecondsWithNull() {
        StorageV1TokenRequest tokenRequest = new StorageV1TokenRequest();
        tokenRequest.setExpirationSeconds(null);
        assertThat(tokenRequest.getExpirationSeconds(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 11F49B5CA763A2536FF6B56DEAC5A7EF
    @Test
    void testEqualsWithSameObject() {
        StorageV1TokenRequest tokenRequest = new StorageV1TokenRequest();
        assertThat(tokenRequest.equals(tokenRequest), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 0FD1EBAF24178CC24B7BA4CA064EC86D
    @Test
    void testEqualsWithDifferentObject() {
        StorageV1TokenRequest tokenRequest1 = new StorageV1TokenRequest().audience("audience1").expirationSeconds(3600L);
        StorageV1TokenRequest tokenRequest2 = new StorageV1TokenRequest().audience("audience2").expirationSeconds(7200L);
        assertThat(tokenRequest1.equals(tokenRequest2), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: 3D2BD9944E03CA7222C9CFA3B4ABD10E
    @Test
    void testEqualsWithNull() {
        StorageV1TokenRequest tokenRequest = new StorageV1TokenRequest();
        assertThat(tokenRequest.equals(null), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 6DBB353A44843A8D06E47BBBD23E1711
    @Test
    void testHashCode() {
        StorageV1TokenRequest tokenRequest1 = new StorageV1TokenRequest().audience("audience").expirationSeconds(3600L);
        StorageV1TokenRequest tokenRequest2 = new StorageV1TokenRequest().audience("audience").expirationSeconds(3600L);
        assertThat(tokenRequest1.hashCode(), is(equalTo(tokenRequest2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 2C3996A705BD1D4592D238B08FE36FF6
    @Test
    void testToString() {
        StorageV1TokenRequest tokenRequest = new StorageV1TokenRequest().audience("test-audience").expirationSeconds(3600L);
        String expectedString = "class StorageV1TokenRequest {\n    audience: test-audience\n    expirationSeconds: 3600\n}";
        assertThat(tokenRequest.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: C03C460918DFB41060062CDF9A77075A
    @Test
    void testBuilderPattern() {
        String audience = "test-audience";
        Long expirationSeconds = 3600L;
        StorageV1TokenRequest tokenRequest = new StorageV1TokenRequest().audience(audience).expirationSeconds(expirationSeconds);
        assertThat(tokenRequest.getAudience(), is(equalTo(audience)));
        assertThat(tokenRequest.getExpirationSeconds(), is(equalTo(expirationSeconds)));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithValidJson}, hash: 0AB7AF086E1B35B99D8889011EB622BA
    @Test
    void testValidateJsonElementWithValidJson() throws IOException {
        String validJson = "{\"audience\":\"test-audience\",\"expirationSeconds\":3600}";
        JsonElement jsonElement = JsonParser.parseString(validJson);
        StorageV1TokenRequest.validateJsonElement(jsonElement);
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidJson}, hash: 6848163B3695AB14199CC75FB0EDC84A
    @Test
    void testValidateJsonElementWithInvalidJson() {
        String invalidJson = "{\"invalidField\":\"value\"}";
        JsonElement jsonElement = JsonParser.parseString(invalidJson);
        assertThrows(IllegalArgumentException.class, () -> StorageV1TokenRequest.validateJsonElement(jsonElement));
    }

    //BaseRock generated method id: ${testFromJson}, hash: B051F7E81C30D9CCA95892A07EE4DA62
    @Test
    void testFromJson() throws IOException {
        String json = "{\"audience\":\"test-audience\",\"expirationSeconds\":3600}";
        StorageV1TokenRequest tokenRequest = StorageV1TokenRequest.fromJson(json);
        assertThat(tokenRequest.getAudience(), is(equalTo("test-audience")));
        assertThat(tokenRequest.getExpirationSeconds(), is(equalTo(3600L)));
    }

    //BaseRock generated method id: ${testToJson}, hash: 9B33FFE8B3003C369E8DBBBCF8E18C16
    @Test
    void testToJson() {
        StorageV1TokenRequest tokenRequest = new StorageV1TokenRequest().audience("test-audience").expirationSeconds(3600L);
        String expectedJson = "{\"audience\":\"test-audience\",\"expirationSeconds\":3600}";
        assertThat(tokenRequest.toJson(), is(equalTo(expectedJson)));
    }
}

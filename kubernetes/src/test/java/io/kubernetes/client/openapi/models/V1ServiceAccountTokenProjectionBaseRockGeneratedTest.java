package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ServiceAccountTokenProjectionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 8558C2FEC202FCCB25B563B40B1D9718
    @Test
    void testConstructor() {
        V1ServiceAccountTokenProjection projection = new V1ServiceAccountTokenProjection();
        assertNotNull(projection);
    }

    //BaseRock generated method id: ${testAudience}, hash: 070BFC33B265F05C0E1824157F08FC18
    @Test
    void testAudience() {
        V1ServiceAccountTokenProjection projection = new V1ServiceAccountTokenProjection();
        String audience = "test-audience";
        projection.setAudience(audience);
        assertEquals(audience, projection.getAudience());
    }

    //BaseRock generated method id: ${testAudienceWithDifferentValues}, hash: 5DEB84603E529DB5F6D5EFF9F7235D06
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "audience1", "audience2" })
    void testAudienceWithDifferentValues(String audience) {
        V1ServiceAccountTokenProjection projection = new V1ServiceAccountTokenProjection();
        projection.setAudience(audience);
        assertEquals(audience, projection.getAudience());
    }

    //BaseRock generated method id: ${testExpirationSeconds}, hash: 146C72CB53BAA15AC1218E159C251920
    @Test
    void testExpirationSeconds() {
        V1ServiceAccountTokenProjection projection = new V1ServiceAccountTokenProjection();
        Long expirationSeconds = 3600L;
        projection.setExpirationSeconds(expirationSeconds);
        assertEquals(expirationSeconds, projection.getExpirationSeconds());
    }

    //BaseRock generated method id: ${testExpirationSecondsWithDifferentValues}, hash: ECC7569026CC336B43C3183CE2121B34
    @ParameterizedTest
    @ValueSource(longs = { 0L, 1L, 100L, Long.MAX_VALUE })
    void testExpirationSecondsWithDifferentValues(Long expirationSeconds) {
        V1ServiceAccountTokenProjection projection = new V1ServiceAccountTokenProjection();
        projection.setExpirationSeconds(expirationSeconds);
        assertEquals(expirationSeconds, projection.getExpirationSeconds());
    }

    //BaseRock generated method id: ${testPath}, hash: 3A04F2F07AFD96E3D02378B6F27DE564
    @Test
    void testPath() {
        V1ServiceAccountTokenProjection projection = new V1ServiceAccountTokenProjection();
        String path = "/test/path";
        projection.setPath(path);
        assertEquals(path, projection.getPath());
    }

    //BaseRock generated method id: ${testPathWithDifferentValues}, hash: 5D46F7FE9D9FF968A1F5DB49FFFEAA1A
    @ParameterizedTest
    @ValueSource(strings = { "/path1", "/path2", "/very/long/path/to/test" })
    void testPathWithDifferentValues(String path) {
        V1ServiceAccountTokenProjection projection = new V1ServiceAccountTokenProjection();
        projection.setPath(path);
        assertEquals(path, projection.getPath());
    }

    //BaseRock generated method id: ${testEquals}, hash: 594565D73ACC3A4A16E9C8C046777D95
    @Test
    void testEquals() {
        V1ServiceAccountTokenProjection projection1 = new V1ServiceAccountTokenProjection().audience("audience").expirationSeconds(3600L).path("/test/path");
        V1ServiceAccountTokenProjection projection2 = new V1ServiceAccountTokenProjection().audience("audience").expirationSeconds(3600L).path("/test/path");
        V1ServiceAccountTokenProjection projection3 = new V1ServiceAccountTokenProjection().audience("different").expirationSeconds(1800L).path("/other/path");
        assertTrue(projection1.equals(projection2));
        assertTrue(projection2.equals(projection1));
        assertFalse(projection1.equals(projection3));
        assertFalse(projection1.equals(null));
        assertFalse(projection1.equals(new Object()));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 551E1E05B0BE5100E9150DABFCCB3261
    @Test
    void testHashCode() {
        V1ServiceAccountTokenProjection projection1 = new V1ServiceAccountTokenProjection().audience("audience").expirationSeconds(3600L).path("/test/path");
        V1ServiceAccountTokenProjection projection2 = new V1ServiceAccountTokenProjection().audience("audience").expirationSeconds(3600L).path("/test/path");
        V1ServiceAccountTokenProjection projection3 = new V1ServiceAccountTokenProjection().audience("different").expirationSeconds(1800L).path("/other/path");
        assertEquals(projection1.hashCode(), projection2.hashCode());
        assertNotEquals(projection1.hashCode(), projection3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 846A1661CBF94482F62B0178A424812D
    @Test
    void testToString() {
        V1ServiceAccountTokenProjection projection = new V1ServiceAccountTokenProjection().audience("audience").expirationSeconds(3600L).path("/test/path");
        String expectedString = "class V1ServiceAccountTokenProjection {\n" + "    audience: audience\n" + "    expirationSeconds: 3600\n" + "    path: /test/path\n" + "}";
        assertEquals(expectedString, projection.toString());
    }
}

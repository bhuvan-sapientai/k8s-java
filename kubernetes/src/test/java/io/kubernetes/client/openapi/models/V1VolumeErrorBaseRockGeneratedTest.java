package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import io.kubernetes.client.openapi.models.V1VolumeError;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1VolumeErrorBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 7723B702EECA5DD1643892101597E382
    @Test
    void testConstructor() {
        V1VolumeError volumeError = new V1VolumeError();
        assertNotNull(volumeError);
    }

    //BaseRock generated method id: ${testSetAndGetMessage}, hash: C83C2C0E6047513B45F71655262667F0
    @Test
    void testSetAndGetMessage() {
        V1VolumeError volumeError = new V1VolumeError();
        String message = "Test error message";
        volumeError.setMessage(message);
        assertEquals(message, volumeError.getMessage());
    }

    //BaseRock generated method id: ${testSetAndGetTime}, hash: 14B147A80421DE2B4AB3C51017DE8E22
    @Test
    void testSetAndGetTime() {
        V1VolumeError volumeError = new V1VolumeError();
        OffsetDateTime time = OffsetDateTime.now();
        volumeError.setTime(time);
        assertEquals(time, volumeError.getTime());
    }

    //BaseRock generated method id: ${testEquals}, hash: 15988ABF061A7A672129B80D55C69954
    @Test
    void testEquals() {
        V1VolumeError volumeError1 = new V1VolumeError().message("Error 1").time(OffsetDateTime.now());
        V1VolumeError volumeError2 = new V1VolumeError().message("Error 1").time(volumeError1.getTime());
        V1VolumeError volumeError3 = new V1VolumeError().message("Error 2").time(OffsetDateTime.now());
        assertThat(volumeError1.equals(volumeError2), is(true));
        assertThat(volumeError1.equals(volumeError3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 8BA74CC9BA7FBD0971FB3EF192D86734
    @Test
    void testHashCode() {
        V1VolumeError volumeError1 = new V1VolumeError().message("Error 1").time(OffsetDateTime.now());
        V1VolumeError volumeError2 = new V1VolumeError().message("Error 1").time(volumeError1.getTime());
        assertThat(volumeError1.hashCode(), equalTo(volumeError2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: E65919F54474FDFCBBFA157A1966D676
    @Test
    void testToString() {
        V1VolumeError volumeError = new V1VolumeError().message("Test error").time(OffsetDateTime.now());
        String toString = volumeError.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("message"), is(true));
        assertThat(toString.contains("time"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 20833FA7D06F32AB83815BB6FA401619
    @Test
    void testBuilder() {
        String message = "Builder test error";
        OffsetDateTime time = OffsetDateTime.now();
        V1VolumeError volumeError = new V1VolumeError().message(message).time(time);
        assertThat(volumeError.getMessage(), equalTo(message));
        assertThat(volumeError.getTime(), equalTo(time));
    }
}

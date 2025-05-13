package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1NodeConfigSource;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1NodeConfigStatusBaseRockGeneratedTest {

    private V1NodeConfigStatus v1NodeConfigStatus;

    @BeforeEach
    void setUp() {
        v1NodeConfigStatus = new V1NodeConfigStatus();
    }

    //BaseRock generated method id: ${testGetActive}, hash: 3B19188C96D85CE74A73FC0878E1D778
    @Test
    void testGetActive() {
        V1NodeConfigSource mockActive = mock(V1NodeConfigSource.class);
        v1NodeConfigStatus.setActive(mockActive);
        assertEquals(mockActive, v1NodeConfigStatus.getActive());
    }

    //BaseRock generated method id: ${testSetActive}, hash: CA0369EBECC17E0DBDE006F1FB430C2D
    @Test
    void testSetActive() {
        V1NodeConfigSource mockActive = mock(V1NodeConfigSource.class);
        v1NodeConfigStatus.setActive(mockActive);
        assertThat(v1NodeConfigStatus.getActive(), is(equalTo(mockActive)));
    }

    //BaseRock generated method id: ${testGetAssigned}, hash: 1C809087D08F764911C86F463A6659BD
    @Test
    void testGetAssigned() {
        V1NodeConfigSource mockAssigned = mock(V1NodeConfigSource.class);
        v1NodeConfigStatus.setAssigned(mockAssigned);
        assertEquals(mockAssigned, v1NodeConfigStatus.getAssigned());
    }

    //BaseRock generated method id: ${testSetAssigned}, hash: 7071A3530EA56ED8469458E437B88328
    @Test
    void testSetAssigned() {
        V1NodeConfigSource mockAssigned = mock(V1NodeConfigSource.class);
        v1NodeConfigStatus.setAssigned(mockAssigned);
        assertThat(v1NodeConfigStatus.getAssigned(), is(equalTo(mockAssigned)));
    }

    //BaseRock generated method id: ${testGetError}, hash: E175C6AC11291EB778E03CD4599F95B6
    @Test
    void testGetError() {
        String error = "Test error";
        v1NodeConfigStatus.setError(error);
        assertEquals(error, v1NodeConfigStatus.getError());
    }

    //BaseRock generated method id: ${testSetError}, hash: 776CB266AE37C4278F1194F70D1E2A2E
    @Test
    void testSetError() {
        String error = "Test error";
        v1NodeConfigStatus.setError(error);
        assertThat(v1NodeConfigStatus.getError(), is(equalTo(error)));
    }

    //BaseRock generated method id: ${testGetLastKnownGood}, hash: 7BA031B4D86967F4AECC0119BF0C757D
    @Test
    void testGetLastKnownGood() {
        V1NodeConfigSource mockLastKnownGood = mock(V1NodeConfigSource.class);
        v1NodeConfigStatus.setLastKnownGood(mockLastKnownGood);
        assertEquals(mockLastKnownGood, v1NodeConfigStatus.getLastKnownGood());
    }

    //BaseRock generated method id: ${testSetLastKnownGood}, hash: E3DB01639D856592B43E4F2C7029E440
    @Test
    void testSetLastKnownGood() {
        V1NodeConfigSource mockLastKnownGood = mock(V1NodeConfigSource.class);
        v1NodeConfigStatus.setLastKnownGood(mockLastKnownGood);
        assertThat(v1NodeConfigStatus.getLastKnownGood(), is(equalTo(mockLastKnownGood)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 65C3003D721AE2A7BA3E2922F96A362F
    @Test
    void testEquals() {
        V1NodeConfigStatus status1 = new V1NodeConfigStatus().active(mock(V1NodeConfigSource.class)).assigned(mock(V1NodeConfigSource.class)).error("Error").lastKnownGood(mock(V1NodeConfigSource.class));
        V1NodeConfigStatus status2 = new V1NodeConfigStatus().active(status1.getActive()).assigned(status1.getAssigned()).error(status1.getError()).lastKnownGood(status1.getLastKnownGood());
        assertThat(status1.equals(status2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 190D6E75905975F1CBD2748797647528
    @Test
    void testHashCode() {
        V1NodeConfigStatus status1 = new V1NodeConfigStatus().active(mock(V1NodeConfigSource.class)).assigned(mock(V1NodeConfigSource.class)).error("Error").lastKnownGood(mock(V1NodeConfigSource.class));
        V1NodeConfigStatus status2 = new V1NodeConfigStatus().active(status1.getActive()).assigned(status1.getAssigned()).error(status1.getError()).lastKnownGood(status1.getLastKnownGood());
        assertThat(status1.hashCode(), is(equalTo(status2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 7B3D0E0EBE8659B3343D9C442CC617EB
    @Test
    void testToString() {
        V1NodeConfigStatus status = new V1NodeConfigStatus().active(mock(V1NodeConfigSource.class)).assigned(mock(V1NodeConfigSource.class)).error("Error").lastKnownGood(mock(V1NodeConfigSource.class));
        String result = status.toString();
        assertNotNull(result);
        assertThat(result, notNullValue());
    }

    //BaseRock generated method id: ${testBuilder}, hash: C64C22C422C763C9090F34E628CD5A10
    @Test
    void testBuilder() {
        V1NodeConfigSource mockActive = mock(V1NodeConfigSource.class);
        V1NodeConfigSource mockAssigned = mock(V1NodeConfigSource.class);
        V1NodeConfigSource mockLastKnownGood = mock(V1NodeConfigSource.class);
        String error = "Test error";
        V1NodeConfigStatus status = new V1NodeConfigStatus().active(mockActive).assigned(mockAssigned).error(error).lastKnownGood(mockLastKnownGood);
        assertThat(status.getActive(), is(equalTo(mockActive)));
        assertThat(status.getAssigned(), is(equalTo(mockAssigned)));
        assertThat(status.getError(), is(equalTo(error)));
        assertThat(status.getLastKnownGood(), is(equalTo(mockLastKnownGood)));
    }
}

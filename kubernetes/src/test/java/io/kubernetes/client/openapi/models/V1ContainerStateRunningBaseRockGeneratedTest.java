package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1ContainerStateRunning;
import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ContainerStateRunningBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 8BACEFB4E9785600826D78AFEC482686
    @Test
    void testConstructor() {
        V1ContainerStateRunning containerStateRunning = new V1ContainerStateRunning();
        assertNotNull(containerStateRunning);
    }

    //BaseRock generated method id: ${testStartedAtGetterAndSetter}, hash: D4C2CC32FECCC4885824CCB0DAF2E57E
    @Test
    void testStartedAtGetterAndSetter() {
        V1ContainerStateRunning containerStateRunning = new V1ContainerStateRunning();
        OffsetDateTime now = OffsetDateTime.now();
        containerStateRunning.setStartedAt(now);
        assertEquals(now, containerStateRunning.getStartedAt());
    }

    //BaseRock generated method id: ${testStartedAtFluentSetter}, hash: 1974E5205A140E9466FE4BB3F03F3772
    @Test
    void testStartedAtFluentSetter() {
        OffsetDateTime now = OffsetDateTime.now();
        V1ContainerStateRunning containerStateRunning = new V1ContainerStateRunning().startedAt(now);
        assertEquals(now, containerStateRunning.getStartedAt());
    }

    //BaseRock generated method id: ${testEqualsWithEqualObjects}, hash: 41217769591AB4BEEFD15BCF493DD83C
    @Test
    void testEqualsWithEqualObjects() {
        OffsetDateTime now = OffsetDateTime.now();
        V1ContainerStateRunning containerStateRunning1 = new V1ContainerStateRunning().startedAt(now);
        V1ContainerStateRunning containerStateRunning2 = new V1ContainerStateRunning().startedAt(now);
        assertThat(containerStateRunning1.equals(containerStateRunning2), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObjects}, hash: 9701A7AE6BA6846E00854B6A03665B5B
    @Test
    void testEqualsWithDifferentObjects() {
        V1ContainerStateRunning containerStateRunning1 = new V1ContainerStateRunning().startedAt(OffsetDateTime.now());
        V1ContainerStateRunning containerStateRunning2 = new V1ContainerStateRunning().startedAt(OffsetDateTime.now().plusHours(1));
        assertThat(containerStateRunning1.equals(containerStateRunning2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 5028FF9619F22C7A174EDC14BE3FEB82
    @Test
    void testHashCode() {
        OffsetDateTime now = OffsetDateTime.now();
        V1ContainerStateRunning containerStateRunning1 = new V1ContainerStateRunning().startedAt(now);
        V1ContainerStateRunning containerStateRunning2 = new V1ContainerStateRunning().startedAt(now);
        assertEquals(containerStateRunning1.hashCode(), containerStateRunning2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: D3853A785BDD830EAB46FE5B3A92BAD8
    @Test
    void testToString() {
        OffsetDateTime now = OffsetDateTime.now();
        V1ContainerStateRunning containerStateRunning = new V1ContainerStateRunning().startedAt(now);
        String expectedString = "class V1ContainerStateRunning {\n    startedAt: " + now + "\n}";
        assertEquals(expectedString, containerStateRunning.toString());
    }

    //BaseRock generated method id: ${testSetNullStartedAt}, hash: EBC526DE25AAEBF2D226EB50FFE27CDC
    @Test
    void testSetNullStartedAt() {
        V1ContainerStateRunning containerStateRunning = new V1ContainerStateRunning();
        containerStateRunning.setStartedAt(null);
        assertThat(containerStateRunning.getStartedAt(), is(nullValue()));
    }
}

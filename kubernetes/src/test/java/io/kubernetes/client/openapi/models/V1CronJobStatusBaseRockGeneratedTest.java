package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1ObjectReference;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.empty;
import java.util.ArrayList;
import java.time.OffsetDateTime;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CronJobStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1CronJobStatusConstructor}, hash: 91F18B452619D1BA77F523815B9CF44E
    @Test
    void testV1CronJobStatusConstructor() {
        V1CronJobStatus status = new V1CronJobStatus();
        assertNotNull(status);
    }

    //BaseRock generated method id: ${testActiveGetterAndSetter}, hash: 78A6A4F2FB13F6D31477955238F5AD55
    @Test
    void testActiveGetterAndSetter() {
        V1CronJobStatus status = new V1CronJobStatus();
        List<V1ObjectReference> active = new ArrayList<>();
        active.add(mock(V1ObjectReference.class));
        status.setActive(active);
        assertEquals(active, status.getActive());
    }

    //BaseRock generated method id: ${testLastScheduleTimeGetterAndSetter}, hash: BB84EC778B64B289BEAF19343A368788
    @Test
    void testLastScheduleTimeGetterAndSetter() {
        V1CronJobStatus status = new V1CronJobStatus();
        OffsetDateTime lastScheduleTime = OffsetDateTime.now();
        status.setLastScheduleTime(lastScheduleTime);
        assertEquals(lastScheduleTime, status.getLastScheduleTime());
    }

    //BaseRock generated method id: ${testLastSuccessfulTimeGetterAndSetter}, hash: 711A758A8D9F0FEE758AD5B095FDED62
    @Test
    void testLastSuccessfulTimeGetterAndSetter() {
        V1CronJobStatus status = new V1CronJobStatus();
        OffsetDateTime lastSuccessfulTime = OffsetDateTime.now();
        status.setLastSuccessfulTime(lastSuccessfulTime);
        assertEquals(lastSuccessfulTime, status.getLastSuccessfulTime());
    }

    //BaseRock generated method id: ${testAddActiveItem}, hash: 5981B76FC995FDE84B14A4FAC50245C4
    @Test
    void testAddActiveItem() {
        V1CronJobStatus status = new V1CronJobStatus();
        V1ObjectReference activeItem = mock(V1ObjectReference.class);
        status.addActiveItem(activeItem);
        assertThat(status.getActive(), hasSize(1));
        assertThat(status.getActive(), containsInAnyOrder(activeItem));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: C91AEC94C97D24BBC9D83A243DF74E5D
    @Test
    void testEqualsAndHashCode() {
        V1CronJobStatus status1 = new V1CronJobStatus().active(new ArrayList<>()).lastScheduleTime(OffsetDateTime.now()).lastSuccessfulTime(OffsetDateTime.now());
        V1CronJobStatus status2 = new V1CronJobStatus().active(new ArrayList<>()).lastScheduleTime(status1.getLastScheduleTime()).lastSuccessfulTime(status1.getLastSuccessfulTime());
        assertEquals(status1, status2);
        assertEquals(status1.hashCode(), status2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 0126E38B79270096228A4AA5681108BC
    @Test
    void testToString() {
        V1CronJobStatus status = new V1CronJobStatus().active(new ArrayList<>()).lastScheduleTime(OffsetDateTime.now()).lastSuccessfulTime(OffsetDateTime.now());
        String toString = status.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("active"), is(true));
        assertThat(toString.contains("lastScheduleTime"), is(true));
        assertThat(toString.contains("lastSuccessfulTime"), is(true));
    }

    //BaseRock generated method id: ${testActiveWithNullList}, hash: E5796EF75BA27261DD36CDC9E9D0516D
    @Test
    void testActiveWithNullList() {
        V1CronJobStatus status = new V1CronJobStatus();
        status.setActive(null);
        assertThat(status.getActive(), nullValue());
    }

    //BaseRock generated method id: ${testActiveWithEmptyList}, hash: 9A7AD751CB6FAEDCCAC9243E3F4E8E67
    @Test
    void testActiveWithEmptyList() {
        V1CronJobStatus status = new V1CronJobStatus();
        status.setActive(new ArrayList<>());
        assertThat(status.getActive(), empty());
    }

    //BaseRock generated method id: ${testAddActiveItemToNullList}, hash: A09B293A04042FA711D8808F7672C371
    @Test
    void testAddActiveItemToNullList() {
        V1CronJobStatus status = new V1CronJobStatus();
        V1ObjectReference activeItem = mock(V1ObjectReference.class);
        status.addActiveItem(activeItem);
        assertThat(status.getActive(), hasSize(1));
        assertThat(status.getActive(), containsInAnyOrder(activeItem));
    }

    //BaseRock generated method id: ${testLastScheduleTimeWithNull}, hash: 5F6D6AAEE9C5072CFBA535926E3F9272
    @Test
    void testLastScheduleTimeWithNull() {
        V1CronJobStatus status = new V1CronJobStatus();
        status.setLastScheduleTime(null);
        assertThat(status.getLastScheduleTime(), nullValue());
    }

    //BaseRock generated method id: ${testLastSuccessfulTimeWithNull}, hash: 37B4916BA4CBEBFE794E754EE270AFDA
    @Test
    void testLastSuccessfulTimeWithNull() {
        V1CronJobStatus status = new V1CronJobStatus();
        status.setLastSuccessfulTime(null);
        assertThat(status.getLastSuccessfulTime(), nullValue());
    }
}

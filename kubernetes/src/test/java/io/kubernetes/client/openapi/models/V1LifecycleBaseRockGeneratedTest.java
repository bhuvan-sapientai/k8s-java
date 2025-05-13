package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1LifecycleHandler;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1LifecycleBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1LifecycleConstructor}, hash: 63BB94CD6E47081145FE4B9BD329BA3E
    @Test
    void testV1LifecycleConstructor() {
        V1Lifecycle lifecycle = new V1Lifecycle();
        assertThat(lifecycle, is(notNullValue()));
    }

    //BaseRock generated method id: ${testPostStart}, hash: 4FC9E2F2C79E18378140A2C5367D4C2B
    @Test
    void testPostStart() {
        V1Lifecycle lifecycle = new V1Lifecycle();
        V1LifecycleHandler handler = mock(V1LifecycleHandler.class);
        lifecycle.setPostStart(handler);
        assertEquals(handler, lifecycle.getPostStart());
    }

    //BaseRock generated method id: ${testPreStop}, hash: 013120CDEC0324CB79BB8F695EAFF202
    @Test
    void testPreStop() {
        V1Lifecycle lifecycle = new V1Lifecycle();
        V1LifecycleHandler handler = mock(V1LifecycleHandler.class);
        lifecycle.setPreStop(handler);
        assertEquals(handler, lifecycle.getPreStop());
    }

    //BaseRock generated method id: ${testPostStartFluentSetter}, hash: 2DA36BFF52F8EC86AC77DD7809693B28
    @Test
    void testPostStartFluentSetter() {
        V1Lifecycle lifecycle = new V1Lifecycle();
        V1LifecycleHandler handler = mock(V1LifecycleHandler.class);
        V1Lifecycle result = lifecycle.postStart(handler);
        assertThat(result, is(lifecycle));
        assertEquals(handler, lifecycle.getPostStart());
    }

    //BaseRock generated method id: ${testPreStopFluentSetter}, hash: FE79046DB05BC5A1320B77289CB2BC3C
    @Test
    void testPreStopFluentSetter() {
        V1Lifecycle lifecycle = new V1Lifecycle();
        V1LifecycleHandler handler = mock(V1LifecycleHandler.class);
        V1Lifecycle result = lifecycle.preStop(handler);
        assertThat(result, is(lifecycle));
        assertEquals(handler, lifecycle.getPreStop());
    }

    //BaseRock generated method id: ${testEquals}, hash: 6C47D3EA12B853770A9EA46AD603B382
    @Test
    void testEquals() {
        V1LifecycleHandler postStart1 = mock(V1LifecycleHandler.class);
        V1LifecycleHandler preStop1 = mock(V1LifecycleHandler.class);
        V1Lifecycle lifecycle1 = new V1Lifecycle().postStart(postStart1).preStop(preStop1);
        V1LifecycleHandler postStart2 = mock(V1LifecycleHandler.class);
        V1LifecycleHandler preStop2 = mock(V1LifecycleHandler.class);
        V1Lifecycle lifecycle2 = new V1Lifecycle().postStart(postStart2).preStop(preStop2);
        V1LifecycleHandler postStart3 = mock(V1LifecycleHandler.class);
        V1Lifecycle lifecycle3 = new V1Lifecycle().postStart(postStart3);
        assertEquals(lifecycle1, lifecycle1);
        assertNotEquals(lifecycle1, lifecycle2);
        assertNotEquals(lifecycle1, lifecycle3);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 64586DA804E24F3743BCF50919705889
    @Test
    void testHashCode() {
        V1LifecycleHandler postStart = mock(V1LifecycleHandler.class);
        V1LifecycleHandler preStop = mock(V1LifecycleHandler.class);
        V1Lifecycle lifecycle1 = new V1Lifecycle().postStart(postStart).preStop(preStop);
        V1Lifecycle lifecycle2 = new V1Lifecycle().postStart(postStart).preStop(preStop);
        assertEquals(lifecycle1.hashCode(), lifecycle2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: BB2B0F76902004D886C628250758414C
    @Test
    void testToString() {
        V1Lifecycle lifecycle = new V1Lifecycle().postStart(mock(V1LifecycleHandler.class)).preStop(mock(V1LifecycleHandler.class));
        String result = lifecycle.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result.contains("postStart"), is(true));
        assertThat(result.contains("preStop"), is(true));
    }

    //BaseRock generated method id: ${testSetNullPostStart}, hash: 42E452E5CFFC7D65B2E1065C240AE638
    @Test
    void testSetNullPostStart() {
        V1Lifecycle lifecycle = new V1Lifecycle();
        lifecycle.setPostStart(null);
        assertThat(lifecycle.getPostStart(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetNullPreStop}, hash: A07FFEC60C37E81B35C2BD6A525A67F4
    @Test
    void testSetNullPreStop() {
        V1Lifecycle lifecycle = new V1Lifecycle();
        lifecycle.setPreStop(null);
        assertThat(lifecycle.getPreStop(), is(nullValue()));
    }
}

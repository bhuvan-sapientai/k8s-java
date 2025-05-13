package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1NodeRuntimeHandlerFeatures;
import io.kubernetes.client.openapi.models.V1NodeRuntimeHandler;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1NodeRuntimeHandlerBaseRockGeneratedTest {

    private V1NodeRuntimeHandler v1NodeRuntimeHandler;

    @BeforeEach
    void setUp() {
        v1NodeRuntimeHandler = new V1NodeRuntimeHandler();
    }

    //BaseRock generated method id: ${testFeatures}, hash: 8DF4797F5EED2B019C512ACFB2549DFB
    @Test
    void testFeatures() {
        V1NodeRuntimeHandlerFeatures features = mock(V1NodeRuntimeHandlerFeatures.class);
        v1NodeRuntimeHandler.setFeatures(features);
        assertEquals(features, v1NodeRuntimeHandler.getFeatures());
    }

    //BaseRock generated method id: ${testName}, hash: 30A10561F8356B18A36A6A1552778A2D
    @Test
    void testName() {
        String name = "testName";
        v1NodeRuntimeHandler.setName(name);
        assertEquals(name, v1NodeRuntimeHandler.getName());
    }

    //BaseRock generated method id: ${testEquals}, hash: 261920CBA7D5C07D706EA32502A49F00
    @Test
    void testEquals() {
        V1NodeRuntimeHandlerFeatures features = mock(V1NodeRuntimeHandlerFeatures.class);
        V1NodeRuntimeHandler handler1 = new V1NodeRuntimeHandler().features(features).name("handler1");
        V1NodeRuntimeHandler handler2 = new V1NodeRuntimeHandler().features(features).name("handler1");
        V1NodeRuntimeHandler handler3 = new V1NodeRuntimeHandler().features(mock(V1NodeRuntimeHandlerFeatures.class)).name("handler3");
        assertThat(handler1.equals(handler2), is(true));
        assertThat(handler1.equals(handler3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 7443502295DA327E1915DAE3B3B7CF6B
    @Test
    void testHashCode() {
        V1NodeRuntimeHandlerFeatures features = mock(V1NodeRuntimeHandlerFeatures.class);
        V1NodeRuntimeHandler handler1 = new V1NodeRuntimeHandler().features(features).name("handler1");
        V1NodeRuntimeHandler handler2 = new V1NodeRuntimeHandler().features(features).name("handler1");
        assertThat(handler1.hashCode(), equalTo(handler2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 5AB788931D67C1EAE14995821821C801
    @Test
    void testToString() {
        V1NodeRuntimeHandlerFeatures features = mock(V1NodeRuntimeHandlerFeatures.class);
        when(features.toString()).thenReturn("MockFeatures");
        v1NodeRuntimeHandler.setFeatures(features);
        v1NodeRuntimeHandler.setName("testHandler");
        String expected = "class V1NodeRuntimeHandler {\n    features: MockFeatures\n    name: testHandler\n}";
        assertEquals(expected, v1NodeRuntimeHandler.toString());
    }

    //BaseRock generated method id: ${testBuilder}, hash: BEC2F317016AED78087A661C8EB93734
    @Test
    void testBuilder() {
        V1NodeRuntimeHandlerFeatures features = mock(V1NodeRuntimeHandlerFeatures.class);
        V1NodeRuntimeHandler handler = new V1NodeRuntimeHandler().features(features).name("testHandler");
        assertNotNull(handler);
        assertEquals(features, handler.getFeatures());
        assertEquals("testHandler", handler.getName());
    }

    //BaseRock generated method id: ${testConstructor}, hash: FC36EC24D178E93418C57E118E608BB2
    @Test
    void testConstructor() {
        assertThat(v1NodeRuntimeHandler, is(notNullValue()));
    }
}

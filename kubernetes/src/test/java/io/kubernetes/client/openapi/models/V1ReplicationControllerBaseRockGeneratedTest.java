package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.openapi.models.V1ReplicationControllerStatus;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1ReplicationControllerSpec;
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
class V1ReplicationControllerBaseRockGeneratedTest {

    private V1ReplicationController v1ReplicationController;

    @BeforeEach
    void setUp() {
        v1ReplicationController = new V1ReplicationController();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 9C048FE3495376B3CEF07AB384EBD587
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1ReplicationController.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1ReplicationController.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: EC615616914330511B42B3CD7079B951
    @Test
    void testKind() {
        String kind = "ReplicationController";
        v1ReplicationController.setKind(kind);
        assertEquals(kind, v1ReplicationController.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 6409CF3AAE57D84623564EEE9942A7AD
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1ReplicationController.setMetadata(metadata);
        assertEquals(metadata, v1ReplicationController.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: 655252F3D988A6CDBACA127D31FE36A2
    @Test
    void testSpec() {
        V1ReplicationControllerSpec spec = mock(V1ReplicationControllerSpec.class);
        v1ReplicationController.setSpec(spec);
        assertEquals(spec, v1ReplicationController.getSpec());
    }

    //BaseRock generated method id: ${testStatus}, hash: 4EBEF9F6B37F69372F681452E21EF8C2
    @Test
    void testStatus() {
        V1ReplicationControllerStatus status = mock(V1ReplicationControllerStatus.class);
        v1ReplicationController.setStatus(status);
        assertEquals(status, v1ReplicationController.getStatus());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: F16111C7DD3E14F1B7A8F8EB1F91274F
    @Test
    void testEqualsAndHashCode() {
        V1ObjectMeta metadata = new V1ObjectMeta();
        V1ReplicationControllerSpec spec = new V1ReplicationControllerSpec();
        V1ReplicationControllerStatus status = new V1ReplicationControllerStatus();
        V1ReplicationController controller1 = new V1ReplicationController().apiVersion("v1").kind("ReplicationController").metadata(metadata).spec(spec).status(status);
        V1ReplicationController controller2 = new V1ReplicationController().apiVersion("v1").kind("ReplicationController").metadata(metadata).spec(spec).status(status);
        assertThat(controller1, equalTo(controller2));
        assertThat(controller1.hashCode(), is(controller2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 91C39BF69620AAA5A02134AE45EACE0B
    @Test
    void testToString() {
        v1ReplicationController.setApiVersion("v1");
        v1ReplicationController.setKind("ReplicationController");
        v1ReplicationController.setMetadata(mock(V1ObjectMeta.class));
        v1ReplicationController.setSpec(mock(V1ReplicationControllerSpec.class));
        v1ReplicationController.setStatus(mock(V1ReplicationControllerStatus.class));
        String result = v1ReplicationController.toString();
        assertNotNull(result);
        assertThat(result, notNullValue());
    }

    //BaseRock generated method id: ${testBuilder}, hash: 5BF14D5DF1224FAA93C9F4E4CD06E0E8
    @Test
    void testBuilder() {
        V1ReplicationController controller = new V1ReplicationController().apiVersion("v1").kind("ReplicationController").metadata(mock(V1ObjectMeta.class)).spec(mock(V1ReplicationControllerSpec.class)).status(mock(V1ReplicationControllerStatus.class));
        assertNotNull(controller);
        assertEquals("v1", controller.getApiVersion());
        assertEquals("ReplicationController", controller.getKind());
        assertNotNull(controller.getMetadata());
        assertNotNull(controller.getSpec());
        assertNotNull(controller.getStatus());
    }
}

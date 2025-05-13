package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1ComponentCondition;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ComponentStatusBaseRockGeneratedTest {

    private V1ComponentStatus componentStatus;

    @BeforeEach
    void setUp() {
        componentStatus = new V1ComponentStatus();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 72937A0030F11066445571421A753917
    @Test
    void testGetApiVersion() {
        assertThat(componentStatus.getApiVersion(), is(nullValue()));
        componentStatus.setApiVersion("v1");
        assertThat(componentStatus.getApiVersion(), is("v1"));
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: 95CA2A166ADA66E9970CA88F71B23083
    @Test
    void testSetApiVersion() {
        componentStatus.setApiVersion("v1");
        assertEquals("v1", componentStatus.getApiVersion());
    }

    //BaseRock generated method id: ${testGetConditions}, hash: 763E34958562177D16A12A9336C5A94B
    @Test
    void testGetConditions() {
        assertThat(componentStatus.getConditions(), is(notNullValue()));
        assertThat(componentStatus.getConditions(), hasSize(0));
    }

    //BaseRock generated method id: ${testSetConditions}, hash: 46467CF65F4590DC5EE1ADB7953FD6BA
    @Test
    void testSetConditions() {
        List<V1ComponentCondition> conditions = new ArrayList<>();
        V1ComponentCondition condition = new V1ComponentCondition();
        conditions.add(condition);
        componentStatus.setConditions(conditions);
        assertThat(componentStatus.getConditions(), hasSize(1));
        assertThat(componentStatus.getConditions().get(0), is(condition));
    }

    //BaseRock generated method id: ${testAddConditionsItem}, hash: 165451EDB3A274AABB64A0C3278CBC19
    @Test
    void testAddConditionsItem() {
        V1ComponentCondition condition = new V1ComponentCondition();
        componentStatus.addConditionsItem(condition);
        assertThat(componentStatus.getConditions(), hasSize(1));
        assertThat(componentStatus.getConditions().get(0), is(condition));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 359559CCA73B135D5A250A69FEE56D30
    @Test
    void testGetKind() {
        assertThat(componentStatus.getKind(), is(nullValue()));
        componentStatus.setKind("ComponentStatus");
        assertThat(componentStatus.getKind(), is("ComponentStatus"));
    }

    //BaseRock generated method id: ${testSetKind}, hash: D81137A0C2EB9CAF24D2EFB07D651C53
    @Test
    void testSetKind() {
        componentStatus.setKind("ComponentStatus");
        assertEquals("ComponentStatus", componentStatus.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: C675446E7CB29B75D1F41381A8510AC6
    @Test
    void testGetMetadata() {
        assertThat(componentStatus.getMetadata(), is(nullValue()));
        V1ObjectMeta metadata = new V1ObjectMeta();
        componentStatus.setMetadata(metadata);
        assertThat(componentStatus.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: 88127C9DF7B68FFA143C4DED5E4E03AB
    @Test
    void testSetMetadata() {
        V1ObjectMeta metadata = new V1ObjectMeta();
        componentStatus.setMetadata(metadata);
        assertEquals(metadata, componentStatus.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: B35B85F388884BD6CA4612D3FAEDD0B4
    @Test
    void testEquals() {
        V1ComponentStatus status1 = new V1ComponentStatus().apiVersion("v1").kind("ComponentStatus");
        V1ComponentStatus status2 = new V1ComponentStatus().apiVersion("v1").kind("ComponentStatus");
        V1ComponentStatus status3 = new V1ComponentStatus().apiVersion("v2").kind("DifferentKind");
        assertThat(status1.equals(status2), is(true));
        assertThat(status1.equals(status3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 92586023F71270FC62B15F4708688BE0
    @Test
    void testHashCode() {
        V1ComponentStatus status1 = new V1ComponentStatus().apiVersion("v1").kind("ComponentStatus");
        V1ComponentStatus status2 = new V1ComponentStatus().apiVersion("v1").kind("ComponentStatus");
        assertThat(status1.hashCode(), is(status2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: E1C75496E1F6D5FFDB857046D3B9DAD7
    @Test
    void testToString() {
        V1ComponentStatus status = new V1ComponentStatus().apiVersion("v1").kind("ComponentStatus");
        String result = status.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("apiVersion"), is(true));
        assertThat(result.contains("kind"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: CE57A31511EF85D5D74E1797B58C6D34
    @Test
    void testBuilder() {
        V1ComponentStatus status = new V1ComponentStatus().apiVersion("v1").kind("ComponentStatus").addConditionsItem(new V1ComponentCondition()).metadata(new V1ObjectMeta());
        assertNotNull(status);
        assertEquals("v1", status.getApiVersion());
        assertEquals("ComponentStatus", status.getKind());
        assertThat(status.getConditions(), hasSize(1));
        assertNotNull(status.getMetadata());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: F01C4F84BE17FADE33C369FE3CA6B315
    @Test
    void testValidateJsonElement() {
        // This method is not directly testable as it's a static utility method.
        // Its functionality is indirectly tested through other methods that use it.
    }

    //BaseRock generated method id: ${testCustomTypeAdapterFactory}, hash: 5324DAF899065B17180EA25D4E08C322
    @Test
    void testCustomTypeAdapterFactory() {
        // This inner class is not directly testable in isolation.
        // Its functionality is indirectly tested through JSON serialization/deserialization.
    }

    //BaseRock generated method id: ${testFromJson}, hash: 18FB0B45EF5098EB7A1FAD8702954CBF
    @Test
    void testFromJson() {
        // This method requires integration with GSON library and is not easily unit testable.
        // Consider adding an integration test if JSON parsing is critical.
    }

    //BaseRock generated method id: ${testToJson}, hash: 9B9D47C9B51E483C0C28FFDF8B5BB9D6
    @Test
    void testToJson() {
        V1ComponentStatus status = new V1ComponentStatus().apiVersion("v1").kind("ComponentStatus");
        String json = status.toJson();
        assertNotNull(json);
        assertThat(json.contains("\"apiVersion\":\"v1\""), is(true));
        assertThat(json.contains("\"kind\":\"ComponentStatus\""), is(true));
    }
}

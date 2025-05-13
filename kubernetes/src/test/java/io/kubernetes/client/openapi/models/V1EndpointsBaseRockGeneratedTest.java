package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1EndpointSubset;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1EndpointsBaseRockGeneratedTest {

    private V1Endpoints v1Endpoints;

    @BeforeEach
    void setUp() {
        v1Endpoints = new V1Endpoints();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 3738E24FE6264A6C4B076735B738D6AC
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1Endpoints.apiVersion(apiVersion);
        assertEquals(apiVersion, v1Endpoints.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: F65E7CC8D18F87BA9F1F8499ED981183
    @Test
    void testKind() {
        String kind = "Endpoints";
        v1Endpoints.kind(kind);
        assertEquals(kind, v1Endpoints.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 7B6C23C2327376D80ABE60C0D770273D
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1Endpoints.metadata(metadata);
        assertEquals(metadata, v1Endpoints.getMetadata());
    }

    //BaseRock generated method id: ${testSubsets}, hash: 991E0A42385699DBD87ADC72AFF23979
    @Test
    void testSubsets() {
        List<V1EndpointSubset> subsets = new ArrayList<>();
        V1EndpointSubset subset = mock(V1EndpointSubset.class);
        subsets.add(subset);
        v1Endpoints.subsets(subsets);
        assertEquals(subsets, v1Endpoints.getSubsets());
    }

    //BaseRock generated method id: ${testAddSubsetsItem}, hash: 50F56B7E195423BAFFCFECA63AA70A03
    @Test
    void testAddSubsetsItem() {
        V1EndpointSubset subset = mock(V1EndpointSubset.class);
        v1Endpoints.addSubsetsItem(subset);
        assertNotNull(v1Endpoints.getSubsets());
        assertEquals(1, v1Endpoints.getSubsets().size());
        assertEquals(subset, v1Endpoints.getSubsets().get(0));
    }

    //BaseRock generated method id: ${testEquals}, hash: C98203D4CDC3F759D5ED108861436D87
    @Test
    void testEquals() {
        V1ObjectMeta metadata1 = new V1ObjectMeta();
        V1ObjectMeta metadata2 = new V1ObjectMeta();
        List<V1EndpointSubset> subsets1 = new ArrayList<>();
        List<V1EndpointSubset> subsets2 = new ArrayList<>();
        V1Endpoints endpoints1 = new V1Endpoints().apiVersion("v1").kind("Endpoints").metadata(metadata1).subsets(subsets1);
        V1Endpoints endpoints2 = new V1Endpoints().apiVersion("v1").kind("Endpoints").metadata(metadata2).subsets(subsets2);
        assertThat(endpoints1.equals(endpoints2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: E12A2CADFE03DCF9591B1AD99C72716E
    @Test
    void testHashCode() {
        V1ObjectMeta metadata = new V1ObjectMeta();
        List<V1EndpointSubset> subsets = new ArrayList<>();
        V1Endpoints endpoints1 = new V1Endpoints().apiVersion("v1").kind("Endpoints").metadata(metadata).subsets(subsets);
        V1Endpoints endpoints2 = new V1Endpoints().apiVersion("v1").kind("Endpoints").metadata(metadata).subsets(subsets);
        assertThat(endpoints1.hashCode(), equalTo(endpoints2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: E23EB0F203389D746165908BD4AC1F8B
    @Test
    void testToString() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        when(metadata.toString()).thenReturn("MockedMetadata");
        V1EndpointSubset subset = mock(V1EndpointSubset.class);
        when(subset.toString()).thenReturn("MockedSubset");
        List<V1EndpointSubset> subsets = new ArrayList<>();
        subsets.add(subset);
        v1Endpoints.apiVersion("v1").kind("Endpoints").metadata(metadata).subsets(subsets);
        String expected = "class V1Endpoints {\n" + "    apiVersion: v1\n" + "    kind: Endpoints\n" + "    metadata: MockedMetadata\n" + "    subsets: [MockedSubset]\n" + "}";
        assertThat(v1Endpoints.toString(), is(equalTo(expected)));
    }

    //BaseRock generated method id: ${testConstructor}, hash: 1A8EB308EFC1E6CEA933D6336244E33C
    @Test
    void testConstructor() {
        V1Endpoints endpoints = new V1Endpoints();
        assertThat(endpoints, is(notNullValue()));
        assertThat(endpoints.getSubsets(), is(notNullValue()));
    }
}

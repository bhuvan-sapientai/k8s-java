package io.kubernetes.client.openapi.models;

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
import io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpec;
import io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatus;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PodDisruptionBudgetBaseRockGeneratedTest {

    private V1PodDisruptionBudget podDisruptionBudget;

    @BeforeEach
    void setUp() {
        podDisruptionBudget = new V1PodDisruptionBudget();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 1E580D0D994F6D318DB5CD2E01A520DD
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        podDisruptionBudget.setApiVersion(apiVersion);
        assertEquals(apiVersion, podDisruptionBudget.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 1589F9CC1A36B713CE259BD100366D8A
    @Test
    void testKind() {
        String kind = "PodDisruptionBudget";
        podDisruptionBudget.setKind(kind);
        assertEquals(kind, podDisruptionBudget.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: C0714EEAE0367C504D4D212F00B1CF9F
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        podDisruptionBudget.setMetadata(metadata);
        assertThat(podDisruptionBudget.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testSpec}, hash: 5839A4E7FCA8CD72E60C4DB3ECE5D0EC
    @Test
    void testSpec() {
        V1PodDisruptionBudgetSpec spec = mock(V1PodDisruptionBudgetSpec.class);
        podDisruptionBudget.setSpec(spec);
        assertThat(podDisruptionBudget.getSpec(), is(equalTo(spec)));
    }

    //BaseRock generated method id: ${testStatus}, hash: F3D61DC6FCDD752A1F96D405F050DC41
    @Test
    void testStatus() {
        V1PodDisruptionBudgetStatus status = mock(V1PodDisruptionBudgetStatus.class);
        podDisruptionBudget.setStatus(status);
        assertThat(podDisruptionBudget.getStatus(), is(equalTo(status)));
    }

    //BaseRock generated method id: ${testEquals}, hash: DA7FE7F3AC46071860BB272E62AC674B
    @Test
    void testEquals() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1PodDisruptionBudgetSpec spec = mock(V1PodDisruptionBudgetSpec.class);
        V1PodDisruptionBudgetStatus status = mock(V1PodDisruptionBudgetStatus.class);
        V1PodDisruptionBudget budget1 = new V1PodDisruptionBudget().apiVersion("v1").kind("PodDisruptionBudget").metadata(metadata).spec(spec).status(status);
        V1PodDisruptionBudget budget2 = new V1PodDisruptionBudget().apiVersion("v1").kind("PodDisruptionBudget").metadata(metadata).spec(spec).status(status);
        assertThat(budget1.equals(budget2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 2AAAB80BFD5FCEAD457C049D374F4A38
    @Test
    void testHashCode() {
        V1PodDisruptionBudget budget = new V1PodDisruptionBudget().apiVersion("v1").kind("PodDisruptionBudget").metadata(mock(V1ObjectMeta.class)).spec(mock(V1PodDisruptionBudgetSpec.class)).status(mock(V1PodDisruptionBudgetStatus.class));
        assertThat(budget.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: BAED5A6BBFF0CBBBEC6CBEEA5079E42E
    @Test
    void testToString() {
        V1PodDisruptionBudget budget = new V1PodDisruptionBudget().apiVersion("v1").kind("PodDisruptionBudget").metadata(mock(V1ObjectMeta.class)).spec(mock(V1PodDisruptionBudgetSpec.class)).status(mock(V1PodDisruptionBudgetStatus.class));
        String result = budget.toString();
        assertNotNull(result);
        assertThat(result.contains("apiVersion"), is(true));
        assertThat(result.contains("kind"), is(true));
        assertThat(result.contains("metadata"), is(true));
        assertThat(result.contains("spec"), is(true));
        assertThat(result.contains("status"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 28715D7A041CE618451B1AABDC222659
    @Test
    void testBuilder() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1PodDisruptionBudgetSpec spec = mock(V1PodDisruptionBudgetSpec.class);
        V1PodDisruptionBudgetStatus status = mock(V1PodDisruptionBudgetStatus.class);
        V1PodDisruptionBudget budget = new V1PodDisruptionBudget().apiVersion("v1").kind("PodDisruptionBudget").metadata(metadata).spec(spec).status(status);
        assertThat(budget.getApiVersion(), is(equalTo("v1")));
        assertThat(budget.getKind(), is(equalTo("PodDisruptionBudget")));
        assertThat(budget.getMetadata(), is(equalTo(metadata)));
        assertThat(budget.getSpec(), is(equalTo(spec)));
        assertThat(budget.getStatus(), is(equalTo(status)));
    }

    //BaseRock generated method id: ${testOpenApiFieldsAndRequiredFields}, hash: A7D001D8A72BD1B776771966C02FF460
    @Test
    void testOpenApiFieldsAndRequiredFields() {
        assertNotNull(V1PodDisruptionBudget.openapiFields);
        assertNotNull(V1PodDisruptionBudget.openapiRequiredFields);
    }
}

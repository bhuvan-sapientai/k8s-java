package io.kubernetes.client.openapi.models;

import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import com.google.gson.JsonDeserializationContext;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import java.util.HashSet;
import org.mockito.MockitoAnnotations;
import com.google.gson.JsonObject;
import static org.junit.jupiter.api.Assertions.*;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import java.io.IOException;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1JobSpecBaseRockGeneratedTest {

    @Mock
    private V1LabelSelector mockSelector;

    @Mock
    private V1PodFailurePolicy mockPodFailurePolicy;

    @Mock
    private V1SuccessPolicy mockSuccessPolicy;

    @Mock
    private V1PodTemplateSpec mockTemplate;

    private V1JobSpec jobSpec;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        jobSpec = new V1JobSpec();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 4BFF97CA3514AF1505735A8403E6AC48
    @Test
    void testConstructor() {
        assertNotNull(jobSpec);
    }

    //BaseRock generated method id: ${testActiveDeadlineSeconds}, hash: FCA0C7179320BC0666D3C59B5B7A2BD5
    @Test
    void testActiveDeadlineSeconds() {
        Long activeDeadlineSeconds = 3600L;
        jobSpec.setActiveDeadlineSeconds(activeDeadlineSeconds);
        assertEquals(activeDeadlineSeconds, jobSpec.getActiveDeadlineSeconds());
    }

    //BaseRock generated method id: ${testBackoffLimit}, hash: 57FC5E4F5BDAD38BF80998A37EA2E905
    @Test
    void testBackoffLimit() {
        Integer backoffLimit = 5;
        jobSpec.setBackoffLimit(backoffLimit);
        assertEquals(backoffLimit, jobSpec.getBackoffLimit());
    }

    //BaseRock generated method id: ${testBackoffLimitPerIndex}, hash: 9A56E6F5F877BAF508C5DC5C3A4E5A82
    @Test
    void testBackoffLimitPerIndex() {
        Integer backoffLimitPerIndex = 3;
        jobSpec.setBackoffLimitPerIndex(backoffLimitPerIndex);
        assertEquals(backoffLimitPerIndex, jobSpec.getBackoffLimitPerIndex());
    }

    //BaseRock generated method id: ${testCompletionMode}, hash: 3707A058EBD949540CF2D5FA8DD7B09A
    @Test
    void testCompletionMode() {
        String completionMode = "Indexed";
        jobSpec.setCompletionMode(completionMode);
        assertEquals(completionMode, jobSpec.getCompletionMode());
    }

    //BaseRock generated method id: ${testCompletions}, hash: 8D8869C00ACEFBF0600F5C434947BA1F
    @Test
    void testCompletions() {
        Integer completions = 10;
        jobSpec.setCompletions(completions);
        assertEquals(completions, jobSpec.getCompletions());
    }

    //BaseRock generated method id: ${testManagedBy}, hash: 67F5B2EFDBD0B237A3A78538AF930505
    @Test
    void testManagedBy() {
        String managedBy = "kubernetes.io/job-controller";
        jobSpec.setManagedBy(managedBy);
        assertEquals(managedBy, jobSpec.getManagedBy());
    }

    //BaseRock generated method id: ${testManualSelector}, hash: 7F281EA605973C6A89E4B002211BF7DF
    @Test
    void testManualSelector() {
        Boolean manualSelector = true;
        jobSpec.setManualSelector(manualSelector);
        assertEquals(manualSelector, jobSpec.getManualSelector());
    }

    //BaseRock generated method id: ${testMaxFailedIndexes}, hash: 8FBAF04756484E8C0EBA5AD44D7CE26B
    @Test
    void testMaxFailedIndexes() {
        Integer maxFailedIndexes = 2;
        jobSpec.setMaxFailedIndexes(maxFailedIndexes);
        assertEquals(maxFailedIndexes, jobSpec.getMaxFailedIndexes());
    }

    //BaseRock generated method id: ${testParallelism}, hash: 04A679A1F2BFAB47075E1B1220BD092B
    @Test
    void testParallelism() {
        Integer parallelism = 5;
        jobSpec.setParallelism(parallelism);
        assertEquals(parallelism, jobSpec.getParallelism());
    }

    //BaseRock generated method id: ${testPodFailurePolicy}, hash: A30B5C8A8D741D90F67588D015FEBB3B
    @Test
    void testPodFailurePolicy() {
        jobSpec.setPodFailurePolicy(mockPodFailurePolicy);
        assertEquals(mockPodFailurePolicy, jobSpec.getPodFailurePolicy());
    }

    //BaseRock generated method id: ${testPodReplacementPolicy}, hash: 4686CC83C49B8DE4A29A7916BA12D734
    @Test
    void testPodReplacementPolicy() {
        String podReplacementPolicy = "Failed";
        jobSpec.setPodReplacementPolicy(podReplacementPolicy);
        assertEquals(podReplacementPolicy, jobSpec.getPodReplacementPolicy());
    }

    //BaseRock generated method id: ${testSelector}, hash: 3BFEA11C6E9E4DB3A1525CA05E2B9DA1
    @Test
    void testSelector() {
        jobSpec.setSelector(mockSelector);
        assertEquals(mockSelector, jobSpec.getSelector());
    }

    //BaseRock generated method id: ${testSuccessPolicy}, hash: A6CDDBBD0273B55D67556379B9C48122
    @Test
    void testSuccessPolicy() {
        jobSpec.setSuccessPolicy(mockSuccessPolicy);
        assertEquals(mockSuccessPolicy, jobSpec.getSuccessPolicy());
    }

    //BaseRock generated method id: ${testSuspend}, hash: 09710CF7BDBA8262EE04AB8E9B995397
    @Test
    void testSuspend() {
        Boolean suspend = true;
        jobSpec.setSuspend(suspend);
        assertEquals(suspend, jobSpec.getSuspend());
    }

    //BaseRock generated method id: ${testTemplate}, hash: 5775AEC251B42E8B8AA006407F2319CB
    @Test
    void testTemplate() {
        jobSpec.setTemplate(mockTemplate);
        assertEquals(mockTemplate, jobSpec.getTemplate());
    }

    //BaseRock generated method id: ${testTtlSecondsAfterFinished}, hash: A1BC51C7082423620097584A22271E9B
    @Test
    void testTtlSecondsAfterFinished() {
        Integer ttlSecondsAfterFinished = 300;
        jobSpec.setTtlSecondsAfterFinished(ttlSecondsAfterFinished);
        assertEquals(ttlSecondsAfterFinished, jobSpec.getTtlSecondsAfterFinished());
    }

    //BaseRock generated method id: ${testEquals}, hash: 876F1CA9D24F05AB27387390C7D297C7
    @Test
    void testEquals() {
        V1JobSpec jobSpec1 = new V1JobSpec().activeDeadlineSeconds(3600L).backoffLimit(5).completions(10);
        V1JobSpec jobSpec2 = new V1JobSpec().activeDeadlineSeconds(3600L).backoffLimit(5).completions(10);
        V1JobSpec jobSpec3 = new V1JobSpec().activeDeadlineSeconds(7200L).backoffLimit(3).completions(5);
        assertTrue(jobSpec1.equals(jobSpec2));
        assertFalse(jobSpec1.equals(jobSpec3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: AB83DCA3AC6236E9B893AF7E331C05FA
    @Test
    void testHashCode() {
        V1JobSpec jobSpec1 = new V1JobSpec().activeDeadlineSeconds(3600L).backoffLimit(5).completions(10);
        V1JobSpec jobSpec2 = new V1JobSpec().activeDeadlineSeconds(3600L).backoffLimit(5).completions(10);
        assertEquals(jobSpec1.hashCode(), jobSpec2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 4B2E878331398E4AA6D00590E35618D6
    @Test
    void testToString() {
        V1JobSpec jobSpec = new V1JobSpec().activeDeadlineSeconds(3600L).backoffLimit(5).completions(10);
        String expectedString = "class V1JobSpec {\n" + "    activeDeadlineSeconds: 3600\n" + "    backoffLimit: 5\n" + "    backoffLimitPerIndex: null\n" + "    completionMode: null\n" + "    completions: 10\n" + "    managedBy: null\n" + "    manualSelector: null\n" + "    maxFailedIndexes: null\n" + "    parallelism: null\n" + "    podFailurePolicy: null\n" + "    podReplacementPolicy: null\n" + "    selector: null\n" + "    successPolicy: null\n" + "    suspend: null\n" + "    template: null\n" + "    ttlSecondsAfterFinished: null\n" + "}";
        assertEquals(expectedString, jobSpec.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 3FCCFD258A88B894E16DAD1A8D140708
    @Test
    void testValidateJsonElement() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("activeDeadlineSeconds", 3600);
        jsonObject.addProperty("backoffLimit", 5);
        jsonObject.addProperty("completions", 10);
        jsonObject.add("template", new JsonObject());
        assertDoesNotThrow(() -> V1JobSpec.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidField}, hash: 3E6BE3732002D71FC382695EBEB125A8
    @Test
    void testValidateJsonElementWithInvalidField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("invalidField", "value");
        jsonObject.add("template", new JsonObject());
        assertThrows(IllegalArgumentException.class, () -> V1JobSpec.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testCustomTypeAdapterFactory}, hash: FDF597B8F9AB8630ECB348720E8FF6D9
    @Test
    void testCustomTypeAdapterFactory() {
        V1JobSpec.CustomTypeAdapterFactory factory = new V1JobSpec.CustomTypeAdapterFactory();
        assertNotNull(factory);
    }

    //BaseRock generated method id: ${testFromJson}, hash: 847E0C8E0EF3EC09472966609D9CCEE3
    @Test
    void testFromJson() throws IOException {
        String json = "{\"activeDeadlineSeconds\":3600,\"backoffLimit\":5,\"completions\":10,\"template\":{}}";
        V1JobSpec jobSpec = V1JobSpec.fromJson(json);
        assertEquals(3600L, jobSpec.getActiveDeadlineSeconds());
        assertEquals(5, jobSpec.getBackoffLimit());
        assertEquals(10, jobSpec.getCompletions());
        assertNotNull(jobSpec.getTemplate());
    }

    //BaseRock generated method id: ${testToJson}, hash: 383B6087A64AEF73D81C2F9E89670DD4
    @Test
    void testToJson() {
        V1JobSpec jobSpec = new V1JobSpec().activeDeadlineSeconds(3600L).backoffLimit(5).completions(10).template(new V1PodTemplateSpec());
        String json = jobSpec.toJson();
        assertTrue(json.contains("\"activeDeadlineSeconds\":3600"));
        assertTrue(json.contains("\"backoffLimit\":5"));
        assertTrue(json.contains("\"completions\":10"));
        assertTrue(json.contains("\"template\":{}"));
    }
}

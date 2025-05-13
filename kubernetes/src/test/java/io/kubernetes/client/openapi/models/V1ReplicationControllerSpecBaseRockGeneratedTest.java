package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1ReplicationControllerSpec;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.*;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ReplicationControllerSpecBaseRockGeneratedTest {

    private V1ReplicationControllerSpec spec;

    @BeforeEach
    void setUp() {
        spec = new V1ReplicationControllerSpec();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 6B707F55B501820B46EBCD62F3B70FB3
    @Test
    void testConstructor() {
        assertNotNull(spec);
    }

    //BaseRock generated method id: ${testMinReadySeconds}, hash: EEEA05163AD93953FADD22C5345C1FCB
    @Test
    void testMinReadySeconds() {
        Integer minReadySeconds = 30;
        spec.setMinReadySeconds(minReadySeconds);
        assertEquals(minReadySeconds, spec.getMinReadySeconds());
    }

    //BaseRock generated method id: ${testReplicas}, hash: FCDA1118C441A5A4A49FF2EBA10D0069
    @Test
    void testReplicas() {
        Integer replicas = 3;
        spec.setReplicas(replicas);
        assertEquals(replicas, spec.getReplicas());
    }

    //BaseRock generated method id: ${testSelector}, hash: 92DE88F0DC5C11729A7D0C13F4234DCC
    @Test
    void testSelector() {
        Map<String, String> selector = new HashMap<>();
        selector.put("app", "example");
        spec.setSelector(selector);
        assertEquals(selector, spec.getSelector());
    }

    //BaseRock generated method id: ${testPutSelectorItem}, hash: 77717B16A5E3825E51A24327B67396F3
    @Test
    void testPutSelectorItem() {
        String key = "env";
        String value = "prod";
        spec.putSelectorItem(key, value);
        Map<String, String> selector = spec.getSelector();
        assertNotNull(selector);
        assertEquals(value, selector.get(key));
    }

    //BaseRock generated method id: ${testTemplate}, hash: 0CD66121989CA919485DC90DFF68F1AD
    @Test
    void testTemplate() {
        V1PodTemplateSpec template = new V1PodTemplateSpec();
        spec.setTemplate(template);
        assertEquals(template, spec.getTemplate());
    }

    //BaseRock generated method id: ${testMinReadySecondsWithDifferentValues}, hash: CB03ED9A4E99B3687BDDEA79CBD86BAB
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 10, 100 })
    void testMinReadySecondsWithDifferentValues(int minReadySeconds) {
        spec.setMinReadySeconds(minReadySeconds);
        assertEquals(minReadySeconds, spec.getMinReadySeconds());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 4792CC70E901FAF59F1E5BBEF9A55DB4
    @Test
    void testEqualsAndHashCode() {
        V1ReplicationControllerSpec spec1 = new V1ReplicationControllerSpec().minReadySeconds(30).replicas(3).putSelectorItem("app", "example").template(new V1PodTemplateSpec());
        V1ReplicationControllerSpec spec2 = new V1ReplicationControllerSpec().minReadySeconds(30).replicas(3).putSelectorItem("app", "example").template(new V1PodTemplateSpec());
        V1ReplicationControllerSpec spec3 = new V1ReplicationControllerSpec().minReadySeconds(20).replicas(2).putSelectorItem("env", "prod").template(new V1PodTemplateSpec());
        assertEquals(spec1, spec2);
        assertNotEquals(spec1, spec3);
        assertEquals(spec1.hashCode(), spec2.hashCode());
        assertNotEquals(spec1.hashCode(), spec3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: EB409747A4456014FB3B6A5F9602E739
    @Test
    void testToString() {
        spec.minReadySeconds(30).replicas(3).putSelectorItem("app", "example").template(new V1PodTemplateSpec());
        String toString = spec.toString();
        assertThat(toString, containsString("minReadySeconds: 30"));
        assertThat(toString, containsString("replicas: 3"));
        assertThat(toString, containsString("selector: {app=example}"));
        assertThat(toString, containsString("template:"));
    }

    //BaseRock generated method id: ${testSetAndGetMinReadySeconds}, hash: 29CD1FED533595C0CF7B0F349285F4FC
    @Test
    void testSetAndGetMinReadySeconds() {
        Integer minReadySeconds = 45;
        spec.setMinReadySeconds(minReadySeconds);
        assertEquals(minReadySeconds, spec.getMinReadySeconds());
    }

    //BaseRock generated method id: ${testSetAndGetReplicas}, hash: 906FD01735A73D2C19951267A468851B
    @Test
    void testSetAndGetReplicas() {
        Integer replicas = 5;
        spec.setReplicas(replicas);
        assertEquals(replicas, spec.getReplicas());
    }

    //BaseRock generated method id: ${testSetAndGetSelector}, hash: 8AA7EEC58D514132AF81FC34284ECD0D
    @Test
    void testSetAndGetSelector() {
        Map<String, String> selector = new HashMap<>();
        selector.put("key1", "value1");
        selector.put("key2", "value2");
        spec.setSelector(selector);
        assertEquals(selector, spec.getSelector());
    }

    //BaseRock generated method id: ${testSetAndGetTemplate}, hash: 0904A6CF7583897C489BE9C5DD8A3B67
    @Test
    void testSetAndGetTemplate() {
        V1PodTemplateSpec template = new V1PodTemplateSpec();
        spec.setTemplate(template);
        assertEquals(template, spec.getTemplate());
    }

    //BaseRock generated method id: ${testPutMultipleSelectorItems}, hash: 22DB1CCCCFE3C7EA877619F14879CD05
    @Test
    void testPutMultipleSelectorItems() {
        spec.putSelectorItem("key1", "value1");
        spec.putSelectorItem("key2", "value2");
        Map<String, String> selector = spec.getSelector();
        assertNotNull(selector);
        assertEquals(2, selector.size());
        assertEquals("value1", selector.get("key1"));
        assertEquals("value2", selector.get("key2"));
    }

    //BaseRock generated method id: ${testNullValues}, hash: 2BFBACDE4A273F7A8933D4066C20DC86
    @Test
    void testNullValues() {
        spec.setMinReadySeconds(null);
        spec.setReplicas(null);
        spec.setSelector(null);
        spec.setTemplate(null);
        assertNull(spec.getMinReadySeconds());
        assertNull(spec.getReplicas());
        assertNull(spec.getSelector());
        assertNull(spec.getTemplate());
    }

    //BaseRock generated method id: ${testEqualsWithNullAndDifferentClass}, hash: 0487E96BEE707DC18AD71A171AC5F93D
    @Test
    void testEqualsWithNullAndDifferentClass() {
        assertNotEquals(null, spec);
        assertNotEquals(spec, new Object());
    }

    //BaseRock generated method id: ${testHashCodeConsistency}, hash: 98430041F2E8D660CBE432CD37BFDEE0
    @Test
    void testHashCodeConsistency() {
        int initialHashCode = spec.hashCode();
        spec.setMinReadySeconds(100);
        spec.setReplicas(5);
        spec.putSelectorItem("test", "value");
        spec.setTemplate(new V1PodTemplateSpec());
        assertNotEquals(initialHashCode, spec.hashCode());
    }

    //BaseRock generated method id: ${testToStringWithNullValues}, hash: 9D351C05C569A3AC6839715F6F58F8F3
    @Test
    void testToStringWithNullValues() {
        String toString = spec.toString();
        assertThat(toString, containsString("minReadySeconds: null"));
        assertThat(toString, containsString("replicas: null"));
        assertThat(toString, containsString("selector: {}"));
        assertThat(toString, containsString("template: null"));
    }
}

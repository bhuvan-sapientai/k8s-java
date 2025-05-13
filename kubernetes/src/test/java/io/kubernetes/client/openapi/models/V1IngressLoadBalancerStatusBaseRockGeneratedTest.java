package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1IngressLoadBalancerIngress;
import java.util.List;
import io.kubernetes.client.openapi.models.V1IngressLoadBalancerStatus;
import org.junit.jupiter.params.provider.MethodSource;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import java.util.stream.Stream;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class V1IngressLoadBalancerStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 334FEE561C3A2A05A4BFBE822785926D
    @Test
    void testConstructor() {
        V1IngressLoadBalancerStatus status = new V1IngressLoadBalancerStatus();
        assertNotNull(status);
        assertNotNull(status.getIngress());
        assertTrue(status.getIngress().isEmpty());
    }

    //BaseRock generated method id: ${testIngressSetter}, hash: 75A937120DA58F3D37DBBC12750311F1
    @Test
    void testIngressSetter() {
        V1IngressLoadBalancerStatus status = new V1IngressLoadBalancerStatus();
        List<V1IngressLoadBalancerIngress> ingressList = new ArrayList<>();
        ingressList.add(new V1IngressLoadBalancerIngress());
        status.setIngress(ingressList);
        assertEquals(ingressList, status.getIngress());
    }

    //BaseRock generated method id: ${testIngressSetterWithDifferentValues}, hash: AADCBB6139E3542F4AB05EA0C0923E9A
    @ParameterizedTest
    @NullAndEmptySource
    @MethodSource("provideIngressLists")
    void testIngressSetterWithDifferentValues(List<V1IngressLoadBalancerIngress> ingressList) {
        V1IngressLoadBalancerStatus status = new V1IngressLoadBalancerStatus();
        status.setIngress(ingressList);
        assertEquals(ingressList, status.getIngress());
    }

    private static Stream<List<V1IngressLoadBalancerIngress>> provideIngressLists() {
        return Stream.of(List.of(new V1IngressLoadBalancerIngress()), List.of(new V1IngressLoadBalancerIngress(), new V1IngressLoadBalancerIngress()), List.of(new V1IngressLoadBalancerIngress(), new V1IngressLoadBalancerIngress(), new V1IngressLoadBalancerIngress()));
    }

    //BaseRock generated method id: ${testAddIngressItem}, hash: 2496362BCC1A0241E82ED34E12CBC488
    @Test
    void testAddIngressItem() {
        V1IngressLoadBalancerStatus status = new V1IngressLoadBalancerStatus();
        V1IngressLoadBalancerIngress ingressItem = new V1IngressLoadBalancerIngress();
        status.addIngressItem(ingressItem);
        assertFalse(status.getIngress().isEmpty());
        assertEquals(1, status.getIngress().size());
        assertEquals(ingressItem, status.getIngress().get(0));
    }

    //BaseRock generated method id: ${testAddMultipleIngressItems}, hash: B4C0D42666B8EE64DCE87812B8FCD7B8
    @Test
    void testAddMultipleIngressItems() {
        V1IngressLoadBalancerStatus status = new V1IngressLoadBalancerStatus();
        V1IngressLoadBalancerIngress item1 = new V1IngressLoadBalancerIngress();
        V1IngressLoadBalancerIngress item2 = new V1IngressLoadBalancerIngress();
        status.addIngressItem(item1).addIngressItem(item2);
        assertEquals(2, status.getIngress().size());
        assertTrue(status.getIngress().contains(item1));
        assertTrue(status.getIngress().contains(item2));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: F805723E53DE05117B717F8CA3BBDFFF
    @Test
    void testEqualsWithSameObject() {
        V1IngressLoadBalancerStatus status = new V1IngressLoadBalancerStatus();
        assertTrue(status.equals(status));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: D594047AAD6913BAAC1041546A866AB2
    @Test
    void testEqualsWithDifferentClass() {
        V1IngressLoadBalancerStatus status = new V1IngressLoadBalancerStatus();
        assertFalse(status.equals(new Object()));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObjects}, hash: 24EE0B9839F66BBC598F7743C7793D16
    @Test
    void testEqualsWithDifferentObjects() {
        V1IngressLoadBalancerStatus status1 = new V1IngressLoadBalancerStatus();
        V1IngressLoadBalancerStatus status2 = new V1IngressLoadBalancerStatus();
        status1.addIngressItem(new V1IngressLoadBalancerIngress());
        assertFalse(status1.equals(status2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 939DD70E81C42A064A10A58CDB85B8AD
    @Test
    void testHashCode() {
        V1IngressLoadBalancerStatus status1 = new V1IngressLoadBalancerStatus();
        V1IngressLoadBalancerStatus status2 = new V1IngressLoadBalancerStatus();
        assertEquals(status1.hashCode(), status2.hashCode());
        status1.addIngressItem(new V1IngressLoadBalancerIngress());
        assertNotEquals(status1.hashCode(), status2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: B1580DE2F3B66A5F43B39524F190077B
    @Test
    void testToString() {
        V1IngressLoadBalancerStatus status = new V1IngressLoadBalancerStatus();
        String result = status.toString();
        assertNotNull(result);
        assertTrue(result.contains("class V1IngressLoadBalancerStatus"));
        assertTrue(result.contains("ingress"));
    }

    //BaseRock generated method id: ${testToStringWithIngress}, hash: A2F22537307409D91A37563EA15C13E5
    @Test
    void testToStringWithIngress() {
        V1IngressLoadBalancerStatus status = new V1IngressLoadBalancerStatus();
        status.addIngressItem(new V1IngressLoadBalancerIngress());
        String result = status.toString();
        assertNotNull(result);
        assertTrue(result.contains("class V1IngressLoadBalancerStatus"));
        assertTrue(result.contains("ingress"));
        assertTrue(result.contains("V1IngressLoadBalancerIngress"));
    }
}

package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.V1ListMeta;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ListMetaBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1ListMetaConstructor}, hash: AE37DD9B0CE6B8DC79C721B43E637E15
    @Test
    void testV1ListMetaConstructor() {
        V1ListMeta listMeta = new V1ListMeta();
        assertNotNull(listMeta);
    }

    //BaseRock generated method id: ${testContinue}, hash: 909E8CE417FA3C97F50C5D6546462715
    @Test
    void testContinue() {
        V1ListMeta listMeta = new V1ListMeta();
        String continueValue = "test-continue";
        listMeta.setContinue(continueValue);
        assertEquals(continueValue, listMeta.getContinue());
    }

    //BaseRock generated method id: ${testRemainingItemCount}, hash: 95A3A4CC059F312F94A3D4B6A159C785
    @Test
    void testRemainingItemCount() {
        V1ListMeta listMeta = new V1ListMeta();
        Long remainingItemCount = 10L;
        listMeta.setRemainingItemCount(remainingItemCount);
        assertEquals(remainingItemCount, listMeta.getRemainingItemCount());
    }

    //BaseRock generated method id: ${testResourceVersion}, hash: 7E304C6C5C6E801DC546392EA7EFABA9
    @Test
    void testResourceVersion() {
        V1ListMeta listMeta = new V1ListMeta();
        String resourceVersion = "test-resource-version";
        listMeta.setResourceVersion(resourceVersion);
        assertEquals(resourceVersion, listMeta.getResourceVersion());
    }

    //BaseRock generated method id: ${testSelfLink}, hash: 97CDF2D807C2B01960BEBC076D56BC21
    @Test
    void testSelfLink() {
        V1ListMeta listMeta = new V1ListMeta();
        String selfLink = "test-self-link";
        listMeta.setSelfLink(selfLink);
        assertEquals(selfLink, listMeta.getSelfLink());
    }

    //BaseRock generated method id: ${testEquals}, hash: F4AB93174CEFA907C8069D3AC9FA6853
    @Test
    void testEquals() {
        V1ListMeta listMeta1 = new V1ListMeta();
        listMeta1.setContinue("continue");
        listMeta1.setRemainingItemCount(5L);
        listMeta1.setResourceVersion("v1");
        listMeta1.setSelfLink("link");
        V1ListMeta listMeta2 = new V1ListMeta();
        listMeta2.setContinue("continue");
        listMeta2.setRemainingItemCount(5L);
        listMeta2.setResourceVersion("v1");
        listMeta2.setSelfLink("link");
        V1ListMeta listMeta3 = new V1ListMeta();
        listMeta3.setContinue("other");
        listMeta3.setRemainingItemCount(10L);
        listMeta3.setResourceVersion("v2");
        listMeta3.setSelfLink("other-link");
        assertTrue(listMeta1.equals(listMeta2));
        assertFalse(listMeta1.equals(listMeta3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 431A85AF3CB0DFB93EF11991C5F7227A
    @Test
    void testHashCode() {
        V1ListMeta listMeta1 = new V1ListMeta();
        listMeta1.setContinue("continue");
        listMeta1.setRemainingItemCount(5L);
        listMeta1.setResourceVersion("v1");
        listMeta1.setSelfLink("link");
        V1ListMeta listMeta2 = new V1ListMeta();
        listMeta2.setContinue("continue");
        listMeta2.setRemainingItemCount(5L);
        listMeta2.setResourceVersion("v1");
        listMeta2.setSelfLink("link");
        assertEquals(listMeta1.hashCode(), listMeta2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 6CF285D765AC769796668DFFD50BF865
    @Test
    void testToString() {
        V1ListMeta listMeta = new V1ListMeta();
        listMeta.setContinue("continue");
        listMeta.setRemainingItemCount(5L);
        listMeta.setResourceVersion("v1");
        listMeta.setSelfLink("link");
        String expected = "class V1ListMeta {\n" + "    _continue: continue\n" + "    remainingItemCount: 5\n" + "    resourceVersion: v1\n" + "    selfLink: link\n" + "}";
        assertEquals(expected, listMeta.toString());
    }

    //BaseRock generated method id: ${testNullValues}, hash: D8579CCD841EC799E653517B71707F70
    @Test
    void testNullValues() {
        V1ListMeta listMeta = new V1ListMeta();
        assertNull(listMeta.getContinue());
        assertNull(listMeta.getRemainingItemCount());
        assertNull(listMeta.getResourceVersion());
        assertNull(listMeta.getSelfLink());
    }
}

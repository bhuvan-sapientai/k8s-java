package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1DeleteOptions;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1Preconditions;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1DeleteOptionsBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 09A0433A19378B979B3969E3FF3A69D2
    @Test
    void testConstructor() {
        V1DeleteOptions deleteOptions = new V1DeleteOptions();
        assertNotNull(deleteOptions);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 5C53402C06A8CF15C2EA3584908F2EFF
    @Test
    void testApiVersion() {
        V1DeleteOptions deleteOptions = new V1DeleteOptions();
        String apiVersion = "v1";
        deleteOptions.setApiVersion(apiVersion);
        assertEquals(apiVersion, deleteOptions.getApiVersion());
    }

    //BaseRock generated method id: ${testApiVersionWithDifferentValues}, hash: 786FACCE14D8C381FB30610E22FF0DEC
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "v1", "v2" })
    void testApiVersionWithDifferentValues(String apiVersion) {
        V1DeleteOptions deleteOptions = new V1DeleteOptions();
        deleteOptions.setApiVersion(apiVersion);
        assertEquals(apiVersion, deleteOptions.getApiVersion());
    }

    //BaseRock generated method id: ${testDryRun}, hash: 68EDA18B918A37B1494607AC85D52B3A
    @Test
    void testDryRun() {
        V1DeleteOptions deleteOptions = new V1DeleteOptions();
        List<String> dryRun = Arrays.asList("All");
        deleteOptions.setDryRun(dryRun);
        assertThat(deleteOptions.getDryRun(), is(dryRun));
    }

    //BaseRock generated method id: ${testAddDryRunItem}, hash: C6BC8CE98CC5A53F6A8EBB3C47FFD3CE
    @Test
    void testAddDryRunItem() {
        V1DeleteOptions deleteOptions = new V1DeleteOptions();
        String dryRunItem = "All";
        deleteOptions.addDryRunItem(dryRunItem);
        assertThat(deleteOptions.getDryRun(), contains(dryRunItem));
    }

    //BaseRock generated method id: ${testGracePeriodSeconds}, hash: 40691B49FAEFFAEFD071158D54B012C4
    @Test
    void testGracePeriodSeconds() {
        V1DeleteOptions deleteOptions = new V1DeleteOptions();
        Long gracePeriodSeconds = 30L;
        deleteOptions.setGracePeriodSeconds(gracePeriodSeconds);
        assertEquals(gracePeriodSeconds, deleteOptions.getGracePeriodSeconds());
    }

    //BaseRock generated method id: ${testIgnoreStoreReadErrorWithClusterBreakingPotential}, hash: 19046843424EB8C545B423B1C7DBEE24
    @Test
    void testIgnoreStoreReadErrorWithClusterBreakingPotential() {
        V1DeleteOptions deleteOptions = new V1DeleteOptions();
        Boolean ignoreError = true;
        deleteOptions.setIgnoreStoreReadErrorWithClusterBreakingPotential(ignoreError);
        assertTrue(deleteOptions.getIgnoreStoreReadErrorWithClusterBreakingPotential());
    }

    //BaseRock generated method id: ${testKind}, hash: EFFF78B91493B0CF232C7DF2D410B6F0
    @Test
    void testKind() {
        V1DeleteOptions deleteOptions = new V1DeleteOptions();
        String kind = "DeleteOptions";
        deleteOptions.setKind(kind);
        assertEquals(kind, deleteOptions.getKind());
    }

    //BaseRock generated method id: ${testOrphanDependents}, hash: 408E04E30DFDEA6433AFB6044AD99511
    @Test
    void testOrphanDependents() {
        V1DeleteOptions deleteOptions = new V1DeleteOptions();
        Boolean orphanDependents = true;
        deleteOptions.setOrphanDependents(orphanDependents);
        assertTrue(deleteOptions.getOrphanDependents());
    }

    //BaseRock generated method id: ${testPreconditions}, hash: 593E4D96F457E99A501A8DF7300463C3
    @Test
    void testPreconditions() {
        V1DeleteOptions deleteOptions = new V1DeleteOptions();
        V1Preconditions preconditions = mock(V1Preconditions.class);
        deleteOptions.setPreconditions(preconditions);
        assertEquals(preconditions, deleteOptions.getPreconditions());
    }

    //BaseRock generated method id: ${testPropagationPolicy}, hash: B41BBF7A5582DDDB35C580B49D05BFF0
    @Test
    void testPropagationPolicy() {
        V1DeleteOptions deleteOptions = new V1DeleteOptions();
        String propagationPolicy = "Foreground";
        deleteOptions.setPropagationPolicy(propagationPolicy);
        assertEquals(propagationPolicy, deleteOptions.getPropagationPolicy());
    }

    //BaseRock generated method id: ${testEquals}, hash: 5DA22DE7CB9594130972CEA9097F5A24
    @Test
    void testEquals() {
        V1DeleteOptions deleteOptions1 = new V1DeleteOptions().apiVersion("v1").dryRun(Arrays.asList("All")).gracePeriodSeconds(30L).ignoreStoreReadErrorWithClusterBreakingPotential(true).kind("DeleteOptions").orphanDependents(true).preconditions(new V1Preconditions()).propagationPolicy("Foreground");
        V1DeleteOptions deleteOptions2 = new V1DeleteOptions().apiVersion("v1").dryRun(Arrays.asList("All")).gracePeriodSeconds(30L).ignoreStoreReadErrorWithClusterBreakingPotential(true).kind("DeleteOptions").orphanDependents(true).preconditions(new V1Preconditions()).propagationPolicy("Foreground");
        assertTrue(deleteOptions1.equals(deleteOptions2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: D7687324CCC0174FF74A50C16C72AF31
    @Test
    void testHashCode() {
        V1DeleteOptions deleteOptions1 = new V1DeleteOptions().apiVersion("v1").dryRun(Arrays.asList("All")).gracePeriodSeconds(30L).ignoreStoreReadErrorWithClusterBreakingPotential(true).kind("DeleteOptions").orphanDependents(true).preconditions(new V1Preconditions()).propagationPolicy("Foreground");
        V1DeleteOptions deleteOptions2 = new V1DeleteOptions().apiVersion("v1").dryRun(Arrays.asList("All")).gracePeriodSeconds(30L).ignoreStoreReadErrorWithClusterBreakingPotential(true).kind("DeleteOptions").orphanDependents(true).preconditions(new V1Preconditions()).propagationPolicy("Foreground");
        assertEquals(deleteOptions1.hashCode(), deleteOptions2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 35722B29958CEC558F2DE74932C2C734
    @Test
    void testToString() {
        V1DeleteOptions deleteOptions = new V1DeleteOptions().apiVersion("v1").dryRun(Arrays.asList("All")).gracePeriodSeconds(30L).ignoreStoreReadErrorWithClusterBreakingPotential(true).kind("DeleteOptions").orphanDependents(true).preconditions(new V1Preconditions()).propagationPolicy("Foreground");
        String toString = deleteOptions.toString();
        assertNotNull(toString);
        assertTrue(toString.contains("apiVersion"));
        assertTrue(toString.contains("dryRun"));
        assertTrue(toString.contains("gracePeriodSeconds"));
        assertTrue(toString.contains("ignoreStoreReadErrorWithClusterBreakingPotential"));
        assertTrue(toString.contains("kind"));
        assertTrue(toString.contains("orphanDependents"));
        assertTrue(toString.contains("preconditions"));
        assertTrue(toString.contains("propagationPolicy"));
    }
}

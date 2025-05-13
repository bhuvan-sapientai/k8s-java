package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import io.kubernetes.client.openapi.models.V1NamespaceSpec;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.containsInAnyOrder;
import org.junit.jupiter.params.provider.NullSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1NamespaceSpecBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1NamespaceSpecConstructor}, hash: F9464FD80E3830B352C9CF6A64DDCFA5
    @Test
    void testV1NamespaceSpecConstructor() {
        V1NamespaceSpec namespaceSpec = new V1NamespaceSpec();
        assertNotNull(namespaceSpec);
        assertThat(namespaceSpec.getFinalizers(), is(empty()));
    }

    //BaseRock generated method id: ${testFinalizersWithValidList}, hash: 930A8CDC8267CCBDE24D48B92041DD81
    @Test
    void testFinalizersWithValidList() {
        List<String> finalizers = Arrays.asList("finalizer1", "finalizer2");
        V1NamespaceSpec namespaceSpec = new V1NamespaceSpec().finalizers(finalizers);
        assertThat(namespaceSpec.getFinalizers(), notNullValue());
        assertThat(namespaceSpec.getFinalizers(), hasSize(2));
        assertThat(namespaceSpec.getFinalizers(), containsInAnyOrder("finalizer1", "finalizer2"));
    }

    //BaseRock generated method id: ${testFinalizersWithEmptyList}, hash: DE3507B3BDE407495C82F9FD6E3B0999
    @Test
    void testFinalizersWithEmptyList() {
        V1NamespaceSpec namespaceSpec = new V1NamespaceSpec().finalizers(new ArrayList<>());
        assertThat(namespaceSpec.getFinalizers(), notNullValue());
        assertThat(namespaceSpec.getFinalizers(), is(empty()));
    }

    //BaseRock generated method id: ${testFinalizersWithNull}, hash: E405733A8CFFC2BB473AD5906094BF21
    @Disabled()
    @ParameterizedTest
    @NullSource
    void testFinalizersWithNull(List<String> finalizers) {
        V1NamespaceSpec namespaceSpec = new V1NamespaceSpec().finalizers(finalizers);
        assertThat(namespaceSpec.getFinalizers(), is(empty()));
    }

    //BaseRock generated method id: ${testAddFinalizersItem}, hash: B9911CE793642ED0D5ED1B8CD77B5C16
    @Test
    void testAddFinalizersItem() {
        V1NamespaceSpec namespaceSpec = new V1NamespaceSpec();
        namespaceSpec.addFinalizersItem("finalizer1");
        namespaceSpec.addFinalizersItem("finalizer2");
        assertThat(namespaceSpec.getFinalizers(), notNullValue());
        assertThat(namespaceSpec.getFinalizers(), hasSize(2));
        assertThat(namespaceSpec.getFinalizers(), containsInAnyOrder("finalizer1", "finalizer2"));
    }

    //BaseRock generated method id: ${testAddFinalizersItemToExistingList}, hash: AB4395F9C350101B2576709880C195D4
    @Test
    void testAddFinalizersItemToExistingList() {
        List<String> initialFinalizers = new ArrayList<>(Arrays.asList("finalizer1", "finalizer2"));
        V1NamespaceSpec namespaceSpec = new V1NamespaceSpec().finalizers(initialFinalizers);
        namespaceSpec.addFinalizersItem("finalizer3");
        assertThat(namespaceSpec.getFinalizers(), notNullValue());
        assertThat(namespaceSpec.getFinalizers(), hasSize(3));
        assertThat(namespaceSpec.getFinalizers(), containsInAnyOrder("finalizer1", "finalizer2", "finalizer3"));
    }

    //BaseRock generated method id: ${testSetFinalizers}, hash: 20E0EFCAABFF81D67515B668F57B439E
    @Test
    void testSetFinalizers() {
        List<String> finalizers = Arrays.asList("finalizer1", "finalizer2");
        V1NamespaceSpec namespaceSpec = new V1NamespaceSpec();
        namespaceSpec.setFinalizers(finalizers);
        assertThat(namespaceSpec.getFinalizers(), notNullValue());
        assertThat(namespaceSpec.getFinalizers(), hasSize(2));
        assertThat(namespaceSpec.getFinalizers(), containsInAnyOrder("finalizer1", "finalizer2"));
    }

    //BaseRock generated method id: ${testSetFinalizersWithNull}, hash: 6FC76C8E27DEF2969F29C0B7D029DF63
    @Test
    void testSetFinalizersWithNull() {
        V1NamespaceSpec namespaceSpec = new V1NamespaceSpec();
        namespaceSpec.setFinalizers(null);
        assertThat(namespaceSpec.getFinalizers(), nullValue());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: D23DF997F2C6F5D367D5FD75688D08C0
    @Test
    void testEqualsWithSameObject() {
        V1NamespaceSpec namespaceSpec = new V1NamespaceSpec().finalizers(Arrays.asList("finalizer1", "finalizer2"));
        assertThat(namespaceSpec.equals(namespaceSpec), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 1DC977DA95F7B77A58C1F4D7587699E7
    @Test
    void testEqualsWithDifferentObject() {
        V1NamespaceSpec namespaceSpec1 = new V1NamespaceSpec().finalizers(Arrays.asList("finalizer1", "finalizer2"));
        V1NamespaceSpec namespaceSpec2 = new V1NamespaceSpec().finalizers(Arrays.asList("finalizer1", "finalizer2"));
        assertThat(namespaceSpec1.equals(namespaceSpec2), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentFinalizers}, hash: 9F4444B591DA9DC52C2FFCCFDAEA49BE
    @Test
    void testEqualsWithDifferentFinalizers() {
        V1NamespaceSpec namespaceSpec1 = new V1NamespaceSpec().finalizers(Arrays.asList("finalizer1", "finalizer2"));
        V1NamespaceSpec namespaceSpec2 = new V1NamespaceSpec().finalizers(Arrays.asList("finalizer3", "finalizer4"));
        assertThat(namespaceSpec1.equals(namespaceSpec2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 55266635395A407C076A2877A34EB55F
    @Test
    void testHashCode() {
        V1NamespaceSpec namespaceSpec1 = new V1NamespaceSpec().finalizers(Arrays.asList("finalizer1", "finalizer2"));
        V1NamespaceSpec namespaceSpec2 = new V1NamespaceSpec().finalizers(Arrays.asList("finalizer1", "finalizer2"));
        assertEquals(namespaceSpec1.hashCode(), namespaceSpec2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 2721C162758D890F848A2069F141AAAD
    @Test
    void testToString() {
        V1NamespaceSpec namespaceSpec = new V1NamespaceSpec().finalizers(Arrays.asList("finalizer1", "finalizer2"));
        String expectedString = "class V1NamespaceSpec {\n    finalizers: [finalizer1, finalizer2]\n}";
        assertEquals(expectedString, namespaceSpec.toString());
    }

    //BaseRock generated method id: ${testAddFinalizersItemWithDifferentValues}, hash: 30FE6A8FFD4CFBD9918F09E4A787CF64
    @ParameterizedTest
    @ValueSource(strings = { "finalizer1", "finalizer2", "finalizer3" })
    void testAddFinalizersItemWithDifferentValues(String finalizer) {
        V1NamespaceSpec namespaceSpec = new V1NamespaceSpec();
        namespaceSpec.addFinalizersItem(finalizer);
        assertThat(namespaceSpec.getFinalizers(), notNullValue());
        assertThat(namespaceSpec.getFinalizers(), hasSize(1));
        assertThat(namespaceSpec.getFinalizers().get(0), equalTo(finalizer));
    }
}

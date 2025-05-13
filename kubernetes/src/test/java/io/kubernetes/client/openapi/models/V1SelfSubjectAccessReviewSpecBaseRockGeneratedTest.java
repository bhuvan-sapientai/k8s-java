package io.kubernetes.client.openapi.models;

import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import java.util.Objects;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1NonResourceAttributes;
import io.kubernetes.client.openapi.models.V1ResourceAttributes;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1SelfSubjectAccessReviewSpecBaseRockGeneratedTest {

    private V1SelfSubjectAccessReviewSpec v1SelfSubjectAccessReviewSpec;

    @BeforeEach
    void setUp() {
        v1SelfSubjectAccessReviewSpec = new V1SelfSubjectAccessReviewSpec();
    }

    //BaseRock generated method id: ${testNonResourceAttributes}, hash: CF18F1474D79EFECEC5AE490E2D85237
    @Test
    void testNonResourceAttributes() {
        V1NonResourceAttributes mockNonResourceAttributes = mock(V1NonResourceAttributes.class);
        v1SelfSubjectAccessReviewSpec.setNonResourceAttributes(mockNonResourceAttributes);
        assertEquals(mockNonResourceAttributes, v1SelfSubjectAccessReviewSpec.getNonResourceAttributes());
    }

    //BaseRock generated method id: ${testResourceAttributes}, hash: 157A9903A51C76F6BA24E609E01A4F53
    @Test
    void testResourceAttributes() {
        V1ResourceAttributes mockResourceAttributes = mock(V1ResourceAttributes.class);
        v1SelfSubjectAccessReviewSpec.setResourceAttributes(mockResourceAttributes);
        assertEquals(mockResourceAttributes, v1SelfSubjectAccessReviewSpec.getResourceAttributes());
    }

    //BaseRock generated method id: ${testEquals}, hash: FC0AC1E3E14DC6EB0F19C4B13CF4227B
    @Test
    void testEquals() {
        V1NonResourceAttributes mockNonResourceAttributes1 = mock(V1NonResourceAttributes.class);
        V1ResourceAttributes mockResourceAttributes1 = mock(V1ResourceAttributes.class);
        V1SelfSubjectAccessReviewSpec spec1 = new V1SelfSubjectAccessReviewSpec().nonResourceAttributes(mockNonResourceAttributes1).resourceAttributes(mockResourceAttributes1);
        V1NonResourceAttributes mockNonResourceAttributes2 = mock(V1NonResourceAttributes.class);
        V1ResourceAttributes mockResourceAttributes2 = mock(V1ResourceAttributes.class);
        V1SelfSubjectAccessReviewSpec spec2 = new V1SelfSubjectAccessReviewSpec().nonResourceAttributes(mockNonResourceAttributes2).resourceAttributes(mockResourceAttributes2);
        V1NonResourceAttributes mockNonResourceAttributes3 = mock(V1NonResourceAttributes.class);
        V1SelfSubjectAccessReviewSpec spec3 = new V1SelfSubjectAccessReviewSpec().nonResourceAttributes(mockNonResourceAttributes3);
        assertAll(() -> assertThat(spec1.equals(spec1), is(true)), () -> assertThat(spec1.equals(spec2), is(false)), () -> assertThat(spec1.equals(spec3), is(false)), () -> assertThat(spec1.equals(null), is(false)), () -> assertThat(spec1.equals(new Object()), is(false)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 4BD82EFC75F8B56964DF31242686BFB6
    @Test
    void testHashCode() {
        V1NonResourceAttributes mockNonResourceAttributes = mock(V1NonResourceAttributes.class);
        V1ResourceAttributes mockResourceAttributes = mock(V1ResourceAttributes.class);
        v1SelfSubjectAccessReviewSpec.setNonResourceAttributes(mockNonResourceAttributes);
        v1SelfSubjectAccessReviewSpec.setResourceAttributes(mockResourceAttributes);
        int expectedHashCode = Objects.hash(mockNonResourceAttributes, mockResourceAttributes);
        assertEquals(expectedHashCode, v1SelfSubjectAccessReviewSpec.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: A968B41E483AAAC734F896417CA1DA6C
    @Test
    void testToString() {
        V1NonResourceAttributes mockNonResourceAttributes = mock(V1NonResourceAttributes.class);
        when(mockNonResourceAttributes.toString()).thenReturn("mockNonResourceAttributes");
        V1ResourceAttributes mockResourceAttributes = mock(V1ResourceAttributes.class);
        when(mockResourceAttributes.toString()).thenReturn("mockResourceAttributes");
        v1SelfSubjectAccessReviewSpec.setNonResourceAttributes(mockNonResourceAttributes);
        v1SelfSubjectAccessReviewSpec.setResourceAttributes(mockResourceAttributes);
        String expectedString = "class V1SelfSubjectAccessReviewSpec {\n" + "    nonResourceAttributes: mockNonResourceAttributes\n" + "    resourceAttributes: mockResourceAttributes\n" + "}";
        assertEquals(expectedString, v1SelfSubjectAccessReviewSpec.toString());
    }

    //BaseRock generated method id: ${testBuilder}, hash: 0299516EC8A960C76800419D22B6DE64
    @Test
    void testBuilder() {
        V1NonResourceAttributes mockNonResourceAttributes = mock(V1NonResourceAttributes.class);
        V1ResourceAttributes mockResourceAttributes = mock(V1ResourceAttributes.class);
        V1SelfSubjectAccessReviewSpec spec = new V1SelfSubjectAccessReviewSpec().nonResourceAttributes(mockNonResourceAttributes).resourceAttributes(mockResourceAttributes);
        assertAll(() -> assertThat(spec, is(notNullValue())), () -> assertThat(spec.getNonResourceAttributes(), is(equalTo(mockNonResourceAttributes))), () -> assertThat(spec.getResourceAttributes(), is(equalTo(mockResourceAttributes))));
    }

    //BaseRock generated method id: ${testBuilderWithNullValues}, hash: C97E41F9B27A4D823EC258268AAD17B4
    @Test
    void testBuilderWithNullValues() {
        V1SelfSubjectAccessReviewSpec spec = new V1SelfSubjectAccessReviewSpec().nonResourceAttributes(null).resourceAttributes(null);
        assertAll(() -> assertThat(spec, is(notNullValue())), () -> assertThat(spec.getNonResourceAttributes(), is(equalTo(null))), () -> assertThat(spec.getResourceAttributes(), is(equalTo(null))));
    }

    //BaseRock generated method id: ${testInstantiation}, hash: 5C1FE70CDEDE325811661DBEBAC3EE0C
    @Test
    void testInstantiation() {
        assertNotNull(new V1SelfSubjectAccessReviewSpec());
    }
}

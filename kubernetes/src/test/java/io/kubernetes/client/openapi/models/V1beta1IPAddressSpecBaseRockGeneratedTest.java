package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.models.V1beta1ParentReference;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1beta1IPAddressSpec;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1IPAddressSpecBaseRockGeneratedTest {

    private V1beta1IPAddressSpec v1beta1IPAddressSpec;

    private V1beta1ParentReference mockParentRef;

    @BeforeEach
    void setUp() {
        mockParentRef = mock(V1beta1ParentReference.class);
        v1beta1IPAddressSpec = new V1beta1IPAddressSpec();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 00FFD98F11986D51B0CE56758E93BC38
    @Test
    void testConstructor() {
        assertThat(v1beta1IPAddressSpec, is(notNullValue()));
    }

    //BaseRock generated method id: ${testParentRefSetter}, hash: CF075ED586BD2E6E5A2026D84E947F3F
    @Test
    void testParentRefSetter() {
        v1beta1IPAddressSpec.parentRef(mockParentRef);
        assertThat(v1beta1IPAddressSpec.getParentRef(), is(equalTo(mockParentRef)));
    }

    //BaseRock generated method id: ${testParentRefGetter}, hash: 59172C8BC77AA1748E493A5DD4A44E26
    @Test
    void testParentRefGetter() {
        v1beta1IPAddressSpec.setParentRef(mockParentRef);
        assertThat(v1beta1IPAddressSpec.getParentRef(), is(equalTo(mockParentRef)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 968A52B7B07018A9DABD9E5A0EB4699D
    @Test
    void testEquals() {
        V1beta1IPAddressSpec spec1 = new V1beta1IPAddressSpec().parentRef(mockParentRef);
        V1beta1IPAddressSpec spec2 = new V1beta1IPAddressSpec().parentRef(mockParentRef);
        V1beta1IPAddressSpec spec3 = new V1beta1IPAddressSpec().parentRef(mock(V1beta1ParentReference.class));
        assertThat(spec1.equals(spec2), is(true));
        assertThat(spec1.equals(spec3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: B64E494CCD4EF5695B4B73EFA9A6CEB4
    @Test
    void testHashCode() {
        V1beta1IPAddressSpec spec1 = new V1beta1IPAddressSpec().parentRef(mockParentRef);
        V1beta1IPAddressSpec spec2 = new V1beta1IPAddressSpec().parentRef(mockParentRef);
        assertThat(spec1.hashCode(), is(equalTo(spec2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: C9CB35B0D2B49C189F936B33F8A9754E
    @Test
    void testToString() {
        when(mockParentRef.toString()).thenReturn("MockParentRef");
        v1beta1IPAddressSpec.setParentRef(mockParentRef);
        String expected = "class V1beta1IPAddressSpec {\n    parentRef: MockParentRef\n}";
        assertThat(v1beta1IPAddressSpec.toString(), is(equalTo(expected)));
    }

    //BaseRock generated method id: ${testSetNullParentRef}, hash: 23026FA732E6AA1EDE6EA77D4A8E0E76
    @Test
    void testSetNullParentRef() {
        assertDoesNotThrow(() -> v1beta1IPAddressSpec.setParentRef(null));
    }
}

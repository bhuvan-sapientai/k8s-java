package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.openapi.models.V1IngressClassParametersReference;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import com.google.gson.annotations.SerializedName;
import static org.mockito.Mockito.*;
import org.mockito.Mock;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1IngressClassSpecBaseRockGeneratedTest {

    private V1IngressClassSpec v1IngressClassSpec;

    @Mock
    private V1IngressClassParametersReference mockParameters;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        v1IngressClassSpec = new V1IngressClassSpec();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 9167B5F415C9A58F0C706BC6788ABF21
    @Test
    void testConstructor() {
        assertNotNull(v1IngressClassSpec);
    }

    //BaseRock generated method id: ${testSetAndGetController}, hash: 9D8A25F507C7C52C972AF866C6C2DB4A
    @ParameterizedTest
    @ValueSource(strings = { "acme.io/ingress-controller", "nginx.org/ingress-controller" })
    void testSetAndGetController(String controller) {
        v1IngressClassSpec.setController(controller);
        assertEquals(controller, v1IngressClassSpec.getController());
    }

    //BaseRock generated method id: ${testSetAndGetParameters}, hash: 79038CE117CCF984849306DC50F3BB28
    @Test
    void testSetAndGetParameters() {
        v1IngressClassSpec.setParameters(mockParameters);
        assertEquals(mockParameters, v1IngressClassSpec.getParameters());
    }

    //BaseRock generated method id: ${testSetControllerWithInvalidInput}, hash: 787DF8BD339AA3AF94B8BEE9DE133D5F
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "  " })
    void testSetControllerWithInvalidInput(String controller) {
        v1IngressClassSpec.setController(controller);
        if (controller == null) {
            assertNull(v1IngressClassSpec.getController());
        } else {
            assertEquals(controller, v1IngressClassSpec.getController());
        }
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: EBC16D524960AFAF580C563C986DFFA9
    @Test
    void testEqualsWithSameObject() {
        assertTrue(v1IngressClassSpec.equals(v1IngressClassSpec));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 0EF1BC2490C1CFFB2532A246ECE19074
    @Test
    void testEqualsWithDifferentClass() {
        assertFalse(v1IngressClassSpec.equals(new Object()));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentControllerValue}, hash: E471E42E28CC63574A17BBCF2727F3C3
    @Test
    void testEqualsWithDifferentControllerValue() {
        V1IngressClassSpec other = new V1IngressClassSpec();
        v1IngressClassSpec.setController("controller1");
        other.setController("controller2");
        assertFalse(v1IngressClassSpec.equals(other));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentParametersValue}, hash: 6A3DDC4536E4D15AA2BF32AE5D5AAA5C
    @Test
    void testEqualsWithDifferentParametersValue() {
        V1IngressClassSpec other = new V1IngressClassSpec();
        v1IngressClassSpec.setParameters(mockParameters);
        other.setParameters(null);
        assertFalse(v1IngressClassSpec.equals(other));
    }

    //BaseRock generated method id: ${testHashCode}, hash: A199CB160E45676952B8CFF74447F89F
    @Test
    void testHashCode() {
        v1IngressClassSpec.setController("test-controller");
        v1IngressClassSpec.setParameters(mockParameters);
        int expectedHashCode = v1IngressClassSpec.hashCode();
        assertEquals(expectedHashCode, v1IngressClassSpec.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 737A0BE0BAF27B54EBDBD0B565CB452E
    @Test
    void testToString() {
        v1IngressClassSpec.setController("test-controller");
        v1IngressClassSpec.setParameters(mockParameters);
        String result = v1IngressClassSpec.toString();
        assertTrue(result.contains("controller"));
        assertTrue(result.contains("parameters"));
    }

    //BaseRock generated method id: ${testV1IngressClassSpecBuilder}, hash: E6899C5D6060066D072A68F7D6BA6F98
    @Test
    void testV1IngressClassSpecBuilder() {
        String testController = "test-controller";
        V1IngressClassSpec built = new V1IngressClassSpec().controller(testController).parameters(mockParameters);
        assertEquals(testController, built.getController());
        assertEquals(mockParameters, built.getParameters());
    }
}

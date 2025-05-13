package io.kubernetes.client.openapi.models;

import java.util.List;
import io.kubernetes.client.openapi.models.V1ExpressionWarning;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1TypeChecking;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1TypeCheckingBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1TypeCheckingConstructor}, hash: 6C1C10E4105C1C2EBB486B600FDBC6DE
    @Test
    void testV1TypeCheckingConstructor() {
        V1TypeChecking v1TypeChecking = new V1TypeChecking();
        assertNotNull(v1TypeChecking);
    }

    //BaseRock generated method id: ${testExpressionWarningsGetterAndSetter}, hash: 460B378FC763237F3D4F6AC9032AF56E
    @Test
    void testExpressionWarningsGetterAndSetter() {
        V1TypeChecking v1TypeChecking = new V1TypeChecking();
        List<V1ExpressionWarning> expressionWarnings = new ArrayList<>();
        V1ExpressionWarning warning = mock(V1ExpressionWarning.class);
        expressionWarnings.add(warning);
        v1TypeChecking.setExpressionWarnings(expressionWarnings);
        List<V1ExpressionWarning> result = v1TypeChecking.getExpressionWarnings();
        assertThat(result, notNullValue());
        assertThat(result, hasSize(1));
        assertEquals(warning, result.get(0));
    }

    //BaseRock generated method id: ${testExpressionWarningsFluentSetter}, hash: E05BE5F65611C93736C539F9B59184A6
    @Test
    void testExpressionWarningsFluentSetter() {
        V1TypeChecking v1TypeChecking = new V1TypeChecking();
        List<V1ExpressionWarning> expressionWarnings = new ArrayList<>();
        V1ExpressionWarning warning = mock(V1ExpressionWarning.class);
        expressionWarnings.add(warning);
        V1TypeChecking result = v1TypeChecking.expressionWarnings(expressionWarnings);
        assertThat(result, notNullValue());
        assertThat(result.getExpressionWarnings(), hasSize(1));
        assertEquals(warning, result.getExpressionWarnings().get(0));
    }

    //BaseRock generated method id: ${testAddExpressionWarningsItem}, hash: 784374529A3544B3BB25167D1EFC6F36
    @Test
    void testAddExpressionWarningsItem() {
        V1TypeChecking v1TypeChecking = new V1TypeChecking();
        V1ExpressionWarning warning = mock(V1ExpressionWarning.class);
        V1TypeChecking result = v1TypeChecking.addExpressionWarningsItem(warning);
        assertThat(result, notNullValue());
        assertThat(result.getExpressionWarnings(), hasSize(1));
        assertEquals(warning, result.getExpressionWarnings().get(0));
    }

    //BaseRock generated method id: ${testEquals}, hash: 386C9977C4802F1D918A07137709E183
    @Test
    void testEquals() {
        V1TypeChecking v1TypeChecking1 = new V1TypeChecking();
        V1TypeChecking v1TypeChecking2 = new V1TypeChecking();
        List<V1ExpressionWarning> expressionWarnings = new ArrayList<>();
        V1ExpressionWarning warning = mock(V1ExpressionWarning.class);
        expressionWarnings.add(warning);
        v1TypeChecking1.setExpressionWarnings(expressionWarnings);
        v1TypeChecking2.setExpressionWarnings(expressionWarnings);
        assertThat(v1TypeChecking1.equals(v1TypeChecking2), equalTo(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 1766CE76F4A211D51DD28A6FE1991506
    @Test
    void testHashCode() {
        V1TypeChecking v1TypeChecking = new V1TypeChecking();
        List<V1ExpressionWarning> expressionWarnings = new ArrayList<>();
        V1ExpressionWarning warning = mock(V1ExpressionWarning.class);
        expressionWarnings.add(warning);
        v1TypeChecking.setExpressionWarnings(expressionWarnings);
        int hashCode = v1TypeChecking.hashCode();
        assertThat(hashCode, notNullValue());
    }

    //BaseRock generated method id: ${testToString}, hash: 52E543F5FFEAE234CC41A74392C57E5F
    @Test
    void testToString() {
        V1TypeChecking v1TypeChecking = new V1TypeChecking();
        List<V1ExpressionWarning> expressionWarnings = new ArrayList<>();
        V1ExpressionWarning warning = mock(V1ExpressionWarning.class);
        when(warning.toString()).thenReturn("WarningString");
        expressionWarnings.add(warning);
        v1TypeChecking.setExpressionWarnings(expressionWarnings);
        String result = v1TypeChecking.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("expressionWarnings"), equalTo(true));
        assertThat(result.contains("WarningString"), equalTo(true));
    }
}

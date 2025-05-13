package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1beta1ExpressionWarning;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1beta1TypeChecking;
import java.util.ArrayList;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1TypeCheckingBaseRockGeneratedTest {

    private V1beta1TypeChecking typeChecking;

    @BeforeEach
    void setUp() {
        typeChecking = new V1beta1TypeChecking();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 17CA58B94E03819013839840AE470BF0
    @Test
    void testConstructor() {
        assertThat(typeChecking, is(notNullValue()));
    }

    //BaseRock generated method id: ${testExpressionWarnings}, hash: A45B5F67D2642E541DD1636ECAFC0EF0
    @Test
    void testExpressionWarnings() {
        List<V1beta1ExpressionWarning> warnings = new ArrayList<>();
        V1beta1ExpressionWarning warning = mock(V1beta1ExpressionWarning.class);
        warnings.add(warning);
        typeChecking.setExpressionWarnings(warnings);
        List<V1beta1ExpressionWarning> result = typeChecking.getExpressionWarnings();
        assertThat(result, is(notNullValue()));
        assertThat(result, hasSize(1));
        assertThat(result.get(0), is(equalTo(warning)));
    }

    //BaseRock generated method id: ${testAddExpressionWarningsItem}, hash: A5B48BC8E0DC4A154C71DEFD69CAFBC3
    @Test
    void testAddExpressionWarningsItem() {
        V1beta1ExpressionWarning warning = mock(V1beta1ExpressionWarning.class);
        typeChecking.addExpressionWarningsItem(warning);
        List<V1beta1ExpressionWarning> result = typeChecking.getExpressionWarnings();
        assertThat(result, is(notNullValue()));
        assertThat(result, hasSize(1));
        assertThat(result.get(0), is(equalTo(warning)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: E63850ACCA524301E19A21D10E030467
    @Test
    void testEqualsAndHashCode() {
        V1beta1TypeChecking typeChecking1 = new V1beta1TypeChecking();
        V1beta1TypeChecking typeChecking2 = new V1beta1TypeChecking();
        List<V1beta1ExpressionWarning> warnings = new ArrayList<>();
        V1beta1ExpressionWarning warning = mock(V1beta1ExpressionWarning.class);
        warnings.add(warning);
        typeChecking1.setExpressionWarnings(warnings);
        typeChecking2.setExpressionWarnings(warnings);
        assertThat(typeChecking1, is(equalTo(typeChecking2)));
        assertThat(typeChecking1.hashCode(), is(equalTo(typeChecking2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: EF8B0D54E286D88064E7E3CD42FB59E5
    @Test
    void testToString() {
        V1beta1ExpressionWarning warning = mock(V1beta1ExpressionWarning.class);
        when(warning.toString()).thenReturn("MockedWarning");
        List<V1beta1ExpressionWarning> warnings = new ArrayList<>();
        warnings.add(warning);
        typeChecking.setExpressionWarnings(warnings);
        String result = typeChecking.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result.contains("expressionWarnings"), is(true));
        assertThat(result.contains("MockedWarning"), is(true));
    }
}

package io.kubernetes.client.openapi.models;

import java.util.List;
import io.kubernetes.client.openapi.models.V1ScopeSelector;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ScopeSelectorBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 8CBA32322F7C85345D5D2BB88848C54A
    @Test
    void testConstructor() {
        V1ScopeSelector scopeSelector = new V1ScopeSelector();
        assertThat(scopeSelector, is(notNullValue()));
    }

    //BaseRock generated method id: ${testMatchExpressions}, hash: 410E17B9B489B041B946B4FAABF208DD
    @Test
    void testMatchExpressions() {
        V1ScopeSelector scopeSelector = new V1ScopeSelector();
        List<V1ScopedResourceSelectorRequirement> matchExpressions = new ArrayList<>();
        V1ScopedResourceSelectorRequirement requirement = mock(V1ScopedResourceSelectorRequirement.class);
        matchExpressions.add(requirement);
        V1ScopeSelector result = scopeSelector.matchExpressions(matchExpressions);
        assertThat(result, is(notNullValue()));
        assertThat(result.getMatchExpressions(), is(equalTo(matchExpressions)));
    }

    //BaseRock generated method id: ${testAddMatchExpressionsItem}, hash: E36BC4986AD3AF08DF748B63EC90309C
    @Test
    void testAddMatchExpressionsItem() {
        V1ScopeSelector scopeSelector = new V1ScopeSelector();
        V1ScopedResourceSelectorRequirement requirement = mock(V1ScopedResourceSelectorRequirement.class);
        V1ScopeSelector result = scopeSelector.addMatchExpressionsItem(requirement);
        assertThat(result, is(notNullValue()));
        assertThat(result.getMatchExpressions(), hasSize(1));
        assertThat(result.getMatchExpressions().get(0), is(equalTo(requirement)));
    }

    //BaseRock generated method id: ${testGetMatchExpressions}, hash: F7EC009FDE1363498E1137A7DA51F935
    @Test
    void testGetMatchExpressions() {
        V1ScopeSelector scopeSelector = new V1ScopeSelector();
        List<V1ScopedResourceSelectorRequirement> matchExpressions = new ArrayList<>();
        V1ScopedResourceSelectorRequirement requirement = mock(V1ScopedResourceSelectorRequirement.class);
        matchExpressions.add(requirement);
        scopeSelector.setMatchExpressions(matchExpressions);
        List<V1ScopedResourceSelectorRequirement> result = scopeSelector.getMatchExpressions();
        assertThat(result, is(notNullValue()));
        assertThat(result, is(equalTo(matchExpressions)));
    }

    //BaseRock generated method id: ${testSetMatchExpressions}, hash: 26D0E834B35B381F04A23744643271A4
    @Test
    void testSetMatchExpressions() {
        V1ScopeSelector scopeSelector = new V1ScopeSelector();
        List<V1ScopedResourceSelectorRequirement> matchExpressions = new ArrayList<>();
        V1ScopedResourceSelectorRequirement requirement = mock(V1ScopedResourceSelectorRequirement.class);
        matchExpressions.add(requirement);
        scopeSelector.setMatchExpressions(matchExpressions);
        assertThat(scopeSelector.getMatchExpressions(), is(equalTo(matchExpressions)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 91F7EA44437235CF6F3F793E0A11FB0F
    @Test
    void testEquals() {
        V1ScopeSelector scopeSelector1 = new V1ScopeSelector();
        V1ScopeSelector scopeSelector2 = new V1ScopeSelector();
        V1ScopeSelector scopeSelector3 = new V1ScopeSelector();
        List<V1ScopedResourceSelectorRequirement> matchExpressions = new ArrayList<>();
        V1ScopedResourceSelectorRequirement requirement = mock(V1ScopedResourceSelectorRequirement.class);
        matchExpressions.add(requirement);
        scopeSelector1.setMatchExpressions(matchExpressions);
        scopeSelector2.setMatchExpressions(matchExpressions);
        scopeSelector3.setMatchExpressions(new ArrayList<>());
        assertTrue(scopeSelector1.equals(scopeSelector2));
        assertTrue(scopeSelector2.equals(scopeSelector1));
        assertFalse(scopeSelector1.equals(scopeSelector3));
        assertFalse(scopeSelector1.equals(null));
        assertFalse(scopeSelector1.equals(new Object()));
    }

    //BaseRock generated method id: ${testHashCode}, hash: D96A47A8E52A070A519A3B030FDF0D24
    @Test
    void testHashCode() {
        V1ScopeSelector scopeSelector1 = new V1ScopeSelector();
        V1ScopeSelector scopeSelector2 = new V1ScopeSelector();
        List<V1ScopedResourceSelectorRequirement> matchExpressions = new ArrayList<>();
        V1ScopedResourceSelectorRequirement requirement = mock(V1ScopedResourceSelectorRequirement.class);
        matchExpressions.add(requirement);
        scopeSelector1.setMatchExpressions(matchExpressions);
        scopeSelector2.setMatchExpressions(matchExpressions);
        assertEquals(scopeSelector1.hashCode(), scopeSelector2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: C9EC8F2D64BFBD191AA177DC2EBCFB03
    @Test
    void testToString() {
        V1ScopeSelector scopeSelector = new V1ScopeSelector();
        List<V1ScopedResourceSelectorRequirement> matchExpressions = new ArrayList<>();
        V1ScopedResourceSelectorRequirement requirement = mock(V1ScopedResourceSelectorRequirement.class);
        matchExpressions.add(requirement);
        scopeSelector.setMatchExpressions(matchExpressions);
        String result = scopeSelector.toString();
        assertThat(result, is(notNullValue()));
        assertTrue(result.contains("class V1ScopeSelector"));
        assertTrue(result.contains("matchExpressions"));
    }
}

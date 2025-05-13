package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1CustomResourceConversion;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.containsInAnyOrder;
import io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CustomResourceDefinitionSpecBaseRockGeneratedTest {

    private V1CustomResourceDefinitionSpec spec;

    @BeforeEach
    void setUp() {
        spec = new V1CustomResourceDefinitionSpec();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 6B23315D2C0A3F4C18FC860A56CB8DBA
    @Test
    void testConstructor() {
        assertThat(spec, is(notNullValue()));
    }

    //BaseRock generated method id: ${testConversion}, hash: 1E93390BF8B132EF92DA0644A62216C2
    @Test
    void testConversion() {
        V1CustomResourceConversion conversion = mock(V1CustomResourceConversion.class);
        spec.setConversion(conversion);
        assertThat(spec.getConversion(), is(equalTo(conversion)));
    }

    //BaseRock generated method id: ${testGroup}, hash: F01B6446244C2076EC63E0205FE8B6C3
    @ParameterizedTest
    @ValueSource(strings = { "group1", "group2", "group3" })
    void testGroup(String groupValue) {
        spec.setGroup(groupValue);
        assertThat(spec.getGroup(), is(equalTo(groupValue)));
    }

    //BaseRock generated method id: ${testNames}, hash: 2F0EF13344DDD5FCB9D91303DEB50E07
    @Test
    void testNames() {
        V1CustomResourceDefinitionNames names = mock(V1CustomResourceDefinitionNames.class);
        spec.setNames(names);
        assertThat(spec.getNames(), is(equalTo(names)));
    }

    //BaseRock generated method id: ${testPreserveUnknownFields}, hash: A32CFC962D28A05A1E4DCE82E3B2C578
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    void testPreserveUnknownFields(boolean value) {
        spec.setPreserveUnknownFields(value);
        assertThat(spec.getPreserveUnknownFields(), is(equalTo(value)));
    }

    //BaseRock generated method id: ${testScope}, hash: 509BB1B9F6CF8EF875D3FC5874E12459
    @ParameterizedTest
    @ValueSource(strings = { "Cluster", "Namespaced" })
    void testScope(String scopeValue) {
        spec.setScope(scopeValue);
        assertThat(spec.getScope(), is(equalTo(scopeValue)));
    }

    //BaseRock generated method id: ${testVersions}, hash: 2E0B61E34F531C70E499AE2346444E5A
    @Test
    void testVersions() {
        List<V1CustomResourceDefinitionVersion> versions = new ArrayList<>();
        versions.add(mock(V1CustomResourceDefinitionVersion.class));
        versions.add(mock(V1CustomResourceDefinitionVersion.class));
        spec.setVersions(versions);
        assertThat(spec.getVersions(), is(equalTo(versions)));
    }

    //BaseRock generated method id: ${testAddVersionsItem}, hash: 51B15970B4B8C0F7ACD1D385AB1E68BD
    @Test
    void testAddVersionsItem() {
        V1CustomResourceDefinitionVersion version = mock(V1CustomResourceDefinitionVersion.class);
        spec.addVersionsItem(version);
        assertThat(spec.getVersions(), hasSize(1));
        assertThat(spec.getVersions().get(0), is(equalTo(version)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 79F936059CE2CFA842C9B6979A1A8AD3
    @Test
    void testEquals() {
        V1CustomResourceDefinitionSpec spec1 = new V1CustomResourceDefinitionSpec().conversion(mock(V1CustomResourceConversion.class)).group("group1").names(mock(V1CustomResourceDefinitionNames.class)).preserveUnknownFields(true).scope("Cluster").versions(Arrays.asList(mock(V1CustomResourceDefinitionVersion.class)));
        V1CustomResourceDefinitionSpec spec2 = new V1CustomResourceDefinitionSpec().conversion(spec1.getConversion()).group(spec1.getGroup()).names(spec1.getNames()).preserveUnknownFields(spec1.getPreserveUnknownFields()).scope(spec1.getScope()).versions(spec1.getVersions());
        assertThat(spec1.equals(spec2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: B4F90636BA5C0E8F59C68D7336612AD9
    @Test
    void testHashCode() {
        V1CustomResourceDefinitionSpec spec1 = new V1CustomResourceDefinitionSpec().conversion(mock(V1CustomResourceConversion.class)).group("group1").names(mock(V1CustomResourceDefinitionNames.class)).preserveUnknownFields(true).scope("Cluster").versions(Arrays.asList(mock(V1CustomResourceDefinitionVersion.class)));
        V1CustomResourceDefinitionSpec spec2 = new V1CustomResourceDefinitionSpec().conversion(spec1.getConversion()).group(spec1.getGroup()).names(spec1.getNames()).preserveUnknownFields(spec1.getPreserveUnknownFields()).scope(spec1.getScope()).versions(spec1.getVersions());
        assertThat(spec1.hashCode(), is(equalTo(spec2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 6212793B889B9972BF7E00A16F7CB729
    @Test
    void testToString() {
        V1CustomResourceDefinitionSpec spec = new V1CustomResourceDefinitionSpec().conversion(mock(V1CustomResourceConversion.class)).group("group1").names(mock(V1CustomResourceDefinitionNames.class)).preserveUnknownFields(true).scope("Cluster").versions(Arrays.asList(mock(V1CustomResourceDefinitionVersion.class)));
        String toString = spec.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("conversion"), is(true));
        assertThat(toString.contains("group"), is(true));
        assertThat(toString.contains("names"), is(true));
        assertThat(toString.contains("preserveUnknownFields"), is(true));
        assertThat(toString.contains("scope"), is(true));
        assertThat(toString.contains("versions"), is(true));
    }

    //BaseRock generated method id: ${testSetGroupWithInvalidInput}, hash: 7FF3C5FC9AD56010E2A5E35DD1629AFD
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "  ", "\t", "\n" })
    void testSetGroupWithInvalidInput(String input) {
        spec.setGroup(input);
        assertThat(spec.getGroup(), is(equalTo(input)));
    }

    //BaseRock generated method id: ${testSetNamesWithNull}, hash: 788663884D85C05DD2D6B8A3256E2898
    @Test
    void testSetNamesWithNull() {
        spec.setNames(null);
        assertThat(spec.getNames(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetScopeWithInvalidInput}, hash: 8AEC13DDEBEF32817B9E813F5A8AD95F
    @ParameterizedTest
    @ValueSource(strings = { "InvalidScope", "CLUSTER", "NAMESPACED" })
    void testSetScopeWithInvalidInput(String input) {
        spec.setScope(input);
        assertThat(spec.getScope(), is(equalTo(input)));
    }

    //BaseRock generated method id: ${testSetVersionsWithNull}, hash: 3C6E275053477A93FEC6558AC7A51426
    @Test
    void testSetVersionsWithNull() {
        spec.setVersions(null);
        assertThat(spec.getVersions(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAddVersionsItemWithNull}, hash: 32A16A088FB7BAC1A61517ECB56304BC
    @Test
    void testAddVersionsItemWithNull() {
        spec.addVersionsItem(null);
        assertThat(spec.getVersions(), hasSize(1));
        assertThat(spec.getVersions().get(0), is(nullValue()));
    }
}

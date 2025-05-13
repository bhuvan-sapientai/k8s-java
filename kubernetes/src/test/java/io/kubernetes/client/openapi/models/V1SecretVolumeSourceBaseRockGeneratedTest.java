package io.kubernetes.client.openapi.models;

import static org.junit.jupiter.api.Assertions.assertAll;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1SecretVolumeSource;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.containsInAnyOrder;
import io.kubernetes.client.openapi.models.V1KeyToPath;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1SecretVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1SecretVolumeSourceConstructor}, hash: 46CD7DFBF01890B6A29B250AF12022DC
    @Test
    void testV1SecretVolumeSourceConstructor() {
        V1SecretVolumeSource secretVolumeSource = new V1SecretVolumeSource();
        assertThat(secretVolumeSource, is(notNullValue()));
    }

    //BaseRock generated method id: ${testDefaultMode}, hash: D02E73DE833A5F3DD2D16E869F0C3FFC
    @Test
    void testDefaultMode() {
        V1SecretVolumeSource secretVolumeSource = new V1SecretVolumeSource();
        Integer defaultMode = 0644;
        secretVolumeSource.setDefaultMode(defaultMode);
        assertEquals(defaultMode, secretVolumeSource.getDefaultMode());
    }

    //BaseRock generated method id: ${testDefaultModeValidValues}, hash: 95F9ED10369D92EF73AE4FD235CD5D68
    @ParameterizedTest
    @ValueSource(ints = { 0000, 0777, 511 })
    void testDefaultModeValidValues(int mode) {
        V1SecretVolumeSource secretVolumeSource = new V1SecretVolumeSource();
        secretVolumeSource.setDefaultMode(mode);
        assertEquals(mode, secretVolumeSource.getDefaultMode());
    }

    //BaseRock generated method id: ${testItems}, hash: 6726B309567601E34A32D41C493B903A
    @Test
    void testItems() {
        V1SecretVolumeSource secretVolumeSource = new V1SecretVolumeSource();
        List<V1KeyToPath> items = new ArrayList<>();
        V1KeyToPath item1 = new V1KeyToPath();
        V1KeyToPath item2 = new V1KeyToPath();
        items.add(item1);
        items.add(item2);
        secretVolumeSource.setItems(items);
        assertThat(secretVolumeSource.getItems(), hasSize(2));
        assertThat(secretVolumeSource.getItems(), containsInAnyOrder(item1, item2));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: CE8244FFF94FE88DE6AE9108A61B57F5
    @Test
    void testAddItemsItem() {
        V1SecretVolumeSource secretVolumeSource = new V1SecretVolumeSource();
        V1KeyToPath item = new V1KeyToPath();
        secretVolumeSource.addItemsItem(item);
        assertThat(secretVolumeSource.getItems(), hasSize(1));
        assertThat(secretVolumeSource.getItems().get(0), is(equalTo(item)));
    }

    //BaseRock generated method id: ${testOptional}, hash: B36002F994F7A38E0859D6B1DB7D3407
    @Test
    void testOptional() {
        V1SecretVolumeSource secretVolumeSource = new V1SecretVolumeSource();
        secretVolumeSource.setOptional(true);
        assertTrue(secretVolumeSource.getOptional());
        secretVolumeSource.setOptional(false);
        assertFalse(secretVolumeSource.getOptional());
    }

    //BaseRock generated method id: ${testSecretName}, hash: 1592FF775C0B827F385A819C23985CEB
    @Test
    void testSecretName() {
        V1SecretVolumeSource secretVolumeSource = new V1SecretVolumeSource();
        String secretName = "test-secret";
        secretVolumeSource.setSecretName(secretName);
        assertEquals(secretName, secretVolumeSource.getSecretName());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 89CA8E75C1D7270EF90F3BD62A0B6BB9
    @Test
    void testEqualsAndHashCode() {
        V1SecretVolumeSource source1 = new V1SecretVolumeSource().defaultMode(0644).optional(true).secretName("secret1");
        V1SecretVolumeSource source2 = new V1SecretVolumeSource().defaultMode(0644).optional(true).secretName("secret1");
        V1SecretVolumeSource source3 = new V1SecretVolumeSource().defaultMode(0755).optional(false).secretName("secret2");
        assertAll(() -> assertEquals(source1, source2), () -> assertNotEquals(source1, source3), () -> assertEquals(source1.hashCode(), source2.hashCode()), () -> assertNotEquals(source1.hashCode(), source3.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 347C5815B1CF70373128C32C106A080D
    @Test
    void testToString() {
        V1SecretVolumeSource secretVolumeSource = new V1SecretVolumeSource().defaultMode(0644).optional(true).secretName("test-secret");
        String toString = secretVolumeSource.toString();
        assertThat(toString, notNullValue());
        assertTrue(toString.contains("defaultMode"));
        assertTrue(toString.contains("optional"));
        assertTrue(toString.contains("secretName"));
    }

    //BaseRock generated method id: ${testSettersAndGetters}, hash: A7E7B949ED3401978C8E51A99F48F55C
    @Test
    void testSettersAndGetters() {
        V1SecretVolumeSource secretVolumeSource = new V1SecretVolumeSource();
        secretVolumeSource.setDefaultMode(0755);
        assertEquals(0755, secretVolumeSource.getDefaultMode());
        List<V1KeyToPath> items = new ArrayList<>();
        secretVolumeSource.setItems(items);
        assertEquals(items, secretVolumeSource.getItems());
        secretVolumeSource.setOptional(true);
        assertTrue(secretVolumeSource.getOptional());
        secretVolumeSource.setSecretName("new-secret");
        assertEquals("new-secret", secretVolumeSource.getSecretName());
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 36B767BB3E844123439C3675B2175592
    @Test
    void testBuilderPattern() {
        V1SecretVolumeSource secretVolumeSource = new V1SecretVolumeSource().defaultMode(0644).optional(true).secretName("builder-secret");
        assertEquals(0644, secretVolumeSource.getDefaultMode());
        assertTrue(secretVolumeSource.getOptional());
        assertEquals("builder-secret", secretVolumeSource.getSecretName());
    }

    //BaseRock generated method id: ${testNullValues}, hash: 2E3F537608565BB04C5C770052F02BDC
    @Disabled()
    @Test
    void testNullValues() {
        V1SecretVolumeSource secretVolumeSource = new V1SecretVolumeSource();
        assertThat(secretVolumeSource.getDefaultMode(), is(nullValue()));
        assertThat(secretVolumeSource.getItems(), is(nullValue()));
        assertThat(secretVolumeSource.getOptional(), is(nullValue()));
        assertThat(secretVolumeSource.getSecretName(), is(nullValue()));
    }
}

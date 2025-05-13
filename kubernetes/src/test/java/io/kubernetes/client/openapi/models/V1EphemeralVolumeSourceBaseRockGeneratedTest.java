package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1EphemeralVolumeSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1EphemeralVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1EphemeralVolumeSourceConstructor}, hash: 07006594AA79D9194817DBC2E87BE4A1
    @Test
    void testV1EphemeralVolumeSourceConstructor() {
        V1EphemeralVolumeSource volumeSource = new V1EphemeralVolumeSource();
        assertNotNull(volumeSource);
    }

    //BaseRock generated method id: ${testVolumeClaimTemplateGetterAndSetter}, hash: C167A0615B8880A3CE2BD581CD642917
    @Test
    void testVolumeClaimTemplateGetterAndSetter() {
        V1EphemeralVolumeSource volumeSource = new V1EphemeralVolumeSource();
        V1PersistentVolumeClaimTemplate mockTemplate = mock(V1PersistentVolumeClaimTemplate.class);
        volumeSource.setVolumeClaimTemplate(mockTemplate);
        assertEquals(mockTemplate, volumeSource.getVolumeClaimTemplate());
    }

    //BaseRock generated method id: ${testEqualsMethod}, hash: F1E5C7FC19F3FC8386DAF8A34CCADBF6
    @Test
    void testEqualsMethod() {
        V1EphemeralVolumeSource volumeSource1 = new V1EphemeralVolumeSource();
        V1EphemeralVolumeSource volumeSource2 = new V1EphemeralVolumeSource();
        V1PersistentVolumeClaimTemplate mockTemplate = mock(V1PersistentVolumeClaimTemplate.class);
        volumeSource1.setVolumeClaimTemplate(mockTemplate);
        volumeSource2.setVolumeClaimTemplate(mockTemplate);
        assertThat(volumeSource1, is(equalTo(volumeSource2)));
    }

    //BaseRock generated method id: ${testHashCodeMethod}, hash: 39F9E5DC5D0549C2A90469F8FEF74636
    @Test
    void testHashCodeMethod() {
        V1EphemeralVolumeSource volumeSource = new V1EphemeralVolumeSource();
        V1PersistentVolumeClaimTemplate mockTemplate = mock(V1PersistentVolumeClaimTemplate.class);
        volumeSource.setVolumeClaimTemplate(mockTemplate);
        assertThat(volumeSource.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToStringMethod}, hash: 1F5A2687ED10E4BA20F31925C4736154
    @Test
    void testToStringMethod() {
        V1EphemeralVolumeSource volumeSource = new V1EphemeralVolumeSource();
        V1PersistentVolumeClaimTemplate mockTemplate = mock(V1PersistentVolumeClaimTemplate.class);
        when(mockTemplate.toString()).thenReturn("MockTemplate");
        volumeSource.setVolumeClaimTemplate(mockTemplate);
        String result = volumeSource.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result.contains("volumeClaimTemplate"), is(true));
        assertThat(result.contains("MockTemplate"), is(true));
    }
}

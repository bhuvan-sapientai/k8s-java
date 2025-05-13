package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1FlockerVolumeSource;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1FlockerVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: BACA4C655DDC925C84015D1769257BCF
    @Test
    void testConstructor() {
        V1FlockerVolumeSource flockerVolumeSource = new V1FlockerVolumeSource();
        assertNotNull(flockerVolumeSource);
    }

    //BaseRock generated method id: ${testDatasetName}, hash: 2B8B95E63C36AC914117611898FB3ACC
    @Test
    void testDatasetName() {
        V1FlockerVolumeSource flockerVolumeSource = new V1FlockerVolumeSource();
        String datasetName = "test-dataset";
        flockerVolumeSource.setDatasetName(datasetName);
        assertEquals(datasetName, flockerVolumeSource.getDatasetName());
    }

    //BaseRock generated method id: ${testDatasetUUID}, hash: 05031C3AF2264C5C7C60EBDC9E101D52
    @Test
    void testDatasetUUID() {
        V1FlockerVolumeSource flockerVolumeSource = new V1FlockerVolumeSource();
        String datasetUUID = "123e4567-e89b-12d3-a456-426614174000";
        flockerVolumeSource.setDatasetUUID(datasetUUID);
        assertEquals(datasetUUID, flockerVolumeSource.getDatasetUUID());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 9515EB09E8B2850AA6CCB124A53D54D2
    @Test
    void testEqualsAndHashCode() {
        V1FlockerVolumeSource source1 = new V1FlockerVolumeSource().datasetName("test-dataset").datasetUUID("123e4567-e89b-12d3-a456-426614174000");
        V1FlockerVolumeSource source2 = new V1FlockerVolumeSource().datasetName("test-dataset").datasetUUID("123e4567-e89b-12d3-a456-426614174000");
        V1FlockerVolumeSource source3 = new V1FlockerVolumeSource().datasetName("other-dataset").datasetUUID("987e6543-e21b-12d3-a456-426614174000");
        assertThat(source1.equals(source2), is(true));
        assertThat(source1.equals(source3), is(false));
        assertThat(source1.hashCode() == source2.hashCode(), is(true));
        assertThat(source1.hashCode() == source3.hashCode(), is(false));
    }

    //BaseRock generated method id: ${testToString}, hash: C839883DDB5ADE834E52F6F027BA72A0
    @Test
    void testToString() {
        V1FlockerVolumeSource flockerVolumeSource = new V1FlockerVolumeSource().datasetName("test-dataset").datasetUUID("123e4567-e89b-12d3-a456-426614174000");
        String expectedString = "class V1FlockerVolumeSource {\n" + "    datasetName: test-dataset\n" + "    datasetUUID: 123e4567-e89b-12d3-a456-426614174000\n" + "}";
        assertEquals(expectedString, flockerVolumeSource.toString());
    }

    //BaseRock generated method id: ${testBuilder}, hash: 20127618D48B30F3D324A0BAC78EDA9C
    @Test
    void testBuilder() {
        V1FlockerVolumeSource flockerVolumeSource = new V1FlockerVolumeSource().datasetName("test-dataset").datasetUUID("123e4567-e89b-12d3-a456-426614174000");
        assertEquals("test-dataset", flockerVolumeSource.getDatasetName());
        assertEquals("123e4567-e89b-12d3-a456-426614174000", flockerVolumeSource.getDatasetUUID());
    }

    //BaseRock generated method id: ${testNullValues}, hash: 8F60D6D93815E63EE8814C96BF2E42E0
    @Test
    void testNullValues() {
        V1FlockerVolumeSource flockerVolumeSource = new V1FlockerVolumeSource();
        assertThat(flockerVolumeSource.getDatasetName(), is(nullValue()));
        assertThat(flockerVolumeSource.getDatasetUUID(), is(nullValue()));
    }
}

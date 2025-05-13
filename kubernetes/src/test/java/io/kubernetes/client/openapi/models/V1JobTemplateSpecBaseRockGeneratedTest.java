package io.kubernetes.client.openapi.models;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1JobSpec;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1JobTemplateSpecBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1JobTemplateSpec}, hash: 1DA087B32F86A4C9986DC1A34ACF1C81
    @Test
    void testV1JobTemplateSpec() {
        V1JobTemplateSpec jobTemplateSpec = new V1JobTemplateSpec();
        assertThat(jobTemplateSpec, is(notNullValue()));
    }

    //BaseRock generated method id: ${testMetadata}, hash: BBD758298A1E0D4DA7E6F2B3E1DDC462
    @Test
    void testMetadata() {
        V1ObjectMeta mockMetadata = mock(V1ObjectMeta.class);
        V1JobTemplateSpec jobTemplateSpec = new V1JobTemplateSpec().metadata(mockMetadata);
        assertThat(jobTemplateSpec.getMetadata(), is(equalTo(mockMetadata)));
    }

    //BaseRock generated method id: ${testSpec}, hash: F25B3D079AFF931CE34BA3D287203832
    @Test
    void testSpec() {
        V1JobSpec mockSpec = mock(V1JobSpec.class);
        V1JobTemplateSpec jobTemplateSpec = new V1JobTemplateSpec().spec(mockSpec);
        assertThat(jobTemplateSpec.getSpec(), is(equalTo(mockSpec)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 6B60AB905810347BD51E7E573BE7881B
    @Disabled()
    @Test
    void testEquals() {
        V1ObjectMeta mockMetadata1 = mock(V1ObjectMeta.class);
        V1JobSpec mockSpec1 = mock(V1JobSpec.class);
        V1JobTemplateSpec jobTemplateSpec1 = new V1JobTemplateSpec().metadata(mockMetadata1).spec(mockSpec1);
        V1ObjectMeta mockMetadata2 = mock(V1ObjectMeta.class);
        V1JobSpec mockSpec2 = mock(V1JobSpec.class);
        V1JobTemplateSpec jobTemplateSpec2 = new V1JobTemplateSpec().metadata(mockMetadata2).spec(mockSpec2);
        doReturn(true).when(mockMetadata1).equals(mockMetadata2);
        doReturn(true).when(mockSpec1).equals(mockSpec2);
        assertThat(jobTemplateSpec1.equals(jobTemplateSpec2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 3B0A68F527F92E0A367D618AD60326F2
    @Test
    void testHashCode() {
        V1ObjectMeta mockMetadata = mock(V1ObjectMeta.class);
        V1JobSpec mockSpec = mock(V1JobSpec.class);
        V1JobTemplateSpec jobTemplateSpec = new V1JobTemplateSpec().metadata(mockMetadata).spec(mockSpec);
        assertThat(jobTemplateSpec.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: BDF92BA4A8B858BB3DDF9E9CEF397E88
    @Test
    void testToString() {
        V1ObjectMeta mockMetadata = mock(V1ObjectMeta.class);
        when(mockMetadata.toString()).thenReturn("mockMetadata");
        V1JobSpec mockSpec = mock(V1JobSpec.class);
        when(mockSpec.toString()).thenReturn("mockSpec");
        V1JobTemplateSpec jobTemplateSpec = new V1JobTemplateSpec().metadata(mockMetadata).spec(mockSpec);
        String result = jobTemplateSpec.toString();
        assertAll(() -> assertThat(result, is(notNullValue())), () -> assertThat(result, startsWith("class V1JobTemplateSpec")), () -> assertThat(result, endsWith("}")));
    }
}

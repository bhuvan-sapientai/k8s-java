package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V1PriorityLevelConfigurationSpec;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1PriorityLevelConfigurationStatus;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PriorityLevelConfigurationBaseRockGeneratedTest {

    private V1PriorityLevelConfiguration v1PriorityLevelConfiguration;

    @BeforeEach
    void setUp() {
        v1PriorityLevelConfiguration = new V1PriorityLevelConfiguration();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 8DA75EB452FF0D6EE6929C45AE00CF36
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1PriorityLevelConfiguration.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1PriorityLevelConfiguration.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 43F79273502C031F9324C5F618DBEDA0
    @Test
    void testKind() {
        String kind = "PriorityLevelConfiguration";
        v1PriorityLevelConfiguration.setKind(kind);
        assertEquals(kind, v1PriorityLevelConfiguration.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: F9E47D5D64D4737869EC2E0C76E98920
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1PriorityLevelConfiguration.setMetadata(metadata);
        assertEquals(metadata, v1PriorityLevelConfiguration.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: 82A1E6AE1550CA20114CDC8A348E8F04
    @Test
    void testSpec() {
        V1PriorityLevelConfigurationSpec spec = mock(V1PriorityLevelConfigurationSpec.class);
        v1PriorityLevelConfiguration.setSpec(spec);
        assertEquals(spec, v1PriorityLevelConfiguration.getSpec());
    }

    //BaseRock generated method id: ${testStatus}, hash: BF36C1F9A3A6F7DD6CD4A0523A310F01
    @Test
    void testStatus() {
        V1PriorityLevelConfigurationStatus status = mock(V1PriorityLevelConfigurationStatus.class);
        v1PriorityLevelConfiguration.setStatus(status);
        assertEquals(status, v1PriorityLevelConfiguration.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: B0AE64541A755FC7304D9A140585F5ED
    @Test
    void testEquals() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1PriorityLevelConfigurationSpec spec = mock(V1PriorityLevelConfigurationSpec.class);
        V1PriorityLevelConfigurationStatus status = mock(V1PriorityLevelConfigurationStatus.class);
        V1PriorityLevelConfiguration config1 = new V1PriorityLevelConfiguration().apiVersion("v1").kind("PriorityLevelConfiguration").metadata(metadata).spec(spec).status(status);
        V1PriorityLevelConfiguration config2 = new V1PriorityLevelConfiguration().apiVersion("v1").kind("PriorityLevelConfiguration").metadata(metadata).spec(spec).status(status);
        assertThat(config1, is(equalTo(config2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 495F48D5BD76CD75F0C7474B82EEA052
    @Test
    void testHashCode() {
        V1PriorityLevelConfiguration config = new V1PriorityLevelConfiguration().apiVersion("v1").kind("PriorityLevelConfiguration").metadata(mock(V1ObjectMeta.class)).spec(mock(V1PriorityLevelConfigurationSpec.class)).status(mock(V1PriorityLevelConfigurationStatus.class));
        int hashCode = config.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: FF7D800C1143AE23F34945429F216965
    @Test
    void testToString() {
        V1PriorityLevelConfiguration config = new V1PriorityLevelConfiguration().apiVersion("v1").kind("PriorityLevelConfiguration").metadata(mock(V1ObjectMeta.class)).spec(mock(V1PriorityLevelConfigurationSpec.class)).status(mock(V1PriorityLevelConfigurationStatus.class));
        String toString = config.toString();
        assertNotNull(toString);
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("spec"), is(true));
        assertThat(toString.contains("status"), is(true));
    }
}

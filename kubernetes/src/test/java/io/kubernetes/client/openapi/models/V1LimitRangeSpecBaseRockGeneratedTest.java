package io.kubernetes.client.openapi.models;

import java.util.List;
import com.google.gson.Gson;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import java.util.ArrayList;
import com.google.gson.JsonElement;
import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.openapi.models.V1LimitRangeItem;
import io.kubernetes.client.openapi.models.V1LimitRangeSpec;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
public class V1LimitRangeSpecBaseRockGeneratedTest {

    @Mock
    private V1LimitRangeItem mockLimitRangeItem;

    @Mock
    private Gson mockGson;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    //BaseRock generated method id: ${testFromJson}, hash: 73531E276FB597688A9BDF58BFCEEB34
    @Test
    public void testFromJson() throws IOException {
        String jsonString = "{\"limits\":[{\"type\":\"Container\"}]}";
        V1LimitRangeSpec spec = new V1LimitRangeSpec();
        when(mockGson.fromJson(jsonString, V1LimitRangeSpec.class)).thenReturn(spec);
        JSON.setGson(mockGson);
        V1LimitRangeSpec result = V1LimitRangeSpec.fromJson(jsonString);
        assertThat(result, is(notNullValue()));
        assertThat(result, is(equalTo(spec)));
        verify(mockGson).fromJson(eq(jsonString), eq(V1LimitRangeSpec.class));
    }

    //BaseRock generated method id: ${testLimits}, hash: FCC1BF42A3953C9865E8961D0662EAAE
    @Test
    public void testLimits() {
        V1LimitRangeSpec spec = new V1LimitRangeSpec();
        List<V1LimitRangeItem> limits = new ArrayList<>();
        limits.add(mockLimitRangeItem);
        spec.setLimits(limits);
        assertThat(spec.getLimits(), is(equalTo(limits)));
    }

    //BaseRock generated method id: ${testAddLimitsItem}, hash: A4F9142AC8A1F140CF8B8C0DE63BAB60
    @Test
    public void testAddLimitsItem() {
        V1LimitRangeSpec spec = new V1LimitRangeSpec();
        spec.addLimitsItem(mockLimitRangeItem);
        assertThat(spec.getLimits(), hasItem(mockLimitRangeItem));
    }

    //BaseRock generated method id: ${testEquals}, hash: D4B7AAE8FECB28CA2DC14E64AB74C87A
    @Test
    public void testEquals() {
        V1LimitRangeSpec spec1 = new V1LimitRangeSpec();
        V1LimitRangeSpec spec2 = new V1LimitRangeSpec();
        List<V1LimitRangeItem> limits = new ArrayList<>();
        limits.add(mockLimitRangeItem);
        spec1.setLimits(limits);
        spec2.setLimits(limits);
        assertThat(spec1, is(equalTo(spec2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 5AF3C572B2C80EE7375A98AA231DFB51
    @Test
    public void testHashCode() {
        V1LimitRangeSpec spec = new V1LimitRangeSpec();
        List<V1LimitRangeItem> limits = new ArrayList<>();
        limits.add(mockLimitRangeItem);
        spec.setLimits(limits);
        int hashCode = spec.hashCode();
        assertThat(hashCode, is(not(0)));
    }

    //BaseRock generated method id: ${testToString}, hash: 2ABCAA810CF7AC9F08907DE3402063ED
    @Test
    public void testToString() {
        V1LimitRangeSpec spec = new V1LimitRangeSpec();
        List<V1LimitRangeItem> limits = new ArrayList<>();
        limits.add(mockLimitRangeItem);
        spec.setLimits(limits);
        String result = spec.toString();
        assertThat(result, containsString("class V1LimitRangeSpec"));
        assertThat(result, containsString("limits:"));
    }
}

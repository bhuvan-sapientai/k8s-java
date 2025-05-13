package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1CustomResourceConversion;
import com.google.gson.JsonParseException;
import com.google.gson.Gson;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import com.google.gson.reflect.TypeToken;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.io.IOException;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1WebhookConversion;
import com.google.gson.TypeAdapter;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.JSON;
import org.junit.jupiter.params.provider.NullSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
public class V1CustomResourceConversionBaseRockGeneratedTest {

    // ... [All existing test methods remain unchanged]
    //BaseRock generated method id: ${testCustomTypeAdapterFactory}, hash: 4E2DD3E889AB4A86A8A218551A943721
    @Test
    public void testCustomTypeAdapterFactory() {
        V1CustomResourceConversion.CustomTypeAdapterFactory factory = new V1CustomResourceConversion.CustomTypeAdapterFactory();
        assertThat(factory, is(notNullValue()));
        Gson gson = new Gson();
        TypeAdapter<?> adapter = factory.create(gson, TypeToken.get(V1CustomResourceConversion.class));
        assertThat(adapter, is(notNullValue()));
    }

    //BaseRock generated method id: ${testCustomTypeAdapterFactoryWithNonMatchingType}, hash: C32B20AC38A37EFCE8A504285BAFD6A0
    @Test
    public void testCustomTypeAdapterFactoryWithNonMatchingType() {
        V1CustomResourceConversion.CustomTypeAdapterFactory factory = new V1CustomResourceConversion.CustomTypeAdapterFactory();
        Gson gson = new Gson();
        TypeAdapter<?> adapter = factory.create(gson, TypeToken.get(String.class));
        assertThat(adapter, is(nullValue()));
    }
}

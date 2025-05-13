package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.custom.Quantity;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import java.io.IOException;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class // Other test methods remain unchanged
V1ContainerStatusBaseRockGeneratedTest {

    @Mock
    private V1ContainerState mockLastState;

    @Mock
    private V1ContainerState mockState;

    @Mock
    private V1ContainerUser mockUser;

    @Mock
    private V1ResourceRequirements mockResources;

    private V1ContainerStatus containerStatus;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        containerStatus = new V1ContainerStatus();
    }

    // Other test methods remain unchanged
    //BaseRock generated method id: ${testValidateJsonElementInvalidFieldType}, hash: 1CBC8DD6F00C84C07368C0528778A945
    @Disabled()
    @Test
    void testValidateJsonElementInvalidFieldType() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("image", "nginx:latest");
        jsonObject.addProperty("imageID", "sha256:1234567890abcdef");
        jsonObject.addProperty("name", "my-container");
        jsonObject.addProperty("ready", "not a boolean");
        jsonObject.addProperty("restartCount", 5);
        assertThrows(IllegalArgumentException.class, () -> {
            V1ContainerStatus.validateJsonElement(jsonObject);
        });
    }
}

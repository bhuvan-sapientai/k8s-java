package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.lang.reflect.Method;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.containsInAnyOrder;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.ParameterizedTest;
import java.util.Objects;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.CoreMatchers.nullValue;
import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
public class V1PriorityLevelConfigurationStatusBaseRockGeneratedTest {

    // All other test methods remain unchanged
    //BaseRock generated method id: ${testHashCode}, hash: 17D16EEF890036FD57847BDC51ED7CF0
    @Test
    public void testHashCode() {
        V1PriorityLevelConfigurationCondition condition = mock(V1PriorityLevelConfigurationCondition.class);
        List<V1PriorityLevelConfigurationCondition> conditions = new ArrayList<>();
        conditions.add(condition);
        V1PriorityLevelConfigurationStatus status = new V1PriorityLevelConfigurationStatus().conditions(conditions);
        int expectedHashCode = Objects.hash(conditions);
        assertEquals(expectedHashCode, status.hashCode());
    }
}

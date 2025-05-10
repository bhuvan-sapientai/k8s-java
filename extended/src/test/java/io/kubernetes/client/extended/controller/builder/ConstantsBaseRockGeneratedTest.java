package io.kubernetes.client.extended.controller.builder;

import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class ConstantsBaseRockGeneratedTest {

    //BaseRock generated method id: ${testDefaultWorkerCount}, hash: 703F168054EEB822D9ACCD036713BBB3
    @Test
    void testDefaultWorkerCount() {
        assertEquals(16, Constants.DEFAULT_WORKER_COUNT);
    }

    //BaseRock generated method id: ${testConstantsClassInstantiation}, hash: 2A33EED14C9BEB6ECB398C8159686743
    @Test
    void testConstantsClassInstantiation() {
        Constants constants = new Constants();
        assertNotNull(constants);
    }
}

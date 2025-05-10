package io.kubernetes.client.extended.wait;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
public class WaitBaseRockGeneratedTest {

    //BaseRock generated method id: ${testWaitClassIsDeprecated}, hash: 2AA86053EB6A8BE5ADEAA2B30264C1C4
    @Test
    public void testWaitClassIsDeprecated() {
        assertTrue(Wait.class.isAnnotationPresent(Deprecated.class), "Wait class should be annotated with @Deprecated");
    }

    //BaseRock generated method id: ${testWaitClassExtendsUtilWait}, hash: F003AB7FA0EC89E3DF0EAFAD352A785A
    @Test
    public void testWaitClassExtendsUtilWait() {
        assertTrue(io.kubernetes.client.util.wait.Wait.class.isAssignableFrom(Wait.class), "Wait class should extend io.kubernetes.client.util.wait.Wait");
    }

    //BaseRock generated method id: ${testWaitClassInstantiation}, hash: 6E981534D0EBC3A54C478C1253C24E86
    @Test
    public void testWaitClassInstantiation() {
        Wait wait = new Wait();
        assertNotNull(wait, "Should be able to instantiate Wait class");
    }
}

package io.kubernetes.client.extended.controller;

import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.extended.leaderelection.LeaderElector;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class LeaderElectingControllerBaseRockGeneratedTest {

    @Mock
    private LeaderElector leaderElector;

    @Mock
    private Controller delegateController;

    private LeaderElectingController leaderElectingController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        leaderElectingController = new LeaderElectingController(leaderElector, delegateController);
    }

    //BaseRock generated method id: ${testShutdown}, hash: 1CD7A321AB9F59B3C74E3391C3FD11AC
    @Test
    void testShutdown() {
        leaderElectingController.shutdown();
        verify(delegateController).shutdown();
    }

    //BaseRock generated method id: ${testRun}, hash: 756BB92A867A25C862F584A3B09A670C
    @Test
    void testRun() {
        leaderElectingController.run();
        verify(leaderElector).run(any(Runnable.class), any(Runnable.class));
    }

    //BaseRock generated method id: ${testRunCallbacksExecuted}, hash: 7BACA1425AF795E140ACFBFF7AA11DBF
    @Test
    void testRunCallbacksExecuted() {
        doAnswer(invocation -> {
            Runnable startCallback = invocation.getArgument(0);
            Runnable stopCallback = invocation.getArgument(1);
            startCallback.run();
            stopCallback.run();
            return null;
        }).when(leaderElector).run(any(Runnable.class), any(Runnable.class));
        leaderElectingController.run();
        verify(delegateController).run();
        verify(delegateController).shutdown();
    }
}

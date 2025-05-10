package io.kubernetes.client.extended.controller.builder;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.workqueue.WorkQueue;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.extended.controller.builder.ControllerManagerBuilder;
import io.kubernetes.client.informer.SharedInformerFactory;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.extended.controller.builder.DefaultControllerBuilder;
import static org.mockito.Mockito.mockStatic;
import io.kubernetes.client.extended.controller.reconciler.Request;
import org.mockito.MockedStatic;
import io.kubernetes.client.extended.controller.builder.ControllerWatchBuilder;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class ControllerBuilderBaseRockGeneratedTest {

    //BaseRock generated method id: ${testDefaultBuilder}, hash: 20DBD776702525D7FA29EF6A736BB06D
    @Test
    void testDefaultBuilder() {
        SharedInformerFactory mockFactory = mock(SharedInformerFactory.class);
        DefaultControllerBuilder result = ControllerBuilder.defaultBuilder(mockFactory);
        assertThat(result, notNullValue());
        assertThat(result, instanceOf(DefaultControllerBuilder.class));
    }

    //BaseRock generated method id: ${testControllerManagerBuilder}, hash: 15A52FEDA6A72FCFF7640CBAA1A61B9D
    @Test
    void testControllerManagerBuilder() {
        SharedInformerFactory mockFactory = mock(SharedInformerFactory.class);
        ControllerManagerBuilder result = ControllerBuilder.controllerManagerBuilder(mockFactory);
        assertThat(result, notNullValue());
        assertThat(result, instanceOf(ControllerManagerBuilder.class));
    }

    //BaseRock generated method id: ${testControllerWatchBuilder}, hash: E36C45A40FF168202907256B4FA0BC36
    @Test
    void testControllerWatchBuilder() {
        Class<KubernetesObject> mockApiTypeClass = KubernetesObject.class;
        WorkQueue<Request> mockWorkQueue = mock(WorkQueue.class);
        ControllerWatchBuilder<KubernetesObject> result = ControllerBuilder.controllerWatchBuilder(mockApiTypeClass, mockWorkQueue);
        assertThat(result, notNullValue());
        assertThat(result, instanceOf(ControllerWatchBuilder.class));
    }

    //BaseRock generated method id: ${testControllerBuilderInstantiation}, hash: A162A04E117EB5CB0C723D8C19924EBC
    @Test
    void testControllerBuilderInstantiation() {
        ControllerBuilder controllerBuilder = new ControllerBuilder();
        assertThat(controllerBuilder, notNullValue());
    }
}

package io.kubernetes.client.extended.controller.builder;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.extended.controller.Controller;
import org.mockito.Mock;
import io.kubernetes.client.informer.SharedInformerFactory;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.extended.controller.ControllerManager;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class ControllerManagerBuilderBaseRockGeneratedTest {

    @Mock
    private SharedInformerFactory mockSharedInformerFactory;

    @Mock
    private Controller mockController1;

    @Mock
    private Controller mockController2;

    private ControllerManagerBuilder controllerManagerBuilder;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        controllerManagerBuilder = new ControllerManagerBuilder(mockSharedInformerFactory);
    }

    //BaseRock generated method id: ${testAddController}, hash: 43D7971B6F6EC42164E91E2299B38D68
    @Test
    void testAddController() {
        ControllerManagerBuilder result = controllerManagerBuilder.addController(mockController1);
        assertThat(result, is(notNullValue()));
        assertThat(result, is(equalTo(controllerManagerBuilder)));
    }

    //BaseRock generated method id: ${testBuild}, hash: 39B83103B58365D4CD8CD3A12D50FBC3
    @Test
    void testBuild() {
        controllerManagerBuilder.addController(mockController1);
        controllerManagerBuilder.addController(mockController2);
        ControllerManager result = controllerManagerBuilder.build();
        assertThat(result, is(notNullValue()));
        verify(mockController1, times(0)).run();
        verify(mockController2, times(0)).run();
    }

    //BaseRock generated method id: ${testBuildWithNoControllers}, hash: 8F7B852C1F85878D92FFEFA04EF2A664
    @Test
    void testBuildWithNoControllers() {
        ControllerManager result = controllerManagerBuilder.build();
        assertThat(result, is(notNullValue()));
    }

    //BaseRock generated method id: ${testAddMultipleControllers}, hash: 051579DE8CB4BB1E883ECC0C401B0D50
    @Test
    void testAddMultipleControllers() {
        ControllerManagerBuilder result = controllerManagerBuilder.addController(mockController1).addController(mockController2);
        assertThat(result, is(notNullValue()));
        assertThat(result, is(equalTo(controllerManagerBuilder)));
    }

    //BaseRock generated method id: ${testConstructor}, hash: 25EE0445E9484A1CE7AD53DCE0A26335
    @Test
    void testConstructor() {
        ControllerManagerBuilder builder = new ControllerManagerBuilder(mockSharedInformerFactory);
        assertThat(builder, is(notNullValue()));
    }
}

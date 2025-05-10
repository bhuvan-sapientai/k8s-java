package io.kubernetes.client.extended.kubectl;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1Node;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class KubectlDrainBaseRockGeneratedTest {

    //BaseRock generated method id: ${gracePeriodTest}, hash: 0F83ACC19501EF1CA9DB207BD1095B65
    @Test()
    void gracePeriodTest() {
        //Arrange Statement(s)
        KubectlDrain target = new KubectlDrain();
        
        //Act Statement(s)
        KubectlDrain result = target.gracePeriod(0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //BaseRock generated method id: ${forceTest}, hash: 7BA9111544EA6CE0D75C29A0B39AFC31
    @Test()
    void forceTest() {
        //Arrange Statement(s)
        KubectlDrain target = new KubectlDrain();
        
        //Act Statement(s)
        KubectlDrain result = target.force();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //BaseRock generated method id: ${ignoreDaemonSetsTest}, hash: E3F2A58C3FF1184FFE87A51CAF374EED
    @Test()
    void ignoreDaemonSetsTest() {
        //Arrange Statement(s)
        KubectlDrain target = new KubectlDrain();
        
        //Act Statement(s)
        KubectlDrain result = target.ignoreDaemonSets();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //BaseRock generated method id: ${executeWhenNotIgnoreDaemonSetsThrowsNullPointerException}, hash: A5306D5749C44D61014B73E0E666A26B
    @Disabled()
    @Test()
    void executeWhenNotIgnoreDaemonSetsThrowsNullPointerException() throws KubectlException {
        /* Branches:
         * (for-each(pods)) : true  #  inside validatePods method
         * (pod.getMetadata().getOwnerReferences() == null) : true  #  inside validatePods method
         * (!ignoreDaemonSets) : true  #  inside validatePods method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: allPods - Method: getItems
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        KubectlDrain target = spy(new KubectlDrain());
        doNothing().when(target).refreshDiscovery();
        V1ObjectMeta v1ObjectMeta = new V1ObjectMeta();
        v1ObjectMeta.setName("A");
        V1Node v1Node = new V1Node();
        v1Node.setMetadata(v1ObjectMeta);
        doReturn(v1Node).when(target).performCordon();
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            target.execute();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(target).refreshDiscovery();
            verify(target).performCordon();
        });
    }

    //BaseRock generated method id: ${executeWhenRefGetKindEqualsDaemonSetThrowsKubectlException}, hash: 8D8D00F279D979F9C939CA4C6D5CB943
    @Disabled()
    @Test()
    void executeWhenRefGetKindEqualsDaemonSetThrowsKubectlException() throws KubectlException {
        /* Branches:
         * (for-each(pods)) : true  #  inside validatePods method
         * (pod.getMetadata().getOwnerReferences() == null) : false  #  inside validatePods method
         * (!ignoreDaemonSets) : true  #  inside validatePods method
         * (for-each(pod.getMetadata().getOwnerReferences())) : true  #  inside validatePods method
         * (ref.getKind().equals("DaemonSet")) : true  #  inside validatePods method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: allPods - Method: getItems
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        KubectlDrain target = spy(new KubectlDrain());
        doNothing().when(target).refreshDiscovery();
        V1ObjectMeta v1ObjectMeta = new V1ObjectMeta();
        v1ObjectMeta.setName("A");
        V1Node v1Node = new V1Node();
        v1Node.setMetadata(v1ObjectMeta);
        doReturn(v1Node).when(target).performCordon();
        KubectlException kubectlException = new KubectlException("Pod managed by DaemonSet found");
        //Act Statement(s)
        final KubectlException result = assertThrows(KubectlException.class, () -> {
            target.execute();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(kubectlException.getMessage()));
            verify(target).refreshDiscovery();
            verify(target).performCordon();
        });
    }

    //BaseRock generated method id: ${executeWhenCaughtApiExceptionOrIOExceptionThrowsKubectlException}, hash: E988BE4B8CF591B3F896E3717274EBFB
    @Disabled()
    @Test()
    void executeWhenCaughtApiExceptionOrIOExceptionThrowsKubectlException() throws KubectlException {
        /* Branches:
         * (for-each(pods)) : false  #  inside validatePods method
         * (for-each(allPods.getItems())) : true  #  inside doDrain method
         * (pod.getMetadata().getOwnerReferences() != null) : true  #  inside doDrain method
         * (for-each(pod.getMetadata().getOwnerReferences())) : true  #  inside doDrain method
         * (ref.getKind().equals("DaemonSet")) : true  #  inside doDrain method
         * (!isDaemonSetPod) : false  #  inside doDrain method
         * (catch-exception (ApiException | IOException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: allPods - Method: getItems
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        KubectlDrain target = spy(new KubectlDrain());
        doNothing().when(target).refreshDiscovery();
        V1ObjectMeta v1ObjectMeta = new V1ObjectMeta();
        v1ObjectMeta.setName("A");
        V1Node v1Node = new V1Node();
        v1Node.setMetadata(v1ObjectMeta);
        doReturn(v1Node).when(target).performCordon();
        Exception exception = new Exception();
        //Act Statement(s)
        final KubectlException result = assertThrows(KubectlException.class, () -> {
            target.execute();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), is(instanceOf(exception.getClass())));
            verify(target).refreshDiscovery();
            verify(target).performCordon();
        });
    }

    //BaseRock generated method id: ${executeWhenIsDaemonSetPod}, hash: 9B9168F52E16119CF6E6035D41B51491
    @Disabled()
    @Test()
    void executeWhenIsDaemonSetPod() throws KubectlException {
        /* Branches:
         * (for-each(pods)) : true  #  inside validatePods method
         * (pod.getMetadata().getOwnerReferences() == null) : false  #  inside validatePods method
         * (!ignoreDaemonSets) : true  #  inside validatePods method
         * (for-each(pod.getMetadata().getOwnerReferences())) : true  #  inside validatePods method
         * (ref.getKind().equals("DaemonSet")) : false  #  inside validatePods method
         * (for-each(allPods.getItems())) : true  #  inside doDrain method
         * (pod.getMetadata().getOwnerReferences() != null) : true  #  inside doDrain method
         * (for-each(pod.getMetadata().getOwnerReferences())) : true  #  inside doDrain method
         * (ref.getKind().equals("DaemonSet")) : true  #  inside doDrain method
         * (!isDaemonSetPod) : false  #  inside doDrain method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: allPods - Method: getItems
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        KubectlDrain target = spy(new KubectlDrain());
        doNothing().when(target).refreshDiscovery();
        V1ObjectMeta v1ObjectMeta = new V1ObjectMeta();
        v1ObjectMeta.setName("A");
        V1Node v1Node = new V1Node();
        v1Node.setMetadata(v1ObjectMeta);
        doReturn(v1Node).when(target).performCordon();
        
        //Act Statement(s)
        V1Node result = target.execute();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(v1Node));
            verify(target).refreshDiscovery();
            verify(target).performCordon();
        });
    }

    //BaseRock generated method id: ${executeWhenSystemCurrentTimeMillisMinusStartNotLessThanThisGracePeriodSecondsPlus10MultipliedBy103ThrowsKubectlException}, hash: 9E6C0800CAA8096D196898453384FDA1
    @Disabled()
    @Test()
    void executeWhenSystemCurrentTimeMillisMinusStartNotLessThanThisGracePeriodSecondsPlus10MultipliedBy103ThrowsKubectlException() throws KubectlException {
        /* Branches:
         * (for-each(pods)) : true  #  inside validatePods method
         * (pod.getMetadata().getOwnerReferences() == null) : false  #  inside validatePods method
         * (!ignoreDaemonSets) : true  #  inside validatePods method
         * (for-each(pod.getMetadata().getOwnerReferences())) : true  #  inside validatePods method
         * (ref.getKind().equals("DaemonSet")) : false  #  inside validatePods method
         * (for-each(allPods.getItems())) : true  #  inside doDrain method
         * (pod.getMetadata().getOwnerReferences() != null) : true  #  inside doDrain method
         * (for-each(pod.getMetadata().getOwnerReferences())) : true  #  inside doDrain method
         * (ref.getKind().equals("DaemonSet")) : false  #  inside doDrain method
         * (!isDaemonSetPod) : true  #  inside doDrain method
         * (System.currentTimeMillis() - start < (this.gracePeriodSeconds + 10) * 1000) : false  #  inside waitForPodDelete method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: allPods - Method: getItems
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        KubectlDrain target = spy(new KubectlDrain());
        doNothing().when(target).refreshDiscovery();
        V1ObjectMeta v1ObjectMeta = new V1ObjectMeta();
        v1ObjectMeta.setName("A");
        V1Node v1Node = new V1Node();
        v1Node.setMetadata(v1ObjectMeta);
        doReturn(v1Node).when(target).performCordon();
        KubectlException kubectlException = new KubectlException("Timed out waiting for Pod delete.");
        //Act Statement(s)
        final KubectlException result = assertThrows(KubectlException.class, () -> {
            target.execute();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(kubectlException.getMessage()));
            verify(target).refreshDiscovery();
            verify(target).performCordon();
        });
    }

    //BaseRock generated method id: ${executeWhenExGetCodeEqualsHttpURLConnectionHTTP_NOT_FOUND}, hash: D1A279E28EE1E3721313C962FC5DC65A
    @Disabled()
    @Test()
    void executeWhenExGetCodeEqualsHttpURLConnectionHTTP_NOT_FOUND() throws KubectlException {
        /* Branches:
         * (for-each(pods)) : true  #  inside validatePods method
         * (pod.getMetadata().getOwnerReferences() == null) : false  #  inside validatePods method
         * (!ignoreDaemonSets) : true  #  inside validatePods method
         * (for-each(pod.getMetadata().getOwnerReferences())) : true  #  inside validatePods method
         * (ref.getKind().equals("DaemonSet")) : false  #  inside validatePods method
         * (for-each(allPods.getItems())) : true  #  inside doDrain method
         * (pod.getMetadata().getOwnerReferences() != null) : true  #  inside doDrain method
         * (for-each(pod.getMetadata().getOwnerReferences())) : true  #  inside doDrain method
         * (ref.getKind().equals("DaemonSet")) : false  #  inside doDrain method
         * (!isDaemonSetPod) : true  #  inside doDrain method
         * (catch-exception (ApiException)) : true  #  inside waitForPodDelete method
         * (ex.getCode() == HttpURLConnection.HTTP_NOT_FOUND) : true  #  inside waitForPodDelete method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: allPods - Method: getItems
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        KubectlDrain target = spy(new KubectlDrain());
        doNothing().when(target).refreshDiscovery();
        V1ObjectMeta v1ObjectMeta = new V1ObjectMeta();
        v1ObjectMeta.setName("A");
        V1Node v1Node = new V1Node();
        v1Node.setMetadata(v1ObjectMeta);
        doReturn(v1Node).when(target).performCordon();
        
        //Act Statement(s)
        V1Node result = target.execute();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(v1Node));
            verify(target).refreshDiscovery();
            verify(target).performCordon();
        });
    }

    //BaseRock generated method id: ${executeWhenExGetCodeNotEqualsHttpURLConnectionHTTP_NOT_FOUNDThrowsKubectlException}, hash: 320CED930AEDD9E5D64C165EED06D825
    @Disabled()
    @Test()
    void executeWhenExGetCodeNotEqualsHttpURLConnectionHTTP_NOT_FOUNDThrowsKubectlException() throws KubectlException {
        /* Branches:
         * (for-each(pods)) : true  #  inside validatePods method
         * (pod.getMetadata().getOwnerReferences() == null) : false  #  inside validatePods method
         * (!ignoreDaemonSets) : true  #  inside validatePods method
         * (for-each(pod.getMetadata().getOwnerReferences())) : true  #  inside validatePods method
         * (ref.getKind().equals("DaemonSet")) : false  #  inside validatePods method
         * (for-each(allPods.getItems())) : true  #  inside doDrain method
         * (pod.getMetadata().getOwnerReferences() != null) : true  #  inside doDrain method
         * (for-each(pod.getMetadata().getOwnerReferences())) : true  #  inside doDrain method
         * (ref.getKind().equals("DaemonSet")) : false  #  inside doDrain method
         * (!isDaemonSetPod) : true  #  inside doDrain method
         * (catch-exception (ApiException)) : true  #  inside waitForPodDelete method
         * (ex.getCode() == HttpURLConnection.HTTP_NOT_FOUND) : false  #  inside waitForPodDelete method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: allPods - Method: getItems
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        KubectlDrain target = spy(new KubectlDrain());
        doNothing().when(target).refreshDiscovery();
        V1ObjectMeta v1ObjectMeta = new V1ObjectMeta();
        v1ObjectMeta.setName("A");
        V1Node v1Node = new V1Node();
        v1Node.setMetadata(v1ObjectMeta);
        doReturn(v1Node).when(target).performCordon();
        ApiException apiException = new ApiException(0, "message1");
        //Act Statement(s)
        final KubectlException result = assertThrows(KubectlException.class, () -> {
            target.execute();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), is(instanceOf(apiException.getClass())));
            verify(target).refreshDiscovery();
            verify(target).performCordon();
        });
    }
}

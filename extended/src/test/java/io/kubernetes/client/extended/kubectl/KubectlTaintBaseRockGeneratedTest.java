package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.openapi.ApiClient;
import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import io.kubernetes.client.openapi.models.V1Node;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import org.mockito.Mock;
import org.junit.jupiter.api.Disabled;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import org.mockito.MockedStatic;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.util.taints.Taints;
import io.kubernetes.client.util.taints.Taints.Effect;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import org.apache.commons.lang3.tuple.ImmutablePair;
import io.kubernetes.client.util.taints.Taints.TaintsBuilder;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class KubectlTaintBaseRockGeneratedTest {

    @Mock
    private ApiClient apiClient;

    @Mock
    private CoreV1Api coreV1Api;

    @Mock
    private V1Node v1Node;

    @Mock
    private TaintsBuilder taintsBuilder;

    private KubectlTaint kubectlTaint;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        kubectlTaint = new KubectlTaint();
        kubectlTaint.apiClient(apiClient);
    }

    //BaseRock generated method id: ${testAddTaint}, hash: 4E94723926B3B0FCEAE91EBB92C873BF
    @Test
    void testAddTaint() {
        KubectlTaint result = kubectlTaint.addTaint("key", "effect");
        assertThat(result, is(notNullValue()));
    }

    //BaseRock generated method id: ${testAddTaintWithValue}, hash: 1556270ADA1967EBB4B8E813187518B6
    @Test
    void testAddTaintWithValue() {
        KubectlTaint result = kubectlTaint.addTaint("key", "value", "effect");
        assertThat(result, is(notNullValue()));
    }

    //BaseRock generated method id: ${testRemoveTaint}, hash: F964C4169834A3FB184467B2818D2309
    @Test
    void testRemoveTaint() {
        KubectlTaint result = kubectlTaint.removeTaint("key");
        assertThat(result, is(notNullValue()));
    }

    //BaseRock generated method id: ${testRemoveTaintWithEffect}, hash: BE86435EA300EDE19B4629ACFB6E0BDB
    @Test
    void testRemoveTaintWithEffect() {
        KubectlTaint result = kubectlTaint.removeTaint("key", "effect");
        assertThat(result, is(notNullValue()));
    }

    //BaseRock generated method id: ${testExecute}, hash: 9A4869F72A700205EF47A2144C9A12A3
    @Disabled
    @Test
    void testExecute() throws KubectlException, ApiException, IOException {
    }

    //BaseRock generated method id: ${testExecuteWithException}, hash: 12FB9BE455FEF9A9D10C662E164B4E76
    @Disabled()
    @Test
    void testExecuteWithException() throws KubectlException, ApiException {
        kubectlTaint.name("nodeName");
        try (MockedStatic<Taints> taintsMockedStatic = mockStatic(Taints.class)) {
            taintsMockedStatic.when(() -> Taints.taints(any())).thenReturn(taintsBuilder);
            CoreV1Api.APIreadNodeRequest mockRequest = mock(CoreV1Api.APIreadNodeRequest.class);
            when(coreV1Api.readNode(anyString())).thenReturn(mockRequest);
            when(mockRequest.execute()).thenThrow(new ApiException("API Exception"));
            assertThrows(KubectlException.class, () -> kubectlTaint.execute());
        }
    }

    //BaseRock generated method id: ${testMakeEffect}, hash: 29E6D810CC4EC4C9769FEA897987B204
    @Disabled()
    @Test
    void testMakeEffect() {
        assertThrows(KubectlException.class, () -> kubectlTaint.addTaint("key", "INVALID_EFFECT"));
    }

    //BaseRock generated method id: ${testVerifyArguments}, hash: 6D641A090FAA636747F4D3008B5D2DB0
    @Test
    void testVerifyArguments() {
        assertThrows(KubectlException.class, () -> kubectlTaint.execute());
    }

    //BaseRock generated method id: ${testExecuteWithAddingTaints}, hash: DD4F21447D15785C7DD71AFA059454A5
    @Disabled
    @Test
    void testExecuteWithAddingTaints() throws KubectlException, ApiException, IOException {
    }

    //BaseRock generated method id: ${testExecuteWithRemovingTaints}, hash: C5D792916966041D6CD17A6F98808089
    @Disabled
    @Test
    void testExecuteWithRemovingTaints() throws KubectlException, ApiException, IOException {
    }

    //BaseRock generated method id: ${testConstructor}, hash: F5D67A3C6B81709F30BD035526087F15
    @Test
    void testConstructor() {
        KubectlTaint kubectlTaint = new KubectlTaint();
        assertThat(kubectlTaint, is(notNullValue()));
    }
}

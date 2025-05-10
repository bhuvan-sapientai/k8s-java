package io.kubernetes.client.extended.pager;

import io.kubernetes.client.openapi.ApiClient;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import java.util.Iterator;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;
import okhttp3.Call;
import java.io.IOException;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.lang.reflect.Type;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.closeTo;
import java.util.function.Function;
import io.kubernetes.client.common.KubernetesListObject;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class PagerBaseRockGeneratedTest {

    @Mock
    private ApiClient mockApiClient;

    @Mock
    private Function<Pager.PagerParams, Call> mockListFunc;

    @Mock
    private Call mockCall;

    @Mock
    private KubernetesListObject mockListObject;

    @Mock
    private KubernetesObject mockApiObject;

    private Pager<KubernetesObject, KubernetesListObject> pager;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        pager = new Pager<>(mockListFunc, mockApiClient, 10, KubernetesListObject.class);
    }

    //BaseRock generated method id: ${testIterator}, hash: F327CB64D2C11CA8C40BCAD7961174E3
    @Test
    void testIterator() throws IOException, ApiException {
        when(mockListFunc.apply(any())).thenReturn(mockCall);
        when(mockApiClient.handleResponse(any(), any())).thenReturn(mockListObject);
        List<KubernetesObject> items = new ArrayList<>();
        items.add(mockApiObject);
        when(mockListObject.getItems()).thenReturn((List) items);
        when(mockListObject.getMetadata()).thenReturn(mock(V1ListMeta.class));
        Iterator<KubernetesObject> iterator = pager.iterator();
        assertTrue(iterator.hasNext());
        assertSame(mockApiObject, iterator.next());
        assertFalse(iterator.hasNext());
        verify(mockListFunc).apply(any());
        verify(mockApiClient).handleResponse(any(), any());
    }

    //BaseRock generated method id: ${testIteratorWithMultiplePages}, hash: 9C1D56121EB2743A6367AD000DF97197
    @Disabled()
    @Test
    void testIteratorWithMultiplePages() throws IOException, ApiException {
        when(mockListFunc.apply(any())).thenReturn(mockCall);
        when(mockApiClient.handleResponse(any(), any())).thenReturn(mockListObject);
        List<KubernetesObject> firstPage = new ArrayList<>();
        firstPage.add(mockApiObject);
        List<KubernetesObject> secondPage = new ArrayList<>();
        secondPage.add(mock(KubernetesObject.class));
        when(mockListObject.getItems()).thenReturn((List) firstPage).thenReturn((List) secondPage).thenReturn(new ArrayList<>());
        V1ListMeta mockMetadata = mock(V1ListMeta.class);
        when(mockMetadata.getContinue()).thenReturn("token").thenReturn(null);
        when(mockListObject.getMetadata()).thenReturn(mockMetadata);
        Iterator<KubernetesObject> iterator = pager.iterator();
        assertTrue(iterator.hasNext());
        assertSame(mockApiObject, iterator.next());
        assertTrue(iterator.hasNext());
        assertNotNull(iterator.next());
        assertFalse(iterator.hasNext());
        verify(mockListFunc, times(3)).apply(any());
        verify(mockApiClient, times(3)).handleResponse(any(), any());
    }

    //BaseRock generated method id: ${testIteratorWithEmptyList}, hash: C45DE60D8AE155BED60418D518E096A1
    @Test
    void testIteratorWithEmptyList() throws IOException, ApiException {
        when(mockListFunc.apply(any())).thenReturn(mockCall);
        when(mockApiClient.handleResponse(any(), any())).thenReturn(mockListObject);
        when(mockListObject.getItems()).thenReturn(new ArrayList<>());
        when(mockListObject.getMetadata()).thenReturn(mock(V1ListMeta.class));
        Iterator<KubernetesObject> iterator = pager.iterator();
        assertFalse(iterator.hasNext());
        verify(mockListFunc).apply(any());
        verify(mockApiClient).handleResponse(any(), any());
    }

    //BaseRock generated method id: ${testIteratorWithApiException}, hash: FC6D18D517762E96B623A6AFAF0F3B18
    @Disabled()
    @Test
    void testIteratorWithApiException() throws IOException, ApiException {
        when(mockListFunc.apply(any())).thenReturn(mockCall);
        when(mockApiClient.handleResponse(any(), any())).thenThrow(new ApiException("API Error"));
        Iterator<KubernetesObject> iterator = pager.iterator();
        RuntimeException exception = assertThrows(RuntimeException.class, () -> iterator.hasNext());
        assertEquals("API Error", exception.getCause().getMessage());
        verify(mockListFunc).apply(any());
        verify(mockApiClient).handleResponse(any(), any());
    }

    //BaseRock generated method id: ${testIteratorWithIOException}, hash: C71DD4B56AA55D1FF817E8DC5B01058F
    @Disabled()
    @Test
    void testIteratorWithIOException() throws IOException, ApiException {
        when(mockListFunc.apply(any())).thenReturn(mockCall);
        when(mockApiClient.handleResponse(any(), any())).thenThrow(new IOException("IO Error"));
        Iterator<KubernetesObject> iterator = pager.iterator();
        RuntimeException exception = assertThrows(RuntimeException.class, () -> iterator.hasNext());
        assertEquals("IO Error", exception.getCause().getMessage());
        verify(mockListFunc).apply(any());
        verify(mockApiClient).handleResponse(any(), any());
    }

    //BaseRock generated method id: ${testPagerParamsConstructor}, hash: F710CB471AEF3E08B73CAD433F26D3A4
    @Test
    void testPagerParamsConstructor() {
        Pager<KubernetesObject, KubernetesListObject> testPager = new Pager<>(mockListFunc, mockApiClient, 10, KubernetesListObject.class);
        assertNotNull(testPager);
    }
}

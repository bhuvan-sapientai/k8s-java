package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.provider.EmptySource;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullSource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1DeviceAllocationConfigurationBaseRockGeneratedTest {

    private V1beta1DeviceAllocationConfiguration configuration;

    @BeforeEach
    void setUp() {
        configuration = new V1beta1DeviceAllocationConfiguration();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 5226DCDFF1624F4E855C8F80FE66384A
    @Test
    void testConstructor() {
        assertThat(configuration, is(notNullValue()));
    }

    //BaseRock generated method id: ${testGetOpaque}, hash: 2117CB6F0B513671BDD09B1DF2568507
    @Test
    void testGetOpaque() {
        assertThat(configuration.getOpaque(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetOpaque}, hash: 9C93ED55C18B977B8F6AFBEC9D4828AD
    @Test
    void testSetOpaque() {
        V1beta1OpaqueDeviceConfiguration opaque = mock(V1beta1OpaqueDeviceConfiguration.class);
        configuration.setOpaque(opaque);
        assertThat(configuration.getOpaque(), is(equalTo(opaque)));
    }

    //BaseRock generated method id: ${testGetRequests}, hash: 50D6639306547C66A00D12D0410054DF
    @Test
    void testGetRequests() {
        assertThat(configuration.getRequests(), is(notNullValue()));
        assertThat(configuration.getRequests(), hasSize(0));
    }

    //BaseRock generated method id: ${testSetRequests}, hash: 49B932123C59099E9EF011C2BCF09E65
    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = { "request1", "request2" })
    void testSetRequests(String request) {
        List<String> requests = request == null ? null : List.of(request);
        configuration.setRequests(requests);
        if (requests == null) {
            assertThat(configuration.getRequests(), is(nullValue()));
        } else {
            assertThat(configuration.getRequests(), is(equalTo(requests)));
        }
    }

    //BaseRock generated method id: ${testAddRequestsItem}, hash: BDD969B7DD7D6A485DC32038BBC71CA8
    @Test
    void testAddRequestsItem() {
        String requestItem = "newRequest";
        configuration.addRequestsItem(requestItem);
        assertThat(configuration.getRequests(), hasSize(1));
        assertThat(configuration.getRequests().get(0), is(equalTo(requestItem)));
    }

    //BaseRock generated method id: ${testGetSource}, hash: 285931D65839CB32356F7AFD532EC142
    @Test
    void testGetSource() {
        assertThat(configuration.getSource(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetSource}, hash: 3441D7FC96E8FEF386457AED5382D087
    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = { "source1", "source2" })
    void testSetSource(String source) {
        configuration.setSource(source);
        assertThat(configuration.getSource(), is(equalTo(source)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 0546E700320BD5C196610FB17BE2EBBF
    @Test
    void testEquals() {
        V1beta1OpaqueDeviceConfiguration opaque1 = mock(V1beta1OpaqueDeviceConfiguration.class);
        V1beta1OpaqueDeviceConfiguration opaque2 = mock(V1beta1OpaqueDeviceConfiguration.class);
        V1beta1OpaqueDeviceConfiguration opaque3 = mock(V1beta1OpaqueDeviceConfiguration.class);
        V1beta1DeviceAllocationConfiguration config1 = new V1beta1DeviceAllocationConfiguration().opaque(opaque1).requests(List.of("request1", "request2")).source("source1");
        V1beta1DeviceAllocationConfiguration config2 = new V1beta1DeviceAllocationConfiguration().opaque(// Use the same mock object
        opaque1).requests(List.of("request1", "request2")).source("source1");
        V1beta1DeviceAllocationConfiguration config3 = new V1beta1DeviceAllocationConfiguration().opaque(opaque3).requests(List.of("request3")).source("source2");
        assertThat(config1.equals(config2), is(true));
        assertThat(config1.equals(config3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: C00CCE438E84322495C4319C8F406DA7
    @Test
    void testHashCode() {
        V1beta1OpaqueDeviceConfiguration opaque = mock(V1beta1OpaqueDeviceConfiguration.class);
        V1beta1DeviceAllocationConfiguration config1 = new V1beta1DeviceAllocationConfiguration().opaque(opaque).requests(List.of("request1", "request2")).source("source1");
        V1beta1DeviceAllocationConfiguration config2 = new V1beta1DeviceAllocationConfiguration().opaque(// Use the same mock object
        opaque).requests(List.of("request1", "request2")).source("source1");
        assertThat(config1.hashCode(), is(equalTo(config2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: FFA2BA61BBC2A29F2006DFC17F3827C4
    @Test
    void testToString() {
        V1beta1OpaqueDeviceConfiguration opaque = mock(V1beta1OpaqueDeviceConfiguration.class);
        doReturn("MockedOpaqueConfig").when(opaque).toString();
        configuration.setOpaque(opaque);
        configuration.setRequests(List.of("request1", "request2"));
        configuration.setSource("source1");
        String expectedString = "class V1beta1DeviceAllocationConfiguration {\n" + "    opaque: MockedOpaqueConfig\n" + "    requests: [request1, request2]\n" + "    source: source1\n" + "}";
        assertThat(configuration.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: F01C4F84BE17FADE33C369FE3CA6B315
    @Test
    void testValidateJsonElement() {
        // This method is not implemented in the provided source code
        // We can't test it without additional context
    }

    //BaseRock generated method id: ${testCustomTypeAdapterFactory}, hash: 5324DAF899065B17180EA25D4E08C322
    @Test
    void testCustomTypeAdapterFactory() {
        // This inner class is not directly testable without additional context
        // We would need to test it through the Gson serialization/deserialization process
    }

    //BaseRock generated method id: ${testFromJson}, hash: 18FB0B45EF5098EB7A1FAD8702954CBF
    @Test
    void testFromJson() {
        // This static method requires Gson context which is not provided
        // We can't test it without additional mocking of Gson
    }

    //BaseRock generated method id: ${testToJson}, hash: 9A4B48EE9E4AFE1716E9CCE769F3D644
    @Test
    void testToJson() {
        // This method requires Gson context which is not provided
        // We can't test it without additional mocking of Gson
    }
}

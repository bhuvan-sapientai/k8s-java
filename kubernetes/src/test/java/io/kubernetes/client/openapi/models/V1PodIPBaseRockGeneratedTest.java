package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.Objects;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.google.gson.JsonObject;
import io.kubernetes.client.openapi.models.V1PodIP;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import org.junit.jupiter.params.provider.NullSource;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
public class V1PodIPBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 63F97AD0BD6A41023AFEE563F57537EB
    @Test
    public void testConstructor() {
        V1PodIP podIP = new V1PodIP();
        assertThat(podIP, is(notNullValue()));
    }

    //BaseRock generated method id: ${testIpBuilder}, hash: 1D2AA77833EAE29AF39391D04E0A3D4B
    @Test
    public void testIpBuilder() {
        String testIp = "192.168.1.1";
        V1PodIP podIP = new V1PodIP().ip(testIp);
        assertThat(podIP, is(notNullValue()));
        assertThat(podIP.getIp(), is(equalTo(testIp)));
    }

    //BaseRock generated method id: ${testGetIp}, hash: D222C0B8CBD428D0B651B6E16D99F13D
    @Test
    public void testGetIp() {
        String testIp = "10.0.0.1";
        V1PodIP podIP = new V1PodIP();
        podIP.setIp(testIp);
        assertThat(podIP.getIp(), is(equalTo(testIp)));
    }

    //BaseRock generated method id: ${testSetIp}, hash: C97B88500AAAADAD41DDB0A1EDF830EE
    @Test
    public void testSetIp() {
        String testIp = "172.16.0.1";
        V1PodIP podIP = new V1PodIP();
        podIP.setIp(testIp);
        assertThat(podIP.getIp(), is(equalTo(testIp)));
    }

    //BaseRock generated method id: ${testEquals_SameObject}, hash: 0ADDC8347945ECB72E22FF55624053DD
    @Test
    public void testEquals_SameObject() {
        V1PodIP podIP = new V1PodIP().ip("192.168.1.1");
        assertTrue(podIP.equals(podIP));
    }

    //BaseRock generated method id: ${testEquals_NullObject}, hash: C0AD9869FAD78AE9489BBAED6A4A73EA
    @Test
    public void testEquals_NullObject() {
        V1PodIP podIP = new V1PodIP().ip("192.168.1.1");
        assertFalse(podIP.equals(null));
    }

    //BaseRock generated method id: ${testEquals_DifferentClass}, hash: F21709FDF8AA96CB7F1405E33541AD9E
    @Test
    public void testEquals_DifferentClass() {
        V1PodIP podIP = new V1PodIP().ip("192.168.1.1");
        assertFalse(podIP.equals("Not a V1PodIP instance"));
    }

    //BaseRock generated method id: ${testEquals_SameIpValues}, hash: 7149C74751BECB49AAC633A8149FD1CE
    @Test
    public void testEquals_SameIpValues() {
        V1PodIP podIP1 = new V1PodIP().ip("192.168.1.1");
        V1PodIP podIP2 = new V1PodIP().ip("192.168.1.1");
        assertTrue(podIP1.equals(podIP2));
        assertTrue(podIP2.equals(podIP1));
    }

    //BaseRock generated method id: ${testEquals_DifferentIpValues}, hash: D00D7F877A2C3E8C071AAED7DDF6FC54
    @Test
    public void testEquals_DifferentIpValues() {
        V1PodIP podIP1 = new V1PodIP().ip("192.168.1.1");
        V1PodIP podIP2 = new V1PodIP().ip("10.0.0.1");
        assertFalse(podIP1.equals(podIP2));
        assertFalse(podIP2.equals(podIP1));
    }

    //BaseRock generated method id: ${testEquals_NullIpInOneObject}, hash: 3A2D4B6FE15CB411E14418A481268ADC
    @Test
    public void testEquals_NullIpInOneObject() {
        V1PodIP podIP1 = new V1PodIP().ip("192.168.1.1");
        V1PodIP podIP2 = new V1PodIP();
        assertFalse(podIP1.equals(podIP2));
        assertFalse(podIP2.equals(podIP1));
    }

    //BaseRock generated method id: ${testEquals_BothNullIp}, hash: C33D4D479903614CE17AD139AE5C8500
    @Test
    public void testEquals_BothNullIp() {
        V1PodIP podIP1 = new V1PodIP();
        V1PodIP podIP2 = new V1PodIP();
        assertTrue(podIP1.equals(podIP2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: F50A8CC9CB0D179A32741AFB509CE147
    @Test
    public void testHashCode() {
        String testIp = "192.168.1.1";
        V1PodIP podIP = new V1PodIP().ip(testIp);
        assertEquals(Objects.hash(testIp), podIP.hashCode());
    }

    //BaseRock generated method id: ${testHashCode_NullIp}, hash: B393620B0108E8862BF25C7E5EBFEC4F
    @Test
    public void testHashCode_NullIp() {
        V1PodIP podIP = new V1PodIP();
        assertEquals(Objects.hash((Object) null), podIP.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: C0F893C2C93ED3B47D96540A32AD5C5D
    @Test
    public void testToString() {
        String testIp = "192.168.1.1";
        V1PodIP podIP = new V1PodIP().ip(testIp);
        String expected = "class V1PodIP {\n    ip: " + testIp + "\n}";
        assertEquals(expected, podIP.toString());
    }

    //BaseRock generated method id: ${testToString_NullIp}, hash: 566F09637A991E07CE04FE7F62218E8B
    @Test
    public void testToString_NullIp() {
        V1PodIP podIP = new V1PodIP();
        String expected = "class V1PodIP {\n    ip: null\n}";
        assertEquals(expected, podIP.toString());
    }

    //BaseRock generated method id: ${testToIndentedString}, hash: 26249BAA6766A5D1A25728E9D779C05C
    @Test
    public void testToIndentedString() throws Exception {
        V1PodIP podIP = new V1PodIP().ip("192.168.1.1");
        // Access the private method using reflection
        java.lang.reflect.Method method = V1PodIP.class.getDeclaredMethod("toIndentedString", Object.class);
        method.setAccessible(true);
        assertEquals("192.168.1.1", method.invoke(podIP, "192.168.1.1"));
        assertEquals("null", method.invoke(podIP, (Object) null));
        String multiLine = "line1\nline2";
        assertEquals("line1\n    line2", method.invoke(podIP, multiLine));
    }

    //BaseRock generated method id: ${testValidateJsonElement_ValidJson}, hash: EA2B9B47E3226050B6D7DE23A0395BF8
    @Test
    public void testValidateJsonElement_ValidJson() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("ip", "192.168.1.1");
        // Should not throw an exception
        V1PodIP.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testValidateJsonElement_NullJson}, hash: 3A620932CFC49E1FAE67369A3AF0D25E
    @Test
    public void testValidateJsonElement_NullJson() {
        assertThrows(IllegalArgumentException.class, () -> {
            V1PodIP.validateJsonElement(null);
        });
    }

    //BaseRock generated method id: ${testValidateJsonElement_MissingRequiredField}, hash: 2B1D54861B87C267D4242CBA8B44AD99
    @Test
    public void testValidateJsonElement_MissingRequiredField() {
        JsonObject jsonObject = new JsonObject();
        assertThrows(IllegalArgumentException.class, () -> {
            V1PodIP.validateJsonElement(jsonObject);
        });
    }

    //BaseRock generated method id: ${testValidateJsonElement_UnknownField}, hash: C5DA24E69EFFA4C15A92BA21AF75DBA2
    @Test
    public void testValidateJsonElement_UnknownField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("ip", "192.168.1.1");
        jsonObject.addProperty("unknownField", "value");
        assertThrows(IllegalArgumentException.class, () -> {
            V1PodIP.validateJsonElement(jsonObject);
        });
    }

    //BaseRock generated method id: ${testValidateJsonElement_NonPrimitiveIp}, hash: B2DD7AF85017BD0198ABC45E961581A6
    @Test
    public void testValidateJsonElement_NonPrimitiveIp() {
        JsonObject ipObject = new JsonObject();
        ipObject.addProperty("address", "192.168.1.1");
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("ip", ipObject);
        assertThrows(IllegalArgumentException.class, () -> {
            V1PodIP.validateJsonElement(jsonObject);
        });
    }

    //BaseRock generated method id: ${testFromJson}, hash: 489C3B80D8C679752CB6D39A21CEFDED
    @Test
    public void testFromJson() throws IOException {
        String json = "{\"ip\":\"192.168.1.1\"}";
        V1PodIP podIP = V1PodIP.fromJson(json);
        assertThat(podIP, is(notNullValue()));
        assertThat(podIP.getIp(), is(equalTo("192.168.1.1")));
    }

    //BaseRock generated method id: ${testToJson}, hash: E3EA592EF5FC86228F1158C42E1D2019
    @Test
    public void testToJson() throws IOException {
        V1PodIP podIP = new V1PodIP().ip("192.168.1.1");
        String json = podIP.toJson();
        // Parse back to verify correct serialization
        V1PodIP parsedPodIP = V1PodIP.fromJson(json);
        assertThat(parsedPodIP.getIp(), is(equalTo(podIP.getIp())));
    }

    //BaseRock generated method id: ${testIpWithDifferentValues}, hash: 1E0A8B6DE964F84BD171BCBF4F8945F6
    @ParameterizedTest
    @ValueSource(strings = { "192.168.1.1", "10.0.0.1", "172.16.0.1", "::1" })
    public void testIpWithDifferentValues(String ipValue) {
        V1PodIP podIP = new V1PodIP().ip(ipValue);
        assertThat(podIP.getIp(), is(equalTo(ipValue)));
    }

    //BaseRock generated method id: ${testIpWithNullValue}, hash: B0B9D67C7CB0F59A9555A778CFAC4F14
    @ParameterizedTest
    @NullSource
    public void testIpWithNullValue(String ipValue) {
        V1PodIP podIP = new V1PodIP().ip(ipValue);
        assertThat(podIP.getIp(), is(equalTo(ipValue)));
    }

    //BaseRock generated method id: ${testOpenapiFields}, hash: 1CF3E3EDBE1808D4C3A92276816EA4A8
    @Test
    public void testOpenapiFields() {
        assertTrue(V1PodIP.openapiFields.contains("ip"));
        assertEquals(1, V1PodIP.openapiFields.size());
    }

    //BaseRock generated method id: ${testOpenapiRequiredFields}, hash: F4501413C18A233E77C18751C4C97C1E
    @Test
    public void testOpenapiRequiredFields() {
        assertTrue(V1PodIP.openapiRequiredFields.contains("ip"));
        assertEquals(1, V1PodIP.openapiRequiredFields.size());
    }

    //BaseRock generated method id: ${testCustomTypeAdapterFactory}, hash: BE58B571336E00F4FE08AA45641D01BB
    @Test
    public void testCustomTypeAdapterFactory() {
        V1PodIP.CustomTypeAdapterFactory factory = new V1PodIP.CustomTypeAdapterFactory();
        assertThat(factory, is(notNullValue()));
    }
}

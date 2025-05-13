package io.kubernetes.client.openapi.models;

import java.util.Map;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.custom.Quantity;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.not;
import io.kubernetes.client.openapi.models.V1LimitRangeItem;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1LimitRangeItemBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 7EABECCBD132103E9BCA61EBD702BB05
    @Test
    void testConstructor() {
        V1LimitRangeItem limitRangeItem = new V1LimitRangeItem();
        assertNotNull(limitRangeItem);
    }

    //BaseRock generated method id: ${testDefaultSetter}, hash: 494432F82EC4C6A78F685010ADDF6520
    @Test
    void testDefaultSetter() {
        V1LimitRangeItem limitRangeItem = new V1LimitRangeItem();
        Map<String, Quantity> defaultMap = new HashMap<>();
        defaultMap.put("cpu", new Quantity("1"));
        limitRangeItem.setDefault(defaultMap);
        assertEquals(defaultMap, limitRangeItem.getDefault());
    }

    //BaseRock generated method id: ${testDefaultRequestSetter}, hash: 999C86AA88DB47F70C52AE90038E35CE
    @Test
    void testDefaultRequestSetter() {
        V1LimitRangeItem limitRangeItem = new V1LimitRangeItem();
        Map<String, Quantity> defaultRequestMap = new HashMap<>();
        defaultRequestMap.put("memory", new Quantity("512Mi"));
        limitRangeItem.setDefaultRequest(defaultRequestMap);
        assertEquals(defaultRequestMap, limitRangeItem.getDefaultRequest());
    }

    //BaseRock generated method id: ${testMaxSetter}, hash: B8E6BEE9572B3276556476ADA6B12127
    @Test
    void testMaxSetter() {
        V1LimitRangeItem limitRangeItem = new V1LimitRangeItem();
        Map<String, Quantity> maxMap = new HashMap<>();
        maxMap.put("cpu", new Quantity("2"));
        limitRangeItem.setMax(maxMap);
        assertEquals(maxMap, limitRangeItem.getMax());
    }

    //BaseRock generated method id: ${testMaxLimitRequestRatioSetter}, hash: 3EB68C6C16B2B1344FF64A4394C03465
    @Test
    void testMaxLimitRequestRatioSetter() {
        V1LimitRangeItem limitRangeItem = new V1LimitRangeItem();
        Map<String, Quantity> maxLimitRequestRatioMap = new HashMap<>();
        maxLimitRequestRatioMap.put("cpu", new Quantity("2"));
        limitRangeItem.setMaxLimitRequestRatio(maxLimitRequestRatioMap);
        assertEquals(maxLimitRequestRatioMap, limitRangeItem.getMaxLimitRequestRatio());
    }

    //BaseRock generated method id: ${testMinSetter}, hash: 8215B0E3E0CFE18052C2E98C366C95EE
    @Test
    void testMinSetter() {
        V1LimitRangeItem limitRangeItem = new V1LimitRangeItem();
        Map<String, Quantity> minMap = new HashMap<>();
        minMap.put("cpu", new Quantity("0.1"));
        limitRangeItem.setMin(minMap);
        assertEquals(minMap, limitRangeItem.getMin());
    }

    //BaseRock generated method id: ${testTypeSetter}, hash: 49DA201187A53F0AF8C8E2F7C023EF13
    @Test
    void testTypeSetter() {
        V1LimitRangeItem limitRangeItem = new V1LimitRangeItem();
        String type = "Container";
        limitRangeItem.setType(type);
        assertEquals(type, limitRangeItem.getType());
    }

    //BaseRock generated method id: ${testDefaultGetter}, hash: 6A2C621BF5CF35AB7C879A612E54B183
    @Test
    void testDefaultGetter() {
        V1LimitRangeItem limitRangeItem = new V1LimitRangeItem();
        Map<String, Quantity> defaultMap = new HashMap<>();
        defaultMap.put("cpu", new Quantity("1"));
        limitRangeItem.setDefault(defaultMap);
        assertThat(limitRangeItem.getDefault(), is(notNullValue()));
        assertThat(limitRangeItem.getDefault(), hasEntry("cpu", new Quantity("1")));
    }

    //BaseRock generated method id: ${testDefaultRequestGetter}, hash: 91B16FBCD39D2D96E9349BB414AE63F7
    @Test
    void testDefaultRequestGetter() {
        V1LimitRangeItem limitRangeItem = new V1LimitRangeItem();
        Map<String, Quantity> defaultRequestMap = new HashMap<>();
        defaultRequestMap.put("memory", new Quantity("512Mi"));
        limitRangeItem.setDefaultRequest(defaultRequestMap);
        assertThat(limitRangeItem.getDefaultRequest(), is(notNullValue()));
        assertThat(limitRangeItem.getDefaultRequest(), hasEntry("memory", new Quantity("512Mi")));
    }

    //BaseRock generated method id: ${testMaxGetter}, hash: 363A8538BD26B3D471F0A967F0A1126F
    @Test
    void testMaxGetter() {
        V1LimitRangeItem limitRangeItem = new V1LimitRangeItem();
        Map<String, Quantity> maxMap = new HashMap<>();
        maxMap.put("cpu", new Quantity("2"));
        limitRangeItem.setMax(maxMap);
        assertThat(limitRangeItem.getMax(), is(notNullValue()));
        assertThat(limitRangeItem.getMax(), hasEntry("cpu", new Quantity("2")));
    }

    //BaseRock generated method id: ${testMaxLimitRequestRatioGetter}, hash: 935E3EFA0060BA4DE86F0B15AA29FB99
    @Test
    void testMaxLimitRequestRatioGetter() {
        V1LimitRangeItem limitRangeItem = new V1LimitRangeItem();
        Map<String, Quantity> maxLimitRequestRatioMap = new HashMap<>();
        maxLimitRequestRatioMap.put("cpu", new Quantity("2"));
        limitRangeItem.setMaxLimitRequestRatio(maxLimitRequestRatioMap);
        assertThat(limitRangeItem.getMaxLimitRequestRatio(), is(notNullValue()));
        assertThat(limitRangeItem.getMaxLimitRequestRatio(), hasEntry("cpu", new Quantity("2")));
    }

    //BaseRock generated method id: ${testMinGetter}, hash: B18983437016F31D1EC4056AFE83A1E5
    @Test
    void testMinGetter() {
        V1LimitRangeItem limitRangeItem = new V1LimitRangeItem();
        Map<String, Quantity> minMap = new HashMap<>();
        minMap.put("cpu", new Quantity("0.1"));
        limitRangeItem.setMin(minMap);
        assertThat(limitRangeItem.getMin(), is(notNullValue()));
        assertThat(limitRangeItem.getMin(), hasEntry("cpu", new Quantity("0.1")));
    }

    //BaseRock generated method id: ${testTypeGetter}, hash: A468E2F48CE71B0E5B2D5C671AFE58DF
    @Test
    void testTypeGetter() {
        V1LimitRangeItem limitRangeItem = new V1LimitRangeItem();
        String type = "Container";
        limitRangeItem.setType(type);
        assertThat(limitRangeItem.getType(), is(equalTo(type)));
    }

    //BaseRock generated method id: ${testPutDefaultItem}, hash: 805B4CCD85823C68239886E1F6C5E651
    @Test
    void testPutDefaultItem() {
        V1LimitRangeItem limitRangeItem = new V1LimitRangeItem();
        limitRangeItem.putDefaultItem("cpu", new Quantity("1"));
        assertThat(limitRangeItem.getDefault(), hasEntry("cpu", new Quantity("1")));
    }

    //BaseRock generated method id: ${testPutDefaultRequestItem}, hash: 40C4BB8B601A570C660E51512BD2A295
    @Test
    void testPutDefaultRequestItem() {
        V1LimitRangeItem limitRangeItem = new V1LimitRangeItem();
        limitRangeItem.putDefaultRequestItem("memory", new Quantity("512Mi"));
        assertThat(limitRangeItem.getDefaultRequest(), hasEntry("memory", new Quantity("512Mi")));
    }

    //BaseRock generated method id: ${testPutMaxItem}, hash: A4088B82B3900ADD4F32F0763A1CE94C
    @Test
    void testPutMaxItem() {
        V1LimitRangeItem limitRangeItem = new V1LimitRangeItem();
        limitRangeItem.putMaxItem("cpu", new Quantity("2"));
        assertThat(limitRangeItem.getMax(), hasEntry("cpu", new Quantity("2")));
    }

    //BaseRock generated method id: ${testPutMaxLimitRequestRatioItem}, hash: E68F4B20890193C0D58E424EF8581A9F
    @Test
    void testPutMaxLimitRequestRatioItem() {
        V1LimitRangeItem limitRangeItem = new V1LimitRangeItem();
        limitRangeItem.putMaxLimitRequestRatioItem("cpu", new Quantity("2"));
        assertThat(limitRangeItem.getMaxLimitRequestRatio(), hasEntry("cpu", new Quantity("2")));
    }

    //BaseRock generated method id: ${testPutMinItem}, hash: 57BC6BCE3ED64DFB7B8F5E629A29BF49
    @Test
    void testPutMinItem() {
        V1LimitRangeItem limitRangeItem = new V1LimitRangeItem();
        limitRangeItem.putMinItem("cpu", new Quantity("0.1"));
        assertThat(limitRangeItem.getMin(), hasEntry("cpu", new Quantity("0.1")));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: D34E4F8E0D4357054ADAD361933FC4B2
    @Test
    void testEqualsAndHashCode() {
        V1LimitRangeItem item1 = new V1LimitRangeItem().type("Container").putDefaultItem("cpu", new Quantity("1")).putMinItem("cpu", new Quantity("0.1")).putMaxItem("cpu", new Quantity("2"));
        V1LimitRangeItem item2 = new V1LimitRangeItem().type("Container").putDefaultItem("cpu", new Quantity("1")).putMinItem("cpu", new Quantity("0.1")).putMaxItem("cpu", new Quantity("2"));
        V1LimitRangeItem item3 = new V1LimitRangeItem().type("Pod").putDefaultItem("cpu", new Quantity("2")).putMinItem("cpu", new Quantity("0.2")).putMaxItem("cpu", new Quantity("4"));
        assertThat(item1, is(equalTo(item2)));
        assertThat(item1.hashCode(), is(equalTo(item2.hashCode())));
        assertThat(item1, is(not(equalTo(item3))));
        assertThat(item1.hashCode(), is(not(equalTo(item3.hashCode()))));
    }

    //BaseRock generated method id: ${testToString}, hash: 3460EE09B39C0CFA82DCAA5C329FB7BE
    @Test
    void testToString() {
        V1LimitRangeItem limitRangeItem = new V1LimitRangeItem().type("Container").putDefaultItem("cpu", new Quantity("1")).putMinItem("cpu", new Quantity("0.1")).putMaxItem("cpu", new Quantity("2"));
        String expectedString = "class V1LimitRangeItem {\n" + "    _default: {cpu=Quantity{number=1, format=DECIMAL_SI}}\n" + "    defaultRequest: {}\n" + "    max: {cpu=Quantity{number=2, format=DECIMAL_SI}}\n" + "    maxLimitRequestRatio: {}\n" + "    min: {cpu=Quantity{number=0.1, format=DECIMAL_SI}}\n" + "    type: Container\n" + "}";
        assertThat(limitRangeItem.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testSetNullType}, hash: FEE2158E60F1F2C245B7B898A282F655
    @Test
    void testSetNullType() {
        V1LimitRangeItem limitRangeItem = new V1LimitRangeItem();
        limitRangeItem.setType(null);
        assertThat(limitRangeItem.getType(), is(equalTo(null)));
    }
}

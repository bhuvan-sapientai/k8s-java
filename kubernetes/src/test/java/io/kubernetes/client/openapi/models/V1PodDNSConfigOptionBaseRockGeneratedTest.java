package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1PodDNSConfigOption;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1PodDNSConfigOptionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1PodDNSConfigOptionConstructor}, hash: 6922BCCC144F1FB3223C47A4B4D681DA
    @Test
    void testV1PodDNSConfigOptionConstructor() {
        V1PodDNSConfigOption podDNSConfigOption = new V1PodDNSConfigOption();
        assertNotNull(podDNSConfigOption);
    }

    //BaseRock generated method id: ${testSetAndGetName}, hash: CA06430EE29CA22FC081365D6127A876
    @Test
    void testSetAndGetName() {
        V1PodDNSConfigOption podDNSConfigOption = new V1PodDNSConfigOption();
        String name = "testName";
        podDNSConfigOption.setName(name);
        assertEquals(name, podDNSConfigOption.getName());
    }

    //BaseRock generated method id: ${testSetAndGetValue}, hash: 22B7CDEEB149270937CD4ADDE306D3FD
    @Test
    void testSetAndGetValue() {
        V1PodDNSConfigOption podDNSConfigOption = new V1PodDNSConfigOption();
        String value = "testValue";
        podDNSConfigOption.setValue(value);
        assertEquals(value, podDNSConfigOption.getValue());
    }

    //BaseRock generated method id: ${testNameChaining}, hash: 8E2537D06E4F8A5C739F6BE95A24953D
    @Test
    void testNameChaining() {
        V1PodDNSConfigOption podDNSConfigOption = new V1PodDNSConfigOption();
        String name = "testName";
        V1PodDNSConfigOption result = podDNSConfigOption.name(name);
        assertThat(result, is(notNullValue()));
        assertThat(result.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testValueChaining}, hash: 04D9AFE40CC610E349037FD8570F44F2
    @Test
    void testValueChaining() {
        V1PodDNSConfigOption podDNSConfigOption = new V1PodDNSConfigOption();
        String value = "testValue";
        V1PodDNSConfigOption result = podDNSConfigOption.value(value);
        assertThat(result, is(notNullValue()));
        assertThat(result.getValue(), is(equalTo(value)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 04E7D8E137D51C20CB38EB35BDD08920
    @Test
    void testEquals() {
        V1PodDNSConfigOption option1 = new V1PodDNSConfigOption().name("test").value("value");
        V1PodDNSConfigOption option2 = new V1PodDNSConfigOption().name("test").value("value");
        V1PodDNSConfigOption option3 = new V1PodDNSConfigOption().name("different").value("value");
        assertThat(option1.equals(option2), is(true));
        assertThat(option1.equals(option3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 0632A4E87D7165B8F8E168113EF4B88B
    @Test
    void testHashCode() {
        V1PodDNSConfigOption option1 = new V1PodDNSConfigOption().name("test").value("value");
        V1PodDNSConfigOption option2 = new V1PodDNSConfigOption().name("test").value("value");
        assertThat(option1.hashCode(), is(equalTo(option2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 68EEBAE12C4FB37690441CB075C61E3D
    @Disabled()
    @Test
    void testToString() {
        V1PodDNSConfigOption option = new V1PodDNSConfigOption().name("test").value("value");
        String toString = option.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString, startsWith("class V1PodDNSConfigOption {"));
        assertThat(toString, endsWith("}"));
        assertThat(toString, containsString("name=test"));
        assertThat(toString, containsString("value=value"));
    }
}

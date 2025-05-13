package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.custom.IntOrString;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.containsInAnyOrder;
import io.kubernetes.client.openapi.models.V1HTTPHeader;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1HTTPGetActionBaseRockGeneratedTest {

    private V1HTTPGetAction v1HTTPGetAction;

    @BeforeEach
    void setUp() {
        v1HTTPGetAction = new V1HTTPGetAction();
    }

    //BaseRock generated method id: ${testConstructor}, hash: C39F469338C1318630965BE15F89612B
    @Test
    void testConstructor() {
        assertThat(v1HTTPGetAction, is(notNullValue()));
    }

    //BaseRock generated method id: ${testHost}, hash: 938B74353E403F079A568008530DCEBD
    @Test
    void testHost() {
        String host = "example.com";
        v1HTTPGetAction.setHost(host);
        assertThat(v1HTTPGetAction.getHost(), is(equalTo(host)));
    }

    //BaseRock generated method id: ${testHttpHeaders}, hash: 03FCF3DF81DA6DCEDCCA55F410D01967
    @Test
    void testHttpHeaders() {
        List<V1HTTPHeader> headers = new ArrayList<>();
        headers.add(new V1HTTPHeader());
        v1HTTPGetAction.setHttpHeaders(headers);
        assertThat(v1HTTPGetAction.getHttpHeaders(), is(equalTo(headers)));
    }

    //BaseRock generated method id: ${testAddHttpHeadersItem}, hash: E33478010DE45CF7ACAEAF040D144929
    @Test
    void testAddHttpHeadersItem() {
        V1HTTPHeader header = new V1HTTPHeader();
        v1HTTPGetAction.addHttpHeadersItem(header);
        assertThat(v1HTTPGetAction.getHttpHeaders(), containsInAnyOrder(header));
    }

    //BaseRock generated method id: ${testPath}, hash: BF0B16497478E5CB9C1C86BA3BAC30EF
    @Test
    void testPath() {
        String path = "/api/v1";
        v1HTTPGetAction.setPath(path);
        assertThat(v1HTTPGetAction.getPath(), is(equalTo(path)));
    }

    //BaseRock generated method id: ${testPort}, hash: 1570579E1521B9F8F6F386DA17E86E9F
    @Test
    void testPort() {
        IntOrString port = new IntOrString(8080);
        v1HTTPGetAction.setPort(port);
        assertThat(v1HTTPGetAction.getPort(), is(equalTo(port)));
    }

    //BaseRock generated method id: ${testScheme}, hash: EC03455B84F23809ED4B78FEABE51C28
    @Test
    void testScheme() {
        String scheme = "https";
        v1HTTPGetAction.setScheme(scheme);
        assertThat(v1HTTPGetAction.getScheme(), is(equalTo(scheme)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 4FE40CA167CD1C96CBEBD28E7F4644A0
    @Test
    void testEquals() {
        V1HTTPGetAction action1 = new V1HTTPGetAction().host("host1").path("/path1").port(new IntOrString(8080)).scheme("http");
        V1HTTPGetAction action2 = new V1HTTPGetAction().host("host1").path("/path1").port(new IntOrString(8080)).scheme("http");
        V1HTTPGetAction action3 = new V1HTTPGetAction().host("host2").path("/path2").port(new IntOrString(9090)).scheme("https");
        assertThat(action1.equals(action2), is(true));
        assertThat(action1.equals(action3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 220DE5EA777FA80C4CA28787C1AF3703
    @Test
    void testHashCode() {
        V1HTTPGetAction action1 = new V1HTTPGetAction().host("host1").path("/path1").port(new IntOrString(8080)).scheme("http");
        V1HTTPGetAction action2 = new V1HTTPGetAction().host("host1").path("/path1").port(new IntOrString(8080)).scheme("http");
        assertThat(action1.hashCode(), is(equalTo(action2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 3AAB6C759BF7B77752A615742B3E9984
    @Test
    void testToString() {
        V1HTTPGetAction action = new V1HTTPGetAction().host("example.com").path("/api/v1").port(new IntOrString(8080)).scheme("https");
        String expectedString = "class V1HTTPGetAction {\n    host: example.com\n    httpHeaders: []\n    path: /api/v1\n    port: 8080\n    scheme: https\n}";
        assertThat(action.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testValidSchemes}, hash: 75683BF4F4C1C4562D2CD641C8F2E57E
    @ParameterizedTest
    @ValueSource(strings = { "http", "https" })
    void testValidSchemes(String scheme) {
        v1HTTPGetAction.setScheme(scheme);
        assertThat(v1HTTPGetAction.getScheme(), is(equalTo(scheme)));
    }

    //BaseRock generated method id: ${testNullHost}, hash: 0E6A02F83A4F6302425D522F83178430
    @Test
    void testNullHost() {
        v1HTTPGetAction.setHost(null);
        assertThat(v1HTTPGetAction.getHost(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNullPath}, hash: A55CC899B8D259E6992154864CD2E962
    @Test
    void testNullPath() {
        v1HTTPGetAction.setPath(null);
        assertThat(v1HTTPGetAction.getPath(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNullScheme}, hash: 0E9A24F425E2A0D0EFB54147B5ABD628
    @Test
    void testNullScheme() {
        v1HTTPGetAction.setScheme(null);
        assertThat(v1HTTPGetAction.getScheme(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNullPort}, hash: 88FDD63A532DAF7A8D970BA21208F4FB
    @Test
    void testNullPort() {
        v1HTTPGetAction.setPort(null);
        assertThat(v1HTTPGetAction.getPort(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAddHttpHeadersItemToNullList}, hash: D85FD404689D2A7AF2585E58BEF53B04
    @Test
    void testAddHttpHeadersItemToNullList() {
        V1HTTPHeader header = new V1HTTPHeader();
        v1HTTPGetAction.addHttpHeadersItem(header);
        assertThat(v1HTTPGetAction.getHttpHeaders(), containsInAnyOrder(header));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: 8248D8B093EF22EE9A085D902550440C
    @Test
    void testEqualsWithNull() {
        assertThat(v1HTTPGetAction.equals(null), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 7CDB849166A579ADB7B8C95C2DAA6082
    @Test
    void testEqualsWithDifferentClass() {
        assertThat(v1HTTPGetAction.equals(new Object()), is(false));
    }
}

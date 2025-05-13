package io.kubernetes.client.openapi;

import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import java.util.HashSet;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class ServerConfigurationBaseRockGeneratedTest {

    private ServerConfiguration serverConfiguration;

    private String url;

    private String description;

    private Map<String, ServerVariable> variables;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        url = "https://api.example.com/{version}";
        description = "API Server";
        variables = new HashMap<>();
        ServerVariable versionVariable = new ServerVariable("Version", "v1", new HashSet<>(java.util.Arrays.asList("v1", "v2")));
        variables.put("version", versionVariable);
        serverConfiguration = new ServerConfiguration(url, description, variables);
    }

    //BaseRock generated method id: ${testConstructor}, hash: 9577685832CF40EDE9060FC12649C5D7
    @Test
    void testConstructor() {
        assertThat(serverConfiguration, is(notNullValue()));
        assertEquals(url, serverConfiguration.URL);
        assertEquals(description, serverConfiguration.description);
        assertEquals(variables, serverConfiguration.variables);
    }

    //BaseRock generated method id: ${testURLWithVariables}, hash: 33A502A09CFF02A5180F709B34FEDDCD
    @Test
    void testURLWithVariables() {
        Map<String, String> testVariables = new HashMap<>();
        testVariables.put("version", "v2");
        String result = serverConfiguration.URL(testVariables);
        assertThat(result, is("https://api.example.com/v2"));
    }

    //BaseRock generated method id: ${testURLWithoutVariables}, hash: 265013A910DFA71F90A92F0E93052E44
    @Test
    void testURLWithoutVariables() {
        String result = serverConfiguration.URL();
        assertThat(result, is("https://api.example.com/v1"));
    }

    //BaseRock generated method id: ${testURLWithInvalidVariable}, hash: B0B39C086FD869B89B067457069B8D30
    @Test
    void testURLWithInvalidVariable() {
        Map<String, String> testVariables = new HashMap<>();
        testVariables.put("version", "v3");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> serverConfiguration.URL(testVariables));
        assertThat(exception.getMessage(), is("The variable version in the server URL has invalid value v3."));
    }

    //BaseRock generated method id: ${testURLWithMultipleVariables}, hash: 607D67ED0F6BDD98D15F5BFED20AED29
    @Test
    void testURLWithMultipleVariables() {
        String multiVarUrl = "https://{host}.example.com:{port}/{version}";
        Map<String, ServerVariable> multiVarVariables = new HashMap<>();
        multiVarVariables.put("host", new ServerVariable("Host", "api", new HashSet<>()));
        multiVarVariables.put("port", new ServerVariable("Port", "8080", new HashSet<>()));
        multiVarVariables.put("version", new ServerVariable("Version", "v1", new HashSet<>(java.util.Arrays.asList("v1", "v2"))));
        ServerConfiguration multiVarConfig = new ServerConfiguration(multiVarUrl, "Multi-var test", multiVarVariables);
        Map<String, String> testVariables = new HashMap<>();
        testVariables.put("host", "test");
        testVariables.put("port", "9000");
        testVariables.put("version", "v2");
        String result = multiVarConfig.URL(testVariables);
        assertThat(result, is("https://test.example.com:9000/v2"));
    }

    //BaseRock generated method id: ${testURLWithMissingVariable}, hash: 500A178E1E7E0C36BF95FC2940ACD2EC
    @Test
    void testURLWithMissingVariable() {
        String missingVarUrl = "https://api.example.com/{version}/{path}";
        Map<String, ServerVariable> missingVarVariables = new HashMap<>(variables);
        missingVarVariables.put("path", new ServerVariable("Path", "default", new HashSet<>()));
        ServerConfiguration missingVarConfig = new ServerConfiguration(missingVarUrl, "Missing var test", missingVarVariables);
        Map<String, String> testVariables = new HashMap<>();
        testVariables.put("version", "v1");
        String result = missingVarConfig.URL(testVariables);
        assertThat(result, is("https://api.example.com/v1/default"));
    }

    //BaseRock generated method id: ${testURLWithEmptyVariables}, hash: E8C684CE74155C35019080D494F6C490
    @Test
    void testURLWithEmptyVariables() {
        ServerConfiguration emptyVarConfig = new ServerConfiguration(url, description, new HashMap<>());
        String result = emptyVarConfig.URL(new HashMap<>());
        assertThat(result, is(url));
    }

    //BaseRock generated method id: ${testURLWithNullVariables}, hash: B4F8A0EF08C2EF7A19C2336007908A6A
    @Test
    void testURLWithNullVariables() {
        String result = serverConfiguration.URL(null);
        assertThat(result, is("https://api.example.com/v1"));
    }
}

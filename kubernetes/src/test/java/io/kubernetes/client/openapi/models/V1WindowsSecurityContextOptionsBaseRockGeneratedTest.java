package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1WindowsSecurityContextOptionsBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1WindowsSecurityContextOptionsConstructor}, hash: 573F4BA01DDA8A6175AEF89CFA94EE27
    @Test
    void testV1WindowsSecurityContextOptionsConstructor() {
        V1WindowsSecurityContextOptions options = new V1WindowsSecurityContextOptions();
        assertThat(options, is(new V1WindowsSecurityContextOptions()));
    }

    //BaseRock generated method id: ${testGmsaCredentialSpec}, hash: 8F1D4650643FF2335642A6D47A88D308
    @Test
    void testGmsaCredentialSpec() {
        V1WindowsSecurityContextOptions options = new V1WindowsSecurityContextOptions();
        String gmsaCredentialSpec = "test-gmsa-credential-spec";
        options.setGmsaCredentialSpec(gmsaCredentialSpec);
        assertThat(options.getGmsaCredentialSpec(), is(gmsaCredentialSpec));
    }

    //BaseRock generated method id: ${testGmsaCredentialSpecName}, hash: 63B88202C2F7B5CCB9AE423B8DF25ADE
    @Test
    void testGmsaCredentialSpecName() {
        V1WindowsSecurityContextOptions options = new V1WindowsSecurityContextOptions();
        String gmsaCredentialSpecName = "test-gmsa-credential-spec-name";
        options.setGmsaCredentialSpecName(gmsaCredentialSpecName);
        assertThat(options.getGmsaCredentialSpecName(), is(gmsaCredentialSpecName));
    }

    //BaseRock generated method id: ${testHostProcess}, hash: F9C204A87A072E44D49E649801021A46
    @Test
    void testHostProcess() {
        V1WindowsSecurityContextOptions options = new V1WindowsSecurityContextOptions();
        Boolean hostProcess = true;
        options.setHostProcess(hostProcess);
        assertThat(options.getHostProcess(), is(hostProcess));
    }

    //BaseRock generated method id: ${testRunAsUserName}, hash: 4D9C740DD4F02749AE6B4E2980FAB02B
    @Test
    void testRunAsUserName() {
        V1WindowsSecurityContextOptions options = new V1WindowsSecurityContextOptions();
        String runAsUserName = "test-run-as-user-name";
        options.setRunAsUserName(runAsUserName);
        assertThat(options.getRunAsUserName(), is(runAsUserName));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 6B207559E5B4D3260FCFEB7305E2B3EE
    @Test
    void testEqualsAndHashCode() {
        V1WindowsSecurityContextOptions options1 = new V1WindowsSecurityContextOptions().gmsaCredentialSpec("spec1").gmsaCredentialSpecName("name1").hostProcess(true).runAsUserName("user1");
        V1WindowsSecurityContextOptions options2 = new V1WindowsSecurityContextOptions().gmsaCredentialSpec("spec1").gmsaCredentialSpecName("name1").hostProcess(true).runAsUserName("user1");
        V1WindowsSecurityContextOptions options3 = new V1WindowsSecurityContextOptions().gmsaCredentialSpec("spec2").gmsaCredentialSpecName("name2").hostProcess(false).runAsUserName("user2");
        assertThat(options1.equals(options2), is(true));
        assertThat(options1.equals(options3), is(false));
        assertThat(options1.hashCode() == options2.hashCode(), is(true));
        assertThat(options1.hashCode() == options3.hashCode(), is(false));
    }

    //BaseRock generated method id: ${testToString}, hash: FAF8D8AD6916793D532CC299116188B4
    @Test
    void testToString() {
        V1WindowsSecurityContextOptions options = new V1WindowsSecurityContextOptions().gmsaCredentialSpec("spec").gmsaCredentialSpecName("name").hostProcess(true).runAsUserName("user");
        String expectedString = "class V1WindowsSecurityContextOptions {\n" + "    gmsaCredentialSpec: spec\n" + "    gmsaCredentialSpecName: name\n" + "    hostProcess: true\n" + "    runAsUserName: user\n" + "}";
        assertThat(options.toString(), is(expectedString));
    }

    //BaseRock generated method id: ${testNullValues}, hash: 720ABFC9601CE21BC95BF47B3BEB9BCD
    @Test
    void testNullValues() {
        V1WindowsSecurityContextOptions options = new V1WindowsSecurityContextOptions();
        assertThat(options.getGmsaCredentialSpec(), is(nullValue()));
        assertThat(options.getGmsaCredentialSpecName(), is(nullValue()));
        assertThat(options.getHostProcess(), is(nullValue()));
        assertThat(options.getRunAsUserName(), is(nullValue()));
    }
}

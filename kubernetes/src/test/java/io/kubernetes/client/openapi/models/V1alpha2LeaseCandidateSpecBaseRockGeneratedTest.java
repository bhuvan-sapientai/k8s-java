package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1alpha2LeaseCandidateSpec;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.mockito.Mockito.when;
import java.time.OffsetDateTime;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha2LeaseCandidateSpecBaseRockGeneratedTest {

    private V1alpha2LeaseCandidateSpec leaseCandidateSpec;

    @BeforeEach
    void setUp() {
        leaseCandidateSpec = new V1alpha2LeaseCandidateSpec();
    }

    //BaseRock generated method id: ${testConstructor}, hash: CB6D45C22B786C59DD61032FD930E37F
    @Test
    void testConstructor() {
        assertThat(leaseCandidateSpec, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetBinaryVersion}, hash: B104146C3A6943798314C24AEBC4CA06
    @Test
    void testSetAndGetBinaryVersion() {
        String binaryVersion = "1.0.0";
        leaseCandidateSpec.setBinaryVersion(binaryVersion);
        assertThat(leaseCandidateSpec.getBinaryVersion(), is(equalTo(binaryVersion)));
    }

    //BaseRock generated method id: ${testSetAndGetEmulationVersion}, hash: C1C030ED7259C4778F9A3ADB4B057DC7
    @Test
    void testSetAndGetEmulationVersion() {
        String emulationVersion = "0.9.0";
        leaseCandidateSpec.setEmulationVersion(emulationVersion);
        assertThat(leaseCandidateSpec.getEmulationVersion(), is(equalTo(emulationVersion)));
    }

    //BaseRock generated method id: ${testSetAndGetLeaseName}, hash: 1954CDB9CC6A1D01915C8F539AAE4955
    @Test
    void testSetAndGetLeaseName() {
        String leaseName = "testLease";
        leaseCandidateSpec.setLeaseName(leaseName);
        assertThat(leaseCandidateSpec.getLeaseName(), is(equalTo(leaseName)));
    }

    //BaseRock generated method id: ${testSetAndGetPingTime}, hash: 6A99E86FBFFE3E2F6FB2F18162DEAB85
    @Test
    void testSetAndGetPingTime() {
        OffsetDateTime pingTime = OffsetDateTime.now();
        leaseCandidateSpec.setPingTime(pingTime);
        assertThat(leaseCandidateSpec.getPingTime(), is(equalTo(pingTime)));
    }

    //BaseRock generated method id: ${testSetAndGetRenewTime}, hash: F1771C6FBFCD979BCBFEAE2FB0D7114E
    @Test
    void testSetAndGetRenewTime() {
        OffsetDateTime renewTime = OffsetDateTime.now();
        leaseCandidateSpec.setRenewTime(renewTime);
        assertThat(leaseCandidateSpec.getRenewTime(), is(equalTo(renewTime)));
    }

    //BaseRock generated method id: ${testSetAndGetStrategy}, hash: DA18E02995250A517644B51567C3B713
    @Test
    void testSetAndGetStrategy() {
        String strategy = "testStrategy";
        leaseCandidateSpec.setStrategy(strategy);
        assertThat(leaseCandidateSpec.getStrategy(), is(equalTo(strategy)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: E2FA8D838775015D4281B59AD99E52CD
    @Test
    void testEqualsAndHashCode() {
        V1alpha2LeaseCandidateSpec spec1 = new V1alpha2LeaseCandidateSpec().binaryVersion("1.0.0").emulationVersion("0.9.0").leaseName("testLease").strategy("testStrategy");
        V1alpha2LeaseCandidateSpec spec2 = new V1alpha2LeaseCandidateSpec().binaryVersion("1.0.0").emulationVersion("0.9.0").leaseName("testLease").strategy("testStrategy");
        assertThat(spec1, is(equalTo(spec2)));
        assertThat(spec1.hashCode(), is(equalTo(spec2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 4DA47CBF0EA65B123FCC536908FA4245
    @Test
    void testToString() {
        V1alpha2LeaseCandidateSpec spec = new V1alpha2LeaseCandidateSpec().binaryVersion("1.0.0").emulationVersion("0.9.0").leaseName("testLease").strategy("testStrategy");
        String expectedString = "class V1alpha2LeaseCandidateSpec {\n" + "    binaryVersion: 1.0.0\n" + "    emulationVersion: 0.9.0\n" + "    leaseName: testLease\n" + "    pingTime: null\n" + "    renewTime: null\n" + "    strategy: testStrategy\n" + "}";
        assertThat(spec.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testBinaryVersionWithValidValues}, hash: DD7DAD67D9837BC70E2A1E53C05B1856
    @ParameterizedTest
    @ValueSource(strings = { "1.0.0", "2.3.4", "0.1.0" })
    void testBinaryVersionWithValidValues(String version) {
        leaseCandidateSpec.setBinaryVersion(version);
        assertThat(leaseCandidateSpec.getBinaryVersion(), is(equalTo(version)));
    }

    //BaseRock generated method id: ${testBinaryVersionWithNull}, hash: B586513AF98D5227217FC819A6C4CD0D
    @Test
    void testBinaryVersionWithNull() {
        leaseCandidateSpec.setBinaryVersion(null);
        assertThat(leaseCandidateSpec.getBinaryVersion(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testEmulationVersionWithValidValues}, hash: 1F7562B6DBE12F8BAFC9490242F7A7D2
    @ParameterizedTest
    @ValueSource(strings = { "0.9.0", "1.0.0", "0.8.5" })
    void testEmulationVersionWithValidValues(String version) {
        leaseCandidateSpec.setEmulationVersion(version);
        assertThat(leaseCandidateSpec.getEmulationVersion(), is(equalTo(version)));
    }

    //BaseRock generated method id: ${testEmulationVersionWithNull}, hash: 672A7613A929DC2770D6E5F3665608EF
    @Test
    void testEmulationVersionWithNull() {
        leaseCandidateSpec.setEmulationVersion(null);
        assertThat(leaseCandidateSpec.getEmulationVersion(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testLeaseNameWithNull}, hash: BB07A51F75E2C11598C71A07099F25C9
    @Test
    void testLeaseNameWithNull() {
        leaseCandidateSpec.setLeaseName(null);
        assertThat(leaseCandidateSpec.getLeaseName(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testStrategyWithNull}, hash: 884DAEC54BF8C7340911EBD43DC41942
    @Test
    void testStrategyWithNull() {
        leaseCandidateSpec.setStrategy(null);
        assertThat(leaseCandidateSpec.getStrategy(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testBinaryVersionSetter}, hash: 7385EF2585D3BA0E98D0B616B8844DFC
    @Test
    void testBinaryVersionSetter() {
        V1alpha2LeaseCandidateSpec result = leaseCandidateSpec.binaryVersion("1.0.0");
        assertThat(result, is(equalTo(leaseCandidateSpec)));
        assertThat(leaseCandidateSpec.getBinaryVersion(), is(equalTo("1.0.0")));
    }

    //BaseRock generated method id: ${testEmulationVersionSetter}, hash: 5B7C0BC02354939B62BDEB6310BFDFE3
    @Test
    void testEmulationVersionSetter() {
        V1alpha2LeaseCandidateSpec result = leaseCandidateSpec.emulationVersion("0.9.0");
        assertThat(result, is(equalTo(leaseCandidateSpec)));
        assertThat(leaseCandidateSpec.getEmulationVersion(), is(equalTo("0.9.0")));
    }

    //BaseRock generated method id: ${testLeaseNameSetter}, hash: 199D0B5391EA87304A36CA4C7ADA0AF4
    @Test
    void testLeaseNameSetter() {
        V1alpha2LeaseCandidateSpec result = leaseCandidateSpec.leaseName("testLease");
        assertThat(result, is(equalTo(leaseCandidateSpec)));
        assertThat(leaseCandidateSpec.getLeaseName(), is(equalTo("testLease")));
    }

    //BaseRock generated method id: ${testPingTimeSetter}, hash: A163A7CD4E0FB9943FFA0BC4E7053CEC
    @Test
    void testPingTimeSetter() {
        OffsetDateTime pingTime = OffsetDateTime.now();
        V1alpha2LeaseCandidateSpec result = leaseCandidateSpec.pingTime(pingTime);
        assertThat(result, is(equalTo(leaseCandidateSpec)));
        assertThat(leaseCandidateSpec.getPingTime(), is(equalTo(pingTime)));
    }

    //BaseRock generated method id: ${testRenewTimeSetter}, hash: CA4AA529F88A4A8357F960CC80A034FD
    @Test
    void testRenewTimeSetter() {
        OffsetDateTime renewTime = OffsetDateTime.now();
        V1alpha2LeaseCandidateSpec result = leaseCandidateSpec.renewTime(renewTime);
        assertThat(result, is(equalTo(leaseCandidateSpec)));
        assertThat(leaseCandidateSpec.getRenewTime(), is(equalTo(renewTime)));
    }

    //BaseRock generated method id: ${testStrategySetter}, hash: 4FD8D95B50EFE587A8662748D02F9332
    @Test
    void testStrategySetter() {
        V1alpha2LeaseCandidateSpec result = leaseCandidateSpec.strategy("testStrategy");
        assertThat(result, is(equalTo(leaseCandidateSpec)));
        assertThat(leaseCandidateSpec.getStrategy(), is(equalTo("testStrategy")));
    }
}

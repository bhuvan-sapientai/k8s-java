package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1LeaseSpec;
import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1LeaseSpecBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1LeaseSpecConstructor}, hash: 91DA122E2579F174F898D8B2494F9718
    @Test
    void testV1LeaseSpecConstructor() {
        V1LeaseSpec leaseSpec = new V1LeaseSpec();
        assertNotNull(leaseSpec);
    }

    //BaseRock generated method id: ${testAcquireTime}, hash: 373E47A9D22EC572F689C23D190CBB71
    @Test
    void testAcquireTime() {
        V1LeaseSpec leaseSpec = new V1LeaseSpec();
        OffsetDateTime now = OffsetDateTime.now();
        leaseSpec.setAcquireTime(now);
        assertEquals(now, leaseSpec.getAcquireTime());
    }

    //BaseRock generated method id: ${testHolderIdentity}, hash: F39879FFBA286B3B38E1AB9DAE34225A
    @Test
    void testHolderIdentity() {
        V1LeaseSpec leaseSpec = new V1LeaseSpec();
        String holder = "test-holder";
        leaseSpec.setHolderIdentity(holder);
        assertEquals(holder, leaseSpec.getHolderIdentity());
    }

    //BaseRock generated method id: ${testLeaseDurationSeconds}, hash: 911BDA770185CDD0881FBBBBEF54B905
    @Test
    void testLeaseDurationSeconds() {
        V1LeaseSpec leaseSpec = new V1LeaseSpec();
        Integer duration = 60;
        leaseSpec.setLeaseDurationSeconds(duration);
        assertEquals(duration, leaseSpec.getLeaseDurationSeconds());
    }

    //BaseRock generated method id: ${testLeaseTransitions}, hash: 7E533A041F6C134270F58A096B6603AC
    @Test
    void testLeaseTransitions() {
        V1LeaseSpec leaseSpec = new V1LeaseSpec();
        Integer transitions = 5;
        leaseSpec.setLeaseTransitions(transitions);
        assertEquals(transitions, leaseSpec.getLeaseTransitions());
    }

    //BaseRock generated method id: ${testPreferredHolder}, hash: 383B832351666D7622596D593DFC587C
    @Test
    void testPreferredHolder() {
        V1LeaseSpec leaseSpec = new V1LeaseSpec();
        String preferred = "preferred-holder";
        leaseSpec.setPreferredHolder(preferred);
        assertEquals(preferred, leaseSpec.getPreferredHolder());
    }

    //BaseRock generated method id: ${testRenewTime}, hash: 80E8630FA0D135A69CF8638EE519B35D
    @Test
    void testRenewTime() {
        V1LeaseSpec leaseSpec = new V1LeaseSpec();
        OffsetDateTime now = OffsetDateTime.now();
        leaseSpec.setRenewTime(now);
        assertEquals(now, leaseSpec.getRenewTime());
    }

    //BaseRock generated method id: ${testStrategy}, hash: E791BCB499D9AAC2BC6B140588E6AAE7
    @Test
    void testStrategy() {
        V1LeaseSpec leaseSpec = new V1LeaseSpec();
        String strategy = "test-strategy";
        leaseSpec.setStrategy(strategy);
        assertEquals(strategy, leaseSpec.getStrategy());
    }

    //BaseRock generated method id: ${testEquals}, hash: 744AA9C668539EF05009F3832398C913
    @Test
    void testEquals() {
        V1LeaseSpec leaseSpec1 = new V1LeaseSpec().acquireTime(OffsetDateTime.now()).holderIdentity("holder1").leaseDurationSeconds(60).leaseTransitions(5).preferredHolder("preferred1").renewTime(OffsetDateTime.now()).strategy("strategy1");
        V1LeaseSpec leaseSpec2 = new V1LeaseSpec().acquireTime(leaseSpec1.getAcquireTime()).holderIdentity(leaseSpec1.getHolderIdentity()).leaseDurationSeconds(leaseSpec1.getLeaseDurationSeconds()).leaseTransitions(leaseSpec1.getLeaseTransitions()).preferredHolder(leaseSpec1.getPreferredHolder()).renewTime(leaseSpec1.getRenewTime()).strategy(leaseSpec1.getStrategy());
        assertEquals(leaseSpec1, leaseSpec2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: A3A4A10B1682AF1846207A45C82BB110
    @Test
    void testHashCode() {
        V1LeaseSpec leaseSpec1 = new V1LeaseSpec().acquireTime(OffsetDateTime.now()).holderIdentity("holder1").leaseDurationSeconds(60).leaseTransitions(5).preferredHolder("preferred1").renewTime(OffsetDateTime.now()).strategy("strategy1");
        V1LeaseSpec leaseSpec2 = new V1LeaseSpec().acquireTime(leaseSpec1.getAcquireTime()).holderIdentity(leaseSpec1.getHolderIdentity()).leaseDurationSeconds(leaseSpec1.getLeaseDurationSeconds()).leaseTransitions(leaseSpec1.getLeaseTransitions()).preferredHolder(leaseSpec1.getPreferredHolder()).renewTime(leaseSpec1.getRenewTime()).strategy(leaseSpec1.getStrategy());
        assertEquals(leaseSpec1.hashCode(), leaseSpec2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: E43CE111E9315B2FC15F9DD281B19369
    @Test
    void testToString() {
        V1LeaseSpec leaseSpec = new V1LeaseSpec().acquireTime(OffsetDateTime.now()).holderIdentity("holder1").leaseDurationSeconds(60).leaseTransitions(5).preferredHolder("preferred1").renewTime(OffsetDateTime.now()).strategy("strategy1");
        String toString = leaseSpec.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("acquireTime"), equalTo(true));
        assertThat(toString.contains("holderIdentity"), equalTo(true));
        assertThat(toString.contains("leaseDurationSeconds"), equalTo(true));
        assertThat(toString.contains("leaseTransitions"), equalTo(true));
        assertThat(toString.contains("preferredHolder"), equalTo(true));
        assertThat(toString.contains("renewTime"), equalTo(true));
        assertThat(toString.contains("strategy"), equalTo(true));
    }
}

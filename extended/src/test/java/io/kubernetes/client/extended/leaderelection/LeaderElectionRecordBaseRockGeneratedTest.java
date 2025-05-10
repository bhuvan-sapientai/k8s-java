package io.kubernetes.client.extended.leaderelection;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import io.kubernetes.client.openapi.models.V1OwnerReference;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class LeaderElectionRecordBaseRockGeneratedTest {

    private LeaderElectionRecord leaderElectionRecord;

    @BeforeEach
    void setUp() {
        leaderElectionRecord = new LeaderElectionRecord();
    }

    //BaseRock generated method id: ${testDefaultConstructor}, hash: 815A198D12DA7EA9683BD6EDDC5C7749
    @Test
    void testDefaultConstructor() {
        assertThat(leaderElectionRecord, is(notNullValue()));
        assertThat(leaderElectionRecord.getHolderIdentity(), is(nullValue()));
        assertEquals(0, leaderElectionRecord.getLeaseDurationSeconds());
        assertThat(leaderElectionRecord.getAcquireTime(), is(nullValue()));
        assertThat(leaderElectionRecord.getRenewTime(), is(nullValue()));
        assertEquals(0, leaderElectionRecord.getLeaderTransitions());
        assertThat(leaderElectionRecord.getOwnerReference(), is(nullValue()));
    }

    //BaseRock generated method id: ${testConstructorWithoutOwnerReference}, hash: C0302FCFF4B4765ADABEF813492A8931
    @Test
    void testConstructorWithoutOwnerReference() {
        String holderIdentity = "holder1";
        int leaseDurationSeconds = 60;
        Date acquireTime = new Date();
        Date renewTime = new Date();
        int leaderTransitions = 1;
        leaderElectionRecord = new LeaderElectionRecord(holderIdentity, leaseDurationSeconds, acquireTime, renewTime, leaderTransitions);
        assertThat(leaderElectionRecord.getHolderIdentity(), is(equalTo(holderIdentity)));
        assertEquals(leaseDurationSeconds, leaderElectionRecord.getLeaseDurationSeconds());
        assertThat(leaderElectionRecord.getAcquireTime(), is(equalTo(acquireTime)));
        assertThat(leaderElectionRecord.getRenewTime(), is(equalTo(renewTime)));
        assertEquals(leaderTransitions, leaderElectionRecord.getLeaderTransitions());
        assertThat(leaderElectionRecord.getOwnerReference(), is(nullValue()));
    }

    //BaseRock generated method id: ${testConstructorWithOwnerReference}, hash: 71F4973D46F02A9D7CBFB4836E684402
    @Test
    void testConstructorWithOwnerReference() {
        String holderIdentity = "holder2";
        int leaseDurationSeconds = 120;
        Date acquireTime = new Date();
        Date renewTime = new Date();
        int leaderTransitions = 2;
        V1OwnerReference ownerReference = new V1OwnerReference();
        leaderElectionRecord = new LeaderElectionRecord(holderIdentity, leaseDurationSeconds, acquireTime, renewTime, leaderTransitions, ownerReference);
        assertThat(leaderElectionRecord.getHolderIdentity(), is(equalTo(holderIdentity)));
        assertEquals(leaseDurationSeconds, leaderElectionRecord.getLeaseDurationSeconds());
        assertThat(leaderElectionRecord.getAcquireTime(), is(equalTo(acquireTime)));
        assertThat(leaderElectionRecord.getRenewTime(), is(equalTo(renewTime)));
        assertEquals(leaderTransitions, leaderElectionRecord.getLeaderTransitions());
        assertThat(leaderElectionRecord.getOwnerReference(), is(equalTo(ownerReference)));
    }

    //BaseRock generated method id: ${testSetAndGetHolderIdentity}, hash: ACC25A8905E67D34EE89A550204B8BDF
    @Test
    void testSetAndGetHolderIdentity() {
        String holderIdentity = "testHolder";
        leaderElectionRecord.setHolderIdentity(holderIdentity);
        assertThat(leaderElectionRecord.getHolderIdentity(), is(equalTo(holderIdentity)));
    }

    //BaseRock generated method id: ${testSetAndGetLeaseDurationSeconds}, hash: B3D28B9BCB137D9A208198237C1603B1
    @Test
    void testSetAndGetLeaseDurationSeconds() {
        int leaseDurationSeconds = 300;
        leaderElectionRecord.setLeaseDurationSeconds(leaseDurationSeconds);
        assertEquals(leaseDurationSeconds, leaderElectionRecord.getLeaseDurationSeconds());
    }

    //BaseRock generated method id: ${testSetAndGetAcquireTime}, hash: 2B1359EBFDF76E9E1DDF8643D9592EB6
    @Test
    void testSetAndGetAcquireTime() {
        Date acquireTime = new Date();
        leaderElectionRecord.setAcquireTime(acquireTime);
        assertThat(leaderElectionRecord.getAcquireTime(), is(equalTo(acquireTime)));
    }

    //BaseRock generated method id: ${testSetAndGetRenewTime}, hash: F1FFAB0AB65CAA7194C3D9609838FE10
    @Test
    void testSetAndGetRenewTime() {
        Date renewTime = new Date();
        leaderElectionRecord.setRenewTime(renewTime);
        assertThat(leaderElectionRecord.getRenewTime(), is(equalTo(renewTime)));
    }

    //BaseRock generated method id: ${testSetAndGetLeaderTransitions}, hash: FE9848F09D68D14D2E40690EC3A8A8D3
    @Test
    void testSetAndGetLeaderTransitions() {
        int leaderTransitions = 5;
        leaderElectionRecord.setLeaderTransitions(leaderTransitions);
        assertEquals(leaderTransitions, leaderElectionRecord.getLeaderTransitions());
    }

    //BaseRock generated method id: ${testSetAndGetOwnerReference}, hash: 5B06AF133676013CC33BF9288CAE9165
    @Test
    void testSetAndGetOwnerReference() {
        V1OwnerReference ownerReference = new V1OwnerReference();
        leaderElectionRecord.setOwnerReference(ownerReference);
        assertThat(leaderElectionRecord.getOwnerReference(), is(equalTo(ownerReference)));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 2177EA1217578EABB247E7B723D1722F
    @Test
    void testEqualsWithSameObject() {
        assertTrue(leaderElectionRecord.equals(leaderElectionRecord));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 89A7B7D3D404A901A44D8A607220F57D
    @Test
    void testEqualsWithDifferentClass() {
        assertFalse(leaderElectionRecord.equals(new Object()));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentLeaseDurationSeconds}, hash: 52AA19310706AE9612763F9FC603C0EF
    @Test
    void testEqualsWithDifferentLeaseDurationSeconds() {
        LeaderElectionRecord other = new LeaderElectionRecord();
        other.setLeaseDurationSeconds(100);
        assertFalse(leaderElectionRecord.equals(other));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentLeaderTransitions}, hash: 03B3E5815F5FE4508F65CBEA25F0E2A5
    @Test
    void testEqualsWithDifferentLeaderTransitions() {
        LeaderElectionRecord other = new LeaderElectionRecord();
        other.setLeaderTransitions(1);
        assertFalse(leaderElectionRecord.equals(other));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentHolderIdentity}, hash: 57309639609E4C1057D533D4BC1D900E
    @ParameterizedTest
    @ValueSource(strings = { "holder1", "holder2" })
    void testEqualsWithDifferentHolderIdentity(String holderIdentity) {
        LeaderElectionRecord other = new LeaderElectionRecord();
        other.setHolderIdentity(holderIdentity);
        assertFalse(leaderElectionRecord.equals(other));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentOwnerReference}, hash: CC10269D3325E507CA5787F3CFB4C00D
    @Test
    void testEqualsWithDifferentOwnerReference() {
        LeaderElectionRecord other = new LeaderElectionRecord();
        other.setOwnerReference(new V1OwnerReference());
        assertFalse(leaderElectionRecord.equals(other));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentAcquireTime}, hash: 4419A0E73BDD2BB9621AF3D981B992B6
    @Test
    void testEqualsWithDifferentAcquireTime() {
        LeaderElectionRecord other = new LeaderElectionRecord();
        other.setAcquireTime(new Date());
        assertFalse(leaderElectionRecord.equals(other));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentRenewTime}, hash: 65B09DC652EA3CA26E49ADD3D031FC55
    @Test
    void testEqualsWithDifferentRenewTime() {
        LeaderElectionRecord other = new LeaderElectionRecord();
        other.setRenewTime(new Date());
        // Set different renewTime
        leaderElectionRecord.setRenewTime(new Date(System.currentTimeMillis() + 1000));
        assertFalse(leaderElectionRecord.equals(other));
    }

    //BaseRock generated method id: ${testEqualsWithAllFieldsEqual}, hash: 8A23E44B6046DDFC84C0A5A32CE3C0FE
    @Test
    void testEqualsWithAllFieldsEqual() {
        LeaderElectionRecord other = new LeaderElectionRecord("holder", 60, new Date(1000L), new Date(2000L), 1, new V1OwnerReference());
        leaderElectionRecord = new LeaderElectionRecord("holder", 60, new Date(1000L), new Date(2000L), 1, new V1OwnerReference());
        assertTrue(leaderElectionRecord.equals(other));
    }

    //BaseRock generated method id: ${testEqualsWithNullHolderIdentity}, hash: 262699AC2158BB15531D2492E15315D4
    @Test
    void testEqualsWithNullHolderIdentity() {
        LeaderElectionRecord other = new LeaderElectionRecord();
        assertTrue(leaderElectionRecord.equals(other));
    }

    //BaseRock generated method id: ${testEqualsWithNullOwnerReference}, hash: 770CC9B727392DC521AE3B05C255C7D9
    @Test
    void testEqualsWithNullOwnerReference() {
        LeaderElectionRecord other = new LeaderElectionRecord();
        assertTrue(leaderElectionRecord.equals(other));
    }

    //BaseRock generated method id: ${testEqualsWithNullAcquireTime}, hash: 1EB61F0EBE6691DBDDEC752E6F4483B2
    @Test
    void testEqualsWithNullAcquireTime() {
        LeaderElectionRecord other = new LeaderElectionRecord();
        assertTrue(leaderElectionRecord.equals(other));
    }

    //BaseRock generated method id: ${testEqualsWithNullRenewTime}, hash: 1C68A4927F4D142A51D352516C3C43A2
    @Test
    void testEqualsWithNullRenewTime() {
        LeaderElectionRecord other = new LeaderElectionRecord();
        assertTrue(leaderElectionRecord.equals(other));
    }
}

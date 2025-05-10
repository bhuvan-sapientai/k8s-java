package io.kubernetes.client.extended.leaderelection;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1OwnerReference;
import java.time.Duration;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class LeaderElectionConfigBaseRockGeneratedTest {

    private LeaderElectionConfig leaderElectionConfig;

    private Lock mockLock;

    private V1OwnerReference mockOwnerReference;

    @BeforeEach
    void setUp() {
        mockLock = mock(Lock.class);
        mockOwnerReference = mock(V1OwnerReference.class);
        leaderElectionConfig = new LeaderElectionConfig();
    }

    //BaseRock generated method id: ${testDefaultConstructor}, hash: 2A4D8FED7A4D1332980FAD617D27B61E
    @Test
    void testDefaultConstructor() {
        assertThat(leaderElectionConfig, is(notNullValue()));
    }

    //BaseRock generated method id: ${testConstructorWithFourParameters}, hash: 17169F67826B141871457B814544766B
    @Test
    void testConstructorWithFourParameters() {
        Duration leaseDuration = Duration.ofSeconds(15);
        Duration renewDeadline = Duration.ofSeconds(10);
        Duration retryPeriod = Duration.ofSeconds(2);
        leaderElectionConfig = new LeaderElectionConfig(mockLock, leaseDuration, renewDeadline, retryPeriod);
        assertThat(leaderElectionConfig.getLock(), is(equalTo(mockLock)));
        assertThat(leaderElectionConfig.getLeaseDuration(), is(equalTo(leaseDuration)));
        assertThat(leaderElectionConfig.getRenewDeadline(), is(equalTo(renewDeadline)));
        assertThat(leaderElectionConfig.getRetryPeriod(), is(equalTo(retryPeriod)));
        assertThat(leaderElectionConfig.getOwnerReference(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testConstructorWithFiveParameters}, hash: 2D45615877CC1AC32CD27AA695BBE4D3
    @Test
    void testConstructorWithFiveParameters() {
        Duration leaseDuration = Duration.ofSeconds(15);
        Duration renewDeadline = Duration.ofSeconds(10);
        Duration retryPeriod = Duration.ofSeconds(2);
        leaderElectionConfig = new LeaderElectionConfig(mockLock, leaseDuration, renewDeadline, retryPeriod, mockOwnerReference);
        assertThat(leaderElectionConfig.getLock(), is(equalTo(mockLock)));
        assertThat(leaderElectionConfig.getLeaseDuration(), is(equalTo(leaseDuration)));
        assertThat(leaderElectionConfig.getRenewDeadline(), is(equalTo(renewDeadline)));
        assertThat(leaderElectionConfig.getRetryPeriod(), is(equalTo(retryPeriod)));
        assertThat(leaderElectionConfig.getOwnerReference(), is(equalTo(mockOwnerReference)));
    }

    //BaseRock generated method id: ${testSetAndGetLock}, hash: 5D50AC01E849776C8FDA9D7D34754D27
    @Test
    void testSetAndGetLock() {
        leaderElectionConfig.setLock(mockLock);
        assertThat(leaderElectionConfig.getLock(), is(equalTo(mockLock)));
    }

    //BaseRock generated method id: ${testSetAndGetLeaseDuration}, hash: FD32A70BC34855CCC49AFE3A4C38EB88
    @Test
    void testSetAndGetLeaseDuration() {
        Duration leaseDuration = Duration.ofSeconds(30);
        leaderElectionConfig.setLeaseDuration(leaseDuration);
        assertThat(leaderElectionConfig.getLeaseDuration(), is(equalTo(leaseDuration)));
    }

    //BaseRock generated method id: ${testSetAndGetRenewDeadline}, hash: D4AE27BE68FEFE74BF1377CDE1F214BA
    @Test
    void testSetAndGetRenewDeadline() {
        Duration renewDeadline = Duration.ofSeconds(20);
        leaderElectionConfig.setRenewDeadline(renewDeadline);
        assertThat(leaderElectionConfig.getRenewDeadline(), is(equalTo(renewDeadline)));
    }

    //BaseRock generated method id: ${testSetAndGetRetryPeriod}, hash: CCCE9FF8E819A5F7A50C62C904250940
    @Test
    void testSetAndGetRetryPeriod() {
        Duration retryPeriod = Duration.ofSeconds(5);
        leaderElectionConfig.setRetryPeriod(retryPeriod);
        assertThat(leaderElectionConfig.getRetryPeriod(), is(equalTo(retryPeriod)));
    }

    //BaseRock generated method id: ${testSetAndGetOwnerReference}, hash: 18E6226B411E5D0AA5836F8D6D24F2AD
    @Test
    void testSetAndGetOwnerReference() {
        leaderElectionConfig.setOwnerReference(mockOwnerReference);
        assertThat(leaderElectionConfig.getOwnerReference(), is(equalTo(mockOwnerReference)));
    }

    //BaseRock generated method id: ${testSetLockWithNull}, hash: D100485D19A29B980A4A21A6C1777940
    @Test
    void testSetLockWithNull() {
        assertDoesNotThrow(() -> leaderElectionConfig.setLock(null));
    }

    //BaseRock generated method id: ${testSetLeaseDurationWithNull}, hash: DF671B559E7805B0F74F2BE4371423AC
    @Test
    void testSetLeaseDurationWithNull() {
        assertDoesNotThrow(() -> leaderElectionConfig.setLeaseDuration(null));
    }

    //BaseRock generated method id: ${testSetRenewDeadlineWithNull}, hash: 8BCEDBC18C7715E168F7042B9EADE493
    @Test
    void testSetRenewDeadlineWithNull() {
        assertDoesNotThrow(() -> leaderElectionConfig.setRenewDeadline(null));
    }

    //BaseRock generated method id: ${testSetRetryPeriodWithNull}, hash: DF03A423FC1F5D733826756024C7DA0C
    @Test
    void testSetRetryPeriodWithNull() {
        assertDoesNotThrow(() -> leaderElectionConfig.setRetryPeriod(null));
    }

    //BaseRock generated method id: ${testSetOwnerReferenceWithNull}, hash: 3E03A1065FDB4ED6BF6E652E200FF140
    @Test
    void testSetOwnerReferenceWithNull() {
        leaderElectionConfig.setOwnerReference(null);
        assertThat(leaderElectionConfig.getOwnerReference(), is(equalTo(null)));
    }
}

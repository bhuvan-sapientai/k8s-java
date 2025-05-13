package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1StatusDetailsBaseRockGeneratedTest {

    private V1StatusDetails statusDetails;

    @BeforeEach
    void setUp() {
        statusDetails = new V1StatusDetails();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 494A4D80E567B5A40ED020D6B74FA42D
    @Test
    void testConstructor() {
        assertNotNull(statusDetails);
    }

    //BaseRock generated method id: ${testCauses}, hash: B89F5B0B1C830ED7A20F6A8EEA8E2CFD
    @Test
    void testCauses() {
        List<V1StatusCause> causes = new ArrayList<>();
        V1StatusCause cause = mock(V1StatusCause.class);
        causes.add(cause);
        statusDetails.causes(causes);
        assertEquals(causes, statusDetails.getCauses());
    }

    //BaseRock generated method id: ${testAddCausesItem}, hash: CE71C2DC89FB48E70993F58343401A12
    @Test
    void testAddCausesItem() {
        V1StatusCause cause = mock(V1StatusCause.class);
        statusDetails.addCausesItem(cause);
        assertThat(statusDetails.getCauses(), hasItem(cause));
    }

    //BaseRock generated method id: ${testGroup}, hash: 8B917B2E85B31FA6D49E8F5BBCF8FB00
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "group1", "group2" })
    void testGroup(String group) {
        statusDetails.setGroup(group);
        assertEquals(group, statusDetails.getGroup());
    }

    //BaseRock generated method id: ${testKind}, hash: 2F463F8681086E0CBBCFBEEC4D8F145A
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "kind1", "kind2" })
    void testKind(String kind) {
        statusDetails.setKind(kind);
        assertEquals(kind, statusDetails.getKind());
    }

    //BaseRock generated method id: ${testName}, hash: 09807239C01B22F452BB2689548412E2
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "name1", "name2" })
    void testName(String name) {
        statusDetails.setName(name);
        assertEquals(name, statusDetails.getName());
    }

    //BaseRock generated method id: ${testRetryAfterSeconds}, hash: 9486295EB1DABDF3FB2B94614C42D89E
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 10, 100 })
    void testRetryAfterSeconds(int retryAfterSeconds) {
        statusDetails.setRetryAfterSeconds(retryAfterSeconds);
        assertEquals(retryAfterSeconds, statusDetails.getRetryAfterSeconds());
    }

    //BaseRock generated method id: ${testUid}, hash: 9594A132CC81DA0D30FDC6D86617D82C
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "uid1", "uid2" })
    void testUid(String uid) {
        statusDetails.setUid(uid);
        assertEquals(uid, statusDetails.getUid());
    }

    //BaseRock generated method id: ${testEquals}, hash: 6D37AE72862C02DC970C96438872CA1B
    @Test
    void testEquals() {
        V1StatusDetails statusDetails1 = new V1StatusDetails().causes(new ArrayList<>()).group("group").kind("kind").name("name").retryAfterSeconds(10).uid("uid");
        V1StatusDetails statusDetails2 = new V1StatusDetails().causes(new ArrayList<>()).group("group").kind("kind").name("name").retryAfterSeconds(10).uid("uid");
        assertEquals(statusDetails1, statusDetails2);
        assertEquals(statusDetails1.hashCode(), statusDetails2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 4983966CCD8627B1BD072913EA990712
    @Test
    void testToString() {
        V1StatusDetails statusDetails = new V1StatusDetails().causes(new ArrayList<>()).group("group").kind("kind").name("name").retryAfterSeconds(10).uid("uid");
        String expected = "class V1StatusDetails {\n" + "    causes: []\n" + "    group: group\n" + "    kind: kind\n" + "    name: name\n" + "    retryAfterSeconds: 10\n" + "    uid: uid\n" + "}";
        assertEquals(expected, statusDetails.toString());
    }
}

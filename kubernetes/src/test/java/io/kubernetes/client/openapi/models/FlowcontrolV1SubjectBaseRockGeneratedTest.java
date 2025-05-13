package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import java.util.HashSet;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class FlowcontrolV1SubjectBaseRockGeneratedTest {

    @Mock
    private V1GroupSubject mockGroup;

    @Mock
    private V1ServiceAccountSubject mockServiceAccount;

    @Mock
    private V1UserSubject mockUser;

    private FlowcontrolV1Subject subject;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        subject = new FlowcontrolV1Subject();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 64117016890FD724AA43CC3F51107811
    @Test
    void testConstructor() {
        assertNotNull(subject);
    }

    //BaseRock generated method id: ${testGroup}, hash: EC637C2524F337BDD76EAB17AB377B92
    @Test
    void testGroup() {
        subject.setGroup(mockGroup);
        assertEquals(mockGroup, subject.getGroup());
    }

    //BaseRock generated method id: ${testKind}, hash: 727E682FD806F580035ECB5E05229441
    @ParameterizedTest
    @ValueSource(strings = { "User", "Group", "ServiceAccount" })
    void testKind(String kind) {
        subject.setKind(kind);
        assertEquals(kind, subject.getKind());
    }

    //BaseRock generated method id: ${testServiceAccount}, hash: 8A1E2BA29254BE136BA5103BD42A79CC
    @Test
    void testServiceAccount() {
        subject.setServiceAccount(mockServiceAccount);
        assertEquals(mockServiceAccount, subject.getServiceAccount());
    }

    //BaseRock generated method id: ${testUser}, hash: 3B81810E86EE692475ADEF398500254D
    @Test
    void testUser() {
        subject.setUser(mockUser);
        assertEquals(mockUser, subject.getUser());
    }

    //BaseRock generated method id: ${testEquals}, hash: 49D2A69A4D13157E9451B997525D718F
    @Test
    void testEquals() {
        FlowcontrolV1Subject subject1 = new FlowcontrolV1Subject().group(mockGroup).kind("Group").serviceAccount(mockServiceAccount).user(mockUser);
        FlowcontrolV1Subject subject2 = new FlowcontrolV1Subject().group(mockGroup).kind("Group").serviceAccount(mockServiceAccount).user(mockUser);
        assertEquals(subject1, subject2);
    }

    //BaseRock generated method id: ${testNotEquals}, hash: B72CD97C156155E7547D35A545CF6251
    @Test
    void testNotEquals() {
        FlowcontrolV1Subject subject1 = new FlowcontrolV1Subject().group(mockGroup).kind("Group").serviceAccount(mockServiceAccount).user(mockUser);
        FlowcontrolV1Subject subject2 = new FlowcontrolV1Subject().group(mockGroup).kind("User").serviceAccount(mockServiceAccount).user(mockUser);
        assertNotEquals(subject1, subject2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 97AE7C87E31BDFBC004F9019A45F9276
    @Test
    void testHashCode() {
        FlowcontrolV1Subject subject1 = new FlowcontrolV1Subject().group(mockGroup).kind("Group").serviceAccount(mockServiceAccount).user(mockUser);
        FlowcontrolV1Subject subject2 = new FlowcontrolV1Subject().group(mockGroup).kind("Group").serviceAccount(mockServiceAccount).user(mockUser);
        assertEquals(subject1.hashCode(), subject2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: F05435BEF4BF296C305C982F39157F9E
    @Test
    void testToString() {
        subject.setGroup(mockGroup);
        subject.setKind("Group");
        subject.setServiceAccount(mockServiceAccount);
        subject.setUser(mockUser);
        String result = subject.toString();
        assertThat(result, containsString("group"));
        assertThat(result, containsString("kind"));
        assertThat(result, containsString("serviceAccount"));
        assertThat(result, containsString("user"));
    }

    //BaseRock generated method id: ${testKindValidation}, hash: 18FABF26762B85EAC49F380406245D70
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Group", "User", "ServiceAccount" })
    void testKindValidation(String kind) {
        JsonObject jsonObject = new JsonObject();
        if (kind != null && !kind.isEmpty()) {
            jsonObject.addProperty("kind", kind);
        }
        if (kind == null || kind.isEmpty()) {
            assertThrows(IllegalArgumentException.class, () -> FlowcontrolV1Subject.validateJsonElement(jsonObject));
        } else {
            assertDoesNotThrow(() -> FlowcontrolV1Subject.validateJsonElement(jsonObject));
        }
    }

    //BaseRock generated method id: ${testOpenapiFields}, hash: 27FDA56499E6AA440F5C4DF2BAB94B93
    @Test
    void testOpenapiFields() {
        HashSet<String> expectedFields = new HashSet<>();
        expectedFields.add("group");
        expectedFields.add("kind");
        expectedFields.add("serviceAccount");
        expectedFields.add("user");
        assertEquals(expectedFields, FlowcontrolV1Subject.openapiFields);
    }

    //BaseRock generated method id: ${testOpenapiRequiredFields}, hash: A0D9CC2C5A901B2076F191AF796E97A2
    @Test
    void testOpenapiRequiredFields() {
        HashSet<String> expectedFields = new HashSet<>();
        expectedFields.add("kind");
        assertEquals(expectedFields, FlowcontrolV1Subject.openapiRequiredFields);
    }
}

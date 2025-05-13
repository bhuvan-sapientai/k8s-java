package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import com.google.gson.Gson;
import java.util.Map;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import com.google.gson.JsonParser;
import java.io.IOException;
import com.google.gson.GsonBuilder;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1UserInfoBaseRockGeneratedTest {

    private V1UserInfo userInfo;

    @BeforeEach
    void setUp() {
        userInfo = new V1UserInfo();
    }

    //BaseRock generated method id: ${testDefaultConstructor}, hash: CE53EFF1BFB0ED25737F9B549E80FFC9
    @Test
    void testDefaultConstructor() {
        assertNotNull(userInfo);
        assertTrue(userInfo.getExtra().isEmpty());
        assertTrue(userInfo.getGroups().isEmpty());
        assertNull(userInfo.getUid());
        assertNull(userInfo.getUsername());
    }

    //BaseRock generated method id: ${testExtraMapOperations}, hash: E36BD5722854F26D2DB96931E3110FC9
    @Test
    void testExtraMapOperations() {
        Map<String, List<String>> extraMap = new HashMap<>();
        List<String> valueList = new ArrayList<>();
        valueList.add("value1");
        extraMap.put("key1", valueList);
        userInfo.setExtra(extraMap);
        assertEquals(extraMap, userInfo.getExtra());
        userInfo.putExtraItem("key2", valueList);
        assertTrue(userInfo.getExtra().containsKey("key2"));
        assertEquals(valueList, userInfo.getExtra().get("key2"));
    }

    //BaseRock generated method id: ${testGroupsOperations}, hash: C450E0D2864525DDD48638CF407B44D5
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "group1", "group2", "group3" })
    void testGroupsOperations(String groupName) {
        if (groupName != null) {
            userInfo.addGroupsItem(groupName);
            assertTrue(userInfo.getGroups().contains(groupName));
        }
        List<String> groups = new ArrayList<>();
        if (groupName != null) {
            groups.add(groupName);
        }
        userInfo.setGroups(groups);
        assertEquals(groups, userInfo.getGroups());
    }

    //BaseRock generated method id: ${testUidOperations}, hash: 30920B89A4DCEF5B4A40852863E53F1B
    @Test
    void testUidOperations() {
        String uid = "test-uid";
        userInfo.setUid(uid);
        assertEquals(uid, userInfo.getUid());
    }

    //BaseRock generated method id: ${testUsernameOperations}, hash: D89CAE3C92486D17536AC69FE6ED1F75
    @Test
    void testUsernameOperations() {
        String username = "test-username";
        userInfo.setUsername(username);
        assertEquals(username, userInfo.getUsername());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 99A686CC018051C37CC475786FE81B87
    @Test
    void testEqualsAndHashCode() {
        V1UserInfo userInfo1 = new V1UserInfo().extra(new HashMap<>()).groups(new ArrayList<>()).uid("uid1").username("user1");
        V1UserInfo userInfo2 = new V1UserInfo().extra(new HashMap<>()).groups(new ArrayList<>()).uid("uid1").username("user1");
        V1UserInfo userInfo3 = new V1UserInfo().extra(new HashMap<>()).groups(new ArrayList<>()).uid("uid2").username("user2");
        assertEquals(userInfo1, userInfo2);
        assertNotEquals(userInfo1, userInfo3);
        assertEquals(userInfo1.hashCode(), userInfo2.hashCode());
        assertNotEquals(userInfo1.hashCode(), userInfo3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 5E382F21C04AE76B3BA08B7AA292AAE4
    @Test
    void testToString() {
        V1UserInfo userInfo = new V1UserInfo().extra(Map.of("key", List.of("value"))).groups(List.of("group1")).uid("test-uid").username("test-user");
        String toString = userInfo.toString();
        assertThat(toString, containsString("extra"));
        assertThat(toString, containsString("groups"));
        assertThat(toString, containsString("uid"));
        assertThat(toString, containsString("username"));
    }

    //BaseRock generated method id: ${testJsonSerialization}, hash: F9407ABB66BC5832C9DABA3DF01245B2
    @Test
    void testJsonSerialization() throws IOException {
        V1UserInfo userInfo = new V1UserInfo().extra(Map.of("key", List.of("value"))).groups(List.of("group1")).uid("test-uid").username("test-user");
        String json = userInfo.toJson();
        assertNotNull(json);
        assertFalse(json.isEmpty());
        V1UserInfo deserializedUserInfo = V1UserInfo.fromJson(json);
        assertEquals(userInfo, deserializedUserInfo);
    }

    //BaseRock generated method id: ${testJsonValidation}, hash: 0ECDAFD15FB3C8F8759D52A485C996CD
    @Test
    void testJsonValidation() {
        String validJson = "{\"extra\":{\"key\":[\"value\"]},\"groups\":[\"group1\"],\"uid\":\"test-uid\",\"username\":\"test-user\"}";
        String invalidJson = "{\"invalidField\":\"value\"}";
        assertDoesNotThrow(() -> V1UserInfo.validateJsonElement(JsonParser.parseString(validJson)));
        assertThrows(IllegalArgumentException.class, () -> V1UserInfo.validateJsonElement(JsonParser.parseString(invalidJson)));
    }

    //BaseRock generated method id: ${testCustomTypeAdapter}, hash: 11D061B68521D97BCF7880F8366A1D41
    @Test
    void testCustomTypeAdapter() {
        Gson gson = new GsonBuilder().registerTypeAdapterFactory(new V1UserInfo.CustomTypeAdapterFactory()).create();
        V1UserInfo userInfo = new V1UserInfo().extra(Map.of("key", List.of("value"))).groups(List.of("group1")).uid("test-uid").username("test-user");
        String json = gson.toJson(userInfo);
        V1UserInfo deserializedUserInfo = gson.fromJson(json, V1UserInfo.class);
        assertEquals(userInfo, deserializedUserInfo);
    }
}

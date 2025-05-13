package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import io.kubernetes.client.openapi.models.RbacV1Subject;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.containsString;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.Matchers;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import io.kubernetes.client.openapi.models.V1RoleRef;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ClusterRoleBindingBaseRockGeneratedTest {

    @Mock
    private V1ObjectMeta mockMetadata;

    @Mock
    private V1RoleRef mockRoleRef;

    @Mock
    private RbacV1Subject mockSubject;

    private V1ClusterRoleBinding clusterRoleBinding;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        clusterRoleBinding = new V1ClusterRoleBinding();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: E32AF02D44DB874CD2217EC8D9568DD8
    @Test
    void testApiVersion() {
        String apiVersion = "rbac.authorization.k8s.io/v1";
        clusterRoleBinding.setApiVersion(apiVersion);
        assertEquals(apiVersion, clusterRoleBinding.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: AC611EE1C0053261D36B0E062F4BE52D
    @Test
    void testKind() {
        String kind = "ClusterRoleBinding";
        clusterRoleBinding.setKind(kind);
        assertEquals(kind, clusterRoleBinding.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: E11FADAD5942500F6ADC0F6255741C85
    @Test
    void testMetadata() {
        clusterRoleBinding.setMetadata(mockMetadata);
        assertEquals(mockMetadata, clusterRoleBinding.getMetadata());
    }

    //BaseRock generated method id: ${testRoleRef}, hash: 9EE8DE5FA0E5CF45174AB84DA02F6115
    @Test
    void testRoleRef() {
        clusterRoleBinding.setRoleRef(mockRoleRef);
        assertEquals(mockRoleRef, clusterRoleBinding.getRoleRef());
    }

    //BaseRock generated method id: ${testSubjects}, hash: A65500E1BBF1B2A209BE673F1637041F
    @Test
    void testSubjects() {
        List<RbacV1Subject> subjects = new ArrayList<>();
        subjects.add(mockSubject);
        clusterRoleBinding.setSubjects(subjects);
        assertEquals(subjects, clusterRoleBinding.getSubjects());
    }

    //BaseRock generated method id: ${testAddSubjectsItem}, hash: 757B3AFC35808F7DEC98819367DA0082
    @Test
    void testAddSubjectsItem() {
        clusterRoleBinding.addSubjectsItem(mockSubject);
        List<RbacV1Subject> subjects = clusterRoleBinding.getSubjects();
        assertNotNull(subjects);
        assertEquals(1, subjects.size());
        assertEquals(mockSubject, subjects.get(0));
    }

    //BaseRock generated method id: ${testEquals}, hash: 4307B56C3E1FB608D2199526F0C20EE0
    @Test
    void testEquals() {
        V1ClusterRoleBinding binding1 = new V1ClusterRoleBinding().apiVersion("v1").kind("ClusterRoleBinding").metadata(mockMetadata).roleRef(mockRoleRef).subjects(List.of(mockSubject));
        V1ClusterRoleBinding binding2 = new V1ClusterRoleBinding().apiVersion("v1").kind("ClusterRoleBinding").metadata(mockMetadata).roleRef(mockRoleRef).subjects(List.of(mockSubject));
        assertEquals(binding1, binding2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: F6F7C69109DA11496DBB27744A0B03BF
    @Test
    void testHashCode() {
        V1ClusterRoleBinding binding1 = new V1ClusterRoleBinding().apiVersion("v1").kind("ClusterRoleBinding").metadata(mockMetadata).roleRef(mockRoleRef).subjects(List.of(mockSubject));
        V1ClusterRoleBinding binding2 = new V1ClusterRoleBinding().apiVersion("v1").kind("ClusterRoleBinding").metadata(mockMetadata).roleRef(mockRoleRef).subjects(List.of(mockSubject));
        assertEquals(binding1.hashCode(), binding2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: A40E696541A1FAC49FBC547B1654A1A3
    @Test
    void testToString() {
        V1ClusterRoleBinding binding = new V1ClusterRoleBinding().apiVersion("v1").kind("ClusterRoleBinding").metadata(mockMetadata).roleRef(mockRoleRef).subjects(List.of(mockSubject));
        String expectedString = "class V1ClusterRoleBinding {\n" + "    apiVersion: v1\n" + "    kind: ClusterRoleBinding\n" + "    metadata: " + mockMetadata + "\n" + "    roleRef: " + mockRoleRef + "\n" + "    subjects: [" + mockSubject + "]\n" + "}";
        assertEquals(expectedString, binding.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 998A4B0C678A1500AA4C394F3CA812D4
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiVersion", "v1");
        jsonObject.addProperty("kind", "ClusterRoleBinding");
        jsonObject.add("metadata", new JsonObject());
        JsonObject roleRefObject = new JsonObject();
        roleRefObject.addProperty("apiGroup", "rbac.authorization.k8s.io");
        roleRefObject.addProperty("kind", "ClusterRole");
        roleRefObject.addProperty("name", "admin");
        jsonObject.add("roleRef", roleRefObject);
        jsonObject.add("subjects", new JsonArray());
        V1ClusterRoleBinding.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testValidateJsonElementMissingRequiredField}, hash: 5BFBE9F8714A481F8B46784938981E18
    @Test
    void testValidateJsonElementMissingRequiredField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiVersion", "v1");
        jsonObject.addProperty("kind", "ClusterRoleBinding");
        jsonObject.add("metadata", new JsonObject());
        jsonObject.add("subjects", new JsonArray());
        assertThrows(IllegalArgumentException.class, () -> V1ClusterRoleBinding.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementInvalidFieldType}, hash: 4F4D67BBDC7F258B531189378F603D63
    @Test
    void testValidateJsonElementInvalidFieldType() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiVersion", "v1");
        // Changed to JsonObject instead of primitive
        jsonObject.add("kind", new JsonObject());
        jsonObject.add("metadata", new JsonObject());
        JsonObject roleRefObject = new JsonObject();
        roleRefObject.addProperty("apiGroup", "rbac.authorization.k8s.io");
        roleRefObject.addProperty("kind", "ClusterRole");
        roleRefObject.addProperty("name", "admin");
        jsonObject.add("roleRef", roleRefObject);
        jsonObject.add("subjects", new JsonArray());
        assertThrows(IllegalArgumentException.class, () -> V1ClusterRoleBinding.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 590B49C2B3892623AE5CC3C3DB51FE06
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"ClusterRoleBinding\",\"metadata\":{},\"roleRef\":{\"apiGroup\":\"rbac.authorization.k8s.io\",\"kind\":\"ClusterRole\",\"name\":\"admin\"},\"subjects\":[]}";
        V1ClusterRoleBinding binding = V1ClusterRoleBinding.fromJson(json);
        assertNotNull(binding);
        assertEquals("v1", binding.getApiVersion());
        assertEquals("ClusterRoleBinding", binding.getKind());
        assertNotNull(binding.getMetadata());
        assertNotNull(binding.getRoleRef());
        assertEquals("rbac.authorization.k8s.io", binding.getRoleRef().getApiGroup());
        assertEquals("ClusterRole", binding.getRoleRef().getKind());
        assertEquals("admin", binding.getRoleRef().getName());
        assertNotNull(binding.getSubjects());
    }

    //BaseRock generated method id: ${testToJson}, hash: A4A75B2B1B67C8B8BC57EA9FA1355635
    @Test
    void testToJson() {
        V1RoleRef roleRef = new V1RoleRef().apiGroup("rbac.authorization.k8s.io").kind("ClusterRole").name("admin");
        V1ClusterRoleBinding binding = new V1ClusterRoleBinding().apiVersion("v1").kind("ClusterRoleBinding").metadata(new V1ObjectMeta()).roleRef(roleRef).subjects(new ArrayList<>());
        String json = binding.toJson();
        assertNotNull(json);
        assertThat(json, containsString("\"apiVersion\":\"v1\""));
        assertThat(json, containsString("\"kind\":\"ClusterRoleBinding\""));
        assertThat(json, containsString("\"metadata\":"));
        assertThat(json, containsString("\"roleRef\":{\"apiGroup\":\"rbac.authorization.k8s.io\",\"kind\":\"ClusterRole\",\"name\":\"admin\"}"));
        assertThat(json, containsString("\"subjects\":[]"));
    }
}

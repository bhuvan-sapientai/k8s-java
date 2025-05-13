package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.hasEntry;
import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1ManagedFieldsEntry;
import io.kubernetes.client.openapi.models.V1OwnerReference;
import java.time.OffsetDateTime;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1ObjectMetaBaseRockGeneratedTest {

    private V1ObjectMeta objectMeta;

    @BeforeEach
    void setUp() {
        objectMeta = new V1ObjectMeta();
    }

    //BaseRock generated method id: ${testAnnotations}, hash: 5E75CD9CEA00CA489BB99C97001496E7
    @Test
    void testAnnotations() {
        Map<String, String> annotations = new HashMap<>();
        annotations.put("key1", "value1");
        annotations.put("key2", "value2");
        objectMeta.setAnnotations(annotations);
        assertThat(objectMeta.getAnnotations(), is(notNullValue()));
        assertThat(objectMeta.getAnnotations(), hasEntry("key1", "value1"));
        assertThat(objectMeta.getAnnotations(), hasEntry("key2", "value2"));
    }

    //BaseRock generated method id: ${testCreationTimestamp}, hash: 3B54A5D0957D739250B504278F64C2F1
    @Test
    void testCreationTimestamp() {
        OffsetDateTime now = OffsetDateTime.now();
        objectMeta.setCreationTimestamp(now);
        assertEquals(now, objectMeta.getCreationTimestamp());
    }

    //BaseRock generated method id: ${testDeletionGracePeriodSeconds}, hash: 98812E3A9340A98D9C90950AA2969B8A
    @Test
    void testDeletionGracePeriodSeconds() {
        Long gracePeriod = 30L;
        objectMeta.setDeletionGracePeriodSeconds(gracePeriod);
        assertEquals(gracePeriod, objectMeta.getDeletionGracePeriodSeconds());
    }

    //BaseRock generated method id: ${testDeletionTimestamp}, hash: 885077B1DCD648B62701B4B372C68D34
    @Test
    void testDeletionTimestamp() {
        OffsetDateTime now = OffsetDateTime.now();
        objectMeta.setDeletionTimestamp(now);
        assertEquals(now, objectMeta.getDeletionTimestamp());
    }

    //BaseRock generated method id: ${testFinalizers}, hash: BFDB1484D812159A550BA5B6861BE100
    @Test
    void testFinalizers() {
        List<String> finalizers = new ArrayList<>();
        finalizers.add("finalizer1");
        finalizers.add("finalizer2");
        objectMeta.setFinalizers(finalizers);
        assertThat(objectMeta.getFinalizers(), is(notNullValue()));
        assertThat(objectMeta.getFinalizers(), hasSize(2));
        assertThat(objectMeta.getFinalizers().get(0), is("finalizer1"));
        assertThat(objectMeta.getFinalizers().get(1), is("finalizer2"));
    }

    //BaseRock generated method id: ${testGenerateName}, hash: 5E178DAF42C194587C52D301ACD3A304
    @Test
    void testGenerateName() {
        String generateName = "test-";
        objectMeta.setGenerateName(generateName);
        assertEquals(generateName, objectMeta.getGenerateName());
    }

    //BaseRock generated method id: ${testGeneration}, hash: EDA915946B9EEA59FAF8599849EF75D1
    @Test
    void testGeneration() {
        Long generation = 1L;
        objectMeta.setGeneration(generation);
        assertEquals(generation, objectMeta.getGeneration());
    }

    //BaseRock generated method id: ${testLabels}, hash: 961279A01D129733DDA175780C2717E8
    @Test
    void testLabels() {
        Map<String, String> labels = new HashMap<>();
        labels.put("app", "test");
        labels.put("env", "dev");
        objectMeta.setLabels(labels);
        assertThat(objectMeta.getLabels(), is(notNullValue()));
        assertThat(objectMeta.getLabels(), hasEntry("app", "test"));
        assertThat(objectMeta.getLabels(), hasEntry("env", "dev"));
    }

    //BaseRock generated method id: ${testManagedFields}, hash: 559E4CA0ADF56D78F3B66DCE119F0490
    @Test
    void testManagedFields() {
        List<V1ManagedFieldsEntry> managedFields = new ArrayList<>();
        V1ManagedFieldsEntry entry1 = mock(V1ManagedFieldsEntry.class);
        V1ManagedFieldsEntry entry2 = mock(V1ManagedFieldsEntry.class);
        managedFields.add(entry1);
        managedFields.add(entry2);
        objectMeta.setManagedFields(managedFields);
        assertThat(objectMeta.getManagedFields(), is(notNullValue()));
        assertThat(objectMeta.getManagedFields(), hasSize(2));
        assertThat(objectMeta.getManagedFields().get(0), is(entry1));
        assertThat(objectMeta.getManagedFields().get(1), is(entry2));
    }

    //BaseRock generated method id: ${testName}, hash: EDA88095CAFAE0CA93E1CC9D7D94C827
    @Test
    void testName() {
        String name = "test-object";
        objectMeta.setName(name);
        assertEquals(name, objectMeta.getName());
    }

    //BaseRock generated method id: ${testNamespace}, hash: 088004E53EC3FD00A84E8D2D5299FCE1
    @Test
    void testNamespace() {
        String namespace = "default";
        objectMeta.setNamespace(namespace);
        assertEquals(namespace, objectMeta.getNamespace());
    }

    //BaseRock generated method id: ${testOwnerReferences}, hash: DAB59C8388328CAC7A24C3770941B854
    @Test
    void testOwnerReferences() {
        List<V1OwnerReference> ownerReferences = new ArrayList<>();
        V1OwnerReference ref1 = mock(V1OwnerReference.class);
        V1OwnerReference ref2 = mock(V1OwnerReference.class);
        ownerReferences.add(ref1);
        ownerReferences.add(ref2);
        objectMeta.setOwnerReferences(ownerReferences);
        assertThat(objectMeta.getOwnerReferences(), is(notNullValue()));
        assertThat(objectMeta.getOwnerReferences(), hasSize(2));
        assertThat(objectMeta.getOwnerReferences().get(0), is(ref1));
        assertThat(objectMeta.getOwnerReferences().get(1), is(ref2));
    }

    //BaseRock generated method id: ${testResourceVersion}, hash: 9CA96773C1287A1B8B507CBC94F4C9BF
    @Test
    void testResourceVersion() {
        String resourceVersion = "12345";
        objectMeta.setResourceVersion(resourceVersion);
        assertEquals(resourceVersion, objectMeta.getResourceVersion());
    }

    //BaseRock generated method id: ${testSelfLink}, hash: B0EF594344257BE328C39120A22E1EE2
    @Test
    void testSelfLink() {
        String selfLink = "/api/v1/namespaces/default/pods/test-pod";
        objectMeta.setSelfLink(selfLink);
        assertEquals(selfLink, objectMeta.getSelfLink());
    }

    //BaseRock generated method id: ${testUid}, hash: 4E82D80C8CCF68CC6AA7B2CEA8951CC4
    @Test
    void testUid() {
        String uid = "123e4567-e89b-12d3-a456-426614174000";
        objectMeta.setUid(uid);
        assertEquals(uid, objectMeta.getUid());
    }

    //BaseRock generated method id: ${testPutAnnotationsItem}, hash: 09F8116017E7D26ECA220263D712EF21
    @Test
    void testPutAnnotationsItem() {
        objectMeta.putAnnotationsItem("key", "value");
        assertThat(objectMeta.getAnnotations(), is(notNullValue()));
        assertThat(objectMeta.getAnnotations(), hasEntry("key", "value"));
    }

    //BaseRock generated method id: ${testAddFinalizersItem}, hash: 05EC5753DDB0BE8170E3133AC8CE0794
    @Test
    void testAddFinalizersItem() {
        objectMeta.addFinalizersItem("finalizer");
        assertThat(objectMeta.getFinalizers(), is(notNullValue()));
        assertThat(objectMeta.getFinalizers(), hasSize(1));
        assertThat(objectMeta.getFinalizers().get(0), is("finalizer"));
    }

    //BaseRock generated method id: ${testPutLabelsItem}, hash: 2A70640A0B7EB7795839DD3D0EA45D3C
    @Test
    void testPutLabelsItem() {
        objectMeta.putLabelsItem("key", "value");
        assertThat(objectMeta.getLabels(), is(notNullValue()));
        assertThat(objectMeta.getLabels(), hasEntry("key", "value"));
    }

    //BaseRock generated method id: ${testAddManagedFieldsItem}, hash: ADD3F1A4BE929CEDC3F7BAC7CB30AF9E
    @Test
    void testAddManagedFieldsItem() {
        V1ManagedFieldsEntry entry = mock(V1ManagedFieldsEntry.class);
        objectMeta.addManagedFieldsItem(entry);
        assertThat(objectMeta.getManagedFields(), is(notNullValue()));
        assertThat(objectMeta.getManagedFields(), hasSize(1));
        assertThat(objectMeta.getManagedFields().get(0), is(entry));
    }

    //BaseRock generated method id: ${testAddOwnerReferencesItem}, hash: B7C7C2AA2A244E64994FD4B0059A81B0
    @Test
    void testAddOwnerReferencesItem() {
        V1OwnerReference ref = mock(V1OwnerReference.class);
        objectMeta.addOwnerReferencesItem(ref);
        assertThat(objectMeta.getOwnerReferences(), is(notNullValue()));
        assertThat(objectMeta.getOwnerReferences(), hasSize(1));
        assertThat(objectMeta.getOwnerReferences().get(0), is(ref));
    }

    //BaseRock generated method id: ${testEquals}, hash: 7C8E0CCD588AA16B8988697BF9BE75BF
    @Test
    void testEquals() {
        V1ObjectMeta meta1 = new V1ObjectMeta();
        meta1.setName("test");
        V1ObjectMeta meta2 = new V1ObjectMeta();
        meta2.setName("test");
        assertThat(meta1, is(equalTo(meta2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: DA4F73D7785850D190B65C7CB1774D89
    @Test
    void testHashCode() {
        V1ObjectMeta meta1 = new V1ObjectMeta();
        meta1.setName("test");
        V1ObjectMeta meta2 = new V1ObjectMeta();
        meta2.setName("test");
        assertThat(meta1.hashCode(), is(equalTo(meta2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 52F8AC68241CD060168E94342E2E1409
    @Disabled()
    @Test
    void testToString() {
        V1ObjectMeta meta = new V1ObjectMeta();
        meta.setName("test");
        String toString = meta.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString, startsWith("class V1ObjectMeta {"));
        assertThat(toString, endsWith("}"));
        assertThat(toString, containsString("name=test"));
    }

    //BaseRock generated method id: ${testNullValues}, hash: 783CBFC7FBB0B723F09D7FC406AA93D5
    @Disabled()
    @Test
    void testNullValues() {
        assertThat(objectMeta.getAnnotations(), is(notNullValue()));
        assertThat(objectMeta.getCreationTimestamp(), is(nullValue()));
        assertThat(objectMeta.getDeletionGracePeriodSeconds(), is(nullValue()));
        assertThat(objectMeta.getDeletionTimestamp(), is(nullValue()));
        assertThat(objectMeta.getFinalizers(), is(nullValue()));
        assertThat(objectMeta.getGenerateName(), is(nullValue()));
        assertThat(objectMeta.getGeneration(), is(nullValue()));
        assertThat(objectMeta.getLabels(), is(notNullValue()));
        assertThat(objectMeta.getManagedFields(), is(nullValue()));
        assertThat(objectMeta.getName(), is(nullValue()));
        assertThat(objectMeta.getNamespace(), is(nullValue()));
        assertThat(objectMeta.getOwnerReferences(), is(nullValue()));
        assertThat(objectMeta.getResourceVersion(), is(nullValue()));
        assertThat(objectMeta.getSelfLink(), is(nullValue()));
        assertThat(objectMeta.getUid(), is(nullValue()));
    }

    //BaseRock generated method id: ${testInstantiation}, hash: 9ED3F4F7C5056DE1A72E7FEF1EEDAB46
    @Test
    void testInstantiation() {
        V1ObjectMeta meta = new V1ObjectMeta();
        assertNotNull(meta);
    }
}

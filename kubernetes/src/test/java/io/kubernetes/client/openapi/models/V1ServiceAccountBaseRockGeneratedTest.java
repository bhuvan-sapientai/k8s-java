package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1ObjectReference;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1LocalObjectReference;
import io.kubernetes.client.openapi.models.V1ServiceAccount;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ServiceAccountBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1ServiceAccountConstructor}, hash: 215CC7EF72B31442B8B403E135A8E3A3
    @Test
    void testV1ServiceAccountConstructor() {
        V1ServiceAccount serviceAccount = new V1ServiceAccount();
        assertThat(serviceAccount, is(notNullValue()));
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 22A83B80BB0A8D6788E3D1D9CB60E003
    @Test
    void testApiVersion() {
        V1ServiceAccount serviceAccount = new V1ServiceAccount();
        String apiVersion = "v1";
        serviceAccount.setApiVersion(apiVersion);
        assertEquals(apiVersion, serviceAccount.getApiVersion());
    }

    //BaseRock generated method id: ${testAutomountServiceAccountToken}, hash: 8FFA62198D175319F768E5A75E5EB74C
    @Test
    void testAutomountServiceAccountToken() {
        V1ServiceAccount serviceAccount = new V1ServiceAccount();
        Boolean automountServiceAccountToken = true;
        serviceAccount.setAutomountServiceAccountToken(automountServiceAccountToken);
        assertTrue(serviceAccount.getAutomountServiceAccountToken());
    }

    //BaseRock generated method id: ${testImagePullSecrets}, hash: 5D2BBADBC25521F36F6698E991224504
    @Test
    void testImagePullSecrets() {
        V1ServiceAccount serviceAccount = new V1ServiceAccount();
        List<V1LocalObjectReference> imagePullSecrets = new ArrayList<>();
        V1LocalObjectReference secret1 = new V1LocalObjectReference();
        secret1.setName("secret1");
        V1LocalObjectReference secret2 = new V1LocalObjectReference();
        secret2.setName("secret2");
        imagePullSecrets.add(secret1);
        imagePullSecrets.add(secret2);
        serviceAccount.setImagePullSecrets(imagePullSecrets);
        assertThat(serviceAccount.getImagePullSecrets(), hasSize(2));
        assertThat(serviceAccount.getImagePullSecrets(), containsInAnyOrder(secret1, secret2));
    }

    //BaseRock generated method id: ${testAddImagePullSecretsItem}, hash: 0F553944C94EF467197139F79146B6BE
    @Test
    void testAddImagePullSecretsItem() {
        V1ServiceAccount serviceAccount = new V1ServiceAccount();
        V1LocalObjectReference secret = new V1LocalObjectReference();
        secret.setName("secret");
        serviceAccount.addImagePullSecretsItem(secret);
        assertThat(serviceAccount.getImagePullSecrets(), hasSize(1));
        assertThat(serviceAccount.getImagePullSecrets().get(0), is(equalTo(secret)));
    }

    //BaseRock generated method id: ${testKind}, hash: 3A6242367A43A2267524EA16F47E682C
    @Test
    void testKind() {
        V1ServiceAccount serviceAccount = new V1ServiceAccount();
        String kind = "ServiceAccount";
        serviceAccount.setKind(kind);
        assertEquals(kind, serviceAccount.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 4BC730C94AE424FB0D8441FDCE5092BC
    @Test
    void testMetadata() {
        V1ServiceAccount serviceAccount = new V1ServiceAccount();
        V1ObjectMeta metadata = new V1ObjectMeta();
        metadata.setName("test-service-account");
        serviceAccount.setMetadata(metadata);
        assertThat(serviceAccount.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testSecrets}, hash: 97C10E11A258DF54C59E6FF4DA049C65
    @Test
    void testSecrets() {
        V1ServiceAccount serviceAccount = new V1ServiceAccount();
        List<V1ObjectReference> secrets = new ArrayList<>();
        V1ObjectReference secret1 = new V1ObjectReference();
        secret1.setName("secret1");
        V1ObjectReference secret2 = new V1ObjectReference();
        secret2.setName("secret2");
        secrets.add(secret1);
        secrets.add(secret2);
        serviceAccount.setSecrets(secrets);
        assertThat(serviceAccount.getSecrets(), hasSize(2));
        assertThat(serviceAccount.getSecrets(), containsInAnyOrder(secret1, secret2));
    }

    //BaseRock generated method id: ${testAddSecretsItem}, hash: 620DD61FF8719E231F7CC36F53F43CEE
    @Test
    void testAddSecretsItem() {
        V1ServiceAccount serviceAccount = new V1ServiceAccount();
        V1ObjectReference secret = new V1ObjectReference();
        secret.setName("secret");
        serviceAccount.addSecretsItem(secret);
        assertThat(serviceAccount.getSecrets(), hasSize(1));
        assertThat(serviceAccount.getSecrets().get(0), is(equalTo(secret)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 696017E89C5CC3001F3B44F8451A9A87
    @Test
    void testEquals() {
        V1ServiceAccount serviceAccount1 = new V1ServiceAccount().apiVersion("v1").kind("ServiceAccount").metadata(new V1ObjectMeta().name("test-account"));
        V1ServiceAccount serviceAccount2 = new V1ServiceAccount().apiVersion("v1").kind("ServiceAccount").metadata(new V1ObjectMeta().name("test-account"));
        V1ServiceAccount serviceAccount3 = new V1ServiceAccount().apiVersion("v2").kind("DifferentKind").metadata(new V1ObjectMeta().name("other-account"));
        assertTrue(serviceAccount1.equals(serviceAccount2));
        assertFalse(serviceAccount1.equals(serviceAccount3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 3A05762691DC9991207CF22E36F07408
    @Test
    void testHashCode() {
        V1ServiceAccount serviceAccount1 = new V1ServiceAccount().apiVersion("v1").kind("ServiceAccount").metadata(new V1ObjectMeta().name("test-account"));
        V1ServiceAccount serviceAccount2 = new V1ServiceAccount().apiVersion("v1").kind("ServiceAccount").metadata(new V1ObjectMeta().name("test-account"));
        assertEquals(serviceAccount1.hashCode(), serviceAccount2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 17D74F940418CCCAD1277A24A0D46BD2
    @Test
    void testToString() {
        V1ServiceAccount serviceAccount = new V1ServiceAccount().apiVersion("v1").kind("ServiceAccount").metadata(new V1ObjectMeta().name("test-account"));
        String expectedString = "class V1ServiceAccount {\n" + "    apiVersion: v1\n" + "    automountServiceAccountToken: null\n" + "    imagePullSecrets: []\n" + "    kind: ServiceAccount\n" + "    metadata: class V1ObjectMeta {\n" + "        annotations: {}\n" + "        creationTimestamp: null\n" + "        deletionGracePeriodSeconds: null\n" + "        deletionTimestamp: null\n" + "        finalizers: []\n" + "        generateName: null\n" + "        generation: null\n" + "        labels: {}\n" + "        managedFields: []\n" + "        name: test-account\n" + "        namespace: null\n" + "        ownerReferences: []\n" + "        resourceVersion: null\n" + "        selfLink: null\n" + "        uid: null\n" + "    }\n" + "    secrets: []\n" + "}";
        assertEquals(expectedString, serviceAccount.toString());
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 87EA288DCCE7B628480500A62F2B2770
    @Test
    void testBuilderPattern() {
        V1ServiceAccount serviceAccount = new V1ServiceAccount().apiVersion("v1").kind("ServiceAccount").metadata(new V1ObjectMeta().name("test-account")).automountServiceAccountToken(true).addImagePullSecretsItem(new V1LocalObjectReference().name("pull-secret")).addSecretsItem(new V1ObjectReference().name("secret"));
        assertEquals("v1", serviceAccount.getApiVersion());
        assertEquals("ServiceAccount", serviceAccount.getKind());
        assertEquals("test-account", serviceAccount.getMetadata().getName());
        assertTrue(serviceAccount.getAutomountServiceAccountToken());
        assertThat(serviceAccount.getImagePullSecrets(), hasSize(1));
        assertEquals("pull-secret", serviceAccount.getImagePullSecrets().get(0).getName());
        assertThat(serviceAccount.getSecrets(), hasSize(1));
        assertEquals("secret", serviceAccount.getSecrets().get(0).getName());
    }

    //BaseRock generated method id: ${testNullValues}, hash: 25F3915D25B3C0F9C0D8D632555E5C28
    @Test
    void testNullValues() {
        V1ServiceAccount serviceAccount = new V1ServiceAccount();
        assertThat(serviceAccount.getApiVersion(), is(nullValue()));
        assertThat(serviceAccount.getKind(), is(nullValue()));
        assertThat(serviceAccount.getMetadata(), is(nullValue()));
        assertThat(serviceAccount.getAutomountServiceAccountToken(), is(nullValue()));
        assertThat(serviceAccount.getImagePullSecrets(), is(notNullValue()));
        assertThat(serviceAccount.getImagePullSecrets(), hasSize(0));
        assertThat(serviceAccount.getSecrets(), is(notNullValue()));
        assertThat(serviceAccount.getSecrets(), hasSize(0));
    }
}

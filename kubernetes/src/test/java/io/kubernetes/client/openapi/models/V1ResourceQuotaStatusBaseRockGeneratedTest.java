package io.kubernetes.client.openapi.models;

import java.util.Map;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.custom.Quantity;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import io.kubernetes.client.openapi.models.V1ResourceQuotaStatus;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.hamcrest.Matchers.hasEntry;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ResourceQuotaStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1ResourceQuotaStatusConstructor}, hash: DB0D632934B1CDAD723BD96A6EC5A769
    @Test
    void testV1ResourceQuotaStatusConstructor() {
        V1ResourceQuotaStatus status = new V1ResourceQuotaStatus();
        assertThat(status, is(notNullValue()));
    }

    //BaseRock generated method id: ${testHardMethod}, hash: E0934D12F5238CDA6DF593F0ADCF1A7D
    @Test
    void testHardMethod() {
        V1ResourceQuotaStatus status = new V1ResourceQuotaStatus();
        Map<String, Quantity> hard = new HashMap<>();
        hard.put("cpu", new Quantity("1"));
        hard.put("memory", new Quantity("1Gi"));
        status.setHard(hard);
        assertEquals(hard, status.getHard());
    }

    //BaseRock generated method id: ${testUsedMethod}, hash: 829FFE8D7A90E2829D37739DB65EB958
    @Test
    void testUsedMethod() {
        V1ResourceQuotaStatus status = new V1ResourceQuotaStatus();
        Map<String, Quantity> used = new HashMap<>();
        used.put("cpu", new Quantity("0.5"));
        used.put("memory", new Quantity("512Mi"));
        status.setUsed(used);
        assertEquals(used, status.getUsed());
    }

    //BaseRock generated method id: ${testPutHardItem}, hash: BC0B8E1DF75097BB24D96D0D51CF45AA
    @Test
    void testPutHardItem() {
        V1ResourceQuotaStatus status = new V1ResourceQuotaStatus();
        status.putHardItem("cpu", new Quantity("1"));
        assertThat(status.getHard(), hasEntry("cpu", new Quantity("1")));
    }

    //BaseRock generated method id: ${testPutUsedItem}, hash: A819497BFE4FB349B225A6F1A7FDB4FE
    @Test
    void testPutUsedItem() {
        V1ResourceQuotaStatus status = new V1ResourceQuotaStatus();
        status.putUsedItem("memory", new Quantity("512Mi"));
        assertThat(status.getUsed(), hasEntry("memory", new Quantity("512Mi")));
    }

    //BaseRock generated method id: ${testEqualsMethod}, hash: 29EFD09FE6E3DD65F31306DAE16079DD
    @Test
    void testEqualsMethod() {
        V1ResourceQuotaStatus status1 = new V1ResourceQuotaStatus().hard(new HashMap<String, Quantity>() {

            {
                put("cpu", new Quantity("1"));
            }
        }).used(new HashMap<String, Quantity>() {

            {
                put("memory", new Quantity("512Mi"));
            }
        });
        V1ResourceQuotaStatus status2 = new V1ResourceQuotaStatus().hard(new HashMap<String, Quantity>() {

            {
                put("cpu", new Quantity("1"));
            }
        }).used(new HashMap<String, Quantity>() {

            {
                put("memory", new Quantity("512Mi"));
            }
        });
        V1ResourceQuotaStatus status3 = new V1ResourceQuotaStatus().hard(new HashMap<String, Quantity>() {

            {
                put("cpu", new Quantity("2"));
            }
        }).used(new HashMap<String, Quantity>() {

            {
                put("memory", new Quantity("1Gi"));
            }
        });
        assertTrue(status1.equals(status2));
        assertTrue(status2.equals(status1));
        assertFalse(status1.equals(status3));
        assertFalse(status1.equals(null));
        assertFalse(status1.equals(new Object()));
    }

    //BaseRock generated method id: ${testHashCodeMethod}, hash: 0A212ABC52954C044082565916A55D0D
    @Test
    void testHashCodeMethod() {
        V1ResourceQuotaStatus status1 = new V1ResourceQuotaStatus().hard(new HashMap<String, Quantity>() {

            {
                put("cpu", new Quantity("1"));
            }
        }).used(new HashMap<String, Quantity>() {

            {
                put("memory", new Quantity("512Mi"));
            }
        });
        V1ResourceQuotaStatus status2 = new V1ResourceQuotaStatus().hard(new HashMap<String, Quantity>() {

            {
                put("cpu", new Quantity("1"));
            }
        }).used(new HashMap<String, Quantity>() {

            {
                put("memory", new Quantity("512Mi"));
            }
        });
        V1ResourceQuotaStatus status3 = new V1ResourceQuotaStatus().hard(new HashMap<String, Quantity>() {

            {
                put("cpu", new Quantity("2"));
            }
        }).used(new HashMap<String, Quantity>() {

            {
                put("memory", new Quantity("1Gi"));
            }
        });
        assertEquals(status1.hashCode(), status2.hashCode());
        assertNotEquals(status1.hashCode(), status3.hashCode());
    }

    //BaseRock generated method id: ${testToStringMethod}, hash: 98F6A7F839F18F1A72B96C0127B142A3
    @Test
    void testToStringMethod() {
        V1ResourceQuotaStatus status = new V1ResourceQuotaStatus().hard(new HashMap<String, Quantity>() {

            {
                put("cpu", new Quantity("1"));
            }
        }).used(new HashMap<String, Quantity>() {

            {
                put("memory", new Quantity("512Mi"));
            }
        });
        String expectedString = "class V1ResourceQuotaStatus {\n    hard: {cpu=Quantity{number=1, format=DECIMAL_SI}}\n    used: {memory=Quantity{number=536870912, format=BINARY_SI}}\n}";
        assertEquals(expectedString, status.toString());
    }

    //BaseRock generated method id: ${testHardChaining}, hash: F9FE4B8C9CD805B2428B9DA0661FC7D4
    @Test
    void testHardChaining() {
        Map<String, Quantity> hard = new HashMap<>();
        hard.put("cpu", new Quantity("1"));
        hard.put("memory", new Quantity("1Gi"));
        V1ResourceQuotaStatus status = new V1ResourceQuotaStatus().hard(hard);
        assertThat(status.getHard(), is(equalTo(hard)));
    }

    //BaseRock generated method id: ${testUsedChaining}, hash: CE9A0C2660D92884FA521A7D7202CD4E
    @Test
    void testUsedChaining() {
        Map<String, Quantity> used = new HashMap<>();
        used.put("cpu", new Quantity("0.5"));
        used.put("memory", new Quantity("512Mi"));
        V1ResourceQuotaStatus status = new V1ResourceQuotaStatus().used(used);
        assertThat(status.getUsed(), is(equalTo(used)));
    }
}

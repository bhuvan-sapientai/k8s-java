package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CapabilitiesBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 5D2F2BD465A248B57D12276DE8C8AB09
    @Test
    void testConstructor() {
        V1Capabilities capabilities = new V1Capabilities();
        assertNotNull(capabilities);
    }

    //BaseRock generated method id: ${testAdd}, hash: C1D75ABF53F393B1004E4239D41789F9
    @Test
    void testAdd() {
        V1Capabilities capabilities = new V1Capabilities();
        List<String> addList = new ArrayList<>();
        addList.add("CAP_NET_ADMIN");
        addList.add("CAP_SYS_TIME");
        V1Capabilities result = capabilities.add(addList);
        assertEquals(addList, result.getAdd());
        assertSame(capabilities, result);
    }

    //BaseRock generated method id: ${testAddAddItem}, hash: BA1746B26986E7BEF58F959FFAA3CB66
    @ParameterizedTest
    @ValueSource(strings = { "CAP_NET_ADMIN", "CAP_SYS_TIME" })
    void testAddAddItem(String addItem) {
        V1Capabilities capabilities = new V1Capabilities();
        V1Capabilities result = capabilities.addAddItem(addItem);
        assertTrue(result.getAdd().contains(addItem));
        assertSame(capabilities, result);
    }

    //BaseRock generated method id: ${testGetAdd}, hash: CA545BE30A767B6AD3A87D05DE17F584
    @Test
    void testGetAdd() {
        V1Capabilities capabilities = new V1Capabilities();
        List<String> addList = new ArrayList<>();
        addList.add("CAP_NET_ADMIN");
        capabilities.setAdd(addList);
        assertEquals(addList, capabilities.getAdd());
    }

    //BaseRock generated method id: ${testSetAdd}, hash: 473D7137DFE5281DB17DBBB1275B1DF2
    @Test
    void testSetAdd() {
        V1Capabilities capabilities = new V1Capabilities();
        List<String> addList = new ArrayList<>();
        addList.add("CAP_NET_ADMIN");
        capabilities.setAdd(addList);
        assertEquals(addList, capabilities.getAdd());
    }

    //BaseRock generated method id: ${testDrop}, hash: CB69E38CD8A70DCFE7E3BF80AB86ED61
    @Test
    void testDrop() {
        V1Capabilities capabilities = new V1Capabilities();
        List<String> dropList = new ArrayList<>();
        dropList.add("CAP_NET_RAW");
        dropList.add("CAP_SYS_ADMIN");
        V1Capabilities result = capabilities.drop(dropList);
        assertEquals(dropList, result.getDrop());
        assertSame(capabilities, result);
    }

    //BaseRock generated method id: ${testAddDropItem}, hash: 3D8FD8621D4E41047C2B339372E9FDC6
    @ParameterizedTest
    @ValueSource(strings = { "CAP_NET_RAW", "CAP_SYS_ADMIN" })
    void testAddDropItem(String dropItem) {
        V1Capabilities capabilities = new V1Capabilities();
        V1Capabilities result = capabilities.addDropItem(dropItem);
        assertTrue(result.getDrop().contains(dropItem));
        assertSame(capabilities, result);
    }

    //BaseRock generated method id: ${testGetDrop}, hash: 387C7D9AC5C2E10DA62B336F72CB98EC
    @Test
    void testGetDrop() {
        V1Capabilities capabilities = new V1Capabilities();
        List<String> dropList = new ArrayList<>();
        dropList.add("CAP_NET_RAW");
        capabilities.setDrop(dropList);
        assertEquals(dropList, capabilities.getDrop());
    }

    //BaseRock generated method id: ${testSetDrop}, hash: 25516434970550A3FEBFD8DA05E081E1
    @Test
    void testSetDrop() {
        V1Capabilities capabilities = new V1Capabilities();
        List<String> dropList = new ArrayList<>();
        dropList.add("CAP_NET_RAW");
        capabilities.setDrop(dropList);
        assertEquals(dropList, capabilities.getDrop());
    }

    //BaseRock generated method id: ${testEquals}, hash: 3A29FD5555869D8B5F8DCBC75B89BAE5
    @Test
    void testEquals() {
        V1Capabilities capabilities1 = new V1Capabilities().add(List.of("CAP_NET_ADMIN")).drop(List.of("CAP_NET_RAW"));
        V1Capabilities capabilities2 = new V1Capabilities().add(List.of("CAP_NET_ADMIN")).drop(List.of("CAP_NET_RAW"));
        V1Capabilities capabilities3 = new V1Capabilities().add(List.of("CAP_SYS_TIME")).drop(List.of("CAP_SYS_ADMIN"));
        assertTrue(capabilities1.equals(capabilities2));
        assertTrue(capabilities2.equals(capabilities1));
        assertFalse(capabilities1.equals(capabilities3));
        assertFalse(capabilities1.equals(null));
        assertFalse(capabilities1.equals(new Object()));
    }

    //BaseRock generated method id: ${testHashCode}, hash: E6AB0454C58E4EADF847EC3F0F8D2A60
    @Test
    void testHashCode() {
        V1Capabilities capabilities1 = new V1Capabilities().add(List.of("CAP_NET_ADMIN")).drop(List.of("CAP_NET_RAW"));
        V1Capabilities capabilities2 = new V1Capabilities().add(List.of("CAP_NET_ADMIN")).drop(List.of("CAP_NET_RAW"));
        V1Capabilities capabilities3 = new V1Capabilities().add(List.of("CAP_SYS_TIME")).drop(List.of("CAP_SYS_ADMIN"));
        assertEquals(capabilities1.hashCode(), capabilities2.hashCode());
        assertNotEquals(capabilities1.hashCode(), capabilities3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 28A7AE29E0CDB8288FAA988008B5F176
    @Test
    void testToString() {
        V1Capabilities capabilities = new V1Capabilities().add(List.of("CAP_NET_ADMIN")).drop(List.of("CAP_NET_RAW"));
        String expectedString = "class V1Capabilities {\n    add: [CAP_NET_ADMIN]\n    drop: [CAP_NET_RAW]\n}";
        assertEquals(expectedString, capabilities.toString());
    }

    //BaseRock generated method id: ${testAddWithNullAndEmpty}, hash: 22C960A1ADE7C66E1592782DE286D877
    @ParameterizedTest
    @NullAndEmptySource
    void testAddWithNullAndEmpty(List<String> addList) {
        V1Capabilities capabilities = new V1Capabilities();
        V1Capabilities result = capabilities.add(addList);
        assertTrue(result.getAdd() == null || result.getAdd().isEmpty());
        assertSame(capabilities, result);
    }

    //BaseRock generated method id: ${testDropWithNullAndEmpty}, hash: F210683177B353553FCF9462AA098DE9
    @ParameterizedTest
    @NullAndEmptySource
    void testDropWithNullAndEmpty(List<String> dropList) {
        V1Capabilities capabilities = new V1Capabilities();
        V1Capabilities result = capabilities.drop(dropList);
        assertTrue(result.getDrop() == null || result.getDrop().isEmpty());
        assertSame(capabilities, result);
    }

    //BaseRock generated method id: ${testAddAddItemNull}, hash: 75A19654CD0341423C9F5654E6BA4586
    @Test
    void testAddAddItemNull() {
        V1Capabilities capabilities = new V1Capabilities();
        V1Capabilities result = capabilities.addAddItem(null);
        assertTrue(result.getAdd().contains(null));
        assertSame(capabilities, result);
    }

    //BaseRock generated method id: ${testAddDropItemNull}, hash: 560F6C7A530B5A0F2F273F29250582B5
    @Test
    void testAddDropItemNull() {
        V1Capabilities capabilities = new V1Capabilities();
        V1Capabilities result = capabilities.addDropItem(null);
        assertTrue(result.getDrop().contains(null));
        assertSame(capabilities, result);
    }
}

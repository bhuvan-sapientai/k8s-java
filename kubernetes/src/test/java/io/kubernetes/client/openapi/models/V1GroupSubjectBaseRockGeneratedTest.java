package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1GroupSubjectBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 5A1123554F0D9691854097F779CF51CA
    @Test
    void testConstructor() {
        V1GroupSubject subject = new V1GroupSubject();
        assertNotNull(subject);
    }

    //BaseRock generated method id: ${testNameGetter}, hash: 1346817DB8FAF88D62782ABA14918F0A
    @Test
    void testNameGetter() {
        V1GroupSubject subject = new V1GroupSubject().name("testGroup");
        assertEquals("testGroup", subject.getName());
    }

    //BaseRock generated method id: ${testNameSetter}, hash: 6EFE90599A556AF8F4A82CF6534F1262
    @Test
    void testNameSetter() {
        V1GroupSubject subject = new V1GroupSubject();
        subject.setName("testGroup");
        assertEquals("testGroup", subject.getName());
    }

    //BaseRock generated method id: ${testNameWithValidValues}, hash: 786FDFB18CA8DB2D3906F77B7EE542E3
    @ParameterizedTest
    @ValueSource(strings = { "group1", "group2", "*" })
    void testNameWithValidValues(String groupName) {
        V1GroupSubject subject = new V1GroupSubject().name(groupName);
        assertEquals(groupName, subject.getName());
    }

    //BaseRock generated method id: ${testNameWithInvalidValues}, hash: 010983E7D9D7684023A22B438C8330BA
    @ParameterizedTest
    @NullAndEmptySource
    void testNameWithInvalidValues(String groupName) {
        V1GroupSubject subject = new V1GroupSubject();
        subject.setName(groupName);
        if (groupName == null) {
            assertNull(subject.getName());
        } else {
            assertEquals("", subject.getName());
        }
    }

    //BaseRock generated method id: ${testEquals}, hash: A2A530B20986AEE145C8C430A08E290E
    @Test
    void testEquals() {
        V1GroupSubject subject1 = new V1GroupSubject().name("group1");
        V1GroupSubject subject2 = new V1GroupSubject().name("group1");
        V1GroupSubject subject3 = new V1GroupSubject().name("group2");
        assertTrue(subject1.equals(subject2));
        assertFalse(subject1.equals(subject3));
        assertFalse(subject1.equals(null));
        assertFalse(subject1.equals(new Object()));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 424C846B64CAA9B1F20A7AC08254433A
    @Test
    void testHashCode() {
        V1GroupSubject subject1 = new V1GroupSubject().name("group1");
        V1GroupSubject subject2 = new V1GroupSubject().name("group1");
        V1GroupSubject subject3 = new V1GroupSubject().name("group2");
        assertEquals(subject1.hashCode(), subject2.hashCode());
        assertNotEquals(subject1.hashCode(), subject3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 91C269154665D65E0C8143503893231A
    @Test
    void testToString() {
        V1GroupSubject subject = new V1GroupSubject().name("testGroup");
        String expected = "class V1GroupSubject {\n    name: testGroup\n}";
        assertEquals(expected, subject.toString());
    }
}

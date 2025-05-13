package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1StatusCause;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1StatusCauseBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1StatusCauseConstructor}, hash: 5F27B94157B3EBAF1D919CF13C792F85
    @Test
    void testV1StatusCauseConstructor() {
        V1StatusCause statusCause = new V1StatusCause();
        assertNotNull(statusCause);
    }

    //BaseRock generated method id: ${testField}, hash: 99A29CE410B74C4DA196E9CFCD27DF3D
    @Test
    void testField() {
        V1StatusCause statusCause = new V1StatusCause();
        String field = "testField";
        statusCause.setField(field);
        assertEquals(field, statusCause.getField());
    }

    //BaseRock generated method id: ${testMessage}, hash: 8F50342ADF55E55BD22DFFBB33BD9293
    @Test
    void testMessage() {
        V1StatusCause statusCause = new V1StatusCause();
        String message = "Test message";
        statusCause.setMessage(message);
        assertEquals(message, statusCause.getMessage());
    }

    //BaseRock generated method id: ${testReason}, hash: D250A12712E12E036BF1D25CE10BAF5C
    @Test
    void testReason() {
        V1StatusCause statusCause = new V1StatusCause();
        String reason = "Test reason";
        statusCause.setReason(reason);
        assertEquals(reason, statusCause.getReason());
    }

    //BaseRock generated method id: ${testFieldChaining}, hash: 393CB0C8B0A608007CBF9F78454D9A4F
    @Test
    void testFieldChaining() {
        V1StatusCause statusCause = new V1StatusCause().field("testField");
        assertEquals("testField", statusCause.getField());
    }

    //BaseRock generated method id: ${testMessageChaining}, hash: A49129FC2D39C3BFBBB7934C0466EC5A
    @Test
    void testMessageChaining() {
        V1StatusCause statusCause = new V1StatusCause().message("Test message");
        assertEquals("Test message", statusCause.getMessage());
    }

    //BaseRock generated method id: ${testReasonChaining}, hash: E511BC1FD1594F1F4715918C0B30B410
    @Test
    void testReasonChaining() {
        V1StatusCause statusCause = new V1StatusCause().reason("Test reason");
        assertEquals("Test reason", statusCause.getReason());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 3C340DEA48A1FFD53FDA1FBC4F6F7D24
    @Test
    void testEqualsAndHashCode() {
        V1StatusCause statusCause1 = new V1StatusCause().field("testField").message("Test message").reason("Test reason");
        V1StatusCause statusCause2 = new V1StatusCause().field("testField").message("Test message").reason("Test reason");
        V1StatusCause statusCause3 = new V1StatusCause().field("differentField").message("Different message").reason("Different reason");
        assertThat(statusCause1, is(equalTo(statusCause2)));
        assertThat(statusCause1.hashCode(), is(equalTo(statusCause2.hashCode())));
        assertThat(statusCause1, is(equalTo(statusCause1)));
        assertThat(statusCause1, is(equalTo(statusCause1)));
        assertThat(statusCause1.equals(statusCause3), is(false));
        assertThat(statusCause1.equals(null), is(false));
        assertThat(statusCause1.equals(new Object()), is(false));
    }

    //BaseRock generated method id: ${testToString}, hash: 099DFF357211F075A96EF19EC2030974
    @Test
    void testToString() {
        V1StatusCause statusCause = new V1StatusCause().field("testField").message("Test message").reason("Test reason");
        String expectedString = "class V1StatusCause {\n    field: testField\n    message: Test message\n    reason: Test reason\n}";
        assertEquals(expectedString, statusCause.toString());
    }

    //BaseRock generated method id: ${testNullValues}, hash: D274E99763A2F0ED2341F613BDBFA1D6
    @Test
    void testNullValues() {
        V1StatusCause statusCause = new V1StatusCause();
        assertThat(statusCause.getField(), is(nullValue()));
        assertThat(statusCause.getMessage(), is(nullValue()));
        assertThat(statusCause.getReason(), is(nullValue()));
    }
}

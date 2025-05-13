package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import java.util.List;
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
class V1ExecActionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 8129D8AF03FE115E4135C1602C6197E0
    @Test
    void testConstructor() {
        V1ExecAction execAction = new V1ExecAction();
        assertNotNull(execAction);
    }

    //BaseRock generated method id: ${testCommand}, hash: 5D99AE67EC65E9BFC4EAC28DEC97A837
    @Test
    void testCommand() {
        V1ExecAction execAction = new V1ExecAction();
        List<String> command = new ArrayList<>();
        command.add("ls");
        command.add("-l");
        V1ExecAction result = execAction.command(command);
        assertSame(execAction, result);
        assertEquals(command, execAction.getCommand());
    }

    //BaseRock generated method id: ${testAddCommandItem}, hash: FBE8A04C204C16BAAD0FB94CEC643D5C
    @Test
    void testAddCommandItem() {
        V1ExecAction execAction = new V1ExecAction();
        String commandItem = "echo";
        V1ExecAction result = execAction.addCommandItem(commandItem);
        assertSame(execAction, result);
        assertTrue(execAction.getCommand().contains(commandItem));
    }

    //BaseRock generated method id: ${testGetCommand}, hash: E93CFE39C7FCC47B1A9435320B996B27
    @Test
    void testGetCommand() {
        V1ExecAction execAction = new V1ExecAction();
        List<String> command = new ArrayList<>();
        command.add("pwd");
        execAction.setCommand(command);
        List<String> result = execAction.getCommand();
        assertEquals(command, result);
    }

    //BaseRock generated method id: ${testSetCommand}, hash: C99691E917678CD1A5397A2DFB900D3A
    @Test
    void testSetCommand() {
        V1ExecAction execAction = new V1ExecAction();
        List<String> command = new ArrayList<>();
        command.add("cat");
        command.add("file.txt");
        execAction.setCommand(command);
        assertEquals(command, execAction.getCommand());
    }

    //BaseRock generated method id: ${testEquals}, hash: 000F51E63A93DD173AAB6B23B4FCCEA0
    @Test
    void testEquals() {
        V1ExecAction execAction1 = new V1ExecAction().addCommandItem("test");
        V1ExecAction execAction2 = new V1ExecAction().addCommandItem("test");
        V1ExecAction execAction3 = new V1ExecAction().addCommandItem("different");
        assertTrue(execAction1.equals(execAction2));
        assertFalse(execAction1.equals(execAction3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: D4C782B25B3E73A3FD08F64B243E612A
    @Test
    void testHashCode() {
        V1ExecAction execAction1 = new V1ExecAction().addCommandItem("test");
        V1ExecAction execAction2 = new V1ExecAction().addCommandItem("test");
        assertEquals(execAction1.hashCode(), execAction2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 449C123DA5DEF9A59C9E3E2292FE9062
    @Test
    void testToString() {
        V1ExecAction execAction = new V1ExecAction().addCommandItem("echo").addCommandItem("hello");
        String result = execAction.toString();
        assertTrue(result.contains("class V1ExecAction"));
        assertTrue(result.contains("command"));
        assertTrue(result.contains("echo"));
        assertTrue(result.contains("hello"));
    }

    //BaseRock generated method id: ${testCommandWithVariousInputs}, hash: 7696F22EFC7CA5CE2069834BF236652F
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "command1", "command2", "command3" })
    void testCommandWithVariousInputs(String commandItem) {
        V1ExecAction execAction = new V1ExecAction();
        if (commandItem != null) {
            execAction.addCommandItem(commandItem);
            assertTrue(execAction.getCommand().contains(commandItem));
        } else {
            execAction.setCommand(null);
            assertNull(execAction.getCommand());
        }
    }

    //BaseRock generated method id: ${testAddCommandItemToNullList}, hash: B3C837B79B8E17CDEB285F81AC8BAD4F
    @Test
    void testAddCommandItemToNullList() {
        V1ExecAction execAction = new V1ExecAction();
        execAction.setCommand(null);
        execAction.addCommandItem("test");
        assertNotNull(execAction.getCommand());
        assertEquals(1, execAction.getCommand().size());
        assertEquals("test", execAction.getCommand().get(0));
    }
}

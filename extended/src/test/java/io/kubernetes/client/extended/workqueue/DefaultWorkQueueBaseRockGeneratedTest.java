package io.kubernetes.client.extended.workqueue;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import io.kubernetes.client.extended.workqueue.DefaultWorkQueue;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class DefaultWorkQueueBaseRockGeneratedTest {

    private DefaultWorkQueue<String> workQueue;

    @BeforeEach
    void setUp() {
        workQueue = new DefaultWorkQueue<>();
    }

    //BaseRock generated method id: ${testAdd}, hash: 4BC91B83785986E92987E86424533DD4
    @Test
    void testAdd() {
        workQueue.add("item1");
        assertEquals(1, workQueue.length());
    }

    //BaseRock generated method id: ${testAddDuplicate}, hash: 1D7C58FB33B6C80E6DB58B75369BAC50
    @Test
    void testAddDuplicate() {
        workQueue.add("item1");
        workQueue.add("item1");
        assertEquals(1, workQueue.length());
    }

    //BaseRock generated method id: ${testLength}, hash: 7B0462E5AF30F8C442D2A97FD22218DE
    @Test
    void testLength() {
        assertEquals(0, workQueue.length());
        workQueue.add("item1");
        assertEquals(1, workQueue.length());
        workQueue.add("item2");
        assertEquals(2, workQueue.length());
    }

    //BaseRock generated method id: ${testGet}, hash: 821ABCD92442A12A0B94253F5ADBF4C3
    @Test
    void testGet() throws InterruptedException {
        workQueue.add("item1");
        assertEquals("item1", workQueue.get());
        assertEquals(0, workQueue.length());
    }

    //BaseRock generated method id: ${testGetEmptyQueue}, hash: 9033C28F610E27A93664B5EC3FD8A0E0
    @Test
    void testGetEmptyQueue() {
        assertDoesNotThrow(() -> {
            Thread t = new Thread(() -> {
                try {
                    workQueue.get();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
            t.start();
            Thread.sleep(100);
            workQueue.shutDown();
            t.join(1000);
            assertFalse(t.isAlive());
        });
    }

    //BaseRock generated method id: ${testDone}, hash: 1A3B65F29B244AF17FA67CFCEDCC1901
    @Test
    void testDone() throws InterruptedException {
        workQueue.add("item1");
        String item = workQueue.get();
        assertEquals(0, workQueue.length());
        workQueue.done(item);
        assertEquals(0, workQueue.length());
    }

    //BaseRock generated method id: ${testDoneWithDirtyItem}, hash: 259D413BEAE2676CF5C97FDB5B8C7E99
    @Test
    void testDoneWithDirtyItem() throws InterruptedException {
        workQueue.add("item1");
        String item = workQueue.get();
        workQueue.add(item);
        workQueue.done(item);
        assertEquals(1, workQueue.length());
    }

    //BaseRock generated method id: ${testShutDown}, hash: 42C467E8186C07AB26B41AD298C0C4AE
    @Test
    void testShutDown() {
        assertFalse(workQueue.isShuttingDown());
        workQueue.shutDown();
        assertTrue(workQueue.isShuttingDown());
    }

    //BaseRock generated method id: ${testAddAfterShutDown}, hash: 7109591CA6DBA4127986AE428F5039B9
    @Test
    void testAddAfterShutDown() {
        workQueue.shutDown();
        workQueue.add("item1");
        assertEquals(0, workQueue.length());
    }

    //BaseRock generated method id: ${testGetAfterShutDown}, hash: 03FACCB0626F03F22FBF48464C93C821
    @Test
    void testGetAfterShutDown() throws InterruptedException {
        workQueue.shutDown();
        assertThat(workQueue.get(), is(nullValue()));
    }

    //BaseRock generated method id: ${testMultipleOperations}, hash: AE3DADA820B6800DF413CE54DECAABE3
    @Test
    void testMultipleOperations() throws InterruptedException {
        workQueue.add("item1");
        workQueue.add("item2");
        workQueue.add("item3");
        assertEquals(3, workQueue.length());
        String item1 = workQueue.get();
        assertEquals(2, workQueue.length());
        workQueue.done(item1);
        assertEquals(2, workQueue.length());
        String item2 = workQueue.get();
        assertEquals(1, workQueue.length());
        workQueue.add(item1);
        assertEquals(2, workQueue.length());
        workQueue.done(item2);
        assertEquals(2, workQueue.length());
        String item3 = workQueue.get();
        assertEquals(1, workQueue.length());
        workQueue.done(item3);
        assertEquals(1, workQueue.length());
        String itemFinal = workQueue.get();
        assertEquals(0, workQueue.length());
        workQueue.done(itemFinal);
        assertEquals(0, workQueue.length());
    }

    //BaseRock generated method id: ${testConcurrentOperations}, hash: 7F425EC8BB189472225EC01B78EA8BC5
    @Test
    void testConcurrentOperations() throws InterruptedException {
        Thread producer = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                workQueue.add("item" + i);
            }
        });
        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                try {
                    String item = workQueue.get();
                    workQueue.done(item);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
        assertEquals(0, workQueue.length());
    }
}

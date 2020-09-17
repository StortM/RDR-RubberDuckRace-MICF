package RDR;

import RDR.Duck;
import RDR.Queue;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    Queue queue;

    @BeforeEach
    void initialize(){
        queue = new Queue(new ArrayList<>());
        queue.addEnd(1);
        queue.addEnd(2);
        queue.addEnd(3);
        queue.addEnd(4);
        queue.addEnd(5);
        queue.addEnd(6);
        queue.addEnd(7);
    }


    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        queue = new Queue(new ArrayList<>());
        queue.addEnd(1);
        queue.addEnd(2);
        queue.addEnd(3);
        queue.addEnd(4);
        queue.addEnd(5);
        queue.addEnd(6);
        queue.addEnd(7);
    }

    @org.junit.jupiter.api.Test
    void size() {
        int expected = 7;
        assertEquals(expected,queue.size());
    }

    @org.junit.jupiter.api.Test
    void addEnd() {
        queue.addEnd(100);
        assertEquals(new Duck(100).getNumber(),queue.getQueue().get(queue.size()-1).getNumber());
    }

    @org.junit.jupiter.api.Test
    void removeFront() {
        queue.removeFront();
        assertEquals(2,queue.getQueue().get(0).getNumber());
    }
}
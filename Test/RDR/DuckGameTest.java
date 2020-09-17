package RDR;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DuckGameTest {
    Queue queue;
    List<Queue> queueList = new ArrayList<>();

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

        queueList.add(queue);
    }

    @Test
    void makeNDucksTestAmountOfLists() {
        //check correct amount of lists
        int expected = 10;
        assertEquals(expected,DuckGame.makeNDucks(100).size());
        assertEquals(9,DuckGame.makeNDucks(81).size());
    }

    @Test
    void makeNDucksTestSizeOfLists() {
        //check correct amount of ducks
        Queue queue;

        queue = new Queue(new ArrayList<>());
        queue.addEnd(1);
        queue.addEnd(2);
        queue.addEnd(3);
        queue.addEnd(4);
        queue.addEnd(5);
        queue.addEnd(6);
        queue.addEnd(7);

        assertEquals(queue.size(),DuckGame.makeNDucks(49).get(1).size());
        assertEquals(queue.size(),DuckGame.makeNDucks(49).get(5).size());
        assertEquals(queue.size(),DuckGame.makeNDucks(49).get(2).size());
    }

    @Test
    void runIterationTest(){
        Queue queue2 = new Queue(new ArrayList<>());
        queue2.addEnd(8);
        queue2.addEnd(9);
        queue2.addEnd(10);
        queue2.addEnd(11);
        queue2.addEnd(12);
        queue2.addEnd(13);
        queue2.addEnd(14);

        queueList.add(queue2);

        List<Queue> newQueueList = DuckGame.runIteration(queueList);
        assertEquals(1,newQueueList.size());
    }

    @Test
    void runGameTest(){
    }


}
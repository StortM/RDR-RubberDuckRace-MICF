package RDR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Queue> list = DuckGame.makeNDucks(100);
/*        System.out.println(Arrays.toString(list.get(0).getQueue().toArray()));
        List<Queue> newList = runIteration(list);
        System.out.println(newList.size());
        newList = runIteration(newList);
        newList = runIteration(newList);
        newList = runIteration(newList);
        newList = runIteration(newList);
        newList = runIteration(newList);
        newList = runIteration(newList);
        newList = runIteration(newList);
        newList = runIteration(newList);
        printQueueList(newList);*/
        DuckGame.runGame(list);
    }
}
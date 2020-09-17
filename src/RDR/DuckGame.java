package RDR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuckGame {

    public DuckGame() {
    }

    //making ducks ducks and placing them in queues queues
    public static List<Queue> makeNDucks(int ducks){
        int queues = (int) Math.sqrt(ducks);

        Queue bigQueue = new Queue(new ArrayList<Duck>());
        List<Queue> queueArr = new ArrayList<>();

        for (int i = 0; i < ducks; i++){
            bigQueue.addEnd(i+1);
        }
        Collections.shuffle(bigQueue.getQueue());

        for (int i = 0; i < queues; i++) {
            Queue newqueue = new Queue(new ArrayList<>(bigQueue.getQueue().subList(i*queues, ((i+1)*queues))));
            queueArr.add(newqueue);
        }
        return queueArr;
    }

    //run game iteration
    public static List<Queue> runIteration(List<Queue> queueList){
        List<Queue> newQueue = new ArrayList<>();
        //generate 1 queue less than before
        for (int i = 0; i < queueList.size()-1; i++){
            newQueue.add(new Queue(new ArrayList<>()));
        }

        for (int i = 0; i < Math.pow(newQueue.size(),2); i++){
            int queueNumber = (int) (Math.random() * queueList.size());
            int newQueueNumber = (int) (Math.random() * newQueue.size());

            if(queueList.get(queueNumber).size() > 0 && newQueue.get(newQueueNumber).size() <= newQueue.size()-1){
                //save duck number that is to be removed
                int duckNumberToBeAdded = queueList.get(queueNumber).getQueue().get(0).getNumber();
                queueList.get(queueNumber).removeFront();
                newQueue.get(newQueueNumber).addEnd(duckNumberToBeAdded);
            }
            else{
                i = i-1;
            }
        }
        return newQueue;
    }

    //run entire game
    public static void runGame(List<Queue> queueList){
        List<Queue> newQueueList = new ArrayList<>();
        for (int i = 0; i < queueList.size()-1; i++) {
            List<Queue> tempQueue = new ArrayList<>();

            if (i == 0){
                tempQueue = runIteration(queueList);
            }
            else{
                tempQueue = runIteration(newQueueList);
            }
            printQueueList(tempQueue);
            newQueueList = tempQueue;
        }
        System.out.println("Winner duck is: " +  newQueueList.get(0).getQueue().get(0).getNumber());
    }



    //print queue of ducks
    public static void printQueueList(List<Queue> list){
        int i = 0;
        int j = 0;
        for (Queue queue : list) {
            System.out.println("Queue number: " + i);
            System.out.println("Queue size: " + queue.getQueue().size());
            for (Duck duck : queue.getQueue()){
                System.out.println(j + " Duck number: " + duck.getNumber());
                j++;
            }
            i++;
        }
    }
}

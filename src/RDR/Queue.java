package RDR;

import java.util.ArrayList;

public class Queue {
    private ArrayList<Duck> queue = new ArrayList<>();

    //get size
    public int size(){
        return queue.size();
    }

    //addEnd
    public void addEnd(int n){
        queue.add(new Duck(n));
    }

    //removeFront
    public void removeFront(){
        queue.remove(0);
    }

    public ArrayList<Duck> getQueue() {
        return queue;
    }

    public void setQueue(ArrayList<Duck> queue) {
        this.queue = queue;
    }

    public Queue(ArrayList<Duck> queue) {
        this.queue = queue;
    }
}

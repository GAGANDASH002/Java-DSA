package queue;

import java.util.LinkedList;
import java.util.Queue;

class queue{
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();//Queue is an interface implemented by class Linkedlist or ArrayDeque
        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}



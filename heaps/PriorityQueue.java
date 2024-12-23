import java.util.*;

class Main{
    public static void main(String[] args) {
        // Lower the Integer higher the priority
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // Reverses the order of priority to higher Integer having higher priority
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());


        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
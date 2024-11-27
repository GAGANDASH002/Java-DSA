import java.util.*;

class Solution{
    static class Queue{
        Deque<Integer> deque = new LinkedList<>();

        public void enqueue(int data){
            deque.addLast(data);
        }

        public int dequeue(){
            return deque.removeFirst();
        }

        public int peek(){
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println(q.peek());
        q.dequeue();
        System.out.println(q.peek());
    }
}

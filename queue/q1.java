package queue;

import java.util.Stack;

//implement a queue using 2 stacks

class queue{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    boolean isEmpty(){
        return s1.isEmpty();
    }

    void add(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());//pop all elements from s1 and push into s2
        }

        s1.push(data);//push element into s1

        while(!s2.isEmpty()){
            s1.push(s2.pop());//pop all pushed elements from s2 and push again in s1
        }
    }

    int remove(){
        if(s1.isEmpty()){
            System.out.println("queue is empty");
        }

        return s1.pop();
    }

    int peek(){
        if(s1.isEmpty()){
            System.out.println("queue is empty");
        }

        return s1.peek();
    }

    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
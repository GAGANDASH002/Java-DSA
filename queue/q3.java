package queue;

import java.util.*;

// implementing stack using 2 queues

class Stack{
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();


    // check if either of the queues is empty
    boolean isEmpty(){
        return q1.isEmpty() && q2.isEmpty();
    }

    // push values 

    void push(int data){
        if(!q1.isEmpty()){
            q1.add(data);
        }else{
            q2.add(data);
        }
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Empty Stack");
            return -1;
        }
        int top = -1; 

        // if q1 is not Empty
        if(!q1.isEmpty()){
            // while q1 is not empty , remove the front element 
            while(!q1.isEmpty()){
                top = q1.remove();
                // if q1 is empty then return top element , else push into q2
                if(q1.isEmpty()){
                    break;
                }
                q2.add(top);
            }
        }else{
            // while q2 is not empty , remove the front element 
            while(!q2.isEmpty()){
                top = q2.remove();
                // if q2 is empty then return top element , else push into q1
                if(q2.isEmpty()){
                    break;
                }
                q1.add(top);
        }
    }
        return top;
    }

    // same as pop() but no need of checking for empty queue after each removal
    int peek(){
        if(isEmpty()){
            System.out.println("Empty Stack");
            return -1;
        }
        int top = -1;

        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top = q1.remove();
                q2.add(top);
            }
        }else{
            while(!q2.isEmpty()){
                top = q2.remove();
                q1.add(top);
        }
        }
        return top;
    }


public static void main(String[] args) {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);

    while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
    }
}
}
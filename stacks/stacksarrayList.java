package stacks;

//stack implementation using ArrayList

import java.util.ArrayList;

class stack{
    ArrayList<Integer> list= new ArrayList<>();
    boolean isempty(){
        return list.size()==0;
    }

    void push(int data){
        list.add(data);
    }

    int pop(){
        if(isempty()){
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    int peek(){
        if(isempty()){
            return -1;
        }
        int top = list.get(list.size()-1);
        return top;

    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isempty()) {
            System.out.println("element at top is" + s.peek());
            s.pop();
        }
    }
}

package stacks;

//push at bottom of stack


import java.util.Stack;
class stack{
    static void pushatbottom(int data,Stack<Integer>s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top =s.pop();
        pushatbottom(data, s);
        s.push(top);
    }
public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);

    pushatbottom(4,s);
    while (!s.isEmpty()) {
        System.out.println("element at top is" + s.peek());
        s.pop();
    }
}
}

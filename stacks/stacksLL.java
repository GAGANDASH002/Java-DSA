//stack using linkedlist

package stacks;

class stack {

    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public node head;

    boolean isempty() {
        return head == null;
    }

    void push(int data) {
        node newnode = new node(data);
        if (isempty()) {
            head = newnode;
        }

        else{
        newnode.next = head;
        head = newnode;
        }
    }

    int pop() {
        if (isempty()) {
            System.out.println("stack empty");
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    int peek() {
        if (isempty()) {
            System.out.println("stack empty");
            return -1;
        }
        int top = head.data;
        return top;
    }
}

class stack_demo {
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
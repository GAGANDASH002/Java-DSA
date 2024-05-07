package queue;

class queue{
    class node{
        int data;
        node next;

        node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static node head=null;
    static node tail=null;
    
    boolean isEmpty(){
        if(head==null && tail==null){
            return true;
        }
        return false;
    }

    //enqueue
    void enqueue(int data){
        node newnode= new node(data);
        if(head==null){
            head=tail=newnode;
        }
        else{
        tail.next=newnode;
        tail=newnode;
    }
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue empty");
            return -1;
        }

        int front=head.data;
        if(tail==head){
            tail=head=null;
        }
        else{
            head=head.next;
        }
        return front;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Queue empty");
            return -1;
        } 
        else{
            return head.data;
        }
    }
}

class demo{
    public static void main(String[] args) {
        queue q= new queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        q.enqueue(6);
        while(!q.isEmpty()){
            System.out.print(q.peek()+"->");
            q.dequeue();
        }
    
    }
}

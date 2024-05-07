package queue;

class queue{
    int arr[];
    int size;
    int rear;

    queue(int n){
        arr = new int[n];
        size=n;
        rear=-1;
    }

    boolean isEmpty(){
        if(rear == -1){
            return true;
        }
        return false;
    }

    void enqueue(int data){
        if(rear == size-1){
            System.out.println("Queue is full");
        }

        rear=rear+1;
        arr[rear]=data;
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue empty");
            return -1;
        }

        int front = arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return front;
    
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Queue empty");
            return -1;
        }

        return arr[0];
    }
}

class demo{
    public static void main(String[] args) {
        queue q = new queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        q.enqueue(6);//queue is full
        
        System.out.println("dequeued element is"+q.dequeue());
        System.out.println("dequeued element is"+q.dequeue());

        System.out.println("element at front is"+q.peek());
    }
}

//implementing circular queue using array


package queue;

class queue{
    int arr[];
    int size;
    int rear;
    int front;

    queue(int n){
        arr = new int[n];
        size=n;
        rear=-1;
        front=-1;
    }

    boolean isEmpty(){
        if(rear == -1 && front==-1){
            return true;
        }
        return false;
    }

    boolean isFull(){
        if((rear+1)%size == front){
            return true;
        }
        return false;
    }

    void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
        }
        
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=data;
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue empty");
        }

        int result=arr[front];
        //last element to be deleted
        if(rear==front){
            rear=front=-1;
        }
        else{
            front=(front+1)%size;
        }
        return result;
    
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Queue empty");
        }

        return arr[front];
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

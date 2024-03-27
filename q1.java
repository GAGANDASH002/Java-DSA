class ll{
    node head;
    class node{
        int data;
        node next;

        node(int p){
            data=p;
            next=null;
        }
    }

    public void addlast(int data){
        node newnode= new node(data);
        if(head==null){
            head=newnode;
        }

        node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newnode;
    }

    public void printLL(){
        node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        ll list = new ll();
        list.addlast(1);
        list.addlast(5);
        list.addlast(7); 
        list.addlast(3);
        list.addlast(8);
        list.addlast(2);
        list.addlast(3);
        list.printLL();
    }
}

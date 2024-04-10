package linkedlist;
//Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.

class linkedlist{
    node head;
    class node{
        int data;
        node next;

        node(int data){
            this.data=data;
            this.next=null;
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
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
    }

    public void delete(){
        if(head==null){
            System.out.println("List empty,nothing to delete");

        }
        head=head.next;
    }
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        for(int i=1;i<=50;i++){
            list.addlast(i);
        }
        list.printLL();
        for(int j=26;j<=50;j++){
            list.delete();
        }
        list.printLL();
    }
    }

    
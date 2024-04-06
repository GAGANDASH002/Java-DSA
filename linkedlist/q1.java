
//Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.

import java.util.LinkedList;

class LL{
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
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
    }

    public void search(int data){
        int i =0;
        node curr= head;
        while(curr!=null){
            if(curr.data==data){
                System.out.println(data+"found at"+i);
                return;
            }
            curr=curr.next;
            i++;
        }
        System.out.println(data+"not found");
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addlast(1);
        list.addlast(5);
        list.addlast(7); 
        list.addlast(3);
        list.addlast(8);
        list.addlast(2);
        list.addlast(3);
        list.printLL();
        list.search(7);
    }
}

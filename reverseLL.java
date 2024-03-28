class LL{
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

    public void reverseIterate(){
        if(head==null || head.next==null){
            return;
        }
        node prev = null;
        node curr = head;
        node next=null;
        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }

        head=prev;
    }

    /*public node reverseRecursive(node head){
        if(head==null||head.next==null ){
            return head;
        }
        node newhead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }*/
    public static void main(String[] args) {
        LL list = new LL();
        list.addlast(1);
        list.addlast(2);
        list.addlast(3); 
        list.addlast(4);
        list.addlast(5);
        list.addlast(6);
        list.addlast(7);
        list.printLL();//original linkedlist
        list.reverseIterate();
        //list.head=list.reverseRecursive(list.headlist)
        list.printLL();//reversed linkedlist
    }
}
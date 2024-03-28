//find nth node from end of linklist and delete it

class LLnode {
    LLnode head;
    int data;
    LLnode next;

    LLnode(int p) {
        data = p;
        next = null;
    }
    
}

class sol{
    
    public LLnode removeNthfromend(LLnode head,int n){
        if(head.next==null){//if only one node in list
            return null;
        }
        int size=0;
        LLnode curr=head;
        while(curr!=null){
            curr=curr.next;
            size++;
        }

        if(n==size){
            return head.next;
        }
        int index=size-n;
        LLnode prev=head;
        int i=0;
        while(i<index){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;

    }
}
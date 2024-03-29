//detect loop in a linkedlist

//check if a linkedlist is palindrome or not

class LL {
    node head;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

/*Floyd's algorithm
There is a pointer hare and another turtle 
turtle moves one step whereas turtle moves two steps.
Hence if there is a loop in the linkedlist then there
will be a point where both hare and turtle will intersect.
*/

    public void addlast(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
        }

        node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newnode;
    }

    public boolean checkLoop(node head){
        if(head==null){
            return false;
        }
        node hare = head;
        node turtle = head;
        while(hare!=null && hare.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
            if(hare==turtle){
                return true;
            }
        }
        return false;
        }
    

    public void removeLoop(node head){
        if(head==null || head.next==null){
            return;
        }
        node hare = head;
        node turtle = head;
        boolean loopexists=false;
        
        while(hare!=null && hare.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
            if(hare==turtle){
                loopexists = true;
                break;
            }
        }

        //if loop exists find starting point of loop
        if(loopexists){
            turtle=head;
            while(turtle!=hare){
                turtle=turtle.next;
                hare=hare.next;
            }

            // move turtle to node just before start of loop

            while(hare.next!=turtle){
                hare=hare.next;
            }
            
            //break loop
            hare.next=null;
        }
    }
}

class sol{
    public static void main(String[] args) {
        LL list = new LL();
        list.addlast(1);
        list.addlast(2);
        list.addlast(2);
        list.addlast(1);
        System.out.println("is loop"+list.checkLoop(list.head));
    }
}
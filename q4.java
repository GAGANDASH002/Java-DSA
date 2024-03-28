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
    
    /*
     * steps:
     * 1. find middle of LL
     * 2. reverse 2nd half
     * 3. check 1st and 2nd half
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

    public node reverse(node head) {
        node prev = null;
        node curr = head;
        node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public node findmiddle(node head) {
        node hare = head;
        node turtle = head;
        while (hare.next.next != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;

    }

    public boolean isPalindrome(node head) {
        if (head == null || head.next == null) {
            return true;
        }

        node middle = findmiddle(head);// end of 1st half
        node secondstart = reverse(middle.next);

        node firststart = head;
        while (secondstart != null) {
            if (firststart.data != secondstart.data) {
                return false;
            }
            firststart = firststart.next;
            secondstart = secondstart.next;
        }
        return true;
    }
}

class sol{
    public static void main(String[] args) {
        LL list = new LL();
        list.addlast(1);
        list.addlast(2);
        list.addlast(2);
        list.addlast(1);
        System.out.println("is palindrome"+list.isPalindrome(list.head));
    }
}
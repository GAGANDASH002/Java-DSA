
class singleLL{
    node head;
    int size;
    singleLL(){
        size=0;
    }
    class node{
        String data;
        node next;

        node(String s){
            data=s;
            next=null;
            size++;
        }
    }


//add -first,last
public void addfirst(String data){
    node newnode = new node(data);
    if(head==null){
        head=newnode;
    }

    newnode.next=head;
    head=newnode;
}

public void addlast(String data){
    node current=head;
    node newnode= new node(data);
    if(head==null){
        head=newnode;
    }
    while(current.next!=null){
        current=current.next;
    }
    current.next=newnode;
}

//print
public void printlist(){
    if(head==null){
        System.out.println("List is empty");
    }
    node current=head;
    while(current!=null){
        System.out.print(current.data+"->");
        current=current.next;
    }
    
}

//delete a node
public void deletefirst(){
    if(head==null){
        System.out.println("List is empty,nothing to delete");
    }
    size--;
    head=head.next;//Java doesnt need memory deallocation,it automatically frees garbage values
}

public void deletelast(){
    if(head==null){
        System.out.println("List is empty,nothing to delete");
    }
    node secondlast=head;
    node last=head.next;
    size--;
    if(head.next==null){
        head=null;
    }

    while(last.next!=null){
        last=last.next;
        secondlast=secondlast.next;
    }

    secondlast.next=null;
}

public int getsize(){
    return size;
}
public static void main(String[] args) {
    singleLL list = new singleLL();
    list.addfirst("hello");
    list.addlast("this");
    list.addlast("is");
    list.addlast("python");
    list.printlist();

    list.deletefirst();
    list.printlist();
    list.deletelast();
    list.printlist();
    System.out.println(list.getsize());
}
}

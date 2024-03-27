//single linkedlist representation using collection frameworks 
import java.util.LinkedList;
class LL{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("Hi");
        list.addFirst("this");
        System.out.println(list);
        list.addFirst("is");
        list.addLast("Python");//can also be written as add() as it adds at end default
        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");//get function returns value of that node
        }

        list.removeFirst();
        list.removeLast();

        list.remove(1);//deletes value at index 1
        System.out.println(list);
    }
}
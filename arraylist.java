//Array can store both primitive datatypes and objects
//ArrayList can store only objects

import java.util.ArrayList;
import java.util.Collections;

class ArrayLists{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();//creation of integer arraylist
        //ArrayList<String> list2 = new ArrayList<String>();

        //add elements
        list.add(0);
        list.add(1);
        list.add(3);
        System.out.println(list);
        
        //get elements
        int ele=list.get(0);//specifies index to be obtained
        System.out.println(ele);

        //add element in between
        list.add(1,5);//adds at specified index
        System.out.println(list);

        //set element
        list.set(0,5);//sets value at 0 as 5
        System.out.println(list);

        //delete element
        list.remove(3);//removes value at index 3
        System.out.println(list);

        System.out.println("Size of arraylist is "+list.size());

        //loops
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //sorting
        Collections.sort(list);//predefined sort of collection framework
        System.out.println(list);
    }
}
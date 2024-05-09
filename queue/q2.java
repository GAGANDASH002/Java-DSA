package queue;

import java.util.*;

//first non repeating letter in a stream of charachters

class queue{
    static void printNonRepeating(String str){
        int freq[]= new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            q.add(ch);//adding character to queue
            freq[ch - 'a']++;//increase frequency of added char

            while(!q.isEmpty()&& freq[q.peek()-'a']>1)//removes element from queue with frequency>1
            {
                q.remove();
            }

            if(q.isEmpty()){//if after removal queue is empty then no 1st non repeating char
                System.out.println(-1+" ");
            }
            else{//else print 1st non repeating char
                System.out.println(q.peek()+" ");
            }
        }
    }
    public static void main(String[] args) {
        String str = "aabccxb"; 
        printNonRepeating(str); 
    }
}
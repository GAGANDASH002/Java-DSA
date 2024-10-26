// Question: Find out first non repeating character from a stream of characters.
package queue;

import java.util.*;

public class q4{

    public static void printNonRepeating(String str){
        int freq[] = new int[26]; // 'a' - 'z'
        Queue<Character> q = new LinkedList<>();

        for(int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            // Remove element if freq of char is greater than 1 i.e the char is repeating.
            while(!q.isEmpty() && freq[q.peek()-'a'] > 1){
                q.remove();
            }

            // no non repeating char exists
            if(q.isEmpty()){
                System.out.println(-1+" ");
            }
            // char at front of queue is first non repeating character
            else{
                System.out.println(q.peek()+" ");
            }
        }
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}
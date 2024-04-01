package stacks;

//duplicate parentheses given valid parentheses string
import java.util.*;

class stack{
    public static boolean isvalid(String str) {
        Stack<Character> s = new Stack<>();
    
        for(int i =0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch == '{' || ch=='['){
                s.push(ch);  
            }
            else{
                if(s.isEmpty()){
                    return false;
                } 
                if((s.peek()=='(' && ch==')')||(s.peek()=='{' && ch=='}')||(s.peek()=='[' && ch==']')){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isduplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i =0;i<str.length();i++){
            char ch=str.charAt(i);
            //closing
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){ 
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;//duplicate exists;
                }
                else{
                    s.pop();//opening pair popped
                }
            }
            else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="((a+b))";//true as duplicate parentheses exists
        String str2="(a-b)";//false as no duplicate parentheses
        System.out.println(isduplicate(str));
        System.out.println(isduplicate(str2));
    }
}
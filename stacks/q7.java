
/*max area in histogram: given an array of integers heights representing
  the histogram's bar height where the width of each bar is 1, return area of
  largest rectangle in histogram
 */
package stacks;

import java.util.*;

class q7{
static void area(int arr[]){
    int maxArea=0;
    int nsr[]= new int[arr.length];
    int nsl[]= new int[arr.length];

    //next smaller right
    Stack<Integer> s = new Stack<>();

    //Next Smaller right
    for(int i=arr.length-1 ;i>=0;i--){
        while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            nsr[i]=arr.length;
        }
        else{
           nsr[i]=s.peek(); 
        }
        s.push(i);
    }
    //Next Smaller Left
    s= new Stack<>();
    for(int i=0; i<arr.length ;i++){
        while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            nsl[i]=-1;        }
        else{
           nsl[i]=s.peek(); 
        }
        s.push(i);
    }

    //Current are : wodth =j-i-1 = nsr[i]-nsl[i]-1
    for(int i=0; i<arr.length; i++){
        int height=arr[i];
        int width=nsr[i]-nsl[i]-1;
        int currArea= height*width;
        maxArea= Math.max(currArea,maxArea);
    }

    System.out.println("maximum area in histogram is " +maxArea);
}   
public static void main(String x[]){
    int arr[]={2,1,5,6,2,3};//heights in histogram
    q7 stack = new q7();
    stack.area(arr);
}
}
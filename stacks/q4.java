package stacks;

//next greater element in right

import java.util.Stack;

class classroom{
    public static void main(String[] args) {
        int arr[]={6,8,0,1};
        Stack<Integer> s= new Stack<>();
        int nxtgrt[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            //1 while
            while(!s.isEmpty() && arr[s.peek()] <=arr[i]){
                s.pop();
            }

            //2 if else
            if(s.isEmpty()){
                nxtgrt[i]=i-1;
            }
            else{
                nxtgrt[i]=arr[s.peek()];
            }

            //3 push in s
            s.push(i);
        }
    

    for(int i=0;i<nxtgrt.length;i++)
    {
        System.out.println(nxtgrt[i]+"");
    }
}
}

//next greater left
//next smaller right
//next smallert left

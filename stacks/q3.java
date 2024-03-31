package stacks;

//stock span problem
//span: max number of consecutive days for which price<=today's price
//span=i-prevHigh

import java.util.Stack;

class stack{
    public static void stockSpan(int stocks[],int span[]){
        Stack<Integer> s=new Stack<Integer>();
        span[0]=1;//span for first stock will always be 1
        s.push(0);//pushing index of spans into stack

        for(int i =0;i<stocks.length;i++){
            int currPrice=stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]){
                s.pop();//rempving all previous smaller elements from stack
            }
            if(s.isEmpty()){
                span[i]=i+1;//returns to previous statement at line 12
            }
            else{
                int prevHigh = s.peek();//retrieves previous highest element as all smaller elements are popped
                span[i]= i - prevHigh;//using span formula
        }
            s.push(i);//pushing current index to stack
    }
}
    public static void main(String[] args) {
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];//creates an array of same size as stocks
        stockSpan(stocks,span);

        for(int i =0;i<span.length;i++){
            System.out.println(span[i]+"");
        }
        
    }
}
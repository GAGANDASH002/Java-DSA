class Solution{
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void changeArr(int arr[], int index, int val){
        // base case
        if(index == arr.length){
            printArr(arr);
            return;
        }

        // recursion
        arr[index] = val;
        changeArr(arr, index+1, val+1);// function call
        arr[index] = arr[index] - 2;// backtracking step
        
        // Backtracking step always occurs after the function call and not before it.
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}

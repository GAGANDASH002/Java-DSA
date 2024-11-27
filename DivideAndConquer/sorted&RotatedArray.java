// Question : A sorted array has been rotated around a pivot element and we have to find the index of the target value

class DivideAndConqueor{
    public static int search(int arr[], int tar, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = start + (end - start)/2;

        if(arr[mid] == tar){
            return mid;
        }

        // if mid on Line 1
        if(arr[start] <= arr[mid]){
            // case a : Search on left
            if(arr[start] <= tar && tar <= arr[mid]){
                return search(arr, tar, start, mid-1);
            } else {
                // case b : Search on right
                return search(arr, tar, mid+1, end);
            }
        // if mid on Line 2
        } else {
            // case c : Search on right 
            if(arr[mid] <= tar && tar <= arr[end]){
                return search(arr, tar, mid+1, end);
            } else{
                // case d : Search on left
                return search(arr, tar, start, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0; // Output -> Index = 4
        System.out.println(search(arr, target, 0, arr.length -1));
    }
}
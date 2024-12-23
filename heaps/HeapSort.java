// Ascending Order: Create Max Heap
// Descending Order: Create Min Heap

class Main{

    public static void heapify(int arr[], int i, int size){
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        int maxIdx = i;

        if(left < size && arr[left] > arr[maxIdx]){
            maxIdx = left;
        }

        if(right < size && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }

        if(maxIdx != i){
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size);
        }
    }

    public static void heapSort(int arr[]){
        // step 1 - build maxHeap
        int n = arr.length;
        // Call heapify for non leaf nodes
        for(int i = n/2; i>=0; i--){
            heapify(arr, i, n); 
        }

        // step 2 - push largest at end
        for(int i = n-1; i>0; i--){
            //swap largest(first index) with last index
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // remove last element from heap and heapify remaining heap
            heapify(arr, 0, i);
        } 
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 3};
        heapSort(arr);

        for(int i = 0; i<arr.length; i++){
            System.err.print(arr[i] + " ");
        }
    }
}
import java.util.ArrayList;
// Removal of minimum element in a Min Heap
class Main{
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            // add at last index
            arr.add(data);
            
            int x = arr.size()-1; // x is child index
            int par = (x - 1)/2; // parent index

            while(arr.get(x) < arr.get(par)){
                // swap if child is smaller than parent
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }
        
        public int peek(){
            return arr.get(0);
        }

        private void heapify(int index){
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int minIndex = index;
            
            if(left < arr.size() && arr.get(minIndex) > arr.get(left)){
                minIndex = left;
            }

            if(right < arr.size() && arr.get(minIndex) > arr.get(right)){
                minIndex = right;
            }

            if(minIndex != index){
                // swap 
                int temp = arr.get(index);
                arr.set(index, arr.get(minIndex));
                arr.set(minIndex, temp);

                heapify(minIndex);
            }
        }

        public int remove(){
            int data = arr.get(0);

            // step 1 - swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step 2 - delete last
            arr.remove(arr.size() - 1);

            // step 3 - heapify
            heapify(0);
            return data; 
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }

}
import java.util.ArrayList;
// Insertion in a Min Heap
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
            }
        }
    }

    public static void main(String[] args) {
        
    }

}
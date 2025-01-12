import java.util.HashSet;

class Main{
    public static int countElements(int arr[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }

        return set.size();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5,5,6,7,8,8};
        System.out.println(countElements(arr));
    }
}
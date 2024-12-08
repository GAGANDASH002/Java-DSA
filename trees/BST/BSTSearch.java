class Main{
    static class Node{
        int data;
        Node left;
        Node right;
        
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    public static boolean BSTSearch(Node root, int key){ // O(H)
        if(root == null) return false;
        if(root.data == key){
            return true;
        }

        if(root.data > key){
            return BSTSearch(root.left, key);
        }

        if(root.data < key){
            return BSTSearch(root.right, key);
        }
        
        return false;
    }
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(6);

        System.out.println(BSTSearch(root, 0));
    }    
}
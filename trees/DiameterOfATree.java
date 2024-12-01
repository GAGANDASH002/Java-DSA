// Diameter of a tree = number of nodes in longest path between two leaf nodes
class Main{
    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info{
        int diam;
        int ht;
        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static int height(Node root){
        // base case
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int countNodes(Node root){
        if(root == null) return 0;
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        return leftCount+rightCount+1;
    }

    // Sum of all nodes in a tree;
    public static int sum(Node root){
        if(root == null) return 0;
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    }

    public static int diameter2(Node root){
        if(root == null){
            return 0;
        }

        // Calculate diameter and height of left subtree
        int leftDiameter = diameter2(root.left);
        int leftHeight = height(root.left);
        // Calculate diameter and height of right subtree
        int rightDiameter = diameter2(root.right);
        int rightHeight = height(root.right);

        // If diameter of tree passes through root node
        int selfDiameter = leftHeight+rightHeight+1;

        // return maximum between two cases:
        // 1. Diameter passes through root node
        // 2. Diameter is in left or right subtree
        return Math.max(selfDiameter, Math.max(rightDiameter, leftDiameter));

    }

    public static Info diameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;

        return new Info(diam, ht);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameter(root).diam);
    }
}
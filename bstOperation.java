import java.util.*;
class solution {

    class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }

    }

    Node root;
    solution() { root = null;}

    public void insert(int data) {
        root = inserthelp(root, data);
    } 

    Node inserthelp(Node temp, int data) {
        if(temp == null) temp = new Node(data);
        else if(data > temp.data) temp.right = inserthelp(temp.right, data);
        else if(data < temp.data) temp.left = inserthelp(temp.left, data);
        return temp;
    }
 
    public int searchIndex(int data) {
        if(root == null) return 0;
        int index = 1;
        Node temp = root;
        index = helper(temp, index, data);
        return index;
    }

    int helper(Node temp, int index, int data) {
        if(temp == null) return 0;
        if(root.data == data) return index;
        else if(data > temp.data) index = helper(temp.right, index*2, data);
        else if(data < root.data) index = helper(temp.left, ((index*2)+1), data);
        return index;
    }
    
    public static void main(String args[]) {
        solution bst = new solution();
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
        int data = sc.nextInt();
        bst.insert(data);
        int index = bst.searchIndex(data);
        System.out.println(index);}
    }
}
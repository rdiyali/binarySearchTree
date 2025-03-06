package bts;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
}

public class binarySearchTree {

    Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    public Node insertRec(Node root, int data){
        if(root==null) {
            root = new Node(data);
        } else if(root.data >data){
            root.left = insertRec(root.left, data);
        } else if(root.data < data){
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public void inOrder(){
        System.out.print("Inorder: ");
        inOrderRec(root);
    }

    public void inOrderRec(Node root){
        if(root!=null){
            inOrderRec(root.left);
            System.out.print(root.data + ",");
            inOrderRec(root.right);
        }
    }

    public void preOrder(){
        System.out.print(" Preorder: ");
        preOrderRec(root);
    }

    public void preOrderRec(Node root){
        if(root!=null){
            System.out.print(root.data + ",");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public void postOrder(){
        System.out.print(" Postorder: ");
        postOrderRec(root);
    }
    public void postOrderRec(Node root){
        if(root!=null){
            preOrderRec(root.left);
            preOrderRec(root.right);
            System.out.print(root.data + ",");
        }
    }

    public void search(int target){
        System.out.print("Target: ");
        searchRec(root, target);
    }
    public void searchRec(Node root, int target) {
        if(root!=null){
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while(!queue.isEmpty()) {
                Node current = queue.poll();

                if(current.data == target) {
                    System.out.println("found " + root.data);
                    break;
                }

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
        System.out.println("not found/doesn't exist");
    }

}

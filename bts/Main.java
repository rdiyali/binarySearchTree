package bts;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        binarySearchTree tree = new binarySearchTree();

        Random rand = new Random();
        int random = rand.nextInt(100);
        //tree.insert(10);
        for(int x=0; x<10; x++){
            tree.insert(random);
            random = rand.nextInt(100);
        }

        tree.search(10);
        tree.inOrder();
        tree.preOrder();
        tree.postOrder();


    }
}

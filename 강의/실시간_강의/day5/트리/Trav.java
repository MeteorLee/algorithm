package 실시간_강의.day5.트리;

class Node{

    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }

}

public class Trav {

    Node root;

    Trav() {
        root = null;
    }

    public static void main(String[] args) {
        Trav tree = new Trav();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println(
                "\nInorder traversal of binary tree is ");
        tree.printInorder(tree.root);

        System.out.println(
                "\nPreorder traversal of binary tree is ");
        tree.printPreorder(tree.root);

        System.out.println(
                "\nPostorder traversal of binary tree is ");
        tree.printPostorder(tree.root);

    }

    private void printInorder(Node node) {

        if (node == null) {
            return;
        }

        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }
    private void printPreorder(Node node) {

        if (node == null) {
            return;
        }

        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
    private void printPostorder(Node node) {

        if (node == null) {
            return;
        }

        printPostorder(node.left);

        printPostorder(node.right);

        System.out.print(node.key + " ");
    }
}

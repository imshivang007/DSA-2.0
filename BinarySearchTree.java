public class BinarySearchTree {

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static boolean search(Node root, int key) {  //O(h)
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        return key < root.data ? search(root.left, key) : search(root.right, key);
    }

    //Deleteion of a node in BST
    //Case 1: No child (leaf node)
    //Case 2: One child
    //Case 3: Two children

    public static Node delete(Node root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // Node with no child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Node with one child
            if (root.left == null){
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            // Delete the inorder successor
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    //print in range
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.right, k1, k2);
        } else {
            printInRange(root.left, k1, k2);
        }
    }

    //Root to leaf paths
    public static void printRootToLeafPaths(Node root, String path) {
        if (root == null) {
            return;
        }
        path += root.data + "  ";
        if (root.left == null && root.right == null) {  
            System.out.println(path);
            return;
        }
        
        printRootToLeafPaths(root.left, path);
        printRootToLeafPaths(root.right, path);
    }



    public static void main(String [] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for (int val : values) {
            root = insert(root, val);
        }
        inorder(root);

        int key = 6;
        if (search(root, key)) {
            System.out.println("\nFound " + key + " in the BST");
        } else {
            System.out.println("\n" + key + " not found in the BST");
        }
        
        root = delete(root, 3);
        System.out.println("Inorder traversal after deletion:");
        inorder(root);

        System.out.println("\nPrint values in range [2,5]:");
        printInRange(root, 2, 5);

        System.out.println("\nRoot to leaf paths:");
        printRootToLeafPaths(root, "");


    }
}

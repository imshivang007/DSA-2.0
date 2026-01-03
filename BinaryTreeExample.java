import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeExample {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class TreeInfo{
        int diameter;
        int height;
        TreeInfo(int diameter, int height){
            this.diameter = diameter;
            this.height = height;
        }
    }
    

    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            // System.out.println("Created node with data: " + newNode.data);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preOrder(Node root){
            if(root == null){
                // System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root){
            if(root == null){
                // System.out.print(-1 + " ");
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static void postOrder(Node root){
            if(root == null){
                // System.out.print(-1 + " ");
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static int countNodes(Node root){
            if(root == null){
                return 0;
            }
            int leftCount = countNodes(root.left);
            int rightCount = countNodes(root.right);
            return leftCount + rightCount + 1;
        }

        public static int sumNodes(Node root){
            if(root == null){
                return 0;
            }
            int leftSum = sumNodes(root.left);
            int rightSum = sumNodes(root.right);
            return leftSum + rightSum + root.data;
        }

        public static int height(Node root){
            if(root == null){
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }

        //Diameter of Binary Tree - O(n^2)
        public static int diameter(Node root){
            if(root == null){
                return 0;
            }
            int leftDiameter = diameter(root.left);
            int rightDiameter = diameter(root.right);
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            int selfDiameter = leftHeight + rightHeight + 1;
            return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
        }

        //Diameter of Binary Tree - O(n)
        
    
        public static TreeInfo diameterFast(Node root){
            if(root == null){
                return new TreeInfo(0,0);
            }
            TreeInfo left = diameterFast(root.left);
            TreeInfo right = diameterFast(root.right);
            int selfDiameter = left.height + right.height + 1;
            int selfHeight = Math.max(left.height, right.height) + 1;
            return new TreeInfo(selfDiameter, selfHeight);
        }        
    }

    public static void main(String[] args) {
        int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println("Preorder Traversal of Binary Tree:");
        tree.preOrder(root);
        System.out.println("\nInorder Traversal of Binary Tree:");
        tree.inOrder(root);
        System.out.println("\nPostorder Traversal of Binary Tree:");
        tree.postOrder(root);
        System.out.println("\nLevel Order Traversal of Binary Tree:");
        tree.levelOrder(root);
        int totalNodes = tree.countNodes(root);
        System.out.println("Total number of nodes in the Binary Tree: " + totalNodes);
        int totalSum = tree.sumNodes(root);
        System.out.println("Sum of all nodes in the Binary Tree: " + totalSum);
        int height = tree.height(root);
        System.out.println("Height of the Binary Tree: " + height);
        int diameter = tree.diameter(root);
        System.out.println("Diameter of the Binary Tree (O(n^2)): " + diameter);
        TreeInfo treeInfo = tree.diameterFast(root);
        System.out.println("Diameter of the Binary Tree (O(n)): " + treeInfo.diameter);
    }
    
}

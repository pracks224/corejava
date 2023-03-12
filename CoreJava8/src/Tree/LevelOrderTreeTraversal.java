package Tree;

/*
    4
    /\
   5  8
   /\  /\
 7  9  10 11

 So the level order would be -> 4 5,8,7,9,10,11
 */

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTreeTraversal {
    TreeNode root;

    public static void main(String[] args) {
        LevelOrderTreeTraversal tree = new LevelOrderTreeTraversal();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);
        //Check this tree is symmetric or not
        tree.printLevelOrder(tree.root);

    }

    public void printLevelOrder(TreeNode node) {
        Queue<TreeNode> qe = new LinkedList<>();
        qe.add(root);
        qe.add(null);
        while (!qe.isEmpty()) {
            TreeNode n1 = qe.poll();
            if (n1 == null) {
                if (qe.isEmpty()) {
                    return;
                }
                qe.add(null);
                System.out.println("******");
                continue;
            }
            System.out.print(n1.val +" ");
            if (n1.left != null)
                qe.add(n1.left);
            if (n1.right != null)
                qe.add(n1.right);

        }

    }

}

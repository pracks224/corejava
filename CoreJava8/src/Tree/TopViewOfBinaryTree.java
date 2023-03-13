package Tree;

import java.util.*;

public class TopViewOfBinaryTree {
    TreeNode root;

    public static void main(String[] args) {
        TopViewOfBinaryTree tree = new TopViewOfBinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);
        //Check this tree is symmetric or not
       ArrayList<Integer> ls =  tree.printTopView(tree.root);
       System.out.println(ls);
    }

    public ArrayList<Integer> printTopView(TreeNode root) {
        Queue<Pair> queue = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();
        queue.add(new Pair(0, root));
        while (!queue.isEmpty()) {
            Pair curr = queue.poll();
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node.val);
            }

            if (curr.node.left != null)
                queue.add(new Pair(curr.hd - 1, curr.node.left));
            if (curr.node.right != null)
                queue.add(new Pair(curr.hd + 1, curr.node.right));
        }
        ArrayList<Integer> ls = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ls.add(entry.getValue());

        }

        return ls;
    }

    static class Pair {
        int hd;//Horizontal Distance
        TreeNode node;

        Pair(int hd, TreeNode node) {
            this.hd = hd;
            this.node = node;
        }
    }
}

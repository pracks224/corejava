package Tree;

public class SymmetricBinaryTree {
    TreeNode root;

    public static void main(String[] args) {
        SymmetricBinaryTree tree = new SymmetricBinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(2);
        tree.root.left.left = new TreeNode(3);
        tree.root.left.right = new TreeNode(4);
        tree.root.right.left = new TreeNode(4);
        tree.root.right.right = new TreeNode(5);

        //Check this tree is symmetric or not
        System.out.println("Is Symmetric::"+tree.isSymmetric(tree.root));
    }

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode node1,TreeNode node2){
        //Base Case
        if(node1 == null && node2 == null)
            return true;
        if(node1 !=null && node2 != null && node1.val == node2.val)
            return isMirror(node1.left,node2.right) && isMirror(node1.right,node2.left);
        return false;
    }
}

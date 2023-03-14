package Tree;

public class SumOfRootToLeaf {
    public static void main(String[] args) {

    }
    public int sumNumbers(TreeNode root) {
        return sumRootToLeaf(root,0);
    }

    public int sumRootToLeaf(TreeNode root,int val){
        if(root == null) return 0;
        // Update val
        val = (val * 10 + root.val);
        if(root.left == null && root.right == null)
            return val;
        return sumRootToLeaf(root.left,val) + sumRootToLeaf(root.right,val);
    }
}

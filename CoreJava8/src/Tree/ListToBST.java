package Tree;

public class ListToBST {
    public static void main(String[] args) {
        int[] head = {-4, -2, -1, 0, 1, 2, 4};
        int left = 0, right = head.length;
    }

    public TreeNode sortedListToBST(int[] head, int left, int right) {
        if (left > right) return null;
        int midIndex = left + (right - left) / 2;
        TreeNode root = new TreeNode();
        root.val = head[midIndex];
        root.left = sortedListToBST(head, left, midIndex - 1);
        root.right = sortedListToBST(head, midIndex + 1, right);
        return root;
    }

}

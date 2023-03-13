package Tree;

import java.util.ArrayList;
import java.util.List;

public class RightView {
    public static void main(String[] args) {

    }

    List<Integer> ans = new ArrayList<>();
    int max = -1;

    //Most Optimized Way
    public void pre(TreeNode root, int height) {
        if (root == null) return;
        if (height > max) {
            ans.add(root.val);
            max = height;
        }
        pre(root.right, height + 1);
        pre(root.left, height + 1);
    }

    public List<Integer> rightSideView(TreeNode root) {
        pre(root, 0);
        return ans;

    }

    //Another Approach using Level Traversal
     /*public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
          int size = q.size();
          for(int i =0;i<size;i++){
              TreeNode curr = q.poll();
              if(curr !=null){
                    if(i == size -1){
                            list.add(curr.val);
                        }
                    if(curr.left !=null)
                        q.add(curr.left);
                        if(curr.right !=null)
                            q.add(curr.right);
                }
            }
        }
        return list;
        }*/
}

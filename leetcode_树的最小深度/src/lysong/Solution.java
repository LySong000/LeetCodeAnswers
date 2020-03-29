package lysong;


import sun.reflect.generics.tree.Tree;

import java.time.chrono.MinguoChronology;
import java.util.Map;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }

      public void setVal(int val) {
        this.val = val;
      }
}
/**
 * @Author: LySong
 * @Date: 2020/3/26 19:30
 */
public class Solution {
    public int run(TreeNode root) {
        if(root == null){
            return 0;
        }
        int l = run(root.left);
        int r = run(root.right);
        if(l == 0 || r == 0){
            return l + r + 1;
        }
        return Math.min(l,r)+1;
    }
}

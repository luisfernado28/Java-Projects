package LeetCode.Explore.BinaryTree;
import java.util.ArrayList;
import java.util.List;

public class TreeRecursive {
    static List<Integer> res= new ArrayList<Integer>();

    public static void main(String[] args0){
        //List<Integer> e= preorderTraversal(new TreeNode(1,null,new TreeNode(2,new TreeNode(3,null,null),null)));
        List<Integer> e= preorderTraversal(new TreeNode(3,new TreeNode(1,null,null),new TreeNode(2,null,null)));

        System.out.println(e);
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        addvalue(res,root);
        return res;
    }

    public static void addvalue(List<Integer> res, TreeNode tree){
        if (tree== null ) {
            return ;
        }
        res.add(tree.val);
        addvalue(res,tree.left);
        addvalue(res,tree.right);
    }

}
 // Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
     }
  }



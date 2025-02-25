/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> result = new LinkedList<Integer>();

        preorderHelper(result, root);

        return result;
    }

    public static void preorderHelper(List<Integer> result, TreeNode root){

        if(root == null){
            return;
        }

        result.add(root.val);
        preorderHelper(result, root.left);
        preorderHelper(result, root.right);
    }
}
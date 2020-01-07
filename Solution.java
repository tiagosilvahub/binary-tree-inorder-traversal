/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new LinkedList<>();
        if(root != null) { 
            answer.addAll(inorderTraversal(root.left)); 
            answer.add(root.val);
            answer.addAll(inorderTraversal(root.right));
        }
        return answer;
    }
}

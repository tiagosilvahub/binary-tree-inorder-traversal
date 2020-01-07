# binary-tree-inorder-traversal
Given a binary tree, return the inorder traversal of its nodes' values.

Example:
```
Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,3,2]
```
Follow up: Recursive solution is trivial, could you do it iteratively?

Recursive solution:

```
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
```

Iterative solution:

```
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> answer = new ArrayList<>();
        Stack<TreeNode> stack = new Stack();
        while(root != null || !stack.empty()) {
            while( root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            answer.add(root.val);
            root = root.right;            
        }
        return answer;
    }
}
```

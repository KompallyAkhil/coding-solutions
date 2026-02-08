// URL: https://leetcode.com/problems/balanced-binary-tree/description/?envType=daily-question&envId=2026-02-08
//
// Problem: 110. Balanced Binary Tree
//

// Solution:
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
    public static int heightBalanced(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = heightBalanced(root.left);
        int right = heightBalanced(root.right);
        if(left == -1){
            return -1;
        }
        if(right == -1){
            return -1;
        }
        if(Math.abs(left - right) > 1){
            return -1;
        }
        return 1 + Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        return heightBalanced(root) != -1;
    }
}
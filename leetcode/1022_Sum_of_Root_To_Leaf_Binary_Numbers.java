// URL: https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/description/?envType=daily-question&envId=2026-02-24
//
// Problem: 1022. Sum of Root To Leaf Binary Numbers
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
    public static void backtrack(TreeNode root, List<String> li , String s){ 
        s += root.val;
        if(root.left == null && root.right == null ) {
            li.add(s);
            return;
        }
        if(root.left != null){
            backtrack(root.left,li,s);
        }
        if(root.right != null){
            backtrack(root.right,li,s);
        }
    }
    public int sumRootToLeaf(TreeNode root) {
        List<String> li = new ArrayList<>();
        backtrack(root,li,"");
        int answer = 0;
        for(String i : li){
            answer += Integer.parseInt(i,2);
        }
        System.out.println(li);
        return answer;
    }
}
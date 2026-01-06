// URL: https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/submissions/1876426743/?envType=daily-question&envId=2026-01-06
//
// Problem: 1161. Maximum Level Sum of a Binary Tree
//

// Solution:
class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        int sum = Integer.MIN_VALUE;
        int depth = 0;
        int maxiDepth = 0;
        while(!q.isEmpty()){
            int n = q.size();
            int currentSum = 0;
            for(int i = 0 ; i < n ; i++){
                TreeNode current = q.poll();
                if(current != null){
                    currentSum += current.val;
                    // System.out.println(current.val);
                }
                if(current.left != null){
                    q.add(current.left);
                }
                if(current.right != null){
                    q.add(current.right);
                }
            }
            depth++;
            if(sum < currentSum){
                sum = currentSum;
                maxiDepth = depth;
            }
            System.out.println(currentSum);
            System.out.println(depth);
        }
        return maxiDepth;
    }
}
 */
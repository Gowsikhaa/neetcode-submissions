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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        //TreeNode node = root;
        List<Integer> tmp = new ArrayList<>();
        if(root == null){
            return ret;
        }
        tmp.add(root.val);
        ret.add(tmp);
        q.add(root);
        performBFS(q, ret);
        return ret;
    }

    public void performBFS(Queue<TreeNode> q, List<List<Integer>> ret){
        Queue<TreeNode> newQ = new LinkedList<>();
        List<Integer> tmp = new ArrayList<>();
        while(!q.isEmpty()){
             TreeNode node = q.poll();
             if(node.left!=null){
                tmp.add(node.left.val);
                newQ.add(node.left);
             }
             if(node.right!=null){
                newQ.add(node.right);
                tmp.add(node.right.val);
             }
        }
        if(!tmp.isEmpty()){
            ret.add(tmp);
        }
        if(!newQ.isEmpty()){
            performBFS(newQ, ret);
        }
    }
}

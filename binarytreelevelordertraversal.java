//Java Solution

class Solution {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        dfs(root, 0);
        return result;
    }
    
    private void dfs(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        
        if (result.size() == level) {
            result.add(new ArrayList<Integer>());
        }
        result.get(level).add(node.val);
        
        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
    }
}
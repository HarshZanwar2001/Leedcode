import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Day09 {
    
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> res = new ArrayList<Long>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                sum += node.val;
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }

            }
            res.add(sum);
        }
        if (k > res.size()) {
            return -1;
        }
        res.sort(Collections.reverseOrder());
        return res.get(k - 1);

    }
        public static void main(String[] args) {
            Day09 obj = new Day09();
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(5);
            root.right.left = new TreeNode(6);
            root.right.right = new TreeNode(7);
            System.out.println(obj.kthLargestLevelSum(root, 2));
        }
    }
    


import TreeNode;
import java.util.*;

public class Day10 {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return isMirror(root1, root2);

    }

    private boolean isMirror(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) {
            return true;
        }
        if (n1 == null || n2 == null || n1.val != n2.val) {
            return false;
        }
        return (isMirror(n1.left, n2.left) || isMirror(n1.left, n2.right)) &&
                (isMirror(n1.right, n2.right) || isMirror(n1.right, n2.left));
    }
}

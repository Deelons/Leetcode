public class BinaryTreeTilt {

    int tilt = 0;

    public int solution(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = solution(root.left);
        int right = solution(root.right);
        tilt += Math.abs(left - right);
        return left + right + root.val;

    }

    public int findTilt(TreeNode root) {
        solution(root);
        return tilt;

    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

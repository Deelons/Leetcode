public class MimimumABSInBST {
	int minDiff = Integer.MAX_VALUE;
	TreeNode prev;

	public int getMinimumDifference(TreeNode root) {
		if (root == null) {
			return 0;
		}

		getMinimumDifference(root.left);
		if (prev != null) {
			min = Math.min(min,root.val - prev.val);
		}
		prev = root;
		getMinimumDifference(root.right);
		return min;

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
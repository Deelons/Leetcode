public class InvertBinaryTree {
	public TreeNode invertBinaryTree(TreeNode root) {
		if (root.left != null || root.right != null) {
			TreeNode temp = root.left;
			root.left = root.right;
			root.right = temp;
			invertBinaryTree(root.left);
			invertBinaryTree(root.right);
		}

		return root;
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
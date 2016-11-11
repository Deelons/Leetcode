public class SumOfLeftLeaves {
	public int sumOfLeftLeaves(TreeNode root) {
	    int sum = 0;
	    if (root == null) {
	        return 0;
	    }
	    
	    if (root.left != null && root.left.left == null && root.left.right == null) {
	       return root.left.val + sumOfLeftLeaves(root.right);
	    }
	    
	    sum += sumOfLeftLeaves(root.left);
	    sum += sumOfLeftLeaves(root.right);
	    return sum;
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
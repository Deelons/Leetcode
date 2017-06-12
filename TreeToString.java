public class TreeToString {

	public static String tree2str(TreeNode t) {
		if (t == null) {
			return "";
		}

		String result = t.val + "";

		String left = tree2str(t.left);
		String right = tree2str(t.right);

		if (left == "" && right == "") return result;
		if (left == "") return result + "()" + "(" + right + ")";
		if (right == "") return retult + "(" + left + ")";
		return result + "(" + left + ")" + "(" + right + ")";
	}
}

class TreeNode {
	TreeNode left;
	TreeNode right;
	int val;
	TreeNode(int val) {
		this.val = val;
	}
}
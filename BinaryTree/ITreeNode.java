
public class ITreeNode implements TreeNode {
	
	public TreeNode left;
	public TreeNode right;
	public int val;
	
	public ITreeNode(int i) {
		this.val = i;
	}
	
	public void setLeft(TreeNode n) {
		this.left = n;
	}

	public void setRight(TreeNode n) {
		this.right = n;
	}
	
	public void setVal(int i) {
		this.val = i;
	}

	public TreeNode getLeft() {
		return this.left;
	}
	
	public TreeNode getRight() {
		return this.right;
	}
	
	public int getVal() {
		return this.val;
	}
	
}


public class IBinaryTree implements BinaryTree {

	public TreeNode root;
	
	public void addNode(TreeNode t) {
		if (this.root == null) {
			this.root = t;
		}
		else {
			TreeNode temp = this.root;
			boolean flag = false;
			while (flag != true) {
				if (t.getVal() < temp.getVal()) {
					System.out.println("Moved Left!");
					if (temp.getLeft() == null) {
						temp.setLeft(t);
						flag = true;
					}
					else {
						temp = temp.getLeft();
					}
				}
				else if (t.getVal() > temp.getVal()) {
					System.out.println("Moved Right!");
					if (temp.getRight() == null) {
						temp.setRight(t);
						flag = true;
					}
					else {
						temp = temp.getRight();
					}
				}
			}
			
		}
		
	}

	
	public void preTraverse() {
		preTraverseHelp(this.root);		
	}
	
	public void preTraverseHelp(TreeNode t) {
		if (t != null) {
			System.out.println(t.getVal());
			
			preTraverseHelp(t.getLeft());
			preTraverseHelp(t.getRight());
		}
		
	}


	public boolean isFound(int i) {
		return isFoundHelp(this.root, i);
		
	}

	public boolean isFoundHelp(TreeNode t, int i) {
		if (t == null) {
			return false;
		}
		if (t.getVal() == i) {
			return true;
		}
		else if (t.getVal() > i) {
			return isFoundHelp(t.getLeft(), i);
		}
		else if (t.getVal() < i) {
			return isFoundHelp(t.getRight(), i);
		}
		return false;
	}
	
}



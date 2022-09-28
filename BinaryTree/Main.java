
public class Main {
	
	public static void main(String args[]) {
		/*
		TreeNode t1 = new ITreeNode(10);
		TreeNode t2 = new ITreeNode(2);
		TreeNode t3 = new ITreeNode(12);
		t1.setLeft(t2);
		t1.setRight(t3);
		System.out.println(t1.getVal());
		System.out.println(t1.getLeft().getVal());
		System.out.println(t1.getRight().getVal());
		*/
		
		BinaryTree bt = new IBinaryTree();
		TreeNode t1 = new ITreeNode(10);
		TreeNode t2 = new ITreeNode(2);
		TreeNode t3 = new ITreeNode(12);
		TreeNode t4 = new ITreeNode(14);
		TreeNode t5 = new ITreeNode(18);
		TreeNode t6 = new ITreeNode(13);
		TreeNode t7 = new ITreeNode(7);
		TreeNode t8 = new ITreeNode(1);
		
		
		System.out.println("Add: 10");
		bt.addNode(t1);
		System.out.println("Add: 2");
		bt.addNode(t2);
		System.out.println("Add: 12");
		bt.addNode(t3);
		System.out.println("Add: 14");
		bt.addNode(t4);
		System.out.println("Add: 18");
		bt.addNode(t5);
		System.out.println("Add: 13");
		bt.addNode(t6);
		System.out.println("Add: 7");
		bt.addNode(t7);
		System.out.println("Add: 1");
		bt.addNode(t8);
		
		System.out.println("//////////////////////////////////////////////////");
		bt.preTraverse();
		System.out.println("//////////////////////////////////////////////////");
		int index = 1;
		System.out.println("Search for " + index);
		boolean val = bt.isFound(index);
		System.out.println(val);
		int index2 = 10;
		System.out.println("Search for " + index2);
		boolean val2 = bt.isFound(index2);
		System.out.println(val2);
		int index3 = 4;
		System.out.println("Search for " + index3);
		boolean val3 = bt.isFound(index3);
		System.out.println(val3);
	}
}

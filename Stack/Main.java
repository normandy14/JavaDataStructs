
public class Main {

	public static void main(String[] args) {
		/*
		SNode n1 = new SNode("Alice");
		System.out.println(n1.getVal());
		
		SNode n2 = new SNode("Bill");
		n1.setNext(n2);
		
		// Method 1 to print nextNode
		System.out.println(n1.nextNode.getVal());
		
		// Method 2 to print nextNode
		System.out.println(n1.getNext().getVal());
		
		// Method 3 to print nextNode
		Node temp = n1.getNext();
		System.out.println(temp.getVal());
		*/
		
		SNode n1 = new SNode("Alice");
		SNode n2 = new SNode("Bill");
		SNode n3 = new SNode("Charlie");
		SNode n4 = new SNode("Delta");
		
		SStack sk = new SStack();
		
		sk.addVal(n1);
		
		sk.addVal(n2);
		
		sk.addVal(n3);
		
		sk.addVal(n4);
		
		while (sk.isEmpty() != true) {
			System.out.println(sk.popVal());
		}
		System.out.println(sk.popVal());
		
	}

}

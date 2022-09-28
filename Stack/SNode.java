
public class SNode implements Node {
	
	public String val;
	public Node nextNode;
	
	public SNode(String v) {
		this.val = v;
	}	
	
	public void setNext(Node n) {
		this.nextNode = n;
	}
	
	public Node getNext() {
		return this.nextNode;
	}

	public String getVal() {
		return this.val;
	}
}
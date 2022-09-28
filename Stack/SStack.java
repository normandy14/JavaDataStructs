
public class SStack implements Stack {

	public int size = 0;
	public Node front;
	
	public void addVal(Node n) {
		if (this.isEmpty() == true) {
			front = n;
		}
		else {
			Node temp = this.front;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(n);
		}
		size += 1;
	}

	public String popVal() {
		if (this.isEmpty() == true) {
			throw new IndexOutOfBoundsException();
		}
		if (this.getSize() == 1) {
			Node n = this.front;
			this.front = null;
			this.size = 0;
			return n.getVal();
		}
		else {
			// size at least 2
			// this.front -> this.n1 -> this.n2
			Node temp = this.front;
			while (temp.getNext().getNext() != null) {
				temp = temp.getNext();
			}
			String v = temp.getNext().getVal();
			temp.setNext(null);
			this.size -= 1;
			return v;
		}
	}

	public boolean isEmpty() {
		if (this.size == 0) {
			return true;
		}
		return false;
	}

	public int getSize() {
		return this.size;
	}
	
}

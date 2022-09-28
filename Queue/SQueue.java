
public class SQueue implements Queue {

	public Node front;
	public Node tail;
	public int size = 0;
	
	public void addVal(String val) {
		Node n = new SNode(val);
		if (this.isEmpty() == true) {
			this.front = n;
			this.tail = n;
			this.size += 1;
		}
		else {
			n.setNext(this.tail);
			this.tail = n;
			this.size += 1;
		}
		
	}

	public String remVal() {
		if (this.isEmpty() == true) {
			throw new IndexOutOfBoundsException("Can't remove when queue is empty");
		}
		else if (this.getSize() == 1) {
			String s = this.front.getVal();
			this.front = null;
			this.tail = null;
			this.size -= 1;
			return s;
		}
		else if (this.getSize() == 2) {
			// this.front <- this.tail
			String s = this.front.getVal();
			this.front = this.tail;
			this.size -= 1;
			return s;
		}
		else {
			// this.front <- this.node <- this.node <- this.tail
			String s = this.front.getVal();
			Node temp = this.tail;
			
			while (temp.getNext().getNext() != null) {
				if (temp.getNext().getNext() == this.front) {		
					this.front = temp.getNext();
				}
				temp = temp.getNext();
			}
			this.size -= 1;
			return s;
		}
		// return null;
	}

	public boolean isEmpty() {
		if (this.size == 0) {
			return true;
		}
		return false;
	}

	@Override
	public int getSize() {
		return this.size;
	}

}

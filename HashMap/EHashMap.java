
public class EHashMap implements HashMap<Entry> {
	
	final int ARRAY_SIZE = 7;
	Entry [] array = new Entry[ARRAY_SIZE];
	
	private int hashFunction(String s) {
		int sum = 0;
		for (char letter : s.toCharArray()) {
			// System.out.println(letter);
			sum += Character.getNumericValue(letter);
		}
		return sum % ARRAY_SIZE;
	}

	public void addVal(String s, int i) {
		Entry e = new Entry(s, i);
		int arrLocation = this.hashFunction(s);
		System.out.println(arrLocation);
		this.array[arrLocation] = e;
	}

	public int getVal(String s) {
		int arrLocation = this.hashFunction(s);
		Entry e = this.array[arrLocation];
		if (!e.getKey().equals(s)) {
			System.out.println("String s is not in pos!");
			return -1;
		}
		return (int) e.getVal();
	}

}

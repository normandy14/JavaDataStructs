
public class Entry<K, V> {
	
	private K key;
	private V val;
	
	public Entry(K key, V val) {
		this.key = key;
		this.val = val;
	}
	
	public K getKey() {
		return this.key;
	}
	
	public V getVal() {
		return this.val;
	}
}

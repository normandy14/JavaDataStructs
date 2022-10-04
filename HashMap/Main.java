
/*
 * WARNING: HashMap does not yet handle collisions
 * 
 * 
 * 
 */
public class Main {

	public static void main(String[] args) {
		/*
		System.out.println("Hello From HashMap!");
		HashMap hashMap = new EHashMap();
		hashMap.addVal("Hello", 0);
		int a = Character.getNumericValue(' ');
		System.out.println(a);
		*/
		HashMap hm = new EHashMap();
		hm.addVal("Hello", 4);
		hm.addVal("Chicago", 2);
		hm.addVal("Bill", 7);
		hm.addVal("Rook", 11);
		
		System.out.println("////////////////");
		System.out.println(hm.getVal("Hello"));
		System.out.println(hm.getVal("Chicago"));
		System.out.println(hm.getVal("Bill"));
		System.out.println(hm.getVal("Rook"));
	}

}

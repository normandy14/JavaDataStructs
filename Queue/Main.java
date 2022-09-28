
public class Main {

	public static void main(String[] args) {
		
		/*
		// System.out.println("Hello World");
		SQueue sq = new SQueue();
		// case #0
		System.out.println("Case: 0");
		System.out.println(sq.isEmpty());
		System.out.println(sq.getSize());
		// add #1
		System.out.println("Case add: 'Good Evening'");
		sq.addVal("Good evening");
		System.out.println(sq.isEmpty());
		System.out.println(sq.getSize());
		// rem #2
		System.out.println("Case rem: 'Good Evening'");
		System.out.println(sq.remVal());
		System.out.println(sq.isEmpty());
		System.out.println(sq.getSize());
		// add #3
		System.out.println("Case add: 'Good Night'");
		sq.addVal("Good night");
		System.out.println(sq.isEmpty());
		System.out.println(sq.getSize());
		// rem #4
		System.out.println("Case rem: 'Good Night'");
		System.out.println(sq.remVal());
		System.out.println(sq.isEmpty());
		System.out.println(sq.getSize());
		
		
		// exception # 5
		System.out.println("Case: Cause an exception");
		sq.remVal();
		
		*/
		/*
		SQueue sq2 = new SQueue();
		System.out.println("Add: 'Alpha'");
		sq2.addVal("Alpha");
		System.out.println("Suite of Tests:");
		System.out.println(sq2.isEmpty());
		System.out.println(sq2.getSize());
		System.out.println("Add: 'Bravo'");
		sq2.addVal("Bravo");
		System.out.println("Suite of Tests:");
		System.out.println(sq2.isEmpty());
		System.out.println(sq2.getSize());
		System.out.println("Add: 'Charile'");
		sq2.addVal("Charlie");
		System.out.println("Suite of Tests:");
		System.out.println(sq2.isEmpty());
		System.out.println(sq2.getSize());
		System.out.println("Add: 'Delta'");
		sq2.addVal("Delta");
		System.out.println("Suite of Tests:");
		System.out.println(sq2.isEmpty());
		System.out.println(sq2.getSize());
		*/
		
		/*
		SQueue sq2 = new SQueue();
		sq2.addVal("Alpha");
		sq2.addVal("Bravo");
		sq2.addVal("Charile");
		sq2.addVal("Delta");
		
		System.out.println("Removing From Queue: ");
		System.out.println(sq2.remVal());
		System.out.println(sq2.remVal());
		System.out.println(sq2.remVal());
		System.out.println(sq2.remVal());
		*/
		
		SQueue sq2 = new SQueue();
		sq2.addVal("Alpha");
		System.out.println(sq2.remVal());
		sq2.addVal("Bravo");
		sq2.addVal("Charile");
		System.out.println(sq2.remVal());
		sq2.addVal("Delta");
		sq2.addVal("Echo");
		sq2.addVal("Flamingo");
		sq2.addVal("Guess");
		System.out.println(sq2.remVal());
		System.out.println(sq2.remVal());
		System.out.println(sq2.remVal());
		System.out.println(sq2.remVal());
		System.out.println(sq2.remVal());
		System.out.println(sq2.getSize());
		sq2.addVal("Xena");
		System.out.println(sq2.getSize());
		System.out.println(sq2.remVal());
		System.out.println(sq2.isEmpty());
		
	}
}
		
		
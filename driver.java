public class driver {
	public static void main(String[] args) throws Exception {
		/* 
		LinkedListSing ll = new LinkedListSing();
		ll.addLast(0);
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		System.out.println("First int is " + ll.getFirst());
		System.out.println("last int is " + ll.getLast());
		int i = 2;
		System.out.println("int at " + i + " is: " + ll.get(i));
		System.out.println(ll.toString());
		ll.addAt(0, 10);
		System.out.println(ll.toString());
		System.out.println(ll.size);
		ll.addFirst(6);
		System.out.println(ll.toString());
		System.out.println(ll.size);
		System.out.println(ll.toString());
		ll.deleteAt(0);
		System.out.println(ll.toString());
		*/
		LinkedListSingTail lt = new LinkedListSingTail();
		lt.insert(10);
		lt.insert(9);
		lt.insert(8);
		System.out.println(lt.gitfirst());
		System.out.println(lt.getlast());
		

	}
}
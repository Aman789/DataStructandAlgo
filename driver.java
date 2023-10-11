public class driver {
	public static void main(String[] args) throws Exception {
		LinkedListSing ll = new LinkedListSing();
		ll.addLast(0);
		ll.addLast(8);
		ll.addLast(1);
		ll.addLast(1);
		ll.addLast(1);
		// System.out.println("First int is " + ll.getFirst());
		// System.out.println("last int is " + ll.getLast());
		// int i =2;
		// System.out.println("int at "+ i+ " is: " + ll.get(i));
		// System.out.println(ll.toString());
		// ll.addFirst(5);
		// System.out.println(ll.toString());
		// System.out.println(ll.size);
		ll.deleteAt(4);
		System.out.println(ll.toString());

	}
}
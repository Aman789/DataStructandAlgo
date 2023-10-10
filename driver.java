public class driver {
	public static void main(String[] args) throws Exception {
	
        System.out.println("hello");
		LinkedListSing ll = new LinkedListSing();
		
//		ll = ll.insert(ll, 1);
//		ll = ll.insert(ll, 2);
//		ll = ll.insert(ll, 3);
//		ll = ll.insert(ll, 4);
		ll.addLast(0);
		ll.addLast(8);
		ll.addLast(1);
		System.out.println("First int is " + ll.getFirst());
		System.out.println("last int is " + ll.getLast());
		
		ll.printList(ll);

	}
}
import java.util.HashMap;
import java.util.List;


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
		// LinkedListSingQueue lt = new LinkedListSingQueue();
		// lt.push(10);
		// lt.push(9);
		// lt.push(8);
		// System.out.println(lt.gitfirst());
		// System.out.println(lt.getlast());
		// lt.pushFirst(7);
		// System.out.println(lt.gitfirst());
		// System.out.println(lt.toString());
		// // First in, First out
		// lt.push(3);
		// // always first out when we pop
		// System.out.println(lt.pop());
		// System.out.println(lt.toString());
		/* 
		MyHashMap hashM = new MyHashMap();
		//hashM.getAll(); 	
		hashM.add("go", 1);
		hashM.add("no" ,2);
		hashM.add("stop", 3);
		System.out.println("The sieze is "+ hashM.size);
		hashM.add("st", 4);
		
		hashM.getAll();
		System.out.println("*******");
		hashM.get("no");
		hashM.get("st");
		System.out.println("The size is "+hashM.size);
		hashM.remove("no");
		*/


		/*
		 * Exercise
		 */
		/*subarray 
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int[] nums2 = {5,4,-1,7,8};
		Exercise exe = new Exercise();
		System.out.println(exe.maxSubArray(nums2));
		*/
		/* 
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(1);
		ListNode curr = new ListNode();
		ListNode fin = new ListNode();
		ListNode tail = new ListNode();
		l1.next = l2;
		int i =1;
		fin = curr;
		while (i<10){
			ListNode rand = new ListNode(i);
			//tail= rand;
			curr.next = rand;
			curr=curr.next;
			i++;
		}
		fin = fin.next;
		while(fin!=null){
			System.out.println(fin.val);
			fin=fin.next;
		}
		*/
		/* Remove duplicate
		int[] nums2 = {1,1,1,2,2,3};
		int[] nums1 = {0,0,1,1,1,1,2,3,3};
		Exercise exe = new Exercise();	
		System.out.println(exe.removeDuplicates(nums2));
		*/

		BinaryTree bin = new BinaryTree();

		bin.insertByValue(10);
		bin.insertByValue(5);
		bin.insertByValue(15);
		bin.insertByValue(11);
		// System.out.println(bin.findElement(11));
		// System.out.println(bin.findMinValue());
		// System.out.println(bin.findMaxValue());
		bin.bfsearch();
	}
}

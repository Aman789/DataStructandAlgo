public class LinkedListSingQueue {

    int size = 0;
    Node head;
    Node tail;


    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void push(int item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else{
            tail.next = newNode;
            tail=newNode;
        }
        size++;
    }

    public int pop(){
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public boolean empty(){
        if (head == null){
            return false;
        }
        return true;

    }

    public void pushFirst(int item){
        Node newNode = new Node(item);
        Node currNode = head;
        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
            head = newNode;
            head.next = currNode;
        }
        size++;
    }

    public String toString() {
        Node currNode = head;
        if (head == null) {
            return "[]";
        }
        StringBuilder s = new StringBuilder();
        s.append("[");
        while (currNode.next != null) {
            ;
            s.append("'" + currNode.data + "', ");
            currNode = currNode.next;
        }
        s.append("'" + currNode.data + "']");

        return s.toString();
    }


    public int gitfirst() {
        return head.data;
    }
    public int getlast(){
        return tail.data;
    }

}

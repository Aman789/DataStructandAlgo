public class MyHashMap {
    /*
     * initial size -> 2^4
     * resize when 75% of array is occupied
     * length -> numbers of keys in hasmap
     * entries-> size of array
     */
    public int size = 4;
    private float cap = 0.75f;
    private Node[] arr = new Node[size];
    private int length = 0;
    private int entries = 0;

    /**
     * Node
     */
    String key;
    int data;
    Node next;

    public class Node {
        String key;
        int data;
        Node next;

        Node(String key, int data) {
            this.key = key;
            this.data = data;
        }

    }

    public int getLength() {
        return this.length;
    }

    public void add(String key, int val) {
        int idx = key.hashCode() % size;
        Node node = new Node(key, val);
        if ((float) entries / size >= cap) {
            resizeArray();
        }

        System.out.println("Total: " + entries + " " + (float) entries / size);
        if (arr[idx] == null) {
            arr[idx] = node;
            entries++;
        } else {
            Node currNode = arr[idx];
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = node;
        }
        length++;
    }

    private void resizeArray() {
        this.size = size * 2;
        Node[] newArr = new Node[size];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public void remove(String key) {
        int idx = key.hashCode() % size;
        arr[idx] = null;
    }

    public void get(String key) {
        int idx = key.hashCode() % size;
        System.out.println(arr[idx].data);
    }

    public Node getNode(String key) {
        int idx = key.hashCode() % size;
        return arr[idx];
    }

    public void getAll() {
        for (Node s : arr) {
            if (s != null) {
                System.out.print(s.data + " ");
            }
        }
        System.out.println("");

    }

    public void hash(String key) {
        System.out.println(key.hashCode());
        System.out.println(key.hashCode());
        System.out.println(key.hashCode() % 4);
        System.out.println();
    }
}

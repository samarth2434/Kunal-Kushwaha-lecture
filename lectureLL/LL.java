public class LL {

    // Every linked list has head and tail
    // Head and tail are reference variables pointing to nodes
    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    // Insertion in singly linked list
    public void insertFirst(int val) {
        // Create a new node
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }
    //insert in the last index 
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return; 
        }
        //create a new node 
        Node node = new Node(val);
        tail.next = node; //add the new node or point to the node 
        tail = node;   //jo val add kari hai usko he tail point karege 
        size++;

    }
    //insert at the particular index 
    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        //now check and go 
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Representation
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // Main method
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(100, 2);

        list.display();
    }
}

public class LL{

    //every linked list have head and tail 
    //head and tail are the refernece var point to the node 
    private Node head;
    private Node tail;
    
    private int size;
    public LL(){
        this.size = 0;  
    }
    
    //insertion in singly LL
    public void insertFirst(int val){
        //create a new node 
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;

    }

    //Representation 
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
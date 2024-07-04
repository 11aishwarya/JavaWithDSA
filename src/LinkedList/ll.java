package LinkedList;

public class ll {
    private Node head;
    private Node tail;
    private class Node{
        private int val;
        private Node next;
       // Node prev;

        public Node(int val){
            this.val = val;
        }
        public Node(int val,Node next){
            this.val = val;
            this.next = next;

        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
    }

    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.val  + "->");
            temp = temp.next;
        }
    }
}

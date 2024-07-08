package LinkedList;

public class DLL {

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }
        public Node(int val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
    Node head;
    public void insertF(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void Display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.val + "->");
            last = node;
            node = node.next;
        }
        System.out.println();

        System.out.println("print in reverse");
        while(last != null){
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.print("Start");
    }
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;

    }
    public Node Find(int  val){
        Node node = head;
        while(node != null){
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        return node;
    }

    public void insertParticulatvalueAfter(int after , int val){
        Node p = Find(after);

        if(p != null){
            System.out.println("Does not exit");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }
    }
}

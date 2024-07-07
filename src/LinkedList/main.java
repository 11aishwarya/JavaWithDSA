package LinkedList;

public class main {
    public static void main(String[] args) {


        ll list = new ll();
        list.insertFirst(3);
        list.insertFirst(2);
        list.inserLast(5);
        list.insertFirst(1);
        list.insertAnyIdx(4,3);
        list.deleteLast();
        list.deleteParticularIdx(2);
        //list.get(2);

        list.display();
        list.get(2);
    }

}

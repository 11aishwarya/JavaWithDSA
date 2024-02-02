package Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(5);
//
//        System.out.println(box.l + " "+ box.h + " "+box.w);
//
        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2, 3, 4, 5);
        System.out.println(box3.h + " " + box3.weight);


        Box box5 = new BoxWeight(2, 3, 4, 5);
        System.out.println(box5);

        /* there are many variables in both parent and child cls
        you are given access to variable that are in the ref type i.e Boxweight
        hence , you should have access to weight variable
        this also means that the ones you are trying to access should be initialised
        but here , when the obj itself is of type parents cls, how will you call the constror of child cls
        this is why error
        */
        //BoxWeight box6 = new Box(2,3,4);
        //System.out.println(box6);

       // BoxPrice box = new BoxPrice();
    }
    }

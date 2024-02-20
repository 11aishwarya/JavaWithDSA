package Bit_Manipulation;

public class Swap {
    public static void main(String[] args) {
        int x = 3 , y = 4;
    // swaping
        System.out.println("Before swaping : x " + x + " "+y);
        x = x ^ y;
        y = x^y;
        x = x^y;
        System.out.println("After swaping :x "+  x +" " + y);


        //uppercase to lowercase
        for(char ch = 'A'; ch <= 'Z';ch++){
           // System.out.println((char)(ch | ''));
        }
    }
}

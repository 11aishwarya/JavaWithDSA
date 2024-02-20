package Bit_Manipulation;

import javax.imageio.stream.ImageInputStream;

public class OddEven {
    public static void oddEven(int n) {
        int bitMask = 1;
        if ((n % bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
        public static void main(String[] args){
        int n = 34;
        oddEven(n);
        }

}

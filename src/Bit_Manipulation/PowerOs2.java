package Bit_Manipulation;

public class PowerOs2 {
    public static void main(String[] args) {
        int n  =10;
        System.out.println(isPowerOfTwo(10));
    }

    public static  boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }

}

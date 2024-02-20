package Bit_Manipulation;

public class Operation {
    public static int getithBit(int n , int  i){
        int bitMask = 1 << i;
        if((n & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setIthbit(int n , int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static int clearIthbit(int n , int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
    public static int update(int n , int i , int value){
        if(value == 0) return clearIthbit(n , i);
        else
            return setIthbit(n , i);
    }

    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        //System.out.println(getithBit(n,i));
       // System.out.println(setIthbit(n,i));
         System.out.println(clearIthbit(n,i));
    }
}

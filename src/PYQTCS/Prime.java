package PYQTCS;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        //Your code goes here
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 19;
        //isPrime(n);
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}

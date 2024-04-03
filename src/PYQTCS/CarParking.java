package PYQTCS;

import java.util.Scanner;

public class CarParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for(int i = 0; i<m;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int maxcar = 0;
        int ans = -1;
        for(int i = 0; i<m;i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == 1) {
                    count++;
                }
            }
            if (count >= maxcar) {
                maxcar = count;
                ans = i + 1;
            }
        }
        System.out.println(ans);
    }
}

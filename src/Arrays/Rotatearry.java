package Arrays;

import java.util.Arrays;

public class Rotatearry {
    public static void main(String[] args) { //rotate by 1
        int arr[] = {2,3,4,5,6};
//
        int i = 0;
        int j = arr.length-1;
        while(i!=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}

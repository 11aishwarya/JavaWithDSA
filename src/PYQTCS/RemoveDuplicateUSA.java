package PYQTCS;

import java.util.HashMap;

public class RemoveDuplicateUSA {
    public static void main(String[] args) {
        int n = 8;
        int arr[] = {1,2,2,2,3,4,3,2,5};
        duplicate(arr,n);

    }
    public static void duplicate(int arr[],int n){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i< arr.length;i++){
            if(!mp.containsKey(arr[i])){
                System.out.print(arr[i] + " ");
                mp.put(arr[i],1);
            }
        }
    }
}

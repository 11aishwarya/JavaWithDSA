package Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int []arr = {3,4,2,6,2,6};
        //System.out.println(insertionsort(arr));
    }
    public static void insertionsort(int []arr){
        for(int i = 0; i < arr.length;i++){
            for(int j = i+1;j > 0;j--){
                if(arr[j] < arr[j-1]){
                   // swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
       // return arr;
    }
    public static void swap(int arr[],int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

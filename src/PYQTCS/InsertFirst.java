package PYQTCS;

public class InsertFirst {

    public static void main(String args[])
    {
        int n=8;
        int arr[]={10,9,14,8,20,48,16,9,0};
        int value=40;
        System.out.println("Before inserting the value at beginning:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       // insertFirst(arr,n,value);
        insertSpecfic(arr,n,value,3);
        System.out.println("After inserting the value at beginning:");
        for(int i=0;i<=n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

public static void insertFirst(int arr[],int n,int value){
    for(int i=n-1;i>=0;i--)
    {
        arr[i+1]=arr[i];
    }
    arr[0]=value;
  }

  public static void insertSpecfic(int arr[],int n,int value,int pos){
      for (int i = n; i >= pos; i--)
      {
          arr[i] = arr[i - 1];
      }
      arr[pos - 1] = value;
  }
  }


import java.util.Scanner;

public class bubbel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }

        bubbel ob = new bubbel();
        ob.bubblrsort(arr);
        System.out.println("sorted array");
        ob.printarray(arr);


    }
    void bubblrsort(int arr[]){
        int temp=0;
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if (arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;

                }
            }
        }
    }
    void printarray(int arr[]){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}

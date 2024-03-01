import java.util.*;
public class array_insertion {
    public static void main(String[] args) {
        //System.out.println("abhishek");
        int n;
        Scanner sc = new Scanner(System.in);
        //take input for size of array
        System.out.println("enter the size of array:");
        n = sc.nextInt();
        int arr[] = new int[n];

        //take input for array element
        System.out.println(" enter the element: ");
        for (int i = 0; i<n ;i ++){
            arr[i] = sc.nextInt();
        }

        //to print array
        System.out.println(" the element of array is: ");
        for (int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }

        //to insert element at random position
        int arr2[] = new int[n+1];  // new array to store data after insertion
        System.out.println("enter the position where data must be store: ");
        int m = sc.nextInt(); // index where data must be store
        System.out.println("enter the data to be inserted: ");
        int d = sc.nextInt();
        for (int i =0;i<n+1;i++){
            if(i<m){
                arr2[i]=arr[i];
            } else if (i==m) {
                arr2[i]=d;
            }else {
                arr2[i] = arr[i-1];
            }
        }
        System.out.println("the new dta array will be:");
        for (int i = 0; i<n+1; i++){
            System.out.println(arr2[i]);
        }


    }
}

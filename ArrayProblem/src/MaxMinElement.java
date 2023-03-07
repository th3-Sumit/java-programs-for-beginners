import java.util.*;

public class MaxMinElement {
    public static void main(String[] args) {
        int i, Asize;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        Asize = sc.nextInt();

        int arr[]=new int[Asize];

        System.out.println("Please enter your element : ");
        for(i=0; i<Asize; i++){
            arr[i] = sc.nextInt();
        }

        for(i=0; i<Asize-1; i++){
            for(int j = 0; j<Asize-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for(i=0; i<Asize; i++){
            if (arr[i]==arr[0])
                System.out.println("Minimum number from the given array is "+arr[i]);

            else if (arr[i]==arr[Asize-1])
                System.out.println("Maximum number from the given array is : "+arr[i]);



        }


    }
}

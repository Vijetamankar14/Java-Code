//WAP for binary search of an element in an array

import java.util.Scanner;

public class Binary_Search_algo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array[] = new int[5];
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println("Enter element of array of index " + i);
            array[i] = scan.nextInt();
        }
        System.out.println("Enter element to found");
        int key = scan.nextInt();

        int low = 0;
        int high = array.length - 1;


        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == array[mid]) {
                System.out.println("Element is found at index " + mid);
                System.exit(0);
            }
            else if (key > array[mid]) {

                low = mid + 1;
                high = high;
              //  System.exit(0);
            }
            else {
                high = mid - 1;
                low = low;
                //System.exit(0);
            }
        }
        System.out.println("Key not found");
    }
}

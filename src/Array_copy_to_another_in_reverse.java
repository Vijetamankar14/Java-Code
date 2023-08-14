// WAP in java to copy array1 to array2 in reverse direction

import java.util.Scanner;

public class Array_copy_to_another_in_reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array1[] = new int[5];
        int array2[] = new int[5];

        for (int i = 0; i <= array1.length - 1; i++) {
            System.out.println("Enter the element of " + i);
            array1[i] = scan.nextInt();
        }
        System.out.println("Array 1 is :");

        for (int i = 0; i <= array1.length - 1; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println("Array 2 is :");
        int b = array2.length-1;

        for (int i = 0; i <= array1.length - 1; i++)
            {
                array2[b] = array1[i];
                b--;
            }

            for (int i = 0; i <= array2.length - 1; i++) {
                System.out.print(array2[i] + " ");
            }


    }}

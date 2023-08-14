// Write a java program to copy array1 to array2

import java.util.Scanner;

public class Array_copy_to_another {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array1[] = new int[5];
        int array2[]= new int[5];
        for (int i =0; i <= array1.length-1; i++)
        {
            System.out.println("Enter Array number of " +i);
            array1[i] = scan.nextInt();


        }
        System.out.println("Array 1 is : ");
        for (int i =0; i<=array1.length-1;i++){
            array2[i]=array1[i];
        }

        for (int i =0;i<= array1.length-1; i++)
        {
            System.out.print(array1[i] +" ");

        }
        System.out.println();
        System.out.println("----------------");
        System.out.println("Array 2 is : ");
        for (int i =0;i<= array2.length-1; i++)
        {
            System.out.print(array1[i] +" ");

        }


    }


}

// Write a program to copy number of one index to index of another array

import java.util.Scanner;

public class Array_Swapping {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        System.out.println("Enter no of array ");
        int n = scan.nextInt();
        int arry[] = new int[n];
        int temp;

        for (int i =0; i <= arry.length-1; i++)
        {
            System.out.println("Enter Array number of " +i);
            arry[i] = scan.nextInt();
        }
        System.out.println("Array list : ");


        System.out.println("Change which index ");
        int ind1 = scan.nextInt();
        int ind2 = scan.nextInt();
        System.out.println("Original index");
        for (int i =0;i<= arry.length-1; i++)
        {
            System.out.print(arry[i] +" ");

        }
        System.out.println();
        temp= arry[ind1];;
        arry[ind1] = arry[ind2];
        arry[ind2] = temp;
        System.out.println("Changed array");
        for (int i =0;i<= arry.length-1; i++)
        {
            System.out.print(arry[i] +" ");

        }
}
}


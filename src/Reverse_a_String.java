//WAP to reverse a string without using in build function

import java.util.Scanner;


public class Reverse_a_String {
    public static void main(String[] args) {
        String str1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any String : ");
        String str = scan.next();
        char cha[] = str.toCharArray();
        System.out.println("Reversed String is : ");
        str1 = new String(cha);
        for (int i = cha.length-1;i>=0;i--){
            System.out.print(cha[i]);
        }

    }
}

//WAP to replace the specified character of a string with character "a"

import java .util.Scanner;
public class Strings {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String Name : ");
         String name = scan.nextLine();
        System.out.println("Enter the alphabet which have to replace ");
        String s1 = scan.next();
        System.out.println("Replace with which alphabet");
        String s2 = scan.next();
        String name1 =name.replace("s1","s2");


        System.out.println(name1);

    }
}

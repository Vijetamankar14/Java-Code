//WAP to reverse a string with preserving space

import java.util.Scanner;


public class Reverse_Spacing_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = scanner.nextLine();

        char ary1[] = str.toCharArray();
        char ary2[] = new char[ary1.length];

        System.out.println("Reversed String is : ");

        for (int i = 0; i<= ary1.length-1 ;i++){
            if (ary1[i]==' ' ){
                ary2[i]=ary1[i];
            }
        }
        str = new String(ary2);
        int j = ary2.length-1;
        for (int i =0;i<= ary1.length-1; i++)
        {
            if (ary1[i]==0){
            }
            System.out.print(ary2[i]+ " ");
        }




    }
}

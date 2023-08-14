
//WAP to check weather the string contain "S" without inbuilt function

import java.util.Scanner;
import java.util.logging.SocketHandler;

class StringChecker{
    boolean checkS(String a){
        char cha[] = a.toCharArray();
        for (int i =0; i<= cha.length-1;i++) {

            if (cha[i] == 's' || cha[i] == 'S') {
                return true;
            }
        }
        return false;
    }
}
public class String_contains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Strings : ");
        String str = scan.next();

        StringChecker containstr = new StringChecker();
        boolean fes =containstr.checkS(str);
        //System.out.println(fes);
        if (fes==true){
            System.out.println("Contain s in String");
        }
        else {
            System.out.println("Cannot contain string");
        }


    }
}

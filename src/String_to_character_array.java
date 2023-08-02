// WAP to convert String into character array


import java.util.Scanner;

public class String_to_character_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String S = scan.nextLine();
        System.out.println(S);
//        S= Arrays.toString(S.toCharArray());
        char cha[] = S.toCharArray();
      for (int i =0; i<= cha.length-1;i++){
          System.out.print(cha[i]+" ");
      }
    }
}

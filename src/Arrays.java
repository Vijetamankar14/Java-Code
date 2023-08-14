import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int arry[] = new int[5];
        for (int i =0; i <= arry.length-1; i++)
        {
            System.out.println("Enter Array number of " +i);
            arry[i] = scan.nextInt();


        }
        System.out.println("Array list : ");

        for (int i =0;i<= arry.length-1; i++)
        {
            System.out.print(arry[i] +" ");
        }
    }
}

import java.util.Scanner;

public class Array_scenario2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array [] = new int[7];
        for (int i =0;i<= array.length-1; i++)
        {
            System.out.println("Enter salary of employee " +i);
            array[i] = scan.nextInt();
        }
        System.out.println("Salary of Employees are");
        for (int i =0;i<= array.length-1; i++)
        {
            System.out.print(array[i] +" ");
        }
    }
}

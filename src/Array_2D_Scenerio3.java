import java.util.Scanner;

public class Array_2D_Scenerio3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array [][]=new int[4][3];
        for (int i=0;i<= array.length-1; i++)
        {
            for (int j =0;j<= array[i].length -1;j++){
                System.out.println("Enter Salary of employee in company "+i +" and employee " +j);
                array[i][j]= scan.nextInt();
            }
        }
        System.out.println("Array content is :");
        for (int i=0;i<= array.length-1; i++){
            for (int j =0;j<= array[i].length -1;j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}

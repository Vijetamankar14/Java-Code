import java.util.Scanner;

public class Array_2D_Scenerio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array [][]=new int[3][4];

        for (int i =0 ; i<= array.length-1; i++)
        {
            for (int j=0; j<=array[i].length-1; j++)
            {
                System.out.println("Enter marks of student " +i + " in subject "+j);
                array[i][j] = scan.nextInt();
            }
        }
        System.out.println("Array content");
        for (int i =0 ; i<= array.length-1; i++)
        {
            for (int j=0; j<=array[i].length-1; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

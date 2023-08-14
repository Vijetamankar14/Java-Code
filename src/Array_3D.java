
import java.util.Scanner;

public class Array_3D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array[][][] = new int[3][2][4];

        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= array[i].length -1;j++){
                for (int k = 0; k <= array[i][j].length-1;k++){
                    System.out.println("Enter the bank "+i + " of branch "+ j + " and of employee "+ k);
                    array[i][j][k] = scan.nextInt();
                }
            }
        }
        System.out.println("Array contents are ;");
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= array[i].length -1;j++){
                for (int k = 0; k <= array[i][j].length -1;k++){
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
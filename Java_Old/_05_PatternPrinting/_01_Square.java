package Java_Old._05_PatternPrinting;
import java.util.Scanner;
public class _01_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of Rows:-");
        int n=sc.nextInt();

        for(int i=0 ; i<n ; i++){

            for(int j=0 ; j<n ; j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
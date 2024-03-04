//Q1.Print Numbers from 1 to n
package Java_Old._03_ForLoop;
import java.util.*;
public class Q1_PrintingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:-");
        int num=sc.nextInt();

        for(int i=1; i<=num ; i++){
            System.out.print(i + ",");
        }
    }
}
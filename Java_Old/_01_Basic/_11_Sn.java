package Java_Old._01_Basic;
import java.util.Scanner;
public class _11_Sn {

    static int Sn(int num){
        return (num*(num+1))/2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num=sc.nextInt();  //nextInt() is a function (used to take Integer input) present in the class Scanner

        System.out.println("The sum upto " + num + " is " + Sn(num));
    }
}

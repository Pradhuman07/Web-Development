// package _06_UserInput;       //Profile is a class which is present in a package _06_UserInput

import java.util.Scanner;       //Similary,Scanner is a class(used to take user input) which is present in the packet util (& util is present in the java library)

public class Profile 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your name ");
        String name = s.nextLine();                 //line meaning(right to left):- Take string input from user and store it in varible name of data type string
                                                    //nextline is a method used to take nextline input
        System.out.println("Enter your branch ");
        String branch = s.next();   
        
        System.out.println("Enter your age");
        int age=s.nextInt();
        
        System.out.println("Enter your salary"); 
        float salary=s.nextFloat();

        System.out.println("Your name is : "+name); 
        System.out.println("Your branch is : "+branch); 
        System.out.println("Your age is : "+age);
        System.out.println("Your salary is  : Rs "+salary);

    }
}
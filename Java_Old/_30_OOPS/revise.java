package Java_Old._30_OOPS;

import java.util.Scanner;

class scrapper
{
    String joy()
    {
        return "hello";
    }
} 

public class revise 
{
    public static void main(String[] args) 
    {
        scrapper x = new scrapper();
        String word = x.joy();
        System.out.println(word);

        Scanner s = new Scanner(System.in);
        String name= s.nextLine();
        System.out.println(name);

    }
}
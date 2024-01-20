//Q13. Write a program to count total number of notes in given amount

public class Q13 
{
    public static void main(String[] args) 
    {
        //let T be the total amount
        int T=5000;
        System.out.println("No. of Rs 100 notes in Rs " + T + " are " + (T/100));
        System.out.println("No. of Rs 200 notes in Rs " + T + " are " + (T/200));
        System.out.println("No. of Rs 500 notes in Rs " + T + " are " + (T/500));
    }
}

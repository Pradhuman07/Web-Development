//Q1.WAP to print state name and its capital using Constructor

public class Q1 
{
    String name;
    String capital;

    Q1(String n,String c)
    {
        name=n;
        capital=c;
    }

    public static void main(String[] args) 
    {
        Q1 State1 = new Q1("MP" , "Bhopal");
        System.out.println(State1.name);
        System.out.println(State1.capital);

        Q1 State2 = new Q1("Bihar" , "Patna");
        System.out.println(State2.name);
        System.out.println(State2.capital);
    }
}
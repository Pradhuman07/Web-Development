package Java_Old._30_OOPS;
//WAP to print the name,age & salary of Ram,Shyam and Krishna

public class Q4
{
    String name;
    int age;
    double salary;

    Q4(String n , int a , double s)
    {
        name = n;
        age = a;
        salary = s;
    }

    public static void main(String[] args) 
    {
        Q4 Ram = new Q4("Ram" , 15 , 45000);
        Q4 Shyam = new Q4("Shyam" , 18 , 55000);
        Q4 Krishna = new Q4("Krishna" , 21 , 67000);

        System.out.println(Ram.name);
        System.out.println(Ram.age);
        System.out.println(Ram.salary);

        System.out.println(Shyam.name);
        System.out.println(Shyam.age);
        System.out.println(Shyam.salary);

        System.out.println(Krishna.name);
        System.out.println(Krishna.age);
        System.out.println(Krishna.salary);
    }
}
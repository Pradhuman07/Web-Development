//WAP to print the name,age & salary of Ram,Shyam and Krishna

public class _08_NameAgeSalary
{
    String name;
    int age;
    double salary;

    _08_NameAgeSalary(String n , int a , double s)
    {
        name = n;
        age = a;
        salary = s;
    }

    public static void main(String[] args) 
    {
        _08_NameAgeSalary Ram = new _08_NameAgeSalary("Ram" , 15 , 45000);
        _08_NameAgeSalary Shyam = new _08_NameAgeSalary("Shyam" , 18 , 55000);
        _08_NameAgeSalary Krishna = new _08_NameAgeSalary("Krishna" , 21 , 67000);

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
package Java_Old._30_OOPS;
public class _06_NonStaticMethod 
{
    String joy(String n)
    {
        String name = n;
        return name;
    }

    public static void main(String[] args) 
    {
        _06_NonStaticMethod var = new _06_NonStaticMethod();   //Agr static hota to object nhi bnate

        String x = var.joy("Hi");       //String x = joy("hi");     likhte
        System.out.println(x);            //System.out.println(x);    as it is

        System.out.println(var.joy("Hi"));  //System.out.println(joy("Hi"));    likhte
    }
}

//i.e Non-Static methods ko call krne ke liye sbse pehle object create kro
//Then whenever you want to call the method offcourse non-static method

//call like:- Object.Method();

//THen store the return value in a variable and print it as we do in static ones
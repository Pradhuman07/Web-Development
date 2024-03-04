package Java_Old._30_OOPS;
//In this file we will learn how to call static method of another class in the main or other class

//1.To call the static method of another class into main class,use Syntax:-
//                       Class_name.method_name();

//2.You can also store it in a variable and print
//  eg. int x=Class_name.method_name();
//      sout(x);

//3.Also you can do like:- sout(Class_name.method_name());

public class _02_StaticMethodofAnotherClass 
{
    public static void main(String[] args) 
    {
        System.out.println("sout of main method of main class");

        class2.shivani();      //calling only executes the code..doesn't print the return value

        int y = class2.shivani();      //but here it will also print the reuturn value
        System.out.println(y);

        System.out.println(class2.shivani());        //here also
        
    }
}

class class2
{
    public static int shivani() 
    {
        System.out.println("sout of shivani method of class2");
        return 5;
    }

    public static void main(String[] args) 
    {
        System.out.println("sout of main method of Static2 class");
        shivani();   //here only shivani(); not Static1.shivani(); since same class not different
    }
}

//Note:- Run java krke dkho..VS will ask you which main() to execute
//both main can't be execute..don't use ctrl alt n
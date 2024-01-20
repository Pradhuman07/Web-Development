//same variable name but no error bcoz "Every method has its own stack(memory separation in RAM)".
//Moreover a and b are "local variable" (which are declared within the body of method)

public class _03_Stack 
{
    public static int method1()
    {
        int a=3,b=6;
        System.out.println(a);
        System.out.println(b);
        return 0;
    }

    public static void main(String[] args) 
    {
        int a=25,b=50;
        method1();
        System.out.println(a);
        System.out.println(b);
    }
}
//a and b are local variables of method 1 and main method....since within the body of a method
//if you declare a and b b/w line 5 and 6 , then they will be called as global variable ...since declare outsside the function
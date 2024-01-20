//sirf main ke andr ka code hi execute hota h wo bhi line by line...
//method ke andr method....#line by line execution

public class _04_DiagQofStack 
{

    public static boolean method1()
    {
        System.out.println("method1");

        int k=3;
        int p=9;
        int t=k*p;

        return true;
    }

    public static char method2()
    {
        int g=9;
        float Q=10.2f;
        float P=Q-g;  

        System.out.println("method2");

        method1();
        
        return 'A';
    }

//NOTE:-Sirf main() ke andr jo hota h whi execute hota h wo bhi line by line
        public static void main(String args[])
    {
        int a=3;
        double b=3.3;
        double c=a+b;    //int c=a+b; will throw error since int+double=double

        method2();
        System.out.println("main");
    }
}


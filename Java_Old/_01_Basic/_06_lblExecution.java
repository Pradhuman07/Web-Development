package Java_Old._01_Basic;

public class _06_lblExecution {

    static boolean method1(){
        System.out.println("This is Method 1");
        return true;
    }

    static char method2(){
        System.out.println("This is Method 2");
        method1();
        return 'A';
    }

    public static void main(String args[]){
        method2();
        System.out.println("This is Main Method");
    }
}
//sirf main ke andr ka code hi execute hota h wo bhi line by line...
//method ke andr method....#line by line execution
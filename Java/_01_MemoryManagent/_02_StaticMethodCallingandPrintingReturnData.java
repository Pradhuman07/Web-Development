public class _02_StaticMethodCallingandPrintingReturnData
{
//1.Integer Datatype

   public static byte method_1()
    {
        return 1;
    }

    public static short method_2()
    {
        return 2;
    }

    public static int method_3()
    {
        return 4;
    }

    public static long method_4()
    {
        return 8;
    }

//2.Float Datatype 

    public static float method_5()
    {
        return 45.66f;
    }

    public static double method_6()
    {
        return 45.66;
    }

//3.Character Datatype

    public static char method_7()
    {
        return 'P';
    }

//4.Boolean Datatype

    public static boolean method_8()
    {
        return true;
    }

    public static void main(String[] args) 
    {
        System.out.println(method_1());     //This will execute and print return value of that method
        System.out.println(method_2());



        int A=method_3();       //This will store the return value of the method in the variable(mention its datatype)...after that print that varible
        System.out.println(A);      
                                    //(method ko call krke uski return value A mein store krali aur fir a ko print kra dia)
                                    //since a is a variable therefore you have to mention its datatype while declaring
                                                    //(_06_Calculator.java mein seekha)

                                                    
        System.out.println(method_4());
        
        System.out.println(method_5());
        System.out.println(method_6());

        System.out.println(method_7());
        System.out.println(method_8());

    }

    
}
package Revision._01_Basic;
public class _10_Calculator {
    
    static int Addition(int a,int b){
        return a+b;
    }

    static int Subtraction(int a,int b){
        return a-b;
    }

    static int Multiplication(int a,int b){
        return a*b;
    }

    static float Division(float a,float b){
        return a/b;
    }

    public static void main(String[] args){

        System.out.println(Addition(1,2));
        System.out.println(Subtraction(1,2));
        System.out.println(Multiplication(1,2));
        System.out.println(Division(7,2));
    }
}
//Method Creation mein Parameter 
//Method Calling mein Arguments
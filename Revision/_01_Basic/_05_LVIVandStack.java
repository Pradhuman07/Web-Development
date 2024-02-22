//             "EVERY METHOD HAS ITS OWN STACK"
package Revision._01_Basic;
public class _05_LVIVandStack {

    int a=5,b=6;   //Instance variable (or Global Variable) of class _05_Stack

    public static int method1(){

        int a=1,b=2;                //local variable of method1

        System.out.println(a);
        System.out.println(b);

        return 0;
    }

    public static void main(String[] args){

        _05_LVIVandStack ref = new _05_LVIVandStack();
        
        int a=3,b=4;                //local variable of method main()
        
        method1();

        System.out.println(a);      //remeber method vanishes out after its execution so a is no more =1 now
        System.out.println(b);

        System.out.println(ref.a);
        System.out.println(ref.b);
    }
}


//same variable name but no error bcoz "Every method has its own stack(memory separation in RAM)".
//Moreover a and b are "local variable" (which are declared within the body of a method)

//a and b are local variables of method 1 and as well as of main method....since within the body of a method
//if you declare a and b b/w line 5 and 6 , then they will be called as global variable ...since declare outsside the function but to access them you will need to create an object and call them non-statistically bcoz they will be the instance variable and they will be in heap memory
package Revision._01_Basic;

public class _01_StaticMethod {
    
    static int joy(int n){
        return n;
    }

    static void joy(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        System.out.println("The output is " + joy(5));   //calling + Printing retrun data

        joy(); //calling only (This will only execute the method data ..will not print its return data)//Method Overloading (not riding...riding ke case mein inheritence use hota h)
    }
}

package Java_Old._30_OOPS;
public class _01_Constructor
{

    _01_Constructor()     //constructor is a method which is of file/class name only
    {
        System.out.println("Constructor");
    }

    public static void main(String[] args) 
    {
        new _01_Constructor();  
        
        //constructor ko call kia h
        //object bnaya h    ....since object bnta h new keyboard se uske baad class ka naam
   
    }
}
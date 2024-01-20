//just like import java.util.Scanner;

public class Upadhyay 
{


    public static void main(String[] args) 
    {
        // Pradyuman ref = new Pradyuman();
        // ref.display();
        
        Pradyuman ref = new Pradyuman();
        ref.display();

        ref.display();

        //jese hi ref. type kroge automatically display aajaeyaga enter maarna then automatically import java.11oops.pradyuman aajayega
        
        //hm display ko acces kr parhe h coz it is public 
        //If you want ki wo public bhi rhe pr vo idr visible bhi na rhe to make the method abstract but to use abstract method you have to make the class also abstract
    }
}

//Therefore we can say that public class ka object apn kisi bhi jgh instantitae kr skte h
//Therefore scanner is also a public class
//Only 1 public class is possible 

//abstract class ka object nhi bnaya ja skta cant be instantiated
//agr class ke andr ek bhi abstract method h to class should also be abstract
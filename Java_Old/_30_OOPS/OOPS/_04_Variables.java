//1.Local variables always need to be initialized
//2.Instance variables need not to be initialized...prints the default value of the datatypes
//3.Static variables :- Just like Instance variable but defined with "Static" keyword

package Java_Old._30_OOPS.OOPS;
class V1{

//Instance variables:-

    String stringg;  
    char charr;
    int intt;
    float floatt;
    double doublee;
    boolean booleann;

//Static Variable:-    
    static String stringggg="static stinggggg";  
}

public class _04_Variables {

    //Static Variable
    static int inttttttt;
    public static void main(String[] args) {

        //#1 Printing Local Variable
        
        int x=4;    //Local Variable
        System.out.println(x);

        // int y;
        // System.out.println(y);   //Error:- local variable y may not have been initialized

        //#2 Printing Instance variables

        V1 ref = new V1();

        System.out.println(ref.stringg);   //null
        System.out.println(ref.charr);      //white space
        System.out.println(ref.intt);    //0
        System.out.println(ref.floatt);    //0.0
        System.out.println(ref.doublee);    //0.0
        System.out.println(new V1().booleann);    //false   //Using Constructor

        //#3 Printing Static Variables   [3 ways to access]

        System.out.println(V1.stringggg);        //using Class name
        System.out.println(ref.stringggg);       //using Object
        System.out.println(new V1().stringggg);  //usuing constructor
        System.out.println(inttttttt);           //Same class

    }
}
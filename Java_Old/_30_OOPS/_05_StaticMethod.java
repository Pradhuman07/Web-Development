package Java_Old._30_OOPS;
public class _05_StaticMethod
{
    static String joy(String n)   //created joy method which is taking argument "Aakash" from below
    {
        String name = n;        //since n is just a shallow copy holding "Aakash" , therefore storing that in the variable name
        return name;            //now we will print the "Aakash" using return of static method and sout
    }

    public static void main(String[] args) 
    {
        String var = joy("Aakash");   //joy ki return value N mein Store krai
        System.out.println(var);      //ab N ko print kraenge

        System.out.println(joy("Vikas"));
    }
}



// public class _05_ParametrizedStaticMethods 
// {
//     static String joy(String n)
//     {
//         String name =n;
//         return name;
//     }

//     public static void main(String[] args) 
//     {
//         String var = joy("Aakash");
//         System.out.println(var);

//         System.out.println(joy("Vikas"));
//     } 
// }
public class _07_ParametrizedConstructor
{
    String name;                //in case of constructor you need to create instance variable(global)

    _07_ParametrizedConstructor(String n)
    {
        name = n;               //direct [ String name = n; ] kyo nhi?  
    }                           //remeber Constructor does not return anything                         

    public static void main(String[] args) 
    {
        _07_ParametrizedConstructor var = new _07_ParametrizedConstructor("Aakash");
        System.out.println(var.name);   //System.out.println(Object.Method);  ..in case of non static method....but here (Object.localvariabe)  okkk instance variable
    }                                   //Note:-In case of non-static methods..you cant acess its local variable..you can only acees its return value by calling the method...but Constructor does not have return value         
}

//sbse pehle to constructor create kia
//fir neeche usse call kia..[call krne ke liye object bnana pdega...since constructor is a non-static method] (object bnta h new keyword se..uske baad class ka naam fir usse store kro..)]
//call krte wqt argument se constructor ke parameters ko ek String bhji
//us string ko parameter ne hold kia....since parameters holds arguments value
//fir since n is just a temporary data holding instrument ...therfore we passed/stored the data into variable name
//now name ka Datatype specify kia using Instance variable  (Global Variable)
//then name ko print kia..jese non static methods ki return value print krte h waise hi...i.e sout(object_name.variable)

// public class _07_ParametrizedConstructor 
// {
//     String name;

//     _07_ParametrizedConstructor(String n)
//     {
//         name = n;
//     }    

//     public static void main(String[] args) 
//     {
//         _07_ParametrizedConstructor var = new _07_ParametrizedConstructor("Aakash");
//         System.out.println(var.name);
//     }
// }
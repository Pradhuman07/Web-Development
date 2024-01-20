public class _09_Sn 
{
    public static long Sum_of_n_Natural_Numbers(int n)   
    {                                                    
        long ans=(n*(n+1))/2;
        return ans;
    }

    public static void main(String[] args) 
    {
        byte n=10;      
        
        long S=Sum_of_n_Natural_Numbers(n);    //here n is argument
        System.out.println("The Sum of n Natural Numbers where n = "+n+" is "+S + ".");
    }
}

//Arument-Mehtod calling ke doran
//Parameter-Method creation ke doran

//Parameter is shallow copy of Argument passed
//Parameter ka data type specify krna hota h
//Argument ka data type specify nhi krna hota
//Parameter ka datatype ya to argument ke datatype ke barabar hone chahiye ya usse bda 
//no. of parameters = no. of argument


//here n is parameter(PM is a shallow copy of argumt) //long n is also correct
 //n=130 soln replace int by long  //byte will throw error since binary conversion exceeds 8 bits
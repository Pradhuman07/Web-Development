public class _06_Calculator 
{
    static int addition(int x,int y)   //int x and int y are shallow copy of a and b
    {                                  
        int ans=x+y;                   //remember x=a and y=b   ...ans is another variable 
        return ans;                    //ans is integer datatype
    }

        static int subtraction(int a,int b)    ///hellllllooooo
    {
        int ans=a-b;
        return ans;
    }

        static int multiplication(int x,int y)
    {
        int ans=x*y;
        return ans;
    }

        static int division(int x,int y)
    {
        int ans=x/y;
        return ans;
    }

//NOTE:-Call krte wqt datatype nhi btate...since main() already know a and b    
//NOTE:-but addition() method ko x aur y ka datatype btana pdega..since main() addition() ko janta h pr addition() main() ko nhi janta

    public static void main(String[] args) 
    {
        int a=5;
        int b=3;

        int A=addition(a,b);       //add krrhe a aur b ko addition() method ke through  
        int S=subtraction(a,b);    //aur fir uska return,i.e ans A mein store krra rhe
        int M=multiplication(a,b); //A ek variable h usko bnate/declare krte wqt uska datatype btao jo ki addition ka return ans ka datatpe h
        int D=division(a,b);       //D basically stores return value of division method
                                   
        System.out.println(A);
        System.out.println(S);
        System.out.println(M);
        System.out.println(D);
    }
}

//#stack diagram see pg no.5 ...garbage collection


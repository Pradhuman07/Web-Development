public class _08_SIandCI 
{
    
    public static int Simple_Interest(int P,int R,int T)
    {
        int F=P*(1+R*T);
        return F;
    }

    public static int Compound_Interest(int P,int R,int N,int T)
    {
        int F=P*(1+R/N)*N*T;
        return F;

    }

public static void main(String[] args) 
{
    int P=1000,R=5,N=2,T=10;

    System.out.println();               //Line Space

    System.out.println("The Principal amount P is " +P + " Rs");
    System.out.println("Rate of Interest R is " +R + " %");
    System.out.println("No. of times Interest applied per time period N is " +N + " times");
    System.out.println("Time period T is " +T + " years");

    System.out.println();               //Line Space

    System.out.println("Note:-Formula for Simple Interest is F=P(1+RT) and ");
    System.out.println("Formula for Compound Interest is F=P(1+R/N)NT");

    System.out.println();               //Line Space

    int A=Simple_Interest(P,R,T);
    System.out.println("The Simple Interest is " + A + " Rs.");

    int B=Compound_Interest(P,R,N,T);
    System.out.println("The Compound Interest is " + B + " Rs.");

    System.out.println();
}

}
public class Q16Extra 
{
    public static void main(String[] args) 
    {
        //let a,b and c are the three sides of a triangle

        int a=3,b=4,c=6;

if( (a+b)>c && (b+c)>a && (c+a)>b )

{
    
System.out.println("It is a valid,");

        if( a==b && b==c && c==a )
        {
            System.out.println("Equilateral triangle");
        }

        else if( (a==b && b!=c) || (b==c && c!=a) || (a==c && b!=c) )
        {
            System.out.println("Isosceles triangle");
        }

        else
        {
            System.out.println("Scalene triangle");
        }
}

else
{
    System.out.println("It is not a valid triangle");
}
 
    }
}

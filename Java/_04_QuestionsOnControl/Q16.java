//Q16. Write a program to check whether the triangle is equilateral, isosceles or scalene.

public class Q16 
{
    public static void main(String[] args) 
    {
        //let a,b and c are the three sides of a triangle

        int a=3,b=3,c=6;

        if( a==b && b==c && c==a )
        {
            System.out.println("It is an Equilateral Triangle");
        }

        else if( (a==b && b!=c) || (b==c && c!=a) || (a==c && b!=c) )
        {
            System.out.println("It is an Isosceles Triangle");
        }

        else
        {
            System.out.println("It is an Scalene Triangle");
        }

        String y = a==b && b==c && c==a ? "It is an Equilateral Triangle" : (a==b && b!=c) || (b==c && c!=a) || (a==c && a!=b) ? "It is an Isoscles Triangle" : "It is an Scalene Triangle";
        System.out.println(y);
    }
}

package Java_Old._02_ConditionalStatements;
public class Q16_TypesOfTriangle 
{
    public static void main(String[] args){

    int a=3,b=4,c=6;

    if( (a+b)>c && (b+c)>a && (c+a)>b ){

            if( a==b && b==c && c==a ) {
                System.out.println("Equilateral triangle");
            }

            else if( (a==b && b!=c) || (b==c && c!=a) || (a==c && b!=c) ) {
                System.out.println("Isosceles triangle");
            }

            else{
                System.out.println("Scalene triangle");
            }
    }

    else{
        System.out.println("It is not a valid triangle");
    }
 
    }
}

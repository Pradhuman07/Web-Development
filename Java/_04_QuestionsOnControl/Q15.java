//Q15. Write a program to input all sides of a triangle and check whether triangle is valid or not

public class Q15 
{
    public static void main(String[] args) 
    {
        //let a,b & c be the three sides of a triangle
        int a=3,b=2,c=5;

        if( (a+b)>c && (b+c)>a && (c+a)>b )
        {
            System.out.println("Triangle is valid");
        }

        else
        {
            System.out.println("Triangle is not valid");
        }

        String y = (a+b)>c && (b+c)>a && (c+a)>b ? "Triangle is valid" : "Triangle is not valid" ;
        System.out.println(y);
    }
}

//Note:The sum of every two sides should be greater than the third side of a triangle.
//Even if the sum of two sides is equal to the third side,then also the triangle is not valid
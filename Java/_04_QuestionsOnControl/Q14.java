//Q14. Write a program to input angles of a triangle and check whether triangle is valid or not

public class Q14
{
    public static void main(String[] args) 
    {

        int angle1=60;
        int angle2=70;
        int angle3=50;

        if( (angle1+angle2+angle3) == 180 )
        {
            System.out.println("Triangle is valid");
        }

        else
        {
            System.out.println("Triangle is not valid");
        }

        String y = angle1+angle2+angle3==180 ? "Triangle is valid" : "Triangle is not valid" ;
        System.out.println(y);

    }
}

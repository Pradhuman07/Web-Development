package Java_Old._30_OOPS;
//Q3.WAP to print the Area of Triangle using Non-Static Method

public class Q3 
{
    double Area(int B,int H)   //non static method bnaya h
    {
        return 0.5*B*H;
    }

    public static void main(String[] args) 
    {
        int b=4,h=5;

        Q3 var = new Q3();                  //Object bnaya h
        System.out.println(var.Area(4,5));      //method ko direct call krte wkt hi print kia h by using syntax:- Object.MethodName();
        

        double R = var.Area(b,h);   //method ki return value phle ek variabel mein store krli
        System.out.println(R);      //ab us variable ko print kra lia

        System.out.println("The Area of the Triangle of base " + b + " cm and height " + h + " cm is " + R + " cm2.");
    }
}
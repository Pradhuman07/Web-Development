package Java_Old._30_OOPS;
public class Indripuri 
{
    public static void main(String[] args) 
    {
        
    }

}


class MPNagar
{
    int m1 = 5;                  //Instance/global/non-static/object_ka variable of class MPNagar
    static int m2 = 6;           //Static variable

    class zone1
    {
        int z1 = 1;             //Instance/global/non-static/object_ka variable of class zone1
        static int z2 = 2;      //static variable
        
        static int Static_Method_of_Zone1()
        {
            int a=4;
            System.out.println("I am Static_Method_of_Zone1 returning value 11");
            return 1;
        }

        int Non_Static_Method_of_Zone1()
        {
            int b=40;
            System.out.println("I am Static_Method_of_Zone1 returning value 12");
            return 2;
        }

        class zone2
        {

        int z2 = 1;             //Instance/global/non-static/object_ka variable of class zone1
        static int z22 = 2;      //static variable

        static int Static_Method_of_Zone2()
        {
            System.out.println("I am Static_Method_of_Zone2 returning value 21");
            return 21;
        }

        int Non_Static_Method_of_Zone2()
        {
            System.out.println("I am Static_Method_of_Zone2 returning value 22");
            return 22;
        }

        }
    }
}
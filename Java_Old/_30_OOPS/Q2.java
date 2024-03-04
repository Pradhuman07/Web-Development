package Java_Old._30_OOPS;
//Q2. WAP to print the volume of cube using non static method

public class Q2 
{
    int volume(int l)
    {
        int volume = l*l*l;
        return volume;
    }

    public static void main(String[] args) 
    {
        Q2 var = new Q2();             //Agr static hota to object nhi bnate 

        int R = var.volume(5);       //int R = volume(5);          likhte
        System.out.println(R);         //System.out.println(R);      as it is

        System.out.println(var.volume(5));      //System.out.println(volume(6)); likhte
        
        System.out.println("The volume of the cube of edge length 5 cm is " + R);


    }
}

//kul milakr non static method ko call krne ke liye pehle object bnate h
//fir method ko call krne ke liye:- Objectname.method();  ...fr method ki return value store krao print krao as like in static
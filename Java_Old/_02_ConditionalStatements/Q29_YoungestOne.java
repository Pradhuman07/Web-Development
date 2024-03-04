package Java_Old._02_ConditionalStatements;
/*Q29.If the ages of Ram, Shyam and Ajay are input through the keyboard,
write a program to determine the youngest of the three.*/

public class Q29_YoungestOne 
{
    public static void main(String[] args) 
    {
        int ageofRam = 11;
        int ageofShyam = 15;
        int ageofAjay = 9;

        if(ageofRam<ageofShyam && ageofRam<ageofAjay)
        {
            System.out.println("The youngest of the three is Ram");
        }

        else if(ageofRam>ageofShyam && ageofAjay>ageofShyam)
        {
            System.out.println("The youngest of the three is Shyam");
        }

        else
        {
           System.out.println("The youngest of the three is Ajay"); 
        }

        String y = ageofRam<ageofShyam && ageofRam<ageofAjay ? "The youngest of the three is Shyam" : ageofRam>ageofShyam && ageofAjay>ageofShyam ? "The youngest of the three is Shyam" : "The youngest of the three is Ajay";
        System.out.println(y);

    }
}

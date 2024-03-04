package Java_Old._02_ConditionalStatements;
/*Q25. The marks obtained by a student in 5 different subjects are input through the 
keyboard. The student gets a division as per the following rules: Write a program to 
calculate the division obtained by the student

• Percentage above or equal to 60 - First division
• Percentage between 50 and 59 - Second division
• Percentage between 40 and 49 - Third division
• Percentage less than 40 – Fail */

public class Q25_Percentage 
{
    public static void main(String[] args) 
    {
        int s1=50,s2=60,s3=70,s4=80,s5=90;

        int T=s1+s2+s3+s4+s5;
        double P=(T/5.0);

        System.out.println("Total Marks Obtained = " + T);
        System.out.println("Percentage Obtained " + P);

        if(P>=60)
        {
            System.out.println("First division");
        }

        else if(P<=59 && P>=50)
        {
            System.out.println("Second division");
        }

        else if(P<=40 && P>=49)
        {
            System.out.println("Third division");
        }
                
        else
        {
            System.out.println("Fail");
        }


        String y = P>=60 ? "First division" : P<=59 && P>=50 ? "Second division" : P<=40 && P>=49 ? "Third division" : "Fail" ;
        System.out.println(y);

        // String y = P>=60 ? "First division" : P<=59 && P>=50 ? "Second division" : P<=40 && P>=49 ? "Third division" : P<40 ? "Fail" : _?_ ;
        // above one is wrong because ternary mein last mein else hona chhiye (i.e without condition) but this is acc like if or else if is present there in the last
        // But you can write it like
        // String y = P>=60 ? "First division" : P<=59 && P>=50 ? "Second division" : P<=40 && P>=49 ? "Third division" : P<40 ? "Fail" : " " ;
    }
}

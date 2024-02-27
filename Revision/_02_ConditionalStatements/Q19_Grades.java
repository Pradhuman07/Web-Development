package Revision._02_ConditionalStatements;
//Q19. Write a program to input marks of five subjects Physics, Chemistry, Biology, 
//     Mathematics and Computer. Calculate percentage and grade according to following:
/*
• Percentage >= 90% : Grade A
• Percentage >= 80% : Grade B
• Percentage >= 70% : Grade C
• Percentage >= 60% : Grade D
• Percentage >= 40% : Grade E
• Percentage  < 40% : Grade F
*/

public class Q19_Grades 
{
    public static void main(String[] args) 
    {
        int P=70,C=50,M=90,B=80,CS=93;

        System.out.println("Marks obtained in Physics,Chemistry,Maths,Biology & Computer are " + P + ","+ C + "," + M +"," + B +  ","+ CS + " respectivley.");

        double Percentage_Obtained = ((P+C+M+B+CS)/5.0);
        System.out.println("Percentage Obtained = " + Percentage_Obtained + " % ");

        if(Percentage_Obtained >= 90)
        {
            System.out.println("Grade obtained : A");
        }
        else if(Percentage_Obtained >= 80 )
        {
            System.out.println("Grade obtained : B");
        }
        else if(Percentage_Obtained >= 70)
        {
            System.out.println("Grade obtained : C");
        }
        else if(Percentage_Obtained >= 60)
        {
            System.out.println("Grade obtained : D");
        }
        else if(Percentage_Obtained >= 40)
        {
            System.out.println("Grade obtained : E");
        }
        else if(Percentage_Obtained < 40)
        {
            System.out.println("Grade obtained : F");
        }       
    }
}
//else if isliye lgaya kyoki 76.6 is >=70 a.w.a >=60 a.w.a >=40
//but since else if lga dia to sirf pehla wla execute hoga

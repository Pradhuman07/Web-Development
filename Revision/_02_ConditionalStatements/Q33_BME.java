package Revision._02_ConditionalStatements;
/*33. A certain grade of steel is graded according to the following conditions

i. Hardness must be greater than 50
ii. Carbon content must be less than 0.7
iii. Tensile strength must be greater than 5600

The grades are as follows:
• Grade is 10 if all three conditions are met
• Grade is 9 if conditions (i) and (ii) are met
• Grade is 8 if conditions (ii) and (iii) are met
• Grade is 7 if conditions (i) and (iii) are met
• Grade is 6 if only one condition is met
• Grade is 5 if none of the conditions are met

Write a program, which will require the user to give values of hardness, carbon content and 
tensile strength of the steel under consideration and output the grade of the stee */

public class Q33_BME 
{
    public static void main(String[] args) 
    {
        int H=60;        //Should be greater than 50
        double CC=0.5;   //Should be less than 0.7
        int TS=5200;     //Should be greater than 5600

        if(H>50 && CC<0.7 && TS>5600)
        {
            System.out.println("Grade=10");
        }

        else if(H>50 && CC<0.7)
        {
            System.out.println("Grade=9");
        }

        else if(CC<0.7 && TS>5600)
        {
            System.out.println("Grade=8");
        }

        else if(H>50 && TS>5600)
        {
            System.out.println("Grade=7");
        }

        else if(H>50 || CC<0.7 || TS>5600)
        {
            System.out.println("Grade=6");
        }

        else 
        {
            System.out.println("Grade=5");
        }


    }
}

package Java_Old._02_ConditionalStatements;
/*Q23. The current year and the year in which the employee joined the organization are 
entered through the keyboard. If the number of years for which the employee has served 
the organization is greater than 3 then a bonus of Rs. 2500/- is given to the employee. If 
the years of service are not greater than 3, then the program should do nothing.*/

public class Q23_Bonus 
{
    public static void main(String[] args) 
    {
        int CurrentYear=2023;
        int YearJoined=2019;

        if((CurrentYear-YearJoined)>3)
        {
            System.out.println("Congratulations you will be given the bonus of Rs. 2500/-");
        }
    }
}

/*Q20. Write a program to input basic salary of an employee and calculate its Gross salary 
according to following:
• Basic Salary <= 10000 : HRA = 20%, DA = 80%
• Basic Salary <= 20000 : HRA = 25%, DA = 90%
• Basic Salary > 20000 : HRA = 30%, DA = 95% */

public class Q20 
{
    public static void main(String[] args) 
    {
        int BS=25000;

        if(BS<=10000)
        {
                double HRA=((20.00/100.00)*BS);
                double DA=((80.00/100.00)*BS);

                System.out.println("Base Salary is Rs " + BS + " HRA is Rs " + HRA + " DA is Rs " + DA);
                System.out.println("Gross Salary is Rs " + (BS+HRA+DA));
        }

        else if(BS<=20000)                          //else if zruri h kyoki jo cheez 10000 se choti h wo 20000 se bhi h mgr here agr ooper wla execute hogya to ye nhi hoga thats why fine
        {
                double HRA=((25.00/100.00)*BS);       
                double DA=((90.00/100.00)*BS);

                System.out.println("Base Salary is Rs " + BS + " HRA is Rs " + HRA + " DA is Rs " + DA);
                System.out.println("Gross Salary is Rs " + (BS+HRA+DA));
        }

        else                         
        {
                double HRA=((30.00/100.00)*BS);       
                double DA=((95.00/100.00)*BS);

                System.out.println("Base Salary is Rs " + BS + " HRA is Rs " + HRA + " DA is Rs " + DA);
                System.out.println("Gross Salary is Rs " + (BS+HRA+DA));
        }
    }
}

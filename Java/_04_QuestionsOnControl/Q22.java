/*22. while purchasing certain items, a discount of 10% is offered if the quantity purchased is 
more than 100. If quantity and price per item are input through the keyboard, write a 
program to calculate the total expenses */

public class Q22 
{
    public static void main(String[] args) 
    {
        int QuantityPurchased=110;
        int PricePerEach=10;

        int TotalPrice = QuantityPurchased * PricePerEach;
        double Discount = (10.00/100) * TotalPrice ;       //double (10/100) = 0 , 
        double DiscountedPrice = TotalPrice-Discount;

        if(QuantityPurchased>100)
        {
            System.out.println("Total Expense=" + DiscountedPrice + " Rs");
        }

        else
        {
            System.out.println("Total Expense=" + TotalPrice + " Rs");
        }
    }
}

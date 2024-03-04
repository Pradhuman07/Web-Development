package Java_Old._02_ConditionalStatements;
/*Q32. Given the length and breadth of a rectangle.
Write a program to find whether the area 
of the rectangle is greater than its perimeter or vice versa.*/

public class Q32_AreaAndPerimeter {
    public static void main(String[] args) {
        int Length=4,Breadth=5;

        int Area=Length*Breadth;
        int Perimeter=2*(Length+Breadth);

        if(Area>Perimeter)
        {
            System.out.println("Area is Greater than Perimeter");
        }

        else
        {
            System.out.println("Perimeter is greater than Area"); 
        }

        String y = Area>Perimeter ? "Area is Greater than Perimeter" : "Perimeter is greater than Area" ;
        System.out.println(y);
    }    
}

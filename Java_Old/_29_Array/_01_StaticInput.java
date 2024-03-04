package Java_Old._29_Array;

public class _01_StaticInput
{
    public static void main(String[] args) 
    {
        int[] arr= new int[5];

        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        arr[2]=17;  //Data Updation is Possible

        for(int a:arr)
        {
            System.out.println(a);
        }

        //arr[5]=60;   //Index 5 out of bounds for length 5...
        // Size can't be exceed during the run time [but can be during compile time obviously]
        //Actually O.S na memory fix krdeta h...ab jo fix ke alawa baaki ka space h wo OS backend programs ko dedega to ab wo khaali nhi rha

    }
}
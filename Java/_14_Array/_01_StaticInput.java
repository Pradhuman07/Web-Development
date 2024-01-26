package Java._14_Array;

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

        arr[2]=100;  //Data Updation is Possible

        System.out.println(arr[2]);

        //arr[5]=60;   //Index 5 out of bounds for length 5...
        // Size can't be exceed during the run time [but can be during compile time obviously]

        int[] arr2 = new int[]{10,20,30};
        System.out.println(arr2[2]);

        // arr[4]=50;
        // System.out.println(arr2[4]); //Index 4 out of bounds for length 3
        //Actually O.S na memory fix krdeta h (4*size_of_Array bytes)...ab jo fix ke alawa baaki ka space h wo OS backend programs ko dedega to ab wo khaali nhi rha

        int[] arr_m1= new int[5];

        arr_m1[0]=10;
        arr_m1[1]=20;
        arr_m1[2]=30;
        arr_m1[3]=40;
        arr_m1[4]=50;
        
        int arr_m2[] = {10,20,30,40,50};
        int[] arr_m3 = {10,20,30,40,50};
        int arr_m4[] = new int[] {10,20,30,40,50};
        int[] arr_m5 = new int[] {10,20,30,40,50};
        
        // int[] arr_m6 = new int[];
        // arr_m6 = {10,20,30,40,50};     //wrong

        System.out.println(arr_m1[2]);
        System.out.println(arr_m2[2]);
        System.out.println(arr_m3[2]);
        System.out.println(arr_m4[2]);
        System.out.println(arr_m5[2]);

    }
}
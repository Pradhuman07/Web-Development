package Java_Old._29_Array;

public class _05_forVsforEach 
{
    public static void main(String[] args) {
        int arr[] = {1,2,3};

        for(int i=0 ; i<3 ; i++)
        {
            System.out.println(arr[i]);
        }

        for(int a:arr)
        {
            System.out.println(a);
        }
    }
}
/*      ForEach Loop(Advance for loop/Enhanced for loop):-

    -It is only used in the concept of Array
    -It is used for Displayiing Purpose
    -Taking input using forEach is not allowed

    Synatx of ForEach Loop:-

            for(datatype variable_name: array_name) 
            {
                sout(variable_name);
            }  

        //datatype inside wla depends upon the datatype of elements of array


Advantages of Using for each loop over For loop:-

for loop se bhi hm display kra skte h array elements but wha pr indexing batana pdta h...aur indexing hmesha lfda krjayega

            for(int i=0 ; i<size/no.of.elements ; i++)
            {
                sout(arr[i]);
            }
*/
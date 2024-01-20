//Q3. Print a,c,e...w,y

public class Q3
{
    public static void main(String[] args)
    {
        for(char i=97 ; i<=122 ; i++)
        {
            if(i%2!=0)                  //ascii for a is 97 ,for c is 99 ,for e is 101 ..which means we want odd ones
            {
            System.out.println(i);
            }
        }
    }
}

/*
    NOTE:- Another Method
        for(char i=97 ; i<=122 ; i++)
        {
            System.out.println(i);
            i++;
        }   
*/
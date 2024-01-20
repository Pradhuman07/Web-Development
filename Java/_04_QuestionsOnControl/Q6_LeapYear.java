//Q6. Write a program to check whether a year is leap year or not

public class Q6_LeapYear 
{
    public static void main(String[] args) 
    {
        int year=1800;

        if(year%4==0 && year%100!=0)
        {
            System.out.println(year + " is a Leap Year");
        }

        else if(year%4==0 && year%100==0) 
        {
            if(year%400==00)
            {
                System.out.println(year + " is a Leap Year");
            }

            else
            {
                System.out.println(year + " is Not a Leap Year");
            }
        }

        else
        {
            System.out.println(year + " is Not a Leap Year");
        }

                //NOW LETS DO THIS BUY TERNARY OPERATOR

        String y = year%4==0 && year%100!=0 ? year + " is a Leap Year" : year%4==0 && year%100==0 ? year%400==00 ? year + " is a Leap Year" : year + " is Not a Leap Year" : year + " is Not a Leap Year" ;
        System.out.println(y);

        String z = year%4==0 && year%100!=0 ? "It is a Leap Year" : year%4==0 && year%100==0 ? year%400==0 ? "It is a Leap Year" : "It is Not a Leap year" : "It is Not a Leap Year" ;
        System.out.println(z);

        //y wla statements ko copy paste krke bnaya h
        //z wla direct bnaya h bina statements wle program ko dkhe

        //Note:-direct krna (logic soch soch kr) asan h + error ke chances bhi km h + shi tarika h
        //copy paste mein confused horhe + errors aarhe (? aur : wle) + Exp1,Exp2 bla bla

        //BUT HA EK CHEEZ ALWAYS REMEMBER...WHENEVER YOU TYPE A (?) , ALWAYS TYPE ONE (:) WITH IT   [WETHER DOING COPY PASTE OR DOING DIRECT]
        //NO.(?) = NO.(:) #ALWAYS
    }
}

//Q6. Write a program to check whether a year is leap year or not
package Java_Old._02_ConditionalStatements;
public class Q6_LeapYear 
{
    public static void main(String[] args){

        int year=1800;

        if(year%4==0 && year%100!=0){
            System.out.println("Leap Year");
        }

        else if(year%4==0 && year%100==0){

            if(year%400==00){
                System.out.println("Leap Year");
            }

            else{
                System.out.println("Not a Leap Year");
            }
        }

        else{
            System.out.println("Not a Leap Year");
        }

                //NOW LETS DO THIS BUY TERNARY OPERATOR

        String z = year%4==0 && year%100!=0 ? "Leap Year" : year%4==0 && year%100==0 ? year%400==0 ? "Leap Year" : "Not a Leap year" : "Not a Leap Year" ;
        System.out.println(z);

        //Note:-direct krna (logic soch soch kr) asan h + error ke chances bhi km h + shi tarika h
        //copy paste mein confused horhe + errors aarhe (? aur : wle) + Exp1,Exp2 bla bla

        //BUT HA EK CHEEZ ALWAYS REMEMBER...WHENEVER YOU TYPE A (?) , ALWAYS TYPE ONE (:) WITH IT   [WETHER DOING COPY PASTE OR DOING DIRECT]
        
        //NO.(?) = NO.(:) #ALWAYS
    }
}

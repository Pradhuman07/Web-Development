public class _06_AssignmentOperator 
{
    public static void main(String[] args) 
    {
        int x=2,y=3,z=4,t=5,u=6;

        x+=3;                   //x=x+3;
        y-=3;
        z*=3;                   //z=z*3;
        t/=3;
        u%=3;                   //u=u%3

        //since x,y,z,t,u are variables therefore there values can be changed
        //note:-there last value got printed.

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);
        System.out.println(u);


        int a=3;
        a+=5;     //a=a+5 = 3+5 = 8
        a-=3;     //a = a-3 = 8-3=5
        System.out.println(a);
    }
}

package Java_Old._30_OOPS;
public class test 
{
    static int bataya()
    {
        return 5;
    }

    public static void main(String[] args) 
    {
        test var = new test();
        test.A refA = var.new A();    //A ref1 = ref.new A();   ...also correct
    
        test.A.C refC = refA.new C();

        refA.j = 80;                //j class A ka instance variable h(object ka variable) therefore we need object i.e refernce variable
        System.out.println(refA.j); //rv.iv

        double y = refC.Pradyuman();
        System.out.println(y);

        D refD = new D();
        float ans = refD.h;
        System.out.println(ans); //directly ...System.out.println(refD.h);...also correct blki better h

        var.bataya(); //static method is also called as Class Method...class ke ref se isse bnaya h

        D.E refE = refD.new E();
    }   

    class A
    {
        int j = 90;
        class C
        {
            double Pradyuman()
            {
                int h = 67;
                System.out.println(h);
                // Pradyuman();
                // System.out.println(Pradyuman());
                return 90.9;
            }
        }
    }
}


class D 
{
    float h = 90.9f;

    class E
    {

    }
}
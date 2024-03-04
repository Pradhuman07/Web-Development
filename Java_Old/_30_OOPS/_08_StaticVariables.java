package Java_Old._30_OOPS;
public class _08_StaticVariables 
{
    public static void main(String[] args) 
    {
        System.out.println(class2.y);    //static variable(class ka variable)

        class2 ref = new class2();
        System.out.println(ref.x);       //instance variable(object ka variable)
    }
}

class class2
{
    int x=2;    //instance(object) variable...To access it(you have to create instance/object) use---> object.instancevariable;
    static int y = 5;   //This is Static/Class variable...class ka variable....to use it u not need to creatw eobject just call through class
}

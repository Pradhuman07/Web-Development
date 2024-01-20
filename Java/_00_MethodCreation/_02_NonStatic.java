public class _02_NonStatic 
{
                                            //int num;    also if
    int joy(int n)
    {
        int num = n;                        //num=n;      then
        return num;
    }

    public static void main(String[] args) 
    {
        _02_NonStatic var = new _02_NonStatic();

        int R = var.joy(5);       //referencevariable.methodname(); ...method ko object ke sath jodte h...baaki sb as it is
        System.out.println(R);
    }
}
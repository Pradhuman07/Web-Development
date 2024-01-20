public class _03_Constructor
{
    int num;                        //Instance Variable

    _03_Constructor(int n)
    {
        num=n;                  //Direct --> int num = n; --> nhi likh skte
    }

    public static void main(String[] args)
    {
        _03_Constructor var = new _03_Constructor(5);        //var -> Reference Variable
        
        int R = var.num;            //RefernceVariable.InstanceVariable     [var._03_Constructor...WRONG]
        System.out.println(R);                                              //(constructor ko call nhi krskte..uski andr ke variables ko krte h)
    }                               
}

//Instance Variable,Object ka variable
//Reference variable,address of the object 

//Refernce variable Instance variable ko point krta h
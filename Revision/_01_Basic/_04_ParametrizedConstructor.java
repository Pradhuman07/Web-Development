package Revision._01_Basic;

public class _04_ParametrizedConstructor {

    int num;   //(Global variable) Instance variable i.e Object ka variable (Heap Memory) (No GV in Java)

    _04_ParametrizedConstructor(int x)
    {
        num = x;
    }
    
    public static void main(String[] args) {

        _04_ParametrizedConstructor ref = new _04_ParametrizedConstructor(32);
        
        System.out.println(ref.num);

        int number = ref.num;          
        System.out.println(number);
    }
}

// NOTE:- You can't call an Constructor (Neither statically nor non-statically) (Although it is automatically called when you create the object but u can't call it manually). You can only access its properties by using non static reference
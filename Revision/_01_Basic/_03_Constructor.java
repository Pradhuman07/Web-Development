package Revision._01_Basic;
public class _03_Constructor {

    _03_Constructor()
    {
        System.out.println("Hello! Run Java");
    }

    public static void main(String[] args) {        
        new _03_Constructor();
    }
}

// Constructor is a special method which has:-
// i)Name = Class Name
// ii)and No return datatype

// It is automatically created and called in background whenever u create an object of a class.

// NOTE:- You can't call an Constructor (Neither statically nor non-statically) (Although it is automatically called when you create the object but u can't call it manually). You can only access its properties by using non static reference
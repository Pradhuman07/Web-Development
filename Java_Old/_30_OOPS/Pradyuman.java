package Java_Old._30_OOPS;
public class Pradyuman 
{
    public void display()
    {
        System.out.println("Hii");
    }

    // public abstract void notdisplay(); //  this is now abstract method..iski body nhi hoti #incomplete.. ab isko acces nhi kr payenge

    public static void main(String[] args) 
    {
        Pradyuman ref = new Pradyuman();
        ref.display();
    }

}
//remeber display() ek non static method h aur non static method ko call krne ke liye we need object...since display() is in class Pradyuman therefore make the object of Pradyuman...then give the object name/variable called reference variable and by using that reference variable call display().

//abstract class ka object nhi bnaya ja skta...cant be instantiated...cant be implemented..
//Abstract means incomplete
//agr class ke andr ek bhi method abstract h, to class should also be abstract
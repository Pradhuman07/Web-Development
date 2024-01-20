public class classA
{
    static int m1()
    {
        return 1;
    }

    int m2()
    {
        return 2;
    }

    class classB
    {
        class classC
        {

        }
    }

    public static void main(String[] args) 
    {
        classA ref_A = new classA();

        int x =m1();
        int y =ref_A.m2();

        classA.classB ref_B = ref_A.new classB();     //direct..classB ref_B = ref_A.new classB(); ...bhi likh skte h but it is better since classB is inside classA
        classA.classB.classC ref_C = ref_B.new classC();

        classH ref_H = new classH();
        classH.classK ref_K = ref_H.new classK();

        int z = ref_H.h;  //RV.IV;   //h is a non static variable...therefore call it like you call nonstatic method...i.e rv.methodname();...see last 5 lines of program commentout wali
        System.out.println(z);    //classH ka agr instance use krna h to classH ka object use krna pdega i.e ref_H
    }
}


class classH
{
    class classK
    {

    }

    int h = 2;     //instance variable
    
}







// public class A
// {
//     static int m1()
//     {
//         return 1;
//     }

//     int m2()
//     {
//         return 2;
//     }

//     class B
//     {

//     }

//     public static void main(String[] args) 
//     {
//         A ref_A = new A();

//         m1();
//         ref_A.m2();
//         ref_A.new B();
//         ref_H.h;
//     }
// }
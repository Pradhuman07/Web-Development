//Create 2 non static method named India and Srilanka

//Create the object inside India and Sri lanka. 
//The object which is created inside India has 2 variables named Virat and Gill. 
//Virat holds the run of Virat kohli and Gill holds the run of Shubman Gill.

//The Object which is inside Srilanka has 2 data members named Bumrah and Shami.
//Bumrah has no. of wkts and Mohd.Shami has no. of wkts.

public class _04_Cricket 
{
    int Virat;
    int Gill;

    _04_Cricket(int v,int g)       //ye wala constructor(Parametrized Constructor) India method ke object ke liye bnaya h...dkho uske pass argument h..isliy yha paramters
    {
        Virat=v;                    
        Gill=g;
    }

    void India()
    {
        _04_Cricket var = new _04_Cricket(88,92);   //since,given in question..that object has variables...mtlb yhi daalna pdenge...aur ye to constructor calling h that means we have to create constructor  //Parametrizzed Constructor ka Parametrized Object
        
        int R=var.Virat;                //RV.IV
        System.out.println(R);

        int T=var.Gill;                 //RV.IV
        System.out.println(T);
    }



    _04_Cricket()               //ye wala constructor(Default Constructor) main method ke object ke liye bnaya h...dkho uske pass koi argument nhi h..isiliye yha koi parameter nhi
    {
                                //This constructor is just created to call the non static method India
    }

    public static void main(String[] args) 
    {
        _04_Cricket gar = new _04_Cricket();            //Un-Parametrizzed Constructor ka Un-Argumented Object
        gar.India();                                    //RV.Method()     //Here we have called the non static method India

        class2.main(args);              //or class2.joy(); if you dont want to create main method in the class2, rename that main method into joy();
        //Remeber the Property no.1 of Static Methods--> You can call static methods of another class by using ---> Class_name.Method_name(); ---> but this is not possible with non static methods
        //Therefore we have called the non static method Srilanka() in the static method in class2 only and then here we have called that static method in our Primary class...since we can call static methods but not non-static methods(of another class)
    }
}





class class2
{
    int Shami;
    int Bumrah;

    class2(int s,int b)                 //Parametrized Constructor for argumented object created at line 59
    {
        Shami=s;
        Bumrah=b;
    }

    void Srilanka()
    {
        class2 var = new class2(5,1);           

        int R=var.Shami;
        System.out.println(R);

        int T=var.Bumrah;
        System.out.println(T);
    }



    class2()                            //Un-Parametrized Constructor (or defaullt constructor) for Un-argumented object created inside main method to call the non static method Srilanka
    {

    }


    public static void main(String[] args)            //or public static void joy(); if you dont want to create 2 main methods
    {
        class2 gar = new class2();
        gar.Srilanka();
    }
}

//Remeber the Property no.1 of Static Methods--> You can call static methods of another class by using ---> Class_name.Method_name(); ---> but this is not possible with non static methods
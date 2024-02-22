package Revision._01_Basic;
public class _08_StackOverflow 
{
    public static void main(String[] args) 
    {
        System.out.println("Hi");

        main(args); //function call kia h....remeber call krte wkt argument dete h wo bhi bina datatype ke
    }
}

//hi,hi,hi.....after sometime error bcoz stack overflow...uss stack ki allocated memory khtm
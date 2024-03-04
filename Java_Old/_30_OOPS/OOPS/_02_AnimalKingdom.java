package Java_Old._30_OOPS.OOPS;

class Dog{
    String name = "Tommy";
    int age = 2;

    void eat(){
        System.out.println("Dog is eating");
    }
    void sleep(){
        System.out.println("Dog is sleeping");
    }
}

public class _02_AnimalKingdom {

    public static void main(String[] args) {

        Dog d1 = new Dog();

        System.out.println(d1.name);
        d1.sleep();
    }
}

//Dot is a operator which provides us access of the 
//Q.How many public class can be present in a program
//Ans. Only One that too in which main method is present
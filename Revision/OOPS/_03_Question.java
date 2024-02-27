//Q.WAP to create a class Student having their name,roll no.,branch and mark of three subjects.
//You should display the average of 5 students with their respective names and roll no.
package Revision.OOPS;

class Student {

    String name = "Rahul";
    int roll = 20;
    String branch = "CS";

    int m1=40;
    int m2=50;
    int m3=60; 

    double Average(int m1,int m2 , int m3){ 
        int sum = m1+m2+m3;
        double average = sum/3;
        return average;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Branch: " + branch);
        System.out.println("Average: " + Average(m1,m2,m3));
    }

}

public class _03_Question {
    public static void main(String[] args) {

        Student Rahul = new Student();

        Rahul.display();

        // System.out.println("Name: " + Rahul.name);
        // System.out.println("Roll No.: " + Rahul.roll);
        // System.out.println("Average marks: " + (Rahul.m1 + Rahul.m2 + Rahul.m3)/3);
    }
}

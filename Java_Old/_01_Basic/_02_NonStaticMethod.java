package Java_Old._01_Basic;

public class _02_NonStaticMethod {

    int joy(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        _02_NonStaticMethod ref = new _02_NonStaticMethod(); //Object creation
        System.out.println(ref.joy(5,3));   //Calling non static method by using object

        int result = ref.joy(2,4);   
        System.out.println(result);     
        //method ki return value variable mein store krrhe aur fir uss variable ko print krarhe
    }
}
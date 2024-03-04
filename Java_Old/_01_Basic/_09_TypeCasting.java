package Java_Old._01_Basic;
public class _09_TypeCasting {
    public static void main(String[] args){

      int a=(int)45.83f;
      int b=(int)09.34;

      float c=5.33f;
      int d=(int)c;   //d=integer part of c
      
      // int x=0;
      // boolean y = (boolean)x;   //Not possible in java

      // boolean x=true;
      // int y = (int)x;

      System.out.println(a+b+c+d);
    }
}

        // #Unicode  / ASCII Values
        // char x = 65-90 ; sout(x) ; A-Z 
        // char x = 97-122; sout(x) ; a-z
//Q3.Print small letter alphabets and Capital letter alphabets
package Java_Old._03_ForLoop;
public class Q3_PrintAtoZandatoz {
    public static void main(String[] args) {
        System.out.println("Capital Letters are:-");
        
        for(char x=65; x<=90 ; x++){
            System.out.print(x + ",");
        }

        System.out.println();
        System.out.println("Small Letters are:-");

        for(char x=97; x<=122 ; x++){
            System.out.print(x + ",");
        }
    }
}
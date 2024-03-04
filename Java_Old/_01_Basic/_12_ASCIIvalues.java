// #Unicode  / ASCII Values
// char x = 65-90 ; sout(x) ; A-Z 
// char x = 97-122; sout(x) ; a-z
package Java_Old._01_Basic;
public class _12_ASCIIvalues {
    public static void main(String[] args) {

        int x='A';
        System.out.println(x);     // o/p = 65

        char y=65;
        System.out.println(y);     // o/p = A

        for(char i=65; i<=90 ; i++){
            System.out.print(i + ",");
        }

        System.out.println();
        
        for(char j=97; j<=122 ; j++){
            System.out.print(j + ",");
        }

        System.out.println();
        System.out.println( 'a' > 'A' );
    }
}

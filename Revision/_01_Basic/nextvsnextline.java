package Revision._01_Basic;
import java.util.Scanner;
public class nextvsnextline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String word = sc.next();

        System.out.println(sentence);
        System.out.println(word);
    }   
}
//Diff b/w next and nextLine
// nextline mein u can take sentencces input(next line compiler ko btata h ki space ke bad bhi string hi h)
// next mein only u can take only one word but not sentences
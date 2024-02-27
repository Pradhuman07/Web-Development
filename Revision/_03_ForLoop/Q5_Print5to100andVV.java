package Revision._03_ForLoop;

public class Q5_Print5to100andVV { 
    public static void main(String[] args){
        
        for(int i=5; i<=100 ;i++  /*or (i+=5) */){
            if(i%5==0){
                System.out.print(i + ",");
            }
        }

        for(int j=100; j>=5 ;j-=5){
            System.out.print(j + ",");
        }

    }
}
package Java._15_2dArray;

import java.util.Scanner;

public class _02_Addition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and column for both the Matrix:");

        int row = sc.nextInt();   
        int col = sc.nextInt();
        
        // 1st Matrix

        int arr1[][] = new int[row][col];

        System.out.println("Enter the elements of 1st Matrix");
        
        for(int i=0 ; i<row ; i++){
            for(int j=0; j<col ; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        
        // 2nd Matrix (Same Row and Column)
        
        int arr2[][] = new int[row][col];
        
        System.out.println("Enter the elements of 1st Matrix");

        for(int i=0 ; i<row ; i++){
            for(int j=0; j<col ; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        //Addition of both the matirx

        int arr[][] = new int[row][col];

        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                arr[i][j]=arr1[i][j] + arr2[i][j] ;
            }
        }

        //Display 

        System.out.println("Your 1st Matrix:-");
        
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Your 2nd Matrix:-");
        
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        
        //Addition wala display

        System.out.println("Your Addition Matrix:-");

        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

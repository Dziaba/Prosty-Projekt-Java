package com.hubert.wyrwisz;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Choose, what type would you like to print: ");
        System.out.println("1. Pyramid");
        System.out.println("2. Reverse pyramid");
        System.out.println("Diamond");
        int choice = scanner.nextInt();

        System.out.println("Perfect! Now, tell us the size of the print, how many lines should it include?");
        int length = scanner.nextInt();

        switch (choice){
            case 1:

            for(int i = 1; i <= length ; i++){ //3 linii  // jezeli i jest mniejsze lub rowne dlugosci, przeprowadz operacje w sordku i i++
                    for(int k=1; k <= length - i; k++){ // silnik rowna sie 1, jesli silnik mniejszy rowny dlugosci odjac silnik wiekszy przeprowadz
                        System.out.print(" ");  // wydrukuje 2 spacje 
                    }
                    for (int j=1; j<= ((2 * i) - 1); j++){
                        System.out.print("*");  //wydrukuje 1 gwiazdki
                    }

                    System.out.println();


            }
            scanner.close();
            break;

            case 2:

            for (int i = 1; i <= length; i++){ //length 3 
                for(int k=0; k <= i - 1; k++){ 
                        System.out.print(" ");  // wydrukuje 2 spacje 
                    }
                    for (int j=1; j<= (2 * (length - i -1)+1); j++){
                        System.out.print("*");  //wydrukuje 1 gwiazdki
                    }
                    System.out.println();


            }
            scanner.close();
            break;

            case 3:
            for(int i = 1; i <= length ; i++){ //3 linii  // jezeli i jest mniejsze lub rowne dlugosci, przeprowadz operacje w sordku i i++
                for(int k=1; k <= length - i; k++){ // silnik rowna sie 1, jesli silnik mniejszy rowny dlugosci odjac silnik wiekszy przeprowadz
                    System.out.print(" ");  // wydrukuje 2 spacje 
                }
                for (int j=1; j<= ((2 * i) - 1); j++){
                    System.out.print("*");  //wydrukuje 1 gwiazdki
                }

                System.out.println();
        }

        for (int i = 1; i < length; i++){ //length 3 
            for(int k=0; k <= i - 1; k++){ 
                    System.out.print(" ");  // wydrukuje 2 spacje 
                }
                for (int j=1; j<= (2 * (length - i -1)+1); j++){
                    System.out.print("*");  //wydrukuje 1 gwiazdki
                }
                System.out.println();


        }
        scanner.close();
        break;

            
           
                
            
        

        }
    }
}

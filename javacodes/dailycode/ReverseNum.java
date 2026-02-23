package javacodes.dailycode;
import java.util.Scanner;
public class ReverseNum {

    public static void main(String [] args) {

        Scanner key = new Scanner (System.in); //"in" => keyboard input
             int arr [] = new int [5];
        System.out.println("Please give me 5 numbers separated by a space: ");
          
              for (int i = 0; i <arr.length; i++){
                  arr [i] =key.nextInt();
                 }
        // no this isnt solvable with nested for but another loop
                for (int j=arr.length-1; j>=0;j--) {
                  System.out.print(arr[j]);
              //  }
              }

            } 
    }    

//Challenge: ask user for 5 inputs then reverse print it
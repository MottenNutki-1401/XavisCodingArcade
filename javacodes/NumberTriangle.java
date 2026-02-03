package javacodes;
public class NumberTriangle {
    public static void main (String args[]){

        //Our goal is to print a number pattern that resembles a triangle

            for (int i =1; i<=5; i++){
                    //we dont print i here the i will be executed first before the inner loop
                for(int j=1; j<=i; j++){
                    System.out.print(j+ " "); //if we dont add space it will look compressed, looks ugly
              }
             System.out.println();
       }
    }
}
//lol i just knew it today that vscode color codes curly braces not just for design
//the color codes corresponds to each curly brace pair
//so its easier to identify which curly brace closes which block
package cpcodes;

public class PairTarget {
    public static void main (String []args){

        int arr [] = {1,2,3,4,5,6};

        for (int i=0; i<arr.length; i++){ //first number picker
            for(int j=i+1; j<arr.length;j++){ //second number picker
                
                //if checker
                if (arr[i]+arr[j] == 10) { //dont add ; or the loop will terminate so it wont get checked
               
                System.out.print(+arr[i]+" " +arr[j]);
                }
            }
            
        }
        
    }
}
//Solve : Given an array integer find a pair combinations from those
//elements inside the array that will be equal to 10 
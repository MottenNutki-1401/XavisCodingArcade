package javacodes.helpermethods;

public class IntChecker {
    public static boolean isEven(int number){
        //wrong logic
        if (number%2<=0) {
//modulo => something % something
            return true;
        }
           else{
               return false;
           }
    }
    public static void main(String [] args) {
        int num =-3;
        boolean result = isEven(num);
        //must match the dt we wanna return, in this case its boolean
        System.out.println("is it even? " +result);
    }
}
//Quick notes:
//Parameter => placeholder variable the method uses (number)
//argument=> actual value you wanna send in method (num)
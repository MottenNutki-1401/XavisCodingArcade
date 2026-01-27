package javacodes;

public class StringFor {
    public static void main (String[] args) {

        for (String i= "hello world"; i.length() >2;){
            System.out.println(i);
        }
    }
    
}
//Note: This code will run infinetly because the condition will always be true since the string "hello world" will always have a length greater than 2
//we need an updater like (int i--;) but increment or decrement onlyworks with numbers and not strings DT
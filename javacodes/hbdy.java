package javacodes;
public class hbdy {
    public static void main (String[] args){

        String message = "Happy Birthday Gail!";
        String date = " 02-01-2003";
        int delay = 200;

        for (int i =0; i<message.length(); i++) {
            System.out.print(message.charAt(i));
            try{
                Thread.sleep(delay);
            } catch(InterruptedException e){
                e.printStackTrace();
        }

        
    }
    for (int j =0; j<date.length(); j++) {
        System.out.print(date.charAt(j));
        try{
            Thread.sleep(delay);
        } catch(InterruptedException e){
            e.printStackTrace();
    }
  }
}
}
//Note: Java doesnt let me use the delay without a try catch block
//java has two types of exceptions: checked and unchecked
//checked exceptions must be handled using try catch or by throwing it
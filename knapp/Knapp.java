import java.util.Scanner;


public class Knapp{

    public static void main(String[] args) {


       Scanner input = new Scanner(System.in);
       System.out.println("Is the sky blue");
       String a = input.next();

       if(a.equalsIgnoreCase("yes")){ 
           System.out.println("true");
       }
       else if(a.equalsIgnoreCase("no")){
           System.out.println("nope your stupid");
       }
       else{
           System.out.println("this is what it is returning instead of using the if or elseif statement " + a);
        }
    }
}

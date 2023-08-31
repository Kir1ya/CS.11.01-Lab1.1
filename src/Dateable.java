import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner userAge = new Scanner(System.in); //userAge will be what the user types
        System.out.print("How old are you?"); //Asks user how old they are
        int answer = userAge.nextInt(); //Takes the answer (recognizes it as a integer)
        int dateAge = answer/2+7; //Calculate ideal dating age
        System.out.println(answer + "-year olds should date somebody who is at least " + dateAge + " years old."); //Output after calculation
    }
}

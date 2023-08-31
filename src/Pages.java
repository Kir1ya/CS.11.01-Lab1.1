import java.util.Scanner;
public class Pages {

    public static void main(String[] args) {
        Scanner userAge = new Scanner(System.in); //userAge will be what the user types
        System.out.println("Enter your age."); //Asks user how old they are
        int input = userAge.nextInt(); //Takes the answer (recognizes it as a integer)
        int output = 100-input; //Calculate ideal dating age
        System.out.println(input + "-year olds should read at least " + output + " pages before giving up on a book."); //Output after calculation

    }
}

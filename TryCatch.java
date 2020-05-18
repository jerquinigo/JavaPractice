import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TryCatch {

    public String userInputTry(){
        try {
        Scanner scan = new Scanner(System.in);

            System.out.println("what is your favorite number? ");

        String favoriteNum = scan.nextLine();

            return "favorite color is " + favoriteNum.toString();
        }
        catch(InputMismatchException exception) {
            return "Invalid input, please try again";
        }
     
    }

    public static void main(String[] arg){
        try{
        int[] arr1 = null;
        System.out.println(arr1.length);
        }
        catch(NullPointerException exception) {
            System.out.println("Your array is null");
        }
        catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println("Your index is out of bounds");
        }
        catch(Exception exception) {
            // this is how to handle catch all exceptions
            System.out.println("Something else went wrong");
        }

        TryCatch userTest = new TryCatch();
        System.out.println(userTest.userInputTry());
    }
}
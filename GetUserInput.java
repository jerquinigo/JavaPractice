import java.util.Scanner;

public class GetUserInput {


    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your first name? ");
            String name = scan.next();
        
        System.out.println("What is your age?" );
            int age = scan.nextInt();
       
        System.out.println("what is your favorite quote? ");
            //next will only see the next word and terminates once it sees the white space. If there is a sentance, it will only display the first word.
            String quote = scan.next();
            //adding this will add the word and concat the rest of the line.
            quote = quote + scan.nextLine();

        System.out.println("Thank you " + name);
        System.out.println("So you are " + age + " years old and your favorite quote is " + quote);
        scan.close();



    }
}
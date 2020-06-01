import java.util.Stack;
public class StackPractice {

    public static void main(String[] args) {
        Stack<String> games = new Stack<String>();
        //its a stack. so bottom to top insertion
        games.add("Call of duty");
        games.add("Guitar Hero");
        games.add("Super mario bros");

        System.out.println(games.pop());
        System.out.println(games);
        System.out.println(games.peek());
        System.out.println(games);



        Stack<Character> tower = new Stack<Character>();
        //you add from the top down

        tower.add('R');
        tower.add('B');
        tower.add('Y');

        System.out.println(tower.contains('P'));
        System.out.println(tower.isEmpty());
        System.out.println(tower.get(1));
        //indexing gets from bottom to top
        //peeking is from the top of the stack

        //replacing blue with pink

        System.out.println(tower.set(1,'P'));
        System.out.println(tower);
    }
}
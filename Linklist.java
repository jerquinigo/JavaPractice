import java.util.LinkedList;
import java.util.Iterator;

public class Linklist {
    
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("Jon");
        ll.add("Daniel");
        ll.add("Matthew");

        ll.remove();
        // this will remove from the front

        
        System.out.println(ll);

        // to iterate through a huge list of link list nodes, we will use the iterator class to do the task.
        //this will set up the iterater and use the iterator method on link list
        Iterator iterate = ll.iterator();

        // now we use a while loop using the hasNext() method. iterate will be the variable we ill be using
        while(iterate.hasNext()) {
            if(iterate.next() == "Daniel") {
                System.out.println("found Daniel");
            }
        }


    }
}
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;


public class SetExample {
    
    public static void main(String[] arg) {
        // to use set, we will have to initialize the HashSet class
        //sets will only allow unique elements added to it. 
        //hashing does not save everything in an ordered sequence. Will have to use lists or arrays for that
        Set<Integer> values = new HashSet<>();
        values.add(2);
        values.add(4);
        values.add(6);

        for(int i : values) {
            System.out.println(i);
        }
        //currently printing in order, but not guaranteed as set gets bigger. 
        
          //To store sets in an ascending order, we use treeSet
        Set<Integer> ascValues = new TreeSet<>();
        
            ascValues.add(100);
            ascValues.add(77);
            ascValues.add(1);
            ascValues.add(3);

        for(int i : ascValues) {
            System.out.println(i);
        }        
        // this will print out 1,3,77,100
        //this will print out in ascending order(TreeSet)
    }
    
}
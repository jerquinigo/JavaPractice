import java.util.HashSet;
import java.util.Iterator;


public class HashSetExample {
    
    public static void main(String[] args) {
        //its a set of data that you give it
        HashSet<String> hash1 = new HashSet<String>();

        hash1.add("lemur");
        hash1.add("orangatang");
        hash1.add("spider monkey");
        hash1.add("silverback gorilla");


        System.out.println(hash1);
        System.out.println(hash1.size());
        System.out.println(hash1.contains("lemur"));


        HashSet<Integer> hashbrowns = new HashSet<Integer>();

        hashbrowns.add(13);
        hashbrowns.add(24);
        hashbrowns.add(5);

        //different iterators
        //can turn the hashbrowns to an array and then iterate it like you would with an array

        // use object instead of integer to copy the arr.
        // you cannot rely on the order that a hashset stores data. It will be stored randomly and will reflect that even after it is turned into an array.
        Object[] hashbrownArr = hashbrowns.toArray();

        System.out.println(hashbrownArr[0]);
        //prints out 5
        System.out.println(hashbrownArr.hashCode());
        // the hashcode is the algorithm it uses to disperse and store the data. 
        //697960108 is the algorithm value used for this instance
     

        // we will now iterate through the hash set

        Iterator<Integer> iterate = hashbrowns.iterator();

        while(iterate.hasNext()) {
            System.out.println(iterate.next());
        }
        // this will print out 5,24,13
        

        
    }
}
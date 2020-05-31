import java.util.HashMap;

//Hashmaps are an unorderded collections. 

public class Hashmap {

    public static void main(String[] args) {
        HashMap<String, Integer> obj = new HashMap();
        obj.put("a", 10);
        obj.put("b", 3);
        obj.put("c", 88);

        for(String key : obj.keySet()) {
            System.out.println(obj.get(key));
        }
        // this will key into the hashmap and will print out 10,3,88


        HashMap<String, String> userObj = new HashMap<String, String>();

        userObj.put("jon", "developer");
        userObj.put("Daniel", "SysOps");

        System.out.println(userObj);

        userObj.remove("Daniel");

        System.out.println(userObj);

        System.out.println(userObj.containsValue("developer"));
        //prints out true



    }
}
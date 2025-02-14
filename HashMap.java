// "static void main" must be defined in a public class.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
       HashMap<String,String> arr = new HashMap<>();
        
       //Insertion 
       arr.put("Uzumaki","Naruto");
       arr.put("Uchiha","Itachi");
       arr.put("Hyuga","Hinata");
        System.out.println("Size before removing one key-value pair: "+arr.size());
        
       //Get the value using the key
       System.out.println(arr.get("Uzumaki"));
       System.out.println(arr.getOrDefault("Hatake","Not Found"));
        
       //Remove
       arr.remove("Uchiha");
       System.out.println("Size after removing one key-value pair: "+arr.size());
        
       //Traverse 
        for(String i:arr.keySet()){
            System.out.println(arr.get(i));
        }
        for(String i:arr.values()){
            System.out.println(i);
            
        }
        
        //Checking a key
        System.out.println(arr.containsKey("Hatake"));
        
        //adding a new pair
        arr.put("Hatake","Kakashi");
        System.out.println(arr.size());
        
        //Clear
        arr.clear();
        System.out.println(arr.isEmpty());
        
        
        
    }
}

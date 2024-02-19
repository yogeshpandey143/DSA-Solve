package Hashing;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {


    public static void main(String[] args) {


        HashMap<String, Integer> map  = new HashMap<>();
        map.put("India",150);
        map.put("Chaina",170);
        map.put("US",50);
        map.put("Huia",19);


        System.out.println(map);
// funtion in HashMap----->>>>


// search the element;

        if(map.containsKey("Chaina")){
            System.out.println("Key is present in the map");
        }
        else System.out.println("Key is present in the map");

        System.out.println(map.get("Chaina"));



        // iteration  in hashmap


        // using entry map --->>

        for(Map.Entry<String,Integer> e: map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // using for each

         for(String  name : map.keySet())
         {
             System.out.println(name);

             System.out.println(map.get(name));

         }

         map.remove("Chaina");
        System.out.println(map);
    }






}

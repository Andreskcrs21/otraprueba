
package explicacion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Explicacion {

    public static void main(String[] args) {
        String nombre;
        ArrayList<String> nom = new ArrayList<>();
        nom.add("Ignacio");
        nom.add("Juan");
        nom.add("Ignacio");
        nom.add("Juan");
        nom.add("Ignacio");
        nom.add("Juan");
        
        for(String al: nom){
            System.out.println(al);
        }
        
        System.out.println("===============");
        Set<String> alu = new HashSet<>();
        alu.add("Ignacio");
        alu.add("Emilia");
        alu.add("Ignacio");
        
        
        //System.out.println(alu.contains("Perro"));
        for(String a: alu){
            System.out.println(a);
        }
        
        System.out.println("===================");
        
        Set<String> estu = new TreeSet<>();
        estu.add("Ignacio");
        estu.add("Juan");
        estu.add("Angela");
        estu.add("Carlos");
        estu.add("Ignacio");
        
        for(String q : estu){
            System.out.println(q);
        }
       
        
        
        
                
        
        
    }
    
}

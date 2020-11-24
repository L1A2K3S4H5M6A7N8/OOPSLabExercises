
import java.util.*;
import java.util.ArrayList;

public class str_op {

    
    public static void main(String[] args) {
        
        
        Scanner obj=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        list.add(0,"apple");
        list.add(1,"ball");
        list.add(2,"leopard");
        list.add(3,"life");
        list.add(4,"doll");
        list.add(5,"people");
        list.add(6,"class");
        list.add(7,"mark"); 
        
        System.out.println("Contents of the array list: ");
        System.out.println(list);
        //Searching a string in the list by using arraylist
        
        
         System.out.println("Search the element=doll");
          
         if (list.contains("doll"))
         {
             System.out.println("Element Found");
         }  
            
         else
         {
            System.out.println("Element Not Found"); 
         }
    
             
        
      
        
        
         System.out.println("String that begin and end with the given letter(l):");
           
     for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
 if (str.endsWith("l")||(str.startsWith("l"))) 
 {
 System.out.println(str);

}
     }
    }
}


import java.util.Scanner;


public class Mail {

    
    public static void main(String[] args) {
        
           email obj=new email();
         
         obj=new email();
         obj.get();
         obj.creation();
         
    }
    
}
class email
{
    String FirstName;
    String LastName;
    
    //gettng first and last name from user
    void get() 
    {
         Scanner obj=new Scanner(System.in);
        
         System.out.println("Enter Firstname:");
         FirstName=obj.next();
        
         System.out.println("Enter Lastname:");
         LastName=obj.next();
          
    }
    //Creation of Email ID
    void creation()
    {
        String sub1 = FirstName. substring(0,3); 
        String sub2 = LastName. substring(0,4); 
        
        System.out.println("The E-Mail id is:");
        System.out.println(FirstName. substring(0,3)+"."+ LastName. substring(0,4)+".@vcet.edu.in");
      
     }  
}
// Email Id created
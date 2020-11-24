import java.util.Scanner;


public class User_Def_Exception {

   
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter name:");
        String s = obj.next();
         
        System.out.println("Enter age:");
        int age = obj.nextInt();
         
        System.out.println("Enter email id:");
        String email = obj.next();
        try
        {
            Person info=new Person(s);
            info.verify();
        }
        catch(Exception t)
        {
            System.out.println(t.getMessage());
        }
        
        
}
}
class Person
{
    String Name;
    int age;
    String e_mail;
   Person(String t)
   {
   
   Name=t;
   }
void verify() throws Exception
{
    for(int i=0;i<Name.length();i++)
        {
            if(((Name.charAt(i)>=97)&&(Name.charAt(i)<=122)) || ((Name.charAt(i)<=90)&&(Name.charAt(i)>=65)))
            {
                break;
              
            }
            else
            {
                throw new Exception("NameIncorrectFormatException");
                 
            }
        }
     
     System.out.println("No exceptions found");
}
}
class NameIncorrectFormatException extends Exception
{

    NameIncorrectFormatException(String s)
    {
        super(s);
    }
}
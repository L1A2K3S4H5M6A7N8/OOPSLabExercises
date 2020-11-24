import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_handling {
    public static void main(String[] args) throws FileNotFoundException,IOException{
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the file Name:");
        String FileName=obj.next();
        File f=new File(FileName);
        
        
        System.out.println("The name of the file is"+FileName.substring(0,FileName.indexOf('.')));
        System.out.println("The type of the file is"+FileName.substring(FileName.indexOf(".") + 1));
        
        //checking whether it is available
        if(f.exists())
             System.out.println(FileName+" exist");
        else
             System.out.println(FileName+" doesnot exists");
        
        //checking whether it is readable
        if(f.canRead())
             System.out.println(FileName+" is readable");
        else
             System.out.println(FileName+" is not readable"); 
        
        //checking whether is is writable
        if(f.canWrite())
             System.out.println(FileName+" is writable");
        else
             System.out.println(FileName+" is not writable");
        
        //checking whether it is executable
        if(f.canExecute())    
             System.out.println(FileName+" is executable");
        else
             System.out.println(FileName+" is not executable");
        
        //displaying the size
        System.out.println(FileName+" is: "+(byte)f.length());
        }
    }


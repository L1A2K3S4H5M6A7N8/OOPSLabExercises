import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Byte_Stream {
   
    public static void main(String[] args) throws FileNotFoundException,IOException{
        
        FileInputStream fin=null;
        FileOutputStream fout=null;
          
        fin=new FileInputStream("input.jpg");
        fout=new FileOutputStream("output.jpg");
        int i;
        while((i=fin.read())!=-1)
            fout.write(i);
        
        fin.close();
        fout.close();;
    }
}


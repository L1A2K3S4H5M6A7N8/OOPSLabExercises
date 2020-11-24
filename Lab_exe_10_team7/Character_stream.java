import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Character_stream {
    public static void main(String[] args) throws IOException,FileNotFoundException{
        
        
        FileReader fr=null;
        FileWriter fw=null;
        
        fr=new FileReader("input.jpg");
        fw=new FileWriter("output.jpg");
        int j;
        while((j=fr.read())!=-1)
            fw.write(j);
        
        fw.close();
        fr.close();
    }
}

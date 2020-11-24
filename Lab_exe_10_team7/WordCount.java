import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException,IOException{
        
        try (BufferedReader obj = new BufferedReader(new FileReader("WordCountFile.txt"))) {
            String read;
            int i,Word=0;
            String s[];
            while((read=obj.readLine())!=null)
            {
                s=read.split(" ");
                for(i=0;i<s.length;i++)
                {
                    System.out.print("*"+s[i]+"\n");
                    if(s[i].length()==3)
                        Word++;
                }
            }   System.out.println("Number of 3 letter words in the file is"+Word);
        }
    }
}


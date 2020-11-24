import java.util.Scanner;


public class Bin2Dec{
    
public static void main(String[] args) {
Scanner obj= new Scanner(System.in);
System.out.println("Enter the binary string:");
String st = obj.next();//getting a binary string
int n;
int s=0 , r= 0,c=1;
for(int i = 0; i < st.length() ; i++)
{
 if(st.charAt(i) =='1' || st.charAt(i) =='0')
 {
 c=1;
 }
else
 {
 c=0;
 }
}
if(c==0)
 {
    
 System.out.println("Invalid Binary String: "+st);

 }
else if(c==1)
 {

 n= Integer.parseInt(st);
 for(int i = 0; i < st.length() ; i++)
 {
 s= n%10;
 n= n/10;
 r= (int) (r+(s*Math.pow(2,i)));
 }
 
 System.out.println("The decimal number for "+st+" is:"+r);

 }
}
}

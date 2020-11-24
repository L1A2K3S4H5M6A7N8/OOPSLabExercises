
import java.util.Arrays;
import java.util.Scanner;


public class GenericOne {
    public static void main (String[] args){
              
    
            Integer n[]={1,2,3,4,5,6,7};
            test3<Integer> ob=new test3<>(n);
            System.out.println("Count of odd integers in the given Integer Array is ");
            ob.count();
        
            Integer num[]={1,2,3,4,5,6,7};
            test4<Integer> obj=new test4<Integer>();
            obj.swap(num,2,4);
            System.out.println("Exchanging positions in Integer array :"+Arrays.toString(num)); 
            
            Double d[]={3.00,6.00,9.00,12.00,15.00};
            test4<Double> obj3=new test4<Double>();
            obj3.swap(d,0,2);
            System.out.println("Exchanging positions in Double array"+Arrays.toString(d));
             Scanner obj4=new Scanner(System.in);
             
            Character c1[]={'c','h','a','r','a','c','t','e','r'};
            test4<Character> obj1=new test4<Character>();
            obj1.swap(c1,0,5);
            System.out.println("Exchanging positions in Character array"+Arrays.toString(c1));
             
            String s[]={"Hi","Hello","bonjour","namaste","Konichiwa"};
            test4<String> obj2=new test4<String>();
            obj2.swap(s,0,2);
            System.out.println("Exchanging positions in String array "+Arrays.toString(s));
             
             System.out.println("\nEnter the start value ");
             int start=obj4.nextInt();
             System.out.println("\nEnter the end value ");
             int finish=obj4.nextInt();
             
           
             System.out.println("The maximal element in Integer Array"+ obj.MaxElement(num, start, finish));
           
             System.out.println("The maximal element in String Array"+ obj.MaxElement(s, start, finish));
          
             System.out.println("The maximal element in Double Array"+ obj.MaxElement(d, start, finish));
            
             System.out.println("The maximal element in Character Array"+ obj.MaxElement(c1, start, finish));
    }
}
class test3<T extends Number>
{
    T[] value;
    int count=0;

    public test3(T[] value) {
        this.value = value;
    }
 
  public void count()
    {
        for (T value1 : value) {
            if (((value1.doubleValue()) % 2) != 0) {
                count=count+1;
            }
        }
       System.out.println(count);
}
}

class test4<T extends Comparable>
{
    int temp;
   
    public <T> void swap(T[] a,int i,int j)
    {
        
        for (T a1 : a) {
            T temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }      
}

public <T extends Comparable> T maximalelement(T[] value,int start,int finish)
{
   T max=value[start];
   int i;
   for(i=start+1;i<finish;i++)
   {
       if(value[i].compareTo(max)>0)
       {
           max=value[i];
       }
       
   }
   return max;
}

    String MaxElement(Character[] c1, int start, int finish) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    String MaxElement(Double[] d, int start, int finish) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    String MaxElement(String[] s, int start, int finish) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    String MaxElement(Integer[] num, int start, int finish) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
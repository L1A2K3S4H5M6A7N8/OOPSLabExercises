
public class GenericTwo {
    public static void main(String[] args)
    {
        int i;
        Integer num[]={234,515,99,1202,4,82};
        test<Integer,Integer> obj1=new test<>();
        obj1.search(5, num);
       
        Double d[]={12.00,23.00,34.00,45.00,56.00};
        test<Double,Double> obj2=new test<>();
        obj2.search(34.00,d);
        
        Character c[]={'j','a','v','a'};
        test<Character,Character> obj3=new test<>();
        obj3.search('i',c);
    }
    
}
class test<T,V>
{
    boolean flag=false;
  public <T,V>  void search(T s,V[] value)
    {
        for (V value1 : value) {
            if (s.equals(value1)) {
                flag=true;
                break;
            } else {
                flag=false;
            }
        }
        if(flag)
            System.out.println("element found");
        else
            System.out.println("element not found");
    }
}



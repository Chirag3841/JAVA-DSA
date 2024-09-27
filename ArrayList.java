import java.util.ArrayList;
import java.util.Collections;
class ArrayLists {
   public static void main(String args[]) {
       ArrayList<Integer> list = new ArrayList<Integer>();
       //add elements
       list.add(3);
       list.add(1);
       list.add(5);
       list.add(4);
       list.add(1,2);
       Collections.sort(list);
       System.out.println(list);
       int sum=0;
       for(int i=0;i<=list.size();i++){
         sum=sum+i;
       }
       System.out.println(sum);

      }
   }


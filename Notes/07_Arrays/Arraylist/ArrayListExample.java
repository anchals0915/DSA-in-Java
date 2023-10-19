
/*arrayList */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        
        //add element to arraylist --->amortized constant time
        list.add(67);
        list.add(234);
        list.add(654);

        
        System.out.println( list.contains(645) );   //false
        System.out.println(list);   //[67, 234, 654]
        

        list.set(0, 99);
        
        list.remove(2);

        System.out.println(list);
        
        //input
        for (int i = 0; i <5; i++) {
            list.add( sc.nextInt() );
        }
        
        //get itemat any index
        for (int i = 0; i <5; i++) {
           System.out.println( list.get(i)); // pass index here, list[index]  syntax will not work here
        }

        System.out.println(list);


// 1.   Size is actually fixed internally
// 2.   say we we enter the element in arrayList ,then if then it create a new array of double the size of array
            // and copy the old elements to the new one


            sc.close();
    }
}

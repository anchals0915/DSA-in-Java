
/*Arrays */
public class ArraysDemo{
    public static void main(String[] args) {
        // Syntax 
        //  datatype[] array_name =new data_type[size];


        // store 5 roll numbers:
        int[] rnos = new int[5];
        // or directly
        int [] rnos2 = {23,12,45,32,15};
        
        // 1. int [] this datatype represents the type of data stored 
        // 2. all the type of data should be same.
        // [] means rnos refernce variable is pointing to array object of size 5 contains type integer.

        int[] ros;// declaration of arry. ros is getting defined in stack
        ros =new int[5]; // Initalisation : Actually here object is being created int the memory (heap)

    //     |   int[] arr   | = |   new int[5]|    |  ;
    //     |_______________|   |__________________|
    //             |                   |
    //             |            |      |
    //             V            |      V
    // happens at complie time  |  creating the object in heap  =>  happens at runtime => Dynamic Memory Allocation
    //                                  memory

    //  new --> it is used to create an object 

        // by defalut value in array object is 0

        String[] arr =new String[4];
        System.out.println(arr[0]); //null
        // null is a special literal which can be assigned to any refence varaible 
        // it is basically defalut value of refernce variable 
        String str = null;

        
        for (String element : arr) {
            System.out.println(element);
        }

    }
}


// | 1  | 2  | 3  | 4  | 5  |
// |____|____|____|____|____|

// 1 .we know that array objects are created in heap
//  ans there is no proof that heap object are stored in continuous manner
// 2. Heap objects are not continous
// 3. Dynamic Memory Allocation    
//     all the instance of class , objects ,other objects are stored in the heap

// Hence,array objects in java may be continuous stored in memory    => because it depends on JVM
// Why on JVM? 
//      because memory management is done by JVM



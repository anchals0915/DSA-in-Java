
// Varargs
// a method that takes variable number of argurements
class Varargs
{
    public static void main(String[] args) 
    {
        fun(1,2,3,4,45,56,67,78,89,0);
        // [1, 2, 3, 4, 45, 56, 67, 78, 89, 0]
        fun();  
        // []
        multiple(2,3,"Anchal", "Singh");
    }


    // Variable argurments always at the end
    static void multiple(int a,int b,String...v)
    {
        System.out.println(a+"\t"+b+"\t"+ java.util.Arrays.toString(v) );
    }

    // the variable argument type String of the method mutliple must be the last parameter
    // static void multiple(int a,String...v,int b)
    // {
    // }
    
    
    static void fun(int ...v)       //internally it is taking it as array if integers
    {
        System.out.println( java.util.Arrays.toString(v) );
    }
} 

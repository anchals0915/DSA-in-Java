
class Varargs_Overloading
{
    public static void main(String[] args) 
    {
        demo(1,2,3,4,55,76432,1,4532,12);
        // [1, 2, 3, 4, 55, 76432, 1, 4532, 12]
        demo("A","B","C","D","E");
        // [A, B, C, D, E]
        // demo();//-->error   since it can be empty since it is varargs but there is Ambigulty which  
        //                          function this one demo(int...v) or this one demo(String...v)
    }

    static void demo(int...v)
    {
        System.out.println( java.util.Arrays.toString(v));
    }
    
    static void demo(String...v)
    {
        System.out.println( java.util.Arrays.toString(v));
    }
}


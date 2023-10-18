
/*Function Overloading */
// this happens when programs gets complied 
// At complie time, it decides which fuction to come 
class MethodOverloading
{
    public static void main(String[] args) 
    {
        // fun(67);
        // fun("Anchal Singh");
        
        int ans = sum(1,2);
        // int ans = sum(1,2,3);

        System.out.println( ans );
    }

    static int sum(int a,int b)
    {
        return a+b;
    }   
    static int sum(int a,int b,int c)
    {
        return a+b+c ;
    } 
    
//either number of the argurement should be differnt or the type of arguement should be different 
    static void fun(int a)
    {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name)
    {
        System.out.println("second one");
        System.out.println(name);
    }
}
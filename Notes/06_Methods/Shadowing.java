
// Shadowing is basically using same variable in the overlapping scope 
class Shadowing
{
    static int x=90; //this will get shawdowed at line 858             //----> accessiable to whole class 
    public static void main(String[] args) {
        System.out.println(x);//90  //since new value is not reinitalised
        int x; //the class variable at line 854 is shadowed by this       //----------->local varaible scope limited to this block only
        // System.out.println(x);  //scope will begin when value is initalised
        x=40;
        // --------->now whatever value we modifiy it will happen to the int x=40 line
        System.out.println(x);//40  //at this line static int x =90 will be shadowed 
    }
    static void fun()   
    {
        System.out.println(x);//90
    }
    
}
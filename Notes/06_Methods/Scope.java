class Scope
{
    public static void main(String[] args) {
        int a=10;
        int b=20;

        String name="Anchal";
       //anything initalise outside the block ,you can be definitely use inside the block ,
    //    you can update it, original one will get updated ,since same refernce variable.
       
    //    cannot reinitialize inside the block 

        {

            // Anything initalise inside the block can be reinitalised again outside the block.

            // int a=78; //already initialisesd outside the block in the block in the same method, 
            // hence you cannot intialise it again
            
            a=100; //reassign the original ref variable to some other value

            System.out.println(a);
            int c =99;
            name ="Kunal";
            System.out.println(name);
            // values initalised in this block, will remain in this block

        }
        System.out.println(a);//---->100
        // System.out.println(c);//cannot use outside the block
    }
}

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
class FindNumberswithEvenNumberofDigits
{
    public static void main(String[] args) {
        int[] nums={12 ,345, 2, 6, 7896};
        System.out.println( findNumbers(nums) );
    }

    static int findNumbers(int[] nums) 
    {
        int count = 0 ;
        for (int num : nums) {
            if( even(num) ) {
                count++;
            }
        }   
        return count;
    }
    // function to check whether a number is a even digit or not
    static boolean even(int n) {
        // Method 1 : count the no of digtit
        int numberOfDigits = digits(n);
        // Method 2 : convert it string and take length

        return numberOfDigits % 2 ==0 ;
    }

    // count number of digits in a number
    static int digit2(int num)
    {
        // if the number is negative
        if(num < 0) 
        {
            num = num * -1 ;
        }

        return (int)(Math.log10(num)) + 1  ;
    }

    static int digits(int n)
    {
        // if the number is negative
        if(n < 0) 
        {
            n = n * -1 ;
        }
        
        if(n==0) // if the number is 0 which is one digit 
        {
            return 1;
        }
        int count=0;
        while(n>0)
        {   
            count++;
            n/=10;
        }
        return count;
    }


    
}

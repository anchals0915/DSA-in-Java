
// https://leetcode.com/problems/richest-customer-wealth/
class Richest_Customer_Wealth
{
    public static void main(String[] args) 
    {
        
    }

    public int maximumWealth(int[][] accounts)
    {
        int richest = Integer.MIN_VALUE ;
            // when you start a new col 
        int persontotalwealth = 0;
        for (int[] person : accounts) 
        {
            for (int account : person) 
            {
                persontotalwealth += account ;
            }
        }
        
        // now we have sum of accounts of person
        // check with overall ans
        if( persontotalwealth > richest)
        {
            richest = persontotalwealth;
        }

        return richest;
    }
}
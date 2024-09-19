package Leetcode;


//      https://leetcode.com/problems/richest-customer-wealth/description/


//		Input: accounts = [[1,2,3],[3,2,1]]
//		Output: 6
//		Explanation:
//		1st customer has wealth = 1 + 2 + 3 = 6
//		2nd customer has wealth = 3 + 2 + 1 = 6
//		Both customers are considered the richest with a wealth of 6 each, so return 6.

public class Richest_Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] accounts= {
        		{1,2,3},
        		{3,2,1}
        };
        System.out.println(maximumWealth(accounts));
	}

	    static int maximumWealth(int[][] accounts) {
	        int wealth = 0;
	        for (int i = 0; i < accounts.length; i++) {
	            int maxwealth = 0;
	            for (int j = 0; j < accounts[0].length; j++) {
	                maxwealth += accounts[i][j];
	            }
	            if (wealth < maxwealth) {
	                wealth = maxwealth;
	            }
	        }
	        return wealth;
	    }
	}


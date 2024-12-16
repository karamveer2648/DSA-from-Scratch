// https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(accounts));
    }

    // Method to calculate the maximum wealth among all customers
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE; // Initialize maxWealth to the smallest possible integer value

        // Iterate over each customer's account
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0; // Initialize sum for the current customer

            // Sum up the wealth of the current customer
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            // Update maxWealth if the current customer's wealth is greater
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth; // Return the maximum wealth found
    }
}

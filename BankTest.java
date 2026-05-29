public class BankTest {
    public static void main(String[] args) {
        System.out.println("Running Automated Tests...");

        testSavingsAccountInterest();
        
        System.out.println("All tests passed successfully!");
    }

    public static void testSavingsAccountInterest() {
        // Create a test account with $1000 and a 5% interest rate
        SavingsAccount testAccount = new SavingsAccount("Test User", 1000.0, 5.0f);
        
        // Run the method we are testing
        testAccount.calaculateInterest(); 
        
        // At 5%, interest should be $50. The new balance should be $1050.
        double expectedBalance = 1050.0;
        double actualBalance = testAccount.getBalance();

        // If the math is wrong, throw an error to fail the GitHub pipeline
        if (expectedBalance != actualBalance) {
            throw new AssertionError("TEST FAILED: Expected balance $" + expectedBalance + ", but got $" + actualBalance);
        } else {
            System.out.println("testSavingsAccountInterest: PASSED");
        }
    }
}
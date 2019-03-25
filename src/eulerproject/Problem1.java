/**
 * This is Problem 1 of the Euler Project.  The Euler project can be found at: 
 * https://projecteuler.net/
 */
package eulerproject;

/**
 * Problem 1: Multiples of 3 and 5
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we 
 * get 3, 5, 6, and 9.  The sum of these multiples is 23.
 * Find the sum of all multiples of 3 or 5 below 1000.
 * @author alexp
 */
class Problem1 {
    /**
     * ceiling is the highest value we will check.
     * devisor1 is the first divisor we are checking.
     * devisor2 is the second divisor we are checking.
     * sum holds sum of all 
     */
    int ceiling;
    int divisor1;
    int divisor2;
    int sum;
    
    /**
     * Problem1 constructor.
     * @param c Integer value representing the highest value to check.
     * @param d1 Integer value representing a divisor.
     * @param d2 Integer value representing a divisor.
     */
    Problem1( int c, int d1, int d2 ) {
        ceiling = c;
        divisor1 = d1;
        divisor2 = d2;
    }
    
    /**
     * Checks if the current number is divisible by either divisor and returns 
     * result.
     * @param n Integer
     * @return boolean
     */
    private boolean isDivisible( int n ) {
        return n % divisor1 == 0 || n % divisor2 == 0;
    }
    
    /**
     * Checks all numbers starting at 0 upto the ceiling - 1.  The checks if the
     * number is divisible by either divisor.  If it is divisible then add the 
     * number to the running total.
     */
    public void run ( ) {
        for ( int i = 0; i < ceiling; i++)
            if ( isDivisible ( i ) )
                sum += i;
        System.out.println ( sum );
    }
    
}

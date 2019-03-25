/**
 * This is Problem 3 of the Euler Project.  The project can be found at: 
 * https://projecteuler.net/
 */
package eulerproject;

/**
 * Problem 3: Largest Prime Factor
 * The prime factors of 13195 are 5, 7, 13, and 29.  What is the largest prime
 * factor of the number 600851475143?
 * @author alexp
 */
class Problem3 {
    double ceiling;
    double largestPrimeFactor;
    /**
     * Problem3 constructor
     */
    Problem3 ( ) {
        ceiling = 600851475143.0;
        largestPrimeFactor = 0;
    }
    
    /**
     * Checks if a number is prime.
     * @param n Integer
     * @return Boolean
     */
    private boolean isPrime ( double n ) {
        int count = 2;//checking between 1 and n-1
        while ( count <= Math.sqrt ( n ) ) {
            if ( n % count == 0)
                return false;
            count++;
        }
        return true;
    }
    
    /**
     * Runs through all numbers less than the square root of the ceiling.  No 
     * need to check for anything large than the square root as the other factor
     * would be smaller than the square root.  (Had to google how prime numbers 
     * are found to figure this out.)
     */
    public void run ( ) {
        double i = 1.0;
        while ( i < Math.sqrt ( ceiling ) ) {
            if ( isPrime ( i ) && ceiling % i == 0 )
                largestPrimeFactor = i;
            i++;
        }
        System.out.println ( "Problem 3: " + largestPrimeFactor );
    }
}

/**
 * This is Problem 3 of the Euler Project.  The project can be found at: 
 * https://projecteuler.net/
 */
package eulerproject;

/**
 * Problem 4: Largest Palindrome Product
 * A palindromic number reads the same both ways.  The largest palindrome made 
 * from the product of two 2-digit numbers is 9009 = 91 x 99.  Find the largest 
 * palindrome made from the product of two 3-digit numbers.
 * @author alexp
 */
class Problem4 {
    int floor;
    int ceiling;
    
    /**
     * Default Constructor for Problem4
     */
    Problem4 ( ) {
        floor = 100;
        ceiling = 999;
    }
    
    /**
     * Checks if each digit in the number matches the mirrored digit from the 
     * center.
     * @param n Integer
     * @return Boolean
     */
    private boolean isPalindrome ( int n ) { 
        int count = 0;
        while ( count < ( Integer.toString ( n ).length ( ) ) / 2 ) {
            if ( Integer.toString ( n ).charAt ( count ) 
                    != Integer.toString ( n ).charAt ( 
                            Integer.toString ( n ).length ( ) - count -  1 ) )
                return false;
            count++;
        }
        return true;
    }
    
    /**
     * Checks for all products from range of 100-999 matching palindrome 
     * criteria and returns the highest value palindrome.
     */
    public void run ( ) {
        int palindrome = 0;
        for ( int count1 = floor; count1 <= ceiling; count1++ )
            for ( int count2 = floor; count2 <= ceiling; count2++ )
                if ( isPalindrome ( count1 * count2 ) && palindrome < count1 
                        * count2 )
                    palindrome = count1 * count2;
        System.out.println ( "Problem 4: " + palindrome );
    }
}

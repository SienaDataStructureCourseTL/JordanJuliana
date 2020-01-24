/**
 * This program is used to unit test the Pool class.
 * The format of the dollar amount is not important.
 * You should not be concerned that there are no 
 * dollar signs or there are more than two decimal
 * places.
 * 
 * @author 
 * @version Spring 2019
 */
public class DriverPoolStudent
{
    public static void main(String args[])
    {
        //1.  Create a Pool object.
        Pool p = new Pool();
        
        //2.  Test bounds of the range for pool days
        //2A. day - lower bound test 

        //2B. day - mid-range test

        //2C. day - upper bound test

        //3.  Test the bounds of the range for pool hours
        //3A. hour - lower bound test

        //3B. hour - mid-range test

        //3C. hour - upper bound test

        //4A.  Test pool total; total is based on the pool entries above

        //4B.  Test pool total with a new pool and no entries.

        //5A.  Test getWinner - winner exists

        //5B.  Test getWinner - no winner

        //6.   print the complete matrix
        System.out.println("\n" + p);
        
        /*
         * 7. 
         * Use the Pool object, p, you created above.  If there are entries 
         * still available (there should be lots!), ask the user to pick a day 
         * and time.  Keep asking until they have picked one that is not 
         * already used (is null).  Then, add the user to the pool.  You 
         * will need their name and the amount they would like to enter.
         * You only need to enter one user in the pool.
         */
    }
}

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
import java.util.Scanner;
public class DriverPoolStudent
{
    public static void main(String args[])
    {
        //1.  Create a Pool object.
        Pool p = new Pool();
        //2.  Test bounds of the range for pool days
        //2A. day - lower bound test 
        p.addEntry(2,0,"John", 10.00f);
        //2B. day - mid-range test
        p.addEntry(4,0,"Jack", 10.00f);
        //2C. day - upper bound test
        p.addEntry(7,0,"Jill", 10.00f);
        //3.  Test the bounds of the range for pool hours
        //3A. hour - lower bound test
        p.addEntry(1,0,"Steve", 10.00f);
        //3B. hour - mid-range test
        p.addEntry(1,12,"Mike", 10.00f);
        //3C. hour - upper bound test
        p.addEntry(1,23,"Bob", 10.00f);
        //4A.  Test pool total; total is based on the pool entries above
        System.out.println("Total amount in pool: " + p.poolTotal());
        //4B.  Test pool total with a new pool and no entries.
        Pool pNew = new Pool();
        System.out.println("Total amount in pool: " + pNew.poolTotal());
        //5A.  Test getWinner - winner exists
        System.out.println(p.getWinner(1,0));
        //5B.  Test getWinner - no winner
        System.out.println(p.getWinner(1,1));
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
        Scanner scnr = new Scanner(System.in);
        int     inHour, inDay;
        double  inAmount;
        String  inName;
        boolean success;
        if(p.entriesAvailable() >= 1)
        {
            System.out.println("|| PLEASE FILL ENTRY INFORMATION BELOW ||");
            System.out.print("NAME: ");
            inName = scnr.next();
            System.out.print("\nAMOUNT($[0.00]): ");
            inAmount = scnr.nextDouble();
            do
            {
                success = false;
                System.out.print("\nDATE(SUN[1] - SAT[7]): ");
                inDay = scnr.nextInt();
                System.out.print("\nTIME|24HR([0]:00 - [23]:00): ");
                inHour = scnr.nextInt();
                success = p.addEntry(inDay, inHour, inName, inAmount);
                if (success == false)
                System.out.print("\nERROR: Sorry that time slot is already taken, please try a different time");
            }while(success == false);
            
        }
        else
        {
            System.out.println("|| NO MORE ENTRY SPOT AVAILABLE, PLEASE TRY AGAIN NEXT WEEK ||");
        }
    }
}

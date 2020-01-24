/**
 * This class represents a highly simplified gaming
 * pool for a lucky day drawing.  The pool is a 2D 
 * matrix of Entry objects. There may only be one 
 * Entry object per pool row and column.  Once an 
 * entry is made in a pool location, it cannot be 
 * reversed or overwritten.
 * 
 * In this implementation, the winning entrant is
 * entered in the select day (1-7, Sunday - Saturday)
 * and hour (0-23, military hours).
 * 
 * @author Prof. White
 * @version Spring 2019
 */
public class Pool
{
    //The number of days in the pool.
    public static final int DAYS = 7;
    
    //The number of hours in the pool.
    public static final int HOURS = 24;

    //The matrix representing the possible pool entries
    //for the lucky day winner.
    private Entry[][] luckyDay;

    /**
     * Constructs a new Pool object.
     */
    public Pool()
    {
        //Ignore row 0; so indexes 
        //correspond with calendar days 1 - 5, 
        //add 1.
        luckyDay = new Entry[HOURS][DAYS + 1];
    }

    /**
     * Adds an entry to the pool if one has not yet been made and if 
     * the day is in the correct range,[1, DAYS + 1], the hour is 
     * in the correct range [0, HOURS), and the amount of the 
     * entry in greater than 0.
     * 
     * @param The day to make the entry.
     * @param The hour to make the entry.
     * @param The dollar amount of the entry.
     * @return True if the entry is successfully added to the pool and 
     *         false otherwise.
     */
    public boolean addEntry(int day, int hour, String name, double amount)
    {
        boolean completed = false;

        if(day > 0 && day <= DAYS && hour >= 0 && hour < HOURS && 
           luckyDay[hour][day] == null && amount > 0){
            luckyDay[hour][day] = new Entry(name, amount);
            completed = true;
        }

        return completed;
    }

    /**
     * Return the number of entries still available for this pool.
     * (An entry is available if its value is null.)
     * 
     * @return The number of entries still available for this pool.
     */
    public int entriesAvailable()
    {
        int count = 0;

        //add your code here
        
        return count;
    }
    
    /**
     * Return the winning entry for the lucy day and hour.
     * The lucky day must be in the range,[1, DAYS + 1] and
     * the lucky hour hour must be in the range [0, HOURS).  
     * Otherwise, return null.
     * 
     * @param The lucky day.
     * @param The lucky hour.
     * @param Return the winning entry or null if the input is
     *        not in the correct range.
     */
    public Entry getWinner(int day, int hour)
    {
        if(day > 0 && day <= DAYS && hour >= 0 && hour < HOURS){
            return luckyDay[hour][day];
        }

        return null;
    }

    /**
     * Return the sum of all dollar amounts in this pool.
     * 
     * @return The sum of all dollar amounts in this pool.
     */
    public double poolTotal()
    {
        double total = 0.0;

        //add your code here
        
        return total;
    }

    /**
     * Return the string representing this pool in a 2D display.  
     * Null entrys should be represented as "****".
     * 
     * Note:  This method could be improved so the string is 
     * formatted to preserve columns where tab is not effective!
     * 
     * @return The string representing this pool in a 2D display 
     *         where open entries are represented as "****".
     */
    public String toString()
    {
        // use a StringBuffer to build up an answer more efficiently
        StringBuffer sb = new StringBuffer();

        sb.append("\t");
        for(int day = 1; day <= DAYS; day++){
            sb.append(day + "\t");
        }
        sb.append("\n");
        
        for (int hour = 0; hour < HOURS; hour++) {
            sb.append(hour + "\t");
            for (int day = 1; day <= DAYS; day++) {
                if(luckyDay[hour][day] != null)
                {
                    //APPEND THE NAME OF THE WINNER TO THE StringBuffer sb
                    sb.append(luckyDay[hour][day].getName());
                }
                else
                {
                    sb.append("****");
                }
                if (hour != HOURS + 1) {
                    sb.append("\t");
                }
            }
            sb.append("\n");
        }

        return sb.toString();
    }    
}
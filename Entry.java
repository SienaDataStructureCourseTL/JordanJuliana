/**
 * This class represents an entry in a game pool.
 * 
 * @author Prof. White
 * @version Fall 2019
 */
public class Entry
{
    //The name of the person making the entry.
    private String name;
    
    //The dollar amount of the entry.
    private double amount;

    /**
     * Constructs an entry.
     * 
     * Precondition:  amount > 0.0
     * @param name The name of the person making the entry.
     * @param amount The dollar amount of the entry.
     */
    public Entry(String name, double amount)
    {
        this.name = name;
        this.amount = amount;
    }
    
    /**
     * Returns the name of the person making the entry.
     * 
     * @return The name of the person making the entry.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Returns the dollar amount of the entry.
     * 
     * @return The dollar amount of the entry.
     */
    public double getAmount()
    {
        return amount;
    }
    
    /**
     * Returns a string describing the state of this entry.
     * 
     * @return The state of this entry.
     */
    public String toString()
    {
        return name + ":" + amount;
    }
}

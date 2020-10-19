import java.util.Date;
/**
 * This class will contain information about a ticket
 * including the journey destination, price and the 
 * date and time of purchase
 * @author Kate Turton
 * @version 13/10/2020
 */
public class Ticket
{
    // These are the Fields, Attributes or Variables
    private String destination;
    
    // Currency in pence
    private int price;
    
    private Date datePurchased;

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String destination, int price, String date)
    {
        // initialise instance variables
        this.destination = destination;
        this.price = price;
        datePurchased = new Date();
    }
    public int getPrice()
    {
       return price;
      
    }
    
    public String getDestination()
    {
        return destination;
    }
    
    public Date getdatePurchased()
    {
        return datePurchased;
    }
    
    
    
    public void print()
    {
        System.out.print("Ticket to" + destination);
        System.out.print("" + price + "pence");
        System.out.print(datePurchased);
        System.out.println();
        
    }

   
}

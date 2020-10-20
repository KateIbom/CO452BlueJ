/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Kate Turton
 * @version 2020.10.11
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    // The destinations
    private Ticket aylesburyTicket;
    
    private Ticket amershamTicket;
    
    private Ticket highwycombeTicket;
    
    private Ticket issuedTicket;
    

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        
        balance = 0;
        total = 0;
        
        
        aylesburyTicket = new Ticket("Aylesbury", 220, "2nd September 2020");
        issuedTicket = null;
        
        amershamTicket = new Ticket("Amersham", 300,"3rd September 2020");
        issuedTicket = null;
        
        highwycombeTicket = new Ticket("High Wycombe", 330,"16th October 2020");
        issuedTicket = null;
        
        
        
        
        
        
        
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) 
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("10 " +
                               amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        // must remove later
        
        int price = 220;
        
        
        
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            issuedTicket.print();
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    
    public void printAllTickets()
    {
       System.out.println("The following three destinations are available");
       aylesburyTicket.print(); 
       System.out.println("Please select your destination ticket > ");
       
       amershamTicket.print();
       highwycombeTicket.print();
       
    }
    
    public void selectAylesburyTicket()
    {
        issuedTicket = aylesburyTicket; //print tickets for this destination
    }
    
    public void selectamershamTicket()
    {
        issuedTicket = amershamTicket;
    }
    
    public void selecthighwycombeTicket()
    {
        issuedTicket = highwycombeTicket;
    }
    
    public void insert20pcoin()
    {
        balance = balance +20;
    }
    
    public void insert10pcoin()
    {
        balance = balance +10;
    }
    
    public void insert100pcoin()
    {
        balance = balance +100;
    }
    
    
    
}

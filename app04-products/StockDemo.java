/**
 * import statement
 * requires random class
 */
import java.util.Random;
 /** 
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Kate Turton.
 * @version 3rd.11.2020
 */
public class StockDemo
{
    public static final int FIRST_ID = 101;
    // The stock manager.
    private StockManager manager;
    
    private Random genarator;
    
    private String name = "Audi A4 Avanti";
    
    /**
     * Create a StockManager and populate it with make,
     * model and ID to stock.
     */
    public StockDemo( StockManager manager)
    {
        /** 
         * rename product based on ID
         */
        if (name.startsWith("Audi"))
        {
            name = generator.nextlnt(5) + 1;
            manager.getProduct(id,name);
            name++;
        }
        generator = new Random();
        this.manager = manager;
        
        int id = FIRST_ID;
        // New product to stocklist
        manager.addProduct(new Product(id, "Audi A4 Avanti"));
        id++;
        manager.addProduct(new Product(id,  "BMW 6 Series"));
        manager.addProduct(new Product(103,  "Ford Cougar"));
        manager.addProduct(new Product(104,  "Honda JazzSPORT"));
        manager.addProduct(new Product(105,  "Jaguar C-Type"));
        manager.addProduct(new Product(106,  "Land Rover Discovery Sport"));
        manager.addProduct(new Product(107,  "Porsche Spyder"));
        manager.addProduct(new Product(108,  "Tayota Auris"));
        manager.addProduct(new Product(109,  "Nissan Cuber"));
        manager.addProduct(new Product(110,  "Vauhall Astra"));
        
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void runDemo()
    {
        // Show details of all of the products.
        manager.printAllProducts();
        // Take delivery of 5 items of one of the products.

        manager.printAllProducts();
        
        demoDelivery();
        demoSell();
        
        
    }
    
    private void demoDelivery()
    {
        printHeading("delivery");
       
        int amount = 0;
        for(int id =101; id <=112; id++)
        
        {
            amount = generator.nextlnt(5) + 1;
            manager.deliverProduct(id,amount);
            amount++;
        }
    
    }
   /**
    * method to sell product usinf a loop 
    */
    private void demoSell()
    {
        printHeading("sell");
        
        int amount = 0;
        for(int id =101; id <=112; id++)
        
        {
            amount = generator.nextlnt(5) + 1;
            manager.sellProduct(id,amount);
            amount++;
        }
    
    }
    
    /**
     * improve output formatting 
     */
    public void printHeading(String verb)
    
    {
        System.out.println();
        System.out.println("\n====================================");
        System.out.println("\nDemonstrating Product Delivery\n" + verb);
        System.out.println("\n====================================");
        System.out.println();
    }
   
    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
}

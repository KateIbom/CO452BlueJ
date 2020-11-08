import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Kate Turton 
 * @version 27/10/2020
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
       
    }
    
    /**
     * Remove a product from the list 
     * @param item The item to be removed by ID
     */
    public void removeProduct(int id)
    {
        stock.remove(id);
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void deliverProduct(int id, int amount)
    {
        Product product = findProduct(id);
        if (product != null)
        {
            product.increaseQuantity(amount);
            System.out.println("Product Deliveries : " + product);
        }
        
        else
        {
            System.out.println("Product ID" + id + "Not Found !!!");
        }
        
        
        
    }
    
    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int id, int amount)
    {
        Product product = findProduct(id);
        
        if(product != null) 
        {
            printDetails(id);
            product.sell(amount);
            printDetails(id);
        }
        
        else
        {
            System.out.println( "product not found" ); 
        }
    }
    
    
    /**
     * Show details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printDetails(int id)
    {
        Product product = findProduct(id);
        
        if(product != null) 
        {
            System.out.println( "Available stock : " +product.getQuantity());
            
            System.out.println(product);
        }
        
        else
        {
            System.out.println( " product not found");
        }
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
      
        for(Product product : stock)
        {
            if(product.getID() == id)
            {
                return product;
            }
        }
        
        return null;
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        return 0;
    }

    /**
     * Print details of all the products.
     */
    public void printAllProducts()
    {
        printheading();
        for(Product product : stock)
        {
     
            System.out.println(product);
        }
    }
    /**
     * Print heading formatting
     * 
     */
    public void printheading()
    {
        System.out.println("\n====================================");
        
        System.out.println("Kate's Stock List");
        System.out.println("\n====================================\n");
    }
}

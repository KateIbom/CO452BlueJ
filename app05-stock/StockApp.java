
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Student Name
 * @version 0.1
 */
public class StockApp
{
    public static final char CLEAR_CODE = '\u000c'; // clear screen 

    public static final String QUIT = "quit";
    public static final String ADD = "add";
    public static final String PRINT_ALL = "printall";
    public static final String SELL = "sell";
    public static final String DELIVER = "deliver";
    public static final String SEARCH = "search";
    public static final String REMOVE = "remove";
    public static final String LOW_STOCK = "print low stock";

    // Use to get user input
    private InputReader input = new InputReader();

    private StockManager manager = new StockManager();

    private StockDemo demo = new StockDemo(manager);

    
    /**
     * 
     */
    public void run()
    {
        boolean finished = false;

        while(!finished)
        {
            printHeading();
            printMenuChoices();

            String choice = input.getString("Please enter your choice > "). toLowerCase();

            if(choice.equals ("quit"))
                finished = true;
            else
                executeMenuChoice(choice);
        }
    }

    private void executeMenuChoice(String choice)
    {
        if(choice.equals(ADD))
        {
            addProduct();
        }
        else if(choice.equals(REMOVE))
        {
            removeProduct();
        }
        else if(choice.equals(PRINT_ALL))
        {
            manager.printAllProducts();
        }
        else if (choice.equals(DELIVER))
        {
            deliverProduct();
        }

        else if (choice.equals(SELL))
        {
            sellProduct();
        }

        else if (choice.equals(LOW_STOCK))
        {
           // manager.printLowStock();
        }

        else if (choice.equals(SEARCH))
        {
            //searchProduct();
        }

        else if (choice.equals("restock"))
        {
            //manager.restockProduct();
        }

        else
        {
            System.out.print("Choice is invalid! Please choose from the option");
        }
    }

    /**
     * Method to add product via the user interface
     */
    private void addProduct()
    {
        System.out.println("\nAdding new product\n");
        int id =input.getInt("\nPlease enter the product ID\n");

        String name = input.getString("\nPlease enter the name of the product\n");

        if (id > 0 && !name.isBlank())
        {
            Product product = new Product(id, name);
            manager.addProduct(product);
        }
        else
        {
            System.out.println("Error! Please ensure all " + "Fields are complete.");
        }
    }

    private void removeProduct()
    {
        System.out.println("\nRemove product\n");

        int id = input.getInt("\nPlease enter product ID\n");

        manager.removeProduct(id);

    }

    /**
     * Method to deliver an amount of product
     */

    private void deliverProduct()
    {
        int id = input.getInt("\nPlease enter product ID\n");
        int amount = input.getInt("\nPlease enter the amount\n");

        System.out.println("Delivery of product");
        manager.deliverProduct(id, amount);
    }

    private void sellProduct()
    {
        int id = input.getInt("\nPlease enter product ID\n");
        int amount = input.getInt("\nPlease enter the amount\n");

        System.out.println("Sell product");
        manager.sellProduct(id, amount);
    }
    
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Deliver:    Quantity of product");
        System.out.println("    Sell:       Quantity of product");
        System.out.println("    Search:     Products by Name");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }

    public void respondToChoice(String choice)
    {
        if (choice.equals("Add"))
        {
            manager.addProduct(new Product (101,"Audi"));
        }
    }

    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        //System.out.println(CLEAR_CODE);
        
        System.out.println("\n******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: Kate Turton");
        System.out.println("******************************\n");
    }
}


/**
 * Main class for user input.
 *
 * @author Kate Turton
 * @version 01/12/2020
 */
public class Program
{
    private static StockApp app;

    /**
     * This class creates and runs an instance of
     * the StockApp class
     */
    public static void main()
    {
        app = new StockApp();
        app.run();
    }
}

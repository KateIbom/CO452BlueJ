
/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    // Course Code
    private String moduleNumber;
    // Course Title
    private String Title;
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;

    /**
     * Constructor for objects of class Course
     */
    public Course(String moduleNumber, String title)
    {
        this.moduleNumber = moduleNumber;
        this.Title = title;
    }
    
    
    /**
     * Constructor to insert module unto course
     */
    
    public void addModule(Module module, int moduleNo)
    {
        if (moduleNo == 1)
        {
            this.module1 = module;
        }
        
        else if (moduleNo == 2)
        {
            this.module2 = module;
        }
        
        else if (moduleNo == 3)
        {
            this.module3 = module;
        }
        
        else if (moduleNo == 4)
        {
            this.module4 = module;
        }
        
    
    }
    
    
    
    
    /**
     * AMethod that returns module number
     *
     * @return moduleNumber
     
     */
    public String getmoduleNumber()
    {
        // put your code here
        return moduleNumber;
    }
}


/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    // Course Code
    private String codeNo;
    // Course Title
    private String Title;
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;

    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNumber, String title)
    {
        this.codeNo = codeNo;
        this.Title = title;
        
       
    }
    /**
     * method to create module
     */
    
    public void createModules()
    {
        module1 = new Module ("CO452" , "Programming Concepts");
        module2 = new Module ("CO450" , "Computer Architecture");
        module3 = new Module ("CO454" , "Digital Technology");
        module4 = new Module ("CO455" , "Web Development");
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
         * set mark method
         */
        
     public void setMark(int mark, String codeNo )
    
      {
           if(module1.getCodeNo() == codeNo)
           {
               module1.awardMark(mark);
               
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
        return codeNo;
    }
}

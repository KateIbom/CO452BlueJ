
/**
 * Write a description of class Module here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Module
{
    // Fields
    
    private String  title;
    
    private String codeNo;
    
    private int mark;
    
    private int credit;
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        this.title = title;
        this.codeNo = codeNo;
        
        mark = 0;
        credit = 15;
    }

    /**
     * method to set mark from class module
     */
    
    public void awardMark(int mark)
    {
        this.mark = mark;
    
    }
    
    /** 
     * method to get marks from class module
     */
    
    public int getMark()
    {
        return mark;
    
    }
    
    /**
     * method to get code number
     */
    
    public String getCodeNo()
    {
        return codeNo;
    }
    
    /**
     * print method to have output
     */
    public void print()
    
    {
        System.out.println("Module: " + title + " " + codeNo +  " Mark = " + mark);
    }
    
    /**
     * Get method property title
     */
    public String getTitle()
    {
        return this.title;
    }
}

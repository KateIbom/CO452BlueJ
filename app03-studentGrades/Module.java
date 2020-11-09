
/**
 * Write a description of class Module here.
 *
 * @author Kate Turton
 * @version 26/10/2020
 */
public class Module
{
    // Fields
    
    private String  title;
    
    private String codeNo;
    
    private int mark;
    
    private int credit;
    
    private boolean completed;
    
    private boolean passed;
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        this.title = title;
        this.codeNo = codeNo;
        
        mark = -1;
        credit = 15;
        completed = false;
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
     * this will return credits for the course
     */
    public int getCredit()
    {
        return credit;
    }
    
    /**
     * this will return the module code number
     */
    
    public String getCodeNo()
    {
        return codeNo;
    }
    
    /**
     * module has been completed if it has been awarded a mark even if the mark is zero
     */
    public boolean isCompleted()
    {
        if (mark >= 40)
        {
            credit = 15;
            return true;
        }
        
        return false;
    }
    
    /**
     * print method to have output
     */
    public void print()
    // need to include an array list to avoid printing individual modules
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

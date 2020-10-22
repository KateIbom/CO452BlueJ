
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

    /**
     * Constructor for objects of class Course
     */
    public Course(String moduleNumber, String title)
    {
        this.moduleNumber = moduleNumber;
        this.Title = title;
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

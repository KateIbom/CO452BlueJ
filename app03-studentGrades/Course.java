
/**
 * Class stores course for student
 * to enrole and complete their course
 * also grades can be awarded when course 
 * is complete
 * @author Kate Turton
 * @version 05 November 2020
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
    
    private ArrayList<Modules> modules;
    
    private int courseMark;
    private int finalMark;
    
    private int credit;
    private String finalGrade = null;

    /**
     * Constructor for objects of class Course
     * Constructor for object of class field
     */
    public Course(String codeNumber, String title)
    {
        //Instance variables
        this.codeNo = codeNo;
        this.Title = title;
        
        modules = new ArrayList<Modules>();
        
        this.credit = 0;
        this.courseMark = null;
        this.finalMark = 0;
        this.finalGrade = null;
        
        
        createModules();
       
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
         * set mark method for each module on the course
         */
        
     public void setMark(int mark, String codeNo )
    
      {
           if(module1.getCodeNo() == codeNo)
           {
               module1.awardMark(mark);
               
           }   
    }
    
    public void calculateCourseMark()
    {
        if(courseCompleted())
        {
            int courseMark = module1.getMark() + module2.getMark() + module3.getMark()
                                +module4.getMark();
            courseMark = courseMark / 4;
            
            credit = module1.getCredit() + module2.getCredit() + module3.getCredit()
                        + module4.getCredit();
            
            
            print();
        }
        
        else
        {
            return courseMark.null;
        }
    }
    
    /**
     * Marking Boundaries
     */
    
    private Grades calculateFinalGrade(int mark)
    {
        if ((mark >=0) && (mark <39))
        {
            return finalGrade.F;
        }
        
        else if((mark >=40) && (mark <49))
        {
            return finalGrade.D;
        }
        
        else if((mark >=50) && (mark <59))
        {
            return finalGrade.C;
        }
        
        else if((mark >=60) && (mark <69))
        {
            return finalGrade.B;
        }
        
        else if((mark >=70) && (mark <100))
        {
            return finalGrade.A;
        }
        
        else
        {
            return finalGrade.X;
        }
    }
    
    
    /**
     * calculate finale mark for all modules once completed
     */
    public void calculateFinalMark()
    {
        if(courseCompleted)
        {
            int totalMark = module1.getMark() + module2.getMark() +
            module3.getMark() + module4.getMark();
         
            
            finalMark = totalMark / 4;
            print();
        }
        
        else
        {
            
        }
        
    }
    
    /**
     * show conditions to completeing modules
     */
    
    public boolean courseCompleted()
    {
        if ((module1.isCompleted()) && ((module2.isCompleted()) && ((module3.isCompleted())
                && ((module4.isCompleted())
        {
            return true;
        }
        
        else 
        return false;
    }
   
    
    /**
     * Prints out the details of a course
     */
    
    public void print()
    
    {
        // put the course here
        
       System.out.println("Course" + codeNo + " - " + title);
       //print all individual marks
       if (courseCompleted())
       {
           System.out.println("Modules: ");
           modules1.print();
           modules2.print();
           modules3.print();
           modules4.print();
           
           System.out.println("Final Mark: = " + finalMark);
           System.out.println("Final Grades: " + calculateFinalGrades(finalMark));
           Sytem.out.println("Final Credit: " + credit);
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

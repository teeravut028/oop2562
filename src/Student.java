public class Student {
    protected String studentId;
    protected String studentName;
    protected String faculty;
    protected String major; 
    
    public void enrollment(){
        System.out.println("enrollment");
    }
    public void payment(){
        System.out.println(" payment");
    }
    public void addCourse(){
        System.out.println("addCourse");
    }
    public void dropCourse(){
        System.out.println("dropCourse");
        
    }
    public void showdata (){
        System.out.println("**************************************");
        System.out.println("SD : "+studentId);
        System.out.println("Name : "+studentName);
        System.out.println("Major : "+major);
        System.out.println("Faculty : "+faculty);
        System.out.println("**************************************");
    }

                
    }
}//end class

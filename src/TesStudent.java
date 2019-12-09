public class TesStudent {
     
    public static void main(String[] args) { // psvm
       
        Student nas = new Student();
        System.out.println("Ofject"+nas);
        nas.studentId = "61423028";
        nas.studentName = "Teeravut";
        nas.major = "CS";
        nas.faculty = "Scien and Technology";
        nas.showdata();
        nas.enrollment();
        nas.dropCourse();
        
        
        Student lip = new Student() ;
        lip.studentId = "614234023"; 
        lip.studentName = "Hamdee" ;
        lip.major = "CS" ;
        lip.faculty = "Scien and Technology" ;
        lip.showdata();
        
        GraduateStudent pong = new GraduateStudent();
        pong.studyLevel = "Year2";
        pong.thesisAdviser = "Dr.Bean";
        pong.showdata();
        pong.thesisExamination();
        pong.oralExamination();
}
}//end class

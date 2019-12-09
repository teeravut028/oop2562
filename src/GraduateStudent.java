public class GraduateStudent {
    protected String studyLevel;
    protected String thesisAdviser;
     
    public void oralExamination(){
        System.out.println("oralExamination");
    }   
    public void thesisExamination(){
        System.out.println("thesisExamination");
    }
    public void showdata (){
        System.out.println("**************************************");
        System.out.println("studyLevel : "+studyLevel);
        System.out.println("ThesisAdviser : "+thesisAdviser);
        System.out.println("**************************************");
    }
    
}

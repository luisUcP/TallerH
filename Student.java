package TallerH;

import java.util.ArrayList;

public class Student extends Person{
    private String student_number;
    private float average_mark;
    private ArrayList <CourseInformation> ListSeminars= new ArrayList<CourseInformation>();
    
    public Student(String name, String numer, String email, String student_number, float average_mark){
        super(name, numer, email);
        this.student_number=student_number;
        this.average_mark= average_mark;
    
    }
    public String IsElegibleToEroll(){
        return super.name + this.student_number;
    }
    public void GetSeminarsTaken (){
        for (CourseInformation  a: ListSeminars) {
            a.tString();
        }
        
    }

}


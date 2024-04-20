package TallerH;

import java.util.ArrayList;

public class Seminars {
    ArrayList<CourseInformation> courses = new ArrayList<CourseInformation>();

    public void addProgSeminar(){
       courses.add(new CourseInformation("Prog1", 5, new Proffesor("Jaime", "333-342", "jaime@ucaldas.edu.co")));
       courses.add(new CourseInformation("Prog2", 3, new Proffesor("Pedro", "124-244", "Pedro@ucaldas.edu.co")));
       courses.add(new CourseInformation("Prog3", 3, new Proffesor("Eusebio", "123-244", "Eusebio@ucaldas.edu.co")));
    }
    public void addPhysicsSeminar(){
        courses.add(new CourseInformation("Fisca1", 5, new Proffesor("Rafael", "333-321", "Rafael@ucaldas.edu.co")));
        courses.add(new CourseInformation("Mecanica cuantica", 3, new Proffesor("Santaolalla", "213-244", "Santaolalla@ucaldas.edu.co")));
        courses.add(new CourseInformation("Mecanica de fluidos", 6, new Proffesor("Karin", "123-234", "Karin@ucaldas.edu.co")));
    }
}

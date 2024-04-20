package TallerH;
public class CourseInformation {
    private String course_name;
    private int week_hours;
    private Proffesor proffesor_information;


    public CourseInformation(String course_name, int week_hours, Proffesor proffesor_information) {
        this.course_name = course_name;
        this.week_hours = week_hours;
        this.proffesor_information = proffesor_information;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getWeek_hours() {
        return week_hours;
    }

    public void setWeek_hours(int week_hours) {
        this.week_hours = week_hours;
    }

    public Proffesor getProffesor_information() {
        return proffesor_information;
    }

    public void setProffesor_information(Proffesor proffesor_information) {
        this.proffesor_information = proffesor_information;

    }
   public void tString (){
    System.out.println("CourseInformation" + this.course_name + this. week_hours + proffesor_information.toString());
   }
}

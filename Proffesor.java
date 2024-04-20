package TallerH;

public class Proffesor extends Person  {
    private float salary = 0f;
    
    public Proffesor(String name, String number, String email, float salary){
        super(name, number, email);
        this.salary = salary;
    
    }

    public Proffesor(String name, String number, String email){
        super(name, number, email);
    }

    public String toString() {
        return super.toString() + "salary:" + salary;
    }



}

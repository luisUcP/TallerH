package TallerH;

public class Person {

    protected String name;
    protected String number;
    protected String email;
    
    public Person(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNumer() {
        return number;
    }
    public void setNumer(String number) {
        this.number = number;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String toString() {
        return "Person [name=" + name + ", number=" + number + ", email=" + email+"]";
    }
    
    }
    
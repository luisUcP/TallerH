package TallerH;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
    Scanner sc=new Scanner(System.in);

    int Opción=0;
    ArrayList<CourseInformation> StudentSeminar= new ArrayList<CourseInformation>();

    ArrayList<Proffesor> proffesors = new ArrayList<Proffesor>();
    ArrayList<CourseInformation> semiinars = new ArrayList<CourseInformation>();

    public Menu() {
        addProfessors(proffesors);
        addSeminars(semiinars);
    }
    
    public void menuTotal(){

        System.out.println("ingrese la opción: \n"+ " ver todas las materias [1]\n "+ "Inscriba una materia [2] \n" + " Mire sus materias inscritas [3] \n"+ " Salga[4]");


        while (Opción!=4) {
            
        int Opción=sc.nextInt();
            switch (Opción) {

                case 1:
                ShowSemi();
            break;

                case 2:
                System.out.println("cuidado con las mayusculas");

                String hola=sc.nextLine();

                for (CourseInformation var : semiinars) {
                    if (var.getCourse_name().equals(hola)) {
                        StudentSeminar.add(var);
                    }
                    else {
                        System.out.println("error, la busqueda ha sido fallida");
                    }
                    
                }
                break;

                case 3:
                ShowStudentsemi();
                break;


                default:
                System.out.println("Opción no valida");
                    break;
            }
        }
    }

    private void addProfessors(ArrayList<Proffesor> list) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/Proffesor.txt"));
            String line = "";
            while ((line = lector.readLine()) != null) {
                System.out.println("linea leída: " + line);
                String[] componets = line.split(";");
                if (componets.length == 3) {
                    String name_profe = componets[0];
                    String numero = componets[1];
                    String correo = componets[2];
                    list.add(new Proffesor(name_profe, numero, correo));
                } else {
                    System.out.println("La linea no posee el formato ideal " + line);
                }

            }
            lector.close();
        } catch (IOException a) {
            System.err.println("Error en la lectura" + a.getMessage());
        }
    }
    private void addSeminars(ArrayList<CourseInformation> list) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/Seminars.txt"));
            String line = "";
            while ((line = lector.readLine()) != null) {
                System.out.println("linea leída: " + line);
                String[] componets = line.split(";");
                if (componets.length == 3) {
                    String nombre = componets[0];
                    int horas = Integer.parseInt(componets[1]);
                    String Nprofe  = componets[2];
                    Proffesor find = null;
                    for (Proffesor i : proffesors) {
                        if(i.getName().equals(Nprofe)){
                            find = i;
                            break;
                        }
                        
                    }
                    if (find != null) {
                        list.add(new CourseInformation( nombre ,horas, find));

                    }
                    else {
                        System.out.println("no se encontro el profesor");
                    }

                } 
                
                else {
                    System.out.println("La linea no posee el formato ideal " + line);
                }

            }
            lector.close();
        } catch (IOException a) {
            System.err.println("Error en la lectura" + a.getMessage());
        }
    }
    public void ShowSemi(){
        for (CourseInformation course : semiinars) {
            System.out.println(course.getCourse_name());
        }
    }
    public void ShowStudentsemi(){
        for (CourseInformation course2 : StudentSeminar) {
            System.out.println(course2.getCourse_name());
        }
    }

}


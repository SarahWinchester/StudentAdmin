package NewCode;

import java.util.ArrayList;
import java.util.List;

public class AdministracionAlumnos {

    private List <Estudiante> alumnos = new ArrayList();

    public AdministracionAlumnos() {

    }

    public List getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List alumnos) {
        this.alumnos = alumnos;
    }

    public boolean altaAlumno ( String nombre, String id, String grado, String nivel){

        if (getIndexAlumnoFromList(id)== false){
            System.out.println("El id " + id +  " ya existe , por favor revisa de nuevo, el estudiante no fue agregado");


        }else {

            Estudiante stud = new Estudiante(nombre, id, grado, nivel);
            alumnos.add(stud);
            System.out.println("Data gregada correctamente");
        }




    return true;


    }

    public boolean getIndexAlumnoFromList(String id){

        //Estudiante _id = new Estudiante();


       for(int i = 0 ; i < getAlumnos().size(); i++  ){

           if(getAlumnos().equals(id)){
               return false;
           }


       }               return true;

    }

    public  void imprimirAlumnos(){
        //****************PRINTED STUDENTS

        System.out.println("Students in database: " + getAlumnos().size());

        for (int i = 0; i < getAlumnos().size() ; i++) {
            System.out.println("***************************");
            System.out.println("\nStudent data");

            System.out.println("\n ID: " +getAlumnos().get(i));

        }


    }

    public static void main(String[] args) {

        AdministracionAlumnos alta = new AdministracionAlumnos();

        alta.getAlumnos().size();

        alta.altaAlumno( "Sarah Wuiz", "50000", "3ro","Kinder");
        alta.altaAlumno( "Sarah Ruiz", "50001", "3ro","Kinder");


        System.out.println( "cuantos alumnos hay " + alta.getAlumnos().size());

        AdministracionAlumnos printed = new AdministracionAlumnos();
        printed.imprimirAlumnos();

    }
}

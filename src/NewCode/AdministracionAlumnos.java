package NewCode;

import java.util.ArrayList;
import java.util.List;

public class AdministracionAlumnos {

    private List<Estudiante> alumnos= new ArrayList<Estudiante>();

    //alta alumno 1

    public boolean altaAlumno(String nombre, int id,  String nivel,String grado){

        Estudiante stud = new Estudiante(nombre,id,nivel,grado);

        if (stud.getId() == 0 ||stud.getNivel() == "nivel" ||  stud.getGrado() == "grado"){

            System.out.println("Alumno no pudo ser dado de alta favor de verificar datos");
            return false;
        }
        for (Estudiante alumno : alumnos) {

            if(alumno.getId() == stud.getId()){
                System.out.println("el Id " +id + " dado ya se encuentra dado de alta " );
                return false;
            }
        }
        alumnos.add(stud);
        System.out.println("Alumno dado de alta exitosamente");
        return true;

    }

    //alta alumno sobrecargada

    public  boolean altaAlumno(String nombre, int id, String grado, String nivel, List<Materia> materias){

       int checkind;
       boolean checkstud =altaAlumno(nombre,id,grado,nivel);
       checkind = getIndexAlumnoFromList(id);


        if( checkstud == true && checkind != -1){
            alumnos.get(checkind).setMaterias(materias);

            return true;
        }else {
            System.out.println("no se agregaron materias al alumno seleccionado");
            return false;

        }
    }

    //calificar materia

    public void calificarMateria(String materia, int id, float calificacion){

        int checkindex;
        checkindex = getIndexAlumnoFromList(id);

        if(checkindex == -1 ) {
            System.out.println("Id no existente, favor de verificar");
        }else{
            for (int i = 0; i < alumnos.get(checkindex).getMaterias().size() ; i++) {
                if(alumnos.get(checkindex).getMaterias().get(i).getNombreMateria() == materia){
                    alumnos.get(checkindex).getMaterias().get(i).setCalificacion(calificacion);
                    System.out.println("Calificacion agregada a la materia " + materia);
                }

            }
        }

    }

    public void promoverDeNivel(int id){

        int checkindex;
        checkindex= getIndexAlumnoFromList(id);

        if(checkindex == -1){
            System.out.println("El id "+id + "No existe, favor de verificar" );
        }else{
            if(alumnos.get(checkindex).getGrado() == "3ro" && alumnos.get(checkindex).getNivel() == "kinder" ){
                alumnos.get(checkindex).setGrado("1ro");
                alumnos.get(checkindex).setNivel("primaria");

            }else if (alumnos.get(checkindex).getGrado() == "3ro" && alumnos.get(checkindex).getNivel() == "secundaria"){
                alumnos.get(checkindex).setGrado("-");
                alumnos.get(checkindex).setNivel("graduado");

            }else if(alumnos.get(checkindex).getGrado() == "6to" && alumnos.get(checkindex).getNivel() =="primaria"){
                alumnos.get(checkindex).setGrado("1ro");
                alumnos.get(checkindex).setNivel("secundaria");

            }else{
                System.out.println("el nivel y el grado dado, no pueden ser promovidos, intentalo con otro alumno");
            }
        }
    }


    public void imprimirAlumnos (){

        System.out.println("Estudiantes en lista: " + alumnos.size());

        for (int i = 0; i < alumnos.size() ; i++) {
            System.out.println("\n***************************");
            System.out.println("Estudiante numero "  + (i+1));

            System.out.println("\nId: " + alumnos.get(i).getId());
            System.out.println("Name: " + alumnos.get(i).getNombre());
            System.out.println("Grado: " + alumnos.get(i).getGrado());
            System.out.println("Nivel: " + alumnos.get(i).getNivel());

        }


    }

    //metodo utilitario

    public int getIndexAlumnoFromList(int id){

        for (int i = 0; i < alumnos.size() ; i++) {
            if(alumnos.get(i).getId() == id){
                return i;
            }

        }
        return -1;
    }


    public static void main(String[] args) {

        //ALTA ALUMNO

        AdministracionAlumnos admin = new AdministracionAlumnos();

        //3 kinder
        admin.altaAlumno("Sarah", 50000, "kinder", "3ro" );
        admin.altaAlumno("Minerva", 50001, "kinder", "1ro");
        admin.altaAlumno("Camille", 50002,"kinder", "2do");
        //3 primaria
        admin.altaAlumno("Nimue", 50003, "primaria", "4to");
        admin.altaAlumno("Rick", 50004, "primaria", "3ro");
        admin.altaAlumno("Esteban", 50005, "primaria", "6to");
        //3 secundaria
        admin.altaAlumno("Diane", 50006, "secundaria", "1ro");
        admin.altaAlumno("Moira", 50007, "secundaria", "2do");
        admin.altaAlumno("suzan", 50008, "secundaria", "3ro");

        // IMPRIMIR ALUMNOS

        admin.imprimirAlumnos();




    }

}

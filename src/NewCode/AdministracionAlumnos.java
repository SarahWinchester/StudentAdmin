package NewCode;

import java.util.ArrayList;
import java.util.List;

public class AdministracionAlumnos {

    private List<Estudiante> alumnos= new ArrayList<Estudiante>();

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
    public  boolean altaAlumno(String nombre, int id, String grado, String nivel, List<Materia> materias){

       int checkind;
       boolean checkstud =altaAlumno(nombre,id,grado,nivel);
       checkind=getIndexAlumnoFromList(id);


        if( checkstud == true && checkind != -1){
            alumnos.get(checkind).setMaterias(materias);

            return true;
        }else {
            System.out.println("no se agregaron materias al alumno seleccionado");
            return false;

        }
    }

    public int getIndexAlumnoFromList(int id){

        for (int i = 0; i < alumnos.size() ; i++) {
            if(alumnos.get(i).getId() == id){
                return i;
            }

        }
        return -1;
    }

}

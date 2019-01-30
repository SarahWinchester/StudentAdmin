package NewCode;

import java.util.ArrayList;
import java.util.List;

public class AdministracionAlumnos {

    private List<Estudiante> alumnos= new ArrayList<>();

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

    public void calificarMateria( int id, String materia,float calificacion){

        int checkindex;
        checkindex = getIndexAlumnoFromList(id);

        if(checkindex == -1 ) {
            System.out.println("Id no existente, favor de verificar");
        }else{
            for (int i = 0; i < alumnos.get(checkindex).getMaterias().size() ; i++) {
                if(alumnos.get(checkindex).getMaterias().get(i).getNombreMateria() == materia){
                    alumnos.get(checkindex).getMaterias().get(i).setCalificacion(calificacion);
                    System.out.println("Calificacion agregada a la materia " + materia);
                }else{
                    System.out.println("no se pudo XD");
                }

            }
        }

    }

    public void promoverDeNivel(int id){

        System.out.println("\n******PROMOVER NIVEL*******");

        int checkindex;
        checkindex= getIndexAlumnoFromList(id);

        if(checkindex == -1){
            System.out.println("\nEl id "+id + " No existe, favor de verificar" );
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
                System.out.println("\nEl nivel y el grado dado, no pueden ser promovidos, intentalo con otro alumno");
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

    public void reporteAlumnoPorGrupo( String grado, String nivel){

        System.out.println("\n ****************** REPORTE *******************+");

        for (int i = 0; i < alumnos.size() ; i++) {
            if (alumnos.get(i).getGrado() == grado && alumnos.get(i).getNivel() == nivel) {

                System.out.println("\nLos alumnos del grado " + grado + " y del nivel " + nivel + " son:");

                System.out.println("\nName: " + alumnos.get(i).getNombre());
                System.out.println("\nID: " + alumnos.get(i).getId());
                System.out.println("\nGrado: " + alumnos.get(i).getGrado());
                System.out.println("\nNivel: " + alumnos.get(i).getNivel());
                    for (int j = 0; j < alumnos.get(i).getMaterias().size() ; j++) {

                        System.out.println("\nMaterias: " + alumnos.get(i).getMaterias().get(j).getNombreMateria());
                        System.out.println("Calificaciones: " + alumnos.get(i).getMaterias().get(j).getCalificacion());
                    }
            }
        }

    }

    public void reporteAlumnoXId(int id){

        int checkindx;
        checkindx = getIndexAlumnoFromList(id);

        if(checkindx == -1){
            System.out.println("No existe el id , favor de intentarlo de nuevo");
        }else{
            System.out.println("\n*******************");
            System.out.println("\nNombre: "+ alumnos.get(checkindx).getNombre() );
            System.out.println("Id: " + alumnos.get(checkindx).getId());
            System.out.println("Grado: " + alumnos.get(checkindx).getGrado());
            System.out.println("Nivel: " + alumnos.get(checkindx).getNivel());
            for (int i = 0; i <alumnos.get(checkindx).getMaterias().size() ; i++) {
                System.out.println("--");
                System.out.println("Materias: " + alumnos.get(checkindx).getMaterias().get(i).getNombreMateria());

                System.out.println("Calificacion: " + alumnos.get(checkindx).getMaterias().get(i).getCalificacion());

            }
        }

    }

    //METODOS UTILITARIOS

    public int getIndexAlumnoFromList(int id){

        for (int i = 0; i < alumnos.size() ; i++) {
            if(alumnos.get(i).getId() == id){
                return i;
            }

        }
        return -1;
    }

    public void  fillMaterias( int id, List <Materia> materias){

        int checkindex;
        checkindex= getIndexAlumnoFromList(id);

        alumnos.get(checkindex).setMaterias(materias);

    }

    public void  fillMaterias( List <Materia> materias){
        for (int i = 0; i < alumnos.size() ; i++) {
            alumnos.get(i).setMaterias(materias);
        }

    }




    public static void main(String[] args) {

        //ALTA ALUMNO

        AdministracionAlumnos admin = new AdministracionAlumnos();

        // LISTAS DE MATERIAS

        List <Materia> list1= new ArrayList<>();
        List <Materia> list2= new ArrayList<>();
        List <Materia> list3= new ArrayList<>();

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

        //alta alumno sobrecarga

        admin.altaAlumno("Prueba", 50030, "primaria", "3ro", list3);

        //CREANDO MATERIAS y agregandolas a la lista correspondiente
        Materia matematicas = new Materia();
        matematicas.setNombreMateria("Matematicas");

        list1.add(matematicas);
        list3.add(matematicas);

        Materia español = new Materia();
        español.setNombreMateria("Español");

        list1.add(español);
        list2.add(español);

        Materia civismo = new Materia();
        civismo.setNombreMateria("Civismo");

        list1.add(civismo);
        list3.add(civismo);


        Materia english = new Materia();
        english.setNombreMateria("Ingles");

        list2.add(english);
        list3.add(english);

        Materia arte = new Materia();
        arte.setNombreMateria("Arte");

        list2.add(arte);

        Materia programacion = new Materia();
        programacion.setNombreMateria("Programacion");

        list3.add(programacion);

        //*******************LLAMANDO METODOS***********

        // IMPRIMIR ALUMNOS

        // admin.imprimirAlumnos();

        // AGREGANDO MATERIAS A TODOS LOS ESTUDIANTES

        // admin.fillMaterias(list2);

        // AGREGANDO MATERIAS A 1 ESTUDIANTE EN ESPECIFICO

        // admin.fillMaterias(50000,list2);

        // IMPRIMIENDO ALUMNOS DE GRADO Y NIVEL

        //admin.reporteAlumnoPorGrupo("3ro", "primaria");
        //admin.reporteAlumnoPorGrupo("1ro", "kinder");



        //CALIFICAR MATERIA
        //admin.calificarMateria(50030, "Programacion", 9.5f);

        //PROMOVER ALUMNO EN ESPECIFICO

        //admin.promoverDeNivel(60006);

        //IMPRIMIENDO DATOS DE ALUMNO EN ESPECIFICO
        //admin.reporteAlumnoXId(50030);
        //admin.reporteAlumnoXId(50006);





    }

}

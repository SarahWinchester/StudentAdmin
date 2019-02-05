package NewCode;

import java.util.ArrayList;
import java.util.List;

public class AdministracionEmpleados {

  private List<Empleado> empleados= new ArrayList<Empleado>();

  private boolean altaEmpleado(String nombre, int id, String puesto, String grupo){

      Empleado employ = new Empleado(nombre, id, puesto, grupo);

      if( employ.getId() == 0 || employ.getGrupo() == "grupo" || employ.getPuesto() == "puesto" ){
          System.out.println("El empledado no pudo ser dado de alta, favor de verificar los datos");
          return false;
      }
      for(Empleado empl : empleados){
          if(empl.getId() == employ.getId()){
              System.out.println("el Id " + id + " Ya se encuentra dado de alta ");
              return false;
          }
      }
      empleados.add(employ);
      System.out.println("Empleado dado de alta exitosamente");
      return true;
  }

  private void asignarPuesto ( int id, String puesto){

     int checkEmpId;
     checkEmpId= getIndexEmpleadoFromList(id);

     if( checkEmpId == -1){
         System.out.println("\nEl ID buscado no se encuentra disponible");
     }else{
         boolean isThereADirectorAlreadyflag = false;
         if(puesto.toLowerCase() == "director"){
             for (int i = 0; i <empleados.size() ; i++){
                 if(empleados.get(i).getPuesto().toLowerCase() == "director"){
                     System.out.println("\n****************************");
                     System.out.println("\nEl puesto se encuentra ocupado");
                     isThereADirectorAlreadyflag = true;
                     break;
                 }
             }
         }
         if(puesto.toLowerCase() != "director" || (isThereADirectorAlreadyflag == false && puesto.toLowerCase() == "director")){
             empleados.get(checkEmpId).setPuesto(puesto);
             System.out.println("\n*************************");
             System.out.println("\nNombre: " + empleados.get(checkEmpId).getNombre());
             System.out.println("ID: " + empleados.get(checkEmpId).getId());
             System.out.println("Puesto: " + empleados.get(checkEmpId).getPuesto());
             System.out.println("Grupo: " + empleados.get(checkEmpId).getGrupo());
         }
     }
  }


  private void asignarGrupo(int id, String grupo){
      int checkEmpId;
      checkEmpId = getIndexEmpleadoFromList(id);

      if(checkEmpId == -1){
          System.out.println("\nEl id del empleado dado no existe, favor de verificar ");
      }else if( empleados.get(checkEmpId).getPuesto().equalsIgnoreCase("maestro")){
          empleados.get(checkEmpId).setGrupo(grupo);
          System.out.println("\n*************************");
          System.out.println("\n Nombre: " + empleados.get(checkEmpId).getNombre());
          System.out.println("ID: " + empleados.get(checkEmpId).getId());
          System.out.println("Puesto: " + empleados.get(checkEmpId).getPuesto());
          System.out.println("Grupo: " + empleados.get(checkEmpId).getGrupo());
      }else{
          System.out.println("\n****************************");
          System.out.println("\nEl empleado no pudo reasignarse");
      }
  }

  private void desasignarGrupo(int id){
      int checkEmpId;
      checkEmpId = getIndexEmpleadoFromList(id);

     if( checkEmpId == -1){
         System.out.println("\nEl empleado no  existe ");

     }else if(empleados.get(checkEmpId).getPuesto().equalsIgnoreCase("maestro")){
         empleados.get(checkEmpId).setGrupo("grupo");
         System.out.println("\n*************************");
         System.out.println("\nNombre: " + empleados.get(checkEmpId).getNombre());
         System.out.println("ID: " + empleados.get(checkEmpId).getId());
         System.out.println("Puesto: " + empleados.get(checkEmpId).getPuesto());
         System.out.println("Grupo: " + empleados.get(checkEmpId).getGrupo());
     }else{
         System.out.println("\n***********************************");
         System.out.println("\nEl empleado debe ser maestro para desasignar");
     }
  }


  private void bajaEmpleado(int id){
      int checkEmpId;
      checkEmpId = getIndexEmpleadoFromList(id);

      if( checkEmpId == -1) {
          System.out.println("El id no corresponde a ningun empleado, favor de verificar");
      }else if ( (empleados.get(checkEmpId).getPuesto().equalsIgnoreCase("maestro")&& empleados.get(checkEmpId).getGrupo()== "grupo")
              || empleados.get(checkEmpId).getPuesto() == "administrador" || empleados.get(checkEmpId).getPuesto() =="director"){

          System.out.println("\nEmpleados antes de la baja " + empleados.size());
            empleados.remove(checkEmpId);
          System.out.println("\nEmpleados despues de la baja " +empleados.size());
          System.out.println("\nEmpleado removido");
      }else{
          System.out.println("No se puede remover al empleado si tiene un grupo");
      }

  }

  public void imprimirReporteEmpleados(){
      System.out.println("Empleados en la lista : " + empleados.size());

      for (int i = 0; i < empleados.size() ; i++) {
          System.out.println("\n***************************\n");
          System.out.println("Empleado numero : " + (i+1));
          System.out.println("\nNombre: "  + empleados.get(i).getNombre());
          System.out.println("ID: " + empleados.get(i).getId());
          System.out.println("Puesto: " + empleados.get(i).getPuesto());
          System.out.println("Grupo: " + empleados.get(i).getGrupo());
      }
  }

  public void reporteEmpleadosPuesto(String puesto){

      for (int i = 0; i < empleados.size() ; i++) {
          if(empleados.get(i).getPuesto().equalsIgnoreCase(puesto)){
              System.out.println("\n*************************");
              System.out.println("\n Nombre: " + empleados.get(i).getNombre());
              System.out.println("ID: " + empleados.get(i).getId());
              System.out.println("Puesto: " + empleados.get(i).getPuesto());
              System.out.println("Grupo: " + empleados.get(i).getGrupo());

          }
      }
  }

  public void reporteMaestrosNivel(String grupo){

      for (int i = 0; i < empleados.size() ; i++) {

          if(empleados.get(i).getPuesto().equalsIgnoreCase("maestro") && empleados.get(i).getGrupo().equalsIgnoreCase(grupo)){

              System.out.println("\n*************************");
              System.out.println("\nNombre: " + empleados.get(i).getNombre());
              System.out.println("ID: " + empleados.get(i).getId());
              System.out.println("Puesto: " + empleados.get(i).getPuesto());
              System.out.println("Grupo: " + empleados.get(i).getGrupo());
          }
      }
  }



  public int getIndexEmpleadoFromList(int id){

      for (int i = 0; i < empleados.size() ; i++) {
          if(empleados.get(i).getId()  == id){
              return i;
          }

      }
      return -1;

  }

    public static void main(String[] args) {

        AdministracionEmpleados  schoolPersonal = new AdministracionEmpleados();

        // ALTA PERSONAL

        schoolPersonal.altaEmpleado("Mariana", 10001, "Maestro", "1roKinder");
        schoolPersonal.altaEmpleado("Claudia", 10003, "Maestro", "3roKinder");

        schoolPersonal.altaEmpleado("Jhonathan", 10002, "Maestro", "1roPrimaria");
        schoolPersonal.altaEmpleado("Mark", 10004, "Administrativo", "2doPrimaria");
        schoolPersonal.altaEmpleado("Jose", 10005, "Maestro", "5toPrimaria");
        schoolPersonal.altaEmpleado("Chika", 10006, "Maestro", "6toPrimaria");

        schoolPersonal.altaEmpleado("Ada", 10007, "Maestro", "1roSecundaria");
        schoolPersonal.altaEmpleado("Cassandra", 10008, "Maestro", "2doSecundaria");
        schoolPersonal.altaEmpleado("Mariana", 10009, "maestro", "3roSecundaria");

        schoolPersonal.altaEmpleado("Luxanna", 10000, "director", "-");
        //schoolPersonal.altaEmpleado("Luxanna", 10000, "Administrativo", "-");


        schoolPersonal.altaEmpleado("Mariana", 10010, "Administrativo", "-");
        // IMP

        //schoolPersonal.imprimirReporteEmpleados();

        //ASIGNAR PUESTO

       // schoolPersonal.asignarPuesto(10009, "director" );
        //schoolPersonal.asignarPuesto(10007, "Administrativo" );

        //ASIGNAR GRUPO

        //schoolPersonal.asignarGrupo(10001, "2doKinder");
        //schoolPersonal.asignarGrupo(10005, "6toPrimaria");

        // DESASIGNAR GRUPO
        //schoolPersonal.desasignarGrupo(10001);

        //BAJA EMPLEADO
        //schoolPersonal.desasignarGrupo(10008);
        //schoolPersonal.bajaEmpleado(10000);
        //schoolPersonal.bajaEmpleado(10008);


        //IMPRIMIR EMPLEADOS

        //schoolPersonal.imprimirReporteEmpleados();

        //IMPRIMIR POR PUESTO

        //schoolPersonal.reporteEmpleadosPuesto("maestro");

        // IMPRIMIR MAESTROS POR GRUPO

        //schoolPersonal.reporteMaestrosNivel("3roSecundaria");






    }






}

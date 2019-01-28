package NewCode;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private String id = "0";
    private String grado;
    private List materias = new ArrayList();
    private String nivel = "nivel";

    public Estudiante() {

    }

    public Estudiante(String nombre, String id, String grado, String nivel) {
        setNombre(nombre);
        setId(id);
        setGrado(grado);
        setNivel(nivel);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;

        if (!(getId() == null || getId().isEmpty()) && ("5".equalsIgnoreCase(getId().substring(0, 1)) && (getId().length() == 5))) {



        }else{
            setId("0");
            System.out.println("escribe correctamente el Id, debe empezar con 5 y tener 5 digitos ");
        }
    }


    public String getGrado() {

        return  grado;
    }



    public void setGrado(String grado) {
        this.grado = grado;
        switch (getNivel().toUpperCase()){

            case "KINDER":
                if(getNivel() == "1ro" || getGrado()== "2do" || getGrado() == "3ro" ){

                }else{
                    System.out.println("Selecciona un grado valido para kinder ");
                }
                break;

            case "PRIMARIA" :
                if(getGrado()=="1ro" ||getGrado() == "2do" || getGrado() == "3ro" || getGrado() == "4to" || getGrado() =="5to" || getGrado() == "6to"){
                }else{
                    System.out.println("Selecciona un grado valido para primaria ");
                }
                break;

            case "SECUNDARIA":
                if(getGrado() == "1ro"|| getGrado() == "2do" || getGrado() == "3ro"){
                }else{
                    System.out.println("selecciona un grado valido de secundaria ");
                }
                break;
            case "GRADUADO":
                if(getGrado() == "3ro" && getNivel() == " secundaria"){

                }else{
                    System.out.println("Selecciona un grado valido para poder  promover a graduado");
                }
                break;


        }


    }



    public List getMaterias() {
        return materias;
    }



    public void setMaterias(List materias) {
        this.materias = materias;
    }



    public String getNivel() {

        return nivel;

    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
            if(getNivel() == null || getNivel().isEmpty()){
                switch ( getNivel().toUpperCase()){
                    case "KINDER":
                    case "PRIMARIA":
                    case "SECUNDARIA":
                    case "GRADUADO":
                    default:
                        setNivel("nivel");
                        break;
                }
            }
    }

}

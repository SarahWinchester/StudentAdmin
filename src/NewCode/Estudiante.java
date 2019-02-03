package NewCode;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private int id ;
    private String grado;
    private List <Materia> materias= new ArrayList<>();
    private String nivel;

    public Estudiante(String nombre, int id, String nivel,  String grado) {
        setNombre(nombre);
        setId(id);
        setNivel(nivel);
        setGrado(grado);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 50000 && id <= 59999){
            this.id = id;
        }else {
            this.id = 0;
        }
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {

        switch (nivel.toLowerCase()){
            case "kinder":

            case "primaria":

            case "secundaria":

            case "graduado":
                this.nivel=nivel.toLowerCase();
                break;

            default:
                this.nivel = "nivel";
                break;

        }

    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        switch (grado.toLowerCase()){
            case "1ro":
                if(getNivel()== "kinder" || getNivel() == "primaria" || getNivel() == "secundaria"){
                    this.grado = grado.toLowerCase();
                }else{
                    this.grado = "grado";
                }
                break;
            case "2do":
                if(getNivel()== "kinder" || getNivel() == "primaria" || getNivel() == "secundaria"){
                    this.grado = grado.toLowerCase();
                }else{
                    this.grado = "grado";
                }
                break;
            case "3ro":
                if(getNivel()== "kinder" || getNivel() == "primaria" || getNivel() == "secundaria"){
                    this.grado = grado.toLowerCase();
                }else{
                    this.grado = "grado";
                }
                break;
            case "4to":
                if(getNivel() == "primaria" ){
                    this.grado = grado.toLowerCase();
                }else{
                    this.grado = "grado";
                }
                break;
            case "5to":
                if(getNivel() == "primaria" ){
                    this.grado = grado.toLowerCase();
                }else{
                    this.grado = "grado";
                }
                break;
            case "6to":
                if(getNivel() == "primaria"){
                    this.grado = grado.toLowerCase();
                }else{
                    this.grado = "grado";
                }
                break;
            default:
                this.grado= "grado";
                break;
        }
    }

    public List <Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List <Materia> materias) {
        this.materias = materias;
    }

}

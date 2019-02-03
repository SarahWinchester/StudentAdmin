package NewCode;

public class Empleado {
    private String nombre;
    private int id;
    private String puesto = "puesto";
    private String grupo = "grupo";


    public Empleado(String nombre, int id, String puesto, String grupo) {
       setNombre(nombre);
       setId(id);
       setPuesto(puesto);
       setGrupo(grupo);
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
        if (id >= 10000 && id <= 19999){
            this.id = id;
        }else {
            this.id = 0;
        }

    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {

        switch (puesto.toLowerCase()){
            case "maestro":

            case "director":

            case "administrativo":
                this.puesto = puesto.toLowerCase();
                break;
            default:
                this.puesto = "puesto";
                break;

        }
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {

        switch ( grupo.toLowerCase()){
            case "1rokinder":
                this.grupo = grupo.toLowerCase();
                break;
            case "2dokinder":
                this.grupo = grupo.toLowerCase();
                break;
            case "3rokinder":
                this.grupo = grupo.toLowerCase();
                break;
            case "1rosecundaria":
                this.grupo = grupo.toLowerCase();
                break;
            case "2dosecundaria":
                this.grupo = grupo.toLowerCase();
                break;
            case "3rosecundaria":
                this.grupo = grupo.toLowerCase();
                break;
            case "1roprimaria":
                this.grupo = grupo.toLowerCase();
                break;
            case "2doprimaria":
                this.grupo = grupo.toLowerCase();
                break;
            case "3roprimaria":
                this.grupo = grupo.toLowerCase();
                break;
            case "4toprimaria":
                this.grupo = grupo.toLowerCase();
                break;
            case "5toprimaria":
                this.grupo = grupo.toLowerCase();
                break;
            case "6toprimaria":
                this.grupo = grupo.toLowerCase();
                break;
            case "-":
                this.grupo = grupo;
                break;

            default:
                this.grupo = "grupo";

        }


    }
}
